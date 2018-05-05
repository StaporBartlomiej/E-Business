
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(product: Form[CreateProductForm], category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/request/*6.9*/.flash.get("success").map/*6.34*/ { key =>_display_(Seq[Any](format.raw/*6.43*/("""
	"""),_display_(/*7.3*/request/*7.10*/.messages(key)),format.raw/*7.24*/("""
""")))}),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main("Welcome to Ebiznes")/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
	"""),_display_(/*11.3*/form(routes.ProductController.addProduct())/*11.46*/ {_display_(Seq[Any](format.raw/*11.48*/("""
		"""),_display_(/*12.4*/inputText(product("name"))),format.raw/*12.30*/("""
		"""),_display_(/*13.4*/inputText(product("description"))),format.raw/*13.37*/("""

		"""),format.raw/*15.3*/("""<select name="category" id="category">
		"""),_display_(/*16.4*/for(cat <- category) yield /*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
			"""),format.raw/*17.4*/("""<option value=""""),_display_(/*17.20*/cat/*17.23*/.id),format.raw/*17.26*/("""">"""),_display_(/*17.29*/cat/*17.32*/.name),format.raw/*17.37*/("""</option>
		""")))}),format.raw/*18.4*/("""
		"""),format.raw/*19.3*/("""</select>


		"""),_display_(/*22.4*/CSRF/*22.8*/.formField),format.raw/*22.18*/("""

		"""),format.raw/*24.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*27.3*/("""

""")))}),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""<html>
	<a href='"""),_display_(/*32.12*/routes/*32.18*/.ProductController.getProducts()),format.raw/*32.50*/("""'>Get Products</a>
	<a href='"""),_display_(/*33.12*/routes/*33.18*/.CategoryController.getCategories()),format.raw/*33.53*/("""'>Get Categories</a>
	<a href='"""),_display_(/*34.12*/routes/*34.18*/.CategoryController.index()),format.raw/*34.45*/("""'>Add Categories</a>
	<a href='"""),_display_(/*35.12*/routes/*35.18*/.BasketaController.getBasketa()),format.raw/*35.49*/("""'>Get Baskets</a>
	<a href='"""),_display_(/*36.12*/routes/*36.18*/.BasketaController.index()),format.raw/*36.44*/("""'>Add Basket</a>
	<a href='"""),_display_(/*37.12*/routes/*37.18*/.BasketProductController.getBasketProducts()),format.raw/*37.62*/("""'>Get Basket products</a>
	<a href='"""),_display_(/*38.12*/routes/*38.18*/.BasketProductController.index()),format.raw/*38.50*/("""'>Add Basket products</a>
	<a href='"""),_display_(/*39.12*/routes/*39.18*/.OpinionsController.getOpinions()),format.raw/*39.51*/("""'>Get opinions</a>
	<a href='"""),_display_(/*40.12*/routes/*40.18*/.OpinionsController.index()),format.raw/*40.45*/("""'>Add opinion</a>
	<a href='"""),_display_(/*41.12*/routes/*41.18*/.PaymentController.getPayments()),format.raw/*41.50*/("""'>Get payments</a>
	<a href='"""),_display_(/*42.12*/routes/*42.18*/.PaymentController.index()),format.raw/*42.44*/("""'>Add payments</a>
	<a href='"""),_display_(/*43.12*/routes/*43.18*/.KeywordController.getKeywords()),format.raw/*43.50*/("""'>Get keywords</a>
	<a href='"""),_display_(/*44.12*/routes/*44.18*/.KeywordController.index()),format.raw/*44.44*/("""'>Add keyword</a>
	<a href='"""),_display_(/*45.12*/routes/*45.18*/.OrdersController.getOrders()),format.raw/*45.47*/("""'>Get orders</a>
	<a href='"""),_display_(/*46.12*/routes/*46.18*/.OrdersController.index()),format.raw/*46.43*/("""'>Add orders</a>
</html>
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 22:27:22 CEST 2018
                  SOURCE: /home/linuxlite/IdeaProjects/e-business/app/views/index.scala.html
                  HASH: 1827513e71c1a06b89b04d7e3475961800fe5d24
                  MATRIX: 782->2|955->105|999->103|1026->121|1053->123|1067->130|1100->155|1146->164|1174->167|1189->174|1223->188|1254->190|1283->193|1318->219|1358->221|1387->224|1439->267|1479->269|1509->273|1556->299|1586->303|1640->336|1671->340|1739->382|1775->402|1814->403|1845->407|1888->423|1900->426|1924->429|1954->432|1966->435|1992->440|2035->453|2065->456|2106->471|2118->475|2149->485|2180->489|2289->568|2322->571|2351->573|2396->591|2411->597|2464->629|2521->659|2536->665|2592->700|2651->732|2666->738|2714->765|2773->797|2788->803|2840->834|2896->863|2911->869|2958->895|3013->923|3028->929|3093->973|3157->1010|3172->1016|3225->1048|3289->1085|3304->1091|3358->1124|3415->1154|3430->1160|3478->1187|3534->1216|3549->1222|3602->1254|3659->1284|3674->1290|3721->1316|3778->1346|3793->1352|3846->1384|3903->1414|3918->1420|3965->1446|4021->1475|4036->1481|4086->1510|4141->1538|4156->1544|4202->1569
                  LINES: 21->2|24->4|27->3|28->5|29->6|29->6|29->6|29->6|30->7|30->7|30->7|31->8|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|36->13|36->13|38->15|39->16|39->16|39->16|40->17|40->17|40->17|40->17|40->17|40->17|40->17|41->18|42->19|45->22|45->22|45->22|47->24|50->27|52->29|54->31|55->32|55->32|55->32|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|59->36|59->36|60->37|60->37|60->37|61->38|61->38|61->38|62->39|62->39|62->39|63->40|63->40|63->40|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|67->44|67->44|68->45|68->45|68->45|69->46|69->46|69->46
                  -- GENERATED --
              */
          