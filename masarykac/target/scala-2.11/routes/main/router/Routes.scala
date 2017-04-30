
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Mon May 01 01:01:50 CEST 2017

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
  // @LINE:64
  ClassroomController_29: controllers.ClassroomController,
  // @LINE:71
  FieldOfStudyController_11: controllers.FieldOfStudyController,
  // @LINE:74
  CommitteeController_25: controllers.CommitteeController,
  // @LINE:77
  PersonalStatisticController_14: controllers.PersonalStatisticController,
  // @LINE:83
  StatisticController_4: controllers.StatisticController,
  // @LINE:88
  StudyGroupsController_7: controllers.StudyGroupsController,
  // @LINE:90
  TableController_17: controllers.TableController,
  // @LINE:93
  SemestersController_23: controllers.SemestersController,
  // @LINE:98
  StudyPlansController_13: controllers.StudyPlansController,
  // @LINE:102
  CourseController_3: controllers.CourseController,
  // @LINE:126
  TeachersController_9: controllers.TeachersController,
  // @LINE:130
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:138
  SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
  // @LINE:145
  PrintController_18: controllers.PrintController,
  // @LINE:154
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
    // @LINE:64
    ClassroomController_29: controllers.ClassroomController,
    // @LINE:71
    FieldOfStudyController_11: controllers.FieldOfStudyController,
    // @LINE:74
    CommitteeController_25: controllers.CommitteeController,
    // @LINE:77
    PersonalStatisticController_14: controllers.PersonalStatisticController,
    // @LINE:83
    StatisticController_4: controllers.StatisticController,
    // @LINE:88
    StudyGroupsController_7: controllers.StudyGroupsController,
    // @LINE:90
    TableController_17: controllers.TableController,
    // @LINE:93
    SemestersController_23: controllers.SemestersController,
    // @LINE:98
    StudyPlansController_13: controllers.StudyPlansController,
    // @LINE:102
    CourseController_3: controllers.CourseController,
    // @LINE:126
    TeachersController_9: controllers.TeachersController,
    // @LINE:130
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:138
    SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
    // @LINE:145
    PrintController_18: controllers.PrintController,
    // @LINE:154
    Assets_24: controllers.Assets
  ) = this(errorHandler, Application_26, TestController_20, SalaryController_16, Login_22, Charts_27, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, SubjectController_28, ClassroomController_29, FieldOfStudyController_11, CommitteeController_25, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_23, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_24, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_26, TestController_20, SalaryController_16, Login_22, Charts_27, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, SubjectController_28, ClassroomController_29, FieldOfStudyController_11, CommitteeController_25, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_23, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_24, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/add""", """controllers.ClassroomController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/saved""", """controllers.ClassroomController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/edit/""" + "$" + """id<[^/]+>""", """controllers.ClassroomController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/updated/""", """controllers.ClassroomController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/delete""", """controllers.ClassroomController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/add""", """controllers.FieldOfStudyController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fields/saved""", """controllers.FieldOfStudyController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committee/add""", """controllers.CommitteeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committee/saved""", """controllers.CommitteeController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.PersonalStatisticController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics/aaa""", """controllers.PersonalStatisticController.teachingAAA()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics/aab""", """controllers.PersonalStatisticController.teachingAAB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics/cb""", """controllers.PersonalStatisticController.teachingCB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dcps""", """controllers.StatisticController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sp""", """controllers.StatisticController.studyPlansTable()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spprint""", """controllers.StatisticController.studyPlansTablePrint()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classrooms""", """controllers.TableController.listClassrooms()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committees""", """controllers.TableController.listCommittees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publications""", """controllers.TableController.listPublications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tiw""", """controllers.TableController.listTeachersInWeeks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat""", """controllers.StatisticController.listEmployeesActvitiy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat/info/""" + "$" + """email<[^/]+>""", """controllers.StatisticController.listEmployeerActvitiy(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teaching""", """controllers.PersonalStatisticController.listTableTeachingAccordingToPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teaching/t/""" + "$" + """email<[^/]+>""", """controllers.PersonalStatisticController.listTableTeachingAccordingToId(email:String)"""),
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

  // @LINE:64
  private[this] lazy val controllers_ClassroomController_index43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/add")))
  )
  private[this] lazy val controllers_ClassroomController_index43_invoker = createInvoker(
    ClassroomController_29.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """classroom/add"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ClassroomController_save44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/saved")))
  )
  private[this] lazy val controllers_ClassroomController_save44_invoker = createInvoker(
    ClassroomController_29.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """classroom/saved"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ClassroomController_edit45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_edit45_invoker = createInvoker(
    ClassroomController_29.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """classroom/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ClassroomController_update46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/updated/")))
  )
  private[this] lazy val controllers_ClassroomController_update46_invoker = createInvoker(
    ClassroomController_29.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """classroom/updated/"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ClassroomController_delete47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/delete")))
  )
  private[this] lazy val controllers_ClassroomController_delete47_invoker = createInvoker(
    ClassroomController_29.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClassroomController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """classroom/delete"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_FieldOfStudyController_index48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index48_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_FieldOfStudyController_save49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save49_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_CommitteeController_index50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/add")))
  )
  private[this] lazy val controllers_CommitteeController_index50_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_CommitteeController_save51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/saved")))
  )
  private[this] lazy val controllers_CommitteeController_save51_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_PersonalStatisticController_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index52_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aaa")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA53_invoker = createInvoker(
    PersonalStatisticController_14.teachingAAA(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "teachingAAA",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics/aaa"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aab")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB54_invoker = createInvoker(
    PersonalStatisticController_14.teachingAAB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "teachingAAB",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics/aab"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_PersonalStatisticController_teachingCB55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/cb")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingCB55_invoker = createInvoker(
    PersonalStatisticController_14.teachingCB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "teachingCB",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics/cb"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_StatisticController_index56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcps")))
  )
  private[this] lazy val controllers_StatisticController_index56_invoker = createInvoker(
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

  // @LINE:84
  private[this] lazy val controllers_StatisticController_studyPlansTable57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sp")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTable57_invoker = createInvoker(
    StatisticController_4.studyPlansTable(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "studyPlansTable",
      Nil,
      "GET",
      """""",
      this.prefix + """sp"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spprint")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint58_invoker = createInvoker(
    StatisticController_4.studyPlansTablePrint(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "studyPlansTablePrint",
      Nil,
      "GET",
      """""",
      this.prefix + """spprint"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_StudyGroupsController_index59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index59_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_StudyGroupsController_save60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save60_invoker = createInvoker(
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

  // @LINE:90
  private[this] lazy val controllers_TableController_listStudyGroups61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups61_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_SemestersController_index62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index62_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_SemestersController_save63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save63_invoker = createInvoker(
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

  // @LINE:95
  private[this] lazy val controllers_TableController_listSemesters64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters64_invoker = createInvoker(
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

  // @LINE:98
  private[this] lazy val controllers_StudyPlansController_index65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index65_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_StudyPlansController_save66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save66_invoker = createInvoker(
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

  // @LINE:100
  private[this] lazy val controllers_TableController_listStudyPlans67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans67_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val controllers_CourseController_index68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index68_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_CourseController_save69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save69_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val controllers_TableController_listScheduleInWeeks70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks70_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_TableController_listSchedule71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule71_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_TableController_listEmployees72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees72_invoker = createInvoker(
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

  // @LINE:109
  private[this] lazy val controllers_TableController_listTeachers73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers73_invoker = createInvoker(
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

  // @LINE:110
  private[this] lazy val controllers_TableController_listSubjects74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects74_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_TableController_listFieldsOfStudy75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy75_invoker = createInvoker(
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

  // @LINE:112
  private[this] lazy val controllers_TableController_listCourses76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses76_invoker = createInvoker(
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

  // @LINE:113
  private[this] lazy val controllers_TableController_listCurrentSemesters77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters77_invoker = createInvoker(
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

  // @LINE:114
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy78_invoker = createInvoker(
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

  // @LINE:115
  private[this] lazy val controllers_TableController_listDays79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays79_invoker = createInvoker(
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

  // @LINE:116
  private[this] lazy val controllers_TableController_listClassrooms80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classrooms")))
  )
  private[this] lazy val controllers_TableController_listClassrooms80_invoker = createInvoker(
    TableController_17.listClassrooms(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listClassrooms",
      Nil,
      "GET",
      """""",
      this.prefix + """classrooms"""
    )
  )

  // @LINE:117
  private[this] lazy val controllers_TableController_listCommittees81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committees")))
  )
  private[this] lazy val controllers_TableController_listCommittees81_invoker = createInvoker(
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

  // @LINE:118
  private[this] lazy val controllers_TableController_listPublications82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_TableController_listPublications82_invoker = createInvoker(
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

  // @LINE:119
  private[this] lazy val controllers_TableController_listTeachersInWeeks83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tiw")))
  )
  private[this] lazy val controllers_TableController_listTeachersInWeeks83_invoker = createInvoker(
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

  // @LINE:121
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat")))
  )
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy84_invoker = createInvoker(
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

  // @LINE:122
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat/info/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy85_invoker = createInvoker(
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

  // @LINE:123
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching")))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons86_invoker = createInvoker(
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

  // @LINE:124
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching/t/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId87_invoker = createInvoker(
    PersonalStatisticController_14.listTableTeachingAccordingToId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "listTableTeachingAccordingToId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """teaching/t/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:126
  private[this] lazy val controllers_TeachersController_index88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index88_invoker = createInvoker(
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

  // @LINE:127
  private[this] lazy val controllers_TeachersController_save89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save89_invoker = createInvoker(
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

  // @LINE:130
  private[this] lazy val controllers_MethodicsController_index90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index90_invoker = createInvoker(
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

  // @LINE:131
  private[this] lazy val controllers_MethodicsController_save91_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save91_invoker = createInvoker(
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

  // @LINE:133
  private[this] lazy val controllers_Application_roles92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles92_invoker = createInvoker(
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

  // @LINE:136
  private[this] lazy val controllers_TableController_listPerson93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson93_invoker = createInvoker(
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

  // @LINE:138
  private[this] lazy val controllers_SubjectPlanTeachingController_index94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index94_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_SubjectPlanTeachingController_save95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save95_invoker = createInvoker(
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

  // @LINE:142
  private[this] lazy val controllers_Application_logout96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout96_invoker = createInvoker(
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

  // @LINE:145
  private[this] lazy val controllers_PrintController_printUserDetails97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails97_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_PrintController_detailsList98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList98_invoker = createInvoker(
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

  // @LINE:148
  private[this] lazy val controllers_SalaryController_saveLector99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector99_invoker = createInvoker(
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

  // @LINE:149
  private[this] lazy val controllers_SalaryController_printLector100_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector100_invoker = createInvoker(
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

  // @LINE:150
  private[this] lazy val controllers_SalaryController_detailsListLector101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector101_invoker = createInvoker(
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

  // @LINE:154
  private[this] lazy val controllers_Assets_at102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at102_invoker = createInvoker(
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
  
    // @LINE:64
    case controllers_ClassroomController_index43_route(params) =>
      call { 
        controllers_ClassroomController_index43_invoker.call(ClassroomController_29.index())
      }
  
    // @LINE:65
    case controllers_ClassroomController_save44_route(params) =>
      call { 
        controllers_ClassroomController_save44_invoker.call(ClassroomController_29.save())
      }
  
    // @LINE:66
    case controllers_ClassroomController_edit45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClassroomController_edit45_invoker.call(ClassroomController_29.edit(id))
      }
  
    // @LINE:67
    case controllers_ClassroomController_update46_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_update46_invoker.call(ClassroomController_29.update(id))
      }
  
    // @LINE:68
    case controllers_ClassroomController_delete47_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_delete47_invoker.call(ClassroomController_29.delete(id))
      }
  
    // @LINE:71
    case controllers_FieldOfStudyController_index48_route(params) =>
      call { 
        controllers_FieldOfStudyController_index48_invoker.call(FieldOfStudyController_11.index())
      }
  
    // @LINE:72
    case controllers_FieldOfStudyController_save49_route(params) =>
      call { 
        controllers_FieldOfStudyController_save49_invoker.call(FieldOfStudyController_11.save())
      }
  
    // @LINE:74
    case controllers_CommitteeController_index50_route(params) =>
      call { 
        controllers_CommitteeController_index50_invoker.call(CommitteeController_25.index())
      }
  
    // @LINE:75
    case controllers_CommitteeController_save51_route(params) =>
      call { 
        controllers_CommitteeController_save51_invoker.call(CommitteeController_25.save())
      }
  
    // @LINE:77
    case controllers_PersonalStatisticController_index52_route(params) =>
      call { 
        controllers_PersonalStatisticController_index52_invoker.call(PersonalStatisticController_14.index())
      }
  
    // @LINE:78
    case controllers_PersonalStatisticController_teachingAAA53_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAA53_invoker.call(PersonalStatisticController_14.teachingAAA())
      }
  
    // @LINE:79
    case controllers_PersonalStatisticController_teachingAAB54_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAB54_invoker.call(PersonalStatisticController_14.teachingAAB())
      }
  
    // @LINE:80
    case controllers_PersonalStatisticController_teachingCB55_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingCB55_invoker.call(PersonalStatisticController_14.teachingCB())
      }
  
    // @LINE:83
    case controllers_StatisticController_index56_route(params) =>
      call { 
        controllers_StatisticController_index56_invoker.call(StatisticController_4.index())
      }
  
    // @LINE:84
    case controllers_StatisticController_studyPlansTable57_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTable57_invoker.call(StatisticController_4.studyPlansTable())
      }
  
    // @LINE:85
    case controllers_StatisticController_studyPlansTablePrint58_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTablePrint58_invoker.call(StatisticController_4.studyPlansTablePrint())
      }
  
    // @LINE:88
    case controllers_StudyGroupsController_index59_route(params) =>
      call { 
        controllers_StudyGroupsController_index59_invoker.call(StudyGroupsController_7.index())
      }
  
    // @LINE:89
    case controllers_StudyGroupsController_save60_route(params) =>
      call { 
        controllers_StudyGroupsController_save60_invoker.call(StudyGroupsController_7.save())
      }
  
    // @LINE:90
    case controllers_TableController_listStudyGroups61_route(params) =>
      call { 
        controllers_TableController_listStudyGroups61_invoker.call(TableController_17.listStudyGroups())
      }
  
    // @LINE:93
    case controllers_SemestersController_index62_route(params) =>
      call { 
        controllers_SemestersController_index62_invoker.call(SemestersController_23.index())
      }
  
    // @LINE:94
    case controllers_SemestersController_save63_route(params) =>
      call { 
        controllers_SemestersController_save63_invoker.call(SemestersController_23.save())
      }
  
    // @LINE:95
    case controllers_TableController_listSemesters64_route(params) =>
      call { 
        controllers_TableController_listSemesters64_invoker.call(TableController_17.listSemesters())
      }
  
    // @LINE:98
    case controllers_StudyPlansController_index65_route(params) =>
      call { 
        controllers_StudyPlansController_index65_invoker.call(StudyPlansController_13.index())
      }
  
    // @LINE:99
    case controllers_StudyPlansController_save66_route(params) =>
      call { 
        controllers_StudyPlansController_save66_invoker.call(StudyPlansController_13.save())
      }
  
    // @LINE:100
    case controllers_TableController_listStudyPlans67_route(params) =>
      call { 
        controllers_TableController_listStudyPlans67_invoker.call(TableController_17.listStudyPlans())
      }
  
    // @LINE:102
    case controllers_CourseController_index68_route(params) =>
      call { 
        controllers_CourseController_index68_invoker.call(CourseController_3.index())
      }
  
    // @LINE:103
    case controllers_CourseController_save69_route(params) =>
      call { 
        controllers_CourseController_save69_invoker.call(CourseController_3.save())
      }
  
    // @LINE:105
    case controllers_TableController_listScheduleInWeeks70_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks70_invoker.call(TableController_17.listScheduleInWeeks())
      }
  
    // @LINE:107
    case controllers_TableController_listSchedule71_route(params) =>
      call { 
        controllers_TableController_listSchedule71_invoker.call(TableController_17.listSchedule())
      }
  
    // @LINE:108
    case controllers_TableController_listEmployees72_route(params) =>
      call { 
        controllers_TableController_listEmployees72_invoker.call(TableController_17.listEmployees())
      }
  
    // @LINE:109
    case controllers_TableController_listTeachers73_route(params) =>
      call { 
        controllers_TableController_listTeachers73_invoker.call(TableController_17.listTeachers())
      }
  
    // @LINE:110
    case controllers_TableController_listSubjects74_route(params) =>
      call { 
        controllers_TableController_listSubjects74_invoker.call(TableController_17.listSubjects())
      }
  
    // @LINE:111
    case controllers_TableController_listFieldsOfStudy75_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy75_invoker.call(TableController_17.listFieldsOfStudy())
      }
  
    // @LINE:112
    case controllers_TableController_listCourses76_route(params) =>
      call { 
        controllers_TableController_listCourses76_invoker.call(TableController_17.listCourses())
      }
  
    // @LINE:113
    case controllers_TableController_listCurrentSemesters77_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters77_invoker.call(TableController_17.listCurrentSemesters())
      }
  
    // @LINE:114
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy78_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy78_invoker.call(TableController_17.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:115
    case controllers_TableController_listDays79_route(params) =>
      call { 
        controllers_TableController_listDays79_invoker.call(TableController_17.listDays())
      }
  
    // @LINE:116
    case controllers_TableController_listClassrooms80_route(params) =>
      call { 
        controllers_TableController_listClassrooms80_invoker.call(TableController_17.listClassrooms())
      }
  
    // @LINE:117
    case controllers_TableController_listCommittees81_route(params) =>
      call { 
        controllers_TableController_listCommittees81_invoker.call(TableController_17.listCommittees())
      }
  
    // @LINE:118
    case controllers_TableController_listPublications82_route(params) =>
      call { 
        controllers_TableController_listPublications82_invoker.call(TableController_17.listPublications())
      }
  
    // @LINE:119
    case controllers_TableController_listTeachersInWeeks83_route(params) =>
      call { 
        controllers_TableController_listTeachersInWeeks83_invoker.call(TableController_17.listTeachersInWeeks())
      }
  
    // @LINE:121
    case controllers_StatisticController_listEmployeesActvitiy84_route(params) =>
      call { 
        controllers_StatisticController_listEmployeesActvitiy84_invoker.call(StatisticController_4.listEmployeesActvitiy())
      }
  
    // @LINE:122
    case controllers_StatisticController_listEmployeerActvitiy85_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_StatisticController_listEmployeerActvitiy85_invoker.call(StatisticController_4.listEmployeerActvitiy(email))
      }
  
    // @LINE:123
    case controllers_PersonalStatisticController_listTableTeachingAccordingToPersons86_route(params) =>
      call { 
        controllers_PersonalStatisticController_listTableTeachingAccordingToPersons86_invoker.call(PersonalStatisticController_14.listTableTeachingAccordingToPersons())
      }
  
    // @LINE:124
    case controllers_PersonalStatisticController_listTableTeachingAccordingToId87_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_PersonalStatisticController_listTableTeachingAccordingToId87_invoker.call(PersonalStatisticController_14.listTableTeachingAccordingToId(email))
      }
  
    // @LINE:126
    case controllers_TeachersController_index88_route(params) =>
      call { 
        controllers_TeachersController_index88_invoker.call(TeachersController_9.index())
      }
  
    // @LINE:127
    case controllers_TeachersController_save89_route(params) =>
      call { 
        controllers_TeachersController_save89_invoker.call(TeachersController_9.save())
      }
  
    // @LINE:130
    case controllers_MethodicsController_index90_route(params) =>
      call { 
        controllers_MethodicsController_index90_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:131
    case controllers_MethodicsController_save91_route(params) =>
      call { 
        controllers_MethodicsController_save91_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:133
    case controllers_Application_roles92_route(params) =>
      call { 
        controllers_Application_roles92_invoker.call(Application_26.roles())
      }
  
    // @LINE:136
    case controllers_TableController_listPerson93_route(params) =>
      call { 
        controllers_TableController_listPerson93_invoker.call(TableController_17.listPerson())
      }
  
    // @LINE:138
    case controllers_SubjectPlanTeachingController_index94_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index94_invoker.call(SubjectPlanTeachingController_10.index())
      }
  
    // @LINE:139
    case controllers_SubjectPlanTeachingController_save95_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save95_invoker.call(SubjectPlanTeachingController_10.save())
      }
  
    // @LINE:142
    case controllers_Application_logout96_route(params) =>
      call { 
        controllers_Application_logout96_invoker.call(Application_26.logout())
      }
  
    // @LINE:145
    case controllers_PrintController_printUserDetails97_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails97_invoker.call(PrintController_18.printUserDetails(id))
      }
  
    // @LINE:146
    case controllers_PrintController_detailsList98_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList98_invoker.call(PrintController_18.detailsList(id))
      }
  
    // @LINE:148
    case controllers_SalaryController_saveLector99_route(params) =>
      call { 
        controllers_SalaryController_saveLector99_invoker.call(SalaryController_16.saveLector())
      }
  
    // @LINE:149
    case controllers_SalaryController_printLector100_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector100_invoker.call(SalaryController_16.printLector(id))
      }
  
    // @LINE:150
    case controllers_SalaryController_detailsListLector101_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector101_invoker.call(SalaryController_16.detailsListLector(id))
      }
  
    // @LINE:154
    case controllers_Assets_at102_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at102_invoker.call(Assets_24.at(path, file))
      }
  }
}
