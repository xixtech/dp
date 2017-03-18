
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat Mar 18 11:21:59 CET 2017

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
  Application_15: controllers.Application,
  // @LINE:10
  SalaryController_7: controllers.SalaryController,
  // @LINE:11
  Login_12: controllers.Login,
  // @LINE:13
  Charts_16: controllers.Charts,
  // @LINE:17
  UiElements_10: controllers.UiElements,
  // @LINE:23
  Pages_2: controllers.Pages,
  // @LINE:26
  PersonController_1: controllers.PersonController,
  // @LINE:30
  EmployeesController_11: controllers.EmployeesController,
  // @LINE:34
  SubjectController_17: controllers.SubjectController,
  // @LINE:38
  FieldOfStudyController_5: controllers.FieldOfStudyController,
  // @LINE:42
  StudyGroupsController_3: controllers.StudyGroupsController,
  // @LINE:44
  TableController_8: controllers.TableController,
  // @LINE:47
  SemestersController_13: controllers.SemestersController,
  // @LINE:52
  StudyPlansController_6: controllers.StudyPlansController,
  // @LINE:68
  TeachersController_4: controllers.TeachersController,
  // @LINE:72
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:84
  PrintController_9: controllers.PrintController,
  // @LINE:93
  Assets_14: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_15: controllers.Application,
    // @LINE:10
    SalaryController_7: controllers.SalaryController,
    // @LINE:11
    Login_12: controllers.Login,
    // @LINE:13
    Charts_16: controllers.Charts,
    // @LINE:17
    UiElements_10: controllers.UiElements,
    // @LINE:23
    Pages_2: controllers.Pages,
    // @LINE:26
    PersonController_1: controllers.PersonController,
    // @LINE:30
    EmployeesController_11: controllers.EmployeesController,
    // @LINE:34
    SubjectController_17: controllers.SubjectController,
    // @LINE:38
    FieldOfStudyController_5: controllers.FieldOfStudyController,
    // @LINE:42
    StudyGroupsController_3: controllers.StudyGroupsController,
    // @LINE:44
    TableController_8: controllers.TableController,
    // @LINE:47
    SemestersController_13: controllers.SemestersController,
    // @LINE:52
    StudyPlansController_6: controllers.StudyPlansController,
    // @LINE:68
    TeachersController_4: controllers.TeachersController,
    // @LINE:72
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:84
    PrintController_9: controllers.PrintController,
    // @LINE:93
    Assets_14: controllers.Assets
  ) = this(errorHandler, Application_15, SalaryController_7, Login_12, Charts_16, UiElements_10, Pages_2, PersonController_1, EmployeesController_11, SubjectController_17, FieldOfStudyController_5, StudyGroupsController_3, TableController_8, SemestersController_13, StudyPlansController_6, TeachersController_4, MethodicsController_0, PrintController_9, Assets_14, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_15, SalaryController_7, Login_12, Charts_16, UiElements_10, Pages_2, PersonController_1, EmployeesController_11, SubjectController_17, FieldOfStudyController_5, StudyGroupsController_3, TableController_8, SemestersController_13, StudyPlansController_6, TeachersController_4, MethodicsController_0, PrintController_9, Assets_14, prefix)
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
    Application_15.dashboard(),
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
    Application_15.pdf(),
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
    Application_15.index(),
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
    Application_15.kpiChoosePerson(),
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

  // @LINE:11
  private[this] lazy val controllers_Login_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_index5_invoker = createInvoker(
    Login_12.index(),
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
    Login_12.authenticate(),
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
    Charts_16.flot(),
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
    Charts_16.morris(),
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
    Application_15.tables(),
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
  private[this] lazy val controllers_Application_forms10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms10_invoker = createInvoker(
    Application_15.forms(),
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

  // @LINE:17
  private[this] lazy val controllers_UiElements_panelsAndWells11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/panels-and-wells")))
  )
  private[this] lazy val controllers_UiElements_panelsAndWells11_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_UiElements_buttons12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/buttons")))
  )
  private[this] lazy val controllers_UiElements_buttons12_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_UiElements_notifications13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/notifications")))
  )
  private[this] lazy val controllers_UiElements_notifications13_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_UiElements_typography14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/typography")))
  )
  private[this] lazy val controllers_UiElements_typography14_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_UiElements_icons15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/icons")))
  )
  private[this] lazy val controllers_UiElements_icons15_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_UiElements_grid16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/grid")))
  )
  private[this] lazy val controllers_UiElements_grid16_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Pages_blank17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pages/blank")))
  )
  private[this] lazy val controllers_Pages_blank17_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_PersonController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_PersonController_index18_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_PersonController_save19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/saved")))
  )
  private[this] lazy val controllers_PersonController_save19_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_EmployeesController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index20_invoker = createInvoker(
    EmployeesController_11.index(),
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

  // @LINE:31
  private[this] lazy val controllers_EmployeesController_save21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save21_invoker = createInvoker(
    EmployeesController_11.save(),
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

  // @LINE:34
  private[this] lazy val controllers_SubjectController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index22_invoker = createInvoker(
    SubjectController_17.index(),
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

  // @LINE:35
  private[this] lazy val controllers_SubjectController_save23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save23_invoker = createInvoker(
    SubjectController_17.save(),
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

  // @LINE:38
  private[this] lazy val controllers_FieldOfStudyController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index24_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_FieldOfStudyController_save25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save25_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_StudyGroupsController_index26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index26_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_StudyGroupsController_save27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save27_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_TableController_listStudyGroups28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups28_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_SemestersController_index29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index29_invoker = createInvoker(
    SemestersController_13.index(),
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
    SemestersController_13.save(),
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

  // @LINE:49
  private[this] lazy val controllers_TableController_listSemesters31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters31_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_StudyPlansController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index32_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_StudyPlansController_save33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save33_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_TableController_listStudyPlans34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans34_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_TableController_listScheduleInWeeks35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks35_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_TableController_listSchedule36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule36_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_TableController_listEmployees37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees37_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_TableController_listTeachers38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers38_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_TableController_listSubjects39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects39_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_TableController_listFieldsOfStudy40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy40_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_TableController_listCourses41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses41_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_TableController_listCurrentSemesters42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters42_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy43_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_TableController_listDays44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays44_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_TeachersController_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index45_invoker = createInvoker(
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

  // @LINE:69
  private[this] lazy val controllers_TeachersController_save46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save46_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_MethodicsController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index47_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_MethodicsController_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save48_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_Application_roles49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles49_invoker = createInvoker(
    Application_15.roles(),
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

  // @LINE:78
  private[this] lazy val controllers_TableController_listPerson50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson50_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_Application_logout51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout51_invoker = createInvoker(
    Application_15.logout(),
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

  // @LINE:84
  private[this] lazy val controllers_PrintController_printUserDetails52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails52_invoker = createInvoker(
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

  // @LINE:85
  private[this] lazy val controllers_PrintController_detailsList53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList53_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val controllers_SalaryController_saveLector54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector54_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val controllers_SalaryController_printLector55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector55_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_SalaryController_detailsListLector56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector56_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_Assets_at57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at57_invoker = createInvoker(
    Assets_14.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_15.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_15.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_15.index())
      }
  
    // @LINE:9
    case controllers_Application_kpiChoosePerson3_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson3_invoker.call(Application_15.kpiChoosePerson())
      }
  
    // @LINE:10
    case controllers_SalaryController_getPerson4_route(params) =>
      call { 
        controllers_SalaryController_getPerson4_invoker.call(SalaryController_7.getPerson())
      }
  
    // @LINE:11
    case controllers_Login_index5_route(params) =>
      call { 
        controllers_Login_index5_invoker.call(Login_12.index())
      }
  
    // @LINE:12
    case controllers_Login_authenticate6_route(params) =>
      call { 
        controllers_Login_authenticate6_invoker.call(Login_12.authenticate())
      }
  
    // @LINE:13
    case controllers_Charts_flot7_route(params) =>
      call { 
        controllers_Charts_flot7_invoker.call(Charts_16.flot())
      }
  
    // @LINE:14
    case controllers_Charts_morris8_route(params) =>
      call { 
        controllers_Charts_morris8_invoker.call(Charts_16.morris())
      }
  
    // @LINE:15
    case controllers_Application_tables9_route(params) =>
      call { 
        controllers_Application_tables9_invoker.call(Application_15.tables())
      }
  
    // @LINE:16
    case controllers_Application_forms10_route(params) =>
      call { 
        controllers_Application_forms10_invoker.call(Application_15.forms())
      }
  
    // @LINE:17
    case controllers_UiElements_panelsAndWells11_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells11_invoker.call(UiElements_10.panelsAndWells())
      }
  
    // @LINE:18
    case controllers_UiElements_buttons12_route(params) =>
      call { 
        controllers_UiElements_buttons12_invoker.call(UiElements_10.buttons())
      }
  
    // @LINE:19
    case controllers_UiElements_notifications13_route(params) =>
      call { 
        controllers_UiElements_notifications13_invoker.call(UiElements_10.notifications())
      }
  
    // @LINE:20
    case controllers_UiElements_typography14_route(params) =>
      call { 
        controllers_UiElements_typography14_invoker.call(UiElements_10.typography())
      }
  
    // @LINE:21
    case controllers_UiElements_icons15_route(params) =>
      call { 
        controllers_UiElements_icons15_invoker.call(UiElements_10.icons())
      }
  
    // @LINE:22
    case controllers_UiElements_grid16_route(params) =>
      call { 
        controllers_UiElements_grid16_invoker.call(UiElements_10.grid())
      }
  
    // @LINE:23
    case controllers_Pages_blank17_route(params) =>
      call { 
        controllers_Pages_blank17_invoker.call(Pages_2.blank())
      }
  
    // @LINE:26
    case controllers_PersonController_index18_route(params) =>
      call { 
        controllers_PersonController_index18_invoker.call(PersonController_1.index())
      }
  
    // @LINE:27
    case controllers_PersonController_save19_route(params) =>
      call { 
        controllers_PersonController_save19_invoker.call(PersonController_1.save())
      }
  
    // @LINE:30
    case controllers_EmployeesController_index20_route(params) =>
      call { 
        controllers_EmployeesController_index20_invoker.call(EmployeesController_11.index())
      }
  
    // @LINE:31
    case controllers_EmployeesController_save21_route(params) =>
      call { 
        controllers_EmployeesController_save21_invoker.call(EmployeesController_11.save())
      }
  
    // @LINE:34
    case controllers_SubjectController_index22_route(params) =>
      call { 
        controllers_SubjectController_index22_invoker.call(SubjectController_17.index())
      }
  
    // @LINE:35
    case controllers_SubjectController_save23_route(params) =>
      call { 
        controllers_SubjectController_save23_invoker.call(SubjectController_17.save())
      }
  
    // @LINE:38
    case controllers_FieldOfStudyController_index24_route(params) =>
      call { 
        controllers_FieldOfStudyController_index24_invoker.call(FieldOfStudyController_5.index())
      }
  
    // @LINE:39
    case controllers_FieldOfStudyController_save25_route(params) =>
      call { 
        controllers_FieldOfStudyController_save25_invoker.call(FieldOfStudyController_5.save())
      }
  
    // @LINE:42
    case controllers_StudyGroupsController_index26_route(params) =>
      call { 
        controllers_StudyGroupsController_index26_invoker.call(StudyGroupsController_3.index())
      }
  
    // @LINE:43
    case controllers_StudyGroupsController_save27_route(params) =>
      call { 
        controllers_StudyGroupsController_save27_invoker.call(StudyGroupsController_3.save())
      }
  
    // @LINE:44
    case controllers_TableController_listStudyGroups28_route(params) =>
      call { 
        controllers_TableController_listStudyGroups28_invoker.call(TableController_8.listStudyGroups())
      }
  
    // @LINE:47
    case controllers_SemestersController_index29_route(params) =>
      call { 
        controllers_SemestersController_index29_invoker.call(SemestersController_13.index())
      }
  
    // @LINE:48
    case controllers_SemestersController_save30_route(params) =>
      call { 
        controllers_SemestersController_save30_invoker.call(SemestersController_13.save())
      }
  
    // @LINE:49
    case controllers_TableController_listSemesters31_route(params) =>
      call { 
        controllers_TableController_listSemesters31_invoker.call(TableController_8.listSemesters())
      }
  
    // @LINE:52
    case controllers_StudyPlansController_index32_route(params) =>
      call { 
        controllers_StudyPlansController_index32_invoker.call(StudyPlansController_6.index())
      }
  
    // @LINE:53
    case controllers_StudyPlansController_save33_route(params) =>
      call { 
        controllers_StudyPlansController_save33_invoker.call(StudyPlansController_6.save())
      }
  
    // @LINE:54
    case controllers_TableController_listStudyPlans34_route(params) =>
      call { 
        controllers_TableController_listStudyPlans34_invoker.call(TableController_8.listStudyPlans())
      }
  
    // @LINE:56
    case controllers_TableController_listScheduleInWeeks35_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks35_invoker.call(TableController_8.listScheduleInWeeks())
      }
  
    // @LINE:58
    case controllers_TableController_listSchedule36_route(params) =>
      call { 
        controllers_TableController_listSchedule36_invoker.call(TableController_8.listSchedule())
      }
  
    // @LINE:59
    case controllers_TableController_listEmployees37_route(params) =>
      call { 
        controllers_TableController_listEmployees37_invoker.call(TableController_8.listEmployees())
      }
  
    // @LINE:60
    case controllers_TableController_listTeachers38_route(params) =>
      call { 
        controllers_TableController_listTeachers38_invoker.call(TableController_8.listTeachers())
      }
  
    // @LINE:61
    case controllers_TableController_listSubjects39_route(params) =>
      call { 
        controllers_TableController_listSubjects39_invoker.call(TableController_8.listSubjects())
      }
  
    // @LINE:62
    case controllers_TableController_listFieldsOfStudy40_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy40_invoker.call(TableController_8.listFieldsOfStudy())
      }
  
    // @LINE:63
    case controllers_TableController_listCourses41_route(params) =>
      call { 
        controllers_TableController_listCourses41_invoker.call(TableController_8.listCourses())
      }
  
    // @LINE:64
    case controllers_TableController_listCurrentSemesters42_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters42_invoker.call(TableController_8.listCurrentSemesters())
      }
  
    // @LINE:65
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy43_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy43_invoker.call(TableController_8.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:66
    case controllers_TableController_listDays44_route(params) =>
      call { 
        controllers_TableController_listDays44_invoker.call(TableController_8.listDays())
      }
  
    // @LINE:68
    case controllers_TeachersController_index45_route(params) =>
      call { 
        controllers_TeachersController_index45_invoker.call(TeachersController_4.index())
      }
  
    // @LINE:69
    case controllers_TeachersController_save46_route(params) =>
      call { 
        controllers_TeachersController_save46_invoker.call(TeachersController_4.save())
      }
  
    // @LINE:72
    case controllers_MethodicsController_index47_route(params) =>
      call { 
        controllers_MethodicsController_index47_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:73
    case controllers_MethodicsController_save48_route(params) =>
      call { 
        controllers_MethodicsController_save48_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:75
    case controllers_Application_roles49_route(params) =>
      call { 
        controllers_Application_roles49_invoker.call(Application_15.roles())
      }
  
    // @LINE:78
    case controllers_TableController_listPerson50_route(params) =>
      call { 
        controllers_TableController_listPerson50_invoker.call(TableController_8.listPerson())
      }
  
    // @LINE:81
    case controllers_Application_logout51_route(params) =>
      call { 
        controllers_Application_logout51_invoker.call(Application_15.logout())
      }
  
    // @LINE:84
    case controllers_PrintController_printUserDetails52_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails52_invoker.call(PrintController_9.printUserDetails(id))
      }
  
    // @LINE:85
    case controllers_PrintController_detailsList53_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList53_invoker.call(PrintController_9.detailsList(id))
      }
  
    // @LINE:87
    case controllers_SalaryController_saveLector54_route(params) =>
      call { 
        controllers_SalaryController_saveLector54_invoker.call(SalaryController_7.saveLector())
      }
  
    // @LINE:88
    case controllers_SalaryController_printLector55_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector55_invoker.call(SalaryController_7.printLector(id))
      }
  
    // @LINE:89
    case controllers_SalaryController_detailsListLector56_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector56_invoker.call(SalaryController_7.detailsListLector(id))
      }
  
    // @LINE:93
    case controllers_Assets_at57_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at57_invoker.call(Assets_14.at(path, file))
      }
  }
}
