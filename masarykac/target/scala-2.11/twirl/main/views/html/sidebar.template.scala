
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
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.TableController.listOJ()),format.raw/*47.70*/("""'><i class="fa fa-table fa-fw"></i>
                                Organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*51.106*/ {_display_(Seq[Any](format.raw/*51.108*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.TableController.listAccessRole()),format.raw/*53.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*57.106*/ {_display_(Seq[Any](format.raw/*57.108*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.TableController.listTeachersRole()),format.raw/*59.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*63.106*/ {_display_(Seq[Any](format.raw/*63.108*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*65.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""

                    """),_display_(/*70.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*70.106*/ {_display_(Seq[Any](format.raw/*70.108*/("""
                        """),format.raw/*71.25*/("""<li>
                            <a href='"""),_display_(/*72.39*/routes/*72.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*72.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*76.106*/ {_display_(Seq[Any](format.raw/*76.108*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.TableController.listPerson()),format.raw/*78.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*82.106*/ {_display_(Seq[Any](format.raw/*82.108*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listStudyPlans()),format.raw/*84.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*88.106*/ {_display_(Seq[Any](format.raw/*88.108*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listScheduleInWeeks()),format.raw/*90.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*94.106*/ {_display_(Seq[Any](format.raw/*94.108*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listSchedule()),format.raw/*96.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*100.106*/ {_display_(Seq[Any](format.raw/*100.108*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listEmployees()),format.raw/*102.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*106.106*/ {_display_(Seq[Any](format.raw/*106.108*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listTeachers()),format.raw/*108.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*112.106*/ {_display_(Seq[Any](format.raw/*112.108*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listStudyGroups()),format.raw/*114.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*118.106*/ {_display_(Seq[Any](format.raw/*118.108*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listSemesters()),format.raw/*120.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*124.106*/ {_display_(Seq[Any](format.raw/*124.108*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listSubjects()),format.raw/*126.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*130.106*/ {_display_(Seq[Any](format.raw/*130.108*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href='"""),_display_(/*132.39*/routes/*132.45*/.TableController.listFieldsOfStudy()),format.raw/*132.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*135.22*/("""
                    """),_display_(/*136.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*136.106*/ {_display_(Seq[Any](format.raw/*136.108*/("""
                        """),format.raw/*137.25*/("""<li>
                            <a href='"""),_display_(/*138.39*/routes/*138.45*/.TableController.listCourses()),format.raw/*138.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*140.22*/("""
                    """),_display_(/*141.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*141.106*/ {_display_(Seq[Any](format.raw/*141.108*/("""
                        """),format.raw/*142.25*/("""<li>
                            <a href='"""),_display_(/*143.39*/routes/*143.45*/.TableController.listCurrentSemesters()),format.raw/*143.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*146.22*/("""
                    """),_display_(/*147.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*147.106*/ {_display_(Seq[Any](format.raw/*147.108*/("""
                        """),format.raw/*148.25*/("""<li>
                            <a href='"""),_display_(/*149.39*/routes/*149.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*149.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*152.22*/("""
                    """),_display_(/*153.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*153.106*/ {_display_(Seq[Any](format.raw/*153.108*/("""
                        """),format.raw/*154.25*/("""<li>
                            <a href='"""),_display_(/*155.39*/routes/*155.45*/.TableController.listDays()),format.raw/*155.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*157.22*/("""
                    """),_display_(/*158.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*158.106*/ {_display_(Seq[Any](format.raw/*158.108*/("""
                        """),format.raw/*159.25*/("""<li>
                            <a href='"""),_display_(/*160.39*/routes/*160.45*/.TableController.listCommittees()),format.raw/*160.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*164.106*/ {_display_(Seq[Any](format.raw/*164.108*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href='"""),_display_(/*166.39*/routes/*166.45*/.TableController.listPublications()),format.raw/*166.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*170.106*/ {_display_(Seq[Any](format.raw/*170.108*/("""
                        """),format.raw/*171.25*/("""<li>
                            <a href='"""),_display_(/*172.39*/routes/*172.45*/.TableController.listTeachersInWeeks()),format.raw/*172.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*175.22*/("""
                """),format.raw/*176.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*178.14*/("""
            """),format.raw/*179.13*/("""</li>
            <li>
            """),_display_(/*181.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*181.98*/ {_display_(Seq[Any](format.raw/*181.100*/("""
                """),format.raw/*182.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*184.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*184.106*/ {_display_(Seq[Any](format.raw/*184.108*/("""
                        """),format.raw/*185.25*/("""<li>
                            <a href=""""),_display_(/*186.39*/routes/*186.45*/.ClassroomController.index()),format.raw/*186.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(session().get("role").equals("director"))/*189.66*/ {_display_(Seq[Any](format.raw/*189.68*/("""
                        """),format.raw/*190.25*/("""<li>
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.TeachersRoleController.index()),format.raw/*191.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""
                    """),_display_(/*194.22*/if(session().get("role").equals("director"))/*194.66*/ {_display_(Seq[Any](format.raw/*194.68*/("""
                        """),format.raw/*195.25*/("""<li>
                            <a href=""""),_display_(/*196.39*/routes/*196.45*/.Pages.blank),format.raw/*196.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*198.22*/("""
                    """),_display_(/*199.22*/if(session().get("role").equals("director"))/*199.66*/ {_display_(Seq[Any](format.raw/*199.68*/("""
                        """),format.raw/*200.25*/("""<li>
                            <a href=""""),_display_(/*201.39*/routes/*201.45*/.Application.pdf()),format.raw/*201.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*203.22*/("""
                    """),_display_(/*204.22*/if(session().get("role").equals("director"))/*204.66*/ {_display_(Seq[Any](format.raw/*204.68*/("""
                        """),format.raw/*205.25*/("""<li>
                            <a href=""""),_display_(/*206.39*/routes/*206.45*/.Application.raw()),format.raw/*206.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*208.22*/("""
                    """),_display_(/*209.22*/if(session().get("role").equals("director"))/*209.66*/ {_display_(Seq[Any](format.raw/*209.68*/("""
                        """),format.raw/*210.25*/("""<li>
                            <a href=""""),_display_(/*211.39*/routes/*211.45*/.TestController.test()),format.raw/*211.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*213.22*/("""
                    """),_display_(/*214.22*/if(session().get("role").equals("director"))/*214.66*/ {_display_(Seq[Any](format.raw/*214.68*/("""
                        """),format.raw/*215.25*/("""<li>
                            <a href=""""),_display_(/*216.39*/routes/*216.45*/.SubjectPlanTeachingController.index()),format.raw/*216.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*218.22*/("""
                    """),_display_(/*219.22*/if(session().get("role").equals("director"))/*219.66*/ {_display_(Seq[Any](format.raw/*219.68*/("""
                        """),format.raw/*220.25*/("""<li>
                            <a href=""""),_display_(/*221.39*/routes/*221.45*/.VisitsController.index()),format.raw/*221.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*223.22*/("""
                    """),_display_(/*224.22*/if(session().get("role").equals("director"))/*224.66*/ {_display_(Seq[Any](format.raw/*224.68*/("""
                        """),format.raw/*225.25*/("""<li>
                            <a href=""""),_display_(/*226.39*/routes/*226.45*/.ProjectController.index()),format.raw/*226.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*228.22*/("""
                    """),_display_(/*229.22*/if(session().get("role").equals("director"))/*229.66*/ {_display_(Seq[Any](format.raw/*229.68*/("""
                        """),format.raw/*230.25*/("""<li>
                            <a href=""""),_display_(/*231.39*/routes/*231.45*/.CommitteeController.index()),format.raw/*231.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*233.22*/("""
                    """),_display_(/*234.22*/if(session().get("role").equals("director"))/*234.66*/ {_display_(Seq[Any](format.raw/*234.68*/("""
                        """),format.raw/*235.25*/("""<li>
                            <a href=""""),_display_(/*236.39*/routes/*236.45*/.PublicationsController.index()),format.raw/*236.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*238.22*/("""
                    """),_display_(/*239.22*/if(session().get("role").equals("director"))/*239.66*/ {_display_(Seq[Any](format.raw/*239.68*/("""
                        """),format.raw/*240.25*/("""<li>
                            <a href=""""),_display_(/*241.39*/routes/*241.45*/.OrganizationalUnitsController.index()),format.raw/*241.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*243.22*/("""
                    """),_display_(/*244.22*/if(session().get("role").equals("director"))/*244.66*/ {_display_(Seq[Any](format.raw/*244.68*/("""
                        """),format.raw/*245.25*/("""<li>
                            <a href=""""),_display_(/*246.39*/routes/*246.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*246.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*248.22*/("""
                    """),_display_(/*249.22*/if(session().get("role").equals("director"))/*249.66*/ {_display_(Seq[Any](format.raw/*249.68*/("""
                        """),format.raw/*250.25*/("""<li>
                            <a href=""""),_display_(/*251.39*/routes/*251.45*/.FinalWorksController.index()),format.raw/*251.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*253.22*/("""
                    """),_display_(/*254.22*/if(session().get("role").equals("director"))/*254.66*/ {_display_(Seq[Any](format.raw/*254.68*/("""
                        """),format.raw/*255.25*/("""<li>
                            <a href=""""),_display_(/*256.39*/routes/*256.45*/.Application.kpiChoosePerson()),format.raw/*256.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*258.22*/("""
                    """),_display_(/*259.22*/if(session().get("role").equals("director"))/*259.66*/ {_display_(Seq[Any](format.raw/*259.68*/("""
                        """),format.raw/*260.25*/("""<li>
                            <a href=""""),_display_(/*261.39*/routes/*261.45*/.Application.roles()),format.raw/*261.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*263.22*/("""
                    """),_display_(/*264.22*/if(session().get("role").equals("director"))/*264.66*/ {_display_(Seq[Any](format.raw/*264.68*/("""
                        """),format.raw/*265.25*/("""<li>
                            <a href=""""),_display_(/*266.39*/routes/*266.45*/.PersonController.index()),format.raw/*266.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*268.22*/("""
                    """),_display_(/*269.22*/if(session().get("role").equals("director"))/*269.66*/ {_display_(Seq[Any](format.raw/*269.68*/("""
                        """),format.raw/*270.25*/("""<li>
                            <a href=""""),_display_(/*271.39*/routes/*271.45*/.EmployeesController.index()),format.raw/*271.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*273.22*/("""

                    """),_display_(/*275.22*/if(session().get("role").equals("director"))/*275.66*/ {_display_(Seq[Any](format.raw/*275.68*/("""
                        """),format.raw/*276.25*/("""<li>
                            <a href=""""),_display_(/*277.39*/routes/*277.45*/.SubjectController.index()),format.raw/*277.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*279.22*/("""

                    """),_display_(/*281.22*/if(session().get("role").equals("director"))/*281.66*/ {_display_(Seq[Any](format.raw/*281.68*/("""
                        """),format.raw/*282.25*/("""<li>
                            <a href=""""),_display_(/*283.39*/routes/*283.45*/.FieldOfStudyController.index()),format.raw/*283.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*285.22*/("""
                    """),_display_(/*286.22*/if(session().get("role").equals("director"))/*286.66*/ {_display_(Seq[Any](format.raw/*286.68*/("""
                        """),format.raw/*287.25*/("""<li>
                            <a href=""""),_display_(/*288.39*/routes/*288.45*/.StudyGroupsController.index()),format.raw/*288.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*290.22*/("""
                    """),_display_(/*291.22*/if(session().get("role").equals("director"))/*291.66*/ {_display_(Seq[Any](format.raw/*291.68*/("""
                        """),format.raw/*292.25*/("""<li>
                            <a href=""""),_display_(/*293.39*/routes/*293.45*/.SemestersController.index()),format.raw/*293.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*295.22*/("""
                    """),_display_(/*296.22*/if(session().get("role").equals("director"))/*296.66*/ {_display_(Seq[Any](format.raw/*296.68*/("""
                        """),format.raw/*297.25*/("""<li>
                            <a href=""""),_display_(/*298.39*/routes/*298.45*/.StudyPlansController.index()),format.raw/*298.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*300.22*/("""
                    """),_display_(/*301.22*/if(session().get("role").equals("director"))/*301.66*/ {_display_(Seq[Any](format.raw/*301.68*/("""
                        """),format.raw/*302.25*/("""<li>
                            <a href=""""),_display_(/*303.39*/routes/*303.45*/.TeachersController.index()),format.raw/*303.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*305.22*/("""
                    """),_display_(/*306.22*/if(session().get("role").equals("director"))/*306.66*/ {_display_(Seq[Any](format.raw/*306.68*/("""
                        """),format.raw/*307.25*/("""<li>
                            <a href=""""),_display_(/*308.39*/routes/*308.45*/.CourseController.index()),format.raw/*308.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*310.22*/("""

                """),format.raw/*312.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*314.14*/("""
            """),format.raw/*315.13*/("""</li>
            <li>
            """),_display_(/*317.14*/if(session().get("role").equals("director"))/*317.58*/ {_display_(Seq[Any](format.raw/*317.60*/("""
                """),format.raw/*318.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*320.18*/if(session().get("role").equals("director"))/*320.62*/ {_display_(Seq[Any](format.raw/*320.64*/("""
                    """),format.raw/*321.21*/("""<li>
                        <a href=""""),_display_(/*322.35*/routes/*322.41*/.MethodicsController.index()),format.raw/*322.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*324.18*/("""
                """),format.raw/*325.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*327.14*/("""
            """),format.raw/*328.13*/("""</li>
            <li>
            """),_display_(/*330.14*/if(session().get("role").equals("director"))/*330.58*/ {_display_(Seq[Any](format.raw/*330.60*/("""
                """),format.raw/*331.17*/("""<a href='"""),_display_(/*331.27*/routes/*331.33*/.Application.forms),format.raw/*331.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*332.14*/("""
            """),format.raw/*333.13*/("""</li>
            <li>
            """),_display_(/*335.14*/if(session().get("role").equals("director"))/*335.58*/ {_display_(Seq[Any](format.raw/*335.60*/("""
                """),format.raw/*336.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*339.35*/routes/*339.41*/.UiElements.panelsAndWells),format.raw/*339.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*342.35*/routes/*342.41*/.UiElements.buttons),format.raw/*342.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*345.35*/routes/*345.41*/.UiElements.notifications),format.raw/*345.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*348.35*/routes/*348.41*/.UiElements.typography),format.raw/*348.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*351.35*/routes/*351.41*/.UiElements.icons),format.raw/*351.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*354.35*/routes/*354.41*/.UiElements.grid),format.raw/*354.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*358.14*/("""
            """),format.raw/*359.13*/("""</li>
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
                  DATE: Mon May 15 17:43:06 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 15fab79d883c68fe40927fc976b3f43b9be72392
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2029->915|2044->921|2107->963|2184->1013|2199->1019|2262->1061|2339->1111|2354->1117|2416->1158|2492->1207|2507->1213|2556->1241|2645->1303|2660->1309|2712->1340|2803->1404|2818->1410|2871->1442|2964->1508|2979->1514|3038->1552|3117->1604|3132->1610|3200->1657|3272->1702|3287->1708|3373->1772|3502->1874|3517->1880|3620->1961|3836->2150|3929->2234|3970->2236|4015->2253|4210->2421|4304->2505|4345->2507|4398->2532|4468->2575|4483->2581|4537->2614|4701->2747|4750->2769|4844->2853|4885->2855|4938->2880|5008->2923|5023->2929|5069->2954|5244->3098|5293->3120|5387->3204|5428->3206|5481->3231|5551->3274|5566->3280|5620->3313|5788->3450|5837->3472|5931->3556|5972->3558|6025->3583|6095->3626|6110->3632|6166->3667|6334->3804|6383->3826|6477->3910|6518->3912|6571->3937|6641->3980|6656->3986|6744->4052|6913->4190|6963->4213|7057->4297|7098->4299|7151->4324|7221->4367|7236->4373|7301->4417|7490->4575|7539->4597|7633->4681|7674->4683|7727->4708|7797->4751|7812->4757|7862->4786|8027->4920|8076->4942|8170->5026|8211->5028|8264->5053|8334->5096|8349->5102|8403->5135|8572->5273|8621->5295|8715->5379|8756->5381|8809->5406|8879->5449|8894->5455|8953->5493|9124->5633|9173->5655|9267->5739|9308->5741|9361->5766|9431->5809|9446->5815|9498->5846|9659->5976|9709->5998|9804->6082|9846->6084|9900->6109|9971->6152|9987->6158|10041->6190|10208->6325|10258->6347|10353->6431|10395->6433|10449->6458|10520->6501|10536->6507|10589->6538|10754->6671|10804->6693|10899->6777|10941->6779|10995->6804|11066->6847|11082->6853|11138->6887|11310->7027|11360->7049|11455->7133|11497->7135|11551->7160|11622->7203|11638->7209|11692->7241|11856->7373|11906->7395|12001->7479|12043->7481|12097->7506|12168->7549|12184->7555|12237->7586|12401->7718|12451->7740|12546->7824|12588->7826|12642->7851|12713->7894|12729->7900|12787->7936|12948->8065|12998->8087|13093->8171|13135->8173|13189->8198|13260->8241|13276->8247|13328->8277|13457->8374|13507->8396|13602->8480|13644->8482|13698->8507|13769->8550|13785->8556|13846->8595|14019->8736|14069->8758|14164->8842|14206->8844|14260->8869|14331->8912|14347->8918|14427->8975|14616->9132|14666->9154|14761->9238|14803->9240|14857->9265|14928->9308|14944->9314|14993->9341|15120->9436|15170->9458|15265->9542|15307->9544|15361->9569|15432->9612|15448->9618|15503->9651|15665->9781|15715->9803|15810->9887|15852->9889|15906->9914|15977->9957|15993->9963|16050->9998|16215->10131|16265->10153|16360->10237|16402->10239|16456->10264|16527->10307|16543->10313|16603->10351|16776->10492|16822->10509|16921->10576|16963->10589|17027->10625|17121->10709|17163->10711|17209->10728|17406->10897|17501->10981|17543->10983|17597->11008|17668->11051|17684->11057|17734->11085|17833->11152|17883->11174|17937->11218|17978->11220|18032->11245|18103->11288|18119->11294|18172->11325|18277->11398|18327->11420|18381->11464|18422->11466|18476->11491|18547->11534|18563->11540|18597->11552|18697->11620|18747->11642|18801->11686|18842->11688|18896->11713|18967->11756|18983->11762|19023->11780|19116->11841|19166->11863|19220->11907|19261->11909|19315->11934|19386->11977|19402->11983|19442->12001|19540->12067|19590->12089|19644->12133|19685->12135|19739->12160|19810->12203|19826->12209|19870->12231|19964->12293|20014->12315|20068->12359|20109->12361|20163->12386|20234->12429|20250->12435|20310->12473|20425->12556|20475->12578|20529->12622|20570->12624|20624->12649|20695->12692|20711->12698|20758->12723|20866->12799|20916->12821|20970->12865|21011->12867|21065->12892|21136->12935|21152->12941|21200->12967|21309->13044|21359->13066|21413->13110|21454->13112|21508->13137|21579->13180|21595->13186|21645->13214|21752->13289|21802->13311|21856->13355|21897->13357|21951->13382|22022->13425|22038->13431|22091->13462|22201->13540|22251->13562|22305->13606|22346->13608|22400->13633|22471->13676|22487->13682|22547->13720|22668->13809|22718->13831|22772->13875|22813->13877|22867->13902|22938->13945|22954->13951|23026->14001|23130->14073|23180->14095|23234->14139|23275->14141|23329->14166|23400->14209|23416->14215|23467->14244|23583->14328|23633->14350|23687->14394|23728->14396|23782->14421|23853->14464|23869->14470|23921->14500|24026->14573|24076->14595|24130->14639|24171->14641|24225->14666|24296->14709|24312->14715|24354->14735|24448->14797|24498->14819|24552->14863|24593->14865|24647->14890|24718->14933|24734->14939|24781->14964|24887->15038|24937->15060|24991->15104|25032->15106|25086->15131|25157->15174|25173->15180|25223->15208|25335->15288|25386->15311|25440->15355|25481->15357|25535->15382|25606->15425|25622->15431|25670->15457|25779->15534|25830->15557|25884->15601|25925->15603|25979->15628|26050->15671|26066->15677|26119->15708|26225->15782|26275->15804|26329->15848|26370->15850|26424->15875|26495->15918|26511->15924|26563->15954|26671->16030|26721->16052|26775->16096|26816->16098|26870->16123|26941->16166|26957->16172|27007->16200|27116->16277|27166->16299|27220->16343|27261->16345|27315->16370|27386->16413|27402->16419|27453->16448|27570->16533|27620->16555|27674->16599|27715->16601|27769->16626|27840->16669|27856->16675|27905->16702|28013->16778|28063->16800|28117->16844|28158->16846|28212->16871|28283->16914|28299->16920|28346->16945|28452->17019|28499->17037|28598->17104|28640->17117|28704->17153|28758->17197|28799->17199|28845->17216|29031->17374|29085->17418|29126->17420|29176->17441|29243->17480|29259->17486|29309->17514|29406->17579|29452->17596|29551->17663|29593->17676|29657->17712|29711->17756|29752->17758|29798->17775|29836->17785|29852->17791|29892->17809|29986->17871|30028->17884|30092->17920|30146->17964|30187->17966|30233->17983|30460->18182|30476->18188|30524->18214|30660->18322|30676->18328|30717->18347|30844->18446|30860->18452|30907->18477|31040->18582|31056->18588|31100->18610|31230->18712|31246->18718|31285->18735|31411->18833|31427->18839|31465->18855|31617->18975|31659->18988
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|166->135|167->136|167->136|167->136|168->137|169->138|169->138|169->138|171->140|172->141|172->141|172->141|173->142|174->143|174->143|174->143|177->146|178->147|178->147|178->147|179->148|180->149|180->149|180->149|183->152|184->153|184->153|184->153|185->154|186->155|186->155|186->155|188->157|189->158|189->158|189->158|190->159|191->160|191->160|191->160|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|200->169|201->170|201->170|201->170|202->171|203->172|203->172|203->172|206->175|207->176|209->178|210->179|212->181|212->181|212->181|213->182|215->184|215->184|215->184|216->185|217->186|217->186|217->186|219->188|220->189|220->189|220->189|221->190|222->191|222->191|222->191|224->193|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|230->199|230->199|230->199|231->200|232->201|232->201|232->201|234->203|235->204|235->204|235->204|236->205|237->206|237->206|237->206|239->208|240->209|240->209|240->209|241->210|242->211|242->211|242->211|244->213|245->214|245->214|245->214|246->215|247->216|247->216|247->216|249->218|250->219|250->219|250->219|251->220|252->221|252->221|252->221|254->223|255->224|255->224|255->224|256->225|257->226|257->226|257->226|259->228|260->229|260->229|260->229|261->230|262->231|262->231|262->231|264->233|265->234|265->234|265->234|266->235|267->236|267->236|267->236|269->238|270->239|270->239|270->239|271->240|272->241|272->241|272->241|274->243|275->244|275->244|275->244|276->245|277->246|277->246|277->246|279->248|280->249|280->249|280->249|281->250|282->251|282->251|282->251|284->253|285->254|285->254|285->254|286->255|287->256|287->256|287->256|289->258|290->259|290->259|290->259|291->260|292->261|292->261|292->261|294->263|295->264|295->264|295->264|296->265|297->266|297->266|297->266|299->268|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|306->275|306->275|306->275|307->276|308->277|308->277|308->277|310->279|312->281|312->281|312->281|313->282|314->283|314->283|314->283|316->285|317->286|317->286|317->286|318->287|319->288|319->288|319->288|321->290|322->291|322->291|322->291|323->292|324->293|324->293|324->293|326->295|327->296|327->296|327->296|328->297|329->298|329->298|329->298|331->300|332->301|332->301|332->301|333->302|334->303|334->303|334->303|336->305|337->306|337->306|337->306|338->307|339->308|339->308|339->308|341->310|343->312|345->314|346->315|348->317|348->317|348->317|349->318|351->320|351->320|351->320|352->321|353->322|353->322|353->322|355->324|356->325|358->327|359->328|361->330|361->330|361->330|362->331|362->331|362->331|362->331|363->332|364->333|366->335|366->335|366->335|367->336|370->339|370->339|370->339|373->342|373->342|373->342|376->345|376->345|376->345|379->348|379->348|379->348|382->351|382->351|382->351|385->354|385->354|385->354|389->358|390->359
                  -- GENERATED --
              */
          