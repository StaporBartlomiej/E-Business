package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.ExecutionContext

class BasketProductController @Inject()(basketProductRepository: BasketContentRepository,
                                        cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val basketProductForm: Form[CreateBasketProductForm] = Form {
    mapping(
      "basket" -> longNumber,
      "product" -> longNumber,
      "quantity" -> number
    )(CreateBasketProductForm.apply)(CreateBasketProductForm.unapply)
  }

  def index = Action { implicit request =>
    Ok(views.html.basketproduct(basketProductForm))
  }


  def addBasketProduct = Action { implicit request =>
    basketProductForm.bindFromRequest.fold(
      errorForm => {
        BadRequest(views.html.basketproduct(errorForm))
      },
      basketProduct => {
        val id = basketProductRepository.create(basketProduct.basket, basketProduct.product, basketProduct.amount)
        Redirect(routes.BasketProductController.getBasketProducts()).flashing("success" -> "Basket product saved!")
      }
    )

  }

  def getBasketProducts = Action.async { implicit request =>
    basketProductRepository.list().map { basketIds =>
      Ok(Json.toJson(basketIds))
    }
  }
}

case class CreateBasketProductForm(basket: Long, product: Long, amount: Int)
