
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Fri May 05 23:34:29 CEST 2017

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
  Application_28: controllers.Application,
  // @LINE:10
  TestController_20: controllers.TestController,
  // @LINE:13
  SalaryController_16: controllers.SalaryController,
  // @LINE:14
  Login_22: controllers.Login,
  // @LINE:16
  Charts_29: controllers.Charts,
  // @LINE:20
  UiElements_19: controllers.UiElements,
  // @LINE:26
  Pages_5: controllers.Pages,
  // @LINE:29
  PersonController_2: controllers.PersonController,
  // @LINE:32
  VisitsController_1: controllers.VisitsController,
  // @LINE:35
  ProjectController_15: controllers.ProjectController,
  // @LINE:38
  FinalWorksController_6: controllers.FinalWorksController,
  // @LINE:41
  PublicationsController_8: controllers.PublicationsController,
  // @LINE:44
  OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
  // @LINE:51
  EmployeesController_21: controllers.EmployeesController,
  // @LINE:58
  StatementController_26: controllers.StatementController,
  // @LINE:64
  SubjectController_30: controllers.SubjectController,
  // @LINE:67
  ClassroomController_31: controllers.ClassroomController,
  // @LINE:73
  TeachersRoleController_23: controllers.TeachersRoleController,
  // @LINE:80
  FieldOfStudyController_11: controllers.FieldOfStudyController,
  // @LINE:83
  CommitteeController_27: controllers.CommitteeController,
  // @LINE:86
  PersonalStatisticController_14: controllers.PersonalStatisticController,
  // @LINE:92
  StatisticController_4: controllers.StatisticController,
  // @LINE:97
  StudyGroupsController_7: controllers.StudyGroupsController,
  // @LINE:99
  TableController_17: controllers.TableController,
  // @LINE:102
  SemestersController_24: controllers.SemestersController,
  // @LINE:107
  StudyPlansController_13: controllers.StudyPlansController,
  // @LINE:111
  CourseController_3: controllers.CourseController,
  // @LINE:136
  TeachersController_9: controllers.TeachersController,
  // @LINE:140
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:148
  SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
  // @LINE:155
  PrintController_18: controllers.PrintController,
  // @LINE:164
  Assets_25: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_28: controllers.Application,
    // @LINE:10
    TestController_20: controllers.TestController,
    // @LINE:13
    SalaryController_16: controllers.SalaryController,
    // @LINE:14
    Login_22: controllers.Login,
    // @LINE:16
    Charts_29: controllers.Charts,
    // @LINE:20
    UiElements_19: controllers.UiElements,
    // @LINE:26
    Pages_5: controllers.Pages,
    // @LINE:29
    PersonController_2: controllers.PersonController,
    // @LINE:32
    VisitsController_1: controllers.VisitsController,
    // @LINE:35
    ProjectController_15: controllers.ProjectController,
    // @LINE:38
    FinalWorksController_6: controllers.FinalWorksController,
    // @LINE:41
    PublicationsController_8: controllers.PublicationsController,
    // @LINE:44
    OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
    // @LINE:51
    EmployeesController_21: controllers.EmployeesController,
    // @LINE:58
    StatementController_26: controllers.StatementController,
    // @LINE:64
    SubjectController_30: controllers.SubjectController,
    // @LINE:67
    ClassroomController_31: controllers.ClassroomController,
    // @LINE:73
    TeachersRoleController_23: controllers.TeachersRoleController,
    // @LINE:80
    FieldOfStudyController_11: controllers.FieldOfStudyController,
    // @LINE:83
    CommitteeController_27: controllers.CommitteeController,
    // @LINE:86
    PersonalStatisticController_14: controllers.PersonalStatisticController,
    // @LINE:92
    StatisticController_4: controllers.StatisticController,
    // @LINE:97
    StudyGroupsController_7: controllers.StudyGroupsController,
    // @LINE:99
    TableController_17: controllers.TableController,
    // @LINE:102
    SemestersController_24: controllers.SemestersController,
    // @LINE:107
    StudyPlansController_13: controllers.StudyPlansController,
    // @LINE:111
    CourseController_3: controllers.CourseController,
    // @LINE:136
    TeachersController_9: controllers.TeachersController,
    // @LINE:140
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:148
    SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
    // @LINE:155
    PrintController_18: controllers.PrintController,
    // @LINE:164
    Assets_25: controllers.Assets
  ) = this(errorHandler, Application_28, TestController_20, SalaryController_16, Login_22, Charts_29, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, StatementController_26, SubjectController_30, ClassroomController_31, TeachersRoleController_23, FieldOfStudyController_11, CommitteeController_27, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_24, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_25, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_28, TestController_20, SalaryController_16, Login_22, Charts_29, UiElements_19, Pages_5, PersonController_2, VisitsController_1, ProjectController_15, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_21, StatementController_26, SubjectController_30, ClassroomController_31, TeachersRoleController_23, FieldOfStudyController_11, CommitteeController_27, PersonalStatisticController_14, StatisticController_4, StudyGroupsController_7, TableController_17, SemestersController_24, StudyPlansController_13, CourseController_3, TeachersController_9, MethodicsController_0, SubjectPlanTeachingController_10, PrintController_18, Assets_25, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement""", """controllers.StatementController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/employee/""" + "$" + """email<[^/]+>""", """controllers.StatementController.employeeStatement(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/check/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendStatementToEmployee(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/ver/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendToVerify(idE:Long, idS:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/add""", """controllers.SubjectController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subject/saved""", """controllers.SubjectController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/add""", """controllers.ClassroomController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/saved""", """controllers.ClassroomController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/edit/""" + "$" + """id<[^/]+>""", """controllers.ClassroomController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/updated/""", """controllers.ClassroomController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """classroom/delete""", """controllers.ClassroomController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachersrole/add""", """controllers.TeachersRoleController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachersrole/saved""", """controllers.TeachersRoleController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachersrole/edit/""" + "$" + """id<[^/]+>""", """controllers.TeachersRoleController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachersrole/updated/""", """controllers.TeachersRoleController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachersrole/delete""", """controllers.TeachersRoleController.delete(id:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachroles""", """controllers.TableController.listTeachersRole()"""),
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
    Application_28.dashboard(),
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
    Application_28.pdf(),
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
    Application_28.raw(),
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
    Application_28.index(),
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

  // @LINE:11
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

  // @LINE:12
  private[this] lazy val controllers_Application_kpiChoosePerson6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kpi")))
  )
  private[this] lazy val controllers_Application_kpiChoosePerson6_invoker = createInvoker(
    Application_28.kpiChoosePerson(),
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

  // @LINE:13
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

  // @LINE:14
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

  // @LINE:15
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

  // @LINE:16
  private[this] lazy val controllers_Charts_flot10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/flot")))
  )
  private[this] lazy val controllers_Charts_flot10_invoker = createInvoker(
    Charts_29.flot(),
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

  // @LINE:17
  private[this] lazy val controllers_Charts_morris11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("charts/morris")))
  )
  private[this] lazy val controllers_Charts_morris11_invoker = createInvoker(
    Charts_29.morris(),
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

  // @LINE:18
  private[this] lazy val controllers_Application_tables12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tables")))
  )
  private[this] lazy val controllers_Application_tables12_invoker = createInvoker(
    Application_28.tables(),
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

  // @LINE:19
  private[this] lazy val controllers_Application_forms13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms13_invoker = createInvoker(
    Application_28.forms(),
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

  // @LINE:20
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

  // @LINE:21
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

  // @LINE:22
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

  // @LINE:23
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

  // @LINE:24
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

  // @LINE:25
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

  // @LINE:26
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

  // @LINE:29
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

  // @LINE:30
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

  // @LINE:32
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

  // @LINE:33
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

  // @LINE:35
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

  // @LINE:36
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

  // @LINE:38
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

  // @LINE:39
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

  // @LINE:41
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

  // @LINE:42
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

  // @LINE:44
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

  // @LINE:45
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

  // @LINE:47
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

  // @LINE:48
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

  // @LINE:51
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

  // @LINE:52
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

  // @LINE:53
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

  // @LINE:54
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

  // @LINE:55
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

  // @LINE:56
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

  // @LINE:58
  private[this] lazy val controllers_StatementController_index41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement")))
  )
  private[this] lazy val controllers_StatementController_index41_invoker = createInvoker(
    StatementController_26.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """statement"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_StatementController_employeeStatement42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/employee/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_employeeStatement42_invoker = createInvoker(
    StatementController_26.employeeStatement(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "employeeStatement",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """statement/employee/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_StatementController_sendStatementToEmployee43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/check/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendStatementToEmployee43_invoker = createInvoker(
    StatementController_26.sendStatementToEmployee(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "sendStatementToEmployee",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/check/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_StatementController_sendToVerify44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/ver/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToVerify44_invoker = createInvoker(
    StatementController_26.sendToVerify(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "sendToVerify",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/ver/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_SubjectController_index45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index45_invoker = createInvoker(
    SubjectController_30.index(),
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

  // @LINE:65
  private[this] lazy val controllers_SubjectController_save46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save46_invoker = createInvoker(
    SubjectController_30.save(),
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

  // @LINE:67
  private[this] lazy val controllers_ClassroomController_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/add")))
  )
  private[this] lazy val controllers_ClassroomController_index47_invoker = createInvoker(
    ClassroomController_31.index(),
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

  // @LINE:68
  private[this] lazy val controllers_ClassroomController_save48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/saved")))
  )
  private[this] lazy val controllers_ClassroomController_save48_invoker = createInvoker(
    ClassroomController_31.save(),
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

  // @LINE:69
  private[this] lazy val controllers_ClassroomController_edit49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_edit49_invoker = createInvoker(
    ClassroomController_31.edit(fakeValue[Long]),
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

  // @LINE:70
  private[this] lazy val controllers_ClassroomController_update50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/updated/")))
  )
  private[this] lazy val controllers_ClassroomController_update50_invoker = createInvoker(
    ClassroomController_31.update(fakeValue[Long]),
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

  // @LINE:71
  private[this] lazy val controllers_ClassroomController_delete51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/delete")))
  )
  private[this] lazy val controllers_ClassroomController_delete51_invoker = createInvoker(
    ClassroomController_31.delete(fakeValue[Long]),
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

  // @LINE:73
  private[this] lazy val controllers_TeachersRoleController_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/add")))
  )
  private[this] lazy val controllers_TeachersRoleController_index52_invoker = createInvoker(
    TeachersRoleController_23.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersRoleController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """teachersrole/add"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_TeachersRoleController_save53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/saved")))
  )
  private[this] lazy val controllers_TeachersRoleController_save53_invoker = createInvoker(
    TeachersRoleController_23.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersRoleController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """teachersrole/saved"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_TeachersRoleController_edit54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TeachersRoleController_edit54_invoker = createInvoker(
    TeachersRoleController_23.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersRoleController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """teachersrole/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_TeachersRoleController_update55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/updated/")))
  )
  private[this] lazy val controllers_TeachersRoleController_update55_invoker = createInvoker(
    TeachersRoleController_23.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersRoleController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """teachersrole/updated/"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_TeachersRoleController_delete56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/delete")))
  )
  private[this] lazy val controllers_TeachersRoleController_delete56_invoker = createInvoker(
    TeachersRoleController_23.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeachersRoleController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """teachersrole/delete"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_FieldOfStudyController_index57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index57_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_FieldOfStudyController_save58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save58_invoker = createInvoker(
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

  // @LINE:83
  private[this] lazy val controllers_CommitteeController_index59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/add")))
  )
  private[this] lazy val controllers_CommitteeController_index59_invoker = createInvoker(
    CommitteeController_27.index(),
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

  // @LINE:84
  private[this] lazy val controllers_CommitteeController_save60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/saved")))
  )
  private[this] lazy val controllers_CommitteeController_save60_invoker = createInvoker(
    CommitteeController_27.save(),
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

  // @LINE:86
  private[this] lazy val controllers_PersonalStatisticController_index61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index61_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aaa")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA62_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aab")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB63_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_PersonalStatisticController_teachingCB64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/cb")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingCB64_invoker = createInvoker(
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

  // @LINE:92
  private[this] lazy val controllers_StatisticController_index65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcps")))
  )
  private[this] lazy val controllers_StatisticController_index65_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_StatisticController_studyPlansTable66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sp")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTable66_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spprint")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint67_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val controllers_StudyGroupsController_index68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index68_invoker = createInvoker(
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

  // @LINE:98
  private[this] lazy val controllers_StudyGroupsController_save69_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save69_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_TableController_listStudyGroups70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups70_invoker = createInvoker(
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

  // @LINE:102
  private[this] lazy val controllers_SemestersController_index71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index71_invoker = createInvoker(
    SemestersController_24.index(),
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

  // @LINE:103
  private[this] lazy val controllers_SemestersController_save72_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save72_invoker = createInvoker(
    SemestersController_24.save(),
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

  // @LINE:104
  private[this] lazy val controllers_TableController_listSemesters73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters73_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_StudyPlansController_index74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index74_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_StudyPlansController_save75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save75_invoker = createInvoker(
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

  // @LINE:109
  private[this] lazy val controllers_TableController_listStudyPlans76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans76_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_CourseController_index77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index77_invoker = createInvoker(
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

  // @LINE:112
  private[this] lazy val controllers_CourseController_save78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save78_invoker = createInvoker(
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

  // @LINE:114
  private[this] lazy val controllers_TableController_listScheduleInWeeks79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks79_invoker = createInvoker(
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

  // @LINE:116
  private[this] lazy val controllers_TableController_listSchedule80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule80_invoker = createInvoker(
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

  // @LINE:117
  private[this] lazy val controllers_TableController_listEmployees81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees81_invoker = createInvoker(
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

  // @LINE:118
  private[this] lazy val controllers_TableController_listTeachers82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers82_invoker = createInvoker(
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

  // @LINE:119
  private[this] lazy val controllers_TableController_listSubjects83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects83_invoker = createInvoker(
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

  // @LINE:120
  private[this] lazy val controllers_TableController_listFieldsOfStudy84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy84_invoker = createInvoker(
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

  // @LINE:121
  private[this] lazy val controllers_TableController_listCourses85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses85_invoker = createInvoker(
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

  // @LINE:122
  private[this] lazy val controllers_TableController_listCurrentSemesters86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters86_invoker = createInvoker(
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

  // @LINE:123
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy87_invoker = createInvoker(
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

  // @LINE:124
  private[this] lazy val controllers_TableController_listDays88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays88_invoker = createInvoker(
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

  // @LINE:125
  private[this] lazy val controllers_TableController_listClassrooms89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classrooms")))
  )
  private[this] lazy val controllers_TableController_listClassrooms89_invoker = createInvoker(
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

  // @LINE:126
  private[this] lazy val controllers_TableController_listTeachersRole90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachroles")))
  )
  private[this] lazy val controllers_TableController_listTeachersRole90_invoker = createInvoker(
    TableController_17.listTeachersRole(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listTeachersRole",
      Nil,
      "GET",
      """""",
      this.prefix + """teachroles"""
    )
  )

  // @LINE:127
  private[this] lazy val controllers_TableController_listCommittees91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committees")))
  )
  private[this] lazy val controllers_TableController_listCommittees91_invoker = createInvoker(
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

  // @LINE:128
  private[this] lazy val controllers_TableController_listPublications92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_TableController_listPublications92_invoker = createInvoker(
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

  // @LINE:129
  private[this] lazy val controllers_TableController_listTeachersInWeeks93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tiw")))
  )
  private[this] lazy val controllers_TableController_listTeachersInWeeks93_invoker = createInvoker(
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

  // @LINE:131
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat")))
  )
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy94_invoker = createInvoker(
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

  // @LINE:132
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat/info/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy95_invoker = createInvoker(
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

  // @LINE:133
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching")))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons96_invoker = createInvoker(
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

  // @LINE:134
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching/t/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId97_invoker = createInvoker(
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

  // @LINE:136
  private[this] lazy val controllers_TeachersController_index98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index98_invoker = createInvoker(
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

  // @LINE:137
  private[this] lazy val controllers_TeachersController_save99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save99_invoker = createInvoker(
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

  // @LINE:140
  private[this] lazy val controllers_MethodicsController_index100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index100_invoker = createInvoker(
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

  // @LINE:141
  private[this] lazy val controllers_MethodicsController_save101_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save101_invoker = createInvoker(
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

  // @LINE:143
  private[this] lazy val controllers_Application_roles102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles102_invoker = createInvoker(
    Application_28.roles(),
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

  // @LINE:146
  private[this] lazy val controllers_TableController_listPerson103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson103_invoker = createInvoker(
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

  // @LINE:148
  private[this] lazy val controllers_SubjectPlanTeachingController_index104_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index104_invoker = createInvoker(
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

  // @LINE:149
  private[this] lazy val controllers_SubjectPlanTeachingController_save105_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save105_invoker = createInvoker(
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

  // @LINE:152
  private[this] lazy val controllers_Application_logout106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout106_invoker = createInvoker(
    Application_28.logout(),
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

  // @LINE:155
  private[this] lazy val controllers_PrintController_printUserDetails107_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails107_invoker = createInvoker(
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

  // @LINE:156
  private[this] lazy val controllers_PrintController_detailsList108_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList108_invoker = createInvoker(
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

  // @LINE:158
  private[this] lazy val controllers_SalaryController_saveLector109_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector109_invoker = createInvoker(
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

  // @LINE:159
  private[this] lazy val controllers_SalaryController_printLector110_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector110_invoker = createInvoker(
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

  // @LINE:160
  private[this] lazy val controllers_SalaryController_detailsListLector111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector111_invoker = createInvoker(
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

  // @LINE:164
  private[this] lazy val controllers_Assets_at112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at112_invoker = createInvoker(
    Assets_25.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_28.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_28.pdf())
      }
  
    // @LINE:8
    case controllers_Application_raw2_route(params) =>
      call { 
        controllers_Application_raw2_invoker.call(Application_28.raw())
      }
  
    // @LINE:9
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(Application_28.index())
      }
  
    // @LINE:10
    case controllers_TestController_test4_route(params) =>
      call { 
        controllers_TestController_test4_invoker.call(TestController_20.test())
      }
  
    // @LINE:11
    case controllers_TestController_save5_route(params) =>
      call { 
        controllers_TestController_save5_invoker.call(TestController_20.save())
      }
  
    // @LINE:12
    case controllers_Application_kpiChoosePerson6_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson6_invoker.call(Application_28.kpiChoosePerson())
      }
  
    // @LINE:13
    case controllers_SalaryController_getPerson7_route(params) =>
      call { 
        controllers_SalaryController_getPerson7_invoker.call(SalaryController_16.getPerson())
      }
  
    // @LINE:14
    case controllers_Login_index8_route(params) =>
      call { 
        controllers_Login_index8_invoker.call(Login_22.index())
      }
  
    // @LINE:15
    case controllers_Login_authenticate9_route(params) =>
      call { 
        controllers_Login_authenticate9_invoker.call(Login_22.authenticate())
      }
  
    // @LINE:16
    case controllers_Charts_flot10_route(params) =>
      call { 
        controllers_Charts_flot10_invoker.call(Charts_29.flot())
      }
  
    // @LINE:17
    case controllers_Charts_morris11_route(params) =>
      call { 
        controllers_Charts_morris11_invoker.call(Charts_29.morris())
      }
  
    // @LINE:18
    case controllers_Application_tables12_route(params) =>
      call { 
        controllers_Application_tables12_invoker.call(Application_28.tables())
      }
  
    // @LINE:19
    case controllers_Application_forms13_route(params) =>
      call { 
        controllers_Application_forms13_invoker.call(Application_28.forms())
      }
  
    // @LINE:20
    case controllers_UiElements_panelsAndWells14_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells14_invoker.call(UiElements_19.panelsAndWells())
      }
  
    // @LINE:21
    case controllers_UiElements_buttons15_route(params) =>
      call { 
        controllers_UiElements_buttons15_invoker.call(UiElements_19.buttons())
      }
  
    // @LINE:22
    case controllers_UiElements_notifications16_route(params) =>
      call { 
        controllers_UiElements_notifications16_invoker.call(UiElements_19.notifications())
      }
  
    // @LINE:23
    case controllers_UiElements_typography17_route(params) =>
      call { 
        controllers_UiElements_typography17_invoker.call(UiElements_19.typography())
      }
  
    // @LINE:24
    case controllers_UiElements_icons18_route(params) =>
      call { 
        controllers_UiElements_icons18_invoker.call(UiElements_19.icons())
      }
  
    // @LINE:25
    case controllers_UiElements_grid19_route(params) =>
      call { 
        controllers_UiElements_grid19_invoker.call(UiElements_19.grid())
      }
  
    // @LINE:26
    case controllers_Pages_blank20_route(params) =>
      call { 
        controllers_Pages_blank20_invoker.call(Pages_5.blank())
      }
  
    // @LINE:29
    case controllers_PersonController_index21_route(params) =>
      call { 
        controllers_PersonController_index21_invoker.call(PersonController_2.index())
      }
  
    // @LINE:30
    case controllers_PersonController_save22_route(params) =>
      call { 
        controllers_PersonController_save22_invoker.call(PersonController_2.save())
      }
  
    // @LINE:32
    case controllers_VisitsController_index23_route(params) =>
      call { 
        controllers_VisitsController_index23_invoker.call(VisitsController_1.index())
      }
  
    // @LINE:33
    case controllers_VisitsController_save24_route(params) =>
      call { 
        controllers_VisitsController_save24_invoker.call(VisitsController_1.save())
      }
  
    // @LINE:35
    case controllers_ProjectController_index25_route(params) =>
      call { 
        controllers_ProjectController_index25_invoker.call(ProjectController_15.index())
      }
  
    // @LINE:36
    case controllers_ProjectController_save26_route(params) =>
      call { 
        controllers_ProjectController_save26_invoker.call(ProjectController_15.save())
      }
  
    // @LINE:38
    case controllers_FinalWorksController_index27_route(params) =>
      call { 
        controllers_FinalWorksController_index27_invoker.call(FinalWorksController_6.index())
      }
  
    // @LINE:39
    case controllers_FinalWorksController_save28_route(params) =>
      call { 
        controllers_FinalWorksController_save28_invoker.call(FinalWorksController_6.save())
      }
  
    // @LINE:41
    case controllers_PublicationsController_index29_route(params) =>
      call { 
        controllers_PublicationsController_index29_invoker.call(PublicationsController_8.index())
      }
  
    // @LINE:42
    case controllers_PublicationsController_save30_route(params) =>
      call { 
        controllers_PublicationsController_save30_invoker.call(PublicationsController_8.save())
      }
  
    // @LINE:44
    case controllers_OrganizationalUnitsController_index31_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_index31_invoker.call(OrganizationalUnitsController_12.index())
      }
  
    // @LINE:45
    case controllers_OrganizationalUnitsController_save32_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_save32_invoker.call(OrganizationalUnitsController_12.save())
      }
  
    // @LINE:47
    case controllers_OrganizationalUnitsController_indexParticipants33_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_indexParticipants33_invoker.call(OrganizationalUnitsController_12.indexParticipants())
      }
  
    // @LINE:48
    case controllers_OrganizationalUnitsController_saveParticipants34_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_saveParticipants34_invoker.call(OrganizationalUnitsController_12.saveParticipants())
      }
  
    // @LINE:51
    case controllers_EmployeesController_index35_route(params) =>
      call { 
        controllers_EmployeesController_index35_invoker.call(EmployeesController_21.index())
      }
  
    // @LINE:52
    case controllers_EmployeesController_save36_route(params) =>
      call { 
        controllers_EmployeesController_save36_invoker.call(EmployeesController_21.save())
      }
  
    // @LINE:53
    case controllers_EmployeesController_info37_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_EmployeesController_info37_invoker.call(EmployeesController_21.info(email))
      }
  
    // @LINE:54
    case controllers_EmployeesController_edit38_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_EmployeesController_edit38_invoker.call(EmployeesController_21.edit(email))
      }
  
    // @LINE:55
    case controllers_EmployeesController_update39_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_EmployeesController_update39_invoker.call(EmployeesController_21.update(email))
      }
  
    // @LINE:56
    case controllers_EmployeesController_delete40_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_EmployeesController_delete40_invoker.call(EmployeesController_21.delete(email))
      }
  
    // @LINE:58
    case controllers_StatementController_index41_route(params) =>
      call { 
        controllers_StatementController_index41_invoker.call(StatementController_26.index())
      }
  
    // @LINE:59
    case controllers_StatementController_employeeStatement42_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_StatementController_employeeStatement42_invoker.call(StatementController_26.employeeStatement(email))
      }
  
    // @LINE:60
    case controllers_StatementController_sendStatementToEmployee43_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendStatementToEmployee43_invoker.call(StatementController_26.sendStatementToEmployee(idE, idS))
      }
  
    // @LINE:61
    case controllers_StatementController_sendToVerify44_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToVerify44_invoker.call(StatementController_26.sendToVerify(idE, idS))
      }
  
    // @LINE:64
    case controllers_SubjectController_index45_route(params) =>
      call { 
        controllers_SubjectController_index45_invoker.call(SubjectController_30.index())
      }
  
    // @LINE:65
    case controllers_SubjectController_save46_route(params) =>
      call { 
        controllers_SubjectController_save46_invoker.call(SubjectController_30.save())
      }
  
    // @LINE:67
    case controllers_ClassroomController_index47_route(params) =>
      call { 
        controllers_ClassroomController_index47_invoker.call(ClassroomController_31.index())
      }
  
    // @LINE:68
    case controllers_ClassroomController_save48_route(params) =>
      call { 
        controllers_ClassroomController_save48_invoker.call(ClassroomController_31.save())
      }
  
    // @LINE:69
    case controllers_ClassroomController_edit49_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClassroomController_edit49_invoker.call(ClassroomController_31.edit(id))
      }
  
    // @LINE:70
    case controllers_ClassroomController_update50_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_update50_invoker.call(ClassroomController_31.update(id))
      }
  
    // @LINE:71
    case controllers_ClassroomController_delete51_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_delete51_invoker.call(ClassroomController_31.delete(id))
      }
  
    // @LINE:73
    case controllers_TeachersRoleController_index52_route(params) =>
      call { 
        controllers_TeachersRoleController_index52_invoker.call(TeachersRoleController_23.index())
      }
  
    // @LINE:74
    case controllers_TeachersRoleController_save53_route(params) =>
      call { 
        controllers_TeachersRoleController_save53_invoker.call(TeachersRoleController_23.save())
      }
  
    // @LINE:75
    case controllers_TeachersRoleController_edit54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_edit54_invoker.call(TeachersRoleController_23.edit(id))
      }
  
    // @LINE:76
    case controllers_TeachersRoleController_update55_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_update55_invoker.call(TeachersRoleController_23.update(id))
      }
  
    // @LINE:77
    case controllers_TeachersRoleController_delete56_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_delete56_invoker.call(TeachersRoleController_23.delete(id))
      }
  
    // @LINE:80
    case controllers_FieldOfStudyController_index57_route(params) =>
      call { 
        controllers_FieldOfStudyController_index57_invoker.call(FieldOfStudyController_11.index())
      }
  
    // @LINE:81
    case controllers_FieldOfStudyController_save58_route(params) =>
      call { 
        controllers_FieldOfStudyController_save58_invoker.call(FieldOfStudyController_11.save())
      }
  
    // @LINE:83
    case controllers_CommitteeController_index59_route(params) =>
      call { 
        controllers_CommitteeController_index59_invoker.call(CommitteeController_27.index())
      }
  
    // @LINE:84
    case controllers_CommitteeController_save60_route(params) =>
      call { 
        controllers_CommitteeController_save60_invoker.call(CommitteeController_27.save())
      }
  
    // @LINE:86
    case controllers_PersonalStatisticController_index61_route(params) =>
      call { 
        controllers_PersonalStatisticController_index61_invoker.call(PersonalStatisticController_14.index())
      }
  
    // @LINE:87
    case controllers_PersonalStatisticController_teachingAAA62_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAA62_invoker.call(PersonalStatisticController_14.teachingAAA())
      }
  
    // @LINE:88
    case controllers_PersonalStatisticController_teachingAAB63_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAB63_invoker.call(PersonalStatisticController_14.teachingAAB())
      }
  
    // @LINE:89
    case controllers_PersonalStatisticController_teachingCB64_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingCB64_invoker.call(PersonalStatisticController_14.teachingCB())
      }
  
    // @LINE:92
    case controllers_StatisticController_index65_route(params) =>
      call { 
        controllers_StatisticController_index65_invoker.call(StatisticController_4.index())
      }
  
    // @LINE:93
    case controllers_StatisticController_studyPlansTable66_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTable66_invoker.call(StatisticController_4.studyPlansTable())
      }
  
    // @LINE:94
    case controllers_StatisticController_studyPlansTablePrint67_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTablePrint67_invoker.call(StatisticController_4.studyPlansTablePrint())
      }
  
    // @LINE:97
    case controllers_StudyGroupsController_index68_route(params) =>
      call { 
        controllers_StudyGroupsController_index68_invoker.call(StudyGroupsController_7.index())
      }
  
    // @LINE:98
    case controllers_StudyGroupsController_save69_route(params) =>
      call { 
        controllers_StudyGroupsController_save69_invoker.call(StudyGroupsController_7.save())
      }
  
    // @LINE:99
    case controllers_TableController_listStudyGroups70_route(params) =>
      call { 
        controllers_TableController_listStudyGroups70_invoker.call(TableController_17.listStudyGroups())
      }
  
    // @LINE:102
    case controllers_SemestersController_index71_route(params) =>
      call { 
        controllers_SemestersController_index71_invoker.call(SemestersController_24.index())
      }
  
    // @LINE:103
    case controllers_SemestersController_save72_route(params) =>
      call { 
        controllers_SemestersController_save72_invoker.call(SemestersController_24.save())
      }
  
    // @LINE:104
    case controllers_TableController_listSemesters73_route(params) =>
      call { 
        controllers_TableController_listSemesters73_invoker.call(TableController_17.listSemesters())
      }
  
    // @LINE:107
    case controllers_StudyPlansController_index74_route(params) =>
      call { 
        controllers_StudyPlansController_index74_invoker.call(StudyPlansController_13.index())
      }
  
    // @LINE:108
    case controllers_StudyPlansController_save75_route(params) =>
      call { 
        controllers_StudyPlansController_save75_invoker.call(StudyPlansController_13.save())
      }
  
    // @LINE:109
    case controllers_TableController_listStudyPlans76_route(params) =>
      call { 
        controllers_TableController_listStudyPlans76_invoker.call(TableController_17.listStudyPlans())
      }
  
    // @LINE:111
    case controllers_CourseController_index77_route(params) =>
      call { 
        controllers_CourseController_index77_invoker.call(CourseController_3.index())
      }
  
    // @LINE:112
    case controllers_CourseController_save78_route(params) =>
      call { 
        controllers_CourseController_save78_invoker.call(CourseController_3.save())
      }
  
    // @LINE:114
    case controllers_TableController_listScheduleInWeeks79_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks79_invoker.call(TableController_17.listScheduleInWeeks())
      }
  
    // @LINE:116
    case controllers_TableController_listSchedule80_route(params) =>
      call { 
        controllers_TableController_listSchedule80_invoker.call(TableController_17.listSchedule())
      }
  
    // @LINE:117
    case controllers_TableController_listEmployees81_route(params) =>
      call { 
        controllers_TableController_listEmployees81_invoker.call(TableController_17.listEmployees())
      }
  
    // @LINE:118
    case controllers_TableController_listTeachers82_route(params) =>
      call { 
        controllers_TableController_listTeachers82_invoker.call(TableController_17.listTeachers())
      }
  
    // @LINE:119
    case controllers_TableController_listSubjects83_route(params) =>
      call { 
        controllers_TableController_listSubjects83_invoker.call(TableController_17.listSubjects())
      }
  
    // @LINE:120
    case controllers_TableController_listFieldsOfStudy84_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy84_invoker.call(TableController_17.listFieldsOfStudy())
      }
  
    // @LINE:121
    case controllers_TableController_listCourses85_route(params) =>
      call { 
        controllers_TableController_listCourses85_invoker.call(TableController_17.listCourses())
      }
  
    // @LINE:122
    case controllers_TableController_listCurrentSemesters86_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters86_invoker.call(TableController_17.listCurrentSemesters())
      }
  
    // @LINE:123
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy87_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy87_invoker.call(TableController_17.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:124
    case controllers_TableController_listDays88_route(params) =>
      call { 
        controllers_TableController_listDays88_invoker.call(TableController_17.listDays())
      }
  
    // @LINE:125
    case controllers_TableController_listClassrooms89_route(params) =>
      call { 
        controllers_TableController_listClassrooms89_invoker.call(TableController_17.listClassrooms())
      }
  
    // @LINE:126
    case controllers_TableController_listTeachersRole90_route(params) =>
      call { 
        controllers_TableController_listTeachersRole90_invoker.call(TableController_17.listTeachersRole())
      }
  
    // @LINE:127
    case controllers_TableController_listCommittees91_route(params) =>
      call { 
        controllers_TableController_listCommittees91_invoker.call(TableController_17.listCommittees())
      }
  
    // @LINE:128
    case controllers_TableController_listPublications92_route(params) =>
      call { 
        controllers_TableController_listPublications92_invoker.call(TableController_17.listPublications())
      }
  
    // @LINE:129
    case controllers_TableController_listTeachersInWeeks93_route(params) =>
      call { 
        controllers_TableController_listTeachersInWeeks93_invoker.call(TableController_17.listTeachersInWeeks())
      }
  
    // @LINE:131
    case controllers_StatisticController_listEmployeesActvitiy94_route(params) =>
      call { 
        controllers_StatisticController_listEmployeesActvitiy94_invoker.call(StatisticController_4.listEmployeesActvitiy())
      }
  
    // @LINE:132
    case controllers_StatisticController_listEmployeerActvitiy95_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_StatisticController_listEmployeerActvitiy95_invoker.call(StatisticController_4.listEmployeerActvitiy(email))
      }
  
    // @LINE:133
    case controllers_PersonalStatisticController_listTableTeachingAccordingToPersons96_route(params) =>
      call { 
        controllers_PersonalStatisticController_listTableTeachingAccordingToPersons96_invoker.call(PersonalStatisticController_14.listTableTeachingAccordingToPersons())
      }
  
    // @LINE:134
    case controllers_PersonalStatisticController_listTableTeachingAccordingToId97_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_PersonalStatisticController_listTableTeachingAccordingToId97_invoker.call(PersonalStatisticController_14.listTableTeachingAccordingToId(email))
      }
  
    // @LINE:136
    case controllers_TeachersController_index98_route(params) =>
      call { 
        controllers_TeachersController_index98_invoker.call(TeachersController_9.index())
      }
  
    // @LINE:137
    case controllers_TeachersController_save99_route(params) =>
      call { 
        controllers_TeachersController_save99_invoker.call(TeachersController_9.save())
      }
  
    // @LINE:140
    case controllers_MethodicsController_index100_route(params) =>
      call { 
        controllers_MethodicsController_index100_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:141
    case controllers_MethodicsController_save101_route(params) =>
      call { 
        controllers_MethodicsController_save101_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:143
    case controllers_Application_roles102_route(params) =>
      call { 
        controllers_Application_roles102_invoker.call(Application_28.roles())
      }
  
    // @LINE:146
    case controllers_TableController_listPerson103_route(params) =>
      call { 
        controllers_TableController_listPerson103_invoker.call(TableController_17.listPerson())
      }
  
    // @LINE:148
    case controllers_SubjectPlanTeachingController_index104_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index104_invoker.call(SubjectPlanTeachingController_10.index())
      }
  
    // @LINE:149
    case controllers_SubjectPlanTeachingController_save105_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save105_invoker.call(SubjectPlanTeachingController_10.save())
      }
  
    // @LINE:152
    case controllers_Application_logout106_route(params) =>
      call { 
        controllers_Application_logout106_invoker.call(Application_28.logout())
      }
  
    // @LINE:155
    case controllers_PrintController_printUserDetails107_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails107_invoker.call(PrintController_18.printUserDetails(id))
      }
  
    // @LINE:156
    case controllers_PrintController_detailsList108_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList108_invoker.call(PrintController_18.detailsList(id))
      }
  
    // @LINE:158
    case controllers_SalaryController_saveLector109_route(params) =>
      call { 
        controllers_SalaryController_saveLector109_invoker.call(SalaryController_16.saveLector())
      }
  
    // @LINE:159
    case controllers_SalaryController_printLector110_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector110_invoker.call(SalaryController_16.printLector(id))
      }
  
    // @LINE:160
    case controllers_SalaryController_detailsListLector111_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector111_invoker.call(SalaryController_16.detailsListLector(id))
      }
  
    // @LINE:164
    case controllers_Assets_at112_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at112_invoker.call(Assets_25.at(path, file))
      }
  }
}
