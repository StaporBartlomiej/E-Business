package models


import java.sql.Date

import play.api.libs.json._

case class Orders(id: Long, basket: Long, date: Date, address: String, customer_name: String, customer_surname: String )

object Orders {
  implicit val ordersFormat = Json.format[Orders]
}

