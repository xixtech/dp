
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Thu Apr 27 11:13:32 CEST 2017

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
  Application_26: controllers.Application,
  // @LINE:10
  TestController_20: controllers.TestController,
  // @LINE:15
  SalaryController_16: controllers.SalaryController,
  // @LINE:16
  Login_22: controllers.Login,
  // @LINE:18
  Charts_27: controllers.Charts,
  // @LINE:22
  UiElements_19: controllers.UiElements,
  // @LINE:28
  Pages_5: controllers.Pages,
  // @LINE:31
  PersonController_2: controllers.PersonController,
  // @LINE:34
  VisitsController_1: controllers.VisitsController,
  // @LINE:37
  ProjectController_15: controllers.ProjectController,
  // @LINE:40
  FinalWorksController_6: controllers.FinalWorksController,
  // @LINE:43
  PublicationsController_8: controllers.PublicationsController,
  // @LINE:46
  OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
  // @LINE:53
  EmployeesController_21: controllers.EmployeesController,
  // @LINE:61
  SubjectController_28: controllers.SubjectController,
  // @LINE:65
  FieldOfStudyController_11: controllers.FieldOfStudyController,
  // @LINE:68
  CommitteeController_25: controllers.CommitteeController,
  // @LINE:71
  PersonalStatisticController_14: controllers.PersonalStatisticController,
  // @LINE:73
  StatisticController_4: controllers.StatisticController,
  // @LINE:76
  StudyGroupsController_7: controllers.StudyGroupsController,
  // @LINE:78
  TableController_17: controllers.TableController,
  // @LINE:81
  SemestersController_23: controllers.SemestersController,
  // @LINE:86
  StudyPlansController_13: controllers.StudyPlansController,
  // @LINE:90
  CourseController_3: controllers.CourseController,
  // @LINE:112
  TeachersController_9: controllers.TeachersController,
  // @LINE:116
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:124
  SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
  // @LINE:131
  PrintController_18: controllers.PrintController,
  // @LINE:140
  Assets_24: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_26: controllers.Application,
    // @LINE:10
    TestController_20: controllers.TestController,
    // @LINE:15
    SalaryController_16: controllers.SalaryController,
    // @LINE:16
    Login_22: controllers.Login,
    // @LINE:18
    Charts_27: controllers.Charts,
    // @LINE:22
    UiElements_19: controllers.UiElements,
    // @LINE:28
    Pages_5: controllers.Pages,
    // @LINE:31
    PersonController_2: controllers.PersonController,
    // @LINE:34
    VisitsController_1: controllers.VisitsController,
    // @LINE:37
    ProjectController_15: controllers.ProjectController,
    // @LINE:40
    FinalWorksController_6: controllers.FinalWorksController,
    // @LINE:43
    PublicationsController_8: controllers.PublicationsController,
    // @LINE:46
    OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
    // @LINE:53
    EmployeesController_21: controllers.EmployeesController,
    // @LINE:61
    SubjectController_28: controllers.SubjectController,
    // @LINE:65
    FieldOfStudyController_11: controllers.FieldOfStudyController,
    // @LINE:68
    CommitteeController_25: controllers.CommitteeController,
    // @LINE:71
    PersonalStatisticController_14: controllers.PersonalStatisticController,
    // @LINE:73
    StatisticController_4: controllers.StatisticController,
    // @LINE:76
    StudyGroupsController_7: controllers.StudyGroupsController,
    // @LINE:78
    TableController_17: controllers.TableController,
    // @LINE:81
    SemestersController_23: controllers.SemestersController,
    // @LINE:86
    StudyPlansController_13: controllers.StudyPlansController,
    // @LINE:90
    CourseController_3: controllers.CourseController,
    // @LINE:112
    TeachersController_9: controllers.TeachersController,
    // @LINE:116
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:124
    SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
    // @LINE:131
    PrintController_18: controllers.PrintController,
    // @LINE:140
    Assets_24: controllers.Assets
  ) = this(errorHandler, Application_26, TestController_20, SalaryController_16, Login_22, Charts_27, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, SubjectController_28, FieldOfStudyController_11, CommitteeController_25, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_23, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_24, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_26, TestController_20, SalaryController_16, Login_22, Charts_27, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, SubjectController_28, FieldOfStudyController_11, CommitteeController_25, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_23, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_24, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.dashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdf""", """controllers.Application.pdf()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """raw""", """controllers.Application.raw()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/info/""" + "$" + """email<[^/]+>""", """controllers.EmployeesController.info(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/edit/""" + "$" + """email<[^/]+>""", """controllers.EmployeesController.edit(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/updated/""", """controllers.EmployeesController.update(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/delete""", """controllers.EmployeesController.delete(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/add""", """controllers.SubjectController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/saved""", """controllers.SubjectController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/add""", """controllers.FieldOfStudyController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/saved""", """controllers.FieldOfStudyController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committee/add""", """controllers.CommitteeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committee/saved""", """controllers.CommitteeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.PersonalStatisticController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dcps""", """controllers.StatisticController.index()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committees""", """controllers.TableController.listCommittees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publications""", """controllers.TableController.listPublications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tiw""", """controllers.TableController.listTeachersInWeeks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat""", """controllers.StatisticController.listEmployeesActvitiy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat/info/""" + "$" + """email<[^/]+>""", """controllers.StatisticController.listEmployeerActvitiy(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teaching""", """controllers.PersonalStatisticController.listTableTeachingAccordingToPersons()"""),
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
    Application_26.dashboard(),
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
    Application_26.pdf(),
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
  private[this] lazy val controllers_Application_raw2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("raw")))
  )
  private[this] lazy val controllers_Application_raw2_invoker = createInvoker(
    Application_26.raw(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "raw",
      Nil,
      "GET",
      """""",
      this.prefix + """raw"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index3_invoker = createInvoker(
    Application_26.index(),
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

  // @LINE:10
  private[this] lazy val controllers_TestController_test4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_TestController_test4_invoker = createInvoker(
    TestController_20.test(),
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

  // @LINE:12
  private[this] lazy val controllers_TestController_save5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/ok")))
  )
  private[this] lazy val controllers_TestController_save5_invoker = createInvoker(
    TestController_20.save(),
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

  // @LINE:14
  private[this] lazy val controllers_Application_kpiChoosePerson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi")))
  )
  private[this] lazy val controllers_Application_kpiChoosePerson6_invoker = createInvoker(
    Application_26.kpiChoosePerson(),
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

  // @LINE:15
  private[this] lazy val controllers_SalaryController_getPerson7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi/k")))
  )
  private[this] lazy val controllers_SalaryController_getPerson7_invoker = createInvoker(
    SalaryController_16.getPerson(),
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

  // @LINE:16
  private[this] lazy val controllers_Login_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_index8_invoker = createInvoker(
    Login_22.index(),
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

  // @LINE:17
  private[this] lazy val controllers_Login_authenticate9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Login_authenticate9_invoker = createInvoker(
    Login_22.authenticate(),
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

  // @LINE:18
  private[this] lazy val controllers_Charts_flot10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/flot")))
  )
  private[this] lazy val controllers_Charts_flot10_invoker = createInvoker(
    Charts_27.flot(),
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

  // @LINE:19
  private[this] lazy val controllers_Charts_morris11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/morris")))
  )
  private[this] lazy val controllers_Charts_morris11_invoker = createInvoker(
    Charts_27.morris(),
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

  // @LINE:20
  private[this] lazy val controllers_Application_tables12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tables")))
  )
  private[this] lazy val controllers_Application_tables12_invoker = createInvoker(
    Application_26.tables(),
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

  // @LINE:21
  private[this] lazy val controllers_Application_forms13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms13_invoker = createInvoker(
    Application_26.forms(),
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

  // @LINE:22
  private[this] lazy val controllers_UiElements_panelsAndWells14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/panels-and-wells")))
  )
  private[this] lazy val controllers_UiElements_panelsAndWells14_invoker = createInvoker(
    UiElements_19.panelsAndWells(),
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

  // @LINE:23
  private[this] lazy val controllers_UiElements_buttons15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/buttons")))
  )
  private[this] lazy val controllers_UiElements_buttons15_invoker = createInvoker(
    UiElements_19.buttons(),
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

  // @LINE:24
  private[this] lazy val controllers_UiElements_notifications16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/notifications")))
  )
  private[this] lazy val controllers_UiElements_notifications16_invoker = createInvoker(
    UiElements_19.notifications(),
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

  // @LINE:25
  private[this] lazy val controllers_UiElements_typography17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/typography")))
  )
  private[this] lazy val controllers_UiElements_typography17_invoker = createInvoker(
    UiElements_19.typography(),
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

  // @LINE:26
  private[this] lazy val controllers_UiElements_icons18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/icons")))
  )
  private[this] lazy val controllers_UiElements_icons18_invoker = createInvoker(
    UiElements_19.icons(),
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

  // @LINE:27
  private[this] lazy val controllers_UiElements_grid19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/grid")))
  )
  private[this] lazy val controllers_UiElements_grid19_invoker = createInvoker(
    UiElements_19.grid(),
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

  // @LINE:28
  private[this] lazy val controllers_Pages_blank20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pages/blank")))
  )
  private[this] lazy val controllers_Pages_blank20_invoker = createInvoker(
    Pages_5.blank(),
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

  // @LINE:31
  private[this] lazy val controllers_PersonController_index21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/register")))
  )
  private[this] lazy val controllers_PersonController_index21_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_PersonController_save22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/saved")))
  )
  private[this] lazy val controllers_PersonController_save22_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_VisitsController_index23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visit/register")))
  )
  private[this] lazy val controllers_VisitsController_index23_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_VisitsController_save24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("visit/saved")))
  )
  private[this] lazy val controllers_VisitsController_save24_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_ProjectController_index25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/register")))
  )
  private[this] lazy val controllers_ProjectController_index25_invoker = createInvoker(
    ProjectController_15.index(),
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

  // @LINE:38
  private[this] lazy val controllers_ProjectController_save26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/saved")))
  )
  private[this] lazy val controllers_ProjectController_save26_invoker = createInvoker(
    ProjectController_15.save(),
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

  // @LINE:40
  private[this] lazy val controllers_FinalWorksController_index27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/register")))
  )
  private[this] lazy val controllers_FinalWorksController_index27_invoker = createInvoker(
    FinalWorksController_6.index(),
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

  // @LINE:41
  private[this] lazy val controllers_FinalWorksController_save28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/saved")))
  )
  private[this] lazy val controllers_FinalWorksController_save28_invoker = createInvoker(
    FinalWorksController_6.save(),
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

  // @LINE:43
  private[this] lazy val controllers_PublicationsController_index29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/register")))
  )
  private[this] lazy val controllers_PublicationsController_index29_invoker = createInvoker(
    PublicationsController_8.index(),
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

  // @LINE:44
  private[this] lazy val controllers_PublicationsController_save30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/saved")))
  )
  private[this] lazy val controllers_PublicationsController_save30_invoker = createInvoker(
    PublicationsController_8.save(),
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
  private[this] lazy val controllers_OrganizationalUnitsController_index31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_index31_invoker = createInvoker(
    OrganizationalUnitsController_12.index(),
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

  // @LINE:47
  private[this] lazy val controllers_OrganizationalUnitsController_save32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_save32_invoker = createInvoker(
    OrganizationalUnitsController_12.save(),
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
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants33_invoker = createInvoker(
    OrganizationalUnitsController_12.indexParticipants(),
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

  // @LINE:50
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants34_invoker = createInvoker(
    OrganizationalUnitsController_12.saveParticipants(),
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

  // @LINE:53
  private[this] lazy val controllers_EmployeesController_index35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index35_invoker = createInvoker(
    EmployeesController_21.index(),
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

  // @LINE:54
  private[this] lazy val controllers_EmployeesController_save36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save36_invoker = createInvoker(
    EmployeesController_21.save(),
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

  // @LINE:55
  private[this] lazy val controllers_EmployeesController_info37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/info/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_info37_invoker = createInvoker(
    EmployeesController_21.info(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "info",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """employee/info/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_EmployeesController_edit38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/edit/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_edit38_invoker = createInvoker(
    EmployeesController_21.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "edit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """employee/edit/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_EmployeesController_update39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/updated/")))
  )
  private[this] lazy val controllers_EmployeesController_update39_invoker = createInvoker(
    EmployeesController_21.update(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "update",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """employee/updated/"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_EmployeesController_delete40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/delete")))
  )
  private[this] lazy val controllers_EmployeesController_delete40_invoker = createInvoker(
    EmployeesController_21.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "delete",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """employee/delete"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_SubjectController_index41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index41_invoker = createInvoker(
    SubjectController_28.index(),
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

  // @LINE:62
  private[this] lazy val controllers_SubjectController_save42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save42_invoker = createInvoker(
    SubjectController_28.save(),
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

  // @LINE:65
  private[this] lazy val controllers_FieldOfStudyController_index43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index43_invoker = createInvoker(
    FieldOfStudyController_11.index(),
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

  // @LINE:66
  private[this] lazy val controllers_FieldOfStudyController_save44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save44_invoker = createInvoker(
    FieldOfStudyController_11.save(),
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

  // @LINE:68
  private[this] lazy val controllers_CommitteeController_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/add")))
  )
  private[this] lazy val controllers_CommitteeController_index45_invoker = createInvoker(
    CommitteeController_25.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommitteeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """committee/add"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_CommitteeController_save46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/saved")))
  )
  private[this] lazy val controllers_CommitteeController_save46_invoker = createInvoker(
    CommitteeController_25.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommitteeController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """committee/saved"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_PersonalStatisticController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index47_invoker = createInvoker(
    PersonalStatisticController_14.index(),
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

  // @LINE:73
  private[this] lazy val controllers_StatisticController_index48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcps")))
  )
  private[this] lazy val controllers_StatisticController_index48_invoker = createInvoker(
    StatisticController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dcps"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_StudyGroupsController_index49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index49_invoker = createInvoker(
    StudyGroupsController_7.index(),
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

  // @LINE:77
  private[this] lazy val controllers_StudyGroupsController_save50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save50_invoker = createInvoker(
    StudyGroupsController_7.save(),
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

  // @LINE:78
  private[this] lazy val controllers_TableController_listStudyGroups51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups51_invoker = createInvoker(
    TableController_17.listStudyGroups(),
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

  // @LINE:81
  private[this] lazy val controllers_SemestersController_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index52_invoker = createInvoker(
    SemestersController_23.index(),
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

  // @LINE:82
  private[this] lazy val controllers_SemestersController_save53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save53_invoker = createInvoker(
    SemestersController_23.save(),
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

  // @LINE:83
  private[this] lazy val controllers_TableController_listSemesters54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters54_invoker = createInvoker(
    TableController_17.listSemesters(),
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

  // @LINE:86
  private[this] lazy val controllers_StudyPlansController_index55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index55_invoker = createInvoker(
    StudyPlansController_13.index(),
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

  // @LINE:87
  private[this] lazy val controllers_StudyPlansController_save56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save56_invoker = createInvoker(
    StudyPlansController_13.save(),
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

  // @LINE:88
  private[this] lazy val controllers_TableController_listStudyPlans57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans57_invoker = createInvoker(
    TableController_17.listStudyPlans(),
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

  // @LINE:90
  private[this] lazy val controllers_CourseController_index58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index58_invoker = createInvoker(
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

  // @LINE:91
  private[this] lazy val controllers_CourseController_save59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save59_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_TableController_listScheduleInWeeks60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks60_invoker = createInvoker(
    TableController_17.listScheduleInWeeks(),
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

  // @LINE:95
  private[this] lazy val controllers_TableController_listSchedule61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule61_invoker = createInvoker(
    TableController_17.listSchedule(),
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

  // @LINE:96
  private[this] lazy val controllers_TableController_listEmployees62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees62_invoker = createInvoker(
    TableController_17.listEmployees(),
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

  // @LINE:97
  private[this] lazy val controllers_TableController_listTeachers63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers63_invoker = createInvoker(
    TableController_17.listTeachers(),
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

  // @LINE:98
  private[this] lazy val controllers_TableController_listSubjects64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects64_invoker = createInvoker(
    TableController_17.listSubjects(),
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

  // @LINE:99
  private[this] lazy val controllers_TableController_listFieldsOfStudy65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy65_invoker = createInvoker(
    TableController_17.listFieldsOfStudy(),
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

  // @LINE:100
  private[this] lazy val controllers_TableController_listCourses66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses66_invoker = createInvoker(
    TableController_17.listCourses(),
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

  // @LINE:101
  private[this] lazy val controllers_TableController_listCurrentSemesters67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters67_invoker = createInvoker(
    TableController_17.listCurrentSemesters(),
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

  // @LINE:102
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy68_invoker = createInvoker(
    TableController_17.listCurrentSemestersUntilTheEndOfStudy(),
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

  // @LINE:103
  private[this] lazy val controllers_TableController_listDays69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays69_invoker = createInvoker(
    TableController_17.listDays(),
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

  // @LINE:104
  private[this] lazy val controllers_TableController_listCommittees70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committees")))
  )
  private[this] lazy val controllers_TableController_listCommittees70_invoker = createInvoker(
    TableController_17.listCommittees(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listCommittees",
      Nil,
      "GET",
      """""",
      this.prefix + """committees"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_TableController_listPublications71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_TableController_listPublications71_invoker = createInvoker(
    TableController_17.listPublications(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listPublications",
      Nil,
      "GET",
      """""",
      this.prefix + """publications"""
    )
  )

  // @LINE:106
  private[this] lazy val controllers_TableController_listTeachersInWeeks72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tiw")))
  )
  private[this] lazy val controllers_TableController_listTeachersInWeeks72_invoker = createInvoker(
    TableController_17.listTeachersInWeeks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listTeachersInWeeks",
      Nil,
      "GET",
      """""",
      this.prefix + """tiw"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat")))
  )
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy73_invoker = createInvoker(
    StatisticController_4.listEmployeesActvitiy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "listEmployeesActvitiy",
      Nil,
      "GET",
      """""",
      this.prefix + """estat"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat/info/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy74_invoker = createInvoker(
    StatisticController_4.listEmployeerActvitiy(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "listEmployeerActvitiy",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """estat/info/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:110
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching")))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons75_invoker = createInvoker(
    PersonalStatisticController_14.listTableTeachingAccordingToPersons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "listTableTeachingAccordingToPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """teaching"""
    )
  )

  // @LINE:112
  private[this] lazy val controllers_TeachersController_index76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index76_invoker = createInvoker(
    TeachersController_9.index(),
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

  // @LINE:113
  private[this] lazy val controllers_TeachersController_save77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save77_invoker = createInvoker(
    TeachersController_9.save(),
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

  // @LINE:116
  private[this] lazy val controllers_MethodicsController_index78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index78_invoker = createInvoker(
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

  // @LINE:117
  private[this] lazy val controllers_MethodicsController_save79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save79_invoker = createInvoker(
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

  // @LINE:119
  private[this] lazy val controllers_Application_roles80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles80_invoker = createInvoker(
    Application_26.roles(),
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

  // @LINE:122
  private[this] lazy val controllers_TableController_listPerson81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson81_invoker = createInvoker(
    TableController_17.listPerson(),
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

  // @LINE:124
  private[this] lazy val controllers_SubjectPlanTeachingController_index82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index82_invoker = createInvoker(
    SubjectPlanTeachingController_10.index(),
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

  // @LINE:125
  private[this] lazy val controllers_SubjectPlanTeachingController_save83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save83_invoker = createInvoker(
    SubjectPlanTeachingController_10.save(),
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

  // @LINE:128
  private[this] lazy val controllers_Application_logout84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout84_invoker = createInvoker(
    Application_26.logout(),
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

  // @LINE:131
  private[this] lazy val controllers_PrintController_printUserDetails85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails85_invoker = createInvoker(
    PrintController_18.printUserDetails(fakeValue[Long]),
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

  // @LINE:132
  private[this] lazy val controllers_PrintController_detailsList86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList86_invoker = createInvoker(
    PrintController_18.detailsList(fakeValue[Long]),
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

  // @LINE:134
  private[this] lazy val controllers_SalaryController_saveLector87_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector87_invoker = createInvoker(
    SalaryController_16.saveLector(),
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

  // @LINE:135
  private[this] lazy val controllers_SalaryController_printLector88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector88_invoker = createInvoker(
    SalaryController_16.printLector(fakeValue[Long]),
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

  // @LINE:136
  private[this] lazy val controllers_SalaryController_detailsListLector89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector89_invoker = createInvoker(
    SalaryController_16.detailsListLector(fakeValue[Long]),
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

  // @LINE:140
  private[this] lazy val controllers_Assets_at90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at90_invoker = createInvoker(
    Assets_24.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_26.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_26.pdf())
      }
  
    // @LINE:8
    case controllers_Application_raw2_route(params) =>
      call { 
        controllers_Application_raw2_invoker.call(Application_26.raw())
      }
  
    // @LINE:9
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(Application_26.index())
      }
  
    // @LINE:10
    case controllers_TestController_test4_route(params) =>
      call { 
        controllers_TestController_test4_invoker.call(TestController_20.test())
      }
  
    // @LINE:12
    case controllers_TestController_save5_route(params) =>
      call { 
        controllers_TestController_save5_invoker.call(TestController_20.save())
      }
  
    // @LINE:14
    case controllers_Application_kpiChoosePerson6_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson6_invoker.call(Application_26.kpiChoosePerson())
      }
  
    // @LINE:15
    case controllers_SalaryController_getPerson7_route(params) =>
      call { 
        controllers_SalaryController_getPerson7_invoker.call(SalaryController_16.getPerson())
      }
  
    // @LINE:16
    case controllers_Login_index8_route(params) =>
      call { 
        controllers_Login_index8_invoker.call(Login_22.index())
      }
  
    // @LINE:17
    case controllers_Login_authenticate9_route(params) =>
      call { 
        controllers_Login_authenticate9_invoker.call(Login_22.authenticate())
      }
  
    // @LINE:18
    case controllers_Charts_flot10_route(params) =>
      call { 
        controllers_Charts_flot10_invoker.call(Charts_27.flot())
      }
  
    // @LINE:19
    case controllers_Charts_morris11_route(params) =>
      call { 
        controllers_Charts_morris11_invoker.call(Charts_27.morris())
      }
  
    // @LINE:20
    case controllers_Application_tables12_route(params) =>
      call { 
        controllers_Application_tables12_invoker.call(Application_26.tables())
      }
  
    // @LINE:21
    case controllers_Application_forms13_route(params) =>
      call { 
        controllers_Application_forms13_invoker.call(Application_26.forms())
      }
  
    // @LINE:22
    case controllers_UiElements_panelsAndWells14_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells14_invoker.call(UiElements_19.panelsAndWells())
      }
  
    // @LINE:23
    case controllers_UiElements_buttons15_route(params) =>
      call { 
        controllers_UiElements_buttons15_invoker.call(UiElements_19.buttons())
      }
  
    // @LINE:24
    case controllers_UiElements_notifications16_route(params) =>
      call { 
        controllers_UiElements_notifications16_invoker.call(UiElements_19.notifications())
      }
  
    // @LINE:25
    case controllers_UiElements_typography17_route(params) =>
      call { 
        controllers_UiElements_typography17_invoker.call(UiElements_19.typography())
      }
  
    // @LINE:26
    case controllers_UiElements_icons18_route(params) =>
      call { 
        controllers_UiElements_icons18_invoker.call(UiElements_19.icons())
      }
  
    // @LINE:27
    case controllers_UiElements_grid19_route(params) =>
      call { 
        controllers_UiElements_grid19_invoker.call(UiElements_19.grid())
      }
  
    // @LINE:28
    case controllers_Pages_blank20_route(params) =>
      call { 
        controllers_Pages_blank20_invoker.call(Pages_5.blank())
      }
  
    // @LINE:31
    case controllers_PersonController_index21_route(params) =>
      call { 
        controllers_PersonController_index21_invoker.call(PersonController_2.index())
      }
  
    // @LINE:32
    case controllers_PersonController_save22_route(params) =>
      call { 
        controllers_PersonController_save22_invoker.call(PersonController_2.save())
      }
  
    // @LINE:34
    case controllers_VisitsController_index23_route(params) =>
      call { 
        controllers_VisitsController_index23_invoker.call(VisitsController_1.index())
      }
  
    // @LINE:35
    case controllers_VisitsController_save24_route(params) =>
      call { 
        controllers_VisitsController_save24_invoker.call(VisitsController_1.save())
      }
  
    // @LINE:37
    case controllers_ProjectController_index25_route(params) =>
      call { 
        controllers_ProjectController_index25_invoker.call(ProjectController_15.index())
      }
  
    // @LINE:38
    case controllers_ProjectController_save26_route(params) =>
      call { 
        controllers_ProjectController_save26_invoker.call(ProjectController_15.save())
      }
  
    // @LINE:40
    case controllers_FinalWorksController_index27_route(params) =>
      call { 
        controllers_FinalWorksController_index27_invoker.call(FinalWorksController_6.index())
      }
  
    // @LINE:41
    case controllers_FinalWorksController_save28_route(params) =>
      call { 
        controllers_FinalWorksController_save28_invoker.call(FinalWorksController_6.save())
      }
  
    // @LINE:43
    case controllers_PublicationsController_index29_route(params) =>
      call { 
        controllers_PublicationsController_index29_invoker.call(PublicationsController_8.index())
      }
  
    // @LINE:44
    case controllers_PublicationsController_save30_route(params) =>
      call { 
        controllers_PublicationsController_save30_invoker.call(PublicationsController_8.save())
      }
  
    // @LINE:46
    case controllers_OrganizationalUnitsController_index31_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_index31_invoker.call(OrganizationalUnitsController_12.index())
      }
  
    // @LINE:47
    case controllers_OrganizationalUnitsController_save32_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_save32_invoker.call(OrganizationalUnitsController_12.save())
      }
  
    // @LINE:49
    case controllers_OrganizationalUnitsController_indexParticipants33_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_indexParticipants33_invoker.call(OrganizationalUnitsController_12.indexParticipants())
      }
  
    // @LINE:50
    case controllers_OrganizationalUnitsController_saveParticipants34_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_saveParticipants34_invoker.call(OrganizationalUnitsController_12.saveParticipants())
      }
  
    // @LINE:53
    case controllers_EmployeesController_index35_route(params) =>
      call { 
        controllers_EmployeesController_index35_invoker.call(EmployeesController_21.index())
      }
  
    // @LINE:54
    case controllers_EmployeesController_save36_route(params) =>
      call { 
        controllers_EmployeesController_save36_invoker.call(EmployeesController_21.save())
      }
  
    // @LINE:55
    case controllers_EmployeesController_info37_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_EmployeesController_info37_invoker.call(EmployeesController_21.info(email))
      }
  
    // @LINE:56
    case controllers_EmployeesController_edit38_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_EmployeesController_edit38_invoker.call(EmployeesController_21.edit(email))
      }
  
    // @LINE:57
    case controllers_EmployeesController_update39_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_EmployeesController_update39_invoker.call(EmployeesController_21.update(email))
      }
  
    // @LINE:58
    case controllers_EmployeesController_delete40_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_EmployeesController_delete40_invoker.call(EmployeesController_21.delete(email))
      }
  
    // @LINE:61
    case controllers_SubjectController_index41_route(params) =>
      call { 
        controllers_SubjectController_index41_invoker.call(SubjectController_28.index())
      }
  
    // @LINE:62
    case controllers_SubjectController_save42_route(params) =>
      call { 
        controllers_SubjectController_save42_invoker.call(SubjectController_28.save())
      }
  
    // @LINE:65
    case controllers_FieldOfStudyController_index43_route(params) =>
      call { 
        controllers_FieldOfStudyController_index43_invoker.call(FieldOfStudyController_11.index())
      }
  
    // @LINE:66
    case controllers_FieldOfStudyController_save44_route(params) =>
      call { 
        controllers_FieldOfStudyController_save44_invoker.call(FieldOfStudyController_11.save())
      }
  
    // @LINE:68
    case controllers_CommitteeController_index45_route(params) =>
      call { 
        controllers_CommitteeController_index45_invoker.call(CommitteeController_25.index())
      }
  
    // @LINE:69
    case controllers_CommitteeController_save46_route(params) =>
      call { 
        controllers_CommitteeController_save46_invoker.call(CommitteeController_25.save())
      }
  
    // @LINE:71
    case controllers_PersonalStatisticController_index47_route(params) =>
      call { 
        controllers_PersonalStatisticController_index47_invoker.call(PersonalStatisticController_14.index())
      }
  
    // @LINE:73
    case controllers_StatisticController_index48_route(params) =>
      call { 
        controllers_StatisticController_index48_invoker.call(StatisticController_4.index())
      }
  
    // @LINE:76
    case controllers_StudyGroupsController_index49_route(params) =>
      call { 
        controllers_StudyGroupsController_index49_invoker.call(StudyGroupsController_7.index())
      }
  
    // @LINE:77
    case controllers_StudyGroupsController_save50_route(params) =>
      call { 
        controllers_StudyGroupsController_save50_invoker.call(StudyGroupsController_7.save())
      }
  
    // @LINE:78
    case controllers_TableController_listStudyGroups51_route(params) =>
      call { 
        controllers_TableController_listStudyGroups51_invoker.call(TableController_17.listStudyGroups())
      }
  
    // @LINE:81
    case controllers_SemestersController_index52_route(params) =>
      call { 
        controllers_SemestersController_index52_invoker.call(SemestersController_23.index())
      }
  
    // @LINE:82
    case controllers_SemestersController_save53_route(params) =>
      call { 
        controllers_SemestersController_save53_invoker.call(SemestersController_23.save())
      }
  
    // @LINE:83
    case controllers_TableController_listSemesters54_route(params) =>
      call { 
        controllers_TableController_listSemesters54_invoker.call(TableController_17.listSemesters())
      }
  
    // @LINE:86
    case controllers_StudyPlansController_index55_route(params) =>
      call { 
        controllers_StudyPlansController_index55_invoker.call(StudyPlansController_13.index())
      }
  
    // @LINE:87
    case controllers_StudyPlansController_save56_route(params) =>
      call { 
        controllers_StudyPlansController_save56_invoker.call(StudyPlansController_13.save())
      }
  
    // @LINE:88
    case controllers_TableController_listStudyPlans57_route(params) =>
      call { 
        controllers_TableController_listStudyPlans57_invoker.call(TableController_17.listStudyPlans())
      }
  
    // @LINE:90
    case controllers_CourseController_index58_route(params) =>
      call { 
        controllers_CourseController_index58_invoker.call(CourseController_3.index())
      }
  
    // @LINE:91
    case controllers_CourseController_save59_route(params) =>
      call { 
        controllers_CourseController_save59_invoker.call(CourseController_3.save())
      }
  
    // @LINE:93
    case controllers_TableController_listScheduleInWeeks60_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks60_invoker.call(TableController_17.listScheduleInWeeks())
      }
  
    // @LINE:95
    case controllers_TableController_listSchedule61_route(params) =>
      call { 
        controllers_TableController_listSchedule61_invoker.call(TableController_17.listSchedule())
      }
  
    // @LINE:96
    case controllers_TableController_listEmployees62_route(params) =>
      call { 
        controllers_TableController_listEmployees62_invoker.call(TableController_17.listEmployees())
      }
  
    // @LINE:97
    case controllers_TableController_listTeachers63_route(params) =>
      call { 
        controllers_TableController_listTeachers63_invoker.call(TableController_17.listTeachers())
      }
  
    // @LINE:98
    case controllers_TableController_listSubjects64_route(params) =>
      call { 
        controllers_TableController_listSubjects64_invoker.call(TableController_17.listSubjects())
      }
  
    // @LINE:99
    case controllers_TableController_listFieldsOfStudy65_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy65_invoker.call(TableController_17.listFieldsOfStudy())
      }
  
    // @LINE:100
    case controllers_TableController_listCourses66_route(params) =>
      call { 
        controllers_TableController_listCourses66_invoker.call(TableController_17.listCourses())
      }
  
    // @LINE:101
    case controllers_TableController_listCurrentSemesters67_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters67_invoker.call(TableController_17.listCurrentSemesters())
      }
  
    // @LINE:102
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy68_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy68_invoker.call(TableController_17.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:103
    case controllers_TableController_listDays69_route(params) =>
      call { 
        controllers_TableController_listDays69_invoker.call(TableController_17.listDays())
      }
  
    // @LINE:104
    case controllers_TableController_listCommittees70_route(params) =>
      call { 
        controllers_TableController_listCommittees70_invoker.call(TableController_17.listCommittees())
      }
  
    // @LINE:105
    case controllers_TableController_listPublications71_route(params) =>
      call { 
        controllers_TableController_listPublications71_invoker.call(TableController_17.listPublications())
      }
  
    // @LINE:106
    case controllers_TableController_listTeachersInWeeks72_route(params) =>
      call { 
        controllers_TableController_listTeachersInWeeks72_invoker.call(TableController_17.listTeachersInWeeks())
      }
  
    // @LINE:108
    case controllers_StatisticController_listEmployeesActvitiy73_route(params) =>
      call { 
        controllers_StatisticController_listEmployeesActvitiy73_invoker.call(StatisticController_4.listEmployeesActvitiy())
      }
  
    // @LINE:109
    case controllers_StatisticController_listEmployeerActvitiy74_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_StatisticController_listEmployeerActvitiy74_invoker.call(StatisticController_4.listEmployeerActvitiy(email))
      }
  
    // @LINE:110
    case controllers_PersonalStatisticController_listTableTeachingAccordingToPersons75_route(params) =>
      call { 
        controllers_PersonalStatisticController_listTableTeachingAccordingToPersons75_invoker.call(PersonalStatisticController_14.listTableTeachingAccordingToPersons())
      }
  
    // @LINE:112
    case controllers_TeachersController_index76_route(params) =>
      call { 
        controllers_TeachersController_index76_invoker.call(TeachersController_9.index())
      }
  
    // @LINE:113
    case controllers_TeachersController_save77_route(params) =>
      call { 
        controllers_TeachersController_save77_invoker.call(TeachersController_9.save())
      }
  
    // @LINE:116
    case controllers_MethodicsController_index78_route(params) =>
      call { 
        controllers_MethodicsController_index78_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:117
    case controllers_MethodicsController_save79_route(params) =>
      call { 
        controllers_MethodicsController_save79_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:119
    case controllers_Application_roles80_route(params) =>
      call { 
        controllers_Application_roles80_invoker.call(Application_26.roles())
      }
  
    // @LINE:122
    case controllers_TableController_listPerson81_route(params) =>
      call { 
        controllers_TableController_listPerson81_invoker.call(TableController_17.listPerson())
      }
  
    // @LINE:124
    case controllers_SubjectPlanTeachingController_index82_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index82_invoker.call(SubjectPlanTeachingController_10.index())
      }
  
    // @LINE:125
    case controllers_SubjectPlanTeachingController_save83_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save83_invoker.call(SubjectPlanTeachingController_10.save())
      }
  
    // @LINE:128
    case controllers_Application_logout84_route(params) =>
      call { 
        controllers_Application_logout84_invoker.call(Application_26.logout())
      }
  
    // @LINE:131
    case controllers_PrintController_printUserDetails85_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails85_invoker.call(PrintController_18.printUserDetails(id))
      }
  
    // @LINE:132
    case controllers_PrintController_detailsList86_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList86_invoker.call(PrintController_18.detailsList(id))
      }
  
    // @LINE:134
    case controllers_SalaryController_saveLector87_route(params) =>
      call { 
        controllers_SalaryController_saveLector87_invoker.call(SalaryController_16.saveLector())
      }
  
    // @LINE:135
    case controllers_SalaryController_printLector88_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector88_invoker.call(SalaryController_16.printLector(id))
      }
  
    // @LINE:136
    case controllers_SalaryController_detailsListLector89_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector89_invoker.call(SalaryController_16.detailsListLector(id))
      }
  
    // @LINE:140
    case controllers_Assets_at90_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at90_invoker.call(Assets_24.at(path, file))
      }
  }
}
