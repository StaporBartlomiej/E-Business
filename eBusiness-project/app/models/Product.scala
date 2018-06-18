package models

import play.api.libs.json._

case class Product(id: Long, name: String, description: String, category: String, imgUrl: String, price: String)

object Product {
  implicit val productFormat: OFormat[Product] = Json.format[Product]
}
