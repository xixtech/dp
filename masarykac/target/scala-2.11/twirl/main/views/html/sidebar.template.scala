
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
                        <a href=""""),_display_(/*14.35*/routes/*14.41*/.StatementController.index()),format.raw/*14.69*/("""">Zobrazit všechny výkazy</a>
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
                            <a href='"""),_display_(/*47.39*/routes/*47.45*/.TableController.listVisits()),format.raw/*47.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Výjezdy</a>
                        </li>
                    """)))}),format.raw/*50.22*/("""
                    """),_display_(/*51.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*51.106*/ {_display_(Seq[Any](format.raw/*51.108*/("""
                        """),format.raw/*52.25*/("""<li>
                            <a href='"""),_display_(/*53.39*/routes/*53.45*/.TableController.listOJ()),format.raw/*53.70*/("""'><i class="fa fa-table fa-fw"></i>
                                Organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*57.106*/ {_display_(Seq[Any](format.raw/*57.108*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.TableController.listAccessRole()),format.raw/*59.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*63.106*/ {_display_(Seq[Any](format.raw/*63.108*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.TableController.listTeachersRole()),format.raw/*65.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""
                    """),_display_(/*69.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*69.106*/ {_display_(Seq[Any](format.raw/*69.108*/("""
                        """),format.raw/*70.25*/("""<li>
                            <a href='"""),_display_(/*71.39*/routes/*71.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*71.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*74.22*/("""

                    """),_display_(/*76.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*76.106*/ {_display_(Seq[Any](format.raw/*76.108*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*78.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*82.106*/ {_display_(Seq[Any](format.raw/*82.108*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listPerson()),format.raw/*84.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*88.106*/ {_display_(Seq[Any](format.raw/*88.108*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listStudyPlans()),format.raw/*90.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*94.106*/ {_display_(Seq[Any](format.raw/*94.108*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listScheduleInWeeks()),format.raw/*96.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*100.106*/ {_display_(Seq[Any](format.raw/*100.108*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listSchedule()),format.raw/*102.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*106.106*/ {_display_(Seq[Any](format.raw/*106.108*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listEmployees()),format.raw/*108.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*112.106*/ {_display_(Seq[Any](format.raw/*112.108*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listTeachers()),format.raw/*114.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*118.106*/ {_display_(Seq[Any](format.raw/*118.108*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listStudyGroups()),format.raw/*120.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*124.106*/ {_display_(Seq[Any](format.raw/*124.108*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listSemesters()),format.raw/*126.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*130.106*/ {_display_(Seq[Any](format.raw/*130.108*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href='"""),_display_(/*132.39*/routes/*132.45*/.TableController.listSubjects()),format.raw/*132.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*135.22*/("""
                    """),_display_(/*136.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*136.106*/ {_display_(Seq[Any](format.raw/*136.108*/("""
                        """),format.raw/*137.25*/("""<li>
                            <a href='"""),_display_(/*138.39*/routes/*138.45*/.TableController.listFieldsOfStudy()),format.raw/*138.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*141.22*/("""
                    """),_display_(/*142.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*142.106*/ {_display_(Seq[Any](format.raw/*142.108*/("""
                        """),format.raw/*143.25*/("""<li>
                            <a href='"""),_display_(/*144.39*/routes/*144.45*/.TableController.listCourses()),format.raw/*144.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*146.22*/("""
                    """),_display_(/*147.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*147.106*/ {_display_(Seq[Any](format.raw/*147.108*/("""
                        """),format.raw/*148.25*/("""<li>
                            <a href='"""),_display_(/*149.39*/routes/*149.45*/.TableController.listCurrentSemesters()),format.raw/*149.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*152.22*/("""
                    """),_display_(/*153.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*153.106*/ {_display_(Seq[Any](format.raw/*153.108*/("""
                        """),format.raw/*154.25*/("""<li>
                            <a href='"""),_display_(/*155.39*/routes/*155.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*155.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*158.22*/("""
                    """),_display_(/*159.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*159.106*/ {_display_(Seq[Any](format.raw/*159.108*/("""
                        """),format.raw/*160.25*/("""<li>
                            <a href='"""),_display_(/*161.39*/routes/*161.45*/.TableController.listDays()),format.raw/*161.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*164.106*/ {_display_(Seq[Any](format.raw/*164.108*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href='"""),_display_(/*166.39*/routes/*166.45*/.TableController.listCommittees()),format.raw/*166.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*170.106*/ {_display_(Seq[Any](format.raw/*170.108*/("""
                        """),format.raw/*171.25*/("""<li>
                            <a href='"""),_display_(/*172.39*/routes/*172.45*/.TableController.listPublications()),format.raw/*172.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*175.22*/("""
                    """),_display_(/*176.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*176.106*/ {_display_(Seq[Any](format.raw/*176.108*/("""
                        """),format.raw/*177.25*/("""<li>
                            <a href='"""),_display_(/*178.39*/routes/*178.45*/.TableController.listTeachersInWeeks()),format.raw/*178.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*181.22*/("""
                """),format.raw/*182.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*184.14*/("""
            """),format.raw/*185.13*/("""</li>
            <li>
            """),_display_(/*187.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*187.98*/ {_display_(Seq[Any](format.raw/*187.100*/("""
                """),format.raw/*188.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*190.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*190.106*/ {_display_(Seq[Any](format.raw/*190.108*/("""
                        """),format.raw/*191.25*/("""<li>
                            <a href=""""),_display_(/*192.39*/routes/*192.45*/.ClassroomController.index()),format.raw/*192.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*194.22*/("""
                    """),_display_(/*195.22*/if(session().get("role").equals("director"))/*195.66*/ {_display_(Seq[Any](format.raw/*195.68*/("""
                        """),format.raw/*196.25*/("""<li>
                            <a href=""""),_display_(/*197.39*/routes/*197.45*/.TeachersRoleController.index()),format.raw/*197.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""
                    """),_display_(/*200.22*/if(session().get("role").equals("director"))/*200.66*/ {_display_(Seq[Any](format.raw/*200.68*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href=""""),_display_(/*202.39*/routes/*202.45*/.Pages.blank),format.raw/*202.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*204.22*/("""
                    """),_display_(/*205.22*/if(session().get("role").equals("director"))/*205.66*/ {_display_(Seq[Any](format.raw/*205.68*/("""
                        """),format.raw/*206.25*/("""<li>
                            <a href=""""),_display_(/*207.39*/routes/*207.45*/.Application.pdf()),format.raw/*207.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*209.22*/("""
                    """),_display_(/*210.22*/if(session().get("role").equals("director"))/*210.66*/ {_display_(Seq[Any](format.raw/*210.68*/("""
                        """),format.raw/*211.25*/("""<li>
                            <a href=""""),_display_(/*212.39*/routes/*212.45*/.Application.raw()),format.raw/*212.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*214.22*/("""
                    """),_display_(/*215.22*/if(session().get("role").equals("director"))/*215.66*/ {_display_(Seq[Any](format.raw/*215.68*/("""
                        """),format.raw/*216.25*/("""<li>
                            <a href=""""),_display_(/*217.39*/routes/*217.45*/.TestController.test()),format.raw/*217.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*219.22*/("""
                    """),_display_(/*220.22*/if(session().get("role").equals("director"))/*220.66*/ {_display_(Seq[Any](format.raw/*220.68*/("""
                        """),format.raw/*221.25*/("""<li>
                            <a href=""""),_display_(/*222.39*/routes/*222.45*/.SubjectPlanTeachingController.index()),format.raw/*222.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*224.22*/("""
                    """),_display_(/*225.22*/if(session().get("role").equals("director"))/*225.66*/ {_display_(Seq[Any](format.raw/*225.68*/("""
                        """),format.raw/*226.25*/("""<li>
                            <a href=""""),_display_(/*227.39*/routes/*227.45*/.VisitsController.index()),format.raw/*227.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*229.22*/("""
                    """),_display_(/*230.22*/if(session().get("role").equals("director"))/*230.66*/ {_display_(Seq[Any](format.raw/*230.68*/("""
                        """),format.raw/*231.25*/("""<li>
                            <a href=""""),_display_(/*232.39*/routes/*232.45*/.ProjectController.index()),format.raw/*232.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*234.22*/("""
                    """),_display_(/*235.22*/if(session().get("role").equals("director"))/*235.66*/ {_display_(Seq[Any](format.raw/*235.68*/("""
                        """),format.raw/*236.25*/("""<li>
                            <a href=""""),_display_(/*237.39*/routes/*237.45*/.CommitteeController.index()),format.raw/*237.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*239.22*/("""
                    """),_display_(/*240.22*/if(session().get("role").equals("director"))/*240.66*/ {_display_(Seq[Any](format.raw/*240.68*/("""
                        """),format.raw/*241.25*/("""<li>
                            <a href=""""),_display_(/*242.39*/routes/*242.45*/.PublicationsController.index()),format.raw/*242.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*244.22*/("""
                    """),_display_(/*245.22*/if(session().get("role").equals("director"))/*245.66*/ {_display_(Seq[Any](format.raw/*245.68*/("""
                        """),format.raw/*246.25*/("""<li>
                            <a href=""""),_display_(/*247.39*/routes/*247.45*/.OrganizationalUnitsController.index()),format.raw/*247.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*249.22*/("""
                    """),_display_(/*250.22*/if(session().get("role").equals("director"))/*250.66*/ {_display_(Seq[Any](format.raw/*250.68*/("""
                        """),format.raw/*251.25*/("""<li>
                            <a href=""""),_display_(/*252.39*/routes/*252.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*252.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*254.22*/("""
                    """),_display_(/*255.22*/if(session().get("role").equals("director"))/*255.66*/ {_display_(Seq[Any](format.raw/*255.68*/("""
                        """),format.raw/*256.25*/("""<li>
                            <a href=""""),_display_(/*257.39*/routes/*257.45*/.FinalWorksController.index()),format.raw/*257.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*259.22*/("""
                    """),_display_(/*260.22*/if(session().get("role").equals("director"))/*260.66*/ {_display_(Seq[Any](format.raw/*260.68*/("""
                        """),format.raw/*261.25*/("""<li>
                            <a href=""""),_display_(/*262.39*/routes/*262.45*/.Application.kpiChoosePerson()),format.raw/*262.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*264.22*/("""
                    """),_display_(/*265.22*/if(session().get("role").equals("director"))/*265.66*/ {_display_(Seq[Any](format.raw/*265.68*/("""
                        """),format.raw/*266.25*/("""<li>
                            <a href=""""),_display_(/*267.39*/routes/*267.45*/.Application.roles()),format.raw/*267.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*269.22*/("""
                    """),_display_(/*270.22*/if(session().get("role").equals("director"))/*270.66*/ {_display_(Seq[Any](format.raw/*270.68*/("""
                        """),format.raw/*271.25*/("""<li>
                            <a href=""""),_display_(/*272.39*/routes/*272.45*/.PersonController.index()),format.raw/*272.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*274.22*/("""
                    """),_display_(/*275.22*/if(session().get("role").equals("director"))/*275.66*/ {_display_(Seq[Any](format.raw/*275.68*/("""
                        """),format.raw/*276.25*/("""<li>
                            <a href=""""),_display_(/*277.39*/routes/*277.45*/.EmployeesController.index()),format.raw/*277.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*279.22*/("""

                    """),_display_(/*281.22*/if(session().get("role").equals("director"))/*281.66*/ {_display_(Seq[Any](format.raw/*281.68*/("""
                        """),format.raw/*282.25*/("""<li>
                            <a href=""""),_display_(/*283.39*/routes/*283.45*/.SubjectController.index()),format.raw/*283.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*285.22*/("""

                    """),_display_(/*287.22*/if(session().get("role").equals("director"))/*287.66*/ {_display_(Seq[Any](format.raw/*287.68*/("""
                        """),format.raw/*288.25*/("""<li>
                            <a href=""""),_display_(/*289.39*/routes/*289.45*/.FieldOfStudyController.index()),format.raw/*289.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*291.22*/("""
                    """),_display_(/*292.22*/if(session().get("role").equals("director"))/*292.66*/ {_display_(Seq[Any](format.raw/*292.68*/("""
                        """),format.raw/*293.25*/("""<li>
                            <a href=""""),_display_(/*294.39*/routes/*294.45*/.StudyGroupsController.index()),format.raw/*294.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*296.22*/("""
                    """),_display_(/*297.22*/if(session().get("role").equals("director"))/*297.66*/ {_display_(Seq[Any](format.raw/*297.68*/("""
                        """),format.raw/*298.25*/("""<li>
                            <a href=""""),_display_(/*299.39*/routes/*299.45*/.SemestersController.index()),format.raw/*299.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*301.22*/("""
                    """),_display_(/*302.22*/if(session().get("role").equals("director"))/*302.66*/ {_display_(Seq[Any](format.raw/*302.68*/("""
                        """),format.raw/*303.25*/("""<li>
                            <a href=""""),_display_(/*304.39*/routes/*304.45*/.StudyPlansController.index()),format.raw/*304.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*306.22*/("""
                    """),_display_(/*307.22*/if(session().get("role").equals("director"))/*307.66*/ {_display_(Seq[Any](format.raw/*307.68*/("""
                        """),format.raw/*308.25*/("""<li>
                            <a href=""""),_display_(/*309.39*/routes/*309.45*/.TeachersController.index()),format.raw/*309.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*311.22*/("""
                    """),_display_(/*312.22*/if(session().get("role").equals("director"))/*312.66*/ {_display_(Seq[Any](format.raw/*312.68*/("""
                        """),format.raw/*313.25*/("""<li>
                            <a href=""""),_display_(/*314.39*/routes/*314.45*/.CourseController.index()),format.raw/*314.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*316.22*/("""

                """),format.raw/*318.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*320.14*/("""
            """),format.raw/*321.13*/("""</li>
            <li>
            """),_display_(/*323.14*/if(session().get("role").equals("director"))/*323.58*/ {_display_(Seq[Any](format.raw/*323.60*/("""
                """),format.raw/*324.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*326.18*/if(session().get("role").equals("director"))/*326.62*/ {_display_(Seq[Any](format.raw/*326.64*/("""
                    """),format.raw/*327.21*/("""<li>
                        <a href=""""),_display_(/*328.35*/routes/*328.41*/.MethodicsController.index()),format.raw/*328.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*330.18*/("""
                """),format.raw/*331.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*333.14*/("""
            """),format.raw/*334.13*/("""</li>
            <li>
            """),_display_(/*336.14*/if(session().get("role").equals("director"))/*336.58*/ {_display_(Seq[Any](format.raw/*336.60*/("""
                """),format.raw/*337.17*/("""<a href='"""),_display_(/*337.27*/routes/*337.33*/.Application.forms),format.raw/*337.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*338.14*/("""
            """),format.raw/*339.13*/("""</li>
            <li>
            """),_display_(/*341.14*/if(session().get("role").equals("director"))/*341.58*/ {_display_(Seq[Any](format.raw/*341.60*/("""
                """),format.raw/*342.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*345.35*/routes/*345.41*/.UiElements.panelsAndWells),format.raw/*345.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*348.35*/routes/*348.41*/.UiElements.buttons),format.raw/*348.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*351.35*/routes/*351.41*/.UiElements.notifications),format.raw/*351.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*354.35*/routes/*354.41*/.UiElements.typography),format.raw/*354.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*357.35*/routes/*357.41*/.UiElements.icons),format.raw/*357.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*360.35*/routes/*360.41*/.UiElements.grid),format.raw/*360.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*364.14*/("""
            """),format.raw/*365.13*/("""</li>
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
                  DATE: Tue May 16 13:39:56 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 9fb15c70201b15d7ec0417a4448168297bf85300
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1659->660|1674->666|1731->702|1824->768|1839->774|1927->840|2038->924|2053->930|2116->972|2193->1022|2208->1028|2271->1070|2348->1120|2363->1126|2425->1167|2501->1216|2516->1222|2565->1250|2654->1312|2669->1318|2721->1349|2812->1413|2827->1419|2880->1451|2973->1517|2988->1523|3047->1561|3126->1613|3141->1619|3209->1666|3281->1711|3296->1717|3382->1781|3511->1883|3526->1889|3629->1970|3845->2159|3938->2243|3979->2245|4024->2262|4219->2430|4313->2514|4354->2516|4407->2541|4477->2584|4492->2590|4546->2623|4710->2756|4759->2778|4853->2862|4894->2864|4947->2889|5017->2932|5032->2938|5082->2967|5244->3098|5293->3120|5387->3204|5428->3206|5481->3231|5551->3274|5566->3280|5612->3305|5787->3449|5836->3471|5930->3555|5971->3557|6024->3582|6094->3625|6109->3631|6163->3664|6331->3801|6380->3823|6474->3907|6515->3909|6568->3934|6638->3977|6653->3983|6709->4018|6877->4155|6926->4177|7020->4261|7061->4263|7114->4288|7184->4331|7199->4337|7287->4403|7456->4541|7506->4564|7600->4648|7641->4650|7694->4675|7764->4718|7779->4724|7844->4768|8033->4926|8082->4948|8176->5032|8217->5034|8270->5059|8340->5102|8355->5108|8405->5137|8570->5271|8619->5293|8713->5377|8754->5379|8807->5404|8877->5447|8892->5453|8946->5486|9115->5624|9164->5646|9258->5730|9299->5732|9352->5757|9422->5800|9437->5806|9496->5844|9667->5984|9717->6006|9812->6090|9854->6092|9908->6117|9979->6160|9995->6166|10048->6197|10210->6327|10260->6349|10355->6433|10397->6435|10451->6460|10522->6503|10538->6509|10592->6541|10759->6676|10809->6698|10904->6782|10946->6784|11000->6809|11071->6852|11087->6858|11140->6889|11305->7022|11355->7044|11450->7128|11492->7130|11546->7155|11617->7198|11633->7204|11689->7238|11861->7378|11911->7400|12006->7484|12048->7486|12102->7511|12173->7554|12189->7560|12243->7592|12407->7724|12457->7746|12552->7830|12594->7832|12648->7857|12719->7900|12735->7906|12788->7937|12952->8069|13002->8091|13097->8175|13139->8177|13193->8202|13264->8245|13280->8251|13338->8287|13499->8416|13549->8438|13644->8522|13686->8524|13740->8549|13811->8592|13827->8598|13879->8628|14008->8725|14058->8747|14153->8831|14195->8833|14249->8858|14320->8901|14336->8907|14397->8946|14570->9087|14620->9109|14715->9193|14757->9195|14811->9220|14882->9263|14898->9269|14978->9326|15167->9483|15217->9505|15312->9589|15354->9591|15408->9616|15479->9659|15495->9665|15544->9692|15671->9787|15721->9809|15816->9893|15858->9895|15912->9920|15983->9963|15999->9969|16054->10002|16216->10132|16266->10154|16361->10238|16403->10240|16457->10265|16528->10308|16544->10314|16601->10349|16766->10482|16816->10504|16911->10588|16953->10590|17007->10615|17078->10658|17094->10664|17154->10702|17327->10843|17373->10860|17472->10927|17514->10940|17578->10976|17672->11060|17714->11062|17760->11079|17957->11248|18052->11332|18094->11334|18148->11359|18219->11402|18235->11408|18285->11436|18384->11503|18434->11525|18488->11569|18529->11571|18583->11596|18654->11639|18670->11645|18723->11676|18828->11749|18878->11771|18932->11815|18973->11817|19027->11842|19098->11885|19114->11891|19148->11903|19248->11971|19298->11993|19352->12037|19393->12039|19447->12064|19518->12107|19534->12113|19574->12131|19667->12192|19717->12214|19771->12258|19812->12260|19866->12285|19937->12328|19953->12334|19993->12352|20091->12418|20141->12440|20195->12484|20236->12486|20290->12511|20361->12554|20377->12560|20421->12582|20515->12644|20565->12666|20619->12710|20660->12712|20714->12737|20785->12780|20801->12786|20861->12824|20976->12907|21026->12929|21080->12973|21121->12975|21175->13000|21246->13043|21262->13049|21309->13074|21417->13150|21467->13172|21521->13216|21562->13218|21616->13243|21687->13286|21703->13292|21751->13318|21860->13395|21910->13417|21964->13461|22005->13463|22059->13488|22130->13531|22146->13537|22196->13565|22303->13640|22353->13662|22407->13706|22448->13708|22502->13733|22573->13776|22589->13782|22642->13813|22752->13891|22802->13913|22856->13957|22897->13959|22951->13984|23022->14027|23038->14033|23098->14071|23219->14160|23269->14182|23323->14226|23364->14228|23418->14253|23489->14296|23505->14302|23577->14352|23681->14424|23731->14446|23785->14490|23826->14492|23880->14517|23951->14560|23967->14566|24018->14595|24134->14679|24184->14701|24238->14745|24279->14747|24333->14772|24404->14815|24420->14821|24472->14851|24577->14924|24627->14946|24681->14990|24722->14992|24776->15017|24847->15060|24863->15066|24905->15086|24999->15148|25049->15170|25103->15214|25144->15216|25198->15241|25269->15284|25285->15290|25332->15315|25438->15389|25488->15411|25542->15455|25583->15457|25637->15482|25708->15525|25724->15531|25774->15559|25886->15639|25937->15662|25991->15706|26032->15708|26086->15733|26157->15776|26173->15782|26221->15808|26330->15885|26381->15908|26435->15952|26476->15954|26530->15979|26601->16022|26617->16028|26670->16059|26776->16133|26826->16155|26880->16199|26921->16201|26975->16226|27046->16269|27062->16275|27114->16305|27222->16381|27272->16403|27326->16447|27367->16449|27421->16474|27492->16517|27508->16523|27558->16551|27667->16628|27717->16650|27771->16694|27812->16696|27866->16721|27937->16764|27953->16770|28004->16799|28121->16884|28171->16906|28225->16950|28266->16952|28320->16977|28391->17020|28407->17026|28456->17053|28564->17129|28614->17151|28668->17195|28709->17197|28763->17222|28834->17265|28850->17271|28897->17296|29003->17370|29050->17388|29149->17455|29191->17468|29255->17504|29309->17548|29350->17550|29396->17567|29582->17725|29636->17769|29677->17771|29727->17792|29794->17831|29810->17837|29860->17865|29957->17930|30003->17947|30102->18014|30144->18027|30208->18063|30262->18107|30303->18109|30349->18126|30387->18136|30403->18142|30443->18160|30537->18222|30579->18235|30643->18271|30697->18315|30738->18317|30784->18334|31011->18533|31027->18539|31075->18565|31211->18673|31227->18679|31268->18698|31395->18797|31411->18803|31458->18828|31591->18933|31607->18939|31651->18961|31781->19063|31797->19069|31836->19086|31962->19184|31978->19190|32016->19206|32168->19326|32210->19339
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|72->41|72->41|72->41|75->44|76->45|76->45|76->45|77->46|78->47|78->47|78->47|81->50|82->51|82->51|82->51|83->52|84->53|84->53|84->53|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|105->74|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|166->135|167->136|167->136|167->136|168->137|169->138|169->138|169->138|172->141|173->142|173->142|173->142|174->143|175->144|175->144|175->144|177->146|178->147|178->147|178->147|179->148|180->149|180->149|180->149|183->152|184->153|184->153|184->153|185->154|186->155|186->155|186->155|189->158|190->159|190->159|190->159|191->160|192->161|192->161|192->161|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|200->169|201->170|201->170|201->170|202->171|203->172|203->172|203->172|206->175|207->176|207->176|207->176|208->177|209->178|209->178|209->178|212->181|213->182|215->184|216->185|218->187|218->187|218->187|219->188|221->190|221->190|221->190|222->191|223->192|223->192|223->192|225->194|226->195|226->195|226->195|227->196|228->197|228->197|228->197|230->199|231->200|231->200|231->200|232->201|233->202|233->202|233->202|235->204|236->205|236->205|236->205|237->206|238->207|238->207|238->207|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|245->214|246->215|246->215|246->215|247->216|248->217|248->217|248->217|250->219|251->220|251->220|251->220|252->221|253->222|253->222|253->222|255->224|256->225|256->225|256->225|257->226|258->227|258->227|258->227|260->229|261->230|261->230|261->230|262->231|263->232|263->232|263->232|265->234|266->235|266->235|266->235|267->236|268->237|268->237|268->237|270->239|271->240|271->240|271->240|272->241|273->242|273->242|273->242|275->244|276->245|276->245|276->245|277->246|278->247|278->247|278->247|280->249|281->250|281->250|281->250|282->251|283->252|283->252|283->252|285->254|286->255|286->255|286->255|287->256|288->257|288->257|288->257|290->259|291->260|291->260|291->260|292->261|293->262|293->262|293->262|295->264|296->265|296->265|296->265|297->266|298->267|298->267|298->267|300->269|301->270|301->270|301->270|302->271|303->272|303->272|303->272|305->274|306->275|306->275|306->275|307->276|308->277|308->277|308->277|310->279|312->281|312->281|312->281|313->282|314->283|314->283|314->283|316->285|318->287|318->287|318->287|319->288|320->289|320->289|320->289|322->291|323->292|323->292|323->292|324->293|325->294|325->294|325->294|327->296|328->297|328->297|328->297|329->298|330->299|330->299|330->299|332->301|333->302|333->302|333->302|334->303|335->304|335->304|335->304|337->306|338->307|338->307|338->307|339->308|340->309|340->309|340->309|342->311|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|349->318|351->320|352->321|354->323|354->323|354->323|355->324|357->326|357->326|357->326|358->327|359->328|359->328|359->328|361->330|362->331|364->333|365->334|367->336|367->336|367->336|368->337|368->337|368->337|368->337|369->338|370->339|372->341|372->341|372->341|373->342|376->345|376->345|376->345|379->348|379->348|379->348|382->351|382->351|382->351|385->354|385->354|385->354|388->357|388->357|388->357|391->360|391->360|391->360|395->364|396->365
                  -- GENERATED --
              */
          