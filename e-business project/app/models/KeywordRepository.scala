package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class KeywordRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class KeywordTable(tag: Tag) extends Table[Keyword](tag, "keyword") {

    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    def value = column[String]("value")

    def * = (id, value) <> ((Keyword.apply _).tupled, Keyword.unapply)
  }

  val keyword = TableQuery[KeywordTable]


  def create(value: String): Future[Keyword] = db.run {
    (keyword.map(c => c.value)
      returning keyword.map(_.id)
      into ((value, keyword_id) => Keyword(keyword_id, value))
      ) += value
  }

  def list(): Future[Seq[Keyword]] = db.run {
    keyword.result
  }
}

