package models



import play.api.libs.json._

case class BasketContent(basket: Long, product: Long, amount: Int)

object BasketContent {
  implicit val basketProductFormat = Json.format[BasketContent]
}
