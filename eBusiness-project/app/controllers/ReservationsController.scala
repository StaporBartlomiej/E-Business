package controllers

import javax.inject._
import models._
import play.api.libs.json.Json.toJson
import play.api.libs.json._
import play.api.mvc._

import scala.collection.mutable.ListBuffer
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
import scala.collection.mutable.ArrayBuffer


class ReservationsController @Inject()(reservationsRepository: ReservationsRepository, productsRepository: ProductRepository, categoryRepository: CategoryRepository,
                                       cc: MessagesControllerComponents
                                )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  import play.api.libs.json.Json

  def addReservations(): Action[JsValue] = Action.async(parse.json) { implicit request =>

    val reservationsFromJson: JsResult[Reservations] = Json.fromJson[Reservations](request.body)

    reservationsFromJson match {
      case JsSuccess(r: Reservations, path: JsPath) =>
        reservationsRepository.create(r.address, r.dateSend, r.sent, r.products, r.user).map {
          _ =>
            Ok(Json.obj(
              "status" -> "OK",
              "address" -> r.address,
              "dataSend" -> r.dateSend,
              "sent" -> r.sent,
              "product" -> r.products,
              "user" -> r.user
            ))
        }
      case e: JsError => Future.successful(Ok("Errors: " + JsError.toJson(e).toString()))
    }

  }

  def getReservations: Action[AnyContent] = Action.async { implicit request =>
    reservationsRepository.list().map { reservations =>
      Ok(toJson(reservations))
    }
  }

  def getReservationsByUser(id: Int): Action[JsValue] = Action.async(parse.json) { implicit request =>

    var reservationsPerUser = new ArrayBuffer[Reservations]()

    reservationsRepository.list().map { reservations =>
      reservations.foreach(reservation => {
        if (reservation.user == id) {
          reservationsPerUser += reservation
        }
      })
    }

    Future.successful(Ok(toJson(reservationsPerUser)))
  }
}
