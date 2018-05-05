
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

object orders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateOrderForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.OrdersController.addOrder())/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
		"""),_display_(/*11.4*/inputText(order("basket"))),format.raw/*11.30*/("""
	  	"""),_display_(/*12.6*/inputText(order("date"))),format.raw/*12.30*/("""
	  	"""),_display_(/*13.6*/inputText(order("address"))),format.raw/*13.33*/("""

		"""),_display_(/*15.4*/CSRF/*15.8*/.formField),format.raw/*15.18*/("""

		"""),format.raw/*17.3*/("""<div class="buttons">
			<input type="submit" value="Add order"/>
		</div>
	""")))}),format.raw/*20.3*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(order:Form[CreateOrderForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(order)(request)

  def f:((Form[CreateOrderForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (order) => (request) => apply(order)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 21:17:07 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/orders.scala.html
                  HASH: e4a4f6a3471f1c148bee8c61e0ca3b4673e3748f
                  MATRIX: 767->1|911->75|955->73|982->91|1009->93|1023->100|1056->125|1102->134|1132->139|1147->146|1181->160|1212->162|1240->165|1274->191|1313->193|1343->197|1392->237|1432->239|1462->243|1509->269|1541->275|1586->299|1618->305|1666->332|1697->337|1709->341|1740->351|1771->355|1878->432|1910->434
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|39->15|39->15|39->15|41->17|44->20|45->21
                  -- GENERATED --
              */
          