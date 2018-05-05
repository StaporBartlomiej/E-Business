package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._
import java.sql.Date

import scala.concurrent.ExecutionContext

class OrdersController @Inject()(orderRepository: OrdersRepository,
                                 cc: MessagesControllerComponents
                                   )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val ordersForm: Form[CreateOrderForm] = Form {
    mapping(
      "basket" -> longNumber,
      "date" -> sqlDate,
      "address" -> nonEmptyText,
      "customer_name" -> nonEmptyText,
      "customer_surname" -> nonEmptyText
    )(CreateOrderForm.apply)(CreateOrderForm.unapply)
  }

  def index = Action { implicit request =>
    Ok(views.html.orders(ordersForm))
  }

  def addOrder = Action { implicit request =>
    ordersForm.bindFromRequest.fold(
      errorForm => {
        BadRequest(views.html.orders(errorForm))
      },
      orders => {
        val ordersId = orderRepository.create(orders.basket, orders.date, orders.address, orders.customer_name, orders.customer_surname)
        Redirect(routes.OrdersController.getOrders()).flashing("success" -> "Order created!")
      }
    )

  }

  def getOrders = Action.async { implicit request =>
    orderRepository.list().map { basket =>
      Ok(Json.toJson(basket))
    }
  }
}


case class CreateOrderForm(basket: Long, date: Date, address: String, customer_name: String, customer_surname: String)