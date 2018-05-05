package models

import javax.inject.{ Inject, Singleton }
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import scala.concurrent.{ Future, ExecutionContext }

@Singleton
class BasketaRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]
  import dbConfig._
  import profile.api._


  class BasketaTable(tag: Tag) extends Table[Basket](tag, "basket") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def customer = column[Long]("customer")
    def * = (id, customer) <> ((Basket.apply _).tupled, Basket.unapply)
  }

  val basket = TableQuery[BasketaTable]


  def create(user: Long): Future[Basket] = db.run {
    (basket.map(p => (p.customer))
      returning basket.map(_.id)
      into ((user, basket_id) => Basket(basket_id, user))
      ) += (user)
  }

  def list(): Future[Seq[Basket]] = db.run {
    basket.result
  }
}
