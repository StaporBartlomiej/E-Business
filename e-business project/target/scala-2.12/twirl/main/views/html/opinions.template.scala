
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

object opinions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOpinionsForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opinion: Form[CreateOpinionsForm], product: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.OpinionsController.addOpinion())/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""
		"""),_display_(/*11.4*/inputText(opinion("opinions"))),format.raw/*11.34*/("""

	  	"""),format.raw/*13.5*/("""<select name="product" id="product">
		"""),_display_(/*14.4*/for(prod <- product) yield /*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
			"""),format.raw/*15.4*/("""<option value=""""),_display_(/*15.20*/prod/*15.24*/.id),format.raw/*15.27*/("""">"""),_display_(/*15.30*/prod/*15.34*/.name),format.raw/*15.39*/("""</option>
		""")))}),format.raw/*16.4*/("""
		"""),format.raw/*17.3*/("""</select>

		"""),_display_(/*19.4*/CSRF/*19.8*/.formField),format.raw/*19.18*/("""

		"""),format.raw/*21.3*/("""<div class="buttons">
			<input type="submit" value="Add opinions"/>
		</div>
	""")))}),format.raw/*24.3*/("""
""")))}),format.raw/*25.2*/("""
"""))
      }
    }
  }

  def render(opinion:Form[CreateOpinionsForm],product:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(opinion,product)(request)

  def f:((Form[CreateOpinionsForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (opinion,product) => (request) => apply(opinion,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 21:17:07 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/opinions.scala.html
                  HASH: 5da8c955f13d4541353e459dee352158f6627428
                  MATRIX: 785->1|957->103|1001->101|1028->119|1055->121|1069->128|1102->153|1148->162|1178->167|1193->174|1227->188|1258->190|1286->193|1320->219|1359->221|1389->225|1442->269|1482->271|1512->275|1563->305|1596->311|1662->351|1698->371|1737->372|1768->376|1811->392|1824->396|1848->399|1878->402|1891->406|1917->411|1960->424|1990->427|2030->441|2042->445|2073->455|2104->459|2214->539|2246->541
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|43->19|43->19|43->19|45->21|48->24|49->25
                  -- GENERATED --
              */
          