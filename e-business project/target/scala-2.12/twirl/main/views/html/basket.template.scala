
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateBasketaForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basket: Form[CreateBasketaForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.BasketaController.addBasketId())/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""
		"""),_display_(/*11.4*/inputText(basket("user"))),format.raw/*11.29*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add basket id"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(basket:Form[CreateBasketaForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basket)(request)

  def f:((Form[CreateBasketaForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basket) => (request) => apply(basket)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 22:19:25 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/basket.scala.html
                  HASH: a746a55005a5b8bcf15a39ad9edef78c2a386fca
                  MATRIX: 769->1|916->78|960->76|987->94|1014->96|1028->103|1061->128|1107->137|1137->142|1152->149|1186->163|1217->165|1245->168|1279->194|1318->196|1348->200|1401->244|1441->246|1471->250|1517->275|1548->280|1560->284|1591->294|1622->298|1733->379|1765->381
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18|43->19
                  -- GENERATED --
              */
          