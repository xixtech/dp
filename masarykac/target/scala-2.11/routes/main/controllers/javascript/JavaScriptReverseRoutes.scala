
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Mon May 15 17:39:06 CEST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:28
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/saved"})
        }
      """
    )
  
    // @LINE:28
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/register"})
        }
      """
    )
  
  }

  // @LINE:226
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:226
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:90
  class ReverseCommitteeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:91
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommitteeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "committee/saved"})
        }
      """
    )
  
    // @LINE:90
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommitteeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "committee/add"})
        }
      """
    )
  
  }

  // @LINE:69
  class ReverseSubjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/saved"})
        }
      """
    )
  
    // @LINE:69
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subject/add"})
        }
      """
    )
  
  }

  // @LINE:93
  class ReversePersonalStatisticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def teachingAAA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingAAA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/aaa"})
        }
      """
    )
  
    // @LINE:96
    def teachingCB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingCB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/cb"})
        }
      """
    )
  
    // @LINE:95
    def teachingAAB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.teachingAAB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/aab"})
        }
      """
    )
  
    // @LINE:149
    def listTableTeachingAccordingToId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.listTableTeachingAccordingToId",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teaching/t/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:93
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics"})
        }
      """
    )
  
    // @LINE:148
    def listTableTeachingAccordingToPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonalStatisticController.listTableTeachingAccordingToPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teaching"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/saved"})
        }
      """
    )
  
    // @LINE:34
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/register"})
        }
      """
    )
  
  }

  // @LINE:218
  class ReversePrintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:218
    def printUserDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.printUserDetails",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:219
    def detailsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PrintController.detailsList",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/moje/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:169
  class ReverseSubjectPlanTeachingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:170
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/saved"})
        }
      """
    )
  
    // @LINE:169
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SubjectPlanTeachingController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sub/add"})
        }
      """
    )
  
  }

  // @LINE:37
  class ReverseFinalWorksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/saved"})
        }
      """
    )
  
    // @LINE:37
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FinalWorksController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finalwork/register"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReversePages(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Pages.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pages/blank"})
        }
      """
    )
  
  }

  // @LINE:115
  class ReverseSemestersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SemestersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "semester/saved"})
        }
      """
    )
  
    // @LINE:115
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

  // @LINE:72
  class ReverseClassroomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:74
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:75
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/updated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:73
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/saved"})
        }
      """
    )
  
    // @LINE:72
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClassroomController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classroom/add"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseUiElements(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def panelsAndWells: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.panelsAndWells",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/panels-and-wells"})
        }
      """
    )
  
    // @LINE:22
    def typography: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.typography",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/typography"})
        }
      """
    )
  
    // @LINE:21
    def notifications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.notifications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/notifications"})
        }
      """
    )
  
    // @LINE:20
    def buttons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.buttons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/buttons"})
        }
      """
    )
  
    // @LINE:23
    def icons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.icons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/icons"})
        }
      """
    )
  
    // @LINE:24
    def grid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UiElements.grid",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ui-elements/grid"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseVisitsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/saved"})
        }
      """
    )
  
    // @LINE:31
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VisitsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "visit/register"})
        }
      """
    )
  
  }

  // @LINE:112
  class ReverseTableController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:127
    def listScheduleInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listScheduleInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scheduleinweeks"})
        }
      """
    )
  
    // @LINE:141
    def listAccessRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listAccessRole",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessroles"})
        }
      """
    )
  
    // @LINE:117
    def listSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "semester"})
        }
      """
    )
  
    // @LINE:135
    def listCourses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCourses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
    // @LINE:144
    def listTeachersInWeeks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachersInWeeks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tiw"})
        }
      """
    )
  
    // @LINE:130
    def listEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
    // @LINE:140
    def listTeachersRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachersRole",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachroles"})
        }
      """
    )
  
    // @LINE:131
    def listOJ: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listOJ",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oj"})
        }
      """
    )
  
    // @LINE:122
    def listStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplans"})
        }
      """
    )
  
    // @LINE:167
    def listPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPerson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:143
    def listPublications: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listPublications",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "publications"})
        }
      """
    )
  
    // @LINE:142
    def listCommittees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCommittees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "committees"})
        }
      """
    )
  
    // @LINE:112
    def listStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups"})
        }
      """
    )
  
    // @LINE:136
    def listCurrentSemesters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemesters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "currentsemesters"})
        }
      """
    )
  
    // @LINE:137
    def listCurrentSemestersUntilTheEndOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listCurrentSemestersUntilTheEndOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lcsuteos"})
        }
      """
    )
  
    // @LINE:138
    def listDays: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listDays",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "days"})
        }
      """
    )
  
    // @LINE:129
    def listSchedule: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSchedule",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "schedule"})
        }
      """
    )
  
    // @LINE:134
    def listFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields"})
        }
      """
    )
  
    // @LINE:132
    def listTeachers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listTeachers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers"})
        }
      """
    )
  
    // @LINE:133
    def listSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subjects"})
        }
      """
    )
  
    // @LINE:139
    def listClassrooms: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TableController.listClassrooms",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "classrooms"})
        }
      """
    )
  
  }

  // @LINE:124
  class ReverseCourseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:125
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/saved"})
        }
      """
    )
  
    // @LINE:124
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

  // @LINE:78
  class ReverseTeachersRoleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:80
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:81
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/updated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:79
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/saved"})
        }
      """
    )
  
    // @LINE:78
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersRoleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachersrole/add"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseOrganizationalUnitsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def indexParticipants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.indexParticipants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "oup/register"})
        }
      """
    )
  
    // @LINE:47
    def saveParticipants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.saveParticipants",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "oup/saved"})
        }
      """
    )
  
    // @LINE:44
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationalUnitsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ou/saved"})
        }
      """
    )
  
    // @LINE:43
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

  
    // @LINE:164
    def roles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.roles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roles"})
        }
      """
    )
  
    // @LINE:18
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
  
    // @LINE:215
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

  // @LINE:154
  class ReverseAccessRoleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:158
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccessRoleController.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accessrole/delete" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:156
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccessRoleController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessrole/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:157
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccessRoleController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accessrole/updated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:155
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccessRoleController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accessrole/saved"})
        }
      """
    )
  
    // @LINE:154
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccessRoleController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessrole/add"})
        }
      """
    )
  
  }

  // @LINE:99
  class ReverseStatisticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:146
    def listEmployeesActvitiy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.listEmployeesActvitiy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estat"})
        }
      """
    )
  
    // @LINE:102
    def studyPlansTable: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.studyPlansTable",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sp"})
        }
      """
    )
  
    // @LINE:100
    def dcpsCombi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.dcpsCombi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dcpsc"})
        }
      """
    )
  
    // @LINE:101
    def dcpsPres: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.dcpsPres",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dcpsp"})
        }
      """
    )
  
    // @LINE:105
    def studyPlansTablePrint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.studyPlansTablePrint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spprint"})
        }
      """
    )
  
    // @LINE:103
    def sp1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.sp1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sp1"})
        }
      """
    )
  
    // @LINE:147
    def listEmployeerActvitiy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.listEmployeerActvitiy",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estat/info/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:99
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatisticController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dcps"})
        }
      """
    )
  
  }

  // @LINE:192
  class ReverseDOCController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:195
    def docTableDCPSCombi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableDCPSCombi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableDCPSCombi"})
        }
      """
    )
  
    // @LINE:208
    def docTableTeachingAccordingToPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingAccordingToPerson",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingAccordingToPersons/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:199
    def docTableFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableFieldsOfStudy"})
        }
      """
    )
  
    // @LINE:197
    def docTableCommittee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableCommittee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableCommittee"})
        }
      """
    )
  
    // @LINE:203
    def docTableStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableStudyPlans"})
        }
      """
    )
  
    // @LINE:205
    def docTableTeachingAAA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingAAA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingAAA"})
        }
      """
    )
  
    // @LINE:198
    def docTableEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableEmployees"})
        }
      """
    )
  
    // @LINE:192
    def docTableAccessRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableAccessRole",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableAccessRole"})
        }
      """
    )
  
    // @LINE:202
    def docTableStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableStudyGroups"})
        }
      """
    )
  
    // @LINE:209
    def docTableTeachingCB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingCB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingCB"})
        }
      """
    )
  
    // @LINE:206
    def docTableTeachingAAB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingAAB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingAAB"})
        }
      """
    )
  
    // @LINE:193
    def docTableDCPS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableDCPS",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableDCPS"})
        }
      """
    )
  
    // @LINE:200
    def docTablePublication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTablePublication",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTablePublication"})
        }
      """
    )
  
    // @LINE:194
    def docTableDCPSPres: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableDCPSPres",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableDCPSPres"})
        }
      """
    )
  
    // @LINE:201
    def docTableSPPrint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableSPPrint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableSPPrint"})
        }
      """
    )
  
    // @LINE:207
    def docTableTeachingAccordingToPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingAccordingToPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingAccordingToPersons"})
        }
      """
    )
  
    // @LINE:196
    def docTableClassroom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableClassroom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableClassroom"})
        }
      """
    )
  
    // @LINE:210
    def docTableTeachingDepartmentEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableTeachingDepartmentEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableTeachingDepartmentEmployee"})
        }
      """
    )
  
    // @LINE:204
    def docTableSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DOCController.docTableSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "docTableSubjects"})
        }
      """
    )
  
  }

  // @LINE:161
  class ReverseMethodicsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:162
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "m/saved"})
        }
      """
    )
  
    // @LINE:161
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MethodicsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "m/add"})
        }
      """
    )
  
  }

  // @LINE:120
  class ReverseStudyPlansController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyPlansController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studyplan/saved"})
        }
      """
    )
  
    // @LINE:120
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

  // @LINE:151
  class ReverseTeachersController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:152
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/saved"})
        }
      """
    )
  
    // @LINE:151
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeachersController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teachers/add"})
        }
      """
    )
  
  }

  // @LINE:85
  class ReverseFieldOfStudyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/saved"})
        }
      """
    )
  
    // @LINE:88
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/updated" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:85
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/add"})
        }
      """
    )
  
    // @LINE:87
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FieldOfStudyController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fields/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:172
  class ReversePDFController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:174
    def pdfTableDCPSPres: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableDCPSPres",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableDCPSPres"})
        }
      """
    )
  
    // @LINE:179
    def pdfTableFieldsOfStudy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableFieldsOfStudy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableFieldsOfStudy"})
        }
      """
    )
  
    // @LINE:188
    def pdfTableTeachingAccordingToPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingAccordingToPerson",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingAccordingToPersons/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:172
    def pdfTableAccessRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableAccessRole",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableAccessRole"})
        }
      """
    )
  
    // @LINE:178
    def pdfTableEmployees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableEmployees",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableEmployees"})
        }
      """
    )
  
    // @LINE:183
    def pdfTableStudyPlans: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableStudyPlans",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableStudyPlans"})
        }
      """
    )
  
    // @LINE:175
    def pdfTableDCPSCombi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableDCPSCombi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableDCPSCombi"})
        }
      """
    )
  
    // @LINE:189
    def pdfTableTeachingCB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingCB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingCB"})
        }
      """
    )
  
    // @LINE:173
    def pdfTableDCPS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableDCPS",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableDCPS"})
        }
      """
    )
  
    // @LINE:190
    def pdfTableTeachingDepartmentEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingDepartmentEmployee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingDepartmentEmployee"})
        }
      """
    )
  
    // @LINE:187
    def pdfTableTeachingAccordingToPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingAccordingToPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingAccordingToPersons"})
        }
      """
    )
  
    // @LINE:177
    def pdfTableCommittee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableCommittee",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableCommittee"})
        }
      """
    )
  
    // @LINE:176
    def pdfTableClassroom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableClassroom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableClassroom"})
        }
      """
    )
  
    // @LINE:184
    def pdfTableSubjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableSubjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableSubjects"})
        }
      """
    )
  
    // @LINE:180
    def pdfTablePublication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTablePublication",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTablePublication"})
        }
      """
    )
  
    // @LINE:186
    def pdfTableTeachingAAB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingAAB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingAAB"})
        }
      """
    )
  
    // @LINE:182
    def pdfTableStudyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableStudyGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableStudyGroups"})
        }
      """
    )
  
    // @LINE:185
    def pdfTableTeachingAAA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableTeachingAAA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableTeachingAAA"})
        }
      """
    )
  
    // @LINE:181
    def pdfTableSPPrint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PDFController.pdfTableSPPrint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdfTableSPPrint"})
        }
      """
    )
  
  }

  // @LINE:212
  class ReverseIdeasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:213
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IdeasController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regidea/saved"})
        }
      """
    )
  
    // @LINE:212
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IdeasController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "regidea"})
        }
      """
    )
  
  }

  // @LINE:108
  class ReverseStudyGroupsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:111
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/saved"})
        }
      """
    )
  
    // @LINE:110
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/updated" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:108
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/add"})
        }
      """
    )
  
    // @LINE:109
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StudyGroupsController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "studygroups/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseEmployeesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.edit",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/edit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:55
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.delete",
      """
        function(uid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/delete" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uid", uid0)])})
        }
      """
    )
  
    // @LINE:51
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/saved"})
        }
      """
    )
  
    // @LINE:54
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.update",
      """
        function(uid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updated/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("uid", uid0)])})
        }
      """
    )
  
    // @LINE:52
    def info: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.info",
      """
        function(uid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/info/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:50
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeesController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/register"})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseStatementController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def sendRepairedStatement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendRepairedStatement",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/repaired/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:59
    def sendStatementToEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendStatementToEmployee",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/check/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:60
    def infoStatementToEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.infoStatementToEmployee",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/info/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:66
    def employeeCheckStatement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.employeeCheckStatement",
      """
        function(idE0,idS1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/employeecheck/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:62
    def sendToAgree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendToAgree",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/agree/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:58
    def employeeStatement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.employeeStatement",
      """
        function(uid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/employee/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uid", encodeURIComponent(uid0))})
        }
      """
    )
  
    // @LINE:63
    def sendToRepair: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendToRepair",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/repair/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:57
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statement"})
        }
      """
    )
  
    // @LINE:61
    def sendToVerify: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.sendToVerify",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/ver/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
    // @LINE:65
    def checkRepairStatementToEmployee: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StatementController.checkRepairStatementToEmployee",
      """
        function(idE0,idS1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statement/checkrepaired/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idE", idE0) + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idS", idS1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSalaryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:221
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
  
    // @LINE:223
    def detailsListLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.detailsListLector",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:222
    def printLector: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SalaryController.printLector",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/lector/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:40
  class ReversePublicationsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PublicationsController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "publication/saved"})
        }
      """
    )
  
    // @LINE:40
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
