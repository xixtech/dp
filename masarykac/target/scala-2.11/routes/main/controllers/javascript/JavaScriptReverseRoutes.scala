
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Fri May 05 11:19:27 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/saved"})
        }
      """
    )
  
    // @LINE:29
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
        }
      """
    )
  
  }

  // @LINE:164
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:164
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:83
  class ReverseCommitteeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommitteeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "committee/saved"})
        }
      """
    )
  
    // @LINE:83
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommitteeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "committee/add"})
        }
      """
    )
  
  }

  // @LINE:64
  class ReverseSubjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/saved"})
        }
      """
    )
  
    // @LINE:64
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/add"})
        }
      """
    )
  
  }

  // @LINE:86
  class ReversePersonalStatisticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def teachingAAA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingAAA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/aaa"})
        }
      """
    )
  
    // @LINE:89
    def teachingCB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingCB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/cb"})
        }
      """
    )
  
    // @LINE:88
    def teachingAAB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingAAB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/aab"})
        }
      """
    )
  
    // @LINE:134
    def listTableTeachingAccordingToId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.listTableTeachingAccordingToId",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teaching/t/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:86
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics"})
        }
      """
    )
  
    // @LINE:133
    def listTableTeachingAccordingToPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.listTableTeachingAccordingToPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teaching"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/saved"})
        }
      """
    )
  
    // @LINE:35
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/register"})
        }
      """
    )
  
  }

  // @LINE:155
  class ReversePrintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:155
    def printUserDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.printUserDetails",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:156
    def detailsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.detailsList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:148
  class ReverseSubjectPlanTeachingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:149
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/saved"})
        }
      """
    )
  
    // @LINE:148
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/add"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseFinalWorksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/saved"})
        }
      """
    )
  
    // @LINE:38
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/register"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReversePages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Pages.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pages/blank"})
        }
      """
    )
  
  }

  // @LINE:102
  class ReverseSemestersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/saved"})
        }
      """
    )
  
    // @LINE:102
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/add"})
        }
      """
    )
  
  }

  // @LINE:10
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
  
    // @LINE:10
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
  }

  // @LINE:67
  class ReverseClassroomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:69
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:70
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/updated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:68
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/saved"})
        }
      """
    )
  
    // @LINE:67
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/add"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseUiElements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def panelsAndWells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.panelsAndWells",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/panels-and-wells"})
        }
      """
    )
  
    // @LINE:23
    def typography: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.typography",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/typography"})
        }
      """
    )
  
    // @LINE:22
    def notifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.notifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/notifications"})
        }
      """
    )
  
    // @LINE:21
    def buttons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.buttons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/buttons"})
        }
      """
    )
  
    // @LINE:24
    def icons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.icons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/icons"})
        }
      """
    )
  
    // @LINE:25
    def grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/grid"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseVisitsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/saved"})
        }
      """
    )
  
    // @LINE:32
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/register"})
        }
      """
    )
  
  }

  // @LINE:99
  class ReverseTableController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:114
    def listScheduleInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listScheduleInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scheduleinweeks"})
        }
      """
    )
  
    // @LINE:104
    def listSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester"})
        }
      """
    )
  
    // @LINE:121
    def listCourses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCourses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
    // @LINE:129
    def listTeachersInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachersInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tiw"})
        }
      """
    )
  
    // @LINE:117
    def listEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
    // @LINE:126
    def listTeachersRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachersRole",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachroles"})
        }
      """
    )
  
    // @LINE:109
    def listStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplans"})
        }
      """
    )
  
    // @LINE:146
    def listPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPerson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:128
    def listPublications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPublications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publications"})
        }
      """
    )
  
    // @LINE:127
    def listCommittees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCommittees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "committees"})
        }
      """
    )
  
    // @LINE:99
    def listStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups"})
        }
      """
    )
  
    // @LINE:122
    def listCurrentSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "currentsemesters"})
        }
      """
    )
  
    // @LINE:123
    def listCurrentSemestersUntilTheEndOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemestersUntilTheEndOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lcsuteos"})
        }
      """
    )
  
    // @LINE:124
    def listDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "days"})
        }
      """
    )
  
    // @LINE:116
    def listSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule"})
        }
      """
    )
  
    // @LINE:120
    def listFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields"})
        }
      """
    )
  
    // @LINE:118
    def listTeachers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers"})
        }
      """
    )
  
    // @LINE:119
    def listSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subjects"})
        }
      """
    )
  
    // @LINE:125
    def listClassrooms: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listClassrooms",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classrooms"})
        }
      """
    )
  
  }

  // @LINE:111
  class ReverseCourseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:112
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/saved"})
        }
      """
    )
  
    // @LINE:111
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/add"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLogin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:15
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Login.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseTeachersRoleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:75
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:76
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/updated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:74
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/saved"})
        }
      """
    )
  
    // @LINE:73
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/add"})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseOrganizationalUnitsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def indexParticipants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.indexParticipants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oup/register"})
        }
      """
    )
  
    // @LINE:48
    def saveParticipants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.saveParticipants",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "oup/saved"})
        }
      """
    )
  
    // @LINE:45
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ou/saved"})
        }
      """
    )
  
    // @LINE:44
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ou/register"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:143
    def roles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.roles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roles"})
        }
      """
    )
  
    // @LINE:18
    def tables: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.tables",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tables"})
        }
      """
    )
  
    // @LINE:19
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
  
    // @LINE:8
    def raw: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.raw",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "raw"})
        }
      """
    )
  
    // @LINE:12
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
  
    // @LINE:152
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:92
  class ReverseStatisticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:131
    def listEmployeesActvitiy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.listEmployeesActvitiy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estat"})
        }
      """
    )
  
    // @LINE:93
    def studyPlansTable: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.studyPlansTable",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sp"})
        }
      """
    )
  
    // @LINE:94
    def studyPlansTablePrint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.studyPlansTablePrint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spprint"})
        }
      """
    )
  
    // @LINE:132
    def listEmployeerActvitiy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.listEmployeerActvitiy",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estat/info/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:92
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dcps"})
        }
      """
    )
  
  }

  // @LINE:140
  class ReverseMethodicsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:141
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "m/saved"})
        }
      """
    )
  
    // @LINE:140
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "m/add"})
        }
      """
    )
  
  }

  // @LINE:107
  class ReverseStudyPlansController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/saved"})
        }
      """
    )
  
    // @LINE:107
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/add"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseCharts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def flot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.flot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/flot"})
        }
      """
    )
  
    // @LINE:17
    def morris: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Charts.morris",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "charts/morris"})
        }
      """
    )
  
  }

  // @LINE:136
  class ReverseTeachersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:137
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/saved"})
        }
      """
    )
  
    // @LINE:136
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/add"})
        }
      """
    )
  
  }

  // @LINE:80
  class ReverseFieldOfStudyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/saved"})
        }
      """
    )
  
    // @LINE:80
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/add"})
        }
      """
    )
  
  }

  // @LINE:97
  class ReverseStudyGroupsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:98
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/saved"})
        }
      """
    )
  
    // @LINE:97
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/add"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseEmployeesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.edit",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/edit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:56
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.delete",
      """
        function(email0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/delete" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:52
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/saved"})
        }
      """
    )
  
    // @LINE:55
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.update",
      """
        function(email0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updated/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:53
    def info: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.info",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/info/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:51
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/register"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseStatementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def sendStatementToEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendStatementToEmployee",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/check/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:61
    def sendToAgree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendToAgree",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/agree/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:59
    def employeeStatement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.employeeStatement",
      """
        function(email0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/employee/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:62
    def sendToRepair: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendToRepair",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/repair/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:58
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statement"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSalaryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:158
    def saveLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.saveLector",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/saved"})
        }
      """
    )
  
    // @LINE:13
    def getPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.getPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kpi/k"})
        }
      """
    )
  
    // @LINE:160
    def detailsListLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.detailsListLector",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:159
    def printLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.printLector",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReversePublicationsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicationsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publication/saved"})
        }
      """
    )
  
    // @LINE:41
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
