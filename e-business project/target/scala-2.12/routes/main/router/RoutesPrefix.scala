// @GENERATOR:play-routes-compiler
// @SOURCE:/home/linuxlite/IdeaProjects/e-business/conf/routes
// @DATE:Sat May 05 22:20:51 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
