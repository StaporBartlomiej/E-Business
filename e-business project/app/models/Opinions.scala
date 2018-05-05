package models


import play.api.libs.json._

case class Opinions(product: Long, opinion: String)

object Opinions {
  implicit val opinionFormat = Json.format[Opinions]
}

