
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Mon Mar 20 10:59:45 CET 2017

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
  Application_16: controllers.Application,
  // @LINE:9
  TestController_11: controllers.TestController,
  // @LINE:14
  SalaryController_7: controllers.SalaryController,
  // @LINE:15
  Login_13: controllers.Login,
  // @LINE:17
  Charts_17: controllers.Charts,
  // @LINE:21
  UiElements_10: controllers.UiElements,
  // @LINE:27
  Pages_2: controllers.Pages,
  // @LINE:30
  PersonController_1: controllers.PersonController,
  // @LINE:34
  EmployeesController_12: controllers.EmployeesController,
  // @LINE:38
  SubjectController_18: controllers.SubjectController,
  // @LINE:42
  FieldOfStudyController_5: controllers.FieldOfStudyController,
  // @LINE:46
  StudyGroupsController_3: controllers.StudyGroupsController,
  // @LINE:48
  TableController_8: controllers.TableController,
  // @LINE:51
  SemestersController_14: controllers.SemestersController,
  // @LINE:56
  StudyPlansController_6: controllers.StudyPlansController,
  // @LINE:72
  TeachersController_4: controllers.TeachersController,
  // @LINE:76
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:88
  PrintController_9: controllers.PrintController,
  // @LINE:97
  Assets_15: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_16: controllers.Application,
    // @LINE:9
    TestController_11: controllers.TestController,
    // @LINE:14
    SalaryController_7: controllers.SalaryController,
    // @LINE:15
    Login_13: controllers.Login,
    // @LINE:17
    Charts_17: controllers.Charts,
    // @LINE:21
    UiElements_10: controllers.UiElements,
    // @LINE:27
    Pages_2: controllers.Pages,
    // @LINE:30
    PersonController_1: controllers.PersonController,
    // @LINE:34
    EmployeesController_12: controllers.EmployeesController,
    // @LINE:38
    SubjectController_18: controllers.SubjectController,
    // @LINE:42
    FieldOfStudyController_5: controllers.FieldOfStudyController,
    // @LINE:46
    StudyGroupsController_3: controllers.StudyGroupsController,
    // @LINE:48
    TableController_8: controllers.TableController,
    // @LINE:51
    SemestersController_14: controllers.SemestersController,
    // @LINE:56
    StudyPlansController_6: controllers.StudyPlansController,
    // @LINE:72
    TeachersController_4: controllers.TeachersController,
    // @LINE:76
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:88
    PrintController_9: controllers.PrintController,
    // @LINE:97
    Assets_15: controllers.Assets
  ) = this(errorHandler, Application_16, TestController_11, SalaryController_7, Login_13, Charts_17, UiElements_10, Pages_2, PersonController_1, EmployeesController_12, SubjectController_18, FieldOfStudyController_5, StudyGroupsController_3, TableController_8, SemestersController_14, StudyPlansController_6, TeachersController_4, MethodicsController_0, PrintController_9, Assets_15, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_16, TestController_11, SalaryController_7, Login_13, Charts_17, UiElements_10, Pages_2, PersonController_1, EmployeesController_12, SubjectController_18, FieldOfStudyController_5, StudyGroupsController_3, TableController_8, SemestersController_14, StudyPlansController_6, TeachersController_4, MethodicsController_0, PrintController_9, Assets_15, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.dashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdf""", """controllers.Application.pdf()"""),
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.TestController.test()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test/ok""", """controllers.TestController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kpi""", """controllers.Application.kpiChoosePerson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kpi/k""", """controllers.SalaryController.getPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Login.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """charts/flot""", """controllers.Charts.flot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """charts/morris""", """controllers.Charts.morris()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tables""", """controllers.Application.tables()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studygroups""", """controllers.TableController.listStudyGroups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """semester/add""", """controllers.SemestersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """semester/saved""", """controllers.SemestersController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """semester""", """controllers.TableController.listSemesters()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studyplan/add""", """controllers.StudyPlansController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studyplan/saved""", """controllers.StudyPlansController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """studyplans""", """controllers.TableController.listStudyPlans()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scheduleinweeks""", """controllers.TableController.listScheduleInWeeks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """schedule""", """controllers.TableController.listSchedule()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.TableController.listEmployees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachers""", """controllers.TableController.listTeachers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subjects""", """controllers.TableController.listSubjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields""", """controllers.TableController.listFieldsOfStudy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses""", """controllers.TableController.listCourses()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """currentsemesters""", """controllers.TableController.listCurrentSemesters()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lcsuteos""", """controllers.TableController.listCurrentSemestersUntilTheEndOfStudy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """days""", """controllers.TableController.listDays()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachers/add""", """controllers.TeachersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachers/saved""", """controllers.TeachersController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/add""", """controllers.MethodicsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/saved""", """controllers.MethodicsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """roles""", """controllers.Application.roles()"""),
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
    Application_16.dashboard(),
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
    Application_16.pdf(),
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
    Application_16.index(),
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
  private[this] lazy val controllers_TestController_test3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_TestController_test3_invoker = createInvoker(
    TestController_11.test(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "test",
      Nil,
      "GET",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TestController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/ok")))
  )
  private[this] lazy val controllers_TestController_save4_invoker = createInvoker(
    TestController_11.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """test/ok"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_kpiChoosePerson5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi")))
  )
  private[this] lazy val controllers_Application_kpiChoosePerson5_invoker = createInvoker(
    Application_16.kpiChoosePerson(),
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

  // @LINE:14
  private[this] lazy val controllers_SalaryController_getPerson6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi/k")))
  )
  private[this] lazy val controllers_SalaryController_getPerson6_invoker = createInvoker(
    SalaryController_7.getPerson(),
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

  // @LINE:15
  private[this] lazy val controllers_Login_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_index7_invoker = createInvoker(
    Login_13.index(),
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

  // @LINE:16
  private[this] lazy val controllers_Login_authenticate8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_authenticate8_invoker = createInvoker(
    Login_13.authenticate(),
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

  // @LINE:17
  private[this] lazy val controllers_Charts_flot9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/flot")))
  )
  private[this] lazy val controllers_Charts_flot9_invoker = createInvoker(
    Charts_17.flot(),
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

  // @LINE:18
  private[this] lazy val controllers_Charts_morris10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/morris")))
  )
  private[this] lazy val controllers_Charts_morris10_invoker = createInvoker(
    Charts_17.morris(),
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

  // @LINE:19
  private[this] lazy val controllers_Application_tables11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tables")))
  )
  private[this] lazy val controllers_Application_tables11_invoker = createInvoker(
    Application_16.tables(),
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

  // @LINE:20
  private[this] lazy val controllers_Application_forms12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms12_invoker = createInvoker(
    Application_16.forms(),
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

  // @LINE:21
  private[this] lazy val controllers_UiElements_panelsAndWells13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/panels-and-wells")))
  )
  private[this] lazy val controllers_UiElements_panelsAndWells13_invoker = createInvoker(
    UiElements_10.panelsAndWells(),
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

  // @LINE:22
  private[this] lazy val controllers_UiElements_buttons14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/buttons")))
  )
  private[this] lazy val controllers_UiElements_buttons14_invoker = createInvoker(
    UiElements_10.buttons(),
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

  // @LINE:23
  private[this] lazy val controllers_UiElements_notifications15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/notifications")))
  )
  private[this] lazy val controllers_UiElements_notifications15_invoker = createInvoker(
    UiElements_10.notifications(),
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

  // @LINE:24
  private[this] lazy val controllers_UiElements_typography16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/typography")))
  )
  private[this] lazy val controllers_UiElements_typography16_invoker = createInvoker(
    UiElements_10.typography(),
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

  // @LINE:25
  private[this] lazy val controllers_UiElements_icons17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/icons")))
  )
  private[this] lazy val controllers_UiElements_icons17_invoker = createInvoker(
    UiElements_10.icons(),
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

  // @LINE:26
  private[this] lazy val controllers_UiElements_grid18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/grid")))
  )
  private[this] lazy val controllers_UiElements_grid18_invoker = createInvoker(
    UiElements_10.grid(),
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

  // @LINE:27
  private[this] lazy val controllers_Pages_blank19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pages/blank")))
  )
  private[this] lazy val controllers_Pages_blank19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_PersonController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_PersonController_index20_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_PersonController_save21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/saved")))
  )
  private[this] lazy val controllers_PersonController_save21_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_EmployeesController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index22_invoker = createInvoker(
    EmployeesController_12.index(),
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

  // @LINE:35
  private[this] lazy val controllers_EmployeesController_save23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save23_invoker = createInvoker(
    EmployeesController_12.save(),
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

  // @LINE:38
  private[this] lazy val controllers_SubjectController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index24_invoker = createInvoker(
    SubjectController_18.index(),
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

  // @LINE:39
  private[this] lazy val controllers_SubjectController_save25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save25_invoker = createInvoker(
    SubjectController_18.save(),
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

  // @LINE:42
  private[this] lazy val controllers_FieldOfStudyController_index26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index26_invoker = createInvoker(
    FieldOfStudyController_5.index(),
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

  // @LINE:43
  private[this] lazy val controllers_FieldOfStudyController_save27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save27_invoker = createInvoker(
    FieldOfStudyController_5.save(),
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

  // @LINE:46
  private[this] lazy val controllers_StudyGroupsController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index28_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_StudyGroupsController_save29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save29_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_TableController_listStudyGroups30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups30_invoker = createInvoker(
    TableController_8.listStudyGroups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listStudyGroups",
      Nil,
      "GET",
      """""",
      this.prefix + """studygroups"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_SemestersController_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index31_invoker = createInvoker(
    SemestersController_14.index(),
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

  // @LINE:52
  private[this] lazy val controllers_SemestersController_save32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save32_invoker = createInvoker(
    SemestersController_14.save(),
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

  // @LINE:53
  private[this] lazy val controllers_TableController_listSemesters33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters33_invoker = createInvoker(
    TableController_8.listSemesters(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listSemesters",
      Nil,
      "GET",
      """""",
      this.prefix + """semester"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_StudyPlansController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index34_invoker = createInvoker(
    StudyPlansController_6.index(),
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

  // @LINE:57
  private[this] lazy val controllers_StudyPlansController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save35_invoker = createInvoker(
    StudyPlansController_6.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StudyPlansController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """studyplan/saved"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TableController_listStudyPlans36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans36_invoker = createInvoker(
    TableController_8.listStudyPlans(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listStudyPlans",
      Nil,
      "GET",
      """""",
      this.prefix + """studyplans"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_TableController_listScheduleInWeeks37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks37_invoker = createInvoker(
    TableController_8.listScheduleInWeeks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listScheduleInWeeks",
      Nil,
      "GET",
      """""",
      this.prefix + """scheduleinweeks"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_TableController_listSchedule38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule38_invoker = createInvoker(
    TableController_8.listSchedule(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listSchedule",
      Nil,
      "GET",
      """""",
      this.prefix + """schedule"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_TableController_listEmployees39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees39_invoker = createInvoker(
    TableController_8.listEmployees(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listEmployees",
      Nil,
      "GET",
      """""",
      this.prefix + """employees"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_TableController_listTeachers40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers40_invoker = createInvoker(
    TableController_8.listTeachers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listTeachers",
      Nil,
      "GET",
      """""",
      this.prefix + """teachers"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_TableController_listSubjects41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects41_invoker = createInvoker(
    TableController_8.listSubjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listSubjects",
      Nil,
      "GET",
      """""",
      this.prefix + """subjects"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_TableController_listFieldsOfStudy42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy42_invoker = createInvoker(
    TableController_8.listFieldsOfStudy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listFieldsOfStudy",
      Nil,
      "GET",
      """""",
      this.prefix + """fields"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_TableController_listCourses43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses43_invoker = createInvoker(
    TableController_8.listCourses(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listCourses",
      Nil,
      "GET",
      """""",
      this.prefix + """courses"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_TableController_listCurrentSemesters44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters44_invoker = createInvoker(
    TableController_8.listCurrentSemesters(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listCurrentSemesters",
      Nil,
      "GET",
      """""",
      this.prefix + """currentsemesters"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy45_invoker = createInvoker(
    TableController_8.listCurrentSemestersUntilTheEndOfStudy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listCurrentSemestersUntilTheEndOfStudy",
      Nil,
      "GET",
      """""",
      this.prefix + """lcsuteos"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_TableController_listDays46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays46_invoker = createInvoker(
    TableController_8.listDays(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listDays",
      Nil,
      "GET",
      """""",
      this.prefix + """days"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_TeachersController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index47_invoker = createInvoker(
    TeachersController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """teachers/add"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_TeachersController_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save48_invoker = createInvoker(
    TeachersController_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """teachers/saved"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_MethodicsController_index49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index49_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_MethodicsController_save50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save50_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_Application_roles51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles51_invoker = createInvoker(
    Application_16.roles(),
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

  // @LINE:82
  private[this] lazy val controllers_TableController_listPerson52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson52_invoker = createInvoker(
    TableController_8.listPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listPerson",
      Nil,
      "GET",
      """ Vypsat zákazníky""",
      this.prefix + """users"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Application_logout53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout53_invoker = createInvoker(
    Application_16.logout(),
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

  // @LINE:88
  private[this] lazy val controllers_PrintController_printUserDetails54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails54_invoker = createInvoker(
    PrintController_9.printUserDetails(fakeValue[Long]),
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

  // @LINE:89
  private[this] lazy val controllers_PrintController_detailsList55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList55_invoker = createInvoker(
    PrintController_9.detailsList(fakeValue[Long]),
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

  // @LINE:91
  private[this] lazy val controllers_SalaryController_saveLector56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector56_invoker = createInvoker(
    SalaryController_7.saveLector(),
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

  // @LINE:92
  private[this] lazy val controllers_SalaryController_printLector57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector57_invoker = createInvoker(
    SalaryController_7.printLector(fakeValue[Long]),
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

  // @LINE:93
  private[this] lazy val controllers_SalaryController_detailsListLector58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector58_invoker = createInvoker(
    SalaryController_7.detailsListLector(fakeValue[Long]),
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

  // @LINE:97
  private[this] lazy val controllers_Assets_at59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at59_invoker = createInvoker(
    Assets_15.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_16.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_16.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_16.index())
      }
  
    // @LINE:9
    case controllers_TestController_test3_route(params) =>
      call { 
        controllers_TestController_test3_invoker.call(TestController_11.test())
      }
  
    // @LINE:11
    case controllers_TestController_save4_route(params) =>
      call { 
        controllers_TestController_save4_invoker.call(TestController_11.save())
      }
  
    // @LINE:13
    case controllers_Application_kpiChoosePerson5_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson5_invoker.call(Application_16.kpiChoosePerson())
      }
  
    // @LINE:14
    case controllers_SalaryController_getPerson6_route(params) =>
      call { 
        controllers_SalaryController_getPerson6_invoker.call(SalaryController_7.getPerson())
      }
  
    // @LINE:15
    case controllers_Login_index7_route(params) =>
      call { 
        controllers_Login_index7_invoker.call(Login_13.index())
      }
  
    // @LINE:16
    case controllers_Login_authenticate8_route(params) =>
      call { 
        controllers_Login_authenticate8_invoker.call(Login_13.authenticate())
      }
  
    // @LINE:17
    case controllers_Charts_flot9_route(params) =>
      call { 
        controllers_Charts_flot9_invoker.call(Charts_17.flot())
      }
  
    // @LINE:18
    case controllers_Charts_morris10_route(params) =>
      call { 
        controllers_Charts_morris10_invoker.call(Charts_17.morris())
      }
  
    // @LINE:19
    case controllers_Application_tables11_route(params) =>
      call { 
        controllers_Application_tables11_invoker.call(Application_16.tables())
      }
  
    // @LINE:20
    case controllers_Application_forms12_route(params) =>
      call { 
        controllers_Application_forms12_invoker.call(Application_16.forms())
      }
  
    // @LINE:21
    case controllers_UiElements_panelsAndWells13_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells13_invoker.call(UiElements_10.panelsAndWells())
      }
  
    // @LINE:22
    case controllers_UiElements_buttons14_route(params) =>
      call { 
        controllers_UiElements_buttons14_invoker.call(UiElements_10.buttons())
      }
  
    // @LINE:23
    case controllers_UiElements_notifications15_route(params) =>
      call { 
        controllers_UiElements_notifications15_invoker.call(UiElements_10.notifications())
      }
  
    // @LINE:24
    case controllers_UiElements_typography16_route(params) =>
      call { 
        controllers_UiElements_typography16_invoker.call(UiElements_10.typography())
      }
  
    // @LINE:25
    case controllers_UiElements_icons17_route(params) =>
      call { 
        controllers_UiElements_icons17_invoker.call(UiElements_10.icons())
      }
  
    // @LINE:26
    case controllers_UiElements_grid18_route(params) =>
      call { 
        controllers_UiElements_grid18_invoker.call(UiElements_10.grid())
      }
  
    // @LINE:27
    case controllers_Pages_blank19_route(params) =>
      call { 
        controllers_Pages_blank19_invoker.call(Pages_2.blank())
      }
  
    // @LINE:30
    case controllers_PersonController_index20_route(params) =>
      call { 
        controllers_PersonController_index20_invoker.call(PersonController_1.index())
      }
  
    // @LINE:31
    case controllers_PersonController_save21_route(params) =>
      call { 
        controllers_PersonController_save21_invoker.call(PersonController_1.save())
      }
  
    // @LINE:34
    case controllers_EmployeesController_index22_route(params) =>
      call { 
        controllers_EmployeesController_index22_invoker.call(EmployeesController_12.index())
      }
  
    // @LINE:35
    case controllers_EmployeesController_save23_route(params) =>
      call { 
        controllers_EmployeesController_save23_invoker.call(EmployeesController_12.save())
      }
  
    // @LINE:38
    case controllers_SubjectController_index24_route(params) =>
      call { 
        controllers_SubjectController_index24_invoker.call(SubjectController_18.index())
      }
  
    // @LINE:39
    case controllers_SubjectController_save25_route(params) =>
      call { 
        controllers_SubjectController_save25_invoker.call(SubjectController_18.save())
      }
  
    // @LINE:42
    case controllers_FieldOfStudyController_index26_route(params) =>
      call { 
        controllers_FieldOfStudyController_index26_invoker.call(FieldOfStudyController_5.index())
      }
  
    // @LINE:43
    case controllers_FieldOfStudyController_save27_route(params) =>
      call { 
        controllers_FieldOfStudyController_save27_invoker.call(FieldOfStudyController_5.save())
      }
  
    // @LINE:46
    case controllers_StudyGroupsController_index28_route(params) =>
      call { 
        controllers_StudyGroupsController_index28_invoker.call(StudyGroupsController_3.index())
      }
  
    // @LINE:47
    case controllers_StudyGroupsController_save29_route(params) =>
      call { 
        controllers_StudyGroupsController_save29_invoker.call(StudyGroupsController_3.save())
      }
  
    // @LINE:48
    case controllers_TableController_listStudyGroups30_route(params) =>
      call { 
        controllers_TableController_listStudyGroups30_invoker.call(TableController_8.listStudyGroups())
      }
  
    // @LINE:51
    case controllers_SemestersController_index31_route(params) =>
      call { 
        controllers_SemestersController_index31_invoker.call(SemestersController_14.index())
      }
  
    // @LINE:52
    case controllers_SemestersController_save32_route(params) =>
      call { 
        controllers_SemestersController_save32_invoker.call(SemestersController_14.save())
      }
  
    // @LINE:53
    case controllers_TableController_listSemesters33_route(params) =>
      call { 
        controllers_TableController_listSemesters33_invoker.call(TableController_8.listSemesters())
      }
  
    // @LINE:56
    case controllers_StudyPlansController_index34_route(params) =>
      call { 
        controllers_StudyPlansController_index34_invoker.call(StudyPlansController_6.index())
      }
  
    // @LINE:57
    case controllers_StudyPlansController_save35_route(params) =>
      call { 
        controllers_StudyPlansController_save35_invoker.call(StudyPlansController_6.save())
      }
  
    // @LINE:58
    case controllers_TableController_listStudyPlans36_route(params) =>
      call { 
        controllers_TableController_listStudyPlans36_invoker.call(TableController_8.listStudyPlans())
      }
  
    // @LINE:60
    case controllers_TableController_listScheduleInWeeks37_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks37_invoker.call(TableController_8.listScheduleInWeeks())
      }
  
    // @LINE:62
    case controllers_TableController_listSchedule38_route(params) =>
      call { 
        controllers_TableController_listSchedule38_invoker.call(TableController_8.listSchedule())
      }
  
    // @LINE:63
    case controllers_TableController_listEmployees39_route(params) =>
      call { 
        controllers_TableController_listEmployees39_invoker.call(TableController_8.listEmployees())
      }
  
    // @LINE:64
    case controllers_TableController_listTeachers40_route(params) =>
      call { 
        controllers_TableController_listTeachers40_invoker.call(TableController_8.listTeachers())
      }
  
    // @LINE:65
    case controllers_TableController_listSubjects41_route(params) =>
      call { 
        controllers_TableController_listSubjects41_invoker.call(TableController_8.listSubjects())
      }
  
    // @LINE:66
    case controllers_TableController_listFieldsOfStudy42_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy42_invoker.call(TableController_8.listFieldsOfStudy())
      }
  
    // @LINE:67
    case controllers_TableController_listCourses43_route(params) =>
      call { 
        controllers_TableController_listCourses43_invoker.call(TableController_8.listCourses())
      }
  
    // @LINE:68
    case controllers_TableController_listCurrentSemesters44_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters44_invoker.call(TableController_8.listCurrentSemesters())
      }
  
    // @LINE:69
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy45_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy45_invoker.call(TableController_8.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:70
    case controllers_TableController_listDays46_route(params) =>
      call { 
        controllers_TableController_listDays46_invoker.call(TableController_8.listDays())
      }
  
    // @LINE:72
    case controllers_TeachersController_index47_route(params) =>
      call { 
        controllers_TeachersController_index47_invoker.call(TeachersController_4.index())
      }
  
    // @LINE:73
    case controllers_TeachersController_save48_route(params) =>
      call { 
        controllers_TeachersController_save48_invoker.call(TeachersController_4.save())
      }
  
    // @LINE:76
    case controllers_MethodicsController_index49_route(params) =>
      call { 
        controllers_MethodicsController_index49_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:77
    case controllers_MethodicsController_save50_route(params) =>
      call { 
        controllers_MethodicsController_save50_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:79
    case controllers_Application_roles51_route(params) =>
      call { 
        controllers_Application_roles51_invoker.call(Application_16.roles())
      }
  
    // @LINE:82
    case controllers_TableController_listPerson52_route(params) =>
      call { 
        controllers_TableController_listPerson52_invoker.call(TableController_8.listPerson())
      }
  
    // @LINE:85
    case controllers_Application_logout53_route(params) =>
      call { 
        controllers_Application_logout53_invoker.call(Application_16.logout())
      }
  
    // @LINE:88
    case controllers_PrintController_printUserDetails54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails54_invoker.call(PrintController_9.printUserDetails(id))
      }
  
    // @LINE:89
    case controllers_PrintController_detailsList55_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList55_invoker.call(PrintController_9.detailsList(id))
      }
  
    // @LINE:91
    case controllers_SalaryController_saveLector56_route(params) =>
      call { 
        controllers_SalaryController_saveLector56_invoker.call(SalaryController_7.saveLector())
      }
  
    // @LINE:92
    case controllers_SalaryController_printLector57_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector57_invoker.call(SalaryController_7.printLector(id))
      }
  
    // @LINE:93
    case controllers_SalaryController_detailsListLector58_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector58_invoker.call(SalaryController_7.detailsListLector(id))
      }
  
    // @LINE:97
    case controllers_Assets_at59_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at59_invoker.call(Assets_15.at(path, file))
      }
  }
}
