package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class BasketaController @Inject()(basketaRepository: BasketaRepository,
                                  cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val basketaForm: Form[CreateBasketaForm] = Form {
    mapping(
      "customer" -> longNumber
    )(CreateBasketaForm.apply)(CreateBasketaForm.unapply)
  }

  def index = Action { implicit request =>
    Ok(views.html.basket(basketaForm))
  }


  def addBasketId = Action { implicit request =>
    basketaForm.bindFromRequest.fold(
      errorForm => {
        BadRequest(views.html.basket(errorForm))
      },
      basket => {
        val basketID = basketaRepository.create(basket.customer)
        Redirect(routes.BasketaController.getBasketa()).flashing("success" -> "Basket saved!")
      }
    )

  }

  def getBasketa = Action.async { implicit request =>
    basketaRepository.list().map { basketa =>
      Ok(Json.toJson(basketa))
    }
  }
}

case class CreateBasketaForm(customer: Long)
