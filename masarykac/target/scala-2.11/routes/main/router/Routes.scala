
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat Mar 25 19:19:56 CET 2017

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
  Application_23: controllers.Application,
  // @LINE:9
  TestController_18: controllers.TestController,
  // @LINE:14
  SalaryController_14: controllers.SalaryController,
  // @LINE:15
  Login_20: controllers.Login,
  // @LINE:17
  Charts_24: controllers.Charts,
  // @LINE:21
  UiElements_17: controllers.UiElements,
  // @LINE:27
  Pages_4: controllers.Pages,
  // @LINE:30
  PersonController_2: controllers.PersonController,
  // @LINE:33
  VisitsController_1: controllers.VisitsController,
  // @LINE:36
  ProjectController_13: controllers.ProjectController,
  // @LINE:39
  FinalWorksController_5: controllers.FinalWorksController,
  // @LINE:42
  PublicationsController_7: controllers.PublicationsController,
  // @LINE:45
  OrganizationalUnitsController_11: controllers.OrganizationalUnitsController,
  // @LINE:49
  EmployeesController_19: controllers.EmployeesController,
  // @LINE:53
  SubjectController_25: controllers.SubjectController,
  // @LINE:57
  FieldOfStudyController_10: controllers.FieldOfStudyController,
  // @LINE:61
  StudyGroupsController_6: controllers.StudyGroupsController,
  // @LINE:63
  TableController_15: controllers.TableController,
  // @LINE:66
  SemestersController_21: controllers.SemestersController,
  // @LINE:71
  StudyPlansController_12: controllers.StudyPlansController,
  // @LINE:75
  CourseController_3: controllers.CourseController,
  // @LINE:90
  TeachersController_8: controllers.TeachersController,
  // @LINE:94
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:102
  SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
  // @LINE:109
  PrintController_16: controllers.PrintController,
  // @LINE:118
  Assets_22: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_23: controllers.Application,
    // @LINE:9
    TestController_18: controllers.TestController,
    // @LINE:14
    SalaryController_14: controllers.SalaryController,
    // @LINE:15
    Login_20: controllers.Login,
    // @LINE:17
    Charts_24: controllers.Charts,
    // @LINE:21
    UiElements_17: controllers.UiElements,
    // @LINE:27
    Pages_4: controllers.Pages,
    // @LINE:30
    PersonController_2: controllers.PersonController,
    // @LINE:33
    VisitsController_1: controllers.VisitsController,
    // @LINE:36
    ProjectController_13: controllers.ProjectController,
    // @LINE:39
    FinalWorksController_5: controllers.FinalWorksController,
    // @LINE:42
    PublicationsController_7: controllers.PublicationsController,
    // @LINE:45
    OrganizationalUnitsController_11: controllers.OrganizationalUnitsController,
    // @LINE:49
    EmployeesController_19: controllers.EmployeesController,
    // @LINE:53
    SubjectController_25: controllers.SubjectController,
    // @LINE:57
    FieldOfStudyController_10: controllers.FieldOfStudyController,
    // @LINE:61
    StudyGroupsController_6: controllers.StudyGroupsController,
    // @LINE:63
    TableController_15: controllers.TableController,
    // @LINE:66
    SemestersController_21: controllers.SemestersController,
    // @LINE:71
    StudyPlansController_12: controllers.StudyPlansController,
    // @LINE:75
    CourseController_3: controllers.CourseController,
    // @LINE:90
    TeachersController_8: controllers.TeachersController,
    // @LINE:94
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:102
    SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
    // @LINE:109
    PrintController_16: controllers.PrintController,
    // @LINE:118
    Assets_22: controllers.Assets
  ) = this(errorHandler, Application_23, TestController_18, SalaryController_14, Login_20, Charts_24, UiElements_17, Pages_4, PersonController_2, VisitsController_1, ProjectController_13, FinalWorksController_5, PublicationsController_7, OrganizationalUnitsController_11, EmployeesController_19, SubjectController_25, FieldOfStudyController_10, StudyGroupsController_6, TableController_15, SemestersController_21, StudyPlansController_12, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_16, Assets_22, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_23, TestController_18, SalaryController_14, Login_20, Charts_24, UiElements_17, Pages_4, PersonController_2, VisitsController_1, ProjectController_13, FinalWorksController_5, PublicationsController_7, OrganizationalUnitsController_11, EmployeesController_19, SubjectController_25, FieldOfStudyController_10, StudyGroupsController_6, TableController_15, SemestersController_21, StudyPlansController_12, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_16, Assets_22, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visit/register""", """controllers.VisitsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """visit/saved""", """controllers.VisitsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/register""", """controllers.ProjectController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/saved""", """controllers.ProjectController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finalwork/register""", """controllers.FinalWorksController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finalwork/saved""", """controllers.FinalWorksController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publication/register""", """controllers.PublicationsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publication/saved""", """controllers.PublicationsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ou/register""", """controllers.OrganizationalUnitsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ou/saved""", """controllers.OrganizationalUnitsController.save()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses/add""", """controllers.CourseController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses/saved""", """controllers.CourseController.save()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sub/add""", """controllers.SubjectPlanTeachingController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sub/saved""", """controllers.SubjectPlanTeachingController.save()"""),
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
    Application_23.dashboard(),
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
    Application_23.pdf(),
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
    Application_23.index(),
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
    TestController_18.test(),
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
    TestController_18.save(),
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
    Application_23.kpiChoosePerson(),
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
    SalaryController_14.getPerson(),
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
    Login_20.index(),
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
    Login_20.authenticate(),
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
    Charts_24.flot(),
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
    Charts_24.morris(),
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
    Application_23.tables(),
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
    Application_23.forms(),
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
    UiElements_17.panelsAndWells(),
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
    UiElements_17.buttons(),
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
    UiElements_17.notifications(),
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
    UiElements_17.typography(),
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
    UiElements_17.icons(),
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
    UiElements_17.grid(),
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
    Pages_4.blank(),
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
    PersonController_2.index(),
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
    PersonController_2.save(),
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

  // @LINE:33
  private[this] lazy val controllers_VisitsController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visit/register")))
  )
  private[this] lazy val controllers_VisitsController_index22_invoker = createInvoker(
    VisitsController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """visit/register"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_VisitsController_save23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visit/saved")))
  )
  private[this] lazy val controllers_VisitsController_save23_invoker = createInvoker(
    VisitsController_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VisitsController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """visit/saved"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ProjectController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/register")))
  )
  private[this] lazy val controllers_ProjectController_index24_invoker = createInvoker(
    ProjectController_13.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """project/register"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ProjectController_save25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/saved")))
  )
  private[this] lazy val controllers_ProjectController_save25_invoker = createInvoker(
    ProjectController_13.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """project/saved"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_FinalWorksController_index26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/register")))
  )
  private[this] lazy val controllers_FinalWorksController_index26_invoker = createInvoker(
    FinalWorksController_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FinalWorksController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """finalwork/register"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_FinalWorksController_save27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/saved")))
  )
  private[this] lazy val controllers_FinalWorksController_save27_invoker = createInvoker(
    FinalWorksController_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FinalWorksController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """finalwork/saved"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_PublicationsController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/register")))
  )
  private[this] lazy val controllers_PublicationsController_index28_invoker = createInvoker(
    PublicationsController_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicationsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """publication/register"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_PublicationsController_save29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/saved")))
  )
  private[this] lazy val controllers_PublicationsController_save29_invoker = createInvoker(
    PublicationsController_7.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PublicationsController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """publication/saved"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_OrganizationalUnitsController_index30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_index30_invoker = createInvoker(
    OrganizationalUnitsController_11.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationalUnitsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """ou/register"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_OrganizationalUnitsController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_save31_invoker = createInvoker(
    OrganizationalUnitsController_11.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationalUnitsController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """ou/saved"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_EmployeesController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index32_invoker = createInvoker(
    EmployeesController_19.index(),
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

  // @LINE:50
  private[this] lazy val controllers_EmployeesController_save33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save33_invoker = createInvoker(
    EmployeesController_19.save(),
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

  // @LINE:53
  private[this] lazy val controllers_SubjectController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index34_invoker = createInvoker(
    SubjectController_25.index(),
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

  // @LINE:54
  private[this] lazy val controllers_SubjectController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save35_invoker = createInvoker(
    SubjectController_25.save(),
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

  // @LINE:57
  private[this] lazy val controllers_FieldOfStudyController_index36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index36_invoker = createInvoker(
    FieldOfStudyController_10.index(),
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

  // @LINE:58
  private[this] lazy val controllers_FieldOfStudyController_save37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save37_invoker = createInvoker(
    FieldOfStudyController_10.save(),
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

  // @LINE:61
  private[this] lazy val controllers_StudyGroupsController_index38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index38_invoker = createInvoker(
    StudyGroupsController_6.index(),
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

  // @LINE:62
  private[this] lazy val controllers_StudyGroupsController_save39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save39_invoker = createInvoker(
    StudyGroupsController_6.save(),
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

  // @LINE:63
  private[this] lazy val controllers_TableController_listStudyGroups40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups40_invoker = createInvoker(
    TableController_15.listStudyGroups(),
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

  // @LINE:66
  private[this] lazy val controllers_SemestersController_index41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index41_invoker = createInvoker(
    SemestersController_21.index(),
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

  // @LINE:67
  private[this] lazy val controllers_SemestersController_save42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save42_invoker = createInvoker(
    SemestersController_21.save(),
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

  // @LINE:68
  private[this] lazy val controllers_TableController_listSemesters43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters43_invoker = createInvoker(
    TableController_15.listSemesters(),
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

  // @LINE:71
  private[this] lazy val controllers_StudyPlansController_index44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index44_invoker = createInvoker(
    StudyPlansController_12.index(),
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

  // @LINE:72
  private[this] lazy val controllers_StudyPlansController_save45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save45_invoker = createInvoker(
    StudyPlansController_12.save(),
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

  // @LINE:73
  private[this] lazy val controllers_TableController_listStudyPlans46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans46_invoker = createInvoker(
    TableController_15.listStudyPlans(),
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

  // @LINE:75
  private[this] lazy val controllers_CourseController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index47_invoker = createInvoker(
    CourseController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """courses/add"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_CourseController_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save48_invoker = createInvoker(
    CourseController_3.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """courses/saved"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_TableController_listScheduleInWeeks49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks49_invoker = createInvoker(
    TableController_15.listScheduleInWeeks(),
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

  // @LINE:80
  private[this] lazy val controllers_TableController_listSchedule50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule50_invoker = createInvoker(
    TableController_15.listSchedule(),
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

  // @LINE:81
  private[this] lazy val controllers_TableController_listEmployees51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees51_invoker = createInvoker(
    TableController_15.listEmployees(),
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

  // @LINE:82
  private[this] lazy val controllers_TableController_listTeachers52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers52_invoker = createInvoker(
    TableController_15.listTeachers(),
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

  // @LINE:83
  private[this] lazy val controllers_TableController_listSubjects53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects53_invoker = createInvoker(
    TableController_15.listSubjects(),
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

  // @LINE:84
  private[this] lazy val controllers_TableController_listFieldsOfStudy54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy54_invoker = createInvoker(
    TableController_15.listFieldsOfStudy(),
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

  // @LINE:85
  private[this] lazy val controllers_TableController_listCourses55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses55_invoker = createInvoker(
    TableController_15.listCourses(),
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

  // @LINE:86
  private[this] lazy val controllers_TableController_listCurrentSemesters56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters56_invoker = createInvoker(
    TableController_15.listCurrentSemesters(),
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

  // @LINE:87
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy57_invoker = createInvoker(
    TableController_15.listCurrentSemestersUntilTheEndOfStudy(),
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

  // @LINE:88
  private[this] lazy val controllers_TableController_listDays58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays58_invoker = createInvoker(
    TableController_15.listDays(),
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

  // @LINE:90
  private[this] lazy val controllers_TeachersController_index59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index59_invoker = createInvoker(
    TeachersController_8.index(),
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

  // @LINE:91
  private[this] lazy val controllers_TeachersController_save60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save60_invoker = createInvoker(
    TeachersController_8.save(),
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

  // @LINE:94
  private[this] lazy val controllers_MethodicsController_index61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index61_invoker = createInvoker(
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

  // @LINE:95
  private[this] lazy val controllers_MethodicsController_save62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save62_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val controllers_Application_roles63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles63_invoker = createInvoker(
    Application_23.roles(),
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

  // @LINE:100
  private[this] lazy val controllers_TableController_listPerson64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson64_invoker = createInvoker(
    TableController_15.listPerson(),
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

  // @LINE:102
  private[this] lazy val controllers_SubjectPlanTeachingController_index65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index65_invoker = createInvoker(
    SubjectPlanTeachingController_9.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectPlanTeachingController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """sub/add"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_SubjectPlanTeachingController_save66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save66_invoker = createInvoker(
    SubjectPlanTeachingController_9.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubjectPlanTeachingController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """sub/saved"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_Application_logout67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout67_invoker = createInvoker(
    Application_23.logout(),
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

  // @LINE:109
  private[this] lazy val controllers_PrintController_printUserDetails68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails68_invoker = createInvoker(
    PrintController_16.printUserDetails(fakeValue[Long]),
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

  // @LINE:110
  private[this] lazy val controllers_PrintController_detailsList69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList69_invoker = createInvoker(
    PrintController_16.detailsList(fakeValue[Long]),
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

  // @LINE:112
  private[this] lazy val controllers_SalaryController_saveLector70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector70_invoker = createInvoker(
    SalaryController_14.saveLector(),
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

  // @LINE:113
  private[this] lazy val controllers_SalaryController_printLector71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector71_invoker = createInvoker(
    SalaryController_14.printLector(fakeValue[Long]),
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

  // @LINE:114
  private[this] lazy val controllers_SalaryController_detailsListLector72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector72_invoker = createInvoker(
    SalaryController_14.detailsListLector(fakeValue[Long]),
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

  // @LINE:118
  private[this] lazy val controllers_Assets_at73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at73_invoker = createInvoker(
    Assets_22.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_23.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_23.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_23.index())
      }
  
    // @LINE:9
    case controllers_TestController_test3_route(params) =>
      call { 
        controllers_TestController_test3_invoker.call(TestController_18.test())
      }
  
    // @LINE:11
    case controllers_TestController_save4_route(params) =>
      call { 
        controllers_TestController_save4_invoker.call(TestController_18.save())
      }
  
    // @LINE:13
    case controllers_Application_kpiChoosePerson5_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson5_invoker.call(Application_23.kpiChoosePerson())
      }
  
    // @LINE:14
    case controllers_SalaryController_getPerson6_route(params) =>
      call { 
        controllers_SalaryController_getPerson6_invoker.call(SalaryController_14.getPerson())
      }
  
    // @LINE:15
    case controllers_Login_index7_route(params) =>
      call { 
        controllers_Login_index7_invoker.call(Login_20.index())
      }
  
    // @LINE:16
    case controllers_Login_authenticate8_route(params) =>
      call { 
        controllers_Login_authenticate8_invoker.call(Login_20.authenticate())
      }
  
    // @LINE:17
    case controllers_Charts_flot9_route(params) =>
      call { 
        controllers_Charts_flot9_invoker.call(Charts_24.flot())
      }
  
    // @LINE:18
    case controllers_Charts_morris10_route(params) =>
      call { 
        controllers_Charts_morris10_invoker.call(Charts_24.morris())
      }
  
    // @LINE:19
    case controllers_Application_tables11_route(params) =>
      call { 
        controllers_Application_tables11_invoker.call(Application_23.tables())
      }
  
    // @LINE:20
    case controllers_Application_forms12_route(params) =>
      call { 
        controllers_Application_forms12_invoker.call(Application_23.forms())
      }
  
    // @LINE:21
    case controllers_UiElements_panelsAndWells13_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells13_invoker.call(UiElements_17.panelsAndWells())
      }
  
    // @LINE:22
    case controllers_UiElements_buttons14_route(params) =>
      call { 
        controllers_UiElements_buttons14_invoker.call(UiElements_17.buttons())
      }
  
    // @LINE:23
    case controllers_UiElements_notifications15_route(params) =>
      call { 
        controllers_UiElements_notifications15_invoker.call(UiElements_17.notifications())
      }
  
    // @LINE:24
    case controllers_UiElements_typography16_route(params) =>
      call { 
        controllers_UiElements_typography16_invoker.call(UiElements_17.typography())
      }
  
    // @LINE:25
    case controllers_UiElements_icons17_route(params) =>
      call { 
        controllers_UiElements_icons17_invoker.call(UiElements_17.icons())
      }
  
    // @LINE:26
    case controllers_UiElements_grid18_route(params) =>
      call { 
        controllers_UiElements_grid18_invoker.call(UiElements_17.grid())
      }
  
    // @LINE:27
    case controllers_Pages_blank19_route(params) =>
      call { 
        controllers_Pages_blank19_invoker.call(Pages_4.blank())
      }
  
    // @LINE:30
    case controllers_PersonController_index20_route(params) =>
      call { 
        controllers_PersonController_index20_invoker.call(PersonController_2.index())
      }
  
    // @LINE:31
    case controllers_PersonController_save21_route(params) =>
      call { 
        controllers_PersonController_save21_invoker.call(PersonController_2.save())
      }
  
    // @LINE:33
    case controllers_VisitsController_index22_route(params) =>
      call { 
        controllers_VisitsController_index22_invoker.call(VisitsController_1.index())
      }
  
    // @LINE:34
    case controllers_VisitsController_save23_route(params) =>
      call { 
        controllers_VisitsController_save23_invoker.call(VisitsController_1.save())
      }
  
    // @LINE:36
    case controllers_ProjectController_index24_route(params) =>
      call { 
        controllers_ProjectController_index24_invoker.call(ProjectController_13.index())
      }
  
    // @LINE:37
    case controllers_ProjectController_save25_route(params) =>
      call { 
        controllers_ProjectController_save25_invoker.call(ProjectController_13.save())
      }
  
    // @LINE:39
    case controllers_FinalWorksController_index26_route(params) =>
      call { 
        controllers_FinalWorksController_index26_invoker.call(FinalWorksController_5.index())
      }
  
    // @LINE:40
    case controllers_FinalWorksController_save27_route(params) =>
      call { 
        controllers_FinalWorksController_save27_invoker.call(FinalWorksController_5.save())
      }
  
    // @LINE:42
    case controllers_PublicationsController_index28_route(params) =>
      call { 
        controllers_PublicationsController_index28_invoker.call(PublicationsController_7.index())
      }
  
    // @LINE:43
    case controllers_PublicationsController_save29_route(params) =>
      call { 
        controllers_PublicationsController_save29_invoker.call(PublicationsController_7.save())
      }
  
    // @LINE:45
    case controllers_OrganizationalUnitsController_index30_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_index30_invoker.call(OrganizationalUnitsController_11.index())
      }
  
    // @LINE:46
    case controllers_OrganizationalUnitsController_save31_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_save31_invoker.call(OrganizationalUnitsController_11.save())
      }
  
    // @LINE:49
    case controllers_EmployeesController_index32_route(params) =>
      call { 
        controllers_EmployeesController_index32_invoker.call(EmployeesController_19.index())
      }
  
    // @LINE:50
    case controllers_EmployeesController_save33_route(params) =>
      call { 
        controllers_EmployeesController_save33_invoker.call(EmployeesController_19.save())
      }
  
    // @LINE:53
    case controllers_SubjectController_index34_route(params) =>
      call { 
        controllers_SubjectController_index34_invoker.call(SubjectController_25.index())
      }
  
    // @LINE:54
    case controllers_SubjectController_save35_route(params) =>
      call { 
        controllers_SubjectController_save35_invoker.call(SubjectController_25.save())
      }
  
    // @LINE:57
    case controllers_FieldOfStudyController_index36_route(params) =>
      call { 
        controllers_FieldOfStudyController_index36_invoker.call(FieldOfStudyController_10.index())
      }
  
    // @LINE:58
    case controllers_FieldOfStudyController_save37_route(params) =>
      call { 
        controllers_FieldOfStudyController_save37_invoker.call(FieldOfStudyController_10.save())
      }
  
    // @LINE:61
    case controllers_StudyGroupsController_index38_route(params) =>
      call { 
        controllers_StudyGroupsController_index38_invoker.call(StudyGroupsController_6.index())
      }
  
    // @LINE:62
    case controllers_StudyGroupsController_save39_route(params) =>
      call { 
        controllers_StudyGroupsController_save39_invoker.call(StudyGroupsController_6.save())
      }
  
    // @LINE:63
    case controllers_TableController_listStudyGroups40_route(params) =>
      call { 
        controllers_TableController_listStudyGroups40_invoker.call(TableController_15.listStudyGroups())
      }
  
    // @LINE:66
    case controllers_SemestersController_index41_route(params) =>
      call { 
        controllers_SemestersController_index41_invoker.call(SemestersController_21.index())
      }
  
    // @LINE:67
    case controllers_SemestersController_save42_route(params) =>
      call { 
        controllers_SemestersController_save42_invoker.call(SemestersController_21.save())
      }
  
    // @LINE:68
    case controllers_TableController_listSemesters43_route(params) =>
      call { 
        controllers_TableController_listSemesters43_invoker.call(TableController_15.listSemesters())
      }
  
    // @LINE:71
    case controllers_StudyPlansController_index44_route(params) =>
      call { 
        controllers_StudyPlansController_index44_invoker.call(StudyPlansController_12.index())
      }
  
    // @LINE:72
    case controllers_StudyPlansController_save45_route(params) =>
      call { 
        controllers_StudyPlansController_save45_invoker.call(StudyPlansController_12.save())
      }
  
    // @LINE:73
    case controllers_TableController_listStudyPlans46_route(params) =>
      call { 
        controllers_TableController_listStudyPlans46_invoker.call(TableController_15.listStudyPlans())
      }
  
    // @LINE:75
    case controllers_CourseController_index47_route(params) =>
      call { 
        controllers_CourseController_index47_invoker.call(CourseController_3.index())
      }
  
    // @LINE:76
    case controllers_CourseController_save48_route(params) =>
      call { 
        controllers_CourseController_save48_invoker.call(CourseController_3.save())
      }
  
    // @LINE:78
    case controllers_TableController_listScheduleInWeeks49_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks49_invoker.call(TableController_15.listScheduleInWeeks())
      }
  
    // @LINE:80
    case controllers_TableController_listSchedule50_route(params) =>
      call { 
        controllers_TableController_listSchedule50_invoker.call(TableController_15.listSchedule())
      }
  
    // @LINE:81
    case controllers_TableController_listEmployees51_route(params) =>
      call { 
        controllers_TableController_listEmployees51_invoker.call(TableController_15.listEmployees())
      }
  
    // @LINE:82
    case controllers_TableController_listTeachers52_route(params) =>
      call { 
        controllers_TableController_listTeachers52_invoker.call(TableController_15.listTeachers())
      }
  
    // @LINE:83
    case controllers_TableController_listSubjects53_route(params) =>
      call { 
        controllers_TableController_listSubjects53_invoker.call(TableController_15.listSubjects())
      }
  
    // @LINE:84
    case controllers_TableController_listFieldsOfStudy54_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy54_invoker.call(TableController_15.listFieldsOfStudy())
      }
  
    // @LINE:85
    case controllers_TableController_listCourses55_route(params) =>
      call { 
        controllers_TableController_listCourses55_invoker.call(TableController_15.listCourses())
      }
  
    // @LINE:86
    case controllers_TableController_listCurrentSemesters56_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters56_invoker.call(TableController_15.listCurrentSemesters())
      }
  
    // @LINE:87
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy57_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy57_invoker.call(TableController_15.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:88
    case controllers_TableController_listDays58_route(params) =>
      call { 
        controllers_TableController_listDays58_invoker.call(TableController_15.listDays())
      }
  
    // @LINE:90
    case controllers_TeachersController_index59_route(params) =>
      call { 
        controllers_TeachersController_index59_invoker.call(TeachersController_8.index())
      }
  
    // @LINE:91
    case controllers_TeachersController_save60_route(params) =>
      call { 
        controllers_TeachersController_save60_invoker.call(TeachersController_8.save())
      }
  
    // @LINE:94
    case controllers_MethodicsController_index61_route(params) =>
      call { 
        controllers_MethodicsController_index61_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:95
    case controllers_MethodicsController_save62_route(params) =>
      call { 
        controllers_MethodicsController_save62_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:97
    case controllers_Application_roles63_route(params) =>
      call { 
        controllers_Application_roles63_invoker.call(Application_23.roles())
      }
  
    // @LINE:100
    case controllers_TableController_listPerson64_route(params) =>
      call { 
        controllers_TableController_listPerson64_invoker.call(TableController_15.listPerson())
      }
  
    // @LINE:102
    case controllers_SubjectPlanTeachingController_index65_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index65_invoker.call(SubjectPlanTeachingController_9.index())
      }
  
    // @LINE:103
    case controllers_SubjectPlanTeachingController_save66_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save66_invoker.call(SubjectPlanTeachingController_9.save())
      }
  
    // @LINE:106
    case controllers_Application_logout67_route(params) =>
      call { 
        controllers_Application_logout67_invoker.call(Application_23.logout())
      }
  
    // @LINE:109
    case controllers_PrintController_printUserDetails68_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails68_invoker.call(PrintController_16.printUserDetails(id))
      }
  
    // @LINE:110
    case controllers_PrintController_detailsList69_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList69_invoker.call(PrintController_16.detailsList(id))
      }
  
    // @LINE:112
    case controllers_SalaryController_saveLector70_route(params) =>
      call { 
        controllers_SalaryController_saveLector70_invoker.call(SalaryController_14.saveLector())
      }
  
    // @LINE:113
    case controllers_SalaryController_printLector71_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector71_invoker.call(SalaryController_14.printLector(id))
      }
  
    // @LINE:114
    case controllers_SalaryController_detailsListLector72_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector72_invoker.call(SalaryController_14.detailsListLector(id))
      }
  
    // @LINE:118
    case controllers_Assets_at73_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at73_invoker.call(Assets_22.at(path, file))
      }
  }
}
