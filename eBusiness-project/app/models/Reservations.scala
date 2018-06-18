package models

import play.api.libs.json._

case class Reservations(id: Int, address: String, dateSend: String, sent: Boolean, products: Int, user: Int)

object Reservations {
  implicit val reservationsFormat: OFormat[Reservations] = Json.format[Reservations]
}