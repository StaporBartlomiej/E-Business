package models3

import javax.inject.{Inject, Singleton}

import models.{Opinions, ProductRepository}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class OpinionsRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  import productRepository.ProductTable

  private val product_id = TableQuery[ProductTable]

  private class OpinionsTable(tag: Tag) extends Table[Opinions](tag, "opinions") {

    def product = column[Long]("product", O.PrimaryKey)

    def opinion = column[String]("opinion")

    def product_foreign_key = foreignKey("product_foreign_key", product, product_id)(_.id)

    def * = (product, opinion) <> ((Opinions.apply _).tupled, Opinions.unapply)
  }

  private val opinion = TableQuery[OpinionsTable]

  def create(product: Long, opinionxd: String): Future[Int] =
    db.run(opinion += Opinions(product, opinionxd))


  def list(): Future[Seq[Opinions]] = db.run {
    opinion.result
  }
}
