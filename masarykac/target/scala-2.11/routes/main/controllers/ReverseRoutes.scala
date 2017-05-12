
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Martin/dp/masarykac/conf/routes
// @DATE:Fri May 12 20:30:08 CEST 2017

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

  // @LINE:209
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:209
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
  
    // @LINE:140
    def listTableTeachingAccordingToId(uid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teaching/t/" + implicitly[PathBindable[String]].unbind("uid", dynamicString(uid)))
    }
  
    // @LINE:91
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics")
    }
  
    // @LINE:139
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

  // @LINE:201
  class ReversePrintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:201
    def printUserDetails(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/moje/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:202
    def detailsList(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/moje/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:160
  class ReverseSubjectPlanTeachingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:161
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sub/saved")
    }
  
    // @LINE:160
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

  // @LINE:107
  class ReverseSemestersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:108
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "semester/saved")
    }
  
    // @LINE:107
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

  // @LINE:104
  class ReverseTableController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:119
    def listScheduleInWeeks(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "scheduleinweeks")
    }
  
    // @LINE:132
    def listAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessroles")
    }
  
    // @LINE:109
    def listSemesters(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "semester")
    }
  
    // @LINE:126
    def listCourses(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "courses")
    }
  
    // @LINE:135
    def listTeachersInWeeks(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tiw")
    }
  
    // @LINE:122
    def listEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:131
    def listTeachersRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachroles")
    }
  
    // @LINE:114
    def listStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studyplans")
    }
  
    // @LINE:158
    def listPerson(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:134
    def listPublications(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "publications")
    }
  
    // @LINE:133
    def listCommittees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "committees")
    }
  
    // @LINE:104
    def listStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "studygroups")
    }
  
    // @LINE:127
    def listCurrentSemesters(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "currentsemesters")
    }
  
    // @LINE:128
    def listCurrentSemestersUntilTheEndOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lcsuteos")
    }
  
    // @LINE:129
    def listDays(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "days")
    }
  
    // @LINE:121
    def listSchedule(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "schedule")
    }
  
    // @LINE:125
    def listFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fields")
    }
  
    // @LINE:123
    def listTeachers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "teachers")
    }
  
    // @LINE:124
    def listSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subjects")
    }
  
    // @LINE:130
    def listClassrooms(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "classrooms")
    }
  
  }

  // @LINE:116
  class ReverseCourseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:117
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "courses/saved")
    }
  
    // @LINE:116
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

  
    // @LINE:155
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
  
    // @LINE:198
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

  // @LINE:145
  class ReverseAccessRoleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:149
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/delete" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:147
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessrole/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:148
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/updated/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:146
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accessrole/saved")
    }
  
    // @LINE:145
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

  
    // @LINE:137
    def listEmployeesActvitiy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "estat")
    }
  
    // @LINE:98
    def studyPlansTable(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sp")
    }
  
    // @LINE:99
    def studyPlansTablePrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "spprint")
    }
  
    // @LINE:138
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

  // @LINE:179
  class ReverseDOCController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:183
    def docTableFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableFieldsOfStudy")
    }
  
    // @LINE:181
    def docTableCommittee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableCommittee")
    }
  
    // @LINE:187
    def docTableStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableStudyPlans")
    }
  
    // @LINE:189
    def docTableTeachingAAA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAAA")
    }
  
    // @LINE:182
    def docTableEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableEmployees")
    }
  
    // @LINE:179
    def docTableAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableAccessRole")
    }
  
    // @LINE:186
    def docTableStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableStudyGroups")
    }
  
    // @LINE:192
    def docTableTeachingCB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingCB")
    }
  
    // @LINE:190
    def docTableTeachingAAB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAAB")
    }
  
    // @LINE:184
    def docTablePublication(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTablePublication")
    }
  
    // @LINE:185
    def docTableSPPrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableSPPrint")
    }
  
    // @LINE:191
    def docTableTeachingAccordingToPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingAccordingToPersons")
    }
  
    // @LINE:180
    def docTableClassroom(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableClassroom")
    }
  
    // @LINE:193
    def docTableTeachingDepartmentEmployee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableTeachingDepartmentEmployee")
    }
  
    // @LINE:188
    def docTableSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "docTableSubjects")
    }
  
  }

  // @LINE:152
  class ReverseMethodicsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:153
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "m/saved")
    }
  
    // @LINE:152
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "m/add")
    }
  
  }

  // @LINE:112
  class ReverseStudyPlansController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:113
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "studyplan/saved")
    }
  
    // @LINE:112
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

  // @LINE:142
  class ReverseTeachersController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:143
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "teachers/saved")
    }
  
    // @LINE:142
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

  // @LINE:163
  class ReversePDFController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:167
    def pdfTableFieldsOfStudy(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableFieldsOfStudy")
    }
  
    // @LINE:163
    def pdfTableAccessRole(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableAccessRole")
    }
  
    // @LINE:166
    def pdfTableEmployees(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableEmployees")
    }
  
    // @LINE:171
    def pdfTableStudyPlans(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableStudyPlans")
    }
  
    // @LINE:176
    def pdfTableTeachingCB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingCB")
    }
  
    // @LINE:177
    def pdfTableTeachingDepartmentEmployee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingDepartmentEmployee")
    }
  
    // @LINE:175
    def pdfTableTeachingAccordingToPersons(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAccordingToPersons")
    }
  
    // @LINE:165
    def pdfTableCommittee(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableCommittee")
    }
  
    // @LINE:164
    def pdfTableClassroom(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableClassroom")
    }
  
    // @LINE:172
    def pdfTableSubjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableSubjects")
    }
  
    // @LINE:168
    def pdfTablePublication(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTablePublication")
    }
  
    // @LINE:174
    def pdfTableTeachingAAB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAAB")
    }
  
    // @LINE:170
    def pdfTableStudyGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableStudyGroups")
    }
  
    // @LINE:173
    def pdfTableTeachingAAA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableTeachingAAA")
    }
  
    // @LINE:169
    def pdfTableSPPrint(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pdfTableSPPrint")
    }
  
  }

  // @LINE:195
  class ReverseIdeasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:196
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "regidea/saved")
    }
  
    // @LINE:195
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "regidea")
    }
  
  }

  // @LINE:102
  class ReverseStudyGroupsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:103
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "studygroups/saved")
    }
  
    // @LINE:102
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

  
    // @LINE:204
    def saveLector(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users/lector/saved")
    }
  
    // @LINE:13
    def getPerson(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kpi/k")
    }
  
    // @LINE:206
    def detailsListLector(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/lector/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:205
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
