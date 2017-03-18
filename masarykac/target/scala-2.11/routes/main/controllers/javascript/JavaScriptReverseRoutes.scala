
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat Mar 18 11:21:59 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:26
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/saved"})
        }
      """
    )
  
    // @LINE:26
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
        }
      """
    )
  
  }

  // @LINE:93
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:93
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseSubjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/saved"})
        }
      """
    )
  
    // @LINE:34
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/add"})
        }
      """
    )
  
  }

  // @LINE:84
  class ReversePrintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def printUserDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.printUserDetails",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:85
    def detailsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.detailsList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReversePages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Pages.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pages/blank"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseSemestersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/saved"})
        }
      """
    )
  
    // @LINE:47
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/add"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseUiElements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def panelsAndWells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.panelsAndWells",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/panels-and-wells"})
        }
      """
    )
  
    // @LINE:20
    def typography: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.typography",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/typography"})
        }
      """
    )
  
    // @LINE:19
    def notifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.notifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/notifications"})
        }
      """
    )
  
    // @LINE:18
    def buttons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.buttons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/buttons"})
        }
      """
    )
  
    // @LINE:21
    def icons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.icons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/icons"})
        }
      """
    )
  
    // @LINE:22
    def grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/grid"})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseTableController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def listScheduleInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listScheduleInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scheduleinweeks"})
        }
      """
    )
  
    // @LINE:49
    def listSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester"})
        }
      """
    )
  
    // @LINE:63
    def listCourses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCourses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
    // @LINE:59
    def listEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
    // @LINE:54
    def listStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplans"})
        }
      """
    )
  
    // @LINE:78
    def listPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPerson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:44
    def listStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups"})
        }
      """
    )
  
    // @LINE:64
    def listCurrentSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "currentsemesters"})
        }
      """
    )
  
    // @LINE:65
    def listCurrentSemestersUntilTheEndOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemestersUntilTheEndOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lcsuteos"})
        }
      """
    )
  
    // @LINE:66
    def listDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "days"})
        }
      """
    )
  
    // @LINE:58
    def listSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule"})
        }
      """
    )
  
    // @LINE:62
    def listFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields"})
        }
      """
    )
  
    // @LINE:60
    def listTeachers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers"})
        }
      """
    )
  
    // @LINE:61
    def listSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subjects"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:12
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

  
    // @LINE:75
    def roles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.roles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roles"})
        }
      """
    )
  
    // @LINE:15
    def tables: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tables",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tables"})
        }
      """
    )
  
    // @LINE:16
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
  
    // @LINE:9
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
  
    // @LINE:81
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

  // @LINE:72
  class ReverseMethodicsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "m/saved"})
        }
      """
    )
  
    // @LINE:72
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "m/add"})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseStudyPlansController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/saved"})
        }
      """
    )
  
    // @LINE:52
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/add"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseCharts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def flot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.flot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/flot"})
        }
      """
    )
  
    // @LINE:14
    def morris: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.morris",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/morris"})
        }
      """
    )
  
  }

  // @LINE:68
  class ReverseTeachersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:69
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/saved"})
        }
      """
    )
  
    // @LINE:68
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/add"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseFieldOfStudyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/saved"})
        }
      """
    )
  
    // @LINE:38
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/add"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseStudyGroupsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/saved"})
        }
      """
    )
  
    // @LINE:42
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/add"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseEmployeesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/saved"})
        }
      """
    )
  
    // @LINE:30
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/register"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseSalaryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def saveLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.saveLector",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/saved"})
        }
      """
    )
  
    // @LINE:10
    def getPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.getPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kpi/k"})
        }
      """
    )
  
    // @LINE:89
    def detailsListLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.detailsListLector",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:88
    def printLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.printLector",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }


}
