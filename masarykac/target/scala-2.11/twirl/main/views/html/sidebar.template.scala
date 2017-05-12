
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
                        <a href='"""),_display_(/*16.35*/routes/*16.41*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*16.107*/("""'>Výuka dle osob</a>
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.PersonalStatisticController.teachingAAA()),format.raw/*17.83*/("""">Výuka AAA</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.PersonalStatisticController.teachingAAB()),format.raw/*18.83*/("""">Výuka AAB</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.PersonalStatisticController.teachingCB()),format.raw/*19.82*/("""">Výuka CB</a>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.StatisticController.index()),format.raw/*20.69*/("""">Zobrazit DČPS</a>
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.studyPlansTable()),format.raw/*21.79*/("""">Zobrazit SP</a>
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.EmployeesController.info(session().get("uid"))),format.raw/*22.88*/("""">Info</a>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.StatisticController.listEmployeerActvitiy(session().get("uid"))),format.raw/*23.105*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*25.35*/routes/*25.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("uid"))),format.raw/*25.122*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*34.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*34.98*/ {_display_(Seq[Any](format.raw/*34.100*/("""
                """),format.raw/*35.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy a výstupy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*37.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*37.105*/ {_display_(Seq[Any](format.raw/*37.107*/("""
                        """),format.raw/*38.25*/("""<li>
                            <a href='"""),_display_(/*39.39*/routes/*39.45*/.TableController.listClassrooms()),format.raw/*39.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*42.22*/("""
                    """),_display_(/*43.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*43.105*/ {_display_(Seq[Any](format.raw/*43.107*/("""
                        """),format.raw/*44.25*/("""<li>
                            <a href='"""),_display_(/*45.39*/routes/*45.45*/.TableController.listAccessRole()),format.raw/*45.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*48.22*/("""
                    """),_display_(/*49.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*49.105*/ {_display_(Seq[Any](format.raw/*49.107*/("""
                        """),format.raw/*50.25*/("""<li>
                            <a href='"""),_display_(/*51.39*/routes/*51.45*/.TableController.listTeachersRole()),format.raw/*51.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*54.22*/("""
                    """),_display_(/*55.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*55.105*/ {_display_(Seq[Any](format.raw/*55.107*/("""
                        """),format.raw/*56.25*/("""<li>
                            <a href='"""),_display_(/*57.39*/routes/*57.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*57.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*60.22*/("""

                    """),_display_(/*62.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*62.105*/ {_display_(Seq[Any](format.raw/*62.107*/("""
                        """),format.raw/*63.25*/("""<li>
                            <a href='"""),_display_(/*64.39*/routes/*64.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*64.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*67.22*/("""
                    """),_display_(/*68.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*68.105*/ {_display_(Seq[Any](format.raw/*68.107*/("""
                        """),format.raw/*69.25*/("""<li>
                            <a href='"""),_display_(/*70.39*/routes/*70.45*/.TableController.listPerson()),format.raw/*70.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*73.22*/("""
                    """),_display_(/*74.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*74.105*/ {_display_(Seq[Any](format.raw/*74.107*/("""
                        """),format.raw/*75.25*/("""<li>
                            <a href='"""),_display_(/*76.39*/routes/*76.45*/.TableController.listStudyPlans()),format.raw/*76.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*79.22*/("""
                    """),_display_(/*80.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*80.105*/ {_display_(Seq[Any](format.raw/*80.107*/("""
                        """),format.raw/*81.25*/("""<li>
                            <a href='"""),_display_(/*82.39*/routes/*82.45*/.TableController.listScheduleInWeeks()),format.raw/*82.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*85.22*/("""
                    """),_display_(/*86.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*86.105*/ {_display_(Seq[Any](format.raw/*86.107*/("""
                        """),format.raw/*87.25*/("""<li>
                            <a href='"""),_display_(/*88.39*/routes/*88.45*/.TableController.listSchedule()),format.raw/*88.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*91.22*/("""
                    """),_display_(/*92.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*92.105*/ {_display_(Seq[Any](format.raw/*92.107*/("""
                        """),format.raw/*93.25*/("""<li>
                            <a href='"""),_display_(/*94.39*/routes/*94.45*/.TableController.listEmployees()),format.raw/*94.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*97.22*/("""
                    """),_display_(/*98.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*98.105*/ {_display_(Seq[Any](format.raw/*98.107*/("""
                        """),format.raw/*99.25*/("""<li>
                            <a href='"""),_display_(/*100.39*/routes/*100.45*/.TableController.listTeachers()),format.raw/*100.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*103.22*/("""
                    """),_display_(/*104.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*104.105*/ {_display_(Seq[Any](format.raw/*104.107*/("""
                        """),format.raw/*105.25*/("""<li>
                            <a href='"""),_display_(/*106.39*/routes/*106.45*/.TableController.listStudyGroups()),format.raw/*106.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*109.22*/("""
                    """),_display_(/*110.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*110.105*/ {_display_(Seq[Any](format.raw/*110.107*/("""
                        """),format.raw/*111.25*/("""<li>
                            <a href='"""),_display_(/*112.39*/routes/*112.45*/.TableController.listSemesters()),format.raw/*112.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*115.22*/("""
                    """),_display_(/*116.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*116.105*/ {_display_(Seq[Any](format.raw/*116.107*/("""
                        """),format.raw/*117.25*/("""<li>
                            <a href='"""),_display_(/*118.39*/routes/*118.45*/.TableController.listSubjects()),format.raw/*118.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*122.105*/ {_display_(Seq[Any](format.raw/*122.107*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listFieldsOfStudy()),format.raw/*124.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*128.105*/ {_display_(Seq[Any](format.raw/*128.107*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCourses()),format.raw/*130.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*132.22*/("""
                    """),_display_(/*133.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*133.105*/ {_display_(Seq[Any](format.raw/*133.107*/("""
                        """),format.raw/*134.25*/("""<li>
                            <a href='"""),_display_(/*135.39*/routes/*135.45*/.TableController.listCurrentSemesters()),format.raw/*135.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*139.105*/ {_display_(Seq[Any](format.raw/*139.107*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href='"""),_display_(/*141.39*/routes/*141.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*141.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*145.105*/ {_display_(Seq[Any](format.raw/*145.107*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listDays()),format.raw/*147.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*150.105*/ {_display_(Seq[Any](format.raw/*150.107*/("""
                        """),format.raw/*151.25*/("""<li>
                            <a href='"""),_display_(/*152.39*/routes/*152.45*/.TableController.listCommittees()),format.raw/*152.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*155.22*/("""
                    """),_display_(/*156.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*156.105*/ {_display_(Seq[Any](format.raw/*156.107*/("""
                        """),format.raw/*157.25*/("""<li>
                            <a href='"""),_display_(/*158.39*/routes/*158.45*/.TableController.listPublications()),format.raw/*158.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*161.22*/("""
                    """),_display_(/*162.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*162.105*/ {_display_(Seq[Any](format.raw/*162.107*/("""
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
            """),_display_(/*173.14*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*173.97*/ {_display_(Seq[Any](format.raw/*173.99*/("""
                """),format.raw/*174.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*176.22*/if(session().get("role").equals("director")|| session().get("role").equals("head"))/*176.105*/ {_display_(Seq[Any](format.raw/*176.107*/("""
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
                  DATE: Fri May 12 13:10:45 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 37f5c918ffbb132830e3ac4f76210a3247ca7f8b
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2000->886|2015->892|2078->934|2155->984|2170->990|2233->1032|2310->1082|2325->1088|2387->1129|2463->1178|2478->1184|2527->1212|2608->1266|2623->1272|2682->1310|2761->1362|2776->1368|2844->1415|2916->1460|2931->1466|3017->1530|3146->1632|3161->1638|3264->1719|3481->1909|3574->1993|3615->1995|3660->2012|3855->2180|3948->2263|3989->2265|4042->2290|4112->2333|4127->2339|4181->2372|4345->2505|4394->2527|4487->2610|4528->2612|4581->2637|4651->2680|4666->2686|4720->2719|4888->2856|4937->2878|5030->2961|5071->2963|5124->2988|5194->3031|5209->3037|5265->3072|5433->3209|5482->3231|5575->3314|5616->3316|5669->3341|5739->3384|5754->3390|5842->3456|6011->3594|6061->3617|6154->3700|6195->3702|6248->3727|6318->3770|6333->3776|6398->3820|6587->3978|6636->4000|6729->4083|6770->4085|6823->4110|6893->4153|6908->4159|6958->4188|7123->4322|7172->4344|7265->4427|7306->4429|7359->4454|7429->4497|7444->4503|7498->4536|7667->4674|7716->4696|7809->4779|7850->4781|7903->4806|7973->4849|7988->4855|8047->4893|8218->5033|8267->5055|8360->5138|8401->5140|8454->5165|8524->5208|8539->5214|8591->5245|8752->5375|8801->5397|8894->5480|8935->5482|8988->5507|9058->5550|9073->5556|9126->5588|9292->5723|9341->5745|9434->5828|9475->5830|9528->5855|9599->5898|9615->5904|9668->5935|9833->6068|9883->6090|9977->6173|10019->6175|10073->6200|10144->6243|10160->6249|10216->6283|10388->6423|10438->6445|10532->6528|10574->6530|10628->6555|10699->6598|10715->6604|10769->6636|10933->6768|10983->6790|11077->6873|11119->6875|11173->6900|11244->6943|11260->6949|11313->6980|11477->7112|11527->7134|11621->7217|11663->7219|11717->7244|11788->7287|11804->7293|11862->7329|12023->7458|12073->7480|12167->7563|12209->7565|12263->7590|12334->7633|12350->7639|12402->7669|12531->7766|12581->7788|12675->7871|12717->7873|12771->7898|12842->7941|12858->7947|12919->7986|13092->8127|13142->8149|13236->8232|13278->8234|13332->8259|13403->8302|13419->8308|13499->8365|13688->8522|13738->8544|13832->8627|13874->8629|13928->8654|13999->8697|14015->8703|14064->8730|14191->8825|14241->8847|14335->8930|14377->8932|14431->8957|14502->9000|14518->9006|14573->9039|14735->9169|14785->9191|14879->9274|14921->9276|14975->9301|15046->9344|15062->9350|15119->9385|15284->9518|15334->9540|15428->9623|15470->9625|15524->9650|15595->9693|15611->9699|15671->9737|15844->9878|15890->9895|15989->9962|16031->9975|16095->10011|16188->10094|16229->10096|16275->10113|16472->10282|16566->10365|16608->10367|16662->10392|16733->10435|16749->10441|16799->10469|16898->10536|16948->10558|17002->10602|17043->10604|17097->10629|17168->10672|17184->10678|17237->10709|17342->10782|17392->10804|17446->10848|17487->10850|17541->10875|17612->10918|17628->10924|17662->10936|17762->11004|17812->11026|17866->11070|17907->11072|17961->11097|18032->11140|18048->11146|18088->11164|18181->11225|18231->11247|18285->11291|18326->11293|18380->11318|18451->11361|18467->11367|18507->11385|18605->11451|18655->11473|18709->11517|18750->11519|18804->11544|18875->11587|18891->11593|18935->11615|19029->11677|19079->11699|19133->11743|19174->11745|19228->11770|19299->11813|19315->11819|19375->11857|19490->11940|19540->11962|19594->12006|19635->12008|19689->12033|19760->12076|19776->12082|19823->12107|19931->12183|19981->12205|20035->12249|20076->12251|20130->12276|20201->12319|20217->12325|20265->12351|20374->12428|20424->12450|20478->12494|20519->12496|20573->12521|20644->12564|20660->12570|20710->12598|20817->12673|20867->12695|20921->12739|20962->12741|21016->12766|21087->12809|21103->12815|21156->12846|21266->12924|21316->12946|21370->12990|21411->12992|21465->13017|21536->13060|21552->13066|21612->13104|21733->13193|21783->13215|21837->13259|21878->13261|21932->13286|22003->13329|22019->13335|22091->13385|22195->13457|22245->13479|22299->13523|22340->13525|22394->13550|22465->13593|22481->13599|22532->13628|22648->13712|22698->13734|22752->13778|22793->13780|22847->13805|22918->13848|22934->13854|22986->13884|23091->13957|23141->13979|23195->14023|23236->14025|23290->14050|23361->14093|23377->14099|23419->14119|23513->14181|23563->14203|23617->14247|23658->14249|23712->14274|23783->14317|23799->14323|23846->14348|23952->14422|24002->14444|24056->14488|24097->14490|24151->14515|24222->14558|24238->14564|24288->14592|24400->14672|24451->14695|24505->14739|24546->14741|24600->14766|24671->14809|24687->14815|24735->14841|24844->14918|24895->14941|24949->14985|24990->14987|25044->15012|25115->15055|25131->15061|25184->15092|25290->15166|25340->15188|25394->15232|25435->15234|25489->15259|25560->15302|25576->15308|25628->15338|25736->15414|25786->15436|25840->15480|25881->15482|25935->15507|26006->15550|26022->15556|26072->15584|26181->15661|26231->15683|26285->15727|26326->15729|26380->15754|26451->15797|26467->15803|26518->15832|26635->15917|26685->15939|26739->15983|26780->15985|26834->16010|26905->16053|26921->16059|26970->16086|27078->16162|27128->16184|27182->16228|27223->16230|27277->16255|27348->16298|27364->16304|27411->16329|27517->16403|27564->16421|27663->16488|27705->16501|27769->16537|27823->16581|27864->16583|27910->16600|28096->16758|28150->16802|28191->16804|28241->16825|28308->16864|28324->16870|28374->16898|28471->16963|28517->16980|28616->17047|28658->17060|28722->17096|28776->17140|28817->17142|28863->17159|28901->17169|28917->17175|28957->17193|29051->17255|29093->17268|29157->17304|29211->17348|29252->17350|29298->17367|29525->17566|29541->17572|29589->17598|29725->17706|29741->17712|29782->17731|29909->17830|29925->17836|29972->17861|30105->17966|30121->17972|30165->17994|30295->18096|30311->18102|30350->18119|30476->18217|30492->18223|30530->18239|30682->18359|30724->18372
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|70->39|70->39|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|79->48|80->49|80->49|80->49|81->50|82->51|82->51|82->51|85->54|86->55|86->55|86->55|87->56|88->57|88->57|88->57|91->60|93->62|93->62|93->62|94->63|95->64|95->64|95->64|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|116->85|117->86|117->86|117->86|118->87|119->88|119->88|119->88|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|128->97|129->98|129->98|129->98|130->99|131->100|131->100|131->100|134->103|135->104|135->104|135->104|136->105|137->106|137->106|137->106|140->109|141->110|141->110|141->110|142->111|143->112|143->112|143->112|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|166->135|166->135|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|186->155|187->156|187->156|187->156|188->157|189->158|189->158|189->158|192->161|193->162|193->162|193->162|194->163|195->164|195->164|195->164|198->167|199->168|201->170|202->171|204->173|204->173|204->173|205->174|207->176|207->176|207->176|208->177|209->178|209->178|209->178|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|216->185|217->186|217->186|217->186|218->187|219->188|219->188|219->188|221->190|222->191|222->191|222->191|223->192|224->193|224->193|224->193|226->195|227->196|227->196|227->196|228->197|229->198|229->198|229->198|231->200|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|267->236|267->236|267->236|268->237|269->238|269->238|269->238|271->240|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|298->267|298->267|298->267|299->268|300->269|300->269|300->269|302->271|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|309->278|309->278|310->279|311->280|311->280|311->280|313->282|314->283|314->283|314->283|315->284|316->285|316->285|316->285|318->287|319->288|319->288|319->288|320->289|321->290|321->290|321->290|323->292|324->293|324->293|324->293|325->294|326->295|326->295|326->295|328->297|329->298|329->298|329->298|330->299|331->300|331->300|331->300|333->302|335->304|337->306|338->307|340->309|340->309|340->309|341->310|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|348->317|350->319|351->320|353->322|353->322|353->322|354->323|354->323|354->323|354->323|355->324|356->325|358->327|358->327|358->327|359->328|362->331|362->331|362->331|365->334|365->334|365->334|368->337|368->337|368->337|371->340|371->340|371->340|374->343|374->343|374->343|377->346|377->346|377->346|381->350|382->351
                  -- GENERATED --
              */
          