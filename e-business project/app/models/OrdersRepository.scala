package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import java.sql.Date

import scala.concurrent.{ExecutionContext, Future}



@Singleton
class OrdersRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, val basketIdsRepository: BasketaRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._


  class OrdersTable(tag: Tag) extends Table[Orders](tag, "orders") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def basket = column[Long]("basket")

    def date = column[Date]("date")

    def address = column[String]("address")

    def customer_name = column[String]("customer_name")

    def customer_surname = column[String]("customer_surname")

    def basket_foreign_key = foreignKey("basket_foreign_key", basket, basket_id)(_.id)

    def * = (id, basket, date, address, customer_name, customer_surname) <> ((Orders.apply _).tupled, Orders.unapply)
  }

  import basketIdsRepository.BasketaTable

  private val basket_id = TableQuery[BasketaTable]


  private val orders = TableQuery[OrdersTable]

  def create(basket: Long, date: Date, address: String, customer_name: String, customer_surname: String): Future[Orders] = db.run {
    (orders.map(c => (c.basket, c.date, c.address, c.customer_name, c.customer_surname))
      returning orders.map(_.id)
      into { case ((basket, date, address, customer_name, customer_surname), id) => Orders(id, basket, date, address,customer_name, customer_surname) }
      ) += (basket, date, address, customer_name, customer_surname)
  }

  def list(): Future[Seq[Orders]] = db.run {
    orders.result
  }
}