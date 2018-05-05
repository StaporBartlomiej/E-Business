
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

object category extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateCategoryForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: Form[CreateCategoryForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.CategoryController.addCategory())/*10.49*/ {_display_(Seq[Any](format.raw/*10.51*/("""
		"""),_display_(/*11.4*/inputText(category("category"))),format.raw/*11.35*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add category"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(category:Form[CreateCategoryForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(category)(request)

  def f:((Form[CreateCategoryForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (category) => (request) => apply(category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 14:28:50 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/category.scala.html
                  HASH: 9063c859feedc59878e7adff2c825ab3e8ea5cbc
                  MATRIX: 772->1|922->81|966->79|993->97|1020->99|1034->106|1067->131|1113->140|1143->145|1158->152|1192->166|1223->168|1251->171|1285->197|1324->199|1354->203|1408->248|1448->250|1478->254|1530->285|1561->290|1573->294|1604->304|1635->308|1745->388|1777->390
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18|43->19
                  -- GENERATED --
              */
          