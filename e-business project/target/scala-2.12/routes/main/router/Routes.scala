// @GENERATOR:play-routes-compiler
// @SOURCE:/home/linuxlite/IdeaProjects/e-business/conf/routes
// @DATE:Sat May 05 22:20:51 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_5: controllers.ProductController,
  // @LINE:9
  CategoryController_6: controllers.CategoryController,
  // @LINE:12
  BasketaController_7: controllers.BasketaController,
  // @LINE:15
  BasketProductController_4: controllers.BasketProductController,
  // @LINE:18
  OpinionsController_0: controllers.OpinionsController,
  // @LINE:21
  PaymentController_2: controllers.PaymentController,
  // @LINE:24
  KeywordController_1: controllers.KeywordController,
  // @LINE:27
  OrdersController_3: controllers.OrdersController,
  // @LINE:34
  Assets_8: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_5: controllers.ProductController,
    // @LINE:9
    CategoryController_6: controllers.CategoryController,
    // @LINE:12
    BasketaController_7: controllers.BasketaController,
    // @LINE:15
    BasketProductController_4: controllers.BasketProductController,
    // @LINE:18
    OpinionsController_0: controllers.OpinionsController,
    // @LINE:21
    PaymentController_2: controllers.PaymentController,
    // @LINE:24
    KeywordController_1: controllers.KeywordController,
    // @LINE:27
    OrdersController_3: controllers.OrdersController,
    // @LINE:34
    Assets_8: controllers.Assets
  ) = this(errorHandler, ProductController_5, CategoryController_6, BasketaController_7, BasketProductController_4, OpinionsController_0, PaymentController_2, KeywordController_1, OrdersController_3, Assets_8, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_5, CategoryController_6, BasketaController_7, BasketProductController_4, OpinionsController_0, PaymentController_2, KeywordController_1, OrdersController_3, Assets_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketa""", """controllers.BasketaController.getBasketa"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.BasketaController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbasketid""", """controllers.BasketaController.addBasketId"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getbasketproducts""", """controllers.BasketProductController.getBasketProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basketproduct""", """controllers.BasketProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addbasketproduct""", """controllers.BasketProductController.addBasketProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getopinions""", """controllers.OpinionsController.getOpinions"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionsController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinion""", """controllers.OpinionsController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.PaymentController.getPayments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.PaymentController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpayment""", """controllers.PaymentController.addPayment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keywords""", """controllers.KeywordController.getKeywords"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keyword""", """controllers.KeywordController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addkeyword""", """controllers.KeywordController.addKeyword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getorders""", """controllers.OrdersController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrdersController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorders""", """controllers.OrdersController.addOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_addProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_5.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_5.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CategoryController_getCategories3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories3_invoker = createInvoker(
    CategoryController_6.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CategoryController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_index4_invoker = createInvoker(
    CategoryController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "index",
      Nil,
      "GET",
      this.prefix + """category""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_addCategory5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory5_invoker = createInvoker(
    CategoryController_6.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BasketaController_getBasketa6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketa")))
  )
  private[this] lazy val controllers_BasketaController_getBasketa6_invoker = createInvoker(
    BasketaController_7.getBasketa,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketaController",
      "getBasketa",
      Nil,
      "GET",
      this.prefix + """basketa""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BasketaController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_BasketaController_index7_invoker = createInvoker(
    BasketaController_7.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketaController",
      "index",
      Nil,
      "GET",
      this.prefix + """basket""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BasketaController_addBasketId8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbasketid")))
  )
  private[this] lazy val controllers_BasketaController_addBasketId8_invoker = createInvoker(
    BasketaController_7.addBasketId,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketaController",
      "addBasketId",
      Nil,
      "POST",
      this.prefix + """addbasketid""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BasketProductController_getBasketProducts9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getbasketproducts")))
  )
  private[this] lazy val controllers_BasketProductController_getBasketProducts9_invoker = createInvoker(
    BasketProductController_4.getBasketProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "getBasketProducts",
      Nil,
      "GET",
      this.prefix + """getbasketproducts""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BasketProductController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basketproduct")))
  )
  private[this] lazy val controllers_BasketProductController_index10_invoker = createInvoker(
    BasketProductController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """basketproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_BasketProductController_addBasketProduct11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addbasketproduct")))
  )
  private[this] lazy val controllers_BasketProductController_addBasketProduct11_invoker = createInvoker(
    BasketProductController_4.addBasketProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BasketProductController",
      "addBasketProduct",
      Nil,
      "POST",
      this.prefix + """addbasketproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_OpinionsController_getOpinions12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getopinions")))
  )
  private[this] lazy val controllers_OpinionsController_getOpinions12_invoker = createInvoker(
    OpinionsController_0.getOpinions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionsController",
      "getOpinions",
      Nil,
      "GET",
      this.prefix + """getopinions""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_OpinionsController_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionsController_index13_invoker = createInvoker(
    OpinionsController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionsController",
      "index",
      Nil,
      "GET",
      this.prefix + """opinions""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_OpinionsController_addOpinion14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion")))
  )
  private[this] lazy val controllers_OpinionsController_addOpinion14_invoker = createInvoker(
    OpinionsController_0.addOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionsController",
      "addOpinion",
      Nil,
      "POST",
      this.prefix + """addopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PaymentController_getPayments15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_PaymentController_getPayments15_invoker = createInvoker(
    PaymentController_2.getPayments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayments",
      Nil,
      "GET",
      this.prefix + """payments""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PaymentController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_PaymentController_index16_invoker = createInvoker(
    PaymentController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "index",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PaymentController_addPayment17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_PaymentController_addPayment17_invoker = createInvoker(
    PaymentController_2.addPayment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPayment",
      Nil,
      "POST",
      this.prefix + """addpayment""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_KeywordController_getKeywords18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keywords")))
  )
  private[this] lazy val controllers_KeywordController_getKeywords18_invoker = createInvoker(
    KeywordController_1.getKeywords,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "getKeywords",
      Nil,
      "GET",
      this.prefix + """keywords""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_KeywordController_index19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keyword")))
  )
  private[this] lazy val controllers_KeywordController_index19_invoker = createInvoker(
    KeywordController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "index",
      Nil,
      "GET",
      this.prefix + """keyword""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_KeywordController_addKeyword20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addkeyword")))
  )
  private[this] lazy val controllers_KeywordController_addKeyword20_invoker = createInvoker(
    KeywordController_1.addKeyword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KeywordController",
      "addKeyword",
      Nil,
      "POST",
      this.prefix + """addkeyword""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_OrdersController_getOrders21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getorders")))
  )
  private[this] lazy val controllers_OrdersController_getOrders21_invoker = createInvoker(
    OrdersController_3.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """getorders""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_OrdersController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrdersController_index22_invoker = createInvoker(
    OrdersController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "index",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_OrdersController_addOrder23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorders")))
  )
  private[this] lazy val controllers_OrdersController_addOrder23_invoker = createInvoker(
    OrdersController_3.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrdersController",
      "addOrder",
      Nil,
      "POST",
      this.prefix + """addorders""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned24_invoker = createInvoker(
    Assets_8.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_5.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_5.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_5.getProducts)
      }
  
    // @LINE:9
    case controllers_CategoryController_getCategories3_route(params@_) =>
      call { 
        controllers_CategoryController_getCategories3_invoker.call(CategoryController_6.getCategories)
      }
  
    // @LINE:10
    case controllers_CategoryController_index4_route(params@_) =>
      call { 
        controllers_CategoryController_index4_invoker.call(CategoryController_6.index)
      }
  
    // @LINE:11
    case controllers_CategoryController_addCategory5_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory5_invoker.call(CategoryController_6.addCategory)
      }
  
    // @LINE:12
    case controllers_BasketaController_getBasketa6_route(params@_) =>
      call { 
        controllers_BasketaController_getBasketa6_invoker.call(BasketaController_7.getBasketa)
      }
  
    // @LINE:13
    case controllers_BasketaController_index7_route(params@_) =>
      call { 
        controllers_BasketaController_index7_invoker.call(BasketaController_7.index)
      }
  
    // @LINE:14
    case controllers_BasketaController_addBasketId8_route(params@_) =>
      call { 
        controllers_BasketaController_addBasketId8_invoker.call(BasketaController_7.addBasketId)
      }
  
    // @LINE:15
    case controllers_BasketProductController_getBasketProducts9_route(params@_) =>
      call { 
        controllers_BasketProductController_getBasketProducts9_invoker.call(BasketProductController_4.getBasketProducts)
      }
  
    // @LINE:16
    case controllers_BasketProductController_index10_route(params@_) =>
      call { 
        controllers_BasketProductController_index10_invoker.call(BasketProductController_4.index)
      }
  
    // @LINE:17
    case controllers_BasketProductController_addBasketProduct11_route(params@_) =>
      call { 
        controllers_BasketProductController_addBasketProduct11_invoker.call(BasketProductController_4.addBasketProduct)
      }
  
    // @LINE:18
    case controllers_OpinionsController_getOpinions12_route(params@_) =>
      call { 
        controllers_OpinionsController_getOpinions12_invoker.call(OpinionsController_0.getOpinions)
      }
  
    // @LINE:19
    case controllers_OpinionsController_index13_route(params@_) =>
      call { 
        controllers_OpinionsController_index13_invoker.call(OpinionsController_0.index)
      }
  
    // @LINE:20
    case controllers_OpinionsController_addOpinion14_route(params@_) =>
      call { 
        controllers_OpinionsController_addOpinion14_invoker.call(OpinionsController_0.addOpinion)
      }
  
    // @LINE:21
    case controllers_PaymentController_getPayments15_route(params@_) =>
      call { 
        controllers_PaymentController_getPayments15_invoker.call(PaymentController_2.getPayments)
      }
  
    // @LINE:22
    case controllers_PaymentController_index16_route(params@_) =>
      call { 
        controllers_PaymentController_index16_invoker.call(PaymentController_2.index)
      }
  
    // @LINE:23
    case controllers_PaymentController_addPayment17_route(params@_) =>
      call { 
        controllers_PaymentController_addPayment17_invoker.call(PaymentController_2.addPayment)
      }
  
    // @LINE:24
    case controllers_KeywordController_getKeywords18_route(params@_) =>
      call { 
        controllers_KeywordController_getKeywords18_invoker.call(KeywordController_1.getKeywords)
      }
  
    // @LINE:25
    case controllers_KeywordController_index19_route(params@_) =>
      call { 
        controllers_KeywordController_index19_invoker.call(KeywordController_1.index)
      }
  
    // @LINE:26
    case controllers_KeywordController_addKeyword20_route(params@_) =>
      call { 
        controllers_KeywordController_addKeyword20_invoker.call(KeywordController_1.addKeyword)
      }
  
    // @LINE:27
    case controllers_OrdersController_getOrders21_route(params@_) =>
      call { 
        controllers_OrdersController_getOrders21_invoker.call(OrdersController_3.getOrders)
      }
  
    // @LINE:28
    case controllers_OrdersController_index22_route(params@_) =>
      call { 
        controllers_OrdersController_index22_invoker.call(OrdersController_3.index)
      }
  
    // @LINE:29
    case controllers_OrdersController_addOrder23_route(params@_) =>
      call { 
        controllers_OrdersController_addOrder23_invoker.call(OrdersController_3.addOrder)
      }
  
    // @LINE:34
    case controllers_Assets_versioned24_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned24_invoker.call(Assets_8.versioned(path, file))
      }
  }
}
