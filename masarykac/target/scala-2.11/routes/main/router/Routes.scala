
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Mon May 08 19:48:26 CEST 2017

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
  Application_30: controllers.Application,
  // @LINE:10
  TestController_21: controllers.TestController,
  // @LINE:13
  SalaryController_17: controllers.SalaryController,
  // @LINE:14
  Login_23: controllers.Login,
  // @LINE:16
  Charts_31: controllers.Charts,
  // @LINE:20
  UiElements_20: controllers.UiElements,
  // @LINE:26
  Pages_5: controllers.Pages,
  // @LINE:29
  PersonController_2: controllers.PersonController,
  // @LINE:32
  VisitsController_1: controllers.VisitsController,
  // @LINE:35
  ProjectController_16: controllers.ProjectController,
  // @LINE:38
  FinalWorksController_6: controllers.FinalWorksController,
  // @LINE:41
  PublicationsController_8: controllers.PublicationsController,
  // @LINE:44
  OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
  // @LINE:51
  EmployeesController_22: controllers.EmployeesController,
  // @LINE:58
  StatementController_27: controllers.StatementController,
  // @LINE:70
  SubjectController_33: controllers.SubjectController,
  // @LINE:73
  ClassroomController_34: controllers.ClassroomController,
  // @LINE:79
  TeachersRoleController_24: controllers.TeachersRoleController,
  // @LINE:86
  FieldOfStudyController_11: controllers.FieldOfStudyController,
  // @LINE:89
  CommitteeController_29: controllers.CommitteeController,
  // @LINE:92
  PersonalStatisticController_15: controllers.PersonalStatisticController,
  // @LINE:98
  StatisticController_4: controllers.StatisticController,
  // @LINE:103
  StudyGroupsController_7: controllers.StudyGroupsController,
  // @LINE:105
  TableController_18: controllers.TableController,
  // @LINE:108
  SemestersController_25: controllers.SemestersController,
  // @LINE:113
  StudyPlansController_14: controllers.StudyPlansController,
  // @LINE:117
  CourseController_3: controllers.CourseController,
  // @LINE:143
  TeachersController_9: controllers.TeachersController,
  // @LINE:146
  AccessRoleController_32: controllers.AccessRoleController,
  // @LINE:153
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:161
  SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
  // @LINE:164
  PDFController_13: controllers.PDFController,
  // @LINE:166
  DOCController_28: controllers.DOCController,
  // @LINE:172
  PrintController_19: controllers.PrintController,
  // @LINE:181
  Assets_26: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_30: controllers.Application,
    // @LINE:10
    TestController_21: controllers.TestController,
    // @LINE:13
    SalaryController_17: controllers.SalaryController,
    // @LINE:14
    Login_23: controllers.Login,
    // @LINE:16
    Charts_31: controllers.Charts,
    // @LINE:20
    UiElements_20: controllers.UiElements,
    // @LINE:26
    Pages_5: controllers.Pages,
    // @LINE:29
    PersonController_2: controllers.PersonController,
    // @LINE:32
    VisitsController_1: controllers.VisitsController,
    // @LINE:35
    ProjectController_16: controllers.ProjectController,
    // @LINE:38
    FinalWorksController_6: controllers.FinalWorksController,
    // @LINE:41
    PublicationsController_8: controllers.PublicationsController,
    // @LINE:44
    OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
    // @LINE:51
    EmployeesController_22: controllers.EmployeesController,
    // @LINE:58
    StatementController_27: controllers.StatementController,
    // @LINE:70
    SubjectController_33: controllers.SubjectController,
    // @LINE:73
    ClassroomController_34: controllers.ClassroomController,
    // @LINE:79
    TeachersRoleController_24: controllers.TeachersRoleController,
    // @LINE:86
    FieldOfStudyController_11: controllers.FieldOfStudyController,
    // @LINE:89
    CommitteeController_29: controllers.CommitteeController,
    // @LINE:92
    PersonalStatisticController_15: controllers.PersonalStatisticController,
    // @LINE:98
    StatisticController_4: controllers.StatisticController,
    // @LINE:103
    StudyGroupsController_7: controllers.StudyGroupsController,
    // @LINE:105
    TableController_18: controllers.TableController,
    // @LINE:108
    SemestersController_25: controllers.SemestersController,
    // @LINE:113
    StudyPlansController_14: controllers.StudyPlansController,
    // @LINE:117
    CourseController_3: controllers.CourseController,
    // @LINE:143
    TeachersController_9: controllers.TeachersController,
    // @LINE:146
    AccessRoleController_32: controllers.AccessRoleController,
    // @LINE:153
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:161
    SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
    // @LINE:164
    PDFController_13: controllers.PDFController,
    // @LINE:166
    DOCController_28: controllers.DOCController,
    // @LINE:172
    PrintController_19: controllers.PrintController,
    // @LINE:181
    Assets_26: controllers.Assets
  ) = this(errorHandler, Application_30, TestController_21, SalaryController_17, Login_23, Charts_31, UiElements_20, Pages_5, PersonController_2, VisitsController_1, ProjectController_16, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_22, StatementController_27, SubjectController_33, ClassroomController_34, TeachersRoleController_24, FieldOfStudyController_11, CommitteeController_29, PersonalStatisticController_15, StatisticController_4, StudyGroupsController_7, TableController_18, SemestersController_25, StudyPlansController_14, CourseController_3, TeachersController_9, AccessRoleController_32, MethodicsController_0, SubjectPlanTeachingController_10, PDFController_13, DOCController_28, PrintController_19, Assets_26, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_30, TestController_21, SalaryController_17, Login_23, Charts_31, UiElements_20, Pages_5, PersonController_2, VisitsController_1, ProjectController_16, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_22, StatementController_27, SubjectController_33, ClassroomController_34, TeachersRoleController_24, FieldOfStudyController_11, CommitteeController_29, PersonalStatisticController_15, StatisticController_4, StudyGroupsController_7, TableController_18, SemestersController_25, StudyPlansController_14, CourseController_3, TeachersController_9, AccessRoleController_32, MethodicsController_0, SubjectPlanTeachingController_10, PDFController_13, DOCController_28, PrintController_19, Assets_26, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/info/""" + "$" + """uid<[^/]+>""", """controllers.EmployeesController.info(uid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/edit/""" + "$" + """uid<[^/]+>""", """controllers.EmployeesController.edit(uid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/updated/""", """controllers.EmployeesController.update(uid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/delete""", """controllers.EmployeesController.delete(uid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement""", """controllers.StatementController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/employee/""" + "$" + """uid<[^/]+>""", """controllers.StatementController.employeeStatement(uid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/check/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendStatementToEmployee(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/info/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.infoStatementToEmployee(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/ver/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendToVerify(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/agree/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendToAgree(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/repair/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendToRepair(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/repaired/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.sendRepairedStatement(idE:Long, idS:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/checkrepaired/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.checkRepairStatementToEmployee(idE:Long, idS:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statement/employeecheck/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>""", """controllers.StatementController.employeeCheckStatement(idE:Long, idS:Long)"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessroles""", """controllers.TableController.listAccessRole()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """committees""", """controllers.TableController.listCommittees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """publications""", """controllers.TableController.listPublications()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tiw""", """controllers.TableController.listTeachersInWeeks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat""", """controllers.StatisticController.listEmployeesActvitiy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estat/info/""" + "$" + """uid<[^/]+>""", """controllers.StatisticController.listEmployeerActvitiy(uid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teaching""", """controllers.PersonalStatisticController.listTableTeachingAccordingToPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teaching/t/""" + "$" + """uid<[^/]+>""", """controllers.PersonalStatisticController.listTableTeachingAccordingToId(uid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachers/add""", """controllers.TeachersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """teachers/saved""", """controllers.TeachersController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessrole/add""", """controllers.AccessRoleController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessrole/saved""", """controllers.AccessRoleController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessrole/edit/""" + "$" + """id<[^/]+>""", """controllers.AccessRoleController.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessrole/updated/""", """controllers.AccessRoleController.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessrole/delete""", """controllers.AccessRoleController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/add""", """controllers.MethodicsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """m/saved""", """controllers.MethodicsController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """roles""", """controllers.Application.roles()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.TableController.listPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sub/add""", """controllers.SubjectPlanTeachingController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sub/saved""", """controllers.SubjectPlanTeachingController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableEmployees""", """controllers.PDFController.pdfTableEmployees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableEmployees""", """controllers.DOCController.docTableEmployees()"""),
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
    Application_30.dashboard(),
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
    Application_30.pdf(),
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
    Application_30.raw(),
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
    Application_30.index(),
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
    TestController_21.test(),
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
    TestController_21.save(),
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
    Application_30.kpiChoosePerson(),
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
    SalaryController_17.getPerson(),
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
    Login_23.index(),
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
    Login_23.authenticate(),
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
    Charts_31.flot(),
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
    Charts_31.morris(),
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
    Application_30.tables(),
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
    Application_30.forms(),
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
    UiElements_20.panelsAndWells(),
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
    UiElements_20.buttons(),
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
    UiElements_20.notifications(),
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
    UiElements_20.typography(),
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
    UiElements_20.icons(),
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
    UiElements_20.grid(),
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
    ProjectController_16.index(),
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
    ProjectController_16.save(),
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
    EmployeesController_22.index(),
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
    EmployeesController_22.save(),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/info/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_info37_invoker = createInvoker(
    EmployeesController_22.info(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "info",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """employee/info/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_EmployeesController_edit38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/edit/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_edit38_invoker = createInvoker(
    EmployeesController_22.edit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeesController",
      "edit",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """employee/edit/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_EmployeesController_update39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/updated/")))
  )
  private[this] lazy val controllers_EmployeesController_update39_invoker = createInvoker(
    EmployeesController_22.update(fakeValue[String]),
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
    EmployeesController_22.delete(fakeValue[String]),
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
    StatementController_27.index(),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/employee/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_employeeStatement42_invoker = createInvoker(
    StatementController_27.employeeStatement(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "employeeStatement",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """statement/employee/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_StatementController_sendStatementToEmployee43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/check/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendStatementToEmployee43_invoker = createInvoker(
    StatementController_27.sendStatementToEmployee(fakeValue[Long], fakeValue[Long]),
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
  private[this] lazy val controllers_StatementController_infoStatementToEmployee44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/info/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_infoStatementToEmployee44_invoker = createInvoker(
    StatementController_27.infoStatementToEmployee(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "infoStatementToEmployee",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/info/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_StatementController_sendToVerify45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/ver/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToVerify45_invoker = createInvoker(
    StatementController_27.sendToVerify(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:63
  private[this] lazy val controllers_StatementController_sendToAgree46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/agree/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToAgree46_invoker = createInvoker(
    StatementController_27.sendToAgree(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "sendToAgree",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/agree/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_StatementController_sendToRepair47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/repair/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToRepair47_invoker = createInvoker(
    StatementController_27.sendToRepair(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "sendToRepair",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/repair/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_StatementController_sendRepairedStatement48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/repaired/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendRepairedStatement48_invoker = createInvoker(
    StatementController_27.sendRepairedStatement(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "sendRepairedStatement",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/repaired/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_StatementController_checkRepairStatementToEmployee49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/checkrepaired/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_checkRepairStatementToEmployee49_invoker = createInvoker(
    StatementController_27.checkRepairStatementToEmployee(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "checkRepairStatementToEmployee",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """statement/checkrepaired/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_StatementController_employeeCheckStatement50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/employeecheck/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_employeeCheckStatement50_invoker = createInvoker(
    StatementController_27.employeeCheckStatement(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatementController",
      "employeeCheckStatement",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """statement/employeecheck/""" + "$" + """idE<[^/]+>""" + "$" + """idS<[^/]+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_SubjectController_index51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index51_invoker = createInvoker(
    SubjectController_33.index(),
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

  // @LINE:71
  private[this] lazy val controllers_SubjectController_save52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save52_invoker = createInvoker(
    SubjectController_33.save(),
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

  // @LINE:73
  private[this] lazy val controllers_ClassroomController_index53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/add")))
  )
  private[this] lazy val controllers_ClassroomController_index53_invoker = createInvoker(
    ClassroomController_34.index(),
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

  // @LINE:74
  private[this] lazy val controllers_ClassroomController_save54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/saved")))
  )
  private[this] lazy val controllers_ClassroomController_save54_invoker = createInvoker(
    ClassroomController_34.save(),
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

  // @LINE:75
  private[this] lazy val controllers_ClassroomController_edit55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_edit55_invoker = createInvoker(
    ClassroomController_34.edit(fakeValue[Long]),
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

  // @LINE:76
  private[this] lazy val controllers_ClassroomController_update56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/updated/")))
  )
  private[this] lazy val controllers_ClassroomController_update56_invoker = createInvoker(
    ClassroomController_34.update(fakeValue[Long]),
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

  // @LINE:77
  private[this] lazy val controllers_ClassroomController_delete57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/delete")))
  )
  private[this] lazy val controllers_ClassroomController_delete57_invoker = createInvoker(
    ClassroomController_34.delete(fakeValue[Long]),
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

  // @LINE:79
  private[this] lazy val controllers_TeachersRoleController_index58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/add")))
  )
  private[this] lazy val controllers_TeachersRoleController_index58_invoker = createInvoker(
    TeachersRoleController_24.index(),
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

  // @LINE:80
  private[this] lazy val controllers_TeachersRoleController_save59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/saved")))
  )
  private[this] lazy val controllers_TeachersRoleController_save59_invoker = createInvoker(
    TeachersRoleController_24.save(),
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

  // @LINE:81
  private[this] lazy val controllers_TeachersRoleController_edit60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TeachersRoleController_edit60_invoker = createInvoker(
    TeachersRoleController_24.edit(fakeValue[Long]),
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

  // @LINE:82
  private[this] lazy val controllers_TeachersRoleController_update61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/updated/")))
  )
  private[this] lazy val controllers_TeachersRoleController_update61_invoker = createInvoker(
    TeachersRoleController_24.update(fakeValue[Long]),
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

  // @LINE:83
  private[this] lazy val controllers_TeachersRoleController_delete62_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/delete")))
  )
  private[this] lazy val controllers_TeachersRoleController_delete62_invoker = createInvoker(
    TeachersRoleController_24.delete(fakeValue[Long]),
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

  // @LINE:86
  private[this] lazy val controllers_FieldOfStudyController_index63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index63_invoker = createInvoker(
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

  // @LINE:87
  private[this] lazy val controllers_FieldOfStudyController_save64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save64_invoker = createInvoker(
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

  // @LINE:89
  private[this] lazy val controllers_CommitteeController_index65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/add")))
  )
  private[this] lazy val controllers_CommitteeController_index65_invoker = createInvoker(
    CommitteeController_29.index(),
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

  // @LINE:90
  private[this] lazy val controllers_CommitteeController_save66_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/saved")))
  )
  private[this] lazy val controllers_CommitteeController_save66_invoker = createInvoker(
    CommitteeController_29.save(),
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

  // @LINE:92
  private[this] lazy val controllers_PersonalStatisticController_index67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index67_invoker = createInvoker(
    PersonalStatisticController_15.index(),
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

  // @LINE:93
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aaa")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA68_invoker = createInvoker(
    PersonalStatisticController_15.teachingAAA(),
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

  // @LINE:94
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aab")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB69_invoker = createInvoker(
    PersonalStatisticController_15.teachingAAB(),
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

  // @LINE:95
  private[this] lazy val controllers_PersonalStatisticController_teachingCB70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/cb")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingCB70_invoker = createInvoker(
    PersonalStatisticController_15.teachingCB(),
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

  // @LINE:98
  private[this] lazy val controllers_StatisticController_index71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcps")))
  )
  private[this] lazy val controllers_StatisticController_index71_invoker = createInvoker(
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

  // @LINE:99
  private[this] lazy val controllers_StatisticController_studyPlansTable72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sp")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTable72_invoker = createInvoker(
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

  // @LINE:100
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spprint")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint73_invoker = createInvoker(
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

  // @LINE:103
  private[this] lazy val controllers_StudyGroupsController_index74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index74_invoker = createInvoker(
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

  // @LINE:104
  private[this] lazy val controllers_StudyGroupsController_save75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save75_invoker = createInvoker(
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

  // @LINE:105
  private[this] lazy val controllers_TableController_listStudyGroups76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups76_invoker = createInvoker(
    TableController_18.listStudyGroups(),
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

  // @LINE:108
  private[this] lazy val controllers_SemestersController_index77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index77_invoker = createInvoker(
    SemestersController_25.index(),
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

  // @LINE:109
  private[this] lazy val controllers_SemestersController_save78_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save78_invoker = createInvoker(
    SemestersController_25.save(),
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

  // @LINE:110
  private[this] lazy val controllers_TableController_listSemesters79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters79_invoker = createInvoker(
    TableController_18.listSemesters(),
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

  // @LINE:113
  private[this] lazy val controllers_StudyPlansController_index80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index80_invoker = createInvoker(
    StudyPlansController_14.index(),
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

  // @LINE:114
  private[this] lazy val controllers_StudyPlansController_save81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save81_invoker = createInvoker(
    StudyPlansController_14.save(),
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

  // @LINE:115
  private[this] lazy val controllers_TableController_listStudyPlans82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans82_invoker = createInvoker(
    TableController_18.listStudyPlans(),
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

  // @LINE:117
  private[this] lazy val controllers_CourseController_index83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index83_invoker = createInvoker(
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

  // @LINE:118
  private[this] lazy val controllers_CourseController_save84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save84_invoker = createInvoker(
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

  // @LINE:120
  private[this] lazy val controllers_TableController_listScheduleInWeeks85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks85_invoker = createInvoker(
    TableController_18.listScheduleInWeeks(),
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

  // @LINE:122
  private[this] lazy val controllers_TableController_listSchedule86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule86_invoker = createInvoker(
    TableController_18.listSchedule(),
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

  // @LINE:123
  private[this] lazy val controllers_TableController_listEmployees87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees87_invoker = createInvoker(
    TableController_18.listEmployees(),
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

  // @LINE:124
  private[this] lazy val controllers_TableController_listTeachers88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers88_invoker = createInvoker(
    TableController_18.listTeachers(),
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

  // @LINE:125
  private[this] lazy val controllers_TableController_listSubjects89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects89_invoker = createInvoker(
    TableController_18.listSubjects(),
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

  // @LINE:126
  private[this] lazy val controllers_TableController_listFieldsOfStudy90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy90_invoker = createInvoker(
    TableController_18.listFieldsOfStudy(),
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

  // @LINE:127
  private[this] lazy val controllers_TableController_listCourses91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses91_invoker = createInvoker(
    TableController_18.listCourses(),
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

  // @LINE:128
  private[this] lazy val controllers_TableController_listCurrentSemesters92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters92_invoker = createInvoker(
    TableController_18.listCurrentSemesters(),
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

  // @LINE:129
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy93_invoker = createInvoker(
    TableController_18.listCurrentSemestersUntilTheEndOfStudy(),
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

  // @LINE:130
  private[this] lazy val controllers_TableController_listDays94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays94_invoker = createInvoker(
    TableController_18.listDays(),
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

  // @LINE:131
  private[this] lazy val controllers_TableController_listClassrooms95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classrooms")))
  )
  private[this] lazy val controllers_TableController_listClassrooms95_invoker = createInvoker(
    TableController_18.listClassrooms(),
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

  // @LINE:132
  private[this] lazy val controllers_TableController_listTeachersRole96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachroles")))
  )
  private[this] lazy val controllers_TableController_listTeachersRole96_invoker = createInvoker(
    TableController_18.listTeachersRole(),
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

  // @LINE:133
  private[this] lazy val controllers_TableController_listAccessRole97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessroles")))
  )
  private[this] lazy val controllers_TableController_listAccessRole97_invoker = createInvoker(
    TableController_18.listAccessRole(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TableController",
      "listAccessRole",
      Nil,
      "GET",
      """""",
      this.prefix + """accessroles"""
    )
  )

  // @LINE:134
  private[this] lazy val controllers_TableController_listCommittees98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committees")))
  )
  private[this] lazy val controllers_TableController_listCommittees98_invoker = createInvoker(
    TableController_18.listCommittees(),
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

  // @LINE:135
  private[this] lazy val controllers_TableController_listPublications99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_TableController_listPublications99_invoker = createInvoker(
    TableController_18.listPublications(),
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

  // @LINE:136
  private[this] lazy val controllers_TableController_listTeachersInWeeks100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tiw")))
  )
  private[this] lazy val controllers_TableController_listTeachersInWeeks100_invoker = createInvoker(
    TableController_18.listTeachersInWeeks(),
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

  // @LINE:138
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat")))
  )
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy101_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat/info/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy102_invoker = createInvoker(
    StatisticController_4.listEmployeerActvitiy(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "listEmployeerActvitiy",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """estat/info/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:140
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching")))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons103_invoker = createInvoker(
    PersonalStatisticController_15.listTableTeachingAccordingToPersons(),
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

  // @LINE:141
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId104_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching/t/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId104_invoker = createInvoker(
    PersonalStatisticController_15.listTableTeachingAccordingToId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonalStatisticController",
      "listTableTeachingAccordingToId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """teaching/t/""" + "$" + """uid<[^/]+>"""
    )
  )

  // @LINE:143
  private[this] lazy val controllers_TeachersController_index105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index105_invoker = createInvoker(
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

  // @LINE:144
  private[this] lazy val controllers_TeachersController_save106_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save106_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_AccessRoleController_index107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/add")))
  )
  private[this] lazy val controllers_AccessRoleController_index107_invoker = createInvoker(
    AccessRoleController_32.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessRoleController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """accessrole/add"""
    )
  )

  // @LINE:147
  private[this] lazy val controllers_AccessRoleController_save108_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/saved")))
  )
  private[this] lazy val controllers_AccessRoleController_save108_invoker = createInvoker(
    AccessRoleController_32.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessRoleController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """accessrole/saved"""
    )
  )

  // @LINE:148
  private[this] lazy val controllers_AccessRoleController_edit109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AccessRoleController_edit109_invoker = createInvoker(
    AccessRoleController_32.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessRoleController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """accessrole/edit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:149
  private[this] lazy val controllers_AccessRoleController_update110_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/updated/")))
  )
  private[this] lazy val controllers_AccessRoleController_update110_invoker = createInvoker(
    AccessRoleController_32.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessRoleController",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """accessrole/updated/"""
    )
  )

  // @LINE:150
  private[this] lazy val controllers_AccessRoleController_delete111_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/delete")))
  )
  private[this] lazy val controllers_AccessRoleController_delete111_invoker = createInvoker(
    AccessRoleController_32.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccessRoleController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """accessrole/delete"""
    )
  )

  // @LINE:153
  private[this] lazy val controllers_MethodicsController_index112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index112_invoker = createInvoker(
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

  // @LINE:154
  private[this] lazy val controllers_MethodicsController_save113_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save113_invoker = createInvoker(
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

  // @LINE:156
  private[this] lazy val controllers_Application_roles114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles114_invoker = createInvoker(
    Application_30.roles(),
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

  // @LINE:159
  private[this] lazy val controllers_TableController_listPerson115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson115_invoker = createInvoker(
    TableController_18.listPerson(),
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

  // @LINE:161
  private[this] lazy val controllers_SubjectPlanTeachingController_index116_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index116_invoker = createInvoker(
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

  // @LINE:162
  private[this] lazy val controllers_SubjectPlanTeachingController_save117_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save117_invoker = createInvoker(
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

  // @LINE:164
  private[this] lazy val controllers_PDFController_pdfTableEmployees118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableEmployees")))
  )
  private[this] lazy val controllers_PDFController_pdfTableEmployees118_invoker = createInvoker(
    PDFController_13.pdfTableEmployees(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableEmployees",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableEmployees"""
    )
  )

  // @LINE:166
  private[this] lazy val controllers_DOCController_docTableEmployees119_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableEmployees")))
  )
  private[this] lazy val controllers_DOCController_docTableEmployees119_invoker = createInvoker(
    DOCController_28.docTableEmployees(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableEmployees",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableEmployees"""
    )
  )

  // @LINE:169
  private[this] lazy val controllers_Application_logout120_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout120_invoker = createInvoker(
    Application_30.logout(),
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

  // @LINE:172
  private[this] lazy val controllers_PrintController_printUserDetails121_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails121_invoker = createInvoker(
    PrintController_19.printUserDetails(fakeValue[Long]),
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

  // @LINE:173
  private[this] lazy val controllers_PrintController_detailsList122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList122_invoker = createInvoker(
    PrintController_19.detailsList(fakeValue[Long]),
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

  // @LINE:175
  private[this] lazy val controllers_SalaryController_saveLector123_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector123_invoker = createInvoker(
    SalaryController_17.saveLector(),
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

  // @LINE:176
  private[this] lazy val controllers_SalaryController_printLector124_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector124_invoker = createInvoker(
    SalaryController_17.printLector(fakeValue[Long]),
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

  // @LINE:177
  private[this] lazy val controllers_SalaryController_detailsListLector125_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector125_invoker = createInvoker(
    SalaryController_17.detailsListLector(fakeValue[Long]),
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

  // @LINE:181
  private[this] lazy val controllers_Assets_at126_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at126_invoker = createInvoker(
    Assets_26.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_30.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_30.pdf())
      }
  
    // @LINE:8
    case controllers_Application_raw2_route(params) =>
      call { 
        controllers_Application_raw2_invoker.call(Application_30.raw())
      }
  
    // @LINE:9
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(Application_30.index())
      }
  
    // @LINE:10
    case controllers_TestController_test4_route(params) =>
      call { 
        controllers_TestController_test4_invoker.call(TestController_21.test())
      }
  
    // @LINE:11
    case controllers_TestController_save5_route(params) =>
      call { 
        controllers_TestController_save5_invoker.call(TestController_21.save())
      }
  
    // @LINE:12
    case controllers_Application_kpiChoosePerson6_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson6_invoker.call(Application_30.kpiChoosePerson())
      }
  
    // @LINE:13
    case controllers_SalaryController_getPerson7_route(params) =>
      call { 
        controllers_SalaryController_getPerson7_invoker.call(SalaryController_17.getPerson())
      }
  
    // @LINE:14
    case controllers_Login_index8_route(params) =>
      call { 
        controllers_Login_index8_invoker.call(Login_23.index())
      }
  
    // @LINE:15
    case controllers_Login_authenticate9_route(params) =>
      call { 
        controllers_Login_authenticate9_invoker.call(Login_23.authenticate())
      }
  
    // @LINE:16
    case controllers_Charts_flot10_route(params) =>
      call { 
        controllers_Charts_flot10_invoker.call(Charts_31.flot())
      }
  
    // @LINE:17
    case controllers_Charts_morris11_route(params) =>
      call { 
        controllers_Charts_morris11_invoker.call(Charts_31.morris())
      }
  
    // @LINE:18
    case controllers_Application_tables12_route(params) =>
      call { 
        controllers_Application_tables12_invoker.call(Application_30.tables())
      }
  
    // @LINE:19
    case controllers_Application_forms13_route(params) =>
      call { 
        controllers_Application_forms13_invoker.call(Application_30.forms())
      }
  
    // @LINE:20
    case controllers_UiElements_panelsAndWells14_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells14_invoker.call(UiElements_20.panelsAndWells())
      }
  
    // @LINE:21
    case controllers_UiElements_buttons15_route(params) =>
      call { 
        controllers_UiElements_buttons15_invoker.call(UiElements_20.buttons())
      }
  
    // @LINE:22
    case controllers_UiElements_notifications16_route(params) =>
      call { 
        controllers_UiElements_notifications16_invoker.call(UiElements_20.notifications())
      }
  
    // @LINE:23
    case controllers_UiElements_typography17_route(params) =>
      call { 
        controllers_UiElements_typography17_invoker.call(UiElements_20.typography())
      }
  
    // @LINE:24
    case controllers_UiElements_icons18_route(params) =>
      call { 
        controllers_UiElements_icons18_invoker.call(UiElements_20.icons())
      }
  
    // @LINE:25
    case controllers_UiElements_grid19_route(params) =>
      call { 
        controllers_UiElements_grid19_invoker.call(UiElements_20.grid())
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
        controllers_ProjectController_index25_invoker.call(ProjectController_16.index())
      }
  
    // @LINE:36
    case controllers_ProjectController_save26_route(params) =>
      call { 
        controllers_ProjectController_save26_invoker.call(ProjectController_16.save())
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
        controllers_EmployeesController_index35_invoker.call(EmployeesController_22.index())
      }
  
    // @LINE:52
    case controllers_EmployeesController_save36_route(params) =>
      call { 
        controllers_EmployeesController_save36_invoker.call(EmployeesController_22.save())
      }
  
    // @LINE:53
    case controllers_EmployeesController_info37_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_info37_invoker.call(EmployeesController_22.info(uid))
      }
  
    // @LINE:54
    case controllers_EmployeesController_edit38_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_edit38_invoker.call(EmployeesController_22.edit(uid))
      }
  
    // @LINE:55
    case controllers_EmployeesController_update39_route(params) =>
      call(params.fromQuery[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_update39_invoker.call(EmployeesController_22.update(uid))
      }
  
    // @LINE:56
    case controllers_EmployeesController_delete40_route(params) =>
      call(params.fromQuery[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_delete40_invoker.call(EmployeesController_22.delete(uid))
      }
  
    // @LINE:58
    case controllers_StatementController_index41_route(params) =>
      call { 
        controllers_StatementController_index41_invoker.call(StatementController_27.index())
      }
  
    // @LINE:59
    case controllers_StatementController_employeeStatement42_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_StatementController_employeeStatement42_invoker.call(StatementController_27.employeeStatement(uid))
      }
  
    // @LINE:60
    case controllers_StatementController_sendStatementToEmployee43_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendStatementToEmployee43_invoker.call(StatementController_27.sendStatementToEmployee(idE, idS))
      }
  
    // @LINE:61
    case controllers_StatementController_infoStatementToEmployee44_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_infoStatementToEmployee44_invoker.call(StatementController_27.infoStatementToEmployee(idE, idS))
      }
  
    // @LINE:62
    case controllers_StatementController_sendToVerify45_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToVerify45_invoker.call(StatementController_27.sendToVerify(idE, idS))
      }
  
    // @LINE:63
    case controllers_StatementController_sendToAgree46_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToAgree46_invoker.call(StatementController_27.sendToAgree(idE, idS))
      }
  
    // @LINE:64
    case controllers_StatementController_sendToRepair47_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToRepair47_invoker.call(StatementController_27.sendToRepair(idE, idS))
      }
  
    // @LINE:65
    case controllers_StatementController_sendRepairedStatement48_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendRepairedStatement48_invoker.call(StatementController_27.sendRepairedStatement(idE, idS))
      }
  
    // @LINE:66
    case controllers_StatementController_checkRepairStatementToEmployee49_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_checkRepairStatementToEmployee49_invoker.call(StatementController_27.checkRepairStatementToEmployee(idE, idS))
      }
  
    // @LINE:67
    case controllers_StatementController_employeeCheckStatement50_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_employeeCheckStatement50_invoker.call(StatementController_27.employeeCheckStatement(idE, idS))
      }
  
    // @LINE:70
    case controllers_SubjectController_index51_route(params) =>
      call { 
        controllers_SubjectController_index51_invoker.call(SubjectController_33.index())
      }
  
    // @LINE:71
    case controllers_SubjectController_save52_route(params) =>
      call { 
        controllers_SubjectController_save52_invoker.call(SubjectController_33.save())
      }
  
    // @LINE:73
    case controllers_ClassroomController_index53_route(params) =>
      call { 
        controllers_ClassroomController_index53_invoker.call(ClassroomController_34.index())
      }
  
    // @LINE:74
    case controllers_ClassroomController_save54_route(params) =>
      call { 
        controllers_ClassroomController_save54_invoker.call(ClassroomController_34.save())
      }
  
    // @LINE:75
    case controllers_ClassroomController_edit55_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClassroomController_edit55_invoker.call(ClassroomController_34.edit(id))
      }
  
    // @LINE:76
    case controllers_ClassroomController_update56_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_update56_invoker.call(ClassroomController_34.update(id))
      }
  
    // @LINE:77
    case controllers_ClassroomController_delete57_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_delete57_invoker.call(ClassroomController_34.delete(id))
      }
  
    // @LINE:79
    case controllers_TeachersRoleController_index58_route(params) =>
      call { 
        controllers_TeachersRoleController_index58_invoker.call(TeachersRoleController_24.index())
      }
  
    // @LINE:80
    case controllers_TeachersRoleController_save59_route(params) =>
      call { 
        controllers_TeachersRoleController_save59_invoker.call(TeachersRoleController_24.save())
      }
  
    // @LINE:81
    case controllers_TeachersRoleController_edit60_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_edit60_invoker.call(TeachersRoleController_24.edit(id))
      }
  
    // @LINE:82
    case controllers_TeachersRoleController_update61_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_update61_invoker.call(TeachersRoleController_24.update(id))
      }
  
    // @LINE:83
    case controllers_TeachersRoleController_delete62_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_delete62_invoker.call(TeachersRoleController_24.delete(id))
      }
  
    // @LINE:86
    case controllers_FieldOfStudyController_index63_route(params) =>
      call { 
        controllers_FieldOfStudyController_index63_invoker.call(FieldOfStudyController_11.index())
      }
  
    // @LINE:87
    case controllers_FieldOfStudyController_save64_route(params) =>
      call { 
        controllers_FieldOfStudyController_save64_invoker.call(FieldOfStudyController_11.save())
      }
  
    // @LINE:89
    case controllers_CommitteeController_index65_route(params) =>
      call { 
        controllers_CommitteeController_index65_invoker.call(CommitteeController_29.index())
      }
  
    // @LINE:90
    case controllers_CommitteeController_save66_route(params) =>
      call { 
        controllers_CommitteeController_save66_invoker.call(CommitteeController_29.save())
      }
  
    // @LINE:92
    case controllers_PersonalStatisticController_index67_route(params) =>
      call { 
        controllers_PersonalStatisticController_index67_invoker.call(PersonalStatisticController_15.index())
      }
  
    // @LINE:93
    case controllers_PersonalStatisticController_teachingAAA68_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAA68_invoker.call(PersonalStatisticController_15.teachingAAA())
      }
  
    // @LINE:94
    case controllers_PersonalStatisticController_teachingAAB69_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAB69_invoker.call(PersonalStatisticController_15.teachingAAB())
      }
  
    // @LINE:95
    case controllers_PersonalStatisticController_teachingCB70_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingCB70_invoker.call(PersonalStatisticController_15.teachingCB())
      }
  
    // @LINE:98
    case controllers_StatisticController_index71_route(params) =>
      call { 
        controllers_StatisticController_index71_invoker.call(StatisticController_4.index())
      }
  
    // @LINE:99
    case controllers_StatisticController_studyPlansTable72_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTable72_invoker.call(StatisticController_4.studyPlansTable())
      }
  
    // @LINE:100
    case controllers_StatisticController_studyPlansTablePrint73_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTablePrint73_invoker.call(StatisticController_4.studyPlansTablePrint())
      }
  
    // @LINE:103
    case controllers_StudyGroupsController_index74_route(params) =>
      call { 
        controllers_StudyGroupsController_index74_invoker.call(StudyGroupsController_7.index())
      }
  
    // @LINE:104
    case controllers_StudyGroupsController_save75_route(params) =>
      call { 
        controllers_StudyGroupsController_save75_invoker.call(StudyGroupsController_7.save())
      }
  
    // @LINE:105
    case controllers_TableController_listStudyGroups76_route(params) =>
      call { 
        controllers_TableController_listStudyGroups76_invoker.call(TableController_18.listStudyGroups())
      }
  
    // @LINE:108
    case controllers_SemestersController_index77_route(params) =>
      call { 
        controllers_SemestersController_index77_invoker.call(SemestersController_25.index())
      }
  
    // @LINE:109
    case controllers_SemestersController_save78_route(params) =>
      call { 
        controllers_SemestersController_save78_invoker.call(SemestersController_25.save())
      }
  
    // @LINE:110
    case controllers_TableController_listSemesters79_route(params) =>
      call { 
        controllers_TableController_listSemesters79_invoker.call(TableController_18.listSemesters())
      }
  
    // @LINE:113
    case controllers_StudyPlansController_index80_route(params) =>
      call { 
        controllers_StudyPlansController_index80_invoker.call(StudyPlansController_14.index())
      }
  
    // @LINE:114
    case controllers_StudyPlansController_save81_route(params) =>
      call { 
        controllers_StudyPlansController_save81_invoker.call(StudyPlansController_14.save())
      }
  
    // @LINE:115
    case controllers_TableController_listStudyPlans82_route(params) =>
      call { 
        controllers_TableController_listStudyPlans82_invoker.call(TableController_18.listStudyPlans())
      }
  
    // @LINE:117
    case controllers_CourseController_index83_route(params) =>
      call { 
        controllers_CourseController_index83_invoker.call(CourseController_3.index())
      }
  
    // @LINE:118
    case controllers_CourseController_save84_route(params) =>
      call { 
        controllers_CourseController_save84_invoker.call(CourseController_3.save())
      }
  
    // @LINE:120
    case controllers_TableController_listScheduleInWeeks85_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks85_invoker.call(TableController_18.listScheduleInWeeks())
      }
  
    // @LINE:122
    case controllers_TableController_listSchedule86_route(params) =>
      call { 
        controllers_TableController_listSchedule86_invoker.call(TableController_18.listSchedule())
      }
  
    // @LINE:123
    case controllers_TableController_listEmployees87_route(params) =>
      call { 
        controllers_TableController_listEmployees87_invoker.call(TableController_18.listEmployees())
      }
  
    // @LINE:124
    case controllers_TableController_listTeachers88_route(params) =>
      call { 
        controllers_TableController_listTeachers88_invoker.call(TableController_18.listTeachers())
      }
  
    // @LINE:125
    case controllers_TableController_listSubjects89_route(params) =>
      call { 
        controllers_TableController_listSubjects89_invoker.call(TableController_18.listSubjects())
      }
  
    // @LINE:126
    case controllers_TableController_listFieldsOfStudy90_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy90_invoker.call(TableController_18.listFieldsOfStudy())
      }
  
    // @LINE:127
    case controllers_TableController_listCourses91_route(params) =>
      call { 
        controllers_TableController_listCourses91_invoker.call(TableController_18.listCourses())
      }
  
    // @LINE:128
    case controllers_TableController_listCurrentSemesters92_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters92_invoker.call(TableController_18.listCurrentSemesters())
      }
  
    // @LINE:129
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy93_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy93_invoker.call(TableController_18.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:130
    case controllers_TableController_listDays94_route(params) =>
      call { 
        controllers_TableController_listDays94_invoker.call(TableController_18.listDays())
      }
  
    // @LINE:131
    case controllers_TableController_listClassrooms95_route(params) =>
      call { 
        controllers_TableController_listClassrooms95_invoker.call(TableController_18.listClassrooms())
      }
  
    // @LINE:132
    case controllers_TableController_listTeachersRole96_route(params) =>
      call { 
        controllers_TableController_listTeachersRole96_invoker.call(TableController_18.listTeachersRole())
      }
  
    // @LINE:133
    case controllers_TableController_listAccessRole97_route(params) =>
      call { 
        controllers_TableController_listAccessRole97_invoker.call(TableController_18.listAccessRole())
      }
  
    // @LINE:134
    case controllers_TableController_listCommittees98_route(params) =>
      call { 
        controllers_TableController_listCommittees98_invoker.call(TableController_18.listCommittees())
      }
  
    // @LINE:135
    case controllers_TableController_listPublications99_route(params) =>
      call { 
        controllers_TableController_listPublications99_invoker.call(TableController_18.listPublications())
      }
  
    // @LINE:136
    case controllers_TableController_listTeachersInWeeks100_route(params) =>
      call { 
        controllers_TableController_listTeachersInWeeks100_invoker.call(TableController_18.listTeachersInWeeks())
      }
  
    // @LINE:138
    case controllers_StatisticController_listEmployeesActvitiy101_route(params) =>
      call { 
        controllers_StatisticController_listEmployeesActvitiy101_invoker.call(StatisticController_4.listEmployeesActvitiy())
      }
  
    // @LINE:139
    case controllers_StatisticController_listEmployeerActvitiy102_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_StatisticController_listEmployeerActvitiy102_invoker.call(StatisticController_4.listEmployeerActvitiy(uid))
      }
  
    // @LINE:140
    case controllers_PersonalStatisticController_listTableTeachingAccordingToPersons103_route(params) =>
      call { 
        controllers_PersonalStatisticController_listTableTeachingAccordingToPersons103_invoker.call(PersonalStatisticController_15.listTableTeachingAccordingToPersons())
      }
  
    // @LINE:141
    case controllers_PersonalStatisticController_listTableTeachingAccordingToId104_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_PersonalStatisticController_listTableTeachingAccordingToId104_invoker.call(PersonalStatisticController_15.listTableTeachingAccordingToId(uid))
      }
  
    // @LINE:143
    case controllers_TeachersController_index105_route(params) =>
      call { 
        controllers_TeachersController_index105_invoker.call(TeachersController_9.index())
      }
  
    // @LINE:144
    case controllers_TeachersController_save106_route(params) =>
      call { 
        controllers_TeachersController_save106_invoker.call(TeachersController_9.save())
      }
  
    // @LINE:146
    case controllers_AccessRoleController_index107_route(params) =>
      call { 
        controllers_AccessRoleController_index107_invoker.call(AccessRoleController_32.index())
      }
  
    // @LINE:147
    case controllers_AccessRoleController_save108_route(params) =>
      call { 
        controllers_AccessRoleController_save108_invoker.call(AccessRoleController_32.save())
      }
  
    // @LINE:148
    case controllers_AccessRoleController_edit109_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_edit109_invoker.call(AccessRoleController_32.edit(id))
      }
  
    // @LINE:149
    case controllers_AccessRoleController_update110_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_update110_invoker.call(AccessRoleController_32.update(id))
      }
  
    // @LINE:150
    case controllers_AccessRoleController_delete111_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_delete111_invoker.call(AccessRoleController_32.delete(id))
      }
  
    // @LINE:153
    case controllers_MethodicsController_index112_route(params) =>
      call { 
        controllers_MethodicsController_index112_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:154
    case controllers_MethodicsController_save113_route(params) =>
      call { 
        controllers_MethodicsController_save113_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:156
    case controllers_Application_roles114_route(params) =>
      call { 
        controllers_Application_roles114_invoker.call(Application_30.roles())
      }
  
    // @LINE:159
    case controllers_TableController_listPerson115_route(params) =>
      call { 
        controllers_TableController_listPerson115_invoker.call(TableController_18.listPerson())
      }
  
    // @LINE:161
    case controllers_SubjectPlanTeachingController_index116_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index116_invoker.call(SubjectPlanTeachingController_10.index())
      }
  
    // @LINE:162
    case controllers_SubjectPlanTeachingController_save117_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save117_invoker.call(SubjectPlanTeachingController_10.save())
      }
  
    // @LINE:164
    case controllers_PDFController_pdfTableEmployees118_route(params) =>
      call { 
        controllers_PDFController_pdfTableEmployees118_invoker.call(PDFController_13.pdfTableEmployees())
      }
  
    // @LINE:166
    case controllers_DOCController_docTableEmployees119_route(params) =>
      call { 
        controllers_DOCController_docTableEmployees119_invoker.call(DOCController_28.docTableEmployees())
      }
  
    // @LINE:169
    case controllers_Application_logout120_route(params) =>
      call { 
        controllers_Application_logout120_invoker.call(Application_30.logout())
      }
  
    // @LINE:172
    case controllers_PrintController_printUserDetails121_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails121_invoker.call(PrintController_19.printUserDetails(id))
      }
  
    // @LINE:173
    case controllers_PrintController_detailsList122_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList122_invoker.call(PrintController_19.detailsList(id))
      }
  
    // @LINE:175
    case controllers_SalaryController_saveLector123_route(params) =>
      call { 
        controllers_SalaryController_saveLector123_invoker.call(SalaryController_17.saveLector())
      }
  
    // @LINE:176
    case controllers_SalaryController_printLector124_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector124_invoker.call(SalaryController_17.printLector(id))
      }
  
    // @LINE:177
    case controllers_SalaryController_detailsListLector125_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector125_invoker.call(SalaryController_17.detailsListLector(id))
      }
  
    // @LINE:181
    case controllers_Assets_at126_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at126_invoker.call(Assets_26.at(path, file))
      }
  }
}
