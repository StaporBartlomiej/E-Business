// @GENERATOR:play-routes-compiler
// @SOURCE:/home/linuxlite/IdeaProjects/e-business/conf/routes
// @DATE:Sat May 05 22:20:51 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseBasketProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addBasketProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbasketproduct")
    }
  
    // @LINE:16
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketproduct")
    }
  
    // @LINE:15
    def getBasketProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getbasketproducts")
    }
  
  }

  // @LINE:18
  class ReverseOpinionsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:18
    def getOpinions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getopinions")
    }
  
    // @LINE:20
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinion")
    }
  
  }

  // @LINE:21
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addPayment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:21
    def getPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:22
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment")
    }
  
  }

  // @LINE:9
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category")
    }
  
    // @LINE:9
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
  }

  // @LINE:27
  class ReverseOrdersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def addOrder(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addorders")
    }
  
    // @LINE:28
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:27
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getorders")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:12
  class ReverseBasketaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:14
    def addBasketId(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addbasketid")
    }
  
    // @LINE:12
    def getBasketa(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basketa")
    }
  
  }

  // @LINE:24
  class ReverseKeywordController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getKeywords(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keywords")
    }
  
    // @LINE:25
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keyword")
    }
  
    // @LINE:26
    def addKeyword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addkeyword")
    }
  
  }


}
