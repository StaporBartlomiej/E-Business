package controllers

import javax.inject._

import models._
import models3.OpinionsRepository
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class OpinionsController @Inject()(opinionsRepository: OpinionsRepository, productsRepo: ProductRepository,
                                   cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val opinionsForm: Form[CreateOpinionsForm] = Form {
    mapping(
      "product" -> longNumber,
      "opinion" -> nonEmptyText
    )(CreateOpinionsForm.apply)(CreateOpinionsForm.unapply)
  }

  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map(prod => Ok(views.html.opinions(opinionsForm, prod)))
  }

  def addOpinion = Action.async { implicit request =>
    var a: Seq[Product] = Seq[Product]()
    val products = productsRepo.list().onComplete {
      case Success(prod) => a = prod
      case Failure(_) => print("fail")
    }

    opinionsForm.bindFromRequest.fold(
      formWithErrors => {
        Future.successful(
          Ok(views.html.opinions(formWithErrors, a))
        )
      },
      opinions => {
        opinionsRepository.create(opinions.product, opinions.opinion).map { _ =>
          Redirect(routes.OpinionsController.getOpinions()).flashing("success" -> "Opinion saved!")
        }
      }
    )

  }

  def getOpinions = Action.async { implicit request =>
    opinionsRepository.list().map { opinion =>
      Ok(Json.toJson(opinion))
    }
  }
}


case class CreateOpinionsForm(product: Long, opinion: String)