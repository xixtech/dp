
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Sat May 13 12:31:23 CEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:28
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/saved")
    }
  
    // @LINE:28
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/register")
    }
  
  }

  // @LINE:211
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:211
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:88
  class ReverseCommitteeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:89
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "committee/saved")
    }
  
    // @LINE:88
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "committee/add")
    }
  
  }

  // @LINE:69
  class ReverseSubjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subject/saved")
    }
  
    // @LINE:69
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subject/add")
    }
  
  }

  // @LINE:91
  class ReversePersonalStatisticController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:92
    def teachingAAA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics/aaa")
    }
  
    // @LINE:94
    def teachingCB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics/cb")
    }
  
    // @LINE:93
    def teachingAAB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics/aab")
    }
  
    // @LINE:142
    def listTableTeachingAccordingToId(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teaching/t/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:91
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics")
    }
  
    // @LINE:141
    def listTableTeachingAccordingToPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teaching")
    }
  
  }

  // @LINE:34
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "project/saved")
    }
  
    // @LINE:34
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "project/register")
    }
  
  }

  // @LINE:203
  class ReversePrintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:203
    def printUserDetails(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/moje/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:204
    def detailsList(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/moje/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:162
  class ReverseSubjectPlanTeachingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:163
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sub/saved")
    }
  
    // @LINE:162
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sub/add")
    }
  
  }

  // @LINE:37
  class ReverseFinalWorksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "finalwork/saved")
    }
  
    // @LINE:37
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "finalwork/register")
    }
  
  }

  // @LINE:25
  class ReversePages(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def blank(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pages/blank")
    }
  
  }

  // @LINE:109
  class ReverseSemestersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:110
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "semester/saved")
    }
  
    // @LINE:109
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "semester/add")
    }
  
  }

  // @LINE:10
  class ReverseTestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "test/ok")
    }
  
    // @LINE:10
    def test(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
  }

  // @LINE:72
  class ReverseClassroomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:76
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "classroom/delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:74
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classroom/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:75
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "classroom/updated/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:73
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "classroom/saved")
    }
  
    // @LINE:72
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classroom/add")
    }
  
  }

  // @LINE:19
  class ReverseUiElements(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def panelsAndWells(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/panels-and-wells")
    }
  
    // @LINE:22
    def typography(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/typography")
    }
  
    // @LINE:21
    def notifications(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/notifications")
    }
  
    // @LINE:20
    def buttons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/buttons")
    }
  
    // @LINE:23
    def icons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/icons")
    }
  
    // @LINE:24
    def grid(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui-elements/grid")
    }
  
  }

  // @LINE:31
  class ReverseVisitsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "visit/saved")
    }
  
    // @LINE:31
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "visit/register")
    }
  
  }

  // @LINE:106
  class ReverseTableController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def listScheduleInWeeks(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scheduleinweeks")
    }
  
    // @LINE:134
    def listAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessroles")
    }
  
    // @LINE:111
    def listSemesters(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "semester")
    }
  
    // @LINE:128
    def listCourses(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "courses")
    }
  
    // @LINE:137
    def listTeachersInWeeks(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tiw")
    }
  
    // @LINE:124
    def listEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:133
    def listTeachersRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachroles")
    }
  
    // @LINE:116
    def listStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studyplans")
    }
  
    // @LINE:160
    def listPerson(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:136
    def listPublications(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publications")
    }
  
    // @LINE:135
    def listCommittees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "committees")
    }
  
    // @LINE:106
    def listStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studygroups")
    }
  
    // @LINE:129
    def listCurrentSemesters(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "currentsemesters")
    }
  
    // @LINE:130
    def listCurrentSemestersUntilTheEndOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lcsuteos")
    }
  
    // @LINE:131
    def listDays(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "days")
    }
  
    // @LINE:123
    def listSchedule(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "schedule")
    }
  
    // @LINE:127
    def listFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fields")
    }
  
    // @LINE:125
    def listTeachers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachers")
    }
  
    // @LINE:126
    def listSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subjects")
    }
  
    // @LINE:132
    def listClassrooms(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classrooms")
    }
  
  }

  // @LINE:118
  class ReverseCourseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:119
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "courses/saved")
    }
  
    // @LINE:118
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "courses/add")
    }
  
  }

  // @LINE:14
  class ReverseLogin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:15
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:78
  class ReverseTeachersRoleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "teachersrole/delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:80
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachersrole/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:81
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "teachersrole/updated/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:79
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "teachersrole/saved")
    }
  
    // @LINE:78
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachersrole/add")
    }
  
  }

  // @LINE:43
  class ReverseOrganizationalUnitsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def indexParticipants(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "oup/register")
    }
  
    // @LINE:47
    def saveParticipants(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "oup/saved")
    }
  
    // @LINE:44
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ou/saved")
    }
  
    // @LINE:43
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ou/register")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:157
    def roles(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "roles")
    }
  
    // @LINE:18
    def forms(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "forms")
    }
  
    // @LINE:6
    def dashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def raw(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "raw")
    }
  
    // @LINE:12
    def kpiChoosePerson(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "kpi")
    }
  
    // @LINE:7
    def pdf(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdf")
    }
  
    // @LINE:200
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:9
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:147
  class ReverseAccessRoleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:151
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:149
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessrole/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:150
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/updated/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:148
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/saved")
    }
  
    // @LINE:147
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessrole/add")
    }
  
  }

  // @LINE:97
  class ReverseStatisticController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:139
    def listEmployeesActvitiy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estat")
    }
  
    // @LINE:98
    def studyPlansTable(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sp")
    }
  
    // @LINE:101
    def studyPlansTablePrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "spprint")
    }
  
    // @LINE:99
    def sp1(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sp1")
    }
  
    // @LINE:140
    def listEmployeerActvitiy(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estat/info/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:97
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dcps")
    }
  
  }

  // @LINE:181
  class ReverseDOCController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:185
    def docTableFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableFieldsOfStudy")
    }
  
    // @LINE:183
    def docTableCommittee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableCommittee")
    }
  
    // @LINE:189
    def docTableStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableStudyPlans")
    }
  
    // @LINE:191
    def docTableTeachingAAA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAAA")
    }
  
    // @LINE:184
    def docTableEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableEmployees")
    }
  
    // @LINE:181
    def docTableAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableAccessRole")
    }
  
    // @LINE:188
    def docTableStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableStudyGroups")
    }
  
    // @LINE:194
    def docTableTeachingCB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingCB")
    }
  
    // @LINE:192
    def docTableTeachingAAB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAAB")
    }
  
    // @LINE:186
    def docTablePublication(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTablePublication")
    }
  
    // @LINE:187
    def docTableSPPrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableSPPrint")
    }
  
    // @LINE:193
    def docTableTeachingAccordingToPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAccordingToPersons")
    }
  
    // @LINE:182
    def docTableClassroom(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableClassroom")
    }
  
    // @LINE:195
    def docTableTeachingDepartmentEmployee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingDepartmentEmployee")
    }
  
    // @LINE:190
    def docTableSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableSubjects")
    }
  
  }

  // @LINE:154
  class ReverseMethodicsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:155
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "m/saved")
    }
  
    // @LINE:154
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "m/add")
    }
  
  }

  // @LINE:114
  class ReverseStudyPlansController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:115
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "studyplan/saved")
    }
  
    // @LINE:114
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studyplan/add")
    }
  
  }

  // @LINE:16
  class ReverseCharts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def flot(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "charts/flot")
    }
  
    // @LINE:17
    def morris(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "charts/morris")
    }
  
  }

  // @LINE:144
  class ReverseTeachersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:145
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "teachers/saved")
    }
  
    // @LINE:144
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachers/add")
    }
  
  }

  // @LINE:85
  class ReverseFieldOfStudyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:86
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "fields/saved")
    }
  
    // @LINE:85
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fields/add")
    }
  
  }

  // @LINE:165
  class ReversePDFController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:169
    def pdfTableFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableFieldsOfStudy")
    }
  
    // @LINE:165
    def pdfTableAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableAccessRole")
    }
  
    // @LINE:168
    def pdfTableEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableEmployees")
    }
  
    // @LINE:173
    def pdfTableStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableStudyPlans")
    }
  
    // @LINE:178
    def pdfTableTeachingCB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingCB")
    }
  
    // @LINE:179
    def pdfTableTeachingDepartmentEmployee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingDepartmentEmployee")
    }
  
    // @LINE:177
    def pdfTableTeachingAccordingToPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAccordingToPersons")
    }
  
    // @LINE:167
    def pdfTableCommittee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableCommittee")
    }
  
    // @LINE:166
    def pdfTableClassroom(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableClassroom")
    }
  
    // @LINE:174
    def pdfTableSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableSubjects")
    }
  
    // @LINE:170
    def pdfTablePublication(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTablePublication")
    }
  
    // @LINE:176
    def pdfTableTeachingAAB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAAB")
    }
  
    // @LINE:172
    def pdfTableStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableStudyGroups")
    }
  
    // @LINE:175
    def pdfTableTeachingAAA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAAA")
    }
  
    // @LINE:171
    def pdfTableSPPrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableSPPrint")
    }
  
  }

  // @LINE:197
  class ReverseIdeasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:198
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "regidea/saved")
    }
  
    // @LINE:197
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "regidea")
    }
  
  }

  // @LINE:104
  class ReverseStudyGroupsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:105
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "studygroups/saved")
    }
  
    // @LINE:104
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studygroups/add")
    }
  
  }

  // @LINE:50
  class ReverseEmployeesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:53
    def edit(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employee/edit/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:55
    def delete(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "employee/delete" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uid", uid)))))
    }
  
    // @LINE:51
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "employee/saved")
    }
  
    // @LINE:54
    def update(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "employee/updated/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("uid", uid)))))
    }
  
    // @LINE:52
    def info(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employee/info/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:50
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employee/register")
    }
  
  }

  // @LINE:57
  class ReverseStatementController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def sendRepairedStatement(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/repaired/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:59
    def sendStatementToEmployee(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/check/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:60
    def infoStatementToEmployee(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/info/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:66
    def employeeCheckStatement(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statement/employeecheck/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:62
    def sendToAgree(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/agree/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:58
    def employeeStatement(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/employee/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:63
    def sendToRepair(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/repair/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:57
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statement")
    }
  
    // @LINE:61
    def sendToVerify(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/ver/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
    // @LINE:65
    def checkRepairStatementToEmployee(idE:Long, idS:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statement/checkrepaired/" + implicitly[PathBindable[Long]].unbind("idE", idE) + implicitly[PathBindable[Long]].unbind("idS", idS))
    }
  
  }

  // @LINE:13
  class ReverseSalaryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:206
    def saveLector(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/lector/saved")
    }
  
    // @LINE:13
    def getPerson(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kpi/k")
    }
  
    // @LINE:208
    def detailsListLector(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/lector/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:207
    def printLector(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/lector/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:40
  class ReversePublicationsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "publication/saved")
    }
  
    // @LINE:40
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publication/register")
    }
  
  }


}
