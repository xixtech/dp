
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat Mar 25 09:30:07 CET 2017

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
  Application_22: controllers.Application,
  // @LINE:9
  TestController_17: controllers.TestController,
  // @LINE:14
  SalaryController_13: controllers.SalaryController,
  // @LINE:15
  Login_19: controllers.Login,
  // @LINE:17
  Charts_23: controllers.Charts,
  // @LINE:21
  UiElements_16: controllers.UiElements,
  // @LINE:27
  Pages_4: controllers.Pages,
  // @LINE:30
  PersonController_2: controllers.PersonController,
  // @LINE:33
  VisitsController_1: controllers.VisitsController,
  // @LINE:36
  ProjectController_12: controllers.ProjectController,
  // @LINE:39
  FinalWorksController_5: controllers.FinalWorksController,
  // @LINE:42
  PublicationsController_7: controllers.PublicationsController,
  // @LINE:46
  EmployeesController_18: controllers.EmployeesController,
  // @LINE:50
  SubjectController_24: controllers.SubjectController,
  // @LINE:54
  FieldOfStudyController_10: controllers.FieldOfStudyController,
  // @LINE:58
  StudyGroupsController_6: controllers.StudyGroupsController,
  // @LINE:60
  TableController_14: controllers.TableController,
  // @LINE:63
  SemestersController_20: controllers.SemestersController,
  // @LINE:68
  StudyPlansController_11: controllers.StudyPlansController,
  // @LINE:72
  CourseController_3: controllers.CourseController,
  // @LINE:87
  TeachersController_8: controllers.TeachersController,
  // @LINE:91
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:99
  SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
  // @LINE:106
  PrintController_15: controllers.PrintController,
  // @LINE:115
  Assets_21: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_22: controllers.Application,
    // @LINE:9
    TestController_17: controllers.TestController,
    // @LINE:14
    SalaryController_13: controllers.SalaryController,
    // @LINE:15
    Login_19: controllers.Login,
    // @LINE:17
    Charts_23: controllers.Charts,
    // @LINE:21
    UiElements_16: controllers.UiElements,
    // @LINE:27
    Pages_4: controllers.Pages,
    // @LINE:30
    PersonController_2: controllers.PersonController,
    // @LINE:33
    VisitsController_1: controllers.VisitsController,
    // @LINE:36
    ProjectController_12: controllers.ProjectController,
    // @LINE:39
    FinalWorksController_5: controllers.FinalWorksController,
    // @LINE:42
    PublicationsController_7: controllers.PublicationsController,
    // @LINE:46
    EmployeesController_18: controllers.EmployeesController,
    // @LINE:50
    SubjectController_24: controllers.SubjectController,
    // @LINE:54
    FieldOfStudyController_10: controllers.FieldOfStudyController,
    // @LINE:58
    StudyGroupsController_6: controllers.StudyGroupsController,
    // @LINE:60
    TableController_14: controllers.TableController,
    // @LINE:63
    SemestersController_20: controllers.SemestersController,
    // @LINE:68
    StudyPlansController_11: controllers.StudyPlansController,
    // @LINE:72
    CourseController_3: controllers.CourseController,
    // @LINE:87
    TeachersController_8: controllers.TeachersController,
    // @LINE:91
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:99
    SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
    // @LINE:106
    PrintController_15: controllers.PrintController,
    // @LINE:115
    Assets_21: controllers.Assets
  ) = this(errorHandler, Application_22, TestController_17, SalaryController_13, Login_19, Charts_23, UiElements_16, Pages_4, PersonController_2, VisitsController_1, ProjectController_12, FinalWorksController_5, PublicationsController_7, EmployeesController_18, SubjectController_24, FieldOfStudyController_10, StudyGroupsController_6, TableController_14, SemestersController_20, StudyPlansController_11, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_15, Assets_21, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_22, TestController_17, SalaryController_13, Login_19, Charts_23, UiElements_16, Pages_4, PersonController_2, VisitsController_1, ProjectController_12, FinalWorksController_5, PublicationsController_7, EmployeesController_18, SubjectController_24, FieldOfStudyController_10, StudyGroupsController_6, TableController_14, SemestersController_20, StudyPlansController_11, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_15, Assets_21, prefix)
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
    Application_22.dashboard(),
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
    Application_22.pdf(),
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
    Application_22.index(),
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
    TestController_17.test(),
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
    TestController_17.save(),
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
    Application_22.kpiChoosePerson(),
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
    SalaryController_13.getPerson(),
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
    Login_19.index(),
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
    Login_19.authenticate(),
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
    Charts_23.flot(),
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
    Charts_23.morris(),
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
    Application_22.tables(),
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
    Application_22.forms(),
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
    UiElements_16.panelsAndWells(),
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
    UiElements_16.buttons(),
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
    UiElements_16.notifications(),
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
    UiElements_16.typography(),
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
    UiElements_16.icons(),
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
    UiElements_16.grid(),
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
    ProjectController_12.index(),
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
    ProjectController_12.save(),
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

  // @LINE:46
  private[this] lazy val controllers_EmployeesController_index30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index30_invoker = createInvoker(
    EmployeesController_18.index(),
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

  // @LINE:47
  private[this] lazy val controllers_EmployeesController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save31_invoker = createInvoker(
    EmployeesController_18.save(),
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

  // @LINE:50
  private[this] lazy val controllers_SubjectController_index32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index32_invoker = createInvoker(
    SubjectController_24.index(),
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

  // @LINE:51
  private[this] lazy val controllers_SubjectController_save33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save33_invoker = createInvoker(
    SubjectController_24.save(),
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

  // @LINE:54
  private[this] lazy val controllers_FieldOfStudyController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index34_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_FieldOfStudyController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save35_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_StudyGroupsController_index36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index36_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_StudyGroupsController_save37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save37_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_TableController_listStudyGroups38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups38_invoker = createInvoker(
    TableController_14.listStudyGroups(),
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

  // @LINE:63
  private[this] lazy val controllers_SemestersController_index39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index39_invoker = createInvoker(
    SemestersController_20.index(),
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

  // @LINE:64
  private[this] lazy val controllers_SemestersController_save40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save40_invoker = createInvoker(
    SemestersController_20.save(),
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

  // @LINE:65
  private[this] lazy val controllers_TableController_listSemesters41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters41_invoker = createInvoker(
    TableController_14.listSemesters(),
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

  // @LINE:68
  private[this] lazy val controllers_StudyPlansController_index42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index42_invoker = createInvoker(
    StudyPlansController_11.index(),
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

  // @LINE:69
  private[this] lazy val controllers_StudyPlansController_save43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save43_invoker = createInvoker(
    StudyPlansController_11.save(),
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

  // @LINE:70
  private[this] lazy val controllers_TableController_listStudyPlans44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans44_invoker = createInvoker(
    TableController_14.listStudyPlans(),
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

  // @LINE:72
  private[this] lazy val controllers_CourseController_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index45_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_CourseController_save46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save46_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_TableController_listScheduleInWeeks47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks47_invoker = createInvoker(
    TableController_14.listScheduleInWeeks(),
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

  // @LINE:77
  private[this] lazy val controllers_TableController_listSchedule48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule48_invoker = createInvoker(
    TableController_14.listSchedule(),
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

  // @LINE:78
  private[this] lazy val controllers_TableController_listEmployees49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees49_invoker = createInvoker(
    TableController_14.listEmployees(),
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

  // @LINE:79
  private[this] lazy val controllers_TableController_listTeachers50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers50_invoker = createInvoker(
    TableController_14.listTeachers(),
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

  // @LINE:80
  private[this] lazy val controllers_TableController_listSubjects51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects51_invoker = createInvoker(
    TableController_14.listSubjects(),
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

  // @LINE:81
  private[this] lazy val controllers_TableController_listFieldsOfStudy52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy52_invoker = createInvoker(
    TableController_14.listFieldsOfStudy(),
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

  // @LINE:82
  private[this] lazy val controllers_TableController_listCourses53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses53_invoker = createInvoker(
    TableController_14.listCourses(),
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

  // @LINE:83
  private[this] lazy val controllers_TableController_listCurrentSemesters54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters54_invoker = createInvoker(
    TableController_14.listCurrentSemesters(),
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

  // @LINE:84
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy55_invoker = createInvoker(
    TableController_14.listCurrentSemestersUntilTheEndOfStudy(),
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

  // @LINE:85
  private[this] lazy val controllers_TableController_listDays56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays56_invoker = createInvoker(
    TableController_14.listDays(),
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

  // @LINE:87
  private[this] lazy val controllers_TeachersController_index57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index57_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val controllers_TeachersController_save58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save58_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val controllers_MethodicsController_index59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index59_invoker = createInvoker(
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

  // @LINE:92
  private[this] lazy val controllers_MethodicsController_save60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save60_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_Application_roles61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles61_invoker = createInvoker(
    Application_22.roles(),
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

  // @LINE:97
  private[this] lazy val controllers_TableController_listPerson62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson62_invoker = createInvoker(
    TableController_14.listPerson(),
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

  // @LINE:99
  private[this] lazy val controllers_SubjectPlanTeachingController_index63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index63_invoker = createInvoker(
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

  // @LINE:100
  private[this] lazy val controllers_SubjectPlanTeachingController_save64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save64_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_Application_logout65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout65_invoker = createInvoker(
    Application_22.logout(),
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

  // @LINE:106
  private[this] lazy val controllers_PrintController_printUserDetails66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails66_invoker = createInvoker(
    PrintController_15.printUserDetails(fakeValue[Long]),
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

  // @LINE:107
  private[this] lazy val controllers_PrintController_detailsList67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList67_invoker = createInvoker(
    PrintController_15.detailsList(fakeValue[Long]),
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

  // @LINE:109
  private[this] lazy val controllers_SalaryController_saveLector68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector68_invoker = createInvoker(
    SalaryController_13.saveLector(),
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

  // @LINE:110
  private[this] lazy val controllers_SalaryController_printLector69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector69_invoker = createInvoker(
    SalaryController_13.printLector(fakeValue[Long]),
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

  // @LINE:111
  private[this] lazy val controllers_SalaryController_detailsListLector70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector70_invoker = createInvoker(
    SalaryController_13.detailsListLector(fakeValue[Long]),
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

  // @LINE:115
  private[this] lazy val controllers_Assets_at71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at71_invoker = createInvoker(
    Assets_21.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_22.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_22.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_22.index())
      }
  
    // @LINE:9
    case controllers_TestController_test3_route(params) =>
      call { 
        controllers_TestController_test3_invoker.call(TestController_17.test())
      }
  
    // @LINE:11
    case controllers_TestController_save4_route(params) =>
      call { 
        controllers_TestController_save4_invoker.call(TestController_17.save())
      }
  
    // @LINE:13
    case controllers_Application_kpiChoosePerson5_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson5_invoker.call(Application_22.kpiChoosePerson())
      }
  
    // @LINE:14
    case controllers_SalaryController_getPerson6_route(params) =>
      call { 
        controllers_SalaryController_getPerson6_invoker.call(SalaryController_13.getPerson())
      }
  
    // @LINE:15
    case controllers_Login_index7_route(params) =>
      call { 
        controllers_Login_index7_invoker.call(Login_19.index())
      }
  
    // @LINE:16
    case controllers_Login_authenticate8_route(params) =>
      call { 
        controllers_Login_authenticate8_invoker.call(Login_19.authenticate())
      }
  
    // @LINE:17
    case controllers_Charts_flot9_route(params) =>
      call { 
        controllers_Charts_flot9_invoker.call(Charts_23.flot())
      }
  
    // @LINE:18
    case controllers_Charts_morris10_route(params) =>
      call { 
        controllers_Charts_morris10_invoker.call(Charts_23.morris())
      }
  
    // @LINE:19
    case controllers_Application_tables11_route(params) =>
      call { 
        controllers_Application_tables11_invoker.call(Application_22.tables())
      }
  
    // @LINE:20
    case controllers_Application_forms12_route(params) =>
      call { 
        controllers_Application_forms12_invoker.call(Application_22.forms())
      }
  
    // @LINE:21
    case controllers_UiElements_panelsAndWells13_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells13_invoker.call(UiElements_16.panelsAndWells())
      }
  
    // @LINE:22
    case controllers_UiElements_buttons14_route(params) =>
      call { 
        controllers_UiElements_buttons14_invoker.call(UiElements_16.buttons())
      }
  
    // @LINE:23
    case controllers_UiElements_notifications15_route(params) =>
      call { 
        controllers_UiElements_notifications15_invoker.call(UiElements_16.notifications())
      }
  
    // @LINE:24
    case controllers_UiElements_typography16_route(params) =>
      call { 
        controllers_UiElements_typography16_invoker.call(UiElements_16.typography())
      }
  
    // @LINE:25
    case controllers_UiElements_icons17_route(params) =>
      call { 
        controllers_UiElements_icons17_invoker.call(UiElements_16.icons())
      }
  
    // @LINE:26
    case controllers_UiElements_grid18_route(params) =>
      call { 
        controllers_UiElements_grid18_invoker.call(UiElements_16.grid())
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
        controllers_ProjectController_index24_invoker.call(ProjectController_12.index())
      }
  
    // @LINE:37
    case controllers_ProjectController_save25_route(params) =>
      call { 
        controllers_ProjectController_save25_invoker.call(ProjectController_12.save())
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
  
    // @LINE:46
    case controllers_EmployeesController_index30_route(params) =>
      call { 
        controllers_EmployeesController_index30_invoker.call(EmployeesController_18.index())
      }
  
    // @LINE:47
    case controllers_EmployeesController_save31_route(params) =>
      call { 
        controllers_EmployeesController_save31_invoker.call(EmployeesController_18.save())
      }
  
    // @LINE:50
    case controllers_SubjectController_index32_route(params) =>
      call { 
        controllers_SubjectController_index32_invoker.call(SubjectController_24.index())
      }
  
    // @LINE:51
    case controllers_SubjectController_save33_route(params) =>
      call { 
        controllers_SubjectController_save33_invoker.call(SubjectController_24.save())
      }
  
    // @LINE:54
    case controllers_FieldOfStudyController_index34_route(params) =>
      call { 
        controllers_FieldOfStudyController_index34_invoker.call(FieldOfStudyController_10.index())
      }
  
    // @LINE:55
    case controllers_FieldOfStudyController_save35_route(params) =>
      call { 
        controllers_FieldOfStudyController_save35_invoker.call(FieldOfStudyController_10.save())
      }
  
    // @LINE:58
    case controllers_StudyGroupsController_index36_route(params) =>
      call { 
        controllers_StudyGroupsController_index36_invoker.call(StudyGroupsController_6.index())
      }
  
    // @LINE:59
    case controllers_StudyGroupsController_save37_route(params) =>
      call { 
        controllers_StudyGroupsController_save37_invoker.call(StudyGroupsController_6.save())
      }
  
    // @LINE:60
    case controllers_TableController_listStudyGroups38_route(params) =>
      call { 
        controllers_TableController_listStudyGroups38_invoker.call(TableController_14.listStudyGroups())
      }
  
    // @LINE:63
    case controllers_SemestersController_index39_route(params) =>
      call { 
        controllers_SemestersController_index39_invoker.call(SemestersController_20.index())
      }
  
    // @LINE:64
    case controllers_SemestersController_save40_route(params) =>
      call { 
        controllers_SemestersController_save40_invoker.call(SemestersController_20.save())
      }
  
    // @LINE:65
    case controllers_TableController_listSemesters41_route(params) =>
      call { 
        controllers_TableController_listSemesters41_invoker.call(TableController_14.listSemesters())
      }
  
    // @LINE:68
    case controllers_StudyPlansController_index42_route(params) =>
      call { 
        controllers_StudyPlansController_index42_invoker.call(StudyPlansController_11.index())
      }
  
    // @LINE:69
    case controllers_StudyPlansController_save43_route(params) =>
      call { 
        controllers_StudyPlansController_save43_invoker.call(StudyPlansController_11.save())
      }
  
    // @LINE:70
    case controllers_TableController_listStudyPlans44_route(params) =>
      call { 
        controllers_TableController_listStudyPlans44_invoker.call(TableController_14.listStudyPlans())
      }
  
    // @LINE:72
    case controllers_CourseController_index45_route(params) =>
      call { 
        controllers_CourseController_index45_invoker.call(CourseController_3.index())
      }
  
    // @LINE:73
    case controllers_CourseController_save46_route(params) =>
      call { 
        controllers_CourseController_save46_invoker.call(CourseController_3.save())
      }
  
    // @LINE:75
    case controllers_TableController_listScheduleInWeeks47_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks47_invoker.call(TableController_14.listScheduleInWeeks())
      }
  
    // @LINE:77
    case controllers_TableController_listSchedule48_route(params) =>
      call { 
        controllers_TableController_listSchedule48_invoker.call(TableController_14.listSchedule())
      }
  
    // @LINE:78
    case controllers_TableController_listEmployees49_route(params) =>
      call { 
        controllers_TableController_listEmployees49_invoker.call(TableController_14.listEmployees())
      }
  
    // @LINE:79
    case controllers_TableController_listTeachers50_route(params) =>
      call { 
        controllers_TableController_listTeachers50_invoker.call(TableController_14.listTeachers())
      }
  
    // @LINE:80
    case controllers_TableController_listSubjects51_route(params) =>
      call { 
        controllers_TableController_listSubjects51_invoker.call(TableController_14.listSubjects())
      }
  
    // @LINE:81
    case controllers_TableController_listFieldsOfStudy52_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy52_invoker.call(TableController_14.listFieldsOfStudy())
      }
  
    // @LINE:82
    case controllers_TableController_listCourses53_route(params) =>
      call { 
        controllers_TableController_listCourses53_invoker.call(TableController_14.listCourses())
      }
  
    // @LINE:83
    case controllers_TableController_listCurrentSemesters54_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters54_invoker.call(TableController_14.listCurrentSemesters())
      }
  
    // @LINE:84
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy55_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy55_invoker.call(TableController_14.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:85
    case controllers_TableController_listDays56_route(params) =>
      call { 
        controllers_TableController_listDays56_invoker.call(TableController_14.listDays())
      }
  
    // @LINE:87
    case controllers_TeachersController_index57_route(params) =>
      call { 
        controllers_TeachersController_index57_invoker.call(TeachersController_8.index())
      }
  
    // @LINE:88
    case controllers_TeachersController_save58_route(params) =>
      call { 
        controllers_TeachersController_save58_invoker.call(TeachersController_8.save())
      }
  
    // @LINE:91
    case controllers_MethodicsController_index59_route(params) =>
      call { 
        controllers_MethodicsController_index59_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:92
    case controllers_MethodicsController_save60_route(params) =>
      call { 
        controllers_MethodicsController_save60_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:94
    case controllers_Application_roles61_route(params) =>
      call { 
        controllers_Application_roles61_invoker.call(Application_22.roles())
      }
  
    // @LINE:97
    case controllers_TableController_listPerson62_route(params) =>
      call { 
        controllers_TableController_listPerson62_invoker.call(TableController_14.listPerson())
      }
  
    // @LINE:99
    case controllers_SubjectPlanTeachingController_index63_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index63_invoker.call(SubjectPlanTeachingController_9.index())
      }
  
    // @LINE:100
    case controllers_SubjectPlanTeachingController_save64_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save64_invoker.call(SubjectPlanTeachingController_9.save())
      }
  
    // @LINE:103
    case controllers_Application_logout65_route(params) =>
      call { 
        controllers_Application_logout65_invoker.call(Application_22.logout())
      }
  
    // @LINE:106
    case controllers_PrintController_printUserDetails66_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails66_invoker.call(PrintController_15.printUserDetails(id))
      }
  
    // @LINE:107
    case controllers_PrintController_detailsList67_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList67_invoker.call(PrintController_15.detailsList(id))
      }
  
    // @LINE:109
    case controllers_SalaryController_saveLector68_route(params) =>
      call { 
        controllers_SalaryController_saveLector68_invoker.call(SalaryController_13.saveLector())
      }
  
    // @LINE:110
    case controllers_SalaryController_printLector69_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector69_invoker.call(SalaryController_13.printLector(id))
      }
  
    // @LINE:111
    case controllers_SalaryController_detailsListLector70_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector70_invoker.call(SalaryController_13.detailsListLector(id))
      }
  
    // @LINE:115
    case controllers_Assets_at71_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at71_invoker.call(Assets_21.at(path, file))
      }
  }
}
