
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
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.index()),format.raw/*21.69*/("""">Zobrazit DČPS</a>
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.StatisticController.studyPlansTable()),format.raw/*22.79*/("""">Zobrazit SP</a>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.EmployeesController.info(session().get("uid"))),format.raw/*23.88*/("""">Info</a>
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.StatisticController.listEmployeerActvitiy(session().get("uid"))),format.raw/*24.105*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*26.35*/routes/*26.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("uid"))),format.raw/*26.122*/("""'>
                            Má výuka</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*34.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*34.98*/ {_display_(Seq[Any](format.raw/*34.100*/("""
                """),format.raw/*35.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy a výstupy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*37.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*37.106*/ {_display_(Seq[Any](format.raw/*37.108*/("""
                        """),format.raw/*38.25*/("""<li>
                            <a href='"""),_display_(/*39.39*/routes/*39.45*/.TableController.listClassrooms()),format.raw/*39.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*42.22*/("""
                    """),_display_(/*43.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*43.106*/ {_display_(Seq[Any](format.raw/*43.108*/("""
                        """),format.raw/*44.25*/("""<li>
                            <a href='"""),_display_(/*45.39*/routes/*45.45*/.TableController.listAccessRole()),format.raw/*45.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*48.22*/("""
                    """),_display_(/*49.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*49.106*/ {_display_(Seq[Any](format.raw/*49.108*/("""
                        """),format.raw/*50.25*/("""<li>
                            <a href='"""),_display_(/*51.39*/routes/*51.45*/.TableController.listTeachersRole()),format.raw/*51.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*54.22*/("""
                    """),_display_(/*55.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*55.106*/ {_display_(Seq[Any](format.raw/*55.108*/("""
                        """),format.raw/*56.25*/("""<li>
                            <a href='"""),_display_(/*57.39*/routes/*57.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*57.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*60.22*/("""

                    """),_display_(/*62.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*62.106*/ {_display_(Seq[Any](format.raw/*62.108*/("""
                        """),format.raw/*63.25*/("""<li>
                            <a href='"""),_display_(/*64.39*/routes/*64.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*64.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*67.22*/("""
                    """),_display_(/*68.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*68.106*/ {_display_(Seq[Any](format.raw/*68.108*/("""
                        """),format.raw/*69.25*/("""<li>
                            <a href='"""),_display_(/*70.39*/routes/*70.45*/.TableController.listPerson()),format.raw/*70.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*73.22*/("""
                    """),_display_(/*74.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*74.106*/ {_display_(Seq[Any](format.raw/*74.108*/("""
                        """),format.raw/*75.25*/("""<li>
                            <a href='"""),_display_(/*76.39*/routes/*76.45*/.TableController.listStudyPlans()),format.raw/*76.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*79.22*/("""
                    """),_display_(/*80.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*80.106*/ {_display_(Seq[Any](format.raw/*80.108*/("""
                        """),format.raw/*81.25*/("""<li>
                            <a href='"""),_display_(/*82.39*/routes/*82.45*/.TableController.listScheduleInWeeks()),format.raw/*82.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*85.22*/("""
                    """),_display_(/*86.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*86.106*/ {_display_(Seq[Any](format.raw/*86.108*/("""
                        """),format.raw/*87.25*/("""<li>
                            <a href='"""),_display_(/*88.39*/routes/*88.45*/.TableController.listSchedule()),format.raw/*88.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*91.22*/("""
                    """),_display_(/*92.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*92.106*/ {_display_(Seq[Any](format.raw/*92.108*/("""
                        """),format.raw/*93.25*/("""<li>
                            <a href='"""),_display_(/*94.39*/routes/*94.45*/.TableController.listEmployees()),format.raw/*94.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*97.22*/("""
                    """),_display_(/*98.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*98.106*/ {_display_(Seq[Any](format.raw/*98.108*/("""
                        """),format.raw/*99.25*/("""<li>
                            <a href='"""),_display_(/*100.39*/routes/*100.45*/.TableController.listTeachers()),format.raw/*100.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*103.22*/("""
                    """),_display_(/*104.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*104.106*/ {_display_(Seq[Any](format.raw/*104.108*/("""
                        """),format.raw/*105.25*/("""<li>
                            <a href='"""),_display_(/*106.39*/routes/*106.45*/.TableController.listStudyGroups()),format.raw/*106.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*109.22*/("""
                    """),_display_(/*110.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*110.106*/ {_display_(Seq[Any](format.raw/*110.108*/("""
                        """),format.raw/*111.25*/("""<li>
                            <a href='"""),_display_(/*112.39*/routes/*112.45*/.TableController.listSemesters()),format.raw/*112.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*115.22*/("""
                    """),_display_(/*116.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*116.106*/ {_display_(Seq[Any](format.raw/*116.108*/("""
                        """),format.raw/*117.25*/("""<li>
                            <a href='"""),_display_(/*118.39*/routes/*118.45*/.TableController.listSubjects()),format.raw/*118.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*122.106*/ {_display_(Seq[Any](format.raw/*122.108*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listFieldsOfStudy()),format.raw/*124.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*128.106*/ {_display_(Seq[Any](format.raw/*128.108*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCourses()),format.raw/*130.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*132.22*/("""
                    """),_display_(/*133.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*133.106*/ {_display_(Seq[Any](format.raw/*133.108*/("""
                        """),format.raw/*134.25*/("""<li>
                            <a href='"""),_display_(/*135.39*/routes/*135.45*/.TableController.listCurrentSemesters()),format.raw/*135.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*139.106*/ {_display_(Seq[Any](format.raw/*139.108*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href='"""),_display_(/*141.39*/routes/*141.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*141.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*145.106*/ {_display_(Seq[Any](format.raw/*145.108*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listDays()),format.raw/*147.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*150.106*/ {_display_(Seq[Any](format.raw/*150.108*/("""
                        """),format.raw/*151.25*/("""<li>
                            <a href='"""),_display_(/*152.39*/routes/*152.45*/.TableController.listCommittees()),format.raw/*152.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*155.22*/("""
                    """),_display_(/*156.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*156.106*/ {_display_(Seq[Any](format.raw/*156.108*/("""
                        """),format.raw/*157.25*/("""<li>
                            <a href='"""),_display_(/*158.39*/routes/*158.45*/.TableController.listPublications()),format.raw/*158.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*161.22*/("""
                    """),_display_(/*162.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*162.106*/ {_display_(Seq[Any](format.raw/*162.108*/("""
                        """),format.raw/*163.25*/("""<li>
                            <a href='"""),_display_(/*164.39*/routes/*164.45*/.TableController.listTeachersInWeeks()),format.raw/*164.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*167.22*/("""
                """),format.raw/*168.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*170.14*/("""
            """),format.raw/*171.13*/("""</li>
            <li>
            """),_display_(/*173.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*173.98*/ {_display_(Seq[Any](format.raw/*173.100*/("""
                """),format.raw/*174.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*176.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*176.106*/ {_display_(Seq[Any](format.raw/*176.108*/("""
                        """),format.raw/*177.25*/("""<li>
                            <a href=""""),_display_(/*178.39*/routes/*178.45*/.ClassroomController.index()),format.raw/*178.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*180.22*/("""
                    """),_display_(/*181.22*/if(session().get("role").equals("director"))/*181.66*/ {_display_(Seq[Any](format.raw/*181.68*/("""
                        """),format.raw/*182.25*/("""<li>
                            <a href=""""),_display_(/*183.39*/routes/*183.45*/.TeachersRoleController.index()),format.raw/*183.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*185.22*/("""
                    """),_display_(/*186.22*/if(session().get("role").equals("director"))/*186.66*/ {_display_(Seq[Any](format.raw/*186.68*/("""
                        """),format.raw/*187.25*/("""<li>
                            <a href=""""),_display_(/*188.39*/routes/*188.45*/.Pages.blank),format.raw/*188.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*190.22*/("""
                    """),_display_(/*191.22*/if(session().get("role").equals("director"))/*191.66*/ {_display_(Seq[Any](format.raw/*191.68*/("""
                        """),format.raw/*192.25*/("""<li>
                            <a href=""""),_display_(/*193.39*/routes/*193.45*/.Application.pdf()),format.raw/*193.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*195.22*/("""
                    """),_display_(/*196.22*/if(session().get("role").equals("director"))/*196.66*/ {_display_(Seq[Any](format.raw/*196.68*/("""
                        """),format.raw/*197.25*/("""<li>
                            <a href=""""),_display_(/*198.39*/routes/*198.45*/.Application.raw()),format.raw/*198.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*200.22*/("""
                    """),_display_(/*201.22*/if(session().get("role").equals("director"))/*201.66*/ {_display_(Seq[Any](format.raw/*201.68*/("""
                        """),format.raw/*202.25*/("""<li>
                            <a href=""""),_display_(/*203.39*/routes/*203.45*/.TestController.test()),format.raw/*203.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*205.22*/("""
                    """),_display_(/*206.22*/if(session().get("role").equals("director"))/*206.66*/ {_display_(Seq[Any](format.raw/*206.68*/("""
                        """),format.raw/*207.25*/("""<li>
                            <a href=""""),_display_(/*208.39*/routes/*208.45*/.SubjectPlanTeachingController.index()),format.raw/*208.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*210.22*/("""
                    """),_display_(/*211.22*/if(session().get("role").equals("director"))/*211.66*/ {_display_(Seq[Any](format.raw/*211.68*/("""
                        """),format.raw/*212.25*/("""<li>
                            <a href=""""),_display_(/*213.39*/routes/*213.45*/.VisitsController.index()),format.raw/*213.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*215.22*/("""
                    """),_display_(/*216.22*/if(session().get("role").equals("director"))/*216.66*/ {_display_(Seq[Any](format.raw/*216.68*/("""
                        """),format.raw/*217.25*/("""<li>
                            <a href=""""),_display_(/*218.39*/routes/*218.45*/.ProjectController.index()),format.raw/*218.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*220.22*/("""
                    """),_display_(/*221.22*/if(session().get("role").equals("director"))/*221.66*/ {_display_(Seq[Any](format.raw/*221.68*/("""
                        """),format.raw/*222.25*/("""<li>
                            <a href=""""),_display_(/*223.39*/routes/*223.45*/.CommitteeController.index()),format.raw/*223.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*225.22*/("""
                    """),_display_(/*226.22*/if(session().get("role").equals("director"))/*226.66*/ {_display_(Seq[Any](format.raw/*226.68*/("""
                        """),format.raw/*227.25*/("""<li>
                            <a href=""""),_display_(/*228.39*/routes/*228.45*/.PublicationsController.index()),format.raw/*228.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*230.22*/("""
                    """),_display_(/*231.22*/if(session().get("role").equals("director"))/*231.66*/ {_display_(Seq[Any](format.raw/*231.68*/("""
                        """),format.raw/*232.25*/("""<li>
                            <a href=""""),_display_(/*233.39*/routes/*233.45*/.OrganizationalUnitsController.index()),format.raw/*233.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*235.22*/("""
                    """),_display_(/*236.22*/if(session().get("role").equals("director"))/*236.66*/ {_display_(Seq[Any](format.raw/*236.68*/("""
                        """),format.raw/*237.25*/("""<li>
                            <a href=""""),_display_(/*238.39*/routes/*238.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*238.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*240.22*/("""
                    """),_display_(/*241.22*/if(session().get("role").equals("director"))/*241.66*/ {_display_(Seq[Any](format.raw/*241.68*/("""
                        """),format.raw/*242.25*/("""<li>
                            <a href=""""),_display_(/*243.39*/routes/*243.45*/.FinalWorksController.index()),format.raw/*243.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*245.22*/("""
                    """),_display_(/*246.22*/if(session().get("role").equals("director"))/*246.66*/ {_display_(Seq[Any](format.raw/*246.68*/("""
                        """),format.raw/*247.25*/("""<li>
                            <a href=""""),_display_(/*248.39*/routes/*248.45*/.Application.kpiChoosePerson()),format.raw/*248.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*250.22*/("""
                    """),_display_(/*251.22*/if(session().get("role").equals("director"))/*251.66*/ {_display_(Seq[Any](format.raw/*251.68*/("""
                        """),format.raw/*252.25*/("""<li>
                            <a href=""""),_display_(/*253.39*/routes/*253.45*/.Application.roles()),format.raw/*253.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*255.22*/("""
                    """),_display_(/*256.22*/if(session().get("role").equals("director"))/*256.66*/ {_display_(Seq[Any](format.raw/*256.68*/("""
                        """),format.raw/*257.25*/("""<li>
                            <a href=""""),_display_(/*258.39*/routes/*258.45*/.PersonController.index()),format.raw/*258.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*260.22*/("""
                    """),_display_(/*261.22*/if(session().get("role").equals("director"))/*261.66*/ {_display_(Seq[Any](format.raw/*261.68*/("""
                        """),format.raw/*262.25*/("""<li>
                            <a href=""""),_display_(/*263.39*/routes/*263.45*/.EmployeesController.index()),format.raw/*263.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*265.22*/("""

                    """),_display_(/*267.22*/if(session().get("role").equals("director"))/*267.66*/ {_display_(Seq[Any](format.raw/*267.68*/("""
                        """),format.raw/*268.25*/("""<li>
                            <a href=""""),_display_(/*269.39*/routes/*269.45*/.SubjectController.index()),format.raw/*269.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*271.22*/("""

                    """),_display_(/*273.22*/if(session().get("role").equals("director"))/*273.66*/ {_display_(Seq[Any](format.raw/*273.68*/("""
                        """),format.raw/*274.25*/("""<li>
                            <a href=""""),_display_(/*275.39*/routes/*275.45*/.FieldOfStudyController.index()),format.raw/*275.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*277.22*/("""
                    """),_display_(/*278.22*/if(session().get("role").equals("director"))/*278.66*/ {_display_(Seq[Any](format.raw/*278.68*/("""
                        """),format.raw/*279.25*/("""<li>
                            <a href=""""),_display_(/*280.39*/routes/*280.45*/.StudyGroupsController.index()),format.raw/*280.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*282.22*/("""
                    """),_display_(/*283.22*/if(session().get("role").equals("director"))/*283.66*/ {_display_(Seq[Any](format.raw/*283.68*/("""
                        """),format.raw/*284.25*/("""<li>
                            <a href=""""),_display_(/*285.39*/routes/*285.45*/.SemestersController.index()),format.raw/*285.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*287.22*/("""
                    """),_display_(/*288.22*/if(session().get("role").equals("director"))/*288.66*/ {_display_(Seq[Any](format.raw/*288.68*/("""
                        """),format.raw/*289.25*/("""<li>
                            <a href=""""),_display_(/*290.39*/routes/*290.45*/.StudyPlansController.index()),format.raw/*290.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*292.22*/("""
                    """),_display_(/*293.22*/if(session().get("role").equals("director"))/*293.66*/ {_display_(Seq[Any](format.raw/*293.68*/("""
                        """),format.raw/*294.25*/("""<li>
                            <a href=""""),_display_(/*295.39*/routes/*295.45*/.TeachersController.index()),format.raw/*295.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*297.22*/("""
                    """),_display_(/*298.22*/if(session().get("role").equals("director"))/*298.66*/ {_display_(Seq[Any](format.raw/*298.68*/("""
                        """),format.raw/*299.25*/("""<li>
                            <a href=""""),_display_(/*300.39*/routes/*300.45*/.CourseController.index()),format.raw/*300.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*302.22*/("""

                """),format.raw/*304.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*306.14*/("""
            """),format.raw/*307.13*/("""</li>
            <li>
            """),_display_(/*309.14*/if(session().get("role").equals("director"))/*309.58*/ {_display_(Seq[Any](format.raw/*309.60*/("""
                """),format.raw/*310.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*312.18*/if(session().get("role").equals("director"))/*312.62*/ {_display_(Seq[Any](format.raw/*312.64*/("""
                    """),format.raw/*313.21*/("""<li>
                        <a href=""""),_display_(/*314.35*/routes/*314.41*/.MethodicsController.index()),format.raw/*314.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*316.18*/("""
                """),format.raw/*317.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*319.14*/("""
            """),format.raw/*320.13*/("""</li>
            <li>
            """),_display_(/*322.14*/if(session().get("role").equals("director"))/*322.58*/ {_display_(Seq[Any](format.raw/*322.60*/("""
                """),format.raw/*323.17*/("""<a href='"""),_display_(/*323.27*/routes/*323.33*/.Application.forms),format.raw/*323.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*324.14*/("""
            """),format.raw/*325.13*/("""</li>
            <li>
            """),_display_(/*327.14*/if(session().get("role").equals("director"))/*327.58*/ {_display_(Seq[Any](format.raw/*327.60*/("""
                """),format.raw/*328.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*331.35*/routes/*331.41*/.UiElements.panelsAndWells),format.raw/*331.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*334.35*/routes/*334.41*/.UiElements.buttons),format.raw/*334.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*337.35*/routes/*337.41*/.UiElements.notifications),format.raw/*337.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*340.35*/routes/*340.41*/.UiElements.typography),format.raw/*340.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*343.35*/routes/*343.41*/.UiElements.icons),format.raw/*343.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*346.35*/routes/*346.41*/.UiElements.grid),format.raw/*346.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*350.14*/("""
            """),format.raw/*351.13*/("""</li>
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
                  DATE: Sat May 13 11:42:14 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 59356f18f2ea14718c51b846af5a675e47ca96d2
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2029->915|2044->921|2107->963|2184->1013|2199->1019|2262->1061|2339->1111|2354->1117|2416->1158|2492->1207|2507->1213|2556->1241|2637->1295|2652->1301|2711->1339|2790->1391|2805->1397|2873->1444|2945->1489|2960->1495|3046->1559|3175->1661|3190->1667|3293->1748|3509->1937|3602->2021|3643->2023|3688->2040|3883->2208|3977->2292|4018->2294|4071->2319|4141->2362|4156->2368|4210->2401|4374->2534|4423->2556|4517->2640|4558->2642|4611->2667|4681->2710|4696->2716|4750->2749|4918->2886|4967->2908|5061->2992|5102->2994|5155->3019|5225->3062|5240->3068|5296->3103|5464->3240|5513->3262|5607->3346|5648->3348|5701->3373|5771->3416|5786->3422|5874->3488|6043->3626|6093->3649|6187->3733|6228->3735|6281->3760|6351->3803|6366->3809|6431->3853|6620->4011|6669->4033|6763->4117|6804->4119|6857->4144|6927->4187|6942->4193|6992->4222|7157->4356|7206->4378|7300->4462|7341->4464|7394->4489|7464->4532|7479->4538|7533->4571|7702->4709|7751->4731|7845->4815|7886->4817|7939->4842|8009->4885|8024->4891|8083->4929|8254->5069|8303->5091|8397->5175|8438->5177|8491->5202|8561->5245|8576->5251|8628->5282|8789->5412|8838->5434|8932->5518|8973->5520|9026->5545|9096->5588|9111->5594|9164->5626|9330->5761|9379->5783|9473->5867|9514->5869|9567->5894|9638->5937|9654->5943|9707->5974|9872->6107|9922->6129|10017->6213|10059->6215|10113->6240|10184->6283|10200->6289|10256->6323|10428->6463|10478->6485|10573->6569|10615->6571|10669->6596|10740->6639|10756->6645|10810->6677|10974->6809|11024->6831|11119->6915|11161->6917|11215->6942|11286->6985|11302->6991|11355->7022|11519->7154|11569->7176|11664->7260|11706->7262|11760->7287|11831->7330|11847->7336|11905->7372|12066->7501|12116->7523|12211->7607|12253->7609|12307->7634|12378->7677|12394->7683|12446->7713|12575->7810|12625->7832|12720->7916|12762->7918|12816->7943|12887->7986|12903->7992|12964->8031|13137->8172|13187->8194|13282->8278|13324->8280|13378->8305|13449->8348|13465->8354|13545->8411|13734->8568|13784->8590|13879->8674|13921->8676|13975->8701|14046->8744|14062->8750|14111->8777|14238->8872|14288->8894|14383->8978|14425->8980|14479->9005|14550->9048|14566->9054|14621->9087|14783->9217|14833->9239|14928->9323|14970->9325|15024->9350|15095->9393|15111->9399|15168->9434|15333->9567|15383->9589|15478->9673|15520->9675|15574->9700|15645->9743|15661->9749|15721->9787|15894->9928|15940->9945|16039->10012|16081->10025|16145->10061|16239->10145|16281->10147|16327->10164|16524->10333|16619->10417|16661->10419|16715->10444|16786->10487|16802->10493|16852->10521|16951->10588|17001->10610|17055->10654|17096->10656|17150->10681|17221->10724|17237->10730|17290->10761|17395->10834|17445->10856|17499->10900|17540->10902|17594->10927|17665->10970|17681->10976|17715->10988|17815->11056|17865->11078|17919->11122|17960->11124|18014->11149|18085->11192|18101->11198|18141->11216|18234->11277|18284->11299|18338->11343|18379->11345|18433->11370|18504->11413|18520->11419|18560->11437|18658->11503|18708->11525|18762->11569|18803->11571|18857->11596|18928->11639|18944->11645|18988->11667|19082->11729|19132->11751|19186->11795|19227->11797|19281->11822|19352->11865|19368->11871|19428->11909|19543->11992|19593->12014|19647->12058|19688->12060|19742->12085|19813->12128|19829->12134|19876->12159|19984->12235|20034->12257|20088->12301|20129->12303|20183->12328|20254->12371|20270->12377|20318->12403|20427->12480|20477->12502|20531->12546|20572->12548|20626->12573|20697->12616|20713->12622|20763->12650|20870->12725|20920->12747|20974->12791|21015->12793|21069->12818|21140->12861|21156->12867|21209->12898|21319->12976|21369->12998|21423->13042|21464->13044|21518->13069|21589->13112|21605->13118|21665->13156|21786->13245|21836->13267|21890->13311|21931->13313|21985->13338|22056->13381|22072->13387|22144->13437|22248->13509|22298->13531|22352->13575|22393->13577|22447->13602|22518->13645|22534->13651|22585->13680|22701->13764|22751->13786|22805->13830|22846->13832|22900->13857|22971->13900|22987->13906|23039->13936|23144->14009|23194->14031|23248->14075|23289->14077|23343->14102|23414->14145|23430->14151|23472->14171|23566->14233|23616->14255|23670->14299|23711->14301|23765->14326|23836->14369|23852->14375|23899->14400|24005->14474|24055->14496|24109->14540|24150->14542|24204->14567|24275->14610|24291->14616|24341->14644|24453->14724|24504->14747|24558->14791|24599->14793|24653->14818|24724->14861|24740->14867|24788->14893|24897->14970|24948->14993|25002->15037|25043->15039|25097->15064|25168->15107|25184->15113|25237->15144|25343->15218|25393->15240|25447->15284|25488->15286|25542->15311|25613->15354|25629->15360|25681->15390|25789->15466|25839->15488|25893->15532|25934->15534|25988->15559|26059->15602|26075->15608|26125->15636|26234->15713|26284->15735|26338->15779|26379->15781|26433->15806|26504->15849|26520->15855|26571->15884|26688->15969|26738->15991|26792->16035|26833->16037|26887->16062|26958->16105|26974->16111|27023->16138|27131->16214|27181->16236|27235->16280|27276->16282|27330->16307|27401->16350|27417->16356|27464->16381|27570->16455|27617->16473|27716->16540|27758->16553|27822->16589|27876->16633|27917->16635|27963->16652|28149->16810|28203->16854|28244->16856|28294->16877|28361->16916|28377->16922|28427->16950|28524->17015|28570->17032|28669->17099|28711->17112|28775->17148|28829->17192|28870->17194|28916->17211|28954->17221|28970->17227|29010->17245|29104->17307|29146->17320|29210->17356|29264->17400|29305->17402|29351->17419|29578->17618|29594->17624|29642->17650|29778->17758|29794->17764|29835->17783|29962->17882|29978->17888|30025->17913|30158->18018|30174->18024|30218->18046|30348->18148|30364->18154|30403->18171|30529->18269|30545->18275|30583->18291|30735->18411|30777->18424
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|70->39|70->39|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|79->48|80->49|80->49|80->49|81->50|82->51|82->51|82->51|85->54|86->55|86->55|86->55|87->56|88->57|88->57|88->57|91->60|93->62|93->62|93->62|94->63|95->64|95->64|95->64|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|116->85|117->86|117->86|117->86|118->87|119->88|119->88|119->88|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|128->97|129->98|129->98|129->98|130->99|131->100|131->100|131->100|134->103|135->104|135->104|135->104|136->105|137->106|137->106|137->106|140->109|141->110|141->110|141->110|142->111|143->112|143->112|143->112|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|166->135|166->135|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|186->155|187->156|187->156|187->156|188->157|189->158|189->158|189->158|192->161|193->162|193->162|193->162|194->163|195->164|195->164|195->164|198->167|199->168|201->170|202->171|204->173|204->173|204->173|205->174|207->176|207->176|207->176|208->177|209->178|209->178|209->178|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|216->185|217->186|217->186|217->186|218->187|219->188|219->188|219->188|221->190|222->191|222->191|222->191|223->192|224->193|224->193|224->193|226->195|227->196|227->196|227->196|228->197|229->198|229->198|229->198|231->200|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|267->236|267->236|267->236|268->237|269->238|269->238|269->238|271->240|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|298->267|298->267|298->267|299->268|300->269|300->269|300->269|302->271|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|309->278|309->278|310->279|311->280|311->280|311->280|313->282|314->283|314->283|314->283|315->284|316->285|316->285|316->285|318->287|319->288|319->288|319->288|320->289|321->290|321->290|321->290|323->292|324->293|324->293|324->293|325->294|326->295|326->295|326->295|328->297|329->298|329->298|329->298|330->299|331->300|331->300|331->300|333->302|335->304|337->306|338->307|340->309|340->309|340->309|341->310|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|348->317|350->319|351->320|353->322|353->322|353->322|354->323|354->323|354->323|354->323|355->324|356->325|358->327|358->327|358->327|359->328|362->331|362->331|362->331|365->334|365->334|365->334|368->337|368->337|368->337|371->340|371->340|371->340|374->343|374->343|374->343|377->346|377->346|377->346|381->350|382->351
                  -- GENERATED --
              */
          