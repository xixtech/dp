
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
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.TableController.listAccessRole()),format.raw/*47.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director"))/*51.66*/ {_display_(Seq[Any](format.raw/*51.68*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.TableController.listTeachersRole()),format.raw/*53.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director"))/*57.66*/ {_display_(Seq[Any](format.raw/*57.68*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*59.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""

                    """),_display_(/*64.22*/if(session().get("role").equals("director"))/*64.66*/ {_display_(Seq[Any](format.raw/*64.68*/("""
                        """),format.raw/*65.25*/("""<li>
                            <a href='"""),_display_(/*66.39*/routes/*66.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*66.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*69.22*/("""
                    """),_display_(/*70.22*/if(session().get("role").equals("director"))/*70.66*/ {_display_(Seq[Any](format.raw/*70.68*/("""
                        """),format.raw/*71.25*/("""<li>
                            <a href='"""),_display_(/*72.39*/routes/*72.45*/.TableController.listPerson()),format.raw/*72.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(session().get("role").equals("director"))/*76.66*/ {_display_(Seq[Any](format.raw/*76.68*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.TableController.listStudyPlans()),format.raw/*78.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director"))/*82.66*/ {_display_(Seq[Any](format.raw/*82.68*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listScheduleInWeeks()),format.raw/*84.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director"))/*88.66*/ {_display_(Seq[Any](format.raw/*88.68*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listSchedule()),format.raw/*90.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director"))/*94.66*/ {_display_(Seq[Any](format.raw/*94.68*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listEmployees()),format.raw/*96.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director"))/*100.66*/ {_display_(Seq[Any](format.raw/*100.68*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listTeachers()),format.raw/*102.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director"))/*106.66*/ {_display_(Seq[Any](format.raw/*106.68*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listStudyGroups()),format.raw/*108.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director"))/*112.66*/ {_display_(Seq[Any](format.raw/*112.68*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listSemesters()),format.raw/*114.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director"))/*118.66*/ {_display_(Seq[Any](format.raw/*118.68*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listSubjects()),format.raw/*120.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director"))/*124.66*/ {_display_(Seq[Any](format.raw/*124.68*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listFieldsOfStudy()),format.raw/*126.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director"))/*130.66*/ {_display_(Seq[Any](format.raw/*130.68*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href='"""),_display_(/*132.39*/routes/*132.45*/.TableController.listCourses()),format.raw/*132.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*134.22*/("""
                    """),_display_(/*135.22*/if(session().get("role").equals("director"))/*135.66*/ {_display_(Seq[Any](format.raw/*135.68*/("""
                        """),format.raw/*136.25*/("""<li>
                            <a href='"""),_display_(/*137.39*/routes/*137.45*/.TableController.listCurrentSemesters()),format.raw/*137.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*140.22*/("""
                    """),_display_(/*141.22*/if(session().get("role").equals("director"))/*141.66*/ {_display_(Seq[Any](format.raw/*141.68*/("""
                        """),format.raw/*142.25*/("""<li>
                            <a href='"""),_display_(/*143.39*/routes/*143.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*143.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*146.22*/("""
                    """),_display_(/*147.22*/if(session().get("role").equals("director"))/*147.66*/ {_display_(Seq[Any](format.raw/*147.68*/("""
                        """),format.raw/*148.25*/("""<li>
                            <a href='"""),_display_(/*149.39*/routes/*149.45*/.TableController.listDays()),format.raw/*149.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*151.22*/("""
                    """),_display_(/*152.22*/if(session().get("role").equals("director"))/*152.66*/ {_display_(Seq[Any](format.raw/*152.68*/("""
                        """),format.raw/*153.25*/("""<li>
                            <a href='"""),_display_(/*154.39*/routes/*154.45*/.TableController.listCommittees()),format.raw/*154.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*157.22*/("""
                    """),_display_(/*158.22*/if(session().get("role").equals("director"))/*158.66*/ {_display_(Seq[Any](format.raw/*158.68*/("""
                        """),format.raw/*159.25*/("""<li>
                            <a href='"""),_display_(/*160.39*/routes/*160.45*/.TableController.listPublications()),format.raw/*160.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director"))/*164.66*/ {_display_(Seq[Any](format.raw/*164.68*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href='"""),_display_(/*166.39*/routes/*166.45*/.TableController.listTeachersInWeeks()),format.raw/*166.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                """),format.raw/*170.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*172.14*/("""
            """),format.raw/*173.13*/("""</li>
            <li>
            """),_display_(/*175.14*/if(session().get("role").equals("director"))/*175.58*/ {_display_(Seq[Any](format.raw/*175.60*/("""
                """),format.raw/*176.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*178.22*/if(session().get("role").equals("director"))/*178.66*/ {_display_(Seq[Any](format.raw/*178.68*/("""
                        """),format.raw/*179.25*/("""<li>
                            <a href=""""),_display_(/*180.39*/routes/*180.45*/.ClassroomController.index()),format.raw/*180.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*182.22*/("""
                    """),_display_(/*183.22*/if(session().get("role").equals("director"))/*183.66*/ {_display_(Seq[Any](format.raw/*183.68*/("""
                        """),format.raw/*184.25*/("""<li>
                            <a href=""""),_display_(/*185.39*/routes/*185.45*/.TeachersRoleController.index()),format.raw/*185.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*187.22*/("""
                    """),_display_(/*188.22*/if(session().get("role").equals("director"))/*188.66*/ {_display_(Seq[Any](format.raw/*188.68*/("""
                        """),format.raw/*189.25*/("""<li>
                            <a href=""""),_display_(/*190.39*/routes/*190.45*/.Pages.blank),format.raw/*190.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*192.22*/("""
                    """),_display_(/*193.22*/if(session().get("role").equals("director"))/*193.66*/ {_display_(Seq[Any](format.raw/*193.68*/("""
                        """),format.raw/*194.25*/("""<li>
                            <a href=""""),_display_(/*195.39*/routes/*195.45*/.Application.pdf()),format.raw/*195.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*197.22*/("""
                    """),_display_(/*198.22*/if(session().get("role").equals("director"))/*198.66*/ {_display_(Seq[Any](format.raw/*198.68*/("""
                        """),format.raw/*199.25*/("""<li>
                            <a href=""""),_display_(/*200.39*/routes/*200.45*/.Application.raw()),format.raw/*200.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*202.22*/("""
                    """),_display_(/*203.22*/if(session().get("role").equals("director"))/*203.66*/ {_display_(Seq[Any](format.raw/*203.68*/("""
                        """),format.raw/*204.25*/("""<li>
                            <a href=""""),_display_(/*205.39*/routes/*205.45*/.TestController.test()),format.raw/*205.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*207.22*/("""
                    """),_display_(/*208.22*/if(session().get("role").equals("director"))/*208.66*/ {_display_(Seq[Any](format.raw/*208.68*/("""
                        """),format.raw/*209.25*/("""<li>
                            <a href=""""),_display_(/*210.39*/routes/*210.45*/.SubjectPlanTeachingController.index()),format.raw/*210.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*212.22*/("""
                    """),_display_(/*213.22*/if(session().get("role").equals("director"))/*213.66*/ {_display_(Seq[Any](format.raw/*213.68*/("""
                        """),format.raw/*214.25*/("""<li>
                            <a href=""""),_display_(/*215.39*/routes/*215.45*/.VisitsController.index()),format.raw/*215.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*217.22*/("""
                    """),_display_(/*218.22*/if(session().get("role").equals("director"))/*218.66*/ {_display_(Seq[Any](format.raw/*218.68*/("""
                        """),format.raw/*219.25*/("""<li>
                            <a href=""""),_display_(/*220.39*/routes/*220.45*/.ProjectController.index()),format.raw/*220.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*222.22*/("""
                    """),_display_(/*223.22*/if(session().get("role").equals("director"))/*223.66*/ {_display_(Seq[Any](format.raw/*223.68*/("""
                        """),format.raw/*224.25*/("""<li>
                            <a href=""""),_display_(/*225.39*/routes/*225.45*/.CommitteeController.index()),format.raw/*225.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*227.22*/("""
                    """),_display_(/*228.22*/if(session().get("role").equals("director"))/*228.66*/ {_display_(Seq[Any](format.raw/*228.68*/("""
                        """),format.raw/*229.25*/("""<li>
                            <a href=""""),_display_(/*230.39*/routes/*230.45*/.PublicationsController.index()),format.raw/*230.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*232.22*/("""
                    """),_display_(/*233.22*/if(session().get("role").equals("director"))/*233.66*/ {_display_(Seq[Any](format.raw/*233.68*/("""
                        """),format.raw/*234.25*/("""<li>
                            <a href=""""),_display_(/*235.39*/routes/*235.45*/.OrganizationalUnitsController.index()),format.raw/*235.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*237.22*/("""
                    """),_display_(/*238.22*/if(session().get("role").equals("director"))/*238.66*/ {_display_(Seq[Any](format.raw/*238.68*/("""
                        """),format.raw/*239.25*/("""<li>
                            <a href=""""),_display_(/*240.39*/routes/*240.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*240.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*242.22*/("""
                    """),_display_(/*243.22*/if(session().get("role").equals("director"))/*243.66*/ {_display_(Seq[Any](format.raw/*243.68*/("""
                        """),format.raw/*244.25*/("""<li>
                            <a href=""""),_display_(/*245.39*/routes/*245.45*/.FinalWorksController.index()),format.raw/*245.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*247.22*/("""
                    """),_display_(/*248.22*/if(session().get("role").equals("director"))/*248.66*/ {_display_(Seq[Any](format.raw/*248.68*/("""
                        """),format.raw/*249.25*/("""<li>
                            <a href=""""),_display_(/*250.39*/routes/*250.45*/.Application.kpiChoosePerson()),format.raw/*250.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*252.22*/("""
                    """),_display_(/*253.22*/if(session().get("role").equals("director"))/*253.66*/ {_display_(Seq[Any](format.raw/*253.68*/("""
                        """),format.raw/*254.25*/("""<li>
                            <a href=""""),_display_(/*255.39*/routes/*255.45*/.Application.roles()),format.raw/*255.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*257.22*/("""
                    """),_display_(/*258.22*/if(session().get("role").equals("director"))/*258.66*/ {_display_(Seq[Any](format.raw/*258.68*/("""
                        """),format.raw/*259.25*/("""<li>
                            <a href=""""),_display_(/*260.39*/routes/*260.45*/.PersonController.index()),format.raw/*260.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*262.22*/("""
                    """),_display_(/*263.22*/if(session().get("role").equals("director"))/*263.66*/ {_display_(Seq[Any](format.raw/*263.68*/("""
                        """),format.raw/*264.25*/("""<li>
                            <a href=""""),_display_(/*265.39*/routes/*265.45*/.EmployeesController.index()),format.raw/*265.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*267.22*/("""

                    """),_display_(/*269.22*/if(session().get("role").equals("director"))/*269.66*/ {_display_(Seq[Any](format.raw/*269.68*/("""
                        """),format.raw/*270.25*/("""<li>
                            <a href=""""),_display_(/*271.39*/routes/*271.45*/.SubjectController.index()),format.raw/*271.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*273.22*/("""

                    """),_display_(/*275.22*/if(session().get("role").equals("director"))/*275.66*/ {_display_(Seq[Any](format.raw/*275.68*/("""
                        """),format.raw/*276.25*/("""<li>
                            <a href=""""),_display_(/*277.39*/routes/*277.45*/.FieldOfStudyController.index()),format.raw/*277.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*279.22*/("""
                    """),_display_(/*280.22*/if(session().get("role").equals("director"))/*280.66*/ {_display_(Seq[Any](format.raw/*280.68*/("""
                        """),format.raw/*281.25*/("""<li>
                            <a href=""""),_display_(/*282.39*/routes/*282.45*/.StudyGroupsController.index()),format.raw/*282.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*284.22*/("""
                    """),_display_(/*285.22*/if(session().get("role").equals("director"))/*285.66*/ {_display_(Seq[Any](format.raw/*285.68*/("""
                        """),format.raw/*286.25*/("""<li>
                            <a href=""""),_display_(/*287.39*/routes/*287.45*/.SemestersController.index()),format.raw/*287.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*289.22*/("""
                    """),_display_(/*290.22*/if(session().get("role").equals("director"))/*290.66*/ {_display_(Seq[Any](format.raw/*290.68*/("""
                        """),format.raw/*291.25*/("""<li>
                            <a href=""""),_display_(/*292.39*/routes/*292.45*/.StudyPlansController.index()),format.raw/*292.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*294.22*/("""
                    """),_display_(/*295.22*/if(session().get("role").equals("director"))/*295.66*/ {_display_(Seq[Any](format.raw/*295.68*/("""
                        """),format.raw/*296.25*/("""<li>
                            <a href=""""),_display_(/*297.39*/routes/*297.45*/.TeachersController.index()),format.raw/*297.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*299.22*/("""
                    """),_display_(/*300.22*/if(session().get("role").equals("director"))/*300.66*/ {_display_(Seq[Any](format.raw/*300.68*/("""
                        """),format.raw/*301.25*/("""<li>
                            <a href=""""),_display_(/*302.39*/routes/*302.45*/.CourseController.index()),format.raw/*302.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*304.22*/("""

                """),format.raw/*306.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*308.14*/("""
            """),format.raw/*309.13*/("""</li>
            <li>
            """),_display_(/*311.14*/if(session().get("role").equals("director"))/*311.58*/ {_display_(Seq[Any](format.raw/*311.60*/("""
                """),format.raw/*312.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*314.18*/if(session().get("role").equals("director"))/*314.62*/ {_display_(Seq[Any](format.raw/*314.64*/("""
                    """),format.raw/*315.21*/("""<li>
                        <a href=""""),_display_(/*316.35*/routes/*316.41*/.MethodicsController.index()),format.raw/*316.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*318.18*/("""
                """),format.raw/*319.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*321.14*/("""
            """),format.raw/*322.13*/("""</li>
            <li>
            """),_display_(/*324.14*/if(session().get("role").equals("director"))/*324.58*/ {_display_(Seq[Any](format.raw/*324.60*/("""
                """),format.raw/*325.17*/("""<a href='"""),_display_(/*325.27*/routes/*325.33*/.Application.forms),format.raw/*325.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*326.14*/("""
            """),format.raw/*327.13*/("""</li>
            <li>
            """),_display_(/*329.14*/if(session().get("role").equals("director"))/*329.58*/ {_display_(Seq[Any](format.raw/*329.60*/("""
                """),format.raw/*330.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*333.35*/routes/*333.41*/.UiElements.panelsAndWells),format.raw/*333.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*336.35*/routes/*336.41*/.UiElements.buttons),format.raw/*336.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*339.35*/routes/*339.41*/.UiElements.notifications),format.raw/*339.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*342.35*/routes/*342.41*/.UiElements.typography),format.raw/*342.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*345.35*/routes/*345.41*/.UiElements.icons),format.raw/*345.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*348.35*/routes/*348.41*/.UiElements.grid),format.raw/*348.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*352.14*/("""
            """),format.raw/*353.13*/("""</li>
            <li>
            """),_display_(/*355.14*/if(session().get("role").equals("director"))/*355.58*/ {_display_(Seq[Any](format.raw/*355.60*/("""
                """),format.raw/*356.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*385.14*/("""
            """),format.raw/*386.13*/("""</li>
            <li>
            """),_display_(/*388.14*/if(session().get("role").equals("director"))/*388.58*/ {_display_(Seq[Any](format.raw/*388.60*/("""
                """),format.raw/*389.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*394.35*/routes/*394.41*/.Charts.flot),format.raw/*394.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*397.35*/routes/*397.41*/.Charts.morris),format.raw/*397.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*401.14*/("""
            """),format.raw/*402.13*/("""</li>

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
                  DATE: Mon May 08 11:07:53 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: a022c5bf1d385b9e79943e6e1a65810f1302c193
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1569->597|1651->652|1666->658|1723->694|1816->760|1831->766|1919->832|2001->887|2016->893|2079->935|2156->985|2171->991|2234->1033|2311->1083|2326->1089|2388->1130|2464->1179|2479->1185|2528->1213|2609->1267|2624->1273|2683->1311|2763->1364|2778->1370|2848->1419|2920->1464|2935->1470|3023->1536|3152->1638|3167->1644|3272->1727|3489->1917|3542->1961|3582->1963|3627->1980|3812->2138|3865->2182|3905->2184|3958->2209|4028->2252|4043->2258|4097->2291|4261->2424|4310->2446|4363->2490|4403->2492|4456->2517|4526->2560|4541->2566|4595->2599|4763->2736|4812->2758|4865->2802|4905->2804|4958->2829|5028->2872|5043->2878|5099->2913|5267->3050|5316->3072|5369->3116|5409->3118|5462->3143|5532->3186|5547->3192|5635->3258|5804->3396|5854->3419|5907->3463|5947->3465|6000->3490|6070->3533|6085->3539|6150->3583|6339->3741|6388->3763|6441->3807|6481->3809|6534->3834|6604->3877|6619->3883|6669->3912|6834->4046|6883->4068|6936->4112|6976->4114|7029->4139|7099->4182|7114->4188|7168->4221|7337->4359|7386->4381|7439->4425|7479->4427|7532->4452|7602->4495|7617->4501|7676->4539|7847->4679|7896->4701|7949->4745|7989->4747|8042->4772|8112->4815|8127->4821|8179->4852|8340->4982|8389->5004|8442->5048|8482->5050|8535->5075|8605->5118|8620->5124|8673->5156|8839->5291|8889->5313|8943->5357|8984->5359|9038->5384|9109->5427|9125->5433|9178->5464|9343->5597|9393->5619|9447->5663|9488->5665|9542->5690|9613->5733|9629->5739|9685->5773|9857->5913|9907->5935|9961->5979|10002->5981|10056->6006|10127->6049|10143->6055|10197->6087|10361->6219|10411->6241|10465->6285|10506->6287|10560->6312|10631->6355|10647->6361|10700->6392|10864->6524|10914->6546|10968->6590|11009->6592|11063->6617|11134->6660|11150->6666|11208->6702|11369->6831|11419->6853|11473->6897|11514->6899|11568->6924|11639->6967|11655->6973|11707->7003|11836->7100|11886->7122|11940->7166|11981->7168|12035->7193|12106->7236|12122->7242|12183->7281|12356->7422|12406->7444|12460->7488|12501->7490|12555->7515|12626->7558|12642->7564|12722->7621|12911->7778|12961->7800|13015->7844|13056->7846|13110->7871|13181->7914|13197->7920|13246->7947|13373->8042|13423->8064|13477->8108|13518->8110|13572->8135|13643->8178|13659->8184|13714->8217|13876->8347|13926->8369|13980->8413|14021->8415|14075->8440|14146->8483|14162->8489|14219->8524|14384->8657|14434->8679|14488->8723|14529->8725|14583->8750|14654->8793|14670->8799|14730->8837|14903->8978|14949->8995|15048->9062|15090->9075|15154->9111|15208->9155|15249->9157|15295->9174|15490->9341|15544->9385|15585->9387|15639->9412|15710->9455|15726->9461|15776->9489|15875->9556|15925->9578|15979->9622|16020->9624|16074->9649|16145->9692|16161->9698|16214->9729|16319->9802|16369->9824|16423->9868|16464->9870|16518->9895|16589->9938|16605->9944|16639->9956|16739->10024|16789->10046|16843->10090|16884->10092|16938->10117|17009->10160|17025->10166|17065->10184|17158->10245|17208->10267|17262->10311|17303->10313|17357->10338|17428->10381|17444->10387|17484->10405|17582->10471|17632->10493|17686->10537|17727->10539|17781->10564|17852->10607|17868->10613|17912->10635|18006->10697|18056->10719|18110->10763|18151->10765|18205->10790|18276->10833|18292->10839|18352->10877|18467->10960|18517->10982|18571->11026|18612->11028|18666->11053|18737->11096|18753->11102|18800->11127|18908->11203|18958->11225|19012->11269|19053->11271|19107->11296|19178->11339|19194->11345|19242->11371|19351->11448|19401->11470|19455->11514|19496->11516|19550->11541|19621->11584|19637->11590|19687->11618|19794->11693|19844->11715|19898->11759|19939->11761|19993->11786|20064->11829|20080->11835|20133->11866|20243->11944|20293->11966|20347->12010|20388->12012|20442->12037|20513->12080|20529->12086|20589->12124|20710->12213|20760->12235|20814->12279|20855->12281|20909->12306|20980->12349|20996->12355|21068->12405|21172->12477|21222->12499|21276->12543|21317->12545|21371->12570|21442->12613|21458->12619|21509->12648|21625->12732|21675->12754|21729->12798|21770->12800|21824->12825|21895->12868|21911->12874|21963->12904|22068->12977|22118->12999|22172->13043|22213->13045|22267->13070|22338->13113|22354->13119|22396->13139|22490->13201|22540->13223|22594->13267|22635->13269|22689->13294|22760->13337|22776->13343|22823->13368|22929->13442|22979->13464|23033->13508|23074->13510|23128->13535|23199->13578|23215->13584|23265->13612|23377->13692|23428->13715|23482->13759|23523->13761|23577->13786|23648->13829|23664->13835|23712->13861|23821->13938|23872->13961|23926->14005|23967->14007|24021->14032|24092->14075|24108->14081|24161->14112|24267->14186|24317->14208|24371->14252|24412->14254|24466->14279|24537->14322|24553->14328|24605->14358|24713->14434|24763->14456|24817->14500|24858->14502|24912->14527|24983->14570|24999->14576|25049->14604|25158->14681|25208->14703|25262->14747|25303->14749|25357->14774|25428->14817|25444->14823|25495->14852|25612->14937|25662->14959|25716->15003|25757->15005|25811->15030|25882->15073|25898->15079|25947->15106|26055->15182|26105->15204|26159->15248|26200->15250|26254->15275|26325->15318|26341->15324|26388->15349|26494->15423|26541->15441|26640->15508|26682->15521|26746->15557|26800->15601|26841->15603|26887->15620|27073->15778|27127->15822|27168->15824|27218->15845|27285->15884|27301->15890|27351->15918|27448->15983|27494->16000|27593->16067|27635->16080|27699->16116|27753->16160|27794->16162|27840->16179|27878->16189|27894->16195|27934->16213|28028->16275|28070->16288|28134->16324|28188->16368|28229->16370|28275->16387|28502->16586|28518->16592|28566->16618|28702->16726|28718->16732|28759->16751|28886->16850|28902->16856|28949->16881|29082->16986|29098->16992|29142->17014|29272->17116|29288->17122|29327->17139|29453->17237|29469->17243|29507->17259|29659->17379|29701->17392|29765->17428|29819->17472|29860->17474|29906->17491|31216->18769|31258->18782|31322->18818|31376->18862|31417->18864|31463->18881|31730->19120|31746->19126|31780->19138|31911->19241|31927->19247|31963->19261|32127->19393|32169->19406
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|95->64|95->64|95->64|96->65|97->66|97->66|97->66|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|165->134|166->135|166->135|166->135|167->136|168->137|168->137|168->137|171->140|172->141|172->141|172->141|173->142|174->143|174->143|174->143|177->146|178->147|178->147|178->147|179->148|180->149|180->149|180->149|182->151|183->152|183->152|183->152|184->153|185->154|185->154|185->154|188->157|189->158|189->158|189->158|190->159|191->160|191->160|191->160|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|200->169|201->170|203->172|204->173|206->175|206->175|206->175|207->176|209->178|209->178|209->178|210->179|211->180|211->180|211->180|213->182|214->183|214->183|214->183|215->184|216->185|216->185|216->185|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|223->192|224->193|224->193|224->193|225->194|226->195|226->195|226->195|228->197|229->198|229->198|229->198|230->199|231->200|231->200|231->200|233->202|234->203|234->203|234->203|235->204|236->205|236->205|236->205|238->207|239->208|239->208|239->208|240->209|241->210|241->210|241->210|243->212|244->213|244->213|244->213|245->214|246->215|246->215|246->215|248->217|249->218|249->218|249->218|250->219|251->220|251->220|251->220|253->222|254->223|254->223|254->223|255->224|256->225|256->225|256->225|258->227|259->228|259->228|259->228|260->229|261->230|261->230|261->230|263->232|264->233|264->233|264->233|265->234|266->235|266->235|266->235|268->237|269->238|269->238|269->238|270->239|271->240|271->240|271->240|273->242|274->243|274->243|274->243|275->244|276->245|276->245|276->245|278->247|279->248|279->248|279->248|280->249|281->250|281->250|281->250|283->252|284->253|284->253|284->253|285->254|286->255|286->255|286->255|288->257|289->258|289->258|289->258|290->259|291->260|291->260|291->260|293->262|294->263|294->263|294->263|295->264|296->265|296->265|296->265|298->267|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|306->275|306->275|306->275|307->276|308->277|308->277|308->277|310->279|311->280|311->280|311->280|312->281|313->282|313->282|313->282|315->284|316->285|316->285|316->285|317->286|318->287|318->287|318->287|320->289|321->290|321->290|321->290|322->291|323->292|323->292|323->292|325->294|326->295|326->295|326->295|327->296|328->297|328->297|328->297|330->299|331->300|331->300|331->300|332->301|333->302|333->302|333->302|335->304|337->306|339->308|340->309|342->311|342->311|342->311|343->312|345->314|345->314|345->314|346->315|347->316|347->316|347->316|349->318|350->319|352->321|353->322|355->324|355->324|355->324|356->325|356->325|356->325|356->325|357->326|358->327|360->329|360->329|360->329|361->330|364->333|364->333|364->333|367->336|367->336|367->336|370->339|370->339|370->339|373->342|373->342|373->342|376->345|376->345|376->345|379->348|379->348|379->348|383->352|384->353|386->355|386->355|386->355|387->356|416->385|417->386|419->388|419->388|419->388|420->389|425->394|425->394|425->394|428->397|428->397|428->397|432->401|433->402
                  -- GENERATED --
              */
          