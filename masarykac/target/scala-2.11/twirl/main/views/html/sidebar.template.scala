
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
                            <a href='"""),_display_(/*40.39*/routes/*40.45*/.TableController.listClassrooms()),format.raw/*40.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*43.22*/("""
                    """),_display_(/*44.22*/if(session().get("role").equals("director"))/*44.66*/ {_display_(Seq[Any](format.raw/*44.68*/("""
                        """),format.raw/*45.25*/("""<li>
                            <a href='"""),_display_(/*46.39*/routes/*46.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*46.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*49.22*/("""

                    """),_display_(/*51.22*/if(session().get("role").equals("director"))/*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*53.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director"))/*57.66*/ {_display_(Seq[Any](format.raw/*57.68*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.TableController.listPerson()),format.raw/*59.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director"))/*63.66*/ {_display_(Seq[Any](format.raw/*63.68*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.TableController.listStudyPlans()),format.raw/*65.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""
                    """),_display_(/*69.22*/if(session().get("role").equals("director"))/*69.66*/ {_display_(Seq[Any](format.raw/*69.68*/("""
                        """),format.raw/*70.25*/("""<li>
                            <a href='"""),_display_(/*71.39*/routes/*71.45*/.TableController.listScheduleInWeeks()),format.raw/*71.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*74.22*/("""
                    """),_display_(/*75.22*/if(session().get("role").equals("director"))/*75.66*/ {_display_(Seq[Any](format.raw/*75.68*/("""
                        """),format.raw/*76.25*/("""<li>
                            <a href='"""),_display_(/*77.39*/routes/*77.45*/.TableController.listSchedule()),format.raw/*77.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*80.22*/("""
                    """),_display_(/*81.22*/if(session().get("role").equals("director"))/*81.66*/ {_display_(Seq[Any](format.raw/*81.68*/("""
                        """),format.raw/*82.25*/("""<li>
                            <a href='"""),_display_(/*83.39*/routes/*83.45*/.TableController.listEmployees()),format.raw/*83.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*86.22*/("""
                    """),_display_(/*87.22*/if(session().get("role").equals("director"))/*87.66*/ {_display_(Seq[Any](format.raw/*87.68*/("""
                        """),format.raw/*88.25*/("""<li>
                            <a href='"""),_display_(/*89.39*/routes/*89.45*/.TableController.listTeachers()),format.raw/*89.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(session().get("role").equals("director"))/*93.66*/ {_display_(Seq[Any](format.raw/*93.68*/("""
                        """),format.raw/*94.25*/("""<li>
                            <a href='"""),_display_(/*95.39*/routes/*95.45*/.TableController.listStudyGroups()),format.raw/*95.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*98.22*/("""
                    """),_display_(/*99.22*/if(session().get("role").equals("director"))/*99.66*/ {_display_(Seq[Any](format.raw/*99.68*/("""
                        """),format.raw/*100.25*/("""<li>
                            <a href='"""),_display_(/*101.39*/routes/*101.45*/.TableController.listSemesters()),format.raw/*101.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*104.22*/("""
                    """),_display_(/*105.22*/if(session().get("role").equals("director"))/*105.66*/ {_display_(Seq[Any](format.raw/*105.68*/("""
                        """),format.raw/*106.25*/("""<li>
                            <a href='"""),_display_(/*107.39*/routes/*107.45*/.TableController.listSubjects()),format.raw/*107.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*110.22*/("""
                    """),_display_(/*111.22*/if(session().get("role").equals("director"))/*111.66*/ {_display_(Seq[Any](format.raw/*111.68*/("""
                        """),format.raw/*112.25*/("""<li>
                            <a href='"""),_display_(/*113.39*/routes/*113.45*/.TableController.listFieldsOfStudy()),format.raw/*113.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*116.22*/("""
                    """),_display_(/*117.22*/if(session().get("role").equals("director"))/*117.66*/ {_display_(Seq[Any](format.raw/*117.68*/("""
                        """),format.raw/*118.25*/("""<li>
                            <a href='"""),_display_(/*119.39*/routes/*119.45*/.TableController.listCourses()),format.raw/*119.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director"))/*122.66*/ {_display_(Seq[Any](format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listCurrentSemesters()),format.raw/*124.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director"))/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*130.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*133.22*/("""
                    """),_display_(/*134.22*/if(session().get("role").equals("director"))/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""<li>
                            <a href='"""),_display_(/*136.39*/routes/*136.45*/.TableController.listDays()),format.raw/*136.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director"))/*139.66*/ {_display_(Seq[Any](format.raw/*139.68*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href='"""),_display_(/*141.39*/routes/*141.45*/.TableController.listCommittees()),format.raw/*141.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listPublications()),format.raw/*147.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*150.22*/("""
                    """),_display_(/*151.22*/if(session().get("role").equals("director"))/*151.66*/ {_display_(Seq[Any](format.raw/*151.68*/("""
                        """),format.raw/*152.25*/("""<li>
                            <a href='"""),_display_(/*153.39*/routes/*153.45*/.TableController.listTeachersInWeeks()),format.raw/*153.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*156.22*/("""
                """),format.raw/*157.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*159.14*/("""
            """),format.raw/*160.13*/("""</li>
            <li>
            """),_display_(/*162.14*/if(session().get("role").equals("director"))/*162.58*/ {_display_(Seq[Any](format.raw/*162.60*/("""
                """),format.raw/*163.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*165.22*/if(session().get("role").equals("director"))/*165.66*/ {_display_(Seq[Any](format.raw/*165.68*/("""
                        """),format.raw/*166.25*/("""<li>
                            <a href=""""),_display_(/*167.39*/routes/*167.45*/.ClassroomController.index()),format.raw/*167.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/if(session().get("role").equals("director"))/*170.66*/ {_display_(Seq[Any](format.raw/*170.68*/("""
                        """),format.raw/*171.25*/("""<li>
                            <a href=""""),_display_(/*172.39*/routes/*172.45*/.Pages.blank),format.raw/*172.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*174.22*/("""
                    """),_display_(/*175.22*/if(session().get("role").equals("director"))/*175.66*/ {_display_(Seq[Any](format.raw/*175.68*/("""
                        """),format.raw/*176.25*/("""<li>
                            <a href=""""),_display_(/*177.39*/routes/*177.45*/.Application.pdf()),format.raw/*177.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*179.22*/("""
                    """),_display_(/*180.22*/if(session().get("role").equals("director"))/*180.66*/ {_display_(Seq[Any](format.raw/*180.68*/("""
                        """),format.raw/*181.25*/("""<li>
                            <a href=""""),_display_(/*182.39*/routes/*182.45*/.Application.raw()),format.raw/*182.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*184.22*/("""
                    """),_display_(/*185.22*/if(session().get("role").equals("director"))/*185.66*/ {_display_(Seq[Any](format.raw/*185.68*/("""
                        """),format.raw/*186.25*/("""<li>
                            <a href=""""),_display_(/*187.39*/routes/*187.45*/.TestController.test()),format.raw/*187.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*189.22*/("""
                    """),_display_(/*190.22*/if(session().get("role").equals("director"))/*190.66*/ {_display_(Seq[Any](format.raw/*190.68*/("""
                        """),format.raw/*191.25*/("""<li>
                            <a href=""""),_display_(/*192.39*/routes/*192.45*/.SubjectPlanTeachingController.index()),format.raw/*192.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*194.22*/("""
                    """),_display_(/*195.22*/if(session().get("role").equals("director"))/*195.66*/ {_display_(Seq[Any](format.raw/*195.68*/("""
                        """),format.raw/*196.25*/("""<li>
                            <a href=""""),_display_(/*197.39*/routes/*197.45*/.VisitsController.index()),format.raw/*197.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""
                    """),_display_(/*200.22*/if(session().get("role").equals("director"))/*200.66*/ {_display_(Seq[Any](format.raw/*200.68*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href=""""),_display_(/*202.39*/routes/*202.45*/.ProjectController.index()),format.raw/*202.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*204.22*/("""
                    """),_display_(/*205.22*/if(session().get("role").equals("director"))/*205.66*/ {_display_(Seq[Any](format.raw/*205.68*/("""
                        """),format.raw/*206.25*/("""<li>
                            <a href=""""),_display_(/*207.39*/routes/*207.45*/.CommitteeController.index()),format.raw/*207.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*209.22*/("""
                    """),_display_(/*210.22*/if(session().get("role").equals("director"))/*210.66*/ {_display_(Seq[Any](format.raw/*210.68*/("""
                        """),format.raw/*211.25*/("""<li>
                            <a href=""""),_display_(/*212.39*/routes/*212.45*/.PublicationsController.index()),format.raw/*212.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*214.22*/("""
                    """),_display_(/*215.22*/if(session().get("role").equals("director"))/*215.66*/ {_display_(Seq[Any](format.raw/*215.68*/("""
                        """),format.raw/*216.25*/("""<li>
                            <a href=""""),_display_(/*217.39*/routes/*217.45*/.OrganizationalUnitsController.index()),format.raw/*217.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*219.22*/("""
                    """),_display_(/*220.22*/if(session().get("role").equals("director"))/*220.66*/ {_display_(Seq[Any](format.raw/*220.68*/("""
                        """),format.raw/*221.25*/("""<li>
                            <a href=""""),_display_(/*222.39*/routes/*222.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*222.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*224.22*/("""
                    """),_display_(/*225.22*/if(session().get("role").equals("director"))/*225.66*/ {_display_(Seq[Any](format.raw/*225.68*/("""
                        """),format.raw/*226.25*/("""<li>
                            <a href=""""),_display_(/*227.39*/routes/*227.45*/.FinalWorksController.index()),format.raw/*227.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*229.22*/("""
                    """),_display_(/*230.22*/if(session().get("role").equals("director"))/*230.66*/ {_display_(Seq[Any](format.raw/*230.68*/("""
                        """),format.raw/*231.25*/("""<li>
                            <a href=""""),_display_(/*232.39*/routes/*232.45*/.Application.kpiChoosePerson()),format.raw/*232.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*234.22*/("""
                    """),_display_(/*235.22*/if(session().get("role").equals("director"))/*235.66*/ {_display_(Seq[Any](format.raw/*235.68*/("""
                        """),format.raw/*236.25*/("""<li>
                            <a href=""""),_display_(/*237.39*/routes/*237.45*/.Application.roles()),format.raw/*237.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*239.22*/("""
                    """),_display_(/*240.22*/if(session().get("role").equals("director"))/*240.66*/ {_display_(Seq[Any](format.raw/*240.68*/("""
                        """),format.raw/*241.25*/("""<li>
                            <a href=""""),_display_(/*242.39*/routes/*242.45*/.PersonController.index()),format.raw/*242.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*244.22*/("""
                    """),_display_(/*245.22*/if(session().get("role").equals("director"))/*245.66*/ {_display_(Seq[Any](format.raw/*245.68*/("""
                        """),format.raw/*246.25*/("""<li>
                            <a href=""""),_display_(/*247.39*/routes/*247.45*/.EmployeesController.index()),format.raw/*247.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*249.22*/("""

                    """),_display_(/*251.22*/if(session().get("role").equals("director"))/*251.66*/ {_display_(Seq[Any](format.raw/*251.68*/("""
                        """),format.raw/*252.25*/("""<li>
                            <a href=""""),_display_(/*253.39*/routes/*253.45*/.SubjectController.index()),format.raw/*253.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*255.22*/("""

                    """),_display_(/*257.22*/if(session().get("role").equals("director"))/*257.66*/ {_display_(Seq[Any](format.raw/*257.68*/("""
                        """),format.raw/*258.25*/("""<li>
                            <a href=""""),_display_(/*259.39*/routes/*259.45*/.FieldOfStudyController.index()),format.raw/*259.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*261.22*/("""
                    """),_display_(/*262.22*/if(session().get("role").equals("director"))/*262.66*/ {_display_(Seq[Any](format.raw/*262.68*/("""
                        """),format.raw/*263.25*/("""<li>
                            <a href=""""),_display_(/*264.39*/routes/*264.45*/.StudyGroupsController.index()),format.raw/*264.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*266.22*/("""
                    """),_display_(/*267.22*/if(session().get("role").equals("director"))/*267.66*/ {_display_(Seq[Any](format.raw/*267.68*/("""
                        """),format.raw/*268.25*/("""<li>
                            <a href=""""),_display_(/*269.39*/routes/*269.45*/.SemestersController.index()),format.raw/*269.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*271.22*/("""
                    """),_display_(/*272.22*/if(session().get("role").equals("director"))/*272.66*/ {_display_(Seq[Any](format.raw/*272.68*/("""
                        """),format.raw/*273.25*/("""<li>
                            <a href=""""),_display_(/*274.39*/routes/*274.45*/.StudyPlansController.index()),format.raw/*274.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*276.22*/("""
                    """),_display_(/*277.22*/if(session().get("role").equals("director"))/*277.66*/ {_display_(Seq[Any](format.raw/*277.68*/("""
                        """),format.raw/*278.25*/("""<li>
                            <a href=""""),_display_(/*279.39*/routes/*279.45*/.TeachersController.index()),format.raw/*279.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*281.22*/("""
                    """),_display_(/*282.22*/if(session().get("role").equals("director"))/*282.66*/ {_display_(Seq[Any](format.raw/*282.68*/("""
                        """),format.raw/*283.25*/("""<li>
                            <a href=""""),_display_(/*284.39*/routes/*284.45*/.CourseController.index()),format.raw/*284.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*286.22*/("""

                """),format.raw/*288.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*290.14*/("""
            """),format.raw/*291.13*/("""</li>
            <li>
            """),_display_(/*293.14*/if(session().get("role").equals("director"))/*293.58*/ {_display_(Seq[Any](format.raw/*293.60*/("""
                """),format.raw/*294.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*296.18*/if(session().get("role").equals("director"))/*296.62*/ {_display_(Seq[Any](format.raw/*296.64*/("""
                    """),format.raw/*297.21*/("""<li>
                        <a href=""""),_display_(/*298.35*/routes/*298.41*/.MethodicsController.index()),format.raw/*298.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*300.18*/("""
                """),format.raw/*301.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*303.14*/("""
            """),format.raw/*304.13*/("""</li>
            <li>
            """),_display_(/*306.14*/if(session().get("role").equals("director"))/*306.58*/ {_display_(Seq[Any](format.raw/*306.60*/("""
                """),format.raw/*307.17*/("""<a href='"""),_display_(/*307.27*/routes/*307.33*/.Application.forms),format.raw/*307.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*308.14*/("""
            """),format.raw/*309.13*/("""</li>
            <li>
            """),_display_(/*311.14*/if(session().get("role").equals("director"))/*311.58*/ {_display_(Seq[Any](format.raw/*311.60*/("""
                """),format.raw/*312.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*315.35*/routes/*315.41*/.UiElements.panelsAndWells),format.raw/*315.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*318.35*/routes/*318.41*/.UiElements.buttons),format.raw/*318.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*321.35*/routes/*321.41*/.UiElements.notifications),format.raw/*321.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*324.35*/routes/*324.41*/.UiElements.typography),format.raw/*324.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*327.35*/routes/*327.41*/.UiElements.icons),format.raw/*327.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*330.35*/routes/*330.41*/.UiElements.grid),format.raw/*330.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*334.14*/("""
            """),format.raw/*335.13*/("""</li>
            <li>
            """),_display_(/*337.14*/if(session().get("role").equals("director"))/*337.58*/ {_display_(Seq[Any](format.raw/*337.60*/("""
                """),format.raw/*338.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*367.14*/("""
            """),format.raw/*368.13*/("""</li>
            <li>
            """),_display_(/*370.14*/if(session().get("role").equals("director"))/*370.58*/ {_display_(Seq[Any](format.raw/*370.60*/("""
                """),format.raw/*371.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*376.35*/routes/*376.41*/.Charts.flot),format.raw/*376.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*379.35*/routes/*379.41*/.Charts.morris),format.raw/*379.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*383.14*/("""
            """),format.raw/*384.13*/("""</li>

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
                  DATE: Mon May 01 00:47:34 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: a056b5bf16fdd1c281c8a9e01c096b538350c361
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1670->671|1685->677|1773->743|1855->798|1870->804|1933->846|2010->896|2025->902|2088->944|2165->994|2180->1000|2242->1041|2318->1090|2333->1096|2382->1124|2463->1178|2478->1184|2537->1222|2617->1275|2632->1281|2702->1330|2774->1375|2789->1381|2877->1447|3006->1549|3021->1555|3126->1638|3343->1828|3396->1872|3436->1874|3481->1891|3666->2049|3719->2093|3759->2095|3812->2120|3882->2163|3897->2169|3951->2202|4115->2335|4164->2357|4217->2401|4257->2403|4310->2428|4380->2471|4395->2477|4483->2543|4652->2681|4702->2704|4755->2748|4795->2750|4848->2775|4918->2818|4933->2824|4998->2868|5187->3026|5236->3048|5289->3092|5329->3094|5382->3119|5452->3162|5467->3168|5517->3197|5682->3331|5731->3353|5784->3397|5824->3399|5877->3424|5947->3467|5962->3473|6016->3506|6185->3644|6234->3666|6287->3710|6327->3712|6380->3737|6450->3780|6465->3786|6524->3824|6695->3964|6744->3986|6797->4030|6837->4032|6890->4057|6960->4100|6975->4106|7027->4137|7188->4267|7237->4289|7290->4333|7330->4335|7383->4360|7453->4403|7468->4409|7521->4441|7687->4576|7736->4598|7789->4642|7829->4644|7882->4669|7952->4712|7967->4718|8019->4749|8183->4882|8232->4904|8285->4948|8325->4950|8378->4975|8448->5018|8463->5024|8518->5058|8689->5198|8738->5220|8791->5264|8831->5266|8885->5291|8956->5334|8972->5340|9026->5372|9190->5504|9240->5526|9294->5570|9335->5572|9389->5597|9460->5640|9476->5646|9529->5677|9693->5809|9743->5831|9797->5875|9838->5877|9892->5902|9963->5945|9979->5951|10037->5987|10198->6116|10248->6138|10302->6182|10343->6184|10397->6209|10468->6252|10484->6258|10536->6288|10665->6385|10715->6407|10769->6451|10810->6453|10864->6478|10935->6521|10951->6527|11012->6566|11185->6707|11235->6729|11289->6773|11330->6775|11384->6800|11455->6843|11471->6849|11551->6906|11740->7063|11790->7085|11844->7129|11885->7131|11939->7156|12010->7199|12026->7205|12075->7232|12202->7327|12252->7349|12306->7393|12347->7395|12401->7420|12472->7463|12488->7469|12543->7502|12705->7632|12755->7654|12809->7698|12850->7700|12904->7725|12975->7768|12991->7774|13048->7809|13213->7942|13263->7964|13317->8008|13358->8010|13412->8035|13483->8078|13499->8084|13559->8122|13732->8263|13778->8280|13877->8347|13919->8360|13983->8396|14037->8440|14078->8442|14124->8459|14319->8626|14373->8670|14414->8672|14468->8697|14539->8740|14555->8746|14605->8774|14704->8841|14754->8863|14808->8907|14849->8909|14903->8934|14974->8977|14990->8983|15024->8995|15124->9063|15174->9085|15228->9129|15269->9131|15323->9156|15394->9199|15410->9205|15450->9223|15543->9284|15593->9306|15647->9350|15688->9352|15742->9377|15813->9420|15829->9426|15869->9444|15967->9510|16017->9532|16071->9576|16112->9578|16166->9603|16237->9646|16253->9652|16297->9674|16391->9736|16441->9758|16495->9802|16536->9804|16590->9829|16661->9872|16677->9878|16737->9916|16852->9999|16902->10021|16956->10065|16997->10067|17051->10092|17122->10135|17138->10141|17185->10166|17293->10242|17343->10264|17397->10308|17438->10310|17492->10335|17563->10378|17579->10384|17627->10410|17736->10487|17786->10509|17840->10553|17881->10555|17935->10580|18006->10623|18022->10629|18072->10657|18179->10732|18229->10754|18283->10798|18324->10800|18378->10825|18449->10868|18465->10874|18518->10905|18628->10983|18678->11005|18732->11049|18773->11051|18827->11076|18898->11119|18914->11125|18974->11163|19095->11252|19145->11274|19199->11318|19240->11320|19294->11345|19365->11388|19381->11394|19453->11444|19557->11516|19607->11538|19661->11582|19702->11584|19756->11609|19827->11652|19843->11658|19894->11687|20010->11771|20060->11793|20114->11837|20155->11839|20209->11864|20280->11907|20296->11913|20348->11943|20453->12016|20503->12038|20557->12082|20598->12084|20652->12109|20723->12152|20739->12158|20781->12178|20875->12240|20925->12262|20979->12306|21020->12308|21074->12333|21145->12376|21161->12382|21208->12407|21314->12481|21364->12503|21418->12547|21459->12549|21513->12574|21584->12617|21600->12623|21650->12651|21762->12731|21813->12754|21867->12798|21908->12800|21962->12825|22033->12868|22049->12874|22097->12900|22206->12977|22257->13000|22311->13044|22352->13046|22406->13071|22477->13114|22493->13120|22546->13151|22652->13225|22702->13247|22756->13291|22797->13293|22851->13318|22922->13361|22938->13367|22990->13397|23098->13473|23148->13495|23202->13539|23243->13541|23297->13566|23368->13609|23384->13615|23434->13643|23543->13720|23593->13742|23647->13786|23688->13788|23742->13813|23813->13856|23829->13862|23880->13891|23997->13976|24047->13998|24101->14042|24142->14044|24196->14069|24267->14112|24283->14118|24332->14145|24440->14221|24490->14243|24544->14287|24585->14289|24639->14314|24710->14357|24726->14363|24773->14388|24879->14462|24926->14480|25025->14547|25067->14560|25131->14596|25185->14640|25226->14642|25272->14659|25458->14817|25512->14861|25553->14863|25603->14884|25670->14923|25686->14929|25736->14957|25833->15022|25879->15039|25978->15106|26020->15119|26084->15155|26138->15199|26179->15201|26225->15218|26263->15228|26279->15234|26319->15252|26413->15314|26455->15327|26519->15363|26573->15407|26614->15409|26660->15426|26887->15625|26903->15631|26951->15657|27087->15765|27103->15771|27144->15790|27271->15889|27287->15895|27334->15920|27467->16025|27483->16031|27527->16053|27657->16155|27673->16161|27712->16178|27838->16276|27854->16282|27892->16298|28044->16418|28086->16431|28150->16467|28204->16511|28245->16513|28291->16530|29601->17808|29643->17821|29707->17857|29761->17901|29802->17903|29848->17920|30115->18159|30131->18165|30165->18177|30296->18280|30312->18286|30348->18300|30512->18432|30554->18445
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|71->40|71->40|71->40|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|80->49|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|105->74|106->75|106->75|106->75|107->76|108->77|108->77|108->77|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|117->86|118->87|118->87|118->87|119->88|120->89|120->89|120->89|123->92|124->93|124->93|124->93|125->94|126->95|126->95|126->95|129->98|130->99|130->99|130->99|131->100|132->101|132->101|132->101|135->104|136->105|136->105|136->105|137->106|138->107|138->107|138->107|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|147->116|148->117|148->117|148->117|149->118|150->119|150->119|150->119|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|181->150|182->151|182->151|182->151|183->152|184->153|184->153|184->153|187->156|188->157|190->159|191->160|193->162|193->162|193->162|194->163|196->165|196->165|196->165|197->166|198->167|198->167|198->167|200->169|201->170|201->170|201->170|202->171|203->172|203->172|203->172|205->174|206->175|206->175|206->175|207->176|208->177|208->177|208->177|210->179|211->180|211->180|211->180|212->181|213->182|213->182|213->182|215->184|216->185|216->185|216->185|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|223->192|223->192|225->194|226->195|226->195|226->195|227->196|228->197|228->197|228->197|230->199|231->200|231->200|231->200|232->201|233->202|233->202|233->202|235->204|236->205|236->205|236->205|237->206|238->207|238->207|238->207|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|245->214|246->215|246->215|246->215|247->216|248->217|248->217|248->217|250->219|251->220|251->220|251->220|252->221|253->222|253->222|253->222|255->224|256->225|256->225|256->225|257->226|258->227|258->227|258->227|260->229|261->230|261->230|261->230|262->231|263->232|263->232|263->232|265->234|266->235|266->235|266->235|267->236|268->237|268->237|268->237|270->239|271->240|271->240|271->240|272->241|273->242|273->242|273->242|275->244|276->245|276->245|276->245|277->246|278->247|278->247|278->247|280->249|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|288->257|288->257|288->257|289->258|290->259|290->259|290->259|292->261|293->262|293->262|293->262|294->263|295->264|295->264|295->264|297->266|298->267|298->267|298->267|299->268|300->269|300->269|300->269|302->271|303->272|303->272|303->272|304->273|305->274|305->274|305->274|307->276|308->277|308->277|308->277|309->278|310->279|310->279|310->279|312->281|313->282|313->282|313->282|314->283|315->284|315->284|315->284|317->286|319->288|321->290|322->291|324->293|324->293|324->293|325->294|327->296|327->296|327->296|328->297|329->298|329->298|329->298|331->300|332->301|334->303|335->304|337->306|337->306|337->306|338->307|338->307|338->307|338->307|339->308|340->309|342->311|342->311|342->311|343->312|346->315|346->315|346->315|349->318|349->318|349->318|352->321|352->321|352->321|355->324|355->324|355->324|358->327|358->327|358->327|361->330|361->330|361->330|365->334|366->335|368->337|368->337|368->337|369->338|398->367|399->368|401->370|401->370|401->370|402->371|407->376|407->376|407->376|410->379|410->379|410->379|414->383|415->384
                  -- GENERATED --
              */
          