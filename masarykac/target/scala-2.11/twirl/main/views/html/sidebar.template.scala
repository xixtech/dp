
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

                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.EmployeesController.info(session().get("uid"))),format.raw/*24.88*/("""">Info</a>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.StatisticController.listEmployeerActvitiy(session().get("uid"))),format.raw/*25.105*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*27.35*/routes/*27.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("uid"))),format.raw/*27.122*/("""'>
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
                  DATE: Mon May 08 16:45:16 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 968e34219df095723aebe677a307cec9911a809a
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1569->597|1651->652|1666->658|1723->694|1816->760|1831->766|1919->832|2001->887|2016->893|2079->935|2156->985|2171->991|2234->1033|2311->1083|2326->1089|2388->1130|2464->1179|2479->1185|2528->1213|2609->1267|2624->1273|2683->1311|2763->1364|2778->1370|2846->1417|2918->1462|2933->1468|3019->1532|3148->1634|3163->1640|3266->1721|3483->1911|3536->1955|3576->1957|3621->1974|3806->2132|3859->2176|3899->2178|3952->2203|4022->2246|4037->2252|4091->2285|4255->2418|4304->2440|4357->2484|4397->2486|4450->2511|4520->2554|4535->2560|4589->2593|4757->2730|4806->2752|4859->2796|4899->2798|4952->2823|5022->2866|5037->2872|5093->2907|5261->3044|5310->3066|5363->3110|5403->3112|5456->3137|5526->3180|5541->3186|5629->3252|5798->3390|5848->3413|5901->3457|5941->3459|5994->3484|6064->3527|6079->3533|6144->3577|6333->3735|6382->3757|6435->3801|6475->3803|6528->3828|6598->3871|6613->3877|6663->3906|6828->4040|6877->4062|6930->4106|6970->4108|7023->4133|7093->4176|7108->4182|7162->4215|7331->4353|7380->4375|7433->4419|7473->4421|7526->4446|7596->4489|7611->4495|7670->4533|7841->4673|7890->4695|7943->4739|7983->4741|8036->4766|8106->4809|8121->4815|8173->4846|8334->4976|8383->4998|8436->5042|8476->5044|8529->5069|8599->5112|8614->5118|8667->5150|8833->5285|8883->5307|8937->5351|8978->5353|9032->5378|9103->5421|9119->5427|9172->5458|9337->5591|9387->5613|9441->5657|9482->5659|9536->5684|9607->5727|9623->5733|9679->5767|9851->5907|9901->5929|9955->5973|9996->5975|10050->6000|10121->6043|10137->6049|10191->6081|10355->6213|10405->6235|10459->6279|10500->6281|10554->6306|10625->6349|10641->6355|10694->6386|10858->6518|10908->6540|10962->6584|11003->6586|11057->6611|11128->6654|11144->6660|11202->6696|11363->6825|11413->6847|11467->6891|11508->6893|11562->6918|11633->6961|11649->6967|11701->6997|11830->7094|11880->7116|11934->7160|11975->7162|12029->7187|12100->7230|12116->7236|12177->7275|12350->7416|12400->7438|12454->7482|12495->7484|12549->7509|12620->7552|12636->7558|12716->7615|12905->7772|12955->7794|13009->7838|13050->7840|13104->7865|13175->7908|13191->7914|13240->7941|13367->8036|13417->8058|13471->8102|13512->8104|13566->8129|13637->8172|13653->8178|13708->8211|13870->8341|13920->8363|13974->8407|14015->8409|14069->8434|14140->8477|14156->8483|14213->8518|14378->8651|14428->8673|14482->8717|14523->8719|14577->8744|14648->8787|14664->8793|14724->8831|14897->8972|14943->8989|15042->9056|15084->9069|15148->9105|15202->9149|15243->9151|15289->9168|15484->9335|15538->9379|15579->9381|15633->9406|15704->9449|15720->9455|15770->9483|15869->9550|15919->9572|15973->9616|16014->9618|16068->9643|16139->9686|16155->9692|16208->9723|16313->9796|16363->9818|16417->9862|16458->9864|16512->9889|16583->9932|16599->9938|16633->9950|16733->10018|16783->10040|16837->10084|16878->10086|16932->10111|17003->10154|17019->10160|17059->10178|17152->10239|17202->10261|17256->10305|17297->10307|17351->10332|17422->10375|17438->10381|17478->10399|17576->10465|17626->10487|17680->10531|17721->10533|17775->10558|17846->10601|17862->10607|17906->10629|18000->10691|18050->10713|18104->10757|18145->10759|18199->10784|18270->10827|18286->10833|18346->10871|18461->10954|18511->10976|18565->11020|18606->11022|18660->11047|18731->11090|18747->11096|18794->11121|18902->11197|18952->11219|19006->11263|19047->11265|19101->11290|19172->11333|19188->11339|19236->11365|19345->11442|19395->11464|19449->11508|19490->11510|19544->11535|19615->11578|19631->11584|19681->11612|19788->11687|19838->11709|19892->11753|19933->11755|19987->11780|20058->11823|20074->11829|20127->11860|20237->11938|20287->11960|20341->12004|20382->12006|20436->12031|20507->12074|20523->12080|20583->12118|20704->12207|20754->12229|20808->12273|20849->12275|20903->12300|20974->12343|20990->12349|21062->12399|21166->12471|21216->12493|21270->12537|21311->12539|21365->12564|21436->12607|21452->12613|21503->12642|21619->12726|21669->12748|21723->12792|21764->12794|21818->12819|21889->12862|21905->12868|21957->12898|22062->12971|22112->12993|22166->13037|22207->13039|22261->13064|22332->13107|22348->13113|22390->13133|22484->13195|22534->13217|22588->13261|22629->13263|22683->13288|22754->13331|22770->13337|22817->13362|22923->13436|22973->13458|23027->13502|23068->13504|23122->13529|23193->13572|23209->13578|23259->13606|23371->13686|23422->13709|23476->13753|23517->13755|23571->13780|23642->13823|23658->13829|23706->13855|23815->13932|23866->13955|23920->13999|23961->14001|24015->14026|24086->14069|24102->14075|24155->14106|24261->14180|24311->14202|24365->14246|24406->14248|24460->14273|24531->14316|24547->14322|24599->14352|24707->14428|24757->14450|24811->14494|24852->14496|24906->14521|24977->14564|24993->14570|25043->14598|25152->14675|25202->14697|25256->14741|25297->14743|25351->14768|25422->14811|25438->14817|25489->14846|25606->14931|25656->14953|25710->14997|25751->14999|25805->15024|25876->15067|25892->15073|25941->15100|26049->15176|26099->15198|26153->15242|26194->15244|26248->15269|26319->15312|26335->15318|26382->15343|26488->15417|26535->15435|26634->15502|26676->15515|26740->15551|26794->15595|26835->15597|26881->15614|27067->15772|27121->15816|27162->15818|27212->15839|27279->15878|27295->15884|27345->15912|27442->15977|27488->15994|27587->16061|27629->16074|27693->16110|27747->16154|27788->16156|27834->16173|27872->16183|27888->16189|27928->16207|28022->16269|28064->16282|28128->16318|28182->16362|28223->16364|28269->16381|28496->16580|28512->16586|28560->16612|28696->16720|28712->16726|28753->16745|28880->16844|28896->16850|28943->16875|29076->16980|29092->16986|29136->17008|29266->17110|29282->17116|29321->17133|29447->17231|29463->17237|29501->17253|29653->17373|29695->17386|29759->17422|29813->17466|29854->17468|29900->17485|31210->18763|31252->18776|31316->18812|31370->18856|31411->18858|31457->18875|31724->19114|31740->19120|31774->19132|31905->19235|31921->19241|31957->19255|32121->19387|32163->19400
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|95->64|95->64|95->64|96->65|97->66|97->66|97->66|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|165->134|166->135|166->135|166->135|167->136|168->137|168->137|168->137|171->140|172->141|172->141|172->141|173->142|174->143|174->143|174->143|177->146|178->147|178->147|178->147|179->148|180->149|180->149|180->149|182->151|183->152|183->152|183->152|184->153|185->154|185->154|185->154|188->157|189->158|189->158|189->158|190->159|191->160|191->160|191->160|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|200->169|201->170|203->172|204->173|206->175|206->175|206->175|207->176|209->178|209->178|209->178|210->179|211->180|211->180|211->180|213->182|214->183|214->183|214->183|215->184|216->185|216->185|216->185|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|223->192|224->193|224->193|224->193|225->194|226->195|226->195|226->195|228->197|229->198|229->198|229->198|230->199|231->200|231->200|231->200|233->202|234->203|234->203|234->203|235->204|236->205|236->205|236->205|238->207|239->208|239->208|239->208|240->209|241->210|241->210|241->210|243->212|244->213|244->213|244->213|245->214|246->215|246->215|246->215|248->217|249->218|249->218|249->218|250->219|251->220|251->220|251->220|253->222|254->223|254->223|254->223|255->224|256->225|256->225|256->225|258->227|259->228|259->228|259->228|260->229|261->230|261->230|261->230|263->232|264->233|264->233|264->233|265->234|266->235|266->235|266->235|268->237|269->238|269->238|269->238|270->239|271->240|271->240|271->240|273->242|274->243|274->243|274->243|275->244|276->245|276->245|276->245|278->247|279->248|279->248|279->248|280->249|281->250|281->250|281->250|283->252|284->253|284->253|284->253|285->254|286->255|286->255|286->255|288->257|289->258|289->258|289->258|290->259|291->260|291->260|291->260|293->262|294->263|294->263|294->263|295->264|296->265|296->265|296->265|298->267|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|306->275|306->275|306->275|307->276|308->277|308->277|308->277|310->279|311->280|311->280|311->280|312->281|313->282|313->282|313->282|315->284|316->285|316->285|316->285|317->286|318->287|318->287|318->287|320->289|321->290|321->290|321->290|322->291|323->292|323->292|323->292|325->294|326->295|326->295|326->295|327->296|328->297|328->297|328->297|330->299|331->300|331->300|331->300|332->301|333->302|333->302|333->302|335->304|337->306|339->308|340->309|342->311|342->311|342->311|343->312|345->314|345->314|345->314|346->315|347->316|347->316|347->316|349->318|350->319|352->321|353->322|355->324|355->324|355->324|356->325|356->325|356->325|356->325|357->326|358->327|360->329|360->329|360->329|361->330|364->333|364->333|364->333|367->336|367->336|367->336|370->339|370->339|370->339|373->342|373->342|373->342|376->345|376->345|376->345|379->348|379->348|379->348|383->352|384->353|386->355|386->355|386->355|387->356|416->385|417->386|419->388|419->388|419->388|420->389|425->394|425->394|425->394|428->397|428->397|428->397|432->401|433->402
                  -- GENERATED --
              */
          