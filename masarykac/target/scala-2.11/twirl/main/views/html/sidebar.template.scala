
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sidebar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class sidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">

            <li>
                <a href='"""),_display_(/*7.27*/routes/*7.33*/.Application.dashboard),format.raw/*7.55*/("""'>
                    <i class="fa fa-dashboard fa-fw"></i> Nástěnka
                </a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Osobní údaje<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.PersonalStatisticController.index()),format.raw/*15.77*/("""">Výuka dle oddělení a osob</a>
                        <a href='"""),_display_(/*16.35*/routes/*16.41*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*16.107*/("""'>Výuka dle osob</a>
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.PersonalStatisticController.teachingAAA()),format.raw/*17.83*/("""">Výuka AAA</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.PersonalStatisticController.teachingAAB()),format.raw/*18.83*/("""">Výuka AAB</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.PersonalStatisticController.teachingCB()),format.raw/*19.82*/("""">Výuka CB</a>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.StatisticController.index()),format.raw/*20.69*/("""">Zobrazit DČPS</a>
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.studyPlansTable()),format.raw/*21.79*/("""">Zobrazit SP</a>

                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.EmployeesController.info(session().get("email"))),format.raw/*23.90*/("""">Info</a>
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*24.107*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*26.35*/routes/*26.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("email"))),format.raw/*26.124*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*35.14*/if(session().get("role").equals("director"))/*35.58*/ {_display_(Seq[Any](format.raw/*35.60*/("""
                """),format.raw/*36.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*38.22*/if(session().get("role").equals("director"))/*38.66*/ {_display_(Seq[Any](format.raw/*38.68*/("""
                        """),format.raw/*39.25*/("""<li>
                            <a href='"""),_display_(/*40.39*/routes/*40.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*40.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*43.22*/("""

                    """),_display_(/*45.22*/if(session().get("role").equals("director"))/*45.66*/ {_display_(Seq[Any](format.raw/*45.68*/("""
                        """),format.raw/*46.25*/("""<li>
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*47.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director"))/*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.TableController.listPerson()),format.raw/*53.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director"))/*57.66*/ {_display_(Seq[Any](format.raw/*57.68*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.TableController.listStudyPlans()),format.raw/*59.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director"))/*63.66*/ {_display_(Seq[Any](format.raw/*63.68*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.TableController.listScheduleInWeeks()),format.raw/*65.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""
                    """),_display_(/*69.22*/if(session().get("role").equals("director"))/*69.66*/ {_display_(Seq[Any](format.raw/*69.68*/("""
                        """),format.raw/*70.25*/("""<li>
                            <a href='"""),_display_(/*71.39*/routes/*71.45*/.TableController.listSchedule()),format.raw/*71.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*74.22*/("""
                    """),_display_(/*75.22*/if(session().get("role").equals("director"))/*75.66*/ {_display_(Seq[Any](format.raw/*75.68*/("""
                        """),format.raw/*76.25*/("""<li>
                            <a href='"""),_display_(/*77.39*/routes/*77.45*/.TableController.listEmployees()),format.raw/*77.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*80.22*/("""
                    """),_display_(/*81.22*/if(session().get("role").equals("director"))/*81.66*/ {_display_(Seq[Any](format.raw/*81.68*/("""
                        """),format.raw/*82.25*/("""<li>
                            <a href='"""),_display_(/*83.39*/routes/*83.45*/.TableController.listTeachers()),format.raw/*83.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*86.22*/("""
                    """),_display_(/*87.22*/if(session().get("role").equals("director"))/*87.66*/ {_display_(Seq[Any](format.raw/*87.68*/("""
                        """),format.raw/*88.25*/("""<li>
                            <a href='"""),_display_(/*89.39*/routes/*89.45*/.TableController.listStudyGroups()),format.raw/*89.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(session().get("role").equals("director"))/*93.66*/ {_display_(Seq[Any](format.raw/*93.68*/("""
                        """),format.raw/*94.25*/("""<li>
                            <a href='"""),_display_(/*95.39*/routes/*95.45*/.TableController.listSemesters()),format.raw/*95.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*98.22*/("""
                    """),_display_(/*99.22*/if(session().get("role").equals("director"))/*99.66*/ {_display_(Seq[Any](format.raw/*99.68*/("""
                        """),format.raw/*100.25*/("""<li>
                            <a href='"""),_display_(/*101.39*/routes/*101.45*/.TableController.listSubjects()),format.raw/*101.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*104.22*/("""
                    """),_display_(/*105.22*/if(session().get("role").equals("director"))/*105.66*/ {_display_(Seq[Any](format.raw/*105.68*/("""
                        """),format.raw/*106.25*/("""<li>
                            <a href='"""),_display_(/*107.39*/routes/*107.45*/.TableController.listFieldsOfStudy()),format.raw/*107.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*110.22*/("""
                    """),_display_(/*111.22*/if(session().get("role").equals("director"))/*111.66*/ {_display_(Seq[Any](format.raw/*111.68*/("""
                        """),format.raw/*112.25*/("""<li>
                            <a href='"""),_display_(/*113.39*/routes/*113.45*/.TableController.listCourses()),format.raw/*113.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*115.22*/("""
                    """),_display_(/*116.22*/if(session().get("role").equals("director"))/*116.66*/ {_display_(Seq[Any](format.raw/*116.68*/("""
                        """),format.raw/*117.25*/("""<li>
                            <a href='"""),_display_(/*118.39*/routes/*118.45*/.TableController.listCurrentSemesters()),format.raw/*118.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director"))/*122.66*/ {_display_(Seq[Any](format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*124.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director"))/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listDays()),format.raw/*130.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*132.22*/("""
                    """),_display_(/*133.22*/if(session().get("role").equals("director"))/*133.66*/ {_display_(Seq[Any](format.raw/*133.68*/("""
                        """),format.raw/*134.25*/("""<li>
                            <a href='"""),_display_(/*135.39*/routes/*135.45*/.TableController.listCommittees()),format.raw/*135.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director"))/*139.66*/ {_display_(Seq[Any](format.raw/*139.68*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href='"""),_display_(/*141.39*/routes/*141.45*/.TableController.listPublications()),format.raw/*141.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listTeachersInWeeks()),format.raw/*147.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*150.22*/("""
                """),format.raw/*151.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*153.14*/("""
            """),format.raw/*154.13*/("""</li>
            <li>
            """),_display_(/*156.14*/if(session().get("role").equals("director"))/*156.58*/ {_display_(Seq[Any](format.raw/*156.60*/("""
                """),format.raw/*157.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*159.22*/if(session().get("role").equals("director"))/*159.66*/ {_display_(Seq[Any](format.raw/*159.68*/("""
                        """),format.raw/*160.25*/("""<li>
                            <a href=""""),_display_(/*161.39*/routes/*161.45*/.Pages.blank),format.raw/*161.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director"))/*164.66*/ {_display_(Seq[Any](format.raw/*164.68*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href=""""),_display_(/*166.39*/routes/*166.45*/.Application.pdf()),format.raw/*166.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*168.22*/("""
                    """),_display_(/*169.22*/if(session().get("role").equals("director"))/*169.66*/ {_display_(Seq[Any](format.raw/*169.68*/("""
                        """),format.raw/*170.25*/("""<li>
                            <a href=""""),_display_(/*171.39*/routes/*171.45*/.Application.raw()),format.raw/*171.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*173.22*/("""
                    """),_display_(/*174.22*/if(session().get("role").equals("director"))/*174.66*/ {_display_(Seq[Any](format.raw/*174.68*/("""
                        """),format.raw/*175.25*/("""<li>
                            <a href=""""),_display_(/*176.39*/routes/*176.45*/.TestController.test()),format.raw/*176.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*178.22*/("""
                    """),_display_(/*179.22*/if(session().get("role").equals("director"))/*179.66*/ {_display_(Seq[Any](format.raw/*179.68*/("""
                        """),format.raw/*180.25*/("""<li>
                            <a href=""""),_display_(/*181.39*/routes/*181.45*/.SubjectPlanTeachingController.index()),format.raw/*181.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*183.22*/("""
                    """),_display_(/*184.22*/if(session().get("role").equals("director"))/*184.66*/ {_display_(Seq[Any](format.raw/*184.68*/("""
                        """),format.raw/*185.25*/("""<li>
                            <a href=""""),_display_(/*186.39*/routes/*186.45*/.VisitsController.index()),format.raw/*186.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(session().get("role").equals("director"))/*189.66*/ {_display_(Seq[Any](format.raw/*189.68*/("""
                        """),format.raw/*190.25*/("""<li>
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.ProjectController.index()),format.raw/*191.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""
                    """),_display_(/*194.22*/if(session().get("role").equals("director"))/*194.66*/ {_display_(Seq[Any](format.raw/*194.68*/("""
                        """),format.raw/*195.25*/("""<li>
                            <a href=""""),_display_(/*196.39*/routes/*196.45*/.CommitteeController.index()),format.raw/*196.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*198.22*/("""
                    """),_display_(/*199.22*/if(session().get("role").equals("director"))/*199.66*/ {_display_(Seq[Any](format.raw/*199.68*/("""
                        """),format.raw/*200.25*/("""<li>
                            <a href=""""),_display_(/*201.39*/routes/*201.45*/.PublicationsController.index()),format.raw/*201.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*203.22*/("""
                    """),_display_(/*204.22*/if(session().get("role").equals("director"))/*204.66*/ {_display_(Seq[Any](format.raw/*204.68*/("""
                        """),format.raw/*205.25*/("""<li>
                            <a href=""""),_display_(/*206.39*/routes/*206.45*/.OrganizationalUnitsController.index()),format.raw/*206.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*208.22*/("""
                    """),_display_(/*209.22*/if(session().get("role").equals("director"))/*209.66*/ {_display_(Seq[Any](format.raw/*209.68*/("""
                        """),format.raw/*210.25*/("""<li>
                            <a href=""""),_display_(/*211.39*/routes/*211.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*211.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*213.22*/("""
                    """),_display_(/*214.22*/if(session().get("role").equals("director"))/*214.66*/ {_display_(Seq[Any](format.raw/*214.68*/("""
                        """),format.raw/*215.25*/("""<li>
                            <a href=""""),_display_(/*216.39*/routes/*216.45*/.FinalWorksController.index()),format.raw/*216.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*218.22*/("""
                    """),_display_(/*219.22*/if(session().get("role").equals("director"))/*219.66*/ {_display_(Seq[Any](format.raw/*219.68*/("""
                        """),format.raw/*220.25*/("""<li>
                            <a href=""""),_display_(/*221.39*/routes/*221.45*/.Application.kpiChoosePerson()),format.raw/*221.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*223.22*/("""
                    """),_display_(/*224.22*/if(session().get("role").equals("director"))/*224.66*/ {_display_(Seq[Any](format.raw/*224.68*/("""
                        """),format.raw/*225.25*/("""<li>
                            <a href=""""),_display_(/*226.39*/routes/*226.45*/.Application.roles()),format.raw/*226.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*228.22*/("""
                    """),_display_(/*229.22*/if(session().get("role").equals("director"))/*229.66*/ {_display_(Seq[Any](format.raw/*229.68*/("""
                        """),format.raw/*230.25*/("""<li>
                            <a href=""""),_display_(/*231.39*/routes/*231.45*/.PersonController.index()),format.raw/*231.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*233.22*/("""
                    """),_display_(/*234.22*/if(session().get("role").equals("director"))/*234.66*/ {_display_(Seq[Any](format.raw/*234.68*/("""
                        """),format.raw/*235.25*/("""<li>
                            <a href=""""),_display_(/*236.39*/routes/*236.45*/.EmployeesController.index()),format.raw/*236.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*238.22*/("""

                    """),_display_(/*240.22*/if(session().get("role").equals("director"))/*240.66*/ {_display_(Seq[Any](format.raw/*240.68*/("""
                        """),format.raw/*241.25*/("""<li>
                            <a href=""""),_display_(/*242.39*/routes/*242.45*/.SubjectController.index()),format.raw/*242.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*244.22*/("""

                    """),_display_(/*246.22*/if(session().get("role").equals("director"))/*246.66*/ {_display_(Seq[Any](format.raw/*246.68*/("""
                        """),format.raw/*247.25*/("""<li>
                            <a href=""""),_display_(/*248.39*/routes/*248.45*/.FieldOfStudyController.index()),format.raw/*248.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*250.22*/("""
                    """),_display_(/*251.22*/if(session().get("role").equals("director"))/*251.66*/ {_display_(Seq[Any](format.raw/*251.68*/("""
                        """),format.raw/*252.25*/("""<li>
                            <a href=""""),_display_(/*253.39*/routes/*253.45*/.StudyGroupsController.index()),format.raw/*253.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*255.22*/("""
                    """),_display_(/*256.22*/if(session().get("role").equals("director"))/*256.66*/ {_display_(Seq[Any](format.raw/*256.68*/("""
                        """),format.raw/*257.25*/("""<li>
                            <a href=""""),_display_(/*258.39*/routes/*258.45*/.SemestersController.index()),format.raw/*258.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*260.22*/("""
                    """),_display_(/*261.22*/if(session().get("role").equals("director"))/*261.66*/ {_display_(Seq[Any](format.raw/*261.68*/("""
                        """),format.raw/*262.25*/("""<li>
                            <a href=""""),_display_(/*263.39*/routes/*263.45*/.StudyPlansController.index()),format.raw/*263.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*265.22*/("""
                    """),_display_(/*266.22*/if(session().get("role").equals("director"))/*266.66*/ {_display_(Seq[Any](format.raw/*266.68*/("""
                        """),format.raw/*267.25*/("""<li>
                            <a href=""""),_display_(/*268.39*/routes/*268.45*/.TeachersController.index()),format.raw/*268.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*270.22*/("""
                    """),_display_(/*271.22*/if(session().get("role").equals("director"))/*271.66*/ {_display_(Seq[Any](format.raw/*271.68*/("""
                        """),format.raw/*272.25*/("""<li>
                            <a href=""""),_display_(/*273.39*/routes/*273.45*/.CourseController.index()),format.raw/*273.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*275.22*/("""

                """),format.raw/*277.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*279.14*/("""
            """),format.raw/*280.13*/("""</li>
            <li>
            """),_display_(/*282.14*/if(session().get("role").equals("director"))/*282.58*/ {_display_(Seq[Any](format.raw/*282.60*/("""
                """),format.raw/*283.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*285.18*/if(session().get("role").equals("director"))/*285.62*/ {_display_(Seq[Any](format.raw/*285.64*/("""
                    """),format.raw/*286.21*/("""<li>
                        <a href=""""),_display_(/*287.35*/routes/*287.41*/.MethodicsController.index()),format.raw/*287.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*289.18*/("""
                """),format.raw/*290.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*292.14*/("""
            """),format.raw/*293.13*/("""</li>
            <li>
            """),_display_(/*295.14*/if(session().get("role").equals("director"))/*295.58*/ {_display_(Seq[Any](format.raw/*295.60*/("""
                """),format.raw/*296.17*/("""<a href='"""),_display_(/*296.27*/routes/*296.33*/.Application.forms),format.raw/*296.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*297.14*/("""
            """),format.raw/*298.13*/("""</li>
            <li>
            """),_display_(/*300.14*/if(session().get("role").equals("director"))/*300.58*/ {_display_(Seq[Any](format.raw/*300.60*/("""
                """),format.raw/*301.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*304.35*/routes/*304.41*/.UiElements.panelsAndWells),format.raw/*304.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*307.35*/routes/*307.41*/.UiElements.buttons),format.raw/*307.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*310.35*/routes/*310.41*/.UiElements.notifications),format.raw/*310.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*313.35*/routes/*313.41*/.UiElements.typography),format.raw/*313.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*316.35*/routes/*316.41*/.UiElements.icons),format.raw/*316.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*319.35*/routes/*319.41*/.UiElements.grid),format.raw/*319.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*323.14*/("""
            """),format.raw/*324.13*/("""</li>
            <li>
            """),_display_(/*326.14*/if(session().get("role").equals("director"))/*326.58*/ {_display_(Seq[Any](format.raw/*326.60*/("""
                """),format.raw/*327.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
                    Multi-Level Dropdown<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Third Level <span class="fa arrow"></span></a>
                        <ul class="nav nav-third-level">
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                        </ul>
                            <!-- /.nav-third-level -->
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*356.14*/("""
            """),format.raw/*357.13*/("""</li>
            <li>
            """),_display_(/*359.14*/if(session().get("role").equals("director"))/*359.58*/ {_display_(Seq[Any](format.raw/*359.60*/("""
                """),format.raw/*360.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*365.35*/routes/*365.41*/.Charts.flot),format.raw/*365.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*368.35*/routes/*368.41*/.Charts.morris),format.raw/*368.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*372.14*/("""
            """),format.raw/*373.13*/("""</li>

        </ul>
    </div>
        <!-- /.sidebar-collapse -->
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object sidebar extends sidebar_Scope0.sidebar
              /*
                  -- GENERATED --
                  DATE: Sat Apr 29 14:56:56 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: a67f300feb1c954294048df76258d846ceecad87
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1670->671|1685->677|1773->743|1855->798|1870->804|1933->846|2010->896|2025->902|2088->944|2165->994|2180->1000|2242->1041|2318->1090|2333->1096|2382->1124|2463->1178|2478->1184|2537->1222|2617->1275|2632->1281|2702->1330|2774->1375|2789->1381|2877->1447|3006->1549|3021->1555|3126->1638|3343->1828|3396->1872|3436->1874|3481->1891|3666->2049|3719->2093|3759->2095|3812->2120|3882->2163|3897->2169|3985->2235|4154->2373|4204->2396|4257->2440|4297->2442|4350->2467|4420->2510|4435->2516|4500->2560|4689->2718|4738->2740|4791->2784|4831->2786|4884->2811|4954->2854|4969->2860|5019->2889|5184->3023|5233->3045|5286->3089|5326->3091|5379->3116|5449->3159|5464->3165|5518->3198|5687->3336|5736->3358|5789->3402|5829->3404|5882->3429|5952->3472|5967->3478|6026->3516|6197->3656|6246->3678|6299->3722|6339->3724|6392->3749|6462->3792|6477->3798|6529->3829|6690->3959|6739->3981|6792->4025|6832->4027|6885->4052|6955->4095|6970->4101|7023->4133|7189->4268|7238->4290|7291->4334|7331->4336|7384->4361|7454->4404|7469->4410|7521->4441|7685->4574|7734->4596|7787->4640|7827->4642|7880->4667|7950->4710|7965->4716|8020->4750|8191->4890|8240->4912|8293->4956|8333->4958|8386->4983|8456->5026|8471->5032|8524->5064|8687->5196|8736->5218|8789->5262|8829->5264|8883->5289|8954->5332|8970->5338|9023->5369|9187->5501|9237->5523|9291->5567|9332->5569|9386->5594|9457->5637|9473->5643|9531->5679|9692->5808|9742->5830|9796->5874|9837->5876|9891->5901|9962->5944|9978->5950|10030->5980|10159->6077|10209->6099|10263->6143|10304->6145|10358->6170|10429->6213|10445->6219|10506->6258|10679->6399|10729->6421|10783->6465|10824->6467|10878->6492|10949->6535|10965->6541|11045->6598|11234->6755|11284->6777|11338->6821|11379->6823|11433->6848|11504->6891|11520->6897|11569->6924|11696->7019|11746->7041|11800->7085|11841->7087|11895->7112|11966->7155|11982->7161|12037->7194|12199->7324|12249->7346|12303->7390|12344->7392|12398->7417|12469->7460|12485->7466|12542->7501|12707->7634|12757->7656|12811->7700|12852->7702|12906->7727|12977->7770|12993->7776|13053->7814|13226->7955|13272->7972|13371->8039|13413->8052|13477->8088|13531->8132|13572->8134|13618->8151|13813->8318|13867->8362|13908->8364|13962->8389|14033->8432|14049->8438|14083->8450|14183->8518|14233->8540|14287->8584|14328->8586|14382->8611|14453->8654|14469->8660|14509->8678|14602->8739|14652->8761|14706->8805|14747->8807|14801->8832|14872->8875|14888->8881|14928->8899|15026->8965|15076->8987|15130->9031|15171->9033|15225->9058|15296->9101|15312->9107|15356->9129|15450->9191|15500->9213|15554->9257|15595->9259|15649->9284|15720->9327|15736->9333|15796->9371|15911->9454|15961->9476|16015->9520|16056->9522|16110->9547|16181->9590|16197->9596|16244->9621|16352->9697|16402->9719|16456->9763|16497->9765|16551->9790|16622->9833|16638->9839|16686->9865|16795->9942|16845->9964|16899->10008|16940->10010|16994->10035|17065->10078|17081->10084|17131->10112|17238->10187|17288->10209|17342->10253|17383->10255|17437->10280|17508->10323|17524->10329|17577->10360|17687->10438|17737->10460|17791->10504|17832->10506|17886->10531|17957->10574|17973->10580|18033->10618|18154->10707|18204->10729|18258->10773|18299->10775|18353->10800|18424->10843|18440->10849|18512->10899|18616->10971|18666->10993|18720->11037|18761->11039|18815->11064|18886->11107|18902->11113|18953->11142|19069->11226|19119->11248|19173->11292|19214->11294|19268->11319|19339->11362|19355->11368|19407->11398|19512->11471|19562->11493|19616->11537|19657->11539|19711->11564|19782->11607|19798->11613|19840->11633|19934->11695|19984->11717|20038->11761|20079->11763|20133->11788|20204->11831|20220->11837|20267->11862|20373->11936|20423->11958|20477->12002|20518->12004|20572->12029|20643->12072|20659->12078|20709->12106|20821->12186|20872->12209|20926->12253|20967->12255|21021->12280|21092->12323|21108->12329|21156->12355|21265->12432|21316->12455|21370->12499|21411->12501|21465->12526|21536->12569|21552->12575|21605->12606|21711->12680|21761->12702|21815->12746|21856->12748|21910->12773|21981->12816|21997->12822|22049->12852|22157->12928|22207->12950|22261->12994|22302->12996|22356->13021|22427->13064|22443->13070|22493->13098|22602->13175|22652->13197|22706->13241|22747->13243|22801->13268|22872->13311|22888->13317|22939->13346|23056->13431|23106->13453|23160->13497|23201->13499|23255->13524|23326->13567|23342->13573|23391->13600|23499->13676|23549->13698|23603->13742|23644->13744|23698->13769|23769->13812|23785->13818|23832->13843|23938->13917|23985->13935|24084->14002|24126->14015|24190->14051|24244->14095|24285->14097|24331->14114|24517->14272|24571->14316|24612->14318|24662->14339|24729->14378|24745->14384|24795->14412|24892->14477|24938->14494|25037->14561|25079->14574|25143->14610|25197->14654|25238->14656|25284->14673|25322->14683|25338->14689|25378->14707|25472->14769|25514->14782|25578->14818|25632->14862|25673->14864|25719->14881|25946->15080|25962->15086|26010->15112|26146->15220|26162->15226|26203->15245|26330->15344|26346->15350|26393->15375|26526->15480|26542->15486|26586->15508|26716->15610|26732->15616|26771->15633|26897->15731|26913->15737|26951->15753|27103->15873|27145->15886|27209->15922|27263->15966|27304->15968|27350->15985|28660->17263|28702->17276|28766->17312|28820->17356|28861->17358|28907->17375|29174->17614|29190->17620|29224->17632|29355->17735|29371->17741|29407->17755|29571->17887|29613->17900
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|71->40|71->40|71->40|74->43|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|105->74|106->75|106->75|106->75|107->76|108->77|108->77|108->77|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|117->86|118->87|118->87|118->87|119->88|120->89|120->89|120->89|123->92|124->93|124->93|124->93|125->94|126->95|126->95|126->95|129->98|130->99|130->99|130->99|131->100|132->101|132->101|132->101|135->104|136->105|136->105|136->105|137->106|138->107|138->107|138->107|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|166->135|166->135|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|181->150|182->151|184->153|185->154|187->156|187->156|187->156|188->157|190->159|190->159|190->159|191->160|192->161|192->161|192->161|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|199->168|200->169|200->169|200->169|201->170|202->171|202->171|202->171|204->173|205->174|205->174|205->174|206->175|207->176|207->176|207->176|209->178|210->179|210->179|210->179|211->180|212->181|212->181|212->181|214->183|215->184|215->184|215->184|216->185|217->186|217->186|217->186|219->188|220->189|220->189|220->189|221->190|222->191|222->191|222->191|224->193|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|230->199|230->199|230->199|231->200|232->201|232->201|232->201|234->203|235->204|235->204|235->204|236->205|237->206|237->206|237->206|239->208|240->209|240->209|240->209|241->210|242->211|242->211|242->211|244->213|245->214|245->214|245->214|246->215|247->216|247->216|247->216|249->218|250->219|250->219|250->219|251->220|252->221|252->221|252->221|254->223|255->224|255->224|255->224|256->225|257->226|257->226|257->226|259->228|260->229|260->229|260->229|261->230|262->231|262->231|262->231|264->233|265->234|265->234|265->234|266->235|267->236|267->236|267->236|269->238|271->240|271->240|271->240|272->241|273->242|273->242|273->242|275->244|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|297->266|297->266|297->266|298->267|299->268|299->268|299->268|301->270|302->271|302->271|302->271|303->272|304->273|304->273|304->273|306->275|308->277|310->279|311->280|313->282|313->282|313->282|314->283|316->285|316->285|316->285|317->286|318->287|318->287|318->287|320->289|321->290|323->292|324->293|326->295|326->295|326->295|327->296|327->296|327->296|327->296|328->297|329->298|331->300|331->300|331->300|332->301|335->304|335->304|335->304|338->307|338->307|338->307|341->310|341->310|341->310|344->313|344->313|344->313|347->316|347->316|347->316|350->319|350->319|350->319|354->323|355->324|357->326|357->326|357->326|358->327|387->356|388->357|390->359|390->359|390->359|391->360|396->365|396->365|396->365|399->368|399->368|399->368|403->372|404->373
                  -- GENERATED --
              */
          