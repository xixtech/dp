
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Tue Mar 28 13:01:31 CEST 2017

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
  Application_24: controllers.Application,
  // @LINE:9
  TestController_19: controllers.TestController,
  // @LINE:14
  SalaryController_15: controllers.SalaryController,
  // @LINE:15
  Login_21: controllers.Login,
  // @LINE:17
  Charts_25: controllers.Charts,
  // @LINE:21
  UiElements_18: controllers.UiElements,
  // @LINE:27
  Pages_4: controllers.Pages,
  // @LINE:30
  PersonController_2: controllers.PersonController,
  // @LINE:33
  VisitsController_1: controllers.VisitsController,
  // @LINE:36
  ProjectController_14: controllers.ProjectController,
  // @LINE:39
  FinalWorksController_5: controllers.FinalWorksController,
  // @LINE:42
  PublicationsController_7: controllers.PublicationsController,
  // @LINE:45
  OrganizationalUnitsController_11: controllers.OrganizationalUnitsController,
  // @LINE:52
  EmployeesController_20: controllers.EmployeesController,
  // @LINE:56
  SubjectController_26: controllers.SubjectController,
  // @LINE:60
  FieldOfStudyController_10: controllers.FieldOfStudyController,
  // @LINE:63
  PersonalStatisticController_13: controllers.PersonalStatisticController,
  // @LINE:66
  StudyGroupsController_6: controllers.StudyGroupsController,
  // @LINE:68
  TableController_16: controllers.TableController,
  // @LINE:71
  SemestersController_22: controllers.SemestersController,
  // @LINE:76
  StudyPlansController_12: controllers.StudyPlansController,
  // @LINE:80
  CourseController_3: controllers.CourseController,
  // @LINE:95
  TeachersController_8: controllers.TeachersController,
  // @LINE:99
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:107
  SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
  // @LINE:114
  PrintController_17: controllers.PrintController,
  // @LINE:123
  Assets_23: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_24: controllers.Application,
    // @LINE:9
    TestController_19: controllers.TestController,
    // @LINE:14
    SalaryController_15: controllers.SalaryController,
    // @LINE:15
    Login_21: controllers.Login,
    // @LINE:17
    Charts_25: controllers.Charts,
    // @LINE:21
    UiElements_18: controllers.UiElements,
    // @LINE:27
    Pages_4: controllers.Pages,
    // @LINE:30
    PersonController_2: controllers.PersonController,
    // @LINE:33
    VisitsController_1: controllers.VisitsController,
    // @LINE:36
    ProjectController_14: controllers.ProjectController,
    // @LINE:39
    FinalWorksController_5: controllers.FinalWorksController,
    // @LINE:42
    PublicationsController_7: controllers.PublicationsController,
    // @LINE:45
    OrganizationalUnitsController_11: controllers.OrganizationalUnitsController,
    // @LINE:52
    EmployeesController_20: controllers.EmployeesController,
    // @LINE:56
    SubjectController_26: controllers.SubjectController,
    // @LINE:60
    FieldOfStudyController_10: controllers.FieldOfStudyController,
    // @LINE:63
    PersonalStatisticController_13: controllers.PersonalStatisticController,
    // @LINE:66
    StudyGroupsController_6: controllers.StudyGroupsController,
    // @LINE:68
    TableController_16: controllers.TableController,
    // @LINE:71
    SemestersController_22: controllers.SemestersController,
    // @LINE:76
    StudyPlansController_12: controllers.StudyPlansController,
    // @LINE:80
    CourseController_3: controllers.CourseController,
    // @LINE:95
    TeachersController_8: controllers.TeachersController,
    // @LINE:99
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:107
    SubjectPlanTeachingController_9: controllers.SubjectPlanTeachingController,
    // @LINE:114
    PrintController_17: controllers.PrintController,
    // @LINE:123
    Assets_23: controllers.Assets
  ) = this(errorHandler, Application_24, TestController_19, SalaryController_15, Login_21, Charts_25, UiElements_18, Pages_4, PersonController_2, VisitsController_1, ProjectController_14, FinalWorksController_5, PublicationsController_7, OrganizationalUnitsController_11, EmployeesController_20, SubjectController_26, FieldOfStudyController_10, PersonalStatisticController_13, StudyGroupsController_6, TableController_16, SemestersController_22, StudyPlansController_12, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_17, Assets_23, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_24, TestController_19, SalaryController_15, Login_21, Charts_25, UiElements_18, Pages_4, PersonController_2, VisitsController_1, ProjectController_14, FinalWorksController_5, PublicationsController_7, OrganizationalUnitsController_11, EmployeesController_20, SubjectController_26, FieldOfStudyController_10, PersonalStatisticController_13, StudyGroupsController_6, TableController_16, SemestersController_22, StudyPlansController_12, CourseController_3, TeachersController_8, MethodicsController_0, SubjectPlanTeachingController_9, PrintController_17, Assets_23, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oup/register""", """controllers.OrganizationalUnitsController.indexParticipants()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """oup/saved""", """controllers.OrganizationalUnitsController.saveParticipants()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/register""", """controllers.EmployeesController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/saved""", """controllers.EmployeesController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/add""", """controllers.SubjectController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/saved""", """controllers.SubjectController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/add""", """controllers.FieldOfStudyController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/saved""", """controllers.FieldOfStudyController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.PersonalStatisticController.index()"""),
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
    Application_24.dashboard(),
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
    Application_24.pdf(),
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
    Application_24.index(),
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
    TestController_19.test(),
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
    TestController_19.save(),
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
    Application_24.kpiChoosePerson(),
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
    SalaryController_15.getPerson(),
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
    Login_21.index(),
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
    Login_21.authenticate(),
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
    Charts_25.flot(),
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
    Charts_25.morris(),
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
    Application_24.tables(),
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
    Application_24.forms(),
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
    UiElements_18.panelsAndWells(),
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
    UiElements_18.buttons(),
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
    UiElements_18.notifications(),
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
    UiElements_18.typography(),
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
    UiElements_18.icons(),
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
    UiElements_18.grid(),
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
    ProjectController_14.index(),
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
    ProjectController_14.save(),
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

  // @LINE:48
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants32_invoker = createInvoker(
    OrganizationalUnitsController_11.indexParticipants(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationalUnitsController",
      "indexParticipants",
      Nil,
      "GET",
      """""",
      this.prefix + """oup/register"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants33_invoker = createInvoker(
    OrganizationalUnitsController_11.saveParticipants(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationalUnitsController",
      "saveParticipants",
      Nil,
      "POST",
      """""",
      this.prefix + """oup/saved"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_EmployeesController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index34_invoker = createInvoker(
    EmployeesController_20.index(),
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

  // @LINE:53
  private[this] lazy val controllers_EmployeesController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save35_invoker = createInvoker(
    EmployeesController_20.save(),
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

  // @LINE:56
  private[this] lazy val controllers_SubjectController_index36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index36_invoker = createInvoker(
    SubjectController_26.index(),
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

  // @LINE:57
  private[this] lazy val controllers_SubjectController_save37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save37_invoker = createInvoker(
    SubjectController_26.save(),
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

  // @LINE:60
  private[this] lazy val controllers_FieldOfStudyController_index38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index38_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_FieldOfStudyController_save39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save39_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_PersonalStatisticController_index40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index40_invoker = createInvoker(
    PersonalStatisticController_13.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_StudyGroupsController_index41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index41_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_StudyGroupsController_save42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save42_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_TableController_listStudyGroups43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups43_invoker = createInvoker(
    TableController_16.listStudyGroups(),
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

  // @LINE:71
  private[this] lazy val controllers_SemestersController_index44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index44_invoker = createInvoker(
    SemestersController_22.index(),
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

  // @LINE:72
  private[this] lazy val controllers_SemestersController_save45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save45_invoker = createInvoker(
    SemestersController_22.save(),
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

  // @LINE:73
  private[this] lazy val controllers_TableController_listSemesters46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters46_invoker = createInvoker(
    TableController_16.listSemesters(),
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

  // @LINE:76
  private[this] lazy val controllers_StudyPlansController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index47_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_StudyPlansController_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save48_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_TableController_listStudyPlans49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans49_invoker = createInvoker(
    TableController_16.listStudyPlans(),
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

  // @LINE:80
  private[this] lazy val controllers_CourseController_index50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index50_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_CourseController_save51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save51_invoker = createInvoker(
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

  // @LINE:83
  private[this] lazy val controllers_TableController_listScheduleInWeeks52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks52_invoker = createInvoker(
    TableController_16.listScheduleInWeeks(),
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

  // @LINE:85
  private[this] lazy val controllers_TableController_listSchedule53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule53_invoker = createInvoker(
    TableController_16.listSchedule(),
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

  // @LINE:86
  private[this] lazy val controllers_TableController_listEmployees54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees54_invoker = createInvoker(
    TableController_16.listEmployees(),
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

  // @LINE:87
  private[this] lazy val controllers_TableController_listTeachers55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers55_invoker = createInvoker(
    TableController_16.listTeachers(),
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

  // @LINE:88
  private[this] lazy val controllers_TableController_listSubjects56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects56_invoker = createInvoker(
    TableController_16.listSubjects(),
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

  // @LINE:89
  private[this] lazy val controllers_TableController_listFieldsOfStudy57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy57_invoker = createInvoker(
    TableController_16.listFieldsOfStudy(),
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

  // @LINE:90
  private[this] lazy val controllers_TableController_listCourses58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses58_invoker = createInvoker(
    TableController_16.listCourses(),
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

  // @LINE:91
  private[this] lazy val controllers_TableController_listCurrentSemesters59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters59_invoker = createInvoker(
    TableController_16.listCurrentSemesters(),
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

  // @LINE:92
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy60_invoker = createInvoker(
    TableController_16.listCurrentSemestersUntilTheEndOfStudy(),
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

  // @LINE:93
  private[this] lazy val controllers_TableController_listDays61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays61_invoker = createInvoker(
    TableController_16.listDays(),
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

  // @LINE:95
  private[this] lazy val controllers_TeachersController_index62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index62_invoker = createInvoker(
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

  // @LINE:96
  private[this] lazy val controllers_TeachersController_save63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save63_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_MethodicsController_index64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index64_invoker = createInvoker(
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

  // @LINE:100
  private[this] lazy val controllers_MethodicsController_save65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save65_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val controllers_Application_roles66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles66_invoker = createInvoker(
    Application_24.roles(),
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

  // @LINE:105
  private[this] lazy val controllers_TableController_listPerson67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson67_invoker = createInvoker(
    TableController_16.listPerson(),
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

  // @LINE:107
  private[this] lazy val controllers_SubjectPlanTeachingController_index68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index68_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_SubjectPlanTeachingController_save69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save69_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_Application_logout70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout70_invoker = createInvoker(
    Application_24.logout(),
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

  // @LINE:114
  private[this] lazy val controllers_PrintController_printUserDetails71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails71_invoker = createInvoker(
    PrintController_17.printUserDetails(fakeValue[Long]),
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

  // @LINE:115
  private[this] lazy val controllers_PrintController_detailsList72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList72_invoker = createInvoker(
    PrintController_17.detailsList(fakeValue[Long]),
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

  // @LINE:117
  private[this] lazy val controllers_SalaryController_saveLector73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector73_invoker = createInvoker(
    SalaryController_15.saveLector(),
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

  // @LINE:118
  private[this] lazy val controllers_SalaryController_printLector74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector74_invoker = createInvoker(
    SalaryController_15.printLector(fakeValue[Long]),
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

  // @LINE:119
  private[this] lazy val controllers_SalaryController_detailsListLector75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector75_invoker = createInvoker(
    SalaryController_15.detailsListLector(fakeValue[Long]),
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

  // @LINE:123
  private[this] lazy val controllers_Assets_at76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at76_invoker = createInvoker(
    Assets_23.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_24.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_24.pdf())
      }
  
    // @LINE:8
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_24.index())
      }
  
    // @LINE:9
    case controllers_TestController_test3_route(params) =>
      call { 
        controllers_TestController_test3_invoker.call(TestController_19.test())
      }
  
    // @LINE:11
    case controllers_TestController_save4_route(params) =>
      call { 
        controllers_TestController_save4_invoker.call(TestController_19.save())
      }
  
    // @LINE:13
    case controllers_Application_kpiChoosePerson5_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson5_invoker.call(Application_24.kpiChoosePerson())
      }
  
    // @LINE:14
    case controllers_SalaryController_getPerson6_route(params) =>
      call { 
        controllers_SalaryController_getPerson6_invoker.call(SalaryController_15.getPerson())
      }
  
    // @LINE:15
    case controllers_Login_index7_route(params) =>
      call { 
        controllers_Login_index7_invoker.call(Login_21.index())
      }
  
    // @LINE:16
    case controllers_Login_authenticate8_route(params) =>
      call { 
        controllers_Login_authenticate8_invoker.call(Login_21.authenticate())
      }
  
    // @LINE:17
    case controllers_Charts_flot9_route(params) =>
      call { 
        controllers_Charts_flot9_invoker.call(Charts_25.flot())
      }
  
    // @LINE:18
    case controllers_Charts_morris10_route(params) =>
      call { 
        controllers_Charts_morris10_invoker.call(Charts_25.morris())
      }
  
    // @LINE:19
    case controllers_Application_tables11_route(params) =>
      call { 
        controllers_Application_tables11_invoker.call(Application_24.tables())
      }
  
    // @LINE:20
    case controllers_Application_forms12_route(params) =>
      call { 
        controllers_Application_forms12_invoker.call(Application_24.forms())
      }
  
    // @LINE:21
    case controllers_UiElements_panelsAndWells13_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells13_invoker.call(UiElements_18.panelsAndWells())
      }
  
    // @LINE:22
    case controllers_UiElements_buttons14_route(params) =>
      call { 
        controllers_UiElements_buttons14_invoker.call(UiElements_18.buttons())
      }
  
    // @LINE:23
    case controllers_UiElements_notifications15_route(params) =>
      call { 
        controllers_UiElements_notifications15_invoker.call(UiElements_18.notifications())
      }
  
    // @LINE:24
    case controllers_UiElements_typography16_route(params) =>
      call { 
        controllers_UiElements_typography16_invoker.call(UiElements_18.typography())
      }
  
    // @LINE:25
    case controllers_UiElements_icons17_route(params) =>
      call { 
        controllers_UiElements_icons17_invoker.call(UiElements_18.icons())
      }
  
    // @LINE:26
    case controllers_UiElements_grid18_route(params) =>
      call { 
        controllers_UiElements_grid18_invoker.call(UiElements_18.grid())
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
        controllers_ProjectController_index24_invoker.call(ProjectController_14.index())
      }
  
    // @LINE:37
    case controllers_ProjectController_save25_route(params) =>
      call { 
        controllers_ProjectController_save25_invoker.call(ProjectController_14.save())
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
  
    // @LINE:48
    case controllers_OrganizationalUnitsController_indexParticipants32_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_indexParticipants32_invoker.call(OrganizationalUnitsController_11.indexParticipants())
      }
  
    // @LINE:49
    case controllers_OrganizationalUnitsController_saveParticipants33_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_saveParticipants33_invoker.call(OrganizationalUnitsController_11.saveParticipants())
      }
  
    // @LINE:52
    case controllers_EmployeesController_index34_route(params) =>
      call { 
        controllers_EmployeesController_index34_invoker.call(EmployeesController_20.index())
      }
  
    // @LINE:53
    case controllers_EmployeesController_save35_route(params) =>
      call { 
        controllers_EmployeesController_save35_invoker.call(EmployeesController_20.save())
      }
  
    // @LINE:56
    case controllers_SubjectController_index36_route(params) =>
      call { 
        controllers_SubjectController_index36_invoker.call(SubjectController_26.index())
      }
  
    // @LINE:57
    case controllers_SubjectController_save37_route(params) =>
      call { 
        controllers_SubjectController_save37_invoker.call(SubjectController_26.save())
      }
  
    // @LINE:60
    case controllers_FieldOfStudyController_index38_route(params) =>
      call { 
        controllers_FieldOfStudyController_index38_invoker.call(FieldOfStudyController_10.index())
      }
  
    // @LINE:61
    case controllers_FieldOfStudyController_save39_route(params) =>
      call { 
        controllers_FieldOfStudyController_save39_invoker.call(FieldOfStudyController_10.save())
      }
  
    // @LINE:63
    case controllers_PersonalStatisticController_index40_route(params) =>
      call { 
        controllers_PersonalStatisticController_index40_invoker.call(PersonalStatisticController_13.index())
      }
  
    // @LINE:66
    case controllers_StudyGroupsController_index41_route(params) =>
      call { 
        controllers_StudyGroupsController_index41_invoker.call(StudyGroupsController_6.index())
      }
  
    // @LINE:67
    case controllers_StudyGroupsController_save42_route(params) =>
      call { 
        controllers_StudyGroupsController_save42_invoker.call(StudyGroupsController_6.save())
      }
  
    // @LINE:68
    case controllers_TableController_listStudyGroups43_route(params) =>
      call { 
        controllers_TableController_listStudyGroups43_invoker.call(TableController_16.listStudyGroups())
      }
  
    // @LINE:71
    case controllers_SemestersController_index44_route(params) =>
      call { 
        controllers_SemestersController_index44_invoker.call(SemestersController_22.index())
      }
  
    // @LINE:72
    case controllers_SemestersController_save45_route(params) =>
      call { 
        controllers_SemestersController_save45_invoker.call(SemestersController_22.save())
      }
  
    // @LINE:73
    case controllers_TableController_listSemesters46_route(params) =>
      call { 
        controllers_TableController_listSemesters46_invoker.call(TableController_16.listSemesters())
      }
  
    // @LINE:76
    case controllers_StudyPlansController_index47_route(params) =>
      call { 
        controllers_StudyPlansController_index47_invoker.call(StudyPlansController_12.index())
      }
  
    // @LINE:77
    case controllers_StudyPlansController_save48_route(params) =>
      call { 
        controllers_StudyPlansController_save48_invoker.call(StudyPlansController_12.save())
      }
  
    // @LINE:78
    case controllers_TableController_listStudyPlans49_route(params) =>
      call { 
        controllers_TableController_listStudyPlans49_invoker.call(TableController_16.listStudyPlans())
      }
  
    // @LINE:80
    case controllers_CourseController_index50_route(params) =>
      call { 
        controllers_CourseController_index50_invoker.call(CourseController_3.index())
      }
  
    // @LINE:81
    case controllers_CourseController_save51_route(params) =>
      call { 
        controllers_CourseController_save51_invoker.call(CourseController_3.save())
      }
  
    // @LINE:83
    case controllers_TableController_listScheduleInWeeks52_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks52_invoker.call(TableController_16.listScheduleInWeeks())
      }
  
    // @LINE:85
    case controllers_TableController_listSchedule53_route(params) =>
      call { 
        controllers_TableController_listSchedule53_invoker.call(TableController_16.listSchedule())
      }
  
    // @LINE:86
    case controllers_TableController_listEmployees54_route(params) =>
      call { 
        controllers_TableController_listEmployees54_invoker.call(TableController_16.listEmployees())
      }
  
    // @LINE:87
    case controllers_TableController_listTeachers55_route(params) =>
      call { 
        controllers_TableController_listTeachers55_invoker.call(TableController_16.listTeachers())
      }
  
    // @LINE:88
    case controllers_TableController_listSubjects56_route(params) =>
      call { 
        controllers_TableController_listSubjects56_invoker.call(TableController_16.listSubjects())
      }
  
    // @LINE:89
    case controllers_TableController_listFieldsOfStudy57_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy57_invoker.call(TableController_16.listFieldsOfStudy())
      }
  
    // @LINE:90
    case controllers_TableController_listCourses58_route(params) =>
      call { 
        controllers_TableController_listCourses58_invoker.call(TableController_16.listCourses())
      }
  
    // @LINE:91
    case controllers_TableController_listCurrentSemesters59_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters59_invoker.call(TableController_16.listCurrentSemesters())
      }
  
    // @LINE:92
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy60_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy60_invoker.call(TableController_16.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:93
    case controllers_TableController_listDays61_route(params) =>
      call { 
        controllers_TableController_listDays61_invoker.call(TableController_16.listDays())
      }
  
    // @LINE:95
    case controllers_TeachersController_index62_route(params) =>
      call { 
        controllers_TeachersController_index62_invoker.call(TeachersController_8.index())
      }
  
    // @LINE:96
    case controllers_TeachersController_save63_route(params) =>
      call { 
        controllers_TeachersController_save63_invoker.call(TeachersController_8.save())
      }
  
    // @LINE:99
    case controllers_MethodicsController_index64_route(params) =>
      call { 
        controllers_MethodicsController_index64_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:100
    case controllers_MethodicsController_save65_route(params) =>
      call { 
        controllers_MethodicsController_save65_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:102
    case controllers_Application_roles66_route(params) =>
      call { 
        controllers_Application_roles66_invoker.call(Application_24.roles())
      }
  
    // @LINE:105
    case controllers_TableController_listPerson67_route(params) =>
      call { 
        controllers_TableController_listPerson67_invoker.call(TableController_16.listPerson())
      }
  
    // @LINE:107
    case controllers_SubjectPlanTeachingController_index68_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index68_invoker.call(SubjectPlanTeachingController_9.index())
      }
  
    // @LINE:108
    case controllers_SubjectPlanTeachingController_save69_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save69_invoker.call(SubjectPlanTeachingController_9.save())
      }
  
    // @LINE:111
    case controllers_Application_logout70_route(params) =>
      call { 
        controllers_Application_logout70_invoker.call(Application_24.logout())
      }
  
    // @LINE:114
    case controllers_PrintController_printUserDetails71_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails71_invoker.call(PrintController_17.printUserDetails(id))
      }
  
    // @LINE:115
    case controllers_PrintController_detailsList72_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList72_invoker.call(PrintController_17.detailsList(id))
      }
  
    // @LINE:117
    case controllers_SalaryController_saveLector73_route(params) =>
      call { 
        controllers_SalaryController_saveLector73_invoker.call(SalaryController_15.saveLector())
      }
  
    // @LINE:118
    case controllers_SalaryController_printLector74_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector74_invoker.call(SalaryController_15.printLector(id))
      }
  
    // @LINE:119
    case controllers_SalaryController_detailsListLector75_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector75_invoker.call(SalaryController_15.detailsListLector(id))
      }
  
    // @LINE:123
    case controllers_Assets_at76_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at76_invoker.call(Assets_23.at(path, file))
      }
  }
}
