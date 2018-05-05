package models

import java.sql.Date

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class PaymentRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, basketIdsRepository: BasketaRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  import basketIdsRepository.BasketaTable

  private val basket_id = TableQuery[BasketaTable]

  private class PaymentTable(tag: Tag) extends Table[Payment](tag, "payment") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def basket = column[Long]("basket")

    def value = column[Float]("value")

    def date = column[Date]("date")


    def basket_foreign_key = foreignKey("basket_foreign_key", basket, basket_id)(_.id)

    def * = (id, basket, value, date) <> ((Payment.apply _).tupled, Payment.unapply)
  }

  private val payment = TableQuery[PaymentTable]

  def create(basket: Long, value: Float, date: Date): Future[Payment] = db.run {
    (payment.map(c => (c.basket, c.value, c.date))
      returning payment.map(_.id)
      into { case ((basket, value, date), payment_id) => Payment(payment_id, basket, value, date)}
      ) += (basket, value, date)
  }

  def list(): Future[Seq[Payment]] = db.run {
    payment.result
  }
}