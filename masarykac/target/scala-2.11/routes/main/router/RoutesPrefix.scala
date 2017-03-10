
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Fri Mar 10 10:22:27 CET 2017


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
