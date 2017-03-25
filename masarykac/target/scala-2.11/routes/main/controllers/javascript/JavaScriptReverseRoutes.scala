
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat Mar 25 09:30:07 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:30
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/saved"})
        }
      """
    )
  
    // @LINE:30
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
        }
      """
    )
  
  }

  // @LINE:115
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:115
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseSubjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/saved"})
        }
      """
    )
  
    // @LINE:50
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/add"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/saved"})
        }
      """
    )
  
    // @LINE:36
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/register"})
        }
      """
    )
  
  }

  // @LINE:106
  class ReversePrintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:106
    def printUserDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.printUserDetails",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:107
    def detailsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.detailsList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:99
  class ReverseSubjectPlanTeachingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:100
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/saved"})
        }
      """
    )
  
    // @LINE:99
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/add"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseFinalWorksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/saved"})
        }
      """
    )
  
    // @LINE:39
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/register"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReversePages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Pages.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pages/blank"})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseSemestersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/saved"})
        }
      """
    )
  
    // @LINE:63
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/add"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseTestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test/ok"})
        }
      """
    )
  
    // @LINE:9
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseUiElements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def panelsAndWells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.panelsAndWells",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/panels-and-wells"})
        }
      """
    )
  
    // @LINE:24
    def typography: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.typography",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/typography"})
        }
      """
    )
  
    // @LINE:23
    def notifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.notifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/notifications"})
        }
      """
    )
  
    // @LINE:22
    def buttons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.buttons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/buttons"})
        }
      """
    )
  
    // @LINE:25
    def icons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.icons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/icons"})
        }
      """
    )
  
    // @LINE:26
    def grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/grid"})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseVisitsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/saved"})
        }
      """
    )
  
    // @LINE:33
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/register"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseTableController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def listScheduleInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listScheduleInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scheduleinweeks"})
        }
      """
    )
  
    // @LINE:65
    def listSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester"})
        }
      """
    )
  
    // @LINE:82
    def listCourses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCourses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
    // @LINE:78
    def listEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
    // @LINE:70
    def listStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplans"})
        }
      """
    )
  
    // @LINE:97
    def listPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPerson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:60
    def listStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups"})
        }
      """
    )
  
    // @LINE:83
    def listCurrentSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "currentsemesters"})
        }
      """
    )
  
    // @LINE:84
    def listCurrentSemestersUntilTheEndOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemestersUntilTheEndOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lcsuteos"})
        }
      """
    )
  
    // @LINE:85
    def listDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "days"})
        }
      """
    )
  
    // @LINE:77
    def listSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule"})
        }
      """
    )
  
    // @LINE:81
    def listFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields"})
        }
      """
    )
  
    // @LINE:79
    def listTeachers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers"})
        }
      """
    )
  
    // @LINE:80
    def listSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subjects"})
        }
      """
    )
  
  }

  // @LINE:72
  class ReverseCourseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/saved"})
        }
      """
    )
  
    // @LINE:72
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/add"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def roles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.roles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roles"})
        }
      """
    )
  
    // @LINE:19
    def tables: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tables",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tables"})
        }
      """
    )
  
    // @LINE:20
    def forms: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.forms",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forms"})
        }
      """
    )
  
    // @LINE:6
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:13
    def kpiChoosePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.kpiChoosePerson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kpi"})
        }
      """
    )
  
    // @LINE:7
    def pdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.pdf",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdf"})
        }
      """
    )
  
    // @LINE:103
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:91
  class ReverseMethodicsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "m/saved"})
        }
      """
    )
  
    // @LINE:91
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "m/add"})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseStudyPlansController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/saved"})
        }
      """
    )
  
    // @LINE:68
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/add"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseCharts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def flot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.flot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/flot"})
        }
      """
    )
  
    // @LINE:18
    def morris: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.morris",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/morris"})
        }
      """
    )
  
  }

  // @LINE:87
  class ReverseTeachersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/saved"})
        }
      """
    )
  
    // @LINE:87
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/add"})
        }
      """
    )
  
  }

  // @LINE:54
  class ReverseFieldOfStudyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/saved"})
        }
      """
    )
  
    // @LINE:54
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/add"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseStudyGroupsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/saved"})
        }
      """
    )
  
    // @LINE:58
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/add"})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseEmployeesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/saved"})
        }
      """
    )
  
    // @LINE:46
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/register"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseSalaryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def saveLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.saveLector",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/saved"})
        }
      """
    )
  
    // @LINE:14
    def getPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.getPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kpi/k"})
        }
      """
    )
  
    // @LINE:111
    def detailsListLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.detailsListLector",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:110
    def printLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.printLector",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:42
  class ReversePublicationsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicationsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publication/saved"})
        }
      """
    )
  
    // @LINE:42
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicationsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publication/register"})
        }
      """
    )
  
  }


}
