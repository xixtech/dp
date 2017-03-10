
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Fri Mar 10 10:22:27 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_9: controllers.Application,
  // @LINE:10
  SalaryController_3: controllers.SalaryController,
  // @LINE:11
  Login_7: controllers.Login,
  // @LINE:13
  Charts_10: controllers.Charts,
  // @LINE:18
  UiElements_6: controllers.UiElements,
  // @LINE:24
  Pages_2: controllers.Pages,
  // @LINE:27
  PersonController_1: controllers.PersonController,
  // @LINE:31
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:37
  TableController_4: controllers.TableController,
  // @LINE:43
  PrintController_5: controllers.PrintController,
  // @LINE:52
  Assets_8: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_9: controllers.Application,
    // @LINE:10
    SalaryController_3: controllers.SalaryController,
    // @LINE:11
    Login_7: controllers.Login,
    // @LINE:13
    Charts_10: controllers.Charts,
    // @LINE:18
    UiElements_6: controllers.UiElements,
    // @LINE:24
    Pages_2: controllers.Pages,
    // @LINE:27
    PersonController_1: controllers.PersonController,
    // @LINE:31
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:37
    TableController_4: controllers.TableController,
    // @LINE:43
    PrintController_5: controllers.PrintController,
    // @LINE:52
    Assets_8: controllers.Assets
  ) = this(errorHandler, Application_9, SalaryController_3, Login_7, Charts_10, UiElements_6, Pages_2, PersonController_1, MethodicsController_0, TableController_4, PrintController_5, Assets_8, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_9, SalaryController_3, Login_7, Charts_10, UiElements_6, Pages_2, PersonController_1, MethodicsController_0, TableController_4, PrintController_5, Assets_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.dashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdf""", """controllers.Application.pdf()"""),
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kpi""", """controllers.Application.kpiChoosePerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kpi/k""", """controllers.SalaryController.getPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """charts/flot""", """controllers.Charts.flot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """charts/morris""", """controllers.Charts.morris()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tables""", """controllers.Application.tables()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workers""", """controllers.Application.workers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forms""", """controllers.Application.forms()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/panels-and-wells""", """controllers.UiElements.panelsAndWells()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/buttons""", """controllers.UiElements.buttons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/notifications""", """controllers.UiElements.notifications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/typography""", """controllers.UiElements.typography()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/icons""", """controllers.UiElements.icons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui-elements/grid""", """controllers.UiElements.grid()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pages/blank""", """controllers.Pages.blank()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/register""", """controllers.PersonController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/saved""", """controllers.PersonController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/add""", """controllers.MethodicsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/saved""", """controllers.MethodicsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """roles""", """controllers.Application.roles()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Application.workers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.TableController.listPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/moje/""" + "$" + """id<[^/]+>""", """controllers.PrintController.printUserDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/moje/""" + "$" + """id<[^/]+>""", """controllers.PrintController.detailsList(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/lector/saved""", """controllers.SalaryController.saveLector()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/lector/""" + "$" + """id<[^/]+>""", """controllers.SalaryController.printLector(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/lector/""" + "$" + """id<[^/]+>""", """controllers.SalaryController.detailsListLector(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_dashboard0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_dashboard0_invoker = createInvoker(
    Application_9.dashboard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "dashboard",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_pdf1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdf")))
  )
  private[this] lazy val controllers_Application_pdf1_invoker = createInvoker(
    Application_9.pdf(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "pdf",
      Nil,
      "GET",
      """""",
      this.prefix + """pdf"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index2_invoker = createInvoker(
    Application_9.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_kpiChoosePerson3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi")))
  )
  private[this] lazy val controllers_Application_kpiChoosePerson3_invoker = createInvoker(
    Application_9.kpiChoosePerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "kpiChoosePerson",
      Nil,
      "GET",
      """""",
      this.prefix + """kpi"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SalaryController_getPerson4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi/k")))
  )
  private[this] lazy val controllers_SalaryController_getPerson4_invoker = createInvoker(
    SalaryController_3.getPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaryController",
      "getPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """kpi/k"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Login_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_index5_invoker = createInvoker(
    Login_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Login_authenticate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_authenticate6_invoker = createInvoker(
    Login_7.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Login",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Charts_flot7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/flot")))
  )
  private[this] lazy val controllers_Charts_flot7_invoker = createInvoker(
    Charts_10.flot(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Charts",
      "flot",
      Nil,
      "GET",
      """""",
      this.prefix + """charts/flot"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Charts_morris8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/morris")))
  )
  private[this] lazy val controllers_Charts_morris8_invoker = createInvoker(
    Charts_10.morris(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Charts",
      "morris",
      Nil,
      "GET",
      """""",
      this.prefix + """charts/morris"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_tables9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tables")))
  )
  private[this] lazy val controllers_Application_tables9_invoker = createInvoker(
    Application_9.tables(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "tables",
      Nil,
      "GET",
      """""",
      this.prefix + """tables"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_workers10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workers")))
  )
  private[this] lazy val controllers_Application_workers10_invoker = createInvoker(
    Application_9.workers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "workers",
      Nil,
      "GET",
      """""",
      this.prefix + """workers"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_forms11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms11_invoker = createInvoker(
    Application_9.forms(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "forms",
      Nil,
      "GET",
      """""",
      this.prefix + """forms"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UiElements_panelsAndWells12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/panels-and-wells")))
  )
  private[this] lazy val controllers_UiElements_panelsAndWells12_invoker = createInvoker(
    UiElements_6.panelsAndWells(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "panelsAndWells",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/panels-and-wells"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UiElements_buttons13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/buttons")))
  )
  private[this] lazy val controllers_UiElements_buttons13_invoker = createInvoker(
    UiElements_6.buttons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "buttons",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/buttons"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UiElements_notifications14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/notifications")))
  )
  private[this] lazy val controllers_UiElements_notifications14_invoker = createInvoker(
    UiElements_6.notifications(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "notifications",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/notifications"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UiElements_typography15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/typography")))
  )
  private[this] lazy val controllers_UiElements_typography15_invoker = createInvoker(
    UiElements_6.typography(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "typography",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/typography"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UiElements_icons16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/icons")))
  )
  private[this] lazy val controllers_UiElements_icons16_invoker = createInvoker(
    UiElements_6.icons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "icons",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/icons"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_UiElements_grid17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/grid")))
  )
  private[this] lazy val controllers_UiElements_grid17_invoker = createInvoker(
    UiElements_6.grid(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UiElements",
      "grid",
      Nil,
      "GET",
      """""",
      this.prefix + """ui-elements/grid"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Pages_blank18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pages/blank")))
  )
  private[this] lazy val controllers_Pages_blank18_invoker = createInvoker(
    Pages_2.blank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Pages",
      "blank",
      Nil,
      "GET",
      """""",
      this.prefix + """pages/blank"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PersonController_index19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_PersonController_index19_invoker = createInvoker(
    PersonController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Nil,
      "GET",
      """ Přidat zaměstnance""",
      this.prefix + """users/register"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PersonController_save20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/saved")))
  )
  private[this] lazy val controllers_PersonController_save20_invoker = createInvoker(
    PersonController_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """users/saved"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MethodicsController_index21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index21_invoker = createInvoker(
    MethodicsController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MethodicsController",
      "index",
      Nil,
      "GET",
      """ Přidat meetodiku""",
      this.prefix + """m/add"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_MethodicsController_save22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save22_invoker = createInvoker(
    MethodicsController_0.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MethodicsController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """m/saved"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Application_roles23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles23_invoker = createInvoker(
    Application_9.roles(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "roles",
      Nil,
      "GET",
      """""",
      this.prefix + """roles"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_workers24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_workers24_invoker = createInvoker(
    Application_9.workers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "workers",
      Nil,
      "POST",
      """ Vypsat zákazníky""",
      this.prefix + """users"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_TableController_listPerson25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson25_invoker = createInvoker(
    TableController_4.listPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listPerson",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_logout26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout26_invoker = createInvoker(
    Application_9.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """ Odhlásit""",
      this.prefix + """logout"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_PrintController_printUserDetails27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails27_invoker = createInvoker(
    PrintController_5.printUserDetails(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrintController",
      "printUserDetails",
      Seq(classOf[Long]),
      "POST",
      """ Vypsat údaje konkrétního zákazníka""",
      this.prefix + """users/moje/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_PrintController_detailsList28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList28_invoker = createInvoker(
    PrintController_5.detailsList(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PrintController",
      "detailsList",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/moje/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_SalaryController_saveLector29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector29_invoker = createInvoker(
    SalaryController_3.saveLector(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaryController",
      "saveLector",
      Nil,
      "POST",
      """""",
      this.prefix + """users/lector/saved"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_SalaryController_printLector30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector30_invoker = createInvoker(
    SalaryController_3.printLector(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaryController",
      "printLector",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """users/lector/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_SalaryController_detailsListLector31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector31_invoker = createInvoker(
    SalaryController_3.detailsListLector(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SalaryController",
      "detailsListLector",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/lector/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Assets_at32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at32_invoker = createInvoker(
    Assets_8.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_dashboard0_route(params) =>
      call { 
        controllers_Application_dashboard0_invoker.call(Application_9.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_9.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_9.index())
      }
  
    // @LINE:9
    case controllers_Application_kpiChoosePerson3_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson3_invoker.call(Application_9.kpiChoosePerson())
      }
  
    // @LINE:10
    case controllers_SalaryController_getPerson4_route(params) =>
      call { 
        controllers_SalaryController_getPerson4_invoker.call(SalaryController_3.getPerson())
      }
  
    // @LINE:11
    case controllers_Login_index5_route(params) =>
      call { 
        controllers_Login_index5_invoker.call(Login_7.index())
      }
  
    // @LINE:12
    case controllers_Login_authenticate6_route(params) =>
      call { 
        controllers_Login_authenticate6_invoker.call(Login_7.authenticate())
      }
  
    // @LINE:13
    case controllers_Charts_flot7_route(params) =>
      call { 
        controllers_Charts_flot7_invoker.call(Charts_10.flot())
      }
  
    // @LINE:14
    case controllers_Charts_morris8_route(params) =>
      call { 
        controllers_Charts_morris8_invoker.call(Charts_10.morris())
      }
  
    // @LINE:15
    case controllers_Application_tables9_route(params) =>
      call { 
        controllers_Application_tables9_invoker.call(Application_9.tables())
      }
  
    // @LINE:16
    case controllers_Application_workers10_route(params) =>
      call { 
        controllers_Application_workers10_invoker.call(Application_9.workers())
      }
  
    // @LINE:17
    case controllers_Application_forms11_route(params) =>
      call { 
        controllers_Application_forms11_invoker.call(Application_9.forms())
      }
  
    // @LINE:18
    case controllers_UiElements_panelsAndWells12_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells12_invoker.call(UiElements_6.panelsAndWells())
      }
  
    // @LINE:19
    case controllers_UiElements_buttons13_route(params) =>
      call { 
        controllers_UiElements_buttons13_invoker.call(UiElements_6.buttons())
      }
  
    // @LINE:20
    case controllers_UiElements_notifications14_route(params) =>
      call { 
        controllers_UiElements_notifications14_invoker.call(UiElements_6.notifications())
      }
  
    // @LINE:21
    case controllers_UiElements_typography15_route(params) =>
      call { 
        controllers_UiElements_typography15_invoker.call(UiElements_6.typography())
      }
  
    // @LINE:22
    case controllers_UiElements_icons16_route(params) =>
      call { 
        controllers_UiElements_icons16_invoker.call(UiElements_6.icons())
      }
  
    // @LINE:23
    case controllers_UiElements_grid17_route(params) =>
      call { 
        controllers_UiElements_grid17_invoker.call(UiElements_6.grid())
      }
  
    // @LINE:24
    case controllers_Pages_blank18_route(params) =>
      call { 
        controllers_Pages_blank18_invoker.call(Pages_2.blank())
      }
  
    // @LINE:27
    case controllers_PersonController_index19_route(params) =>
      call { 
        controllers_PersonController_index19_invoker.call(PersonController_1.index())
      }
  
    // @LINE:28
    case controllers_PersonController_save20_route(params) =>
      call { 
        controllers_PersonController_save20_invoker.call(PersonController_1.save())
      }
  
    // @LINE:31
    case controllers_MethodicsController_index21_route(params) =>
      call { 
        controllers_MethodicsController_index21_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:32
    case controllers_MethodicsController_save22_route(params) =>
      call { 
        controllers_MethodicsController_save22_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:34
    case controllers_Application_roles23_route(params) =>
      call { 
        controllers_Application_roles23_invoker.call(Application_9.roles())
      }
  
    // @LINE:36
    case controllers_Application_workers24_route(params) =>
      call { 
        controllers_Application_workers24_invoker.call(Application_9.workers())
      }
  
    // @LINE:37
    case controllers_TableController_listPerson25_route(params) =>
      call { 
        controllers_TableController_listPerson25_invoker.call(TableController_4.listPerson())
      }
  
    // @LINE:40
    case controllers_Application_logout26_route(params) =>
      call { 
        controllers_Application_logout26_invoker.call(Application_9.logout())
      }
  
    // @LINE:43
    case controllers_PrintController_printUserDetails27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails27_invoker.call(PrintController_5.printUserDetails(id))
      }
  
    // @LINE:44
    case controllers_PrintController_detailsList28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList28_invoker.call(PrintController_5.detailsList(id))
      }
  
    // @LINE:46
    case controllers_SalaryController_saveLector29_route(params) =>
      call { 
        controllers_SalaryController_saveLector29_invoker.call(SalaryController_3.saveLector())
      }
  
    // @LINE:47
    case controllers_SalaryController_printLector30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector30_invoker.call(SalaryController_3.printLector(id))
      }
  
    // @LINE:48
    case controllers_SalaryController_detailsListLector31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector31_invoker.call(SalaryController_3.detailsListLector(id))
      }
  
    // @LINE:52
    case controllers_Assets_at32_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at32_invoker.call(Assets_8.at(path, file))
      }
  }
}
