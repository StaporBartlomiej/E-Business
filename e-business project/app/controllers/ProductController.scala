package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class ProductController @Inject()(productsRepo: ProductRepository, categoryRepo: CategoryRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val productForm: Form[CreateProductForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "category" -> number,
    )(CreateProductForm.apply)(CreateProductForm.unapply)
  }

  def index = Action.async { implicit request =>
    val categories = categoryRepo.list()
    categories.map(cat => Ok(views.html.index(productForm, cat)))

  }

  def addProduct = Action.async { implicit request =>
    var a: Seq[Category] = Seq[Category]()
    val categories = categoryRepo.list().onComplete {
      case Success(cat) => a = cat
      case Failure(_) => print("fail")
    }

    productForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          Ok(views.html.index(errorForm, a))
        )
      },
      product => {
        productsRepo.create(product.name, product.description, product.category).map { _ =>
          Redirect(routes.ProductController.index).flashing("success" -> "product.created")
        }
      }
    )
  }

  def getProducts = Action.async { implicit request =>
    productsRepo.list().map { products =>
      Ok(Json.toJson(products))
    }
  }
}

case class CreateProductForm(name: String, description: String, category: Int)
