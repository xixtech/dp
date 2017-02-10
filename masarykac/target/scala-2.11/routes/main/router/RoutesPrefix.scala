
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/Users/Martin/Downloads/masarykac/conf/routes
// @DATE:Fri Feb 10 11:22:55 CET 2017


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
