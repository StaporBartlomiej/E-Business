package models


import play.api.libs.json._

case class Basket(basket_id: Long, user: Long)

object Basket {
  implicit val basketIdsFormat = Json.format[Basket]
}
