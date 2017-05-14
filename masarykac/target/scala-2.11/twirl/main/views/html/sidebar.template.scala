
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
                <a href='"""),_display_(/*6.27*/routes/*6.33*/.Application.dashboard),format.raw/*6.55*/("""'>
                    <i class="fa fa-home fa-fw"></i> Hlavní plocha
                </a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Osobní údaje<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*14.35*/routes/*14.41*/.StatementController.index()),format.raw/*14.69*/("""">Zobrazit výkaz</a>
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.PersonalStatisticController.index()),format.raw/*15.77*/("""">Výuka dle oddělení a osob</a>
                        <a href='"""),_display_(/*16.35*/routes/*16.41*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*16.107*/("""'>
                            Výuka dle osob</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.PersonalStatisticController.teachingAAA()),format.raw/*18.83*/("""">Výuka AAA</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.PersonalStatisticController.teachingAAB()),format.raw/*19.83*/("""">Výuka AAB</a>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.PersonalStatisticController.teachingCB()),format.raw/*20.82*/("""">Výuka CB</a>
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.index()),format.raw/*21.69*/("""">Zobrazit DČPS všechny</a>
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.StatisticController.dcpsPres()),format.raw/*22.72*/("""">Zobrazit DČPS prezenční</a>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.StatisticController.dcpsCombi()),format.raw/*23.73*/("""">Zobrazit DČPS kombinované</a>
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.StatisticController.studyPlansTable()),format.raw/*24.79*/("""">Zobrazit SP</a>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.EmployeesController.info(session().get("uid"))),format.raw/*25.88*/("""">Info</a>
                        <a href=""""),_display_(/*26.35*/routes/*26.41*/.StatisticController.listEmployeerActvitiy(session().get("uid"))),format.raw/*26.105*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*28.35*/routes/*28.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("uid"))),format.raw/*28.122*/("""'>
                            Má výuka</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*36.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*36.98*/ {_display_(Seq[Any](format.raw/*36.100*/("""
                """),format.raw/*37.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy a výstupy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*39.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*39.106*/ {_display_(Seq[Any](format.raw/*39.108*/("""
                        """),format.raw/*40.25*/("""<li>
                            <a href='"""),_display_(/*41.39*/routes/*41.45*/.TableController.listClassrooms()),format.raw/*41.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*44.22*/("""
                    """),_display_(/*45.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*45.106*/ {_display_(Seq[Any](format.raw/*45.108*/("""
                        """),format.raw/*46.25*/("""<li>
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.TableController.listAccessRole()),format.raw/*47.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*51.106*/ {_display_(Seq[Any](format.raw/*51.108*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.TableController.listTeachersRole()),format.raw/*53.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*57.106*/ {_display_(Seq[Any](format.raw/*57.108*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*59.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""

                    """),_display_(/*64.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*64.106*/ {_display_(Seq[Any](format.raw/*64.108*/("""
                        """),format.raw/*65.25*/("""<li>
                            <a href='"""),_display_(/*66.39*/routes/*66.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*66.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*69.22*/("""
                    """),_display_(/*70.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*70.106*/ {_display_(Seq[Any](format.raw/*70.108*/("""
                        """),format.raw/*71.25*/("""<li>
                            <a href='"""),_display_(/*72.39*/routes/*72.45*/.TableController.listPerson()),format.raw/*72.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*76.106*/ {_display_(Seq[Any](format.raw/*76.108*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.TableController.listStudyPlans()),format.raw/*78.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*82.106*/ {_display_(Seq[Any](format.raw/*82.108*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listScheduleInWeeks()),format.raw/*84.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*88.106*/ {_display_(Seq[Any](format.raw/*88.108*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listSchedule()),format.raw/*90.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*94.106*/ {_display_(Seq[Any](format.raw/*94.108*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listEmployees()),format.raw/*96.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*100.106*/ {_display_(Seq[Any](format.raw/*100.108*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listTeachers()),format.raw/*102.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*106.106*/ {_display_(Seq[Any](format.raw/*106.108*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listStudyGroups()),format.raw/*108.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*112.106*/ {_display_(Seq[Any](format.raw/*112.108*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listSemesters()),format.raw/*114.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*118.106*/ {_display_(Seq[Any](format.raw/*118.108*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listSubjects()),format.raw/*120.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*124.106*/ {_display_(Seq[Any](format.raw/*124.108*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listFieldsOfStudy()),format.raw/*126.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*130.106*/ {_display_(Seq[Any](format.raw/*130.108*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href='"""),_display_(/*132.39*/routes/*132.45*/.TableController.listCourses()),format.raw/*132.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*134.22*/("""
                    """),_display_(/*135.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*135.106*/ {_display_(Seq[Any](format.raw/*135.108*/("""
                        """),format.raw/*136.25*/("""<li>
                            <a href='"""),_display_(/*137.39*/routes/*137.45*/.TableController.listCurrentSemesters()),format.raw/*137.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*140.22*/("""
                    """),_display_(/*141.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*141.106*/ {_display_(Seq[Any](format.raw/*141.108*/("""
                        """),format.raw/*142.25*/("""<li>
                            <a href='"""),_display_(/*143.39*/routes/*143.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*143.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*146.22*/("""
                    """),_display_(/*147.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*147.106*/ {_display_(Seq[Any](format.raw/*147.108*/("""
                        """),format.raw/*148.25*/("""<li>
                            <a href='"""),_display_(/*149.39*/routes/*149.45*/.TableController.listDays()),format.raw/*149.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*151.22*/("""
                    """),_display_(/*152.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*152.106*/ {_display_(Seq[Any](format.raw/*152.108*/("""
                        """),format.raw/*153.25*/("""<li>
                            <a href='"""),_display_(/*154.39*/routes/*154.45*/.TableController.listCommittees()),format.raw/*154.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*157.22*/("""
                    """),_display_(/*158.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*158.106*/ {_display_(Seq[Any](format.raw/*158.108*/("""
                        """),format.raw/*159.25*/("""<li>
                            <a href='"""),_display_(/*160.39*/routes/*160.45*/.TableController.listPublications()),format.raw/*160.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*164.106*/ {_display_(Seq[Any](format.raw/*164.108*/("""
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
            """),_display_(/*175.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*175.98*/ {_display_(Seq[Any](format.raw/*175.100*/("""
                """),format.raw/*176.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*178.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*178.106*/ {_display_(Seq[Any](format.raw/*178.108*/("""
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
                  DATE: Sun May 14 11:40:13 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 63b332742df6bf0d6c8d8e9cfdb3ec6d76ad9f35
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2029->915|2044->921|2107->963|2184->1013|2199->1019|2262->1061|2339->1111|2354->1117|2416->1158|2492->1207|2507->1213|2556->1241|2645->1303|2660->1309|2712->1340|2803->1404|2818->1410|2871->1442|2964->1508|2979->1514|3038->1552|3117->1604|3132->1610|3200->1657|3272->1702|3287->1708|3373->1772|3502->1874|3517->1880|3620->1961|3836->2150|3929->2234|3970->2236|4015->2253|4210->2421|4304->2505|4345->2507|4398->2532|4468->2575|4483->2581|4537->2614|4701->2747|4750->2769|4844->2853|4885->2855|4938->2880|5008->2923|5023->2929|5077->2962|5245->3099|5294->3121|5388->3205|5429->3207|5482->3232|5552->3275|5567->3281|5623->3316|5791->3453|5840->3475|5934->3559|5975->3561|6028->3586|6098->3629|6113->3635|6201->3701|6370->3839|6420->3862|6514->3946|6555->3948|6608->3973|6678->4016|6693->4022|6758->4066|6947->4224|6996->4246|7090->4330|7131->4332|7184->4357|7254->4400|7269->4406|7319->4435|7484->4569|7533->4591|7627->4675|7668->4677|7721->4702|7791->4745|7806->4751|7860->4784|8029->4922|8078->4944|8172->5028|8213->5030|8266->5055|8336->5098|8351->5104|8410->5142|8581->5282|8630->5304|8724->5388|8765->5390|8818->5415|8888->5458|8903->5464|8955->5495|9116->5625|9165->5647|9259->5731|9300->5733|9353->5758|9423->5801|9438->5807|9491->5839|9657->5974|9707->5996|9802->6080|9844->6082|9898->6107|9969->6150|9985->6156|10038->6187|10203->6320|10253->6342|10348->6426|10390->6428|10444->6453|10515->6496|10531->6502|10587->6536|10759->6676|10809->6698|10904->6782|10946->6784|11000->6809|11071->6852|11087->6858|11141->6890|11305->7022|11355->7044|11450->7128|11492->7130|11546->7155|11617->7198|11633->7204|11686->7235|11850->7367|11900->7389|11995->7473|12037->7475|12091->7500|12162->7543|12178->7549|12236->7585|12397->7714|12447->7736|12542->7820|12584->7822|12638->7847|12709->7890|12725->7896|12777->7926|12906->8023|12956->8045|13051->8129|13093->8131|13147->8156|13218->8199|13234->8205|13295->8244|13468->8385|13518->8407|13613->8491|13655->8493|13709->8518|13780->8561|13796->8567|13876->8624|14065->8781|14115->8803|14210->8887|14252->8889|14306->8914|14377->8957|14393->8963|14442->8990|14569->9085|14619->9107|14714->9191|14756->9193|14810->9218|14881->9261|14897->9267|14952->9300|15114->9430|15164->9452|15259->9536|15301->9538|15355->9563|15426->9606|15442->9612|15499->9647|15664->9780|15714->9802|15809->9886|15851->9888|15905->9913|15976->9956|15992->9962|16052->10000|16225->10141|16271->10158|16370->10225|16412->10238|16476->10274|16570->10358|16612->10360|16658->10377|16855->10546|16950->10630|16992->10632|17046->10657|17117->10700|17133->10706|17183->10734|17282->10801|17332->10823|17386->10867|17427->10869|17481->10894|17552->10937|17568->10943|17621->10974|17726->11047|17776->11069|17830->11113|17871->11115|17925->11140|17996->11183|18012->11189|18046->11201|18146->11269|18196->11291|18250->11335|18291->11337|18345->11362|18416->11405|18432->11411|18472->11429|18565->11490|18615->11512|18669->11556|18710->11558|18764->11583|18835->11626|18851->11632|18891->11650|18989->11716|19039->11738|19093->11782|19134->11784|19188->11809|19259->11852|19275->11858|19319->11880|19413->11942|19463->11964|19517->12008|19558->12010|19612->12035|19683->12078|19699->12084|19759->12122|19874->12205|19924->12227|19978->12271|20019->12273|20073->12298|20144->12341|20160->12347|20207->12372|20315->12448|20365->12470|20419->12514|20460->12516|20514->12541|20585->12584|20601->12590|20649->12616|20758->12693|20808->12715|20862->12759|20903->12761|20957->12786|21028->12829|21044->12835|21094->12863|21201->12938|21251->12960|21305->13004|21346->13006|21400->13031|21471->13074|21487->13080|21540->13111|21650->13189|21700->13211|21754->13255|21795->13257|21849->13282|21920->13325|21936->13331|21996->13369|22117->13458|22167->13480|22221->13524|22262->13526|22316->13551|22387->13594|22403->13600|22475->13650|22579->13722|22629->13744|22683->13788|22724->13790|22778->13815|22849->13858|22865->13864|22916->13893|23032->13977|23082->13999|23136->14043|23177->14045|23231->14070|23302->14113|23318->14119|23370->14149|23475->14222|23525->14244|23579->14288|23620->14290|23674->14315|23745->14358|23761->14364|23803->14384|23897->14446|23947->14468|24001->14512|24042->14514|24096->14539|24167->14582|24183->14588|24230->14613|24336->14687|24386->14709|24440->14753|24481->14755|24535->14780|24606->14823|24622->14829|24672->14857|24784->14937|24835->14960|24889->15004|24930->15006|24984->15031|25055->15074|25071->15080|25119->15106|25228->15183|25279->15206|25333->15250|25374->15252|25428->15277|25499->15320|25515->15326|25568->15357|25674->15431|25724->15453|25778->15497|25819->15499|25873->15524|25944->15567|25960->15573|26012->15603|26120->15679|26170->15701|26224->15745|26265->15747|26319->15772|26390->15815|26406->15821|26456->15849|26565->15926|26615->15948|26669->15992|26710->15994|26764->16019|26835->16062|26851->16068|26902->16097|27019->16182|27069->16204|27123->16248|27164->16250|27218->16275|27289->16318|27305->16324|27354->16351|27462->16427|27512->16449|27566->16493|27607->16495|27661->16520|27732->16563|27748->16569|27795->16594|27901->16668|27948->16686|28047->16753|28089->16766|28153->16802|28207->16846|28248->16848|28294->16865|28480->17023|28534->17067|28575->17069|28625->17090|28692->17129|28708->17135|28758->17163|28855->17228|28901->17245|29000->17312|29042->17325|29106->17361|29160->17405|29201->17407|29247->17424|29285->17434|29301->17440|29341->17458|29435->17520|29477->17533|29541->17569|29595->17613|29636->17615|29682->17632|29909->17831|29925->17837|29973->17863|30109->17971|30125->17977|30166->17996|30293->18095|30309->18101|30356->18126|30489->18231|30505->18237|30549->18259|30679->18361|30695->18367|30734->18384|30860->18482|30876->18488|30914->18504|31066->18624|31108->18637
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|95->64|95->64|95->64|96->65|97->66|97->66|97->66|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|165->134|166->135|166->135|166->135|167->136|168->137|168->137|168->137|171->140|172->141|172->141|172->141|173->142|174->143|174->143|174->143|177->146|178->147|178->147|178->147|179->148|180->149|180->149|180->149|182->151|183->152|183->152|183->152|184->153|185->154|185->154|185->154|188->157|189->158|189->158|189->158|190->159|191->160|191->160|191->160|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|200->169|201->170|203->172|204->173|206->175|206->175|206->175|207->176|209->178|209->178|209->178|210->179|211->180|211->180|211->180|213->182|214->183|214->183|214->183|215->184|216->185|216->185|216->185|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|223->192|224->193|224->193|224->193|225->194|226->195|226->195|226->195|228->197|229->198|229->198|229->198|230->199|231->200|231->200|231->200|233->202|234->203|234->203|234->203|235->204|236->205|236->205|236->205|238->207|239->208|239->208|239->208|240->209|241->210|241->210|241->210|243->212|244->213|244->213|244->213|245->214|246->215|246->215|246->215|248->217|249->218|249->218|249->218|250->219|251->220|251->220|251->220|253->222|254->223|254->223|254->223|255->224|256->225|256->225|256->225|258->227|259->228|259->228|259->228|260->229|261->230|261->230|261->230|263->232|264->233|264->233|264->233|265->234|266->235|266->235|266->235|268->237|269->238|269->238|269->238|270->239|271->240|271->240|271->240|273->242|274->243|274->243|274->243|275->244|276->245|276->245|276->245|278->247|279->248|279->248|279->248|280->249|281->250|281->250|281->250|283->252|284->253|284->253|284->253|285->254|286->255|286->255|286->255|288->257|289->258|289->258|289->258|290->259|291->260|291->260|291->260|293->262|294->263|294->263|294->263|295->264|296->265|296->265|296->265|298->267|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|306->275|306->275|306->275|307->276|308->277|308->277|308->277|310->279|311->280|311->280|311->280|312->281|313->282|313->282|313->282|315->284|316->285|316->285|316->285|317->286|318->287|318->287|318->287|320->289|321->290|321->290|321->290|322->291|323->292|323->292|323->292|325->294|326->295|326->295|326->295|327->296|328->297|328->297|328->297|330->299|331->300|331->300|331->300|332->301|333->302|333->302|333->302|335->304|337->306|339->308|340->309|342->311|342->311|342->311|343->312|345->314|345->314|345->314|346->315|347->316|347->316|347->316|349->318|350->319|352->321|353->322|355->324|355->324|355->324|356->325|356->325|356->325|356->325|357->326|358->327|360->329|360->329|360->329|361->330|364->333|364->333|364->333|367->336|367->336|367->336|370->339|370->339|370->339|373->342|373->342|373->342|376->345|376->345|376->345|379->348|379->348|379->348|383->352|384->353
                  -- GENERATED --
              */
          