package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class BasketContentRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, basketIdsRepository: BasketaRepository, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._

  import basketIdsRepository.BasketaTable

  private val basket_id = TableQuery[BasketaTable]

  import productRepository.ProductTable

  private val product_id = TableQuery[ProductTable]

  private class BasketContentTable(tag: Tag) extends Table[BasketContent](tag, "basket_content") {

    def id = column[Long]("id", O.PrimaryKey)
    def product = column[Long]("product")
    def quantity = column[Int]("quantity")
    def basket_foreign_key = foreignKey("basket_foreign_key", id, basket_id)(_.id)
    def product_foreign_key = foreignKey("product_foreign_key", product, product_id)(_.id)
    def * = (id, product, quantity) <> ((BasketContent.apply _).tupled, BasketContent.unapply)
  }

  private val basketProduct = TableQuery[BasketContentTable]


  def create(basket: Long, product: Long, amount: Int): Future[Int] =
    db.run(basketProduct += BasketContent(basket, product, amount))

  def list(): Future[Seq[BasketContent]] = db.run {
    basketProduct.result
  }
}
