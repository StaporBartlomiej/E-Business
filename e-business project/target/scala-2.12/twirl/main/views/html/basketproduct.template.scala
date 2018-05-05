
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

object basketproduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateBasketProductForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(basketProduct: Form[CreateBasketProductForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.BasketProductController.addBasketProduct())/*10.59*/ {_display_(Seq[Any](format.raw/*10.61*/("""
		"""),_display_(/*11.4*/inputText(basketProduct("basket"))),format.raw/*11.38*/("""
	  	"""),_display_(/*12.6*/inputText(basketProduct("product"))),format.raw/*12.41*/("""
	  	"""),_display_(/*13.6*/inputText(basketProduct("amount"))),format.raw/*13.40*/("""

		"""),_display_(/*15.4*/CSRF/*15.8*/.formField),format.raw/*15.18*/("""

		"""),format.raw/*17.3*/("""<div class="buttons">
			<input type="submit" value="Add basket product"/>
		</div>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(basketProduct:Form[CreateBasketProductForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(basketProduct)(request)

  def f:((Form[CreateBasketProductForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (basketProduct) => (request) => apply(basketProduct)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:28:50 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/basketproduct.scala.html
                  HASH: 6ae12ca0a66979994c0eaa8e11363b0db0cf3bdc
                  MATRIX: 782->1|942->91|986->89|1013->107|1040->109|1054->116|1087->141|1133->150|1163->155|1178->162|1212->176|1243->178|1271->181|1305->207|1344->209|1374->213|1438->268|1478->270|1508->274|1563->308|1595->314|1651->349|1683->355|1738->389|1769->394|1781->398|1812->408|1843->412|1959->498|1991->500
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|39->15|39->15|39->15|41->17|44->20|45->21
                  -- GENERATED --
              */
          