package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.ProvenShape

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ReservationsRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class ReservationsTable(tag: Tag) extends Table[Reservations](tag, "reservations") {

    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)

    def address = column[String]("address")

    def dataSend = column[String]("dataSend")

    def sent = column[Boolean]("sent")

    def products = column[Int]("products")

    def user = column[Int]("user")

    def * : ProvenShape[Reservations] = (id, address, dataSend, sent, products, user) <> ((Reservations.apply _).tupled, Reservations.unapply)

  }

  val reservations = TableQuery[ReservationsTable]

  def create(address: String, dataSend: String, sent: Boolean, products: Int, user: Int): Future[Reservations] = db.run {
    (reservations.map(o => (o.address, o.dataSend, o.sent, o.products, o.user))
      returning reservations.map(_.id)
      into { case ((`address`, `dataSend`, `sent`, `products`, `user`), id) => Reservations(id, address, dataSend, sent, products, user) }
      ) += (address, dataSend, sent, products, user)
  }

  def list(): Future[Seq[Reservations]] = db.run {
    reservations.result
  }
}
