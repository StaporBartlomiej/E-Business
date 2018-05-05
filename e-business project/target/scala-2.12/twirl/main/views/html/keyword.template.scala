
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

object keyword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateKeywordForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(keyword: Form[CreateKeywordForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.KeywordController.addKeyword())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(keyword("keyword"))),format.raw/*11.33*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add keyword"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(keyword:Form[CreateKeywordForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(keyword)(request)

  def f:((Form[CreateKeywordForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (keyword) => (request) => apply(keyword)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:28:50 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/keyword.scala.html
                  HASH: b58d21bc696cf7d880f625cb0e0c3a7c974a3554
                  MATRIX: 770->1|918->79|962->77|989->95|1016->97|1030->104|1063->129|1109->138|1139->143|1154->150|1188->164|1219->166|1247->169|1281->195|1320->197|1350->201|1402->244|1442->246|1472->250|1522->279|1553->284|1565->288|1596->298|1627->302|1736->381|1768->383
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18|43->19
                  -- GENERATED --
              */
          