
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Thu Mar 16 16:48:26 CET 2017

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
  Application_14: controllers.Application,
  // @LINE:10
  SalaryController_6: controllers.SalaryController,
  // @LINE:11
  Login_11: controllers.Login,
  // @LINE:13
  Charts_15: controllers.Charts,
  // @LINE:18
  UiElements_9: controllers.UiElements,
  // @LINE:24
  Pages_2: controllers.Pages,
  // @LINE:27
  PersonController_1: controllers.PersonController,
  // @LINE:31
  EmployeesController_10: controllers.EmployeesController,
  // @LINE:35
  SubjectController_16: controllers.SubjectController,
  // @LINE:39
  FieldOfStudyController_4: controllers.FieldOfStudyController,
  // @LINE:43
  StudyGroupsController_3: controllers.StudyGroupsController,
  // @LINE:47
  SemestersController_12: controllers.SemestersController,
  // @LINE:51
  StudyPlansController_5: controllers.StudyPlansController,
  // @LINE:55
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:61
  TableController_7: controllers.TableController,
  // @LINE:67
  PrintController_8: controllers.PrintController,
  // @LINE:76
  Assets_13: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_14: controllers.Application,
    // @LINE:10
    SalaryController_6: controllers.SalaryController,
    // @LINE:11
    Login_11: controllers.Login,
    // @LINE:13
    Charts_15: controllers.Charts,
    // @LINE:18
    UiElements_9: controllers.UiElements,
    // @LINE:24
    Pages_2: controllers.Pages,
    // @LINE:27
    PersonController_1: controllers.PersonController,
    // @LINE:31
    EmployeesController_10: controllers.EmployeesController,
    // @LINE:35
    SubjectController_16: controllers.SubjectController,
    // @LINE:39
    FieldOfStudyController_4: controllers.FieldOfStudyController,
    // @LINE:43
    StudyGroupsController_3: controllers.StudyGroupsController,
    // @LINE:47
    SemestersController_12: controllers.SemestersController,
    // @LINE:51
    StudyPlansController_5: controllers.StudyPlansController,
    // @LINE:55
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:61
    TableController_7: controllers.TableController,
    // @LINE:67
    PrintController_8: controllers.PrintController,
    // @LINE:76
    Assets_13: controllers.Assets
  ) = this(errorHandler, Application_14, SalaryController_6, Login_11, Charts_15, UiElements_9, Pages_2, PersonController_1, EmployeesController_10, SubjectController_16, FieldOfStudyController_4, StudyGroupsController_3, SemestersController_12, StudyPlansController_5, MethodicsController_0, TableController_7, PrintController_8, Assets_13, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_14, SalaryController_6, Login_11, Charts_15, UiElements_9, Pages_2, PersonController_1, EmployeesController_10, SubjectController_16, FieldOfStudyController_4, StudyGroupsController_3, SemestersController_12, StudyPlansController_5, MethodicsController_0, TableController_7, PrintController_8, Assets_13, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/register""", """controllers.EmployeesController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/saved""", """controllers.EmployeesController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/add""", """controllers.SubjectController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/saved""", """controllers.SubjectController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/add""", """controllers.FieldOfStudyController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/saved""", """controllers.FieldOfStudyController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studygroups/add""", """controllers.StudyGroupsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studygroups/saved""", """controllers.StudyGroupsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """semester/add""", """controllers.SemestersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """semester/saved""", """controllers.SemestersController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studyplan/add""", """controllers.StudyPlansController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """srudyplan/saved""", """controllers.StudyPlansController.save()"""),
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
    Application_14.dashboard(),
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
    Application_14.pdf(),
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
    Application_14.index(),
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
    Application_14.kpiChoosePerson(),
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
    SalaryController_6.getPerson(),
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
    Login_11.index(),
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
    Login_11.authenticate(),
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
    Charts_15.flot(),
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
    Charts_15.morris(),
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
    Application_14.tables(),
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
    Application_14.workers(),
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
    Application_14.forms(),
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
    UiElements_9.panelsAndWells(),
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
    UiElements_9.buttons(),
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
    UiElements_9.notifications(),
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
    UiElements_9.typography(),
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
    UiElements_9.icons(),
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
    UiElements_9.grid(),
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
  private[this] lazy val controllers_EmployeesController_index21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index21_invoker = createInvoker(
    EmployeesController_10.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "index",
      Nil,
      "GET",
      """ Přidat zaměstnance""",
      this.prefix + """employee/register"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EmployeesController_save22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save22_invoker = createInvoker(
    EmployeesController_10.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """employee/saved"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_SubjectController_index23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index23_invoker = createInvoker(
    SubjectController_16.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "index",
      Nil,
      "GET",
      """ Přidat předmět""",
      this.prefix + """subject/add"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_SubjectController_save24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save24_invoker = createInvoker(
    SubjectController_16.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """subject/saved"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_FieldOfStudyController_index25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index25_invoker = createInvoker(
    FieldOfStudyController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FieldOfStudyController",
      "index",
      Nil,
      "GET",
      """ Přidat předmět""",
      this.prefix + """fields/add"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_FieldOfStudyController_save26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save26_invoker = createInvoker(
    FieldOfStudyController_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FieldOfStudyController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """fields/saved"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_StudyGroupsController_index27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index27_invoker = createInvoker(
    StudyGroupsController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudyGroupsController",
      "index",
      Nil,
      "GET",
      """ Přidat předmět""",
      this.prefix + """studygroups/add"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_StudyGroupsController_save28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save28_invoker = createInvoker(
    StudyGroupsController_3.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudyGroupsController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """studygroups/saved"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_SemestersController_index29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index29_invoker = createInvoker(
    SemestersController_12.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SemestersController",
      "index",
      Nil,
      "GET",
      """ Přidat předmět""",
      this.prefix + """semester/add"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_SemestersController_save30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save30_invoker = createInvoker(
    SemestersController_12.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SemestersController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """semester/saved"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_StudyPlansController_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index31_invoker = createInvoker(
    StudyPlansController_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudyPlansController",
      "index",
      Nil,
      "GET",
      """ Přidat předmět""",
      this.prefix + """studyplan/add"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_StudyPlansController_save32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("srudyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save32_invoker = createInvoker(
    StudyPlansController_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudyPlansController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """srudyplan/saved"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_MethodicsController_index33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index33_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_MethodicsController_save34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save34_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_Application_roles35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles35_invoker = createInvoker(
    Application_14.roles(),
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

  // @LINE:60
  private[this] lazy val controllers_Application_workers36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_workers36_invoker = createInvoker(
    Application_14.workers(),
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

  // @LINE:61
  private[this] lazy val controllers_TableController_listPerson37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson37_invoker = createInvoker(
    TableController_7.listPerson(),
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

  // @LINE:64
  private[this] lazy val controllers_Application_logout38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout38_invoker = createInvoker(
    Application_14.logout(),
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

  // @LINE:67
  private[this] lazy val controllers_PrintController_printUserDetails39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails39_invoker = createInvoker(
    PrintController_8.printUserDetails(fakeValue[Long]),
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

  // @LINE:68
  private[this] lazy val controllers_PrintController_detailsList40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList40_invoker = createInvoker(
    PrintController_8.detailsList(fakeValue[Long]),
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

  // @LINE:70
  private[this] lazy val controllers_SalaryController_saveLector41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector41_invoker = createInvoker(
    SalaryController_6.saveLector(),
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

  // @LINE:71
  private[this] lazy val controllers_SalaryController_printLector42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector42_invoker = createInvoker(
    SalaryController_6.printLector(fakeValue[Long]),
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

  // @LINE:72
  private[this] lazy val controllers_SalaryController_detailsListLector43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector43_invoker = createInvoker(
    SalaryController_6.detailsListLector(fakeValue[Long]),
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

  // @LINE:76
  private[this] lazy val controllers_Assets_at44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at44_invoker = createInvoker(
    Assets_13.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_14.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_14.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_14.index())
      }
  
    // @LINE:9
    case controllers_Application_kpiChoosePerson3_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson3_invoker.call(Application_14.kpiChoosePerson())
      }
  
    // @LINE:10
    case controllers_SalaryController_getPerson4_route(params) =>
      call { 
        controllers_SalaryController_getPerson4_invoker.call(SalaryController_6.getPerson())
      }
  
    // @LINE:11
    case controllers_Login_index5_route(params) =>
      call { 
        controllers_Login_index5_invoker.call(Login_11.index())
      }
  
    // @LINE:12
    case controllers_Login_authenticate6_route(params) =>
      call { 
        controllers_Login_authenticate6_invoker.call(Login_11.authenticate())
      }
  
    // @LINE:13
    case controllers_Charts_flot7_route(params) =>
      call { 
        controllers_Charts_flot7_invoker.call(Charts_15.flot())
      }
  
    // @LINE:14
    case controllers_Charts_morris8_route(params) =>
      call { 
        controllers_Charts_morris8_invoker.call(Charts_15.morris())
      }
  
    // @LINE:15
    case controllers_Application_tables9_route(params) =>
      call { 
        controllers_Application_tables9_invoker.call(Application_14.tables())
      }
  
    // @LINE:16
    case controllers_Application_workers10_route(params) =>
      call { 
        controllers_Application_workers10_invoker.call(Application_14.workers())
      }
  
    // @LINE:17
    case controllers_Application_forms11_route(params) =>
      call { 
        controllers_Application_forms11_invoker.call(Application_14.forms())
      }
  
    // @LINE:18
    case controllers_UiElements_panelsAndWells12_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells12_invoker.call(UiElements_9.panelsAndWells())
      }
  
    // @LINE:19
    case controllers_UiElements_buttons13_route(params) =>
      call { 
        controllers_UiElements_buttons13_invoker.call(UiElements_9.buttons())
      }
  
    // @LINE:20
    case controllers_UiElements_notifications14_route(params) =>
      call { 
        controllers_UiElements_notifications14_invoker.call(UiElements_9.notifications())
      }
  
    // @LINE:21
    case controllers_UiElements_typography15_route(params) =>
      call { 
        controllers_UiElements_typography15_invoker.call(UiElements_9.typography())
      }
  
    // @LINE:22
    case controllers_UiElements_icons16_route(params) =>
      call { 
        controllers_UiElements_icons16_invoker.call(UiElements_9.icons())
      }
  
    // @LINE:23
    case controllers_UiElements_grid17_route(params) =>
      call { 
        controllers_UiElements_grid17_invoker.call(UiElements_9.grid())
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
    case controllers_EmployeesController_index21_route(params) =>
      call { 
        controllers_EmployeesController_index21_invoker.call(EmployeesController_10.index())
      }
  
    // @LINE:32
    case controllers_EmployeesController_save22_route(params) =>
      call { 
        controllers_EmployeesController_save22_invoker.call(EmployeesController_10.save())
      }
  
    // @LINE:35
    case controllers_SubjectController_index23_route(params) =>
      call { 
        controllers_SubjectController_index23_invoker.call(SubjectController_16.index())
      }
  
    // @LINE:36
    case controllers_SubjectController_save24_route(params) =>
      call { 
        controllers_SubjectController_save24_invoker.call(SubjectController_16.save())
      }
  
    // @LINE:39
    case controllers_FieldOfStudyController_index25_route(params) =>
      call { 
        controllers_FieldOfStudyController_index25_invoker.call(FieldOfStudyController_4.index())
      }
  
    // @LINE:40
    case controllers_FieldOfStudyController_save26_route(params) =>
      call { 
        controllers_FieldOfStudyController_save26_invoker.call(FieldOfStudyController_4.save())
      }
  
    // @LINE:43
    case controllers_StudyGroupsController_index27_route(params) =>
      call { 
        controllers_StudyGroupsController_index27_invoker.call(StudyGroupsController_3.index())
      }
  
    // @LINE:44
    case controllers_StudyGroupsController_save28_route(params) =>
      call { 
        controllers_StudyGroupsController_save28_invoker.call(StudyGroupsController_3.save())
      }
  
    // @LINE:47
    case controllers_SemestersController_index29_route(params) =>
      call { 
        controllers_SemestersController_index29_invoker.call(SemestersController_12.index())
      }
  
    // @LINE:48
    case controllers_SemestersController_save30_route(params) =>
      call { 
        controllers_SemestersController_save30_invoker.call(SemestersController_12.save())
      }
  
    // @LINE:51
    case controllers_StudyPlansController_index31_route(params) =>
      call { 
        controllers_StudyPlansController_index31_invoker.call(StudyPlansController_5.index())
      }
  
    // @LINE:52
    case controllers_StudyPlansController_save32_route(params) =>
      call { 
        controllers_StudyPlansController_save32_invoker.call(StudyPlansController_5.save())
      }
  
    // @LINE:55
    case controllers_MethodicsController_index33_route(params) =>
      call { 
        controllers_MethodicsController_index33_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:56
    case controllers_MethodicsController_save34_route(params) =>
      call { 
        controllers_MethodicsController_save34_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:58
    case controllers_Application_roles35_route(params) =>
      call { 
        controllers_Application_roles35_invoker.call(Application_14.roles())
      }
  
    // @LINE:60
    case controllers_Application_workers36_route(params) =>
      call { 
        controllers_Application_workers36_invoker.call(Application_14.workers())
      }
  
    // @LINE:61
    case controllers_TableController_listPerson37_route(params) =>
      call { 
        controllers_TableController_listPerson37_invoker.call(TableController_7.listPerson())
      }
  
    // @LINE:64
    case controllers_Application_logout38_route(params) =>
      call { 
        controllers_Application_logout38_invoker.call(Application_14.logout())
      }
  
    // @LINE:67
    case controllers_PrintController_printUserDetails39_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails39_invoker.call(PrintController_8.printUserDetails(id))
      }
  
    // @LINE:68
    case controllers_PrintController_detailsList40_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList40_invoker.call(PrintController_8.detailsList(id))
      }
  
    // @LINE:70
    case controllers_SalaryController_saveLector41_route(params) =>
      call { 
        controllers_SalaryController_saveLector41_invoker.call(SalaryController_6.saveLector())
      }
  
    // @LINE:71
    case controllers_SalaryController_printLector42_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector42_invoker.call(SalaryController_6.printLector(id))
      }
  
    // @LINE:72
    case controllers_SalaryController_detailsListLector43_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector43_invoker.call(SalaryController_6.detailsListLector(id))
      }
  
    // @LINE:76
    case controllers_Assets_at44_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at44_invoker.call(Assets_13.at(path, file))
      }
  }
}
