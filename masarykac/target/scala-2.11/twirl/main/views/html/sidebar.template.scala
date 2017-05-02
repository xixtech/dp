
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
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.StatementController.index()),format.raw/*15.69*/("""">Zobrazit výkaz</a>
                        <a href=""""),_display_(/*16.35*/routes/*16.41*/.PersonalStatisticController.index()),format.raw/*16.77*/("""">Výuka dle oddělení a osob</a>
                        <a href='"""),_display_(/*17.35*/routes/*17.41*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*17.107*/("""'>Výuka dle osob</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.PersonalStatisticController.teachingAAA()),format.raw/*18.83*/("""">Výuka AAA</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.PersonalStatisticController.teachingAAB()),format.raw/*19.83*/("""">Výuka AAB</a>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.PersonalStatisticController.teachingCB()),format.raw/*20.82*/("""">Výuka CB</a>
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.index()),format.raw/*21.69*/("""">Zobrazit DČPS</a>
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.StatisticController.studyPlansTable()),format.raw/*22.79*/("""">Zobrazit SP</a>

                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.EmployeesController.info(session().get("email"))),format.raw/*24.90*/("""">Info</a>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*25.107*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*27.35*/routes/*27.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("email"))),format.raw/*27.124*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*36.14*/if(session().get("role").equals("director"))/*36.58*/ {_display_(Seq[Any](format.raw/*36.60*/("""
                """),format.raw/*37.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*39.22*/if(session().get("role").equals("director"))/*39.66*/ {_display_(Seq[Any](format.raw/*39.68*/("""
                        """),format.raw/*40.25*/("""<li>
                            <a href='"""),_display_(/*41.39*/routes/*41.45*/.TableController.listClassrooms()),format.raw/*41.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*44.22*/("""
                    """),_display_(/*45.22*/if(session().get("role").equals("director"))/*45.66*/ {_display_(Seq[Any](format.raw/*45.68*/("""
                        """),format.raw/*46.25*/("""<li>
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.TableController.listTeachersRole()),format.raw/*47.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director"))/*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*53.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""

                    """),_display_(/*58.22*/if(session().get("role").equals("director"))/*58.66*/ {_display_(Seq[Any](format.raw/*58.68*/("""
                        """),format.raw/*59.25*/("""<li>
                            <a href='"""),_display_(/*60.39*/routes/*60.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*60.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*63.22*/("""
                    """),_display_(/*64.22*/if(session().get("role").equals("director"))/*64.66*/ {_display_(Seq[Any](format.raw/*64.68*/("""
                        """),format.raw/*65.25*/("""<li>
                            <a href='"""),_display_(/*66.39*/routes/*66.45*/.TableController.listPerson()),format.raw/*66.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*69.22*/("""
                    """),_display_(/*70.22*/if(session().get("role").equals("director"))/*70.66*/ {_display_(Seq[Any](format.raw/*70.68*/("""
                        """),format.raw/*71.25*/("""<li>
                            <a href='"""),_display_(/*72.39*/routes/*72.45*/.TableController.listStudyPlans()),format.raw/*72.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(session().get("role").equals("director"))/*76.66*/ {_display_(Seq[Any](format.raw/*76.68*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.TableController.listScheduleInWeeks()),format.raw/*78.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director"))/*82.66*/ {_display_(Seq[Any](format.raw/*82.68*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listSchedule()),format.raw/*84.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director"))/*88.66*/ {_display_(Seq[Any](format.raw/*88.68*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listEmployees()),format.raw/*90.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director"))/*94.66*/ {_display_(Seq[Any](format.raw/*94.68*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listTeachers()),format.raw/*96.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director"))/*100.66*/ {_display_(Seq[Any](format.raw/*100.68*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listStudyGroups()),format.raw/*102.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director"))/*106.66*/ {_display_(Seq[Any](format.raw/*106.68*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listSemesters()),format.raw/*108.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director"))/*112.66*/ {_display_(Seq[Any](format.raw/*112.68*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listSubjects()),format.raw/*114.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director"))/*118.66*/ {_display_(Seq[Any](format.raw/*118.68*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listFieldsOfStudy()),format.raw/*120.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director"))/*124.66*/ {_display_(Seq[Any](format.raw/*124.68*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listCourses()),format.raw/*126.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*128.22*/("""
                    """),_display_(/*129.22*/if(session().get("role").equals("director"))/*129.66*/ {_display_(Seq[Any](format.raw/*129.68*/("""
                        """),format.raw/*130.25*/("""<li>
                            <a href='"""),_display_(/*131.39*/routes/*131.45*/.TableController.listCurrentSemesters()),format.raw/*131.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*134.22*/("""
                    """),_display_(/*135.22*/if(session().get("role").equals("director"))/*135.66*/ {_display_(Seq[Any](format.raw/*135.68*/("""
                        """),format.raw/*136.25*/("""<li>
                            <a href='"""),_display_(/*137.39*/routes/*137.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*137.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*140.22*/("""
                    """),_display_(/*141.22*/if(session().get("role").equals("director"))/*141.66*/ {_display_(Seq[Any](format.raw/*141.68*/("""
                        """),format.raw/*142.25*/("""<li>
                            <a href='"""),_display_(/*143.39*/routes/*143.45*/.TableController.listDays()),format.raw/*143.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*145.22*/("""
                    """),_display_(/*146.22*/if(session().get("role").equals("director"))/*146.66*/ {_display_(Seq[Any](format.raw/*146.68*/("""
                        """),format.raw/*147.25*/("""<li>
                            <a href='"""),_display_(/*148.39*/routes/*148.45*/.TableController.listCommittees()),format.raw/*148.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*151.22*/("""
                    """),_display_(/*152.22*/if(session().get("role").equals("director"))/*152.66*/ {_display_(Seq[Any](format.raw/*152.68*/("""
                        """),format.raw/*153.25*/("""<li>
                            <a href='"""),_display_(/*154.39*/routes/*154.45*/.TableController.listPublications()),format.raw/*154.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*157.22*/("""
                    """),_display_(/*158.22*/if(session().get("role").equals("director"))/*158.66*/ {_display_(Seq[Any](format.raw/*158.68*/("""
                        """),format.raw/*159.25*/("""<li>
                            <a href='"""),_display_(/*160.39*/routes/*160.45*/.TableController.listTeachersInWeeks()),format.raw/*160.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                """),format.raw/*164.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*166.14*/("""
            """),format.raw/*167.13*/("""</li>
            <li>
            """),_display_(/*169.14*/if(session().get("role").equals("director"))/*169.58*/ {_display_(Seq[Any](format.raw/*169.60*/("""
                """),format.raw/*170.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*172.22*/if(session().get("role").equals("director"))/*172.66*/ {_display_(Seq[Any](format.raw/*172.68*/("""
                        """),format.raw/*173.25*/("""<li>
                            <a href=""""),_display_(/*174.39*/routes/*174.45*/.ClassroomController.index()),format.raw/*174.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*176.22*/("""
                    """),_display_(/*177.22*/if(session().get("role").equals("director"))/*177.66*/ {_display_(Seq[Any](format.raw/*177.68*/("""
                        """),format.raw/*178.25*/("""<li>
                            <a href=""""),_display_(/*179.39*/routes/*179.45*/.TeachersRoleController.index()),format.raw/*179.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*181.22*/("""
                    """),_display_(/*182.22*/if(session().get("role").equals("director"))/*182.66*/ {_display_(Seq[Any](format.raw/*182.68*/("""
                        """),format.raw/*183.25*/("""<li>
                            <a href=""""),_display_(/*184.39*/routes/*184.45*/.Pages.blank),format.raw/*184.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*186.22*/("""
                    """),_display_(/*187.22*/if(session().get("role").equals("director"))/*187.66*/ {_display_(Seq[Any](format.raw/*187.68*/("""
                        """),format.raw/*188.25*/("""<li>
                            <a href=""""),_display_(/*189.39*/routes/*189.45*/.Application.pdf()),format.raw/*189.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*191.22*/("""
                    """),_display_(/*192.22*/if(session().get("role").equals("director"))/*192.66*/ {_display_(Seq[Any](format.raw/*192.68*/("""
                        """),format.raw/*193.25*/("""<li>
                            <a href=""""),_display_(/*194.39*/routes/*194.45*/.Application.raw()),format.raw/*194.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*196.22*/("""
                    """),_display_(/*197.22*/if(session().get("role").equals("director"))/*197.66*/ {_display_(Seq[Any](format.raw/*197.68*/("""
                        """),format.raw/*198.25*/("""<li>
                            <a href=""""),_display_(/*199.39*/routes/*199.45*/.TestController.test()),format.raw/*199.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*201.22*/("""
                    """),_display_(/*202.22*/if(session().get("role").equals("director"))/*202.66*/ {_display_(Seq[Any](format.raw/*202.68*/("""
                        """),format.raw/*203.25*/("""<li>
                            <a href=""""),_display_(/*204.39*/routes/*204.45*/.SubjectPlanTeachingController.index()),format.raw/*204.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*206.22*/("""
                    """),_display_(/*207.22*/if(session().get("role").equals("director"))/*207.66*/ {_display_(Seq[Any](format.raw/*207.68*/("""
                        """),format.raw/*208.25*/("""<li>
                            <a href=""""),_display_(/*209.39*/routes/*209.45*/.VisitsController.index()),format.raw/*209.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*211.22*/("""
                    """),_display_(/*212.22*/if(session().get("role").equals("director"))/*212.66*/ {_display_(Seq[Any](format.raw/*212.68*/("""
                        """),format.raw/*213.25*/("""<li>
                            <a href=""""),_display_(/*214.39*/routes/*214.45*/.ProjectController.index()),format.raw/*214.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*216.22*/("""
                    """),_display_(/*217.22*/if(session().get("role").equals("director"))/*217.66*/ {_display_(Seq[Any](format.raw/*217.68*/("""
                        """),format.raw/*218.25*/("""<li>
                            <a href=""""),_display_(/*219.39*/routes/*219.45*/.CommitteeController.index()),format.raw/*219.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*221.22*/("""
                    """),_display_(/*222.22*/if(session().get("role").equals("director"))/*222.66*/ {_display_(Seq[Any](format.raw/*222.68*/("""
                        """),format.raw/*223.25*/("""<li>
                            <a href=""""),_display_(/*224.39*/routes/*224.45*/.PublicationsController.index()),format.raw/*224.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*226.22*/("""
                    """),_display_(/*227.22*/if(session().get("role").equals("director"))/*227.66*/ {_display_(Seq[Any](format.raw/*227.68*/("""
                        """),format.raw/*228.25*/("""<li>
                            <a href=""""),_display_(/*229.39*/routes/*229.45*/.OrganizationalUnitsController.index()),format.raw/*229.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*231.22*/("""
                    """),_display_(/*232.22*/if(session().get("role").equals("director"))/*232.66*/ {_display_(Seq[Any](format.raw/*232.68*/("""
                        """),format.raw/*233.25*/("""<li>
                            <a href=""""),_display_(/*234.39*/routes/*234.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*234.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*236.22*/("""
                    """),_display_(/*237.22*/if(session().get("role").equals("director"))/*237.66*/ {_display_(Seq[Any](format.raw/*237.68*/("""
                        """),format.raw/*238.25*/("""<li>
                            <a href=""""),_display_(/*239.39*/routes/*239.45*/.FinalWorksController.index()),format.raw/*239.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*241.22*/("""
                    """),_display_(/*242.22*/if(session().get("role").equals("director"))/*242.66*/ {_display_(Seq[Any](format.raw/*242.68*/("""
                        """),format.raw/*243.25*/("""<li>
                            <a href=""""),_display_(/*244.39*/routes/*244.45*/.Application.kpiChoosePerson()),format.raw/*244.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*246.22*/("""
                    """),_display_(/*247.22*/if(session().get("role").equals("director"))/*247.66*/ {_display_(Seq[Any](format.raw/*247.68*/("""
                        """),format.raw/*248.25*/("""<li>
                            <a href=""""),_display_(/*249.39*/routes/*249.45*/.Application.roles()),format.raw/*249.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*251.22*/("""
                    """),_display_(/*252.22*/if(session().get("role").equals("director"))/*252.66*/ {_display_(Seq[Any](format.raw/*252.68*/("""
                        """),format.raw/*253.25*/("""<li>
                            <a href=""""),_display_(/*254.39*/routes/*254.45*/.PersonController.index()),format.raw/*254.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*256.22*/("""
                    """),_display_(/*257.22*/if(session().get("role").equals("director"))/*257.66*/ {_display_(Seq[Any](format.raw/*257.68*/("""
                        """),format.raw/*258.25*/("""<li>
                            <a href=""""),_display_(/*259.39*/routes/*259.45*/.EmployeesController.index()),format.raw/*259.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*261.22*/("""

                    """),_display_(/*263.22*/if(session().get("role").equals("director"))/*263.66*/ {_display_(Seq[Any](format.raw/*263.68*/("""
                        """),format.raw/*264.25*/("""<li>
                            <a href=""""),_display_(/*265.39*/routes/*265.45*/.SubjectController.index()),format.raw/*265.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*267.22*/("""

                    """),_display_(/*269.22*/if(session().get("role").equals("director"))/*269.66*/ {_display_(Seq[Any](format.raw/*269.68*/("""
                        """),format.raw/*270.25*/("""<li>
                            <a href=""""),_display_(/*271.39*/routes/*271.45*/.FieldOfStudyController.index()),format.raw/*271.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*273.22*/("""
                    """),_display_(/*274.22*/if(session().get("role").equals("director"))/*274.66*/ {_display_(Seq[Any](format.raw/*274.68*/("""
                        """),format.raw/*275.25*/("""<li>
                            <a href=""""),_display_(/*276.39*/routes/*276.45*/.StudyGroupsController.index()),format.raw/*276.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*278.22*/("""
                    """),_display_(/*279.22*/if(session().get("role").equals("director"))/*279.66*/ {_display_(Seq[Any](format.raw/*279.68*/("""
                        """),format.raw/*280.25*/("""<li>
                            <a href=""""),_display_(/*281.39*/routes/*281.45*/.SemestersController.index()),format.raw/*281.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*283.22*/("""
                    """),_display_(/*284.22*/if(session().get("role").equals("director"))/*284.66*/ {_display_(Seq[Any](format.raw/*284.68*/("""
                        """),format.raw/*285.25*/("""<li>
                            <a href=""""),_display_(/*286.39*/routes/*286.45*/.StudyPlansController.index()),format.raw/*286.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*288.22*/("""
                    """),_display_(/*289.22*/if(session().get("role").equals("director"))/*289.66*/ {_display_(Seq[Any](format.raw/*289.68*/("""
                        """),format.raw/*290.25*/("""<li>
                            <a href=""""),_display_(/*291.39*/routes/*291.45*/.TeachersController.index()),format.raw/*291.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*293.22*/("""
                    """),_display_(/*294.22*/if(session().get("role").equals("director"))/*294.66*/ {_display_(Seq[Any](format.raw/*294.68*/("""
                        """),format.raw/*295.25*/("""<li>
                            <a href=""""),_display_(/*296.39*/routes/*296.45*/.CourseController.index()),format.raw/*296.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*298.22*/("""

                """),format.raw/*300.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*302.14*/("""
            """),format.raw/*303.13*/("""</li>
            <li>
            """),_display_(/*305.14*/if(session().get("role").equals("director"))/*305.58*/ {_display_(Seq[Any](format.raw/*305.60*/("""
                """),format.raw/*306.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*308.18*/if(session().get("role").equals("director"))/*308.62*/ {_display_(Seq[Any](format.raw/*308.64*/("""
                    """),format.raw/*309.21*/("""<li>
                        <a href=""""),_display_(/*310.35*/routes/*310.41*/.MethodicsController.index()),format.raw/*310.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*312.18*/("""
                """),format.raw/*313.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*315.14*/("""
            """),format.raw/*316.13*/("""</li>
            <li>
            """),_display_(/*318.14*/if(session().get("role").equals("director"))/*318.58*/ {_display_(Seq[Any](format.raw/*318.60*/("""
                """),format.raw/*319.17*/("""<a href='"""),_display_(/*319.27*/routes/*319.33*/.Application.forms),format.raw/*319.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*320.14*/("""
            """),format.raw/*321.13*/("""</li>
            <li>
            """),_display_(/*323.14*/if(session().get("role").equals("director"))/*323.58*/ {_display_(Seq[Any](format.raw/*323.60*/("""
                """),format.raw/*324.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*327.35*/routes/*327.41*/.UiElements.panelsAndWells),format.raw/*327.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*330.35*/routes/*330.41*/.UiElements.buttons),format.raw/*330.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*333.35*/routes/*333.41*/.UiElements.notifications),format.raw/*333.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*336.35*/routes/*336.41*/.UiElements.typography),format.raw/*336.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*339.35*/routes/*339.41*/.UiElements.icons),format.raw/*339.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*342.35*/routes/*342.41*/.UiElements.grid),format.raw/*342.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*346.14*/("""
            """),format.raw/*347.13*/("""</li>
            <li>
            """),_display_(/*349.14*/if(session().get("role").equals("director"))/*349.58*/ {_display_(Seq[Any](format.raw/*349.60*/("""
                """),format.raw/*350.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*379.14*/("""
            """),format.raw/*380.13*/("""</li>
            <li>
            """),_display_(/*382.14*/if(session().get("role").equals("director"))/*382.58*/ {_display_(Seq[Any](format.raw/*382.60*/("""
                """),format.raw/*383.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*388.35*/routes/*388.41*/.Charts.flot),format.raw/*388.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*391.35*/routes/*391.41*/.Charts.morris),format.raw/*391.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*395.14*/("""
            """),format.raw/*396.13*/("""</li>

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
                  DATE: Tue May 02 23:19:51 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 7ac0eea034db1d14b6993597116880c6454e9315
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1569->597|1651->652|1666->658|1723->694|1816->760|1831->766|1919->832|2001->887|2016->893|2079->935|2156->985|2171->991|2234->1033|2311->1083|2326->1089|2388->1130|2464->1179|2479->1185|2528->1213|2609->1267|2624->1273|2683->1311|2763->1364|2778->1370|2848->1419|2920->1464|2935->1470|3023->1536|3152->1638|3167->1644|3272->1727|3489->1917|3542->1961|3582->1963|3627->1980|3812->2138|3865->2182|3905->2184|3958->2209|4028->2252|4043->2258|4097->2291|4261->2424|4310->2446|4363->2490|4403->2492|4456->2517|4526->2560|4541->2566|4597->2601|4765->2738|4814->2760|4867->2804|4907->2806|4960->2831|5030->2874|5045->2880|5133->2946|5302->3084|5352->3107|5405->3151|5445->3153|5498->3178|5568->3221|5583->3227|5648->3271|5837->3429|5886->3451|5939->3495|5979->3497|6032->3522|6102->3565|6117->3571|6167->3600|6332->3734|6381->3756|6434->3800|6474->3802|6527->3827|6597->3870|6612->3876|6666->3909|6835->4047|6884->4069|6937->4113|6977->4115|7030->4140|7100->4183|7115->4189|7174->4227|7345->4367|7394->4389|7447->4433|7487->4435|7540->4460|7610->4503|7625->4509|7677->4540|7838->4670|7887->4692|7940->4736|7980->4738|8033->4763|8103->4806|8118->4812|8171->4844|8337->4979|8386->5001|8439->5045|8479->5047|8532->5072|8602->5115|8617->5121|8669->5152|8833->5285|8883->5307|8937->5351|8978->5353|9032->5378|9103->5421|9119->5427|9175->5461|9347->5601|9397->5623|9451->5667|9492->5669|9546->5694|9617->5737|9633->5743|9687->5775|9851->5907|9901->5929|9955->5973|9996->5975|10050->6000|10121->6043|10137->6049|10190->6080|10354->6212|10404->6234|10458->6278|10499->6280|10553->6305|10624->6348|10640->6354|10698->6390|10859->6519|10909->6541|10963->6585|11004->6587|11058->6612|11129->6655|11145->6661|11197->6691|11326->6788|11376->6810|11430->6854|11471->6856|11525->6881|11596->6924|11612->6930|11673->6969|11846->7110|11896->7132|11950->7176|11991->7178|12045->7203|12116->7246|12132->7252|12212->7309|12401->7466|12451->7488|12505->7532|12546->7534|12600->7559|12671->7602|12687->7608|12736->7635|12863->7730|12913->7752|12967->7796|13008->7798|13062->7823|13133->7866|13149->7872|13204->7905|13366->8035|13416->8057|13470->8101|13511->8103|13565->8128|13636->8171|13652->8177|13709->8212|13874->8345|13924->8367|13978->8411|14019->8413|14073->8438|14144->8481|14160->8487|14220->8525|14393->8666|14439->8683|14538->8750|14580->8763|14644->8799|14698->8843|14739->8845|14785->8862|14980->9029|15034->9073|15075->9075|15129->9100|15200->9143|15216->9149|15266->9177|15365->9244|15415->9266|15469->9310|15510->9312|15564->9337|15635->9380|15651->9386|15704->9417|15809->9490|15859->9512|15913->9556|15954->9558|16008->9583|16079->9626|16095->9632|16129->9644|16229->9712|16279->9734|16333->9778|16374->9780|16428->9805|16499->9848|16515->9854|16555->9872|16648->9933|16698->9955|16752->9999|16793->10001|16847->10026|16918->10069|16934->10075|16974->10093|17072->10159|17122->10181|17176->10225|17217->10227|17271->10252|17342->10295|17358->10301|17402->10323|17496->10385|17546->10407|17600->10451|17641->10453|17695->10478|17766->10521|17782->10527|17842->10565|17957->10648|18007->10670|18061->10714|18102->10716|18156->10741|18227->10784|18243->10790|18290->10815|18398->10891|18448->10913|18502->10957|18543->10959|18597->10984|18668->11027|18684->11033|18732->11059|18841->11136|18891->11158|18945->11202|18986->11204|19040->11229|19111->11272|19127->11278|19177->11306|19284->11381|19334->11403|19388->11447|19429->11449|19483->11474|19554->11517|19570->11523|19623->11554|19733->11632|19783->11654|19837->11698|19878->11700|19932->11725|20003->11768|20019->11774|20079->11812|20200->11901|20250->11923|20304->11967|20345->11969|20399->11994|20470->12037|20486->12043|20558->12093|20662->12165|20712->12187|20766->12231|20807->12233|20861->12258|20932->12301|20948->12307|20999->12336|21115->12420|21165->12442|21219->12486|21260->12488|21314->12513|21385->12556|21401->12562|21453->12592|21558->12665|21608->12687|21662->12731|21703->12733|21757->12758|21828->12801|21844->12807|21886->12827|21980->12889|22030->12911|22084->12955|22125->12957|22179->12982|22250->13025|22266->13031|22313->13056|22419->13130|22469->13152|22523->13196|22564->13198|22618->13223|22689->13266|22705->13272|22755->13300|22867->13380|22918->13403|22972->13447|23013->13449|23067->13474|23138->13517|23154->13523|23202->13549|23311->13626|23362->13649|23416->13693|23457->13695|23511->13720|23582->13763|23598->13769|23651->13800|23757->13874|23807->13896|23861->13940|23902->13942|23956->13967|24027->14010|24043->14016|24095->14046|24203->14122|24253->14144|24307->14188|24348->14190|24402->14215|24473->14258|24489->14264|24539->14292|24648->14369|24698->14391|24752->14435|24793->14437|24847->14462|24918->14505|24934->14511|24985->14540|25102->14625|25152->14647|25206->14691|25247->14693|25301->14718|25372->14761|25388->14767|25437->14794|25545->14870|25595->14892|25649->14936|25690->14938|25744->14963|25815->15006|25831->15012|25878->15037|25984->15111|26031->15129|26130->15196|26172->15209|26236->15245|26290->15289|26331->15291|26377->15308|26563->15466|26617->15510|26658->15512|26708->15533|26775->15572|26791->15578|26841->15606|26938->15671|26984->15688|27083->15755|27125->15768|27189->15804|27243->15848|27284->15850|27330->15867|27368->15877|27384->15883|27424->15901|27518->15963|27560->15976|27624->16012|27678->16056|27719->16058|27765->16075|27992->16274|28008->16280|28056->16306|28192->16414|28208->16420|28249->16439|28376->16538|28392->16544|28439->16569|28572->16674|28588->16680|28632->16702|28762->16804|28778->16810|28817->16827|28943->16925|28959->16931|28997->16947|29149->17067|29191->17080|29255->17116|29309->17160|29350->17162|29396->17179|30706->18457|30748->18470|30812->18506|30866->18550|30907->18552|30953->18569|31220->18808|31236->18814|31270->18826|31401->18929|31417->18935|31453->18949|31617->19081|31659->19094
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|89->58|89->58|89->58|90->59|91->60|91->60|91->60|94->63|95->64|95->64|95->64|96->65|97->66|97->66|97->66|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|159->128|160->129|160->129|160->129|161->130|162->131|162->131|162->131|165->134|166->135|166->135|166->135|167->136|168->137|168->137|168->137|171->140|172->141|172->141|172->141|173->142|174->143|174->143|174->143|176->145|177->146|177->146|177->146|178->147|179->148|179->148|179->148|182->151|183->152|183->152|183->152|184->153|185->154|185->154|185->154|188->157|189->158|189->158|189->158|190->159|191->160|191->160|191->160|194->163|195->164|197->166|198->167|200->169|200->169|200->169|201->170|203->172|203->172|203->172|204->173|205->174|205->174|205->174|207->176|208->177|208->177|208->177|209->178|210->179|210->179|210->179|212->181|213->182|213->182|213->182|214->183|215->184|215->184|215->184|217->186|218->187|218->187|218->187|219->188|220->189|220->189|220->189|222->191|223->192|223->192|223->192|224->193|225->194|225->194|225->194|227->196|228->197|228->197|228->197|229->198|230->199|230->199|230->199|232->201|233->202|233->202|233->202|234->203|235->204|235->204|235->204|237->206|238->207|238->207|238->207|239->208|240->209|240->209|240->209|242->211|243->212|243->212|243->212|244->213|245->214|245->214|245->214|247->216|248->217|248->217|248->217|249->218|250->219|250->219|250->219|252->221|253->222|253->222|253->222|254->223|255->224|255->224|255->224|257->226|258->227|258->227|258->227|259->228|260->229|260->229|260->229|262->231|263->232|263->232|263->232|264->233|265->234|265->234|265->234|267->236|268->237|268->237|268->237|269->238|270->239|270->239|270->239|272->241|273->242|273->242|273->242|274->243|275->244|275->244|275->244|277->246|278->247|278->247|278->247|279->248|280->249|280->249|280->249|282->251|283->252|283->252|283->252|284->253|285->254|285->254|285->254|287->256|288->257|288->257|288->257|289->258|290->259|290->259|290->259|292->261|294->263|294->263|294->263|295->264|296->265|296->265|296->265|298->267|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|305->274|305->274|305->274|306->275|307->276|307->276|307->276|309->278|310->279|310->279|310->279|311->280|312->281|312->281|312->281|314->283|315->284|315->284|315->284|316->285|317->286|317->286|317->286|319->288|320->289|320->289|320->289|321->290|322->291|322->291|322->291|324->293|325->294|325->294|325->294|326->295|327->296|327->296|327->296|329->298|331->300|333->302|334->303|336->305|336->305|336->305|337->306|339->308|339->308|339->308|340->309|341->310|341->310|341->310|343->312|344->313|346->315|347->316|349->318|349->318|349->318|350->319|350->319|350->319|350->319|351->320|352->321|354->323|354->323|354->323|355->324|358->327|358->327|358->327|361->330|361->330|361->330|364->333|364->333|364->333|367->336|367->336|367->336|370->339|370->339|370->339|373->342|373->342|373->342|377->346|378->347|380->349|380->349|380->349|381->350|410->379|411->380|413->382|413->382|413->382|414->383|419->388|419->388|419->388|422->391|422->391|422->391|426->395|427->396
                  -- GENERATED --
              */
          