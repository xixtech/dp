
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sun May 14 22:44:42 CEST 2017

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
  Application_31: controllers.Application,
  // @LINE:10
  TestController_22: controllers.TestController,
  // @LINE:13
  SalaryController_17: controllers.SalaryController,
  // @LINE:14
  Login_24: controllers.Login,
  // @LINE:16
  Charts_32: controllers.Charts,
  // @LINE:19
  UiElements_21: controllers.UiElements,
  // @LINE:25
  Pages_5: controllers.Pages,
  // @LINE:28
  PersonController_2: controllers.PersonController,
  // @LINE:31
  VisitsController_1: controllers.VisitsController,
  // @LINE:34
  ProjectController_16: controllers.ProjectController,
  // @LINE:37
  FinalWorksController_6: controllers.FinalWorksController,
  // @LINE:40
  PublicationsController_8: controllers.PublicationsController,
  // @LINE:43
  OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
  // @LINE:50
  EmployeesController_23: controllers.EmployeesController,
  // @LINE:57
  StatementController_28: controllers.StatementController,
  // @LINE:69
  SubjectController_34: controllers.SubjectController,
  // @LINE:72
  ClassroomController_35: controllers.ClassroomController,
  // @LINE:78
  TeachersRoleController_25: controllers.TeachersRoleController,
  // @LINE:85
  FieldOfStudyController_11: controllers.FieldOfStudyController,
  // @LINE:88
  CommitteeController_30: controllers.CommitteeController,
  // @LINE:91
  PersonalStatisticController_15: controllers.PersonalStatisticController,
  // @LINE:97
  StatisticController_4: controllers.StatisticController,
  // @LINE:106
  StudyGroupsController_7: controllers.StudyGroupsController,
  // @LINE:108
  TableController_18: controllers.TableController,
  // @LINE:111
  SemestersController_26: controllers.SemestersController,
  // @LINE:116
  StudyPlansController_14: controllers.StudyPlansController,
  // @LINE:120
  CourseController_3: controllers.CourseController,
  // @LINE:146
  TeachersController_9: controllers.TeachersController,
  // @LINE:149
  AccessRoleController_33: controllers.AccessRoleController,
  // @LINE:156
  MethodicsController_0: controllers.MethodicsController,
  // @LINE:164
  SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
  // @LINE:167
  PDFController_13: controllers.PDFController,
  // @LINE:186
  DOCController_29: controllers.DOCController,
  // @LINE:205
  IdeasController_20: controllers.IdeasController,
  // @LINE:211
  PrintController_19: controllers.PrintController,
  // @LINE:219
  Assets_27: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_31: controllers.Application,
    // @LINE:10
    TestController_22: controllers.TestController,
    // @LINE:13
    SalaryController_17: controllers.SalaryController,
    // @LINE:14
    Login_24: controllers.Login,
    // @LINE:16
    Charts_32: controllers.Charts,
    // @LINE:19
    UiElements_21: controllers.UiElements,
    // @LINE:25
    Pages_5: controllers.Pages,
    // @LINE:28
    PersonController_2: controllers.PersonController,
    // @LINE:31
    VisitsController_1: controllers.VisitsController,
    // @LINE:34
    ProjectController_16: controllers.ProjectController,
    // @LINE:37
    FinalWorksController_6: controllers.FinalWorksController,
    // @LINE:40
    PublicationsController_8: controllers.PublicationsController,
    // @LINE:43
    OrganizationalUnitsController_12: controllers.OrganizationalUnitsController,
    // @LINE:50
    EmployeesController_23: controllers.EmployeesController,
    // @LINE:57
    StatementController_28: controllers.StatementController,
    // @LINE:69
    SubjectController_34: controllers.SubjectController,
    // @LINE:72
    ClassroomController_35: controllers.ClassroomController,
    // @LINE:78
    TeachersRoleController_25: controllers.TeachersRoleController,
    // @LINE:85
    FieldOfStudyController_11: controllers.FieldOfStudyController,
    // @LINE:88
    CommitteeController_30: controllers.CommitteeController,
    // @LINE:91
    PersonalStatisticController_15: controllers.PersonalStatisticController,
    // @LINE:97
    StatisticController_4: controllers.StatisticController,
    // @LINE:106
    StudyGroupsController_7: controllers.StudyGroupsController,
    // @LINE:108
    TableController_18: controllers.TableController,
    // @LINE:111
    SemestersController_26: controllers.SemestersController,
    // @LINE:116
    StudyPlansController_14: controllers.StudyPlansController,
    // @LINE:120
    CourseController_3: controllers.CourseController,
    // @LINE:146
    TeachersController_9: controllers.TeachersController,
    // @LINE:149
    AccessRoleController_33: controllers.AccessRoleController,
    // @LINE:156
    MethodicsController_0: controllers.MethodicsController,
    // @LINE:164
    SubjectPlanTeachingController_10: controllers.SubjectPlanTeachingController,
    // @LINE:167
    PDFController_13: controllers.PDFController,
    // @LINE:186
    DOCController_29: controllers.DOCController,
    // @LINE:205
    IdeasController_20: controllers.IdeasController,
    // @LINE:211
    PrintController_19: controllers.PrintController,
    // @LINE:219
    Assets_27: controllers.Assets
  ) = this(errorHandler, Application_31, TestController_22, SalaryController_17, Login_24, Charts_32, UiElements_21, Pages_5, PersonController_2, VisitsController_1, ProjectController_16, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_23, StatementController_28, SubjectController_34, ClassroomController_35, TeachersRoleController_25, FieldOfStudyController_11, CommitteeController_30, PersonalStatisticController_15, StatisticController_4, StudyGroupsController_7, TableController_18, SemestersController_26, StudyPlansController_14, CourseController_3, TeachersController_9, AccessRoleController_33, MethodicsController_0, SubjectPlanTeachingController_10, PDFController_13, DOCController_29, IdeasController_20, PrintController_19, Assets_27, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_31, TestController_22, SalaryController_17, Login_24, Charts_32, UiElements_21, Pages_5, PersonController_2, VisitsController_1, ProjectController_16, FinalWorksController_6, PublicationsController_8, OrganizationalUnitsController_12, EmployeesController_23, StatementController_28, SubjectController_34, ClassroomController_35, TeachersRoleController_25, FieldOfStudyController_11, CommitteeController_30, PersonalStatisticController_15, StatisticController_4, StudyGroupsController_7, TableController_18, SemestersController_26, StudyPlansController_14, CourseController_3, TeachersController_9, AccessRoleController_33, MethodicsController_0, SubjectPlanTeachingController_10, PDFController_13, DOCController_29, IdeasController_20, PrintController_19, Assets_27, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dcpsc""", """controllers.StatisticController.dcpsCombi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dcpsp""", """controllers.StatisticController.dcpsPres()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sp""", """controllers.StatisticController.studyPlansTable()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sp1""", """controllers.StatisticController.sp1()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableAccessRole""", """controllers.PDFController.pdfTableAccessRole()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableDCPS""", """controllers.PDFController.pdfTableDCPS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableDCPSPres""", """controllers.PDFController.pdfTableDCPSPres()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableDCPSCombi""", """controllers.PDFController.pdfTableDCPSCombi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableClassroom""", """controllers.PDFController.pdfTableClassroom()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableCommittee""", """controllers.PDFController.pdfTableCommittee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableEmployees""", """controllers.PDFController.pdfTableEmployees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableFieldsOfStudy""", """controllers.PDFController.pdfTableFieldsOfStudy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTablePublication""", """controllers.PDFController.pdfTablePublication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableSPPrint""", """controllers.PDFController.pdfTableSPPrint()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableStudyGroups""", """controllers.PDFController.pdfTableStudyGroups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableStudyPlans""", """controllers.PDFController.pdfTableStudyPlans()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableSubjects""", """controllers.PDFController.pdfTableSubjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableTeachingAAA""", """controllers.PDFController.pdfTableTeachingAAA()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableTeachingAAB""", """controllers.PDFController.pdfTableTeachingAAB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableTeachingAccordingToPersons""", """controllers.PDFController.pdfTableTeachingAccordingToPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableTeachingCB""", """controllers.PDFController.pdfTableTeachingCB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pdfTableTeachingDepartmentEmployee""", """controllers.PDFController.pdfTableTeachingDepartmentEmployee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableAccessRole""", """controllers.DOCController.docTableAccessRole()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableDCPS""", """controllers.DOCController.docTableDCPS()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableDCPSPres""", """controllers.DOCController.docTableDCPSPres()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableDCPSCombi""", """controllers.DOCController.docTableDCPSCombi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableClassroom""", """controllers.DOCController.docTableClassroom()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableCommittee""", """controllers.DOCController.docTableCommittee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableEmployees""", """controllers.DOCController.docTableEmployees()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableFieldsOfStudy""", """controllers.DOCController.docTableFieldsOfStudy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTablePublication""", """controllers.DOCController.docTablePublication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableSPPrint""", """controllers.DOCController.docTableSPPrint()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableStudyGroups""", """controllers.DOCController.docTableStudyGroups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableStudyPlans""", """controllers.DOCController.docTableStudyPlans()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableSubjects""", """controllers.DOCController.docTableSubjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableTeachingAAA""", """controllers.DOCController.docTableTeachingAAA()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableTeachingAAB""", """controllers.DOCController.docTableTeachingAAB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableTeachingAccordingToPersons""", """controllers.DOCController.docTableTeachingAccordingToPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableTeachingCB""", """controllers.DOCController.docTableTeachingCB()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docTableTeachingDepartmentEmployee""", """controllers.DOCController.docTableTeachingDepartmentEmployee()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regidea""", """controllers.IdeasController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """regidea/saved""", """controllers.IdeasController.save()"""),
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
    Application_31.dashboard(),
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
    Application_31.pdf(),
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
    Application_31.raw(),
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
    Application_31.index(),
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
    TestController_22.test(),
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
    TestController_22.save(),
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
    Application_31.kpiChoosePerson(),
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
    Login_24.index(),
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
    Login_24.authenticate(),
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
    Charts_32.flot(),
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
    Charts_32.morris(),
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
  private[this] lazy val controllers_Application_forms12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forms")))
  )
  private[this] lazy val controllers_Application_forms12_invoker = createInvoker(
    Application_31.forms(),
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

  // @LINE:19
  private[this] lazy val controllers_UiElements_panelsAndWells13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/panels-and-wells")))
  )
  private[this] lazy val controllers_UiElements_panelsAndWells13_invoker = createInvoker(
    UiElements_21.panelsAndWells(),
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

  // @LINE:20
  private[this] lazy val controllers_UiElements_buttons14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/buttons")))
  )
  private[this] lazy val controllers_UiElements_buttons14_invoker = createInvoker(
    UiElements_21.buttons(),
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

  // @LINE:21
  private[this] lazy val controllers_UiElements_notifications15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/notifications")))
  )
  private[this] lazy val controllers_UiElements_notifications15_invoker = createInvoker(
    UiElements_21.notifications(),
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

  // @LINE:22
  private[this] lazy val controllers_UiElements_typography16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/typography")))
  )
  private[this] lazy val controllers_UiElements_typography16_invoker = createInvoker(
    UiElements_21.typography(),
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

  // @LINE:23
  private[this] lazy val controllers_UiElements_icons17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/icons")))
  )
  private[this] lazy val controllers_UiElements_icons17_invoker = createInvoker(
    UiElements_21.icons(),
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

  // @LINE:24
  private[this] lazy val controllers_UiElements_grid18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui-elements/grid")))
  )
  private[this] lazy val controllers_UiElements_grid18_invoker = createInvoker(
    UiElements_21.grid(),
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

  // @LINE:25
  private[this] lazy val controllers_Pages_blank19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pages/blank")))
  )
  private[this] lazy val controllers_Pages_blank19_invoker = createInvoker(
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

  // @LINE:28
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

  // @LINE:29
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

  // @LINE:31
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

  // @LINE:32
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

  // @LINE:34
  private[this] lazy val controllers_ProjectController_index24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/register")))
  )
  private[this] lazy val controllers_ProjectController_index24_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_ProjectController_save25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/saved")))
  )
  private[this] lazy val controllers_ProjectController_save25_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_FinalWorksController_index26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/register")))
  )
  private[this] lazy val controllers_FinalWorksController_index26_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_FinalWorksController_save27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finalwork/saved")))
  )
  private[this] lazy val controllers_FinalWorksController_save27_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_PublicationsController_index28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/register")))
  )
  private[this] lazy val controllers_PublicationsController_index28_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_PublicationsController_save29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publication/saved")))
  )
  private[this] lazy val controllers_PublicationsController_save29_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_OrganizationalUnitsController_index30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_index30_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_OrganizationalUnitsController_save31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ou/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_save31_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/register")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_indexParticipants32_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("oup/saved")))
  )
  private[this] lazy val controllers_OrganizationalUnitsController_saveParticipants33_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_EmployeesController_index34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/register")))
  )
  private[this] lazy val controllers_EmployeesController_index34_invoker = createInvoker(
    EmployeesController_23.index(),
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

  // @LINE:51
  private[this] lazy val controllers_EmployeesController_save35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/saved")))
  )
  private[this] lazy val controllers_EmployeesController_save35_invoker = createInvoker(
    EmployeesController_23.save(),
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

  // @LINE:52
  private[this] lazy val controllers_EmployeesController_info36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/info/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_info36_invoker = createInvoker(
    EmployeesController_23.info(fakeValue[String]),
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

  // @LINE:53
  private[this] lazy val controllers_EmployeesController_edit37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/edit/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeesController_edit37_invoker = createInvoker(
    EmployeesController_23.edit(fakeValue[String]),
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

  // @LINE:54
  private[this] lazy val controllers_EmployeesController_update38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/updated/")))
  )
  private[this] lazy val controllers_EmployeesController_update38_invoker = createInvoker(
    EmployeesController_23.update(fakeValue[String]),
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

  // @LINE:55
  private[this] lazy val controllers_EmployeesController_delete39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/delete")))
  )
  private[this] lazy val controllers_EmployeesController_delete39_invoker = createInvoker(
    EmployeesController_23.delete(fakeValue[String]),
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

  // @LINE:57
  private[this] lazy val controllers_StatementController_index40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement")))
  )
  private[this] lazy val controllers_StatementController_index40_invoker = createInvoker(
    StatementController_28.index(),
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

  // @LINE:58
  private[this] lazy val controllers_StatementController_employeeStatement41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/employee/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_employeeStatement41_invoker = createInvoker(
    StatementController_28.employeeStatement(fakeValue[String]),
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

  // @LINE:59
  private[this] lazy val controllers_StatementController_sendStatementToEmployee42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/check/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendStatementToEmployee42_invoker = createInvoker(
    StatementController_28.sendStatementToEmployee(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:60
  private[this] lazy val controllers_StatementController_infoStatementToEmployee43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/info/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_infoStatementToEmployee43_invoker = createInvoker(
    StatementController_28.infoStatementToEmployee(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:61
  private[this] lazy val controllers_StatementController_sendToVerify44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/ver/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToVerify44_invoker = createInvoker(
    StatementController_28.sendToVerify(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:62
  private[this] lazy val controllers_StatementController_sendToAgree45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/agree/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToAgree45_invoker = createInvoker(
    StatementController_28.sendToAgree(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:63
  private[this] lazy val controllers_StatementController_sendToRepair46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/repair/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendToRepair46_invoker = createInvoker(
    StatementController_28.sendToRepair(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:64
  private[this] lazy val controllers_StatementController_sendRepairedStatement47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/repaired/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_sendRepairedStatement47_invoker = createInvoker(
    StatementController_28.sendRepairedStatement(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:65
  private[this] lazy val controllers_StatementController_checkRepairStatementToEmployee48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/checkrepaired/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_checkRepairStatementToEmployee48_invoker = createInvoker(
    StatementController_28.checkRepairStatementToEmployee(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:66
  private[this] lazy val controllers_StatementController_employeeCheckStatement49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statement/employeecheck/"), DynamicPart("idE", """[^/]+""",true), DynamicPart("idS", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatementController_employeeCheckStatement49_invoker = createInvoker(
    StatementController_28.employeeCheckStatement(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:69
  private[this] lazy val controllers_SubjectController_index50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/add")))
  )
  private[this] lazy val controllers_SubjectController_index50_invoker = createInvoker(
    SubjectController_34.index(),
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

  // @LINE:70
  private[this] lazy val controllers_SubjectController_save51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subject/saved")))
  )
  private[this] lazy val controllers_SubjectController_save51_invoker = createInvoker(
    SubjectController_34.save(),
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

  // @LINE:72
  private[this] lazy val controllers_ClassroomController_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/add")))
  )
  private[this] lazy val controllers_ClassroomController_index52_invoker = createInvoker(
    ClassroomController_35.index(),
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

  // @LINE:73
  private[this] lazy val controllers_ClassroomController_save53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/saved")))
  )
  private[this] lazy val controllers_ClassroomController_save53_invoker = createInvoker(
    ClassroomController_35.save(),
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

  // @LINE:74
  private[this] lazy val controllers_ClassroomController_edit54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClassroomController_edit54_invoker = createInvoker(
    ClassroomController_35.edit(fakeValue[Long]),
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

  // @LINE:75
  private[this] lazy val controllers_ClassroomController_update55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/updated/")))
  )
  private[this] lazy val controllers_ClassroomController_update55_invoker = createInvoker(
    ClassroomController_35.update(fakeValue[Long]),
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

  // @LINE:76
  private[this] lazy val controllers_ClassroomController_delete56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classroom/delete")))
  )
  private[this] lazy val controllers_ClassroomController_delete56_invoker = createInvoker(
    ClassroomController_35.delete(fakeValue[Long]),
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

  // @LINE:78
  private[this] lazy val controllers_TeachersRoleController_index57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/add")))
  )
  private[this] lazy val controllers_TeachersRoleController_index57_invoker = createInvoker(
    TeachersRoleController_25.index(),
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

  // @LINE:79
  private[this] lazy val controllers_TeachersRoleController_save58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/saved")))
  )
  private[this] lazy val controllers_TeachersRoleController_save58_invoker = createInvoker(
    TeachersRoleController_25.save(),
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

  // @LINE:80
  private[this] lazy val controllers_TeachersRoleController_edit59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TeachersRoleController_edit59_invoker = createInvoker(
    TeachersRoleController_25.edit(fakeValue[Long]),
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

  // @LINE:81
  private[this] lazy val controllers_TeachersRoleController_update60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/updated/")))
  )
  private[this] lazy val controllers_TeachersRoleController_update60_invoker = createInvoker(
    TeachersRoleController_25.update(fakeValue[Long]),
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

  // @LINE:82
  private[this] lazy val controllers_TeachersRoleController_delete61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachersrole/delete")))
  )
  private[this] lazy val controllers_TeachersRoleController_delete61_invoker = createInvoker(
    TeachersRoleController_25.delete(fakeValue[Long]),
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

  // @LINE:85
  private[this] lazy val controllers_FieldOfStudyController_index62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/add")))
  )
  private[this] lazy val controllers_FieldOfStudyController_index62_invoker = createInvoker(
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

  // @LINE:86
  private[this] lazy val controllers_FieldOfStudyController_save63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields/saved")))
  )
  private[this] lazy val controllers_FieldOfStudyController_save63_invoker = createInvoker(
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

  // @LINE:88
  private[this] lazy val controllers_CommitteeController_index64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/add")))
  )
  private[this] lazy val controllers_CommitteeController_index64_invoker = createInvoker(
    CommitteeController_30.index(),
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

  // @LINE:89
  private[this] lazy val controllers_CommitteeController_save65_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committee/saved")))
  )
  private[this] lazy val controllers_CommitteeController_save65_invoker = createInvoker(
    CommitteeController_30.save(),
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

  // @LINE:91
  private[this] lazy val controllers_PersonalStatisticController_index66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_PersonalStatisticController_index66_invoker = createInvoker(
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

  // @LINE:92
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aaa")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAA67_invoker = createInvoker(
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

  // @LINE:93
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB68_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/aab")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingAAB68_invoker = createInvoker(
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

  // @LINE:94
  private[this] lazy val controllers_PersonalStatisticController_teachingCB69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/cb")))
  )
  private[this] lazy val controllers_PersonalStatisticController_teachingCB69_invoker = createInvoker(
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

  // @LINE:97
  private[this] lazy val controllers_StatisticController_index70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcps")))
  )
  private[this] lazy val controllers_StatisticController_index70_invoker = createInvoker(
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

  // @LINE:98
  private[this] lazy val controllers_StatisticController_dcpsCombi71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcpsc")))
  )
  private[this] lazy val controllers_StatisticController_dcpsCombi71_invoker = createInvoker(
    StatisticController_4.dcpsCombi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "dcpsCombi",
      Nil,
      "GET",
      """""",
      this.prefix + """dcpsc"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_StatisticController_dcpsPres72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dcpsp")))
  )
  private[this] lazy val controllers_StatisticController_dcpsPres72_invoker = createInvoker(
    StatisticController_4.dcpsPres(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "dcpsPres",
      Nil,
      "GET",
      """""",
      this.prefix + """dcpsp"""
    )
  )

  // @LINE:100
  private[this] lazy val controllers_StatisticController_studyPlansTable73_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sp")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTable73_invoker = createInvoker(
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

  // @LINE:101
  private[this] lazy val controllers_StatisticController_sp174_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sp1")))
  )
  private[this] lazy val controllers_StatisticController_sp174_invoker = createInvoker(
    StatisticController_4.sp1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StatisticController",
      "sp1",
      Nil,
      "GET",
      """""",
      this.prefix + """sp1"""
    )
  )

  // @LINE:103
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spprint")))
  )
  private[this] lazy val controllers_StatisticController_studyPlansTablePrint75_invoker = createInvoker(
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

  // @LINE:106
  private[this] lazy val controllers_StudyGroupsController_index76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/add")))
  )
  private[this] lazy val controllers_StudyGroupsController_index76_invoker = createInvoker(
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

  // @LINE:107
  private[this] lazy val controllers_StudyGroupsController_save77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups/saved")))
  )
  private[this] lazy val controllers_StudyGroupsController_save77_invoker = createInvoker(
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

  // @LINE:108
  private[this] lazy val controllers_TableController_listStudyGroups78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studygroups")))
  )
  private[this] lazy val controllers_TableController_listStudyGroups78_invoker = createInvoker(
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

  // @LINE:111
  private[this] lazy val controllers_SemestersController_index79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/add")))
  )
  private[this] lazy val controllers_SemestersController_index79_invoker = createInvoker(
    SemestersController_26.index(),
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

  // @LINE:112
  private[this] lazy val controllers_SemestersController_save80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester/saved")))
  )
  private[this] lazy val controllers_SemestersController_save80_invoker = createInvoker(
    SemestersController_26.save(),
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

  // @LINE:113
  private[this] lazy val controllers_TableController_listSemesters81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("semester")))
  )
  private[this] lazy val controllers_TableController_listSemesters81_invoker = createInvoker(
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

  // @LINE:116
  private[this] lazy val controllers_StudyPlansController_index82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/add")))
  )
  private[this] lazy val controllers_StudyPlansController_index82_invoker = createInvoker(
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

  // @LINE:117
  private[this] lazy val controllers_StudyPlansController_save83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplan/saved")))
  )
  private[this] lazy val controllers_StudyPlansController_save83_invoker = createInvoker(
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

  // @LINE:118
  private[this] lazy val controllers_TableController_listStudyPlans84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("studyplans")))
  )
  private[this] lazy val controllers_TableController_listStudyPlans84_invoker = createInvoker(
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

  // @LINE:120
  private[this] lazy val controllers_CourseController_index85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/add")))
  )
  private[this] lazy val controllers_CourseController_index85_invoker = createInvoker(
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

  // @LINE:121
  private[this] lazy val controllers_CourseController_save86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/saved")))
  )
  private[this] lazy val controllers_CourseController_save86_invoker = createInvoker(
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

  // @LINE:123
  private[this] lazy val controllers_TableController_listScheduleInWeeks87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scheduleinweeks")))
  )
  private[this] lazy val controllers_TableController_listScheduleInWeeks87_invoker = createInvoker(
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

  // @LINE:125
  private[this] lazy val controllers_TableController_listSchedule88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("schedule")))
  )
  private[this] lazy val controllers_TableController_listSchedule88_invoker = createInvoker(
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

  // @LINE:126
  private[this] lazy val controllers_TableController_listEmployees89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_TableController_listEmployees89_invoker = createInvoker(
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

  // @LINE:127
  private[this] lazy val controllers_TableController_listTeachers90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers")))
  )
  private[this] lazy val controllers_TableController_listTeachers90_invoker = createInvoker(
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

  // @LINE:128
  private[this] lazy val controllers_TableController_listSubjects91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subjects")))
  )
  private[this] lazy val controllers_TableController_listSubjects91_invoker = createInvoker(
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

  // @LINE:129
  private[this] lazy val controllers_TableController_listFieldsOfStudy92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fields")))
  )
  private[this] lazy val controllers_TableController_listFieldsOfStudy92_invoker = createInvoker(
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

  // @LINE:130
  private[this] lazy val controllers_TableController_listCourses93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_TableController_listCourses93_invoker = createInvoker(
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

  // @LINE:131
  private[this] lazy val controllers_TableController_listCurrentSemesters94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("currentsemesters")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemesters94_invoker = createInvoker(
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

  // @LINE:132
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lcsuteos")))
  )
  private[this] lazy val controllers_TableController_listCurrentSemestersUntilTheEndOfStudy95_invoker = createInvoker(
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

  // @LINE:133
  private[this] lazy val controllers_TableController_listDays96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("days")))
  )
  private[this] lazy val controllers_TableController_listDays96_invoker = createInvoker(
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

  // @LINE:134
  private[this] lazy val controllers_TableController_listClassrooms97_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("classrooms")))
  )
  private[this] lazy val controllers_TableController_listClassrooms97_invoker = createInvoker(
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

  // @LINE:135
  private[this] lazy val controllers_TableController_listTeachersRole98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachroles")))
  )
  private[this] lazy val controllers_TableController_listTeachersRole98_invoker = createInvoker(
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

  // @LINE:136
  private[this] lazy val controllers_TableController_listAccessRole99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessroles")))
  )
  private[this] lazy val controllers_TableController_listAccessRole99_invoker = createInvoker(
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

  // @LINE:137
  private[this] lazy val controllers_TableController_listCommittees100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("committees")))
  )
  private[this] lazy val controllers_TableController_listCommittees100_invoker = createInvoker(
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

  // @LINE:138
  private[this] lazy val controllers_TableController_listPublications101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("publications")))
  )
  private[this] lazy val controllers_TableController_listPublications101_invoker = createInvoker(
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

  // @LINE:139
  private[this] lazy val controllers_TableController_listTeachersInWeeks102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tiw")))
  )
  private[this] lazy val controllers_TableController_listTeachersInWeeks102_invoker = createInvoker(
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

  // @LINE:141
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat")))
  )
  private[this] lazy val controllers_StatisticController_listEmployeesActvitiy103_invoker = createInvoker(
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

  // @LINE:142
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy104_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estat/info/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_StatisticController_listEmployeerActvitiy104_invoker = createInvoker(
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

  // @LINE:143
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching")))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToPersons105_invoker = createInvoker(
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

  // @LINE:144
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teaching/t/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonalStatisticController_listTableTeachingAccordingToId106_invoker = createInvoker(
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

  // @LINE:146
  private[this] lazy val controllers_TeachersController_index107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/add")))
  )
  private[this] lazy val controllers_TeachersController_index107_invoker = createInvoker(
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

  // @LINE:147
  private[this] lazy val controllers_TeachersController_save108_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("teachers/saved")))
  )
  private[this] lazy val controllers_TeachersController_save108_invoker = createInvoker(
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

  // @LINE:149
  private[this] lazy val controllers_AccessRoleController_index109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/add")))
  )
  private[this] lazy val controllers_AccessRoleController_index109_invoker = createInvoker(
    AccessRoleController_33.index(),
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

  // @LINE:150
  private[this] lazy val controllers_AccessRoleController_save110_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/saved")))
  )
  private[this] lazy val controllers_AccessRoleController_save110_invoker = createInvoker(
    AccessRoleController_33.save(),
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

  // @LINE:151
  private[this] lazy val controllers_AccessRoleController_edit111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AccessRoleController_edit111_invoker = createInvoker(
    AccessRoleController_33.edit(fakeValue[Long]),
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

  // @LINE:152
  private[this] lazy val controllers_AccessRoleController_update112_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/updated/")))
  )
  private[this] lazy val controllers_AccessRoleController_update112_invoker = createInvoker(
    AccessRoleController_33.update(fakeValue[Long]),
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

  // @LINE:153
  private[this] lazy val controllers_AccessRoleController_delete113_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessrole/delete")))
  )
  private[this] lazy val controllers_AccessRoleController_delete113_invoker = createInvoker(
    AccessRoleController_33.delete(fakeValue[Long]),
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

  // @LINE:156
  private[this] lazy val controllers_MethodicsController_index114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/add")))
  )
  private[this] lazy val controllers_MethodicsController_index114_invoker = createInvoker(
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

  // @LINE:157
  private[this] lazy val controllers_MethodicsController_save115_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("m/saved")))
  )
  private[this] lazy val controllers_MethodicsController_save115_invoker = createInvoker(
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

  // @LINE:159
  private[this] lazy val controllers_Application_roles116_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("roles")))
  )
  private[this] lazy val controllers_Application_roles116_invoker = createInvoker(
    Application_31.roles(),
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

  // @LINE:162
  private[this] lazy val controllers_TableController_listPerson117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_TableController_listPerson117_invoker = createInvoker(
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

  // @LINE:164
  private[this] lazy val controllers_SubjectPlanTeachingController_index118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/add")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_index118_invoker = createInvoker(
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

  // @LINE:165
  private[this] lazy val controllers_SubjectPlanTeachingController_save119_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sub/saved")))
  )
  private[this] lazy val controllers_SubjectPlanTeachingController_save119_invoker = createInvoker(
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

  // @LINE:167
  private[this] lazy val controllers_PDFController_pdfTableAccessRole120_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableAccessRole")))
  )
  private[this] lazy val controllers_PDFController_pdfTableAccessRole120_invoker = createInvoker(
    PDFController_13.pdfTableAccessRole(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableAccessRole",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableAccessRole"""
    )
  )

  // @LINE:168
  private[this] lazy val controllers_PDFController_pdfTableDCPS121_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableDCPS")))
  )
  private[this] lazy val controllers_PDFController_pdfTableDCPS121_invoker = createInvoker(
    PDFController_13.pdfTableDCPS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableDCPS",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableDCPS"""
    )
  )

  // @LINE:169
  private[this] lazy val controllers_PDFController_pdfTableDCPSPres122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableDCPSPres")))
  )
  private[this] lazy val controllers_PDFController_pdfTableDCPSPres122_invoker = createInvoker(
    PDFController_13.pdfTableDCPSPres(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableDCPSPres",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableDCPSPres"""
    )
  )

  // @LINE:170
  private[this] lazy val controllers_PDFController_pdfTableDCPSCombi123_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableDCPSCombi")))
  )
  private[this] lazy val controllers_PDFController_pdfTableDCPSCombi123_invoker = createInvoker(
    PDFController_13.pdfTableDCPSCombi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableDCPSCombi",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableDCPSCombi"""
    )
  )

  // @LINE:171
  private[this] lazy val controllers_PDFController_pdfTableClassroom124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableClassroom")))
  )
  private[this] lazy val controllers_PDFController_pdfTableClassroom124_invoker = createInvoker(
    PDFController_13.pdfTableClassroom(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableClassroom",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableClassroom"""
    )
  )

  // @LINE:172
  private[this] lazy val controllers_PDFController_pdfTableCommittee125_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableCommittee")))
  )
  private[this] lazy val controllers_PDFController_pdfTableCommittee125_invoker = createInvoker(
    PDFController_13.pdfTableCommittee(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableCommittee",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableCommittee"""
    )
  )

  // @LINE:173
  private[this] lazy val controllers_PDFController_pdfTableEmployees126_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableEmployees")))
  )
  private[this] lazy val controllers_PDFController_pdfTableEmployees126_invoker = createInvoker(
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

  // @LINE:174
  private[this] lazy val controllers_PDFController_pdfTableFieldsOfStudy127_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableFieldsOfStudy")))
  )
  private[this] lazy val controllers_PDFController_pdfTableFieldsOfStudy127_invoker = createInvoker(
    PDFController_13.pdfTableFieldsOfStudy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableFieldsOfStudy",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableFieldsOfStudy"""
    )
  )

  // @LINE:175
  private[this] lazy val controllers_PDFController_pdfTablePublication128_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTablePublication")))
  )
  private[this] lazy val controllers_PDFController_pdfTablePublication128_invoker = createInvoker(
    PDFController_13.pdfTablePublication(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTablePublication",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTablePublication"""
    )
  )

  // @LINE:176
  private[this] lazy val controllers_PDFController_pdfTableSPPrint129_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableSPPrint")))
  )
  private[this] lazy val controllers_PDFController_pdfTableSPPrint129_invoker = createInvoker(
    PDFController_13.pdfTableSPPrint(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableSPPrint",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableSPPrint"""
    )
  )

  // @LINE:177
  private[this] lazy val controllers_PDFController_pdfTableStudyGroups130_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableStudyGroups")))
  )
  private[this] lazy val controllers_PDFController_pdfTableStudyGroups130_invoker = createInvoker(
    PDFController_13.pdfTableStudyGroups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableStudyGroups",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableStudyGroups"""
    )
  )

  // @LINE:178
  private[this] lazy val controllers_PDFController_pdfTableStudyPlans131_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableStudyPlans")))
  )
  private[this] lazy val controllers_PDFController_pdfTableStudyPlans131_invoker = createInvoker(
    PDFController_13.pdfTableStudyPlans(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableStudyPlans",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableStudyPlans"""
    )
  )

  // @LINE:179
  private[this] lazy val controllers_PDFController_pdfTableSubjects132_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableSubjects")))
  )
  private[this] lazy val controllers_PDFController_pdfTableSubjects132_invoker = createInvoker(
    PDFController_13.pdfTableSubjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableSubjects",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableSubjects"""
    )
  )

  // @LINE:180
  private[this] lazy val controllers_PDFController_pdfTableTeachingAAA133_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableTeachingAAA")))
  )
  private[this] lazy val controllers_PDFController_pdfTableTeachingAAA133_invoker = createInvoker(
    PDFController_13.pdfTableTeachingAAA(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableTeachingAAA",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableTeachingAAA"""
    )
  )

  // @LINE:181
  private[this] lazy val controllers_PDFController_pdfTableTeachingAAB134_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableTeachingAAB")))
  )
  private[this] lazy val controllers_PDFController_pdfTableTeachingAAB134_invoker = createInvoker(
    PDFController_13.pdfTableTeachingAAB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableTeachingAAB",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableTeachingAAB"""
    )
  )

  // @LINE:182
  private[this] lazy val controllers_PDFController_pdfTableTeachingAccordingToPersons135_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableTeachingAccordingToPersons")))
  )
  private[this] lazy val controllers_PDFController_pdfTableTeachingAccordingToPersons135_invoker = createInvoker(
    PDFController_13.pdfTableTeachingAccordingToPersons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableTeachingAccordingToPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableTeachingAccordingToPersons"""
    )
  )

  // @LINE:183
  private[this] lazy val controllers_PDFController_pdfTableTeachingCB136_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableTeachingCB")))
  )
  private[this] lazy val controllers_PDFController_pdfTableTeachingCB136_invoker = createInvoker(
    PDFController_13.pdfTableTeachingCB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableTeachingCB",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableTeachingCB"""
    )
  )

  // @LINE:184
  private[this] lazy val controllers_PDFController_pdfTableTeachingDepartmentEmployee137_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pdfTableTeachingDepartmentEmployee")))
  )
  private[this] lazy val controllers_PDFController_pdfTableTeachingDepartmentEmployee137_invoker = createInvoker(
    PDFController_13.pdfTableTeachingDepartmentEmployee(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PDFController",
      "pdfTableTeachingDepartmentEmployee",
      Nil,
      "GET",
      """""",
      this.prefix + """pdfTableTeachingDepartmentEmployee"""
    )
  )

  // @LINE:186
  private[this] lazy val controllers_DOCController_docTableAccessRole138_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableAccessRole")))
  )
  private[this] lazy val controllers_DOCController_docTableAccessRole138_invoker = createInvoker(
    DOCController_29.docTableAccessRole(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableAccessRole",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableAccessRole"""
    )
  )

  // @LINE:187
  private[this] lazy val controllers_DOCController_docTableDCPS139_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableDCPS")))
  )
  private[this] lazy val controllers_DOCController_docTableDCPS139_invoker = createInvoker(
    DOCController_29.docTableDCPS(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableDCPS",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableDCPS"""
    )
  )

  // @LINE:188
  private[this] lazy val controllers_DOCController_docTableDCPSPres140_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableDCPSPres")))
  )
  private[this] lazy val controllers_DOCController_docTableDCPSPres140_invoker = createInvoker(
    DOCController_29.docTableDCPSPres(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableDCPSPres",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableDCPSPres"""
    )
  )

  // @LINE:189
  private[this] lazy val controllers_DOCController_docTableDCPSCombi141_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableDCPSCombi")))
  )
  private[this] lazy val controllers_DOCController_docTableDCPSCombi141_invoker = createInvoker(
    DOCController_29.docTableDCPSCombi(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableDCPSCombi",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableDCPSCombi"""
    )
  )

  // @LINE:190
  private[this] lazy val controllers_DOCController_docTableClassroom142_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableClassroom")))
  )
  private[this] lazy val controllers_DOCController_docTableClassroom142_invoker = createInvoker(
    DOCController_29.docTableClassroom(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableClassroom",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableClassroom"""
    )
  )

  // @LINE:191
  private[this] lazy val controllers_DOCController_docTableCommittee143_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableCommittee")))
  )
  private[this] lazy val controllers_DOCController_docTableCommittee143_invoker = createInvoker(
    DOCController_29.docTableCommittee(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableCommittee",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableCommittee"""
    )
  )

  // @LINE:192
  private[this] lazy val controllers_DOCController_docTableEmployees144_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableEmployees")))
  )
  private[this] lazy val controllers_DOCController_docTableEmployees144_invoker = createInvoker(
    DOCController_29.docTableEmployees(),
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

  // @LINE:193
  private[this] lazy val controllers_DOCController_docTableFieldsOfStudy145_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableFieldsOfStudy")))
  )
  private[this] lazy val controllers_DOCController_docTableFieldsOfStudy145_invoker = createInvoker(
    DOCController_29.docTableFieldsOfStudy(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableFieldsOfStudy",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableFieldsOfStudy"""
    )
  )

  // @LINE:194
  private[this] lazy val controllers_DOCController_docTablePublication146_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTablePublication")))
  )
  private[this] lazy val controllers_DOCController_docTablePublication146_invoker = createInvoker(
    DOCController_29.docTablePublication(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTablePublication",
      Nil,
      "GET",
      """""",
      this.prefix + """docTablePublication"""
    )
  )

  // @LINE:195
  private[this] lazy val controllers_DOCController_docTableSPPrint147_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableSPPrint")))
  )
  private[this] lazy val controllers_DOCController_docTableSPPrint147_invoker = createInvoker(
    DOCController_29.docTableSPPrint(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableSPPrint",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableSPPrint"""
    )
  )

  // @LINE:196
  private[this] lazy val controllers_DOCController_docTableStudyGroups148_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableStudyGroups")))
  )
  private[this] lazy val controllers_DOCController_docTableStudyGroups148_invoker = createInvoker(
    DOCController_29.docTableStudyGroups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableStudyGroups",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableStudyGroups"""
    )
  )

  // @LINE:197
  private[this] lazy val controllers_DOCController_docTableStudyPlans149_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableStudyPlans")))
  )
  private[this] lazy val controllers_DOCController_docTableStudyPlans149_invoker = createInvoker(
    DOCController_29.docTableStudyPlans(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableStudyPlans",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableStudyPlans"""
    )
  )

  // @LINE:198
  private[this] lazy val controllers_DOCController_docTableSubjects150_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableSubjects")))
  )
  private[this] lazy val controllers_DOCController_docTableSubjects150_invoker = createInvoker(
    DOCController_29.docTableSubjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableSubjects",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableSubjects"""
    )
  )

  // @LINE:199
  private[this] lazy val controllers_DOCController_docTableTeachingAAA151_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableTeachingAAA")))
  )
  private[this] lazy val controllers_DOCController_docTableTeachingAAA151_invoker = createInvoker(
    DOCController_29.docTableTeachingAAA(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableTeachingAAA",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableTeachingAAA"""
    )
  )

  // @LINE:200
  private[this] lazy val controllers_DOCController_docTableTeachingAAB152_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableTeachingAAB")))
  )
  private[this] lazy val controllers_DOCController_docTableTeachingAAB152_invoker = createInvoker(
    DOCController_29.docTableTeachingAAB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableTeachingAAB",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableTeachingAAB"""
    )
  )

  // @LINE:201
  private[this] lazy val controllers_DOCController_docTableTeachingAccordingToPersons153_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableTeachingAccordingToPersons")))
  )
  private[this] lazy val controllers_DOCController_docTableTeachingAccordingToPersons153_invoker = createInvoker(
    DOCController_29.docTableTeachingAccordingToPersons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableTeachingAccordingToPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableTeachingAccordingToPersons"""
    )
  )

  // @LINE:202
  private[this] lazy val controllers_DOCController_docTableTeachingCB154_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableTeachingCB")))
  )
  private[this] lazy val controllers_DOCController_docTableTeachingCB154_invoker = createInvoker(
    DOCController_29.docTableTeachingCB(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableTeachingCB",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableTeachingCB"""
    )
  )

  // @LINE:203
  private[this] lazy val controllers_DOCController_docTableTeachingDepartmentEmployee155_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docTableTeachingDepartmentEmployee")))
  )
  private[this] lazy val controllers_DOCController_docTableTeachingDepartmentEmployee155_invoker = createInvoker(
    DOCController_29.docTableTeachingDepartmentEmployee(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DOCController",
      "docTableTeachingDepartmentEmployee",
      Nil,
      "GET",
      """""",
      this.prefix + """docTableTeachingDepartmentEmployee"""
    )
  )

  // @LINE:205
  private[this] lazy val controllers_IdeasController_index156_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regidea")))
  )
  private[this] lazy val controllers_IdeasController_index156_invoker = createInvoker(
    IdeasController_20.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IdeasController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """regidea"""
    )
  )

  // @LINE:206
  private[this] lazy val controllers_IdeasController_save157_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("regidea/saved")))
  )
  private[this] lazy val controllers_IdeasController_save157_invoker = createInvoker(
    IdeasController_20.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IdeasController",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """regidea/saved"""
    )
  )

  // @LINE:208
  private[this] lazy val controllers_Application_logout158_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout158_invoker = createInvoker(
    Application_31.logout(),
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

  // @LINE:211
  private[this] lazy val controllers_PrintController_printUserDetails159_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_printUserDetails159_invoker = createInvoker(
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

  // @LINE:212
  private[this] lazy val controllers_PrintController_detailsList160_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/moje/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PrintController_detailsList160_invoker = createInvoker(
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

  // @LINE:214
  private[this] lazy val controllers_SalaryController_saveLector161_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/saved")))
  )
  private[this] lazy val controllers_SalaryController_saveLector161_invoker = createInvoker(
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

  // @LINE:215
  private[this] lazy val controllers_SalaryController_printLector162_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_printLector162_invoker = createInvoker(
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

  // @LINE:216
  private[this] lazy val controllers_SalaryController_detailsListLector163_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/lector/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SalaryController_detailsListLector163_invoker = createInvoker(
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

  // @LINE:219
  private[this] lazy val controllers_Assets_at164_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at164_invoker = createInvoker(
    Assets_27.at(fakeValue[String], fakeValue[String]),
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
        controllers_Application_dashboard0_invoker.call(Application_31.dashboard())
      }
  
    // @LINE:7
    case controllers_Application_pdf1_route(params) =>
      call { 
        controllers_Application_pdf1_invoker.call(Application_31.pdf())
      }
  
    // @LINE:8
    case controllers_Application_raw2_route(params) =>
      call { 
        controllers_Application_raw2_invoker.call(Application_31.raw())
      }
  
    // @LINE:9
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(Application_31.index())
      }
  
    // @LINE:10
    case controllers_TestController_test4_route(params) =>
      call { 
        controllers_TestController_test4_invoker.call(TestController_22.test())
      }
  
    // @LINE:11
    case controllers_TestController_save5_route(params) =>
      call { 
        controllers_TestController_save5_invoker.call(TestController_22.save())
      }
  
    // @LINE:12
    case controllers_Application_kpiChoosePerson6_route(params) =>
      call { 
        controllers_Application_kpiChoosePerson6_invoker.call(Application_31.kpiChoosePerson())
      }
  
    // @LINE:13
    case controllers_SalaryController_getPerson7_route(params) =>
      call { 
        controllers_SalaryController_getPerson7_invoker.call(SalaryController_17.getPerson())
      }
  
    // @LINE:14
    case controllers_Login_index8_route(params) =>
      call { 
        controllers_Login_index8_invoker.call(Login_24.index())
      }
  
    // @LINE:15
    case controllers_Login_authenticate9_route(params) =>
      call { 
        controllers_Login_authenticate9_invoker.call(Login_24.authenticate())
      }
  
    // @LINE:16
    case controllers_Charts_flot10_route(params) =>
      call { 
        controllers_Charts_flot10_invoker.call(Charts_32.flot())
      }
  
    // @LINE:17
    case controllers_Charts_morris11_route(params) =>
      call { 
        controllers_Charts_morris11_invoker.call(Charts_32.morris())
      }
  
    // @LINE:18
    case controllers_Application_forms12_route(params) =>
      call { 
        controllers_Application_forms12_invoker.call(Application_31.forms())
      }
  
    // @LINE:19
    case controllers_UiElements_panelsAndWells13_route(params) =>
      call { 
        controllers_UiElements_panelsAndWells13_invoker.call(UiElements_21.panelsAndWells())
      }
  
    // @LINE:20
    case controllers_UiElements_buttons14_route(params) =>
      call { 
        controllers_UiElements_buttons14_invoker.call(UiElements_21.buttons())
      }
  
    // @LINE:21
    case controllers_UiElements_notifications15_route(params) =>
      call { 
        controllers_UiElements_notifications15_invoker.call(UiElements_21.notifications())
      }
  
    // @LINE:22
    case controllers_UiElements_typography16_route(params) =>
      call { 
        controllers_UiElements_typography16_invoker.call(UiElements_21.typography())
      }
  
    // @LINE:23
    case controllers_UiElements_icons17_route(params) =>
      call { 
        controllers_UiElements_icons17_invoker.call(UiElements_21.icons())
      }
  
    // @LINE:24
    case controllers_UiElements_grid18_route(params) =>
      call { 
        controllers_UiElements_grid18_invoker.call(UiElements_21.grid())
      }
  
    // @LINE:25
    case controllers_Pages_blank19_route(params) =>
      call { 
        controllers_Pages_blank19_invoker.call(Pages_5.blank())
      }
  
    // @LINE:28
    case controllers_PersonController_index20_route(params) =>
      call { 
        controllers_PersonController_index20_invoker.call(PersonController_2.index())
      }
  
    // @LINE:29
    case controllers_PersonController_save21_route(params) =>
      call { 
        controllers_PersonController_save21_invoker.call(PersonController_2.save())
      }
  
    // @LINE:31
    case controllers_VisitsController_index22_route(params) =>
      call { 
        controllers_VisitsController_index22_invoker.call(VisitsController_1.index())
      }
  
    // @LINE:32
    case controllers_VisitsController_save23_route(params) =>
      call { 
        controllers_VisitsController_save23_invoker.call(VisitsController_1.save())
      }
  
    // @LINE:34
    case controllers_ProjectController_index24_route(params) =>
      call { 
        controllers_ProjectController_index24_invoker.call(ProjectController_16.index())
      }
  
    // @LINE:35
    case controllers_ProjectController_save25_route(params) =>
      call { 
        controllers_ProjectController_save25_invoker.call(ProjectController_16.save())
      }
  
    // @LINE:37
    case controllers_FinalWorksController_index26_route(params) =>
      call { 
        controllers_FinalWorksController_index26_invoker.call(FinalWorksController_6.index())
      }
  
    // @LINE:38
    case controllers_FinalWorksController_save27_route(params) =>
      call { 
        controllers_FinalWorksController_save27_invoker.call(FinalWorksController_6.save())
      }
  
    // @LINE:40
    case controllers_PublicationsController_index28_route(params) =>
      call { 
        controllers_PublicationsController_index28_invoker.call(PublicationsController_8.index())
      }
  
    // @LINE:41
    case controllers_PublicationsController_save29_route(params) =>
      call { 
        controllers_PublicationsController_save29_invoker.call(PublicationsController_8.save())
      }
  
    // @LINE:43
    case controllers_OrganizationalUnitsController_index30_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_index30_invoker.call(OrganizationalUnitsController_12.index())
      }
  
    // @LINE:44
    case controllers_OrganizationalUnitsController_save31_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_save31_invoker.call(OrganizationalUnitsController_12.save())
      }
  
    // @LINE:46
    case controllers_OrganizationalUnitsController_indexParticipants32_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_indexParticipants32_invoker.call(OrganizationalUnitsController_12.indexParticipants())
      }
  
    // @LINE:47
    case controllers_OrganizationalUnitsController_saveParticipants33_route(params) =>
      call { 
        controllers_OrganizationalUnitsController_saveParticipants33_invoker.call(OrganizationalUnitsController_12.saveParticipants())
      }
  
    // @LINE:50
    case controllers_EmployeesController_index34_route(params) =>
      call { 
        controllers_EmployeesController_index34_invoker.call(EmployeesController_23.index())
      }
  
    // @LINE:51
    case controllers_EmployeesController_save35_route(params) =>
      call { 
        controllers_EmployeesController_save35_invoker.call(EmployeesController_23.save())
      }
  
    // @LINE:52
    case controllers_EmployeesController_info36_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_info36_invoker.call(EmployeesController_23.info(uid))
      }
  
    // @LINE:53
    case controllers_EmployeesController_edit37_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_edit37_invoker.call(EmployeesController_23.edit(uid))
      }
  
    // @LINE:54
    case controllers_EmployeesController_update38_route(params) =>
      call(params.fromQuery[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_update38_invoker.call(EmployeesController_23.update(uid))
      }
  
    // @LINE:55
    case controllers_EmployeesController_delete39_route(params) =>
      call(params.fromQuery[String]("uid", None)) { (uid) =>
        controllers_EmployeesController_delete39_invoker.call(EmployeesController_23.delete(uid))
      }
  
    // @LINE:57
    case controllers_StatementController_index40_route(params) =>
      call { 
        controllers_StatementController_index40_invoker.call(StatementController_28.index())
      }
  
    // @LINE:58
    case controllers_StatementController_employeeStatement41_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_StatementController_employeeStatement41_invoker.call(StatementController_28.employeeStatement(uid))
      }
  
    // @LINE:59
    case controllers_StatementController_sendStatementToEmployee42_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendStatementToEmployee42_invoker.call(StatementController_28.sendStatementToEmployee(idE, idS))
      }
  
    // @LINE:60
    case controllers_StatementController_infoStatementToEmployee43_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_infoStatementToEmployee43_invoker.call(StatementController_28.infoStatementToEmployee(idE, idS))
      }
  
    // @LINE:61
    case controllers_StatementController_sendToVerify44_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToVerify44_invoker.call(StatementController_28.sendToVerify(idE, idS))
      }
  
    // @LINE:62
    case controllers_StatementController_sendToAgree45_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToAgree45_invoker.call(StatementController_28.sendToAgree(idE, idS))
      }
  
    // @LINE:63
    case controllers_StatementController_sendToRepair46_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendToRepair46_invoker.call(StatementController_28.sendToRepair(idE, idS))
      }
  
    // @LINE:64
    case controllers_StatementController_sendRepairedStatement47_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_sendRepairedStatement47_invoker.call(StatementController_28.sendRepairedStatement(idE, idS))
      }
  
    // @LINE:65
    case controllers_StatementController_checkRepairStatementToEmployee48_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_checkRepairStatementToEmployee48_invoker.call(StatementController_28.checkRepairStatementToEmployee(idE, idS))
      }
  
    // @LINE:66
    case controllers_StatementController_employeeCheckStatement49_route(params) =>
      call(params.fromPath[Long]("idE", None), params.fromPath[Long]("idS", None)) { (idE, idS) =>
        controllers_StatementController_employeeCheckStatement49_invoker.call(StatementController_28.employeeCheckStatement(idE, idS))
      }
  
    // @LINE:69
    case controllers_SubjectController_index50_route(params) =>
      call { 
        controllers_SubjectController_index50_invoker.call(SubjectController_34.index())
      }
  
    // @LINE:70
    case controllers_SubjectController_save51_route(params) =>
      call { 
        controllers_SubjectController_save51_invoker.call(SubjectController_34.save())
      }
  
    // @LINE:72
    case controllers_ClassroomController_index52_route(params) =>
      call { 
        controllers_ClassroomController_index52_invoker.call(ClassroomController_35.index())
      }
  
    // @LINE:73
    case controllers_ClassroomController_save53_route(params) =>
      call { 
        controllers_ClassroomController_save53_invoker.call(ClassroomController_35.save())
      }
  
    // @LINE:74
    case controllers_ClassroomController_edit54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClassroomController_edit54_invoker.call(ClassroomController_35.edit(id))
      }
  
    // @LINE:75
    case controllers_ClassroomController_update55_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_update55_invoker.call(ClassroomController_35.update(id))
      }
  
    // @LINE:76
    case controllers_ClassroomController_delete56_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_ClassroomController_delete56_invoker.call(ClassroomController_35.delete(id))
      }
  
    // @LINE:78
    case controllers_TeachersRoleController_index57_route(params) =>
      call { 
        controllers_TeachersRoleController_index57_invoker.call(TeachersRoleController_25.index())
      }
  
    // @LINE:79
    case controllers_TeachersRoleController_save58_route(params) =>
      call { 
        controllers_TeachersRoleController_save58_invoker.call(TeachersRoleController_25.save())
      }
  
    // @LINE:80
    case controllers_TeachersRoleController_edit59_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_edit59_invoker.call(TeachersRoleController_25.edit(id))
      }
  
    // @LINE:81
    case controllers_TeachersRoleController_update60_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_update60_invoker.call(TeachersRoleController_25.update(id))
      }
  
    // @LINE:82
    case controllers_TeachersRoleController_delete61_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TeachersRoleController_delete61_invoker.call(TeachersRoleController_25.delete(id))
      }
  
    // @LINE:85
    case controllers_FieldOfStudyController_index62_route(params) =>
      call { 
        controllers_FieldOfStudyController_index62_invoker.call(FieldOfStudyController_11.index())
      }
  
    // @LINE:86
    case controllers_FieldOfStudyController_save63_route(params) =>
      call { 
        controllers_FieldOfStudyController_save63_invoker.call(FieldOfStudyController_11.save())
      }
  
    // @LINE:88
    case controllers_CommitteeController_index64_route(params) =>
      call { 
        controllers_CommitteeController_index64_invoker.call(CommitteeController_30.index())
      }
  
    // @LINE:89
    case controllers_CommitteeController_save65_route(params) =>
      call { 
        controllers_CommitteeController_save65_invoker.call(CommitteeController_30.save())
      }
  
    // @LINE:91
    case controllers_PersonalStatisticController_index66_route(params) =>
      call { 
        controllers_PersonalStatisticController_index66_invoker.call(PersonalStatisticController_15.index())
      }
  
    // @LINE:92
    case controllers_PersonalStatisticController_teachingAAA67_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAA67_invoker.call(PersonalStatisticController_15.teachingAAA())
      }
  
    // @LINE:93
    case controllers_PersonalStatisticController_teachingAAB68_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingAAB68_invoker.call(PersonalStatisticController_15.teachingAAB())
      }
  
    // @LINE:94
    case controllers_PersonalStatisticController_teachingCB69_route(params) =>
      call { 
        controllers_PersonalStatisticController_teachingCB69_invoker.call(PersonalStatisticController_15.teachingCB())
      }
  
    // @LINE:97
    case controllers_StatisticController_index70_route(params) =>
      call { 
        controllers_StatisticController_index70_invoker.call(StatisticController_4.index())
      }
  
    // @LINE:98
    case controllers_StatisticController_dcpsCombi71_route(params) =>
      call { 
        controllers_StatisticController_dcpsCombi71_invoker.call(StatisticController_4.dcpsCombi())
      }
  
    // @LINE:99
    case controllers_StatisticController_dcpsPres72_route(params) =>
      call { 
        controllers_StatisticController_dcpsPres72_invoker.call(StatisticController_4.dcpsPres())
      }
  
    // @LINE:100
    case controllers_StatisticController_studyPlansTable73_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTable73_invoker.call(StatisticController_4.studyPlansTable())
      }
  
    // @LINE:101
    case controllers_StatisticController_sp174_route(params) =>
      call { 
        controllers_StatisticController_sp174_invoker.call(StatisticController_4.sp1())
      }
  
    // @LINE:103
    case controllers_StatisticController_studyPlansTablePrint75_route(params) =>
      call { 
        controllers_StatisticController_studyPlansTablePrint75_invoker.call(StatisticController_4.studyPlansTablePrint())
      }
  
    // @LINE:106
    case controllers_StudyGroupsController_index76_route(params) =>
      call { 
        controllers_StudyGroupsController_index76_invoker.call(StudyGroupsController_7.index())
      }
  
    // @LINE:107
    case controllers_StudyGroupsController_save77_route(params) =>
      call { 
        controllers_StudyGroupsController_save77_invoker.call(StudyGroupsController_7.save())
      }
  
    // @LINE:108
    case controllers_TableController_listStudyGroups78_route(params) =>
      call { 
        controllers_TableController_listStudyGroups78_invoker.call(TableController_18.listStudyGroups())
      }
  
    // @LINE:111
    case controllers_SemestersController_index79_route(params) =>
      call { 
        controllers_SemestersController_index79_invoker.call(SemestersController_26.index())
      }
  
    // @LINE:112
    case controllers_SemestersController_save80_route(params) =>
      call { 
        controllers_SemestersController_save80_invoker.call(SemestersController_26.save())
      }
  
    // @LINE:113
    case controllers_TableController_listSemesters81_route(params) =>
      call { 
        controllers_TableController_listSemesters81_invoker.call(TableController_18.listSemesters())
      }
  
    // @LINE:116
    case controllers_StudyPlansController_index82_route(params) =>
      call { 
        controllers_StudyPlansController_index82_invoker.call(StudyPlansController_14.index())
      }
  
    // @LINE:117
    case controllers_StudyPlansController_save83_route(params) =>
      call { 
        controllers_StudyPlansController_save83_invoker.call(StudyPlansController_14.save())
      }
  
    // @LINE:118
    case controllers_TableController_listStudyPlans84_route(params) =>
      call { 
        controllers_TableController_listStudyPlans84_invoker.call(TableController_18.listStudyPlans())
      }
  
    // @LINE:120
    case controllers_CourseController_index85_route(params) =>
      call { 
        controllers_CourseController_index85_invoker.call(CourseController_3.index())
      }
  
    // @LINE:121
    case controllers_CourseController_save86_route(params) =>
      call { 
        controllers_CourseController_save86_invoker.call(CourseController_3.save())
      }
  
    // @LINE:123
    case controllers_TableController_listScheduleInWeeks87_route(params) =>
      call { 
        controllers_TableController_listScheduleInWeeks87_invoker.call(TableController_18.listScheduleInWeeks())
      }
  
    // @LINE:125
    case controllers_TableController_listSchedule88_route(params) =>
      call { 
        controllers_TableController_listSchedule88_invoker.call(TableController_18.listSchedule())
      }
  
    // @LINE:126
    case controllers_TableController_listEmployees89_route(params) =>
      call { 
        controllers_TableController_listEmployees89_invoker.call(TableController_18.listEmployees())
      }
  
    // @LINE:127
    case controllers_TableController_listTeachers90_route(params) =>
      call { 
        controllers_TableController_listTeachers90_invoker.call(TableController_18.listTeachers())
      }
  
    // @LINE:128
    case controllers_TableController_listSubjects91_route(params) =>
      call { 
        controllers_TableController_listSubjects91_invoker.call(TableController_18.listSubjects())
      }
  
    // @LINE:129
    case controllers_TableController_listFieldsOfStudy92_route(params) =>
      call { 
        controllers_TableController_listFieldsOfStudy92_invoker.call(TableController_18.listFieldsOfStudy())
      }
  
    // @LINE:130
    case controllers_TableController_listCourses93_route(params) =>
      call { 
        controllers_TableController_listCourses93_invoker.call(TableController_18.listCourses())
      }
  
    // @LINE:131
    case controllers_TableController_listCurrentSemesters94_route(params) =>
      call { 
        controllers_TableController_listCurrentSemesters94_invoker.call(TableController_18.listCurrentSemesters())
      }
  
    // @LINE:132
    case controllers_TableController_listCurrentSemestersUntilTheEndOfStudy95_route(params) =>
      call { 
        controllers_TableController_listCurrentSemestersUntilTheEndOfStudy95_invoker.call(TableController_18.listCurrentSemestersUntilTheEndOfStudy())
      }
  
    // @LINE:133
    case controllers_TableController_listDays96_route(params) =>
      call { 
        controllers_TableController_listDays96_invoker.call(TableController_18.listDays())
      }
  
    // @LINE:134
    case controllers_TableController_listClassrooms97_route(params) =>
      call { 
        controllers_TableController_listClassrooms97_invoker.call(TableController_18.listClassrooms())
      }
  
    // @LINE:135
    case controllers_TableController_listTeachersRole98_route(params) =>
      call { 
        controllers_TableController_listTeachersRole98_invoker.call(TableController_18.listTeachersRole())
      }
  
    // @LINE:136
    case controllers_TableController_listAccessRole99_route(params) =>
      call { 
        controllers_TableController_listAccessRole99_invoker.call(TableController_18.listAccessRole())
      }
  
    // @LINE:137
    case controllers_TableController_listCommittees100_route(params) =>
      call { 
        controllers_TableController_listCommittees100_invoker.call(TableController_18.listCommittees())
      }
  
    // @LINE:138
    case controllers_TableController_listPublications101_route(params) =>
      call { 
        controllers_TableController_listPublications101_invoker.call(TableController_18.listPublications())
      }
  
    // @LINE:139
    case controllers_TableController_listTeachersInWeeks102_route(params) =>
      call { 
        controllers_TableController_listTeachersInWeeks102_invoker.call(TableController_18.listTeachersInWeeks())
      }
  
    // @LINE:141
    case controllers_StatisticController_listEmployeesActvitiy103_route(params) =>
      call { 
        controllers_StatisticController_listEmployeesActvitiy103_invoker.call(StatisticController_4.listEmployeesActvitiy())
      }
  
    // @LINE:142
    case controllers_StatisticController_listEmployeerActvitiy104_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_StatisticController_listEmployeerActvitiy104_invoker.call(StatisticController_4.listEmployeerActvitiy(uid))
      }
  
    // @LINE:143
    case controllers_PersonalStatisticController_listTableTeachingAccordingToPersons105_route(params) =>
      call { 
        controllers_PersonalStatisticController_listTableTeachingAccordingToPersons105_invoker.call(PersonalStatisticController_15.listTableTeachingAccordingToPersons())
      }
  
    // @LINE:144
    case controllers_PersonalStatisticController_listTableTeachingAccordingToId106_route(params) =>
      call(params.fromPath[String]("uid", None)) { (uid) =>
        controllers_PersonalStatisticController_listTableTeachingAccordingToId106_invoker.call(PersonalStatisticController_15.listTableTeachingAccordingToId(uid))
      }
  
    // @LINE:146
    case controllers_TeachersController_index107_route(params) =>
      call { 
        controllers_TeachersController_index107_invoker.call(TeachersController_9.index())
      }
  
    // @LINE:147
    case controllers_TeachersController_save108_route(params) =>
      call { 
        controllers_TeachersController_save108_invoker.call(TeachersController_9.save())
      }
  
    // @LINE:149
    case controllers_AccessRoleController_index109_route(params) =>
      call { 
        controllers_AccessRoleController_index109_invoker.call(AccessRoleController_33.index())
      }
  
    // @LINE:150
    case controllers_AccessRoleController_save110_route(params) =>
      call { 
        controllers_AccessRoleController_save110_invoker.call(AccessRoleController_33.save())
      }
  
    // @LINE:151
    case controllers_AccessRoleController_edit111_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_edit111_invoker.call(AccessRoleController_33.edit(id))
      }
  
    // @LINE:152
    case controllers_AccessRoleController_update112_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_update112_invoker.call(AccessRoleController_33.update(id))
      }
  
    // @LINE:153
    case controllers_AccessRoleController_delete113_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_AccessRoleController_delete113_invoker.call(AccessRoleController_33.delete(id))
      }
  
    // @LINE:156
    case controllers_MethodicsController_index114_route(params) =>
      call { 
        controllers_MethodicsController_index114_invoker.call(MethodicsController_0.index())
      }
  
    // @LINE:157
    case controllers_MethodicsController_save115_route(params) =>
      call { 
        controllers_MethodicsController_save115_invoker.call(MethodicsController_0.save())
      }
  
    // @LINE:159
    case controllers_Application_roles116_route(params) =>
      call { 
        controllers_Application_roles116_invoker.call(Application_31.roles())
      }
  
    // @LINE:162
    case controllers_TableController_listPerson117_route(params) =>
      call { 
        controllers_TableController_listPerson117_invoker.call(TableController_18.listPerson())
      }
  
    // @LINE:164
    case controllers_SubjectPlanTeachingController_index118_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_index118_invoker.call(SubjectPlanTeachingController_10.index())
      }
  
    // @LINE:165
    case controllers_SubjectPlanTeachingController_save119_route(params) =>
      call { 
        controllers_SubjectPlanTeachingController_save119_invoker.call(SubjectPlanTeachingController_10.save())
      }
  
    // @LINE:167
    case controllers_PDFController_pdfTableAccessRole120_route(params) =>
      call { 
        controllers_PDFController_pdfTableAccessRole120_invoker.call(PDFController_13.pdfTableAccessRole())
      }
  
    // @LINE:168
    case controllers_PDFController_pdfTableDCPS121_route(params) =>
      call { 
        controllers_PDFController_pdfTableDCPS121_invoker.call(PDFController_13.pdfTableDCPS())
      }
  
    // @LINE:169
    case controllers_PDFController_pdfTableDCPSPres122_route(params) =>
      call { 
        controllers_PDFController_pdfTableDCPSPres122_invoker.call(PDFController_13.pdfTableDCPSPres())
      }
  
    // @LINE:170
    case controllers_PDFController_pdfTableDCPSCombi123_route(params) =>
      call { 
        controllers_PDFController_pdfTableDCPSCombi123_invoker.call(PDFController_13.pdfTableDCPSCombi())
      }
  
    // @LINE:171
    case controllers_PDFController_pdfTableClassroom124_route(params) =>
      call { 
        controllers_PDFController_pdfTableClassroom124_invoker.call(PDFController_13.pdfTableClassroom())
      }
  
    // @LINE:172
    case controllers_PDFController_pdfTableCommittee125_route(params) =>
      call { 
        controllers_PDFController_pdfTableCommittee125_invoker.call(PDFController_13.pdfTableCommittee())
      }
  
    // @LINE:173
    case controllers_PDFController_pdfTableEmployees126_route(params) =>
      call { 
        controllers_PDFController_pdfTableEmployees126_invoker.call(PDFController_13.pdfTableEmployees())
      }
  
    // @LINE:174
    case controllers_PDFController_pdfTableFieldsOfStudy127_route(params) =>
      call { 
        controllers_PDFController_pdfTableFieldsOfStudy127_invoker.call(PDFController_13.pdfTableFieldsOfStudy())
      }
  
    // @LINE:175
    case controllers_PDFController_pdfTablePublication128_route(params) =>
      call { 
        controllers_PDFController_pdfTablePublication128_invoker.call(PDFController_13.pdfTablePublication())
      }
  
    // @LINE:176
    case controllers_PDFController_pdfTableSPPrint129_route(params) =>
      call { 
        controllers_PDFController_pdfTableSPPrint129_invoker.call(PDFController_13.pdfTableSPPrint())
      }
  
    // @LINE:177
    case controllers_PDFController_pdfTableStudyGroups130_route(params) =>
      call { 
        controllers_PDFController_pdfTableStudyGroups130_invoker.call(PDFController_13.pdfTableStudyGroups())
      }
  
    // @LINE:178
    case controllers_PDFController_pdfTableStudyPlans131_route(params) =>
      call { 
        controllers_PDFController_pdfTableStudyPlans131_invoker.call(PDFController_13.pdfTableStudyPlans())
      }
  
    // @LINE:179
    case controllers_PDFController_pdfTableSubjects132_route(params) =>
      call { 
        controllers_PDFController_pdfTableSubjects132_invoker.call(PDFController_13.pdfTableSubjects())
      }
  
    // @LINE:180
    case controllers_PDFController_pdfTableTeachingAAA133_route(params) =>
      call { 
        controllers_PDFController_pdfTableTeachingAAA133_invoker.call(PDFController_13.pdfTableTeachingAAA())
      }
  
    // @LINE:181
    case controllers_PDFController_pdfTableTeachingAAB134_route(params) =>
      call { 
        controllers_PDFController_pdfTableTeachingAAB134_invoker.call(PDFController_13.pdfTableTeachingAAB())
      }
  
    // @LINE:182
    case controllers_PDFController_pdfTableTeachingAccordingToPersons135_route(params) =>
      call { 
        controllers_PDFController_pdfTableTeachingAccordingToPersons135_invoker.call(PDFController_13.pdfTableTeachingAccordingToPersons())
      }
  
    // @LINE:183
    case controllers_PDFController_pdfTableTeachingCB136_route(params) =>
      call { 
        controllers_PDFController_pdfTableTeachingCB136_invoker.call(PDFController_13.pdfTableTeachingCB())
      }
  
    // @LINE:184
    case controllers_PDFController_pdfTableTeachingDepartmentEmployee137_route(params) =>
      call { 
        controllers_PDFController_pdfTableTeachingDepartmentEmployee137_invoker.call(PDFController_13.pdfTableTeachingDepartmentEmployee())
      }
  
    // @LINE:186
    case controllers_DOCController_docTableAccessRole138_route(params) =>
      call { 
        controllers_DOCController_docTableAccessRole138_invoker.call(DOCController_29.docTableAccessRole())
      }
  
    // @LINE:187
    case controllers_DOCController_docTableDCPS139_route(params) =>
      call { 
        controllers_DOCController_docTableDCPS139_invoker.call(DOCController_29.docTableDCPS())
      }
  
    // @LINE:188
    case controllers_DOCController_docTableDCPSPres140_route(params) =>
      call { 
        controllers_DOCController_docTableDCPSPres140_invoker.call(DOCController_29.docTableDCPSPres())
      }
  
    // @LINE:189
    case controllers_DOCController_docTableDCPSCombi141_route(params) =>
      call { 
        controllers_DOCController_docTableDCPSCombi141_invoker.call(DOCController_29.docTableDCPSCombi())
      }
  
    // @LINE:190
    case controllers_DOCController_docTableClassroom142_route(params) =>
      call { 
        controllers_DOCController_docTableClassroom142_invoker.call(DOCController_29.docTableClassroom())
      }
  
    // @LINE:191
    case controllers_DOCController_docTableCommittee143_route(params) =>
      call { 
        controllers_DOCController_docTableCommittee143_invoker.call(DOCController_29.docTableCommittee())
      }
  
    // @LINE:192
    case controllers_DOCController_docTableEmployees144_route(params) =>
      call { 
        controllers_DOCController_docTableEmployees144_invoker.call(DOCController_29.docTableEmployees())
      }
  
    // @LINE:193
    case controllers_DOCController_docTableFieldsOfStudy145_route(params) =>
      call { 
        controllers_DOCController_docTableFieldsOfStudy145_invoker.call(DOCController_29.docTableFieldsOfStudy())
      }
  
    // @LINE:194
    case controllers_DOCController_docTablePublication146_route(params) =>
      call { 
        controllers_DOCController_docTablePublication146_invoker.call(DOCController_29.docTablePublication())
      }
  
    // @LINE:195
    case controllers_DOCController_docTableSPPrint147_route(params) =>
      call { 
        controllers_DOCController_docTableSPPrint147_invoker.call(DOCController_29.docTableSPPrint())
      }
  
    // @LINE:196
    case controllers_DOCController_docTableStudyGroups148_route(params) =>
      call { 
        controllers_DOCController_docTableStudyGroups148_invoker.call(DOCController_29.docTableStudyGroups())
      }
  
    // @LINE:197
    case controllers_DOCController_docTableStudyPlans149_route(params) =>
      call { 
        controllers_DOCController_docTableStudyPlans149_invoker.call(DOCController_29.docTableStudyPlans())
      }
  
    // @LINE:198
    case controllers_DOCController_docTableSubjects150_route(params) =>
      call { 
        controllers_DOCController_docTableSubjects150_invoker.call(DOCController_29.docTableSubjects())
      }
  
    // @LINE:199
    case controllers_DOCController_docTableTeachingAAA151_route(params) =>
      call { 
        controllers_DOCController_docTableTeachingAAA151_invoker.call(DOCController_29.docTableTeachingAAA())
      }
  
    // @LINE:200
    case controllers_DOCController_docTableTeachingAAB152_route(params) =>
      call { 
        controllers_DOCController_docTableTeachingAAB152_invoker.call(DOCController_29.docTableTeachingAAB())
      }
  
    // @LINE:201
    case controllers_DOCController_docTableTeachingAccordingToPersons153_route(params) =>
      call { 
        controllers_DOCController_docTableTeachingAccordingToPersons153_invoker.call(DOCController_29.docTableTeachingAccordingToPersons())
      }
  
    // @LINE:202
    case controllers_DOCController_docTableTeachingCB154_route(params) =>
      call { 
        controllers_DOCController_docTableTeachingCB154_invoker.call(DOCController_29.docTableTeachingCB())
      }
  
    // @LINE:203
    case controllers_DOCController_docTableTeachingDepartmentEmployee155_route(params) =>
      call { 
        controllers_DOCController_docTableTeachingDepartmentEmployee155_invoker.call(DOCController_29.docTableTeachingDepartmentEmployee())
      }
  
    // @LINE:205
    case controllers_IdeasController_index156_route(params) =>
      call { 
        controllers_IdeasController_index156_invoker.call(IdeasController_20.index())
      }
  
    // @LINE:206
    case controllers_IdeasController_save157_route(params) =>
      call { 
        controllers_IdeasController_save157_invoker.call(IdeasController_20.save())
      }
  
    // @LINE:208
    case controllers_Application_logout158_route(params) =>
      call { 
        controllers_Application_logout158_invoker.call(Application_31.logout())
      }
  
    // @LINE:211
    case controllers_PrintController_printUserDetails159_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_printUserDetails159_invoker.call(PrintController_19.printUserDetails(id))
      }
  
    // @LINE:212
    case controllers_PrintController_detailsList160_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PrintController_detailsList160_invoker.call(PrintController_19.detailsList(id))
      }
  
    // @LINE:214
    case controllers_SalaryController_saveLector161_route(params) =>
      call { 
        controllers_SalaryController_saveLector161_invoker.call(SalaryController_17.saveLector())
      }
  
    // @LINE:215
    case controllers_SalaryController_printLector162_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_printLector162_invoker.call(SalaryController_17.printLector(id))
      }
  
    // @LINE:216
    case controllers_SalaryController_detailsListLector163_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SalaryController_detailsListLector163_invoker.call(SalaryController_17.detailsListLector(id))
      }
  
    // @LINE:219
    case controllers_Assets_at164_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at164_invoker.call(Assets_27.at(path, file))
      }
  }
}
