
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
                  DATE: Fri May 12 19:58:21 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 77e1ff5d82e6ca5dfa495294978f55e2853aae5f
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2000->886|2015->892|2078->934|2155->984|2170->990|2233->1032|2310->1082|2325->1088|2387->1129|2463->1178|2478->1184|2527->1212|2608->1266|2623->1272|2682->1310|2761->1362|2776->1368|2844->1415|2916->1460|2931->1466|3017->1530|3146->1632|3161->1638|3264->1719|3481->1909|3574->1993|3615->1995|3660->2012|3855->2180|3949->2264|3990->2266|4043->2291|4113->2334|4128->2340|4182->2373|4346->2506|4395->2528|4489->2612|4530->2614|4583->2639|4653->2682|4668->2688|4722->2721|4890->2858|4939->2880|5033->2964|5074->2966|5127->2991|5197->3034|5212->3040|5268->3075|5436->3212|5485->3234|5579->3318|5620->3320|5673->3345|5743->3388|5758->3394|5846->3460|6015->3598|6065->3621|6159->3705|6200->3707|6253->3732|6323->3775|6338->3781|6403->3825|6592->3983|6641->4005|6735->4089|6776->4091|6829->4116|6899->4159|6914->4165|6964->4194|7129->4328|7178->4350|7272->4434|7313->4436|7366->4461|7436->4504|7451->4510|7505->4543|7674->4681|7723->4703|7817->4787|7858->4789|7911->4814|7981->4857|7996->4863|8055->4901|8226->5041|8275->5063|8369->5147|8410->5149|8463->5174|8533->5217|8548->5223|8600->5254|8761->5384|8810->5406|8904->5490|8945->5492|8998->5517|9068->5560|9083->5566|9136->5598|9302->5733|9351->5755|9445->5839|9486->5841|9539->5866|9610->5909|9626->5915|9679->5946|9844->6079|9894->6101|9989->6185|10031->6187|10085->6212|10156->6255|10172->6261|10228->6295|10400->6435|10450->6457|10545->6541|10587->6543|10641->6568|10712->6611|10728->6617|10782->6649|10946->6781|10996->6803|11091->6887|11133->6889|11187->6914|11258->6957|11274->6963|11327->6994|11491->7126|11541->7148|11636->7232|11678->7234|11732->7259|11803->7302|11819->7308|11877->7344|12038->7473|12088->7495|12183->7579|12225->7581|12279->7606|12350->7649|12366->7655|12418->7685|12547->7782|12597->7804|12692->7888|12734->7890|12788->7915|12859->7958|12875->7964|12936->8003|13109->8144|13159->8166|13254->8250|13296->8252|13350->8277|13421->8320|13437->8326|13517->8383|13706->8540|13756->8562|13851->8646|13893->8648|13947->8673|14018->8716|14034->8722|14083->8749|14210->8844|14260->8866|14355->8950|14397->8952|14451->8977|14522->9020|14538->9026|14593->9059|14755->9189|14805->9211|14900->9295|14942->9297|14996->9322|15067->9365|15083->9371|15140->9406|15305->9539|15355->9561|15450->9645|15492->9647|15546->9672|15617->9715|15633->9721|15693->9759|15866->9900|15912->9917|16011->9984|16053->9997|16117->10033|16211->10117|16253->10119|16299->10136|16496->10305|16591->10389|16633->10391|16687->10416|16758->10459|16774->10465|16824->10493|16923->10560|16973->10582|17027->10626|17068->10628|17122->10653|17193->10696|17209->10702|17262->10733|17367->10806|17417->10828|17471->10872|17512->10874|17566->10899|17637->10942|17653->10948|17687->10960|17787->11028|17837->11050|17891->11094|17932->11096|17986->11121|18057->11164|18073->11170|18113->11188|18206->11249|18256->11271|18310->11315|18351->11317|18405->11342|18476->11385|18492->11391|18532->11409|18630->11475|18680->11497|18734->11541|18775->11543|18829->11568|18900->11611|18916->11617|18960->11639|19054->11701|19104->11723|19158->11767|19199->11769|19253->11794|19324->11837|19340->11843|19400->11881|19515->11964|19565->11986|19619->12030|19660->12032|19714->12057|19785->12100|19801->12106|19848->12131|19956->12207|20006->12229|20060->12273|20101->12275|20155->12300|20226->12343|20242->12349|20290->12375|20399->12452|20449->12474|20503->12518|20544->12520|20598->12545|20669->12588|20685->12594|20735->12622|20842->12697|20892->12719|20946->12763|20987->12765|21041->12790|21112->12833|21128->12839|21181->12870|21291->12948|21341->12970|21395->13014|21436->13016|21490->13041|21561->13084|21577->13090|21637->13128|21758->13217|21808->13239|21862->13283|21903->13285|21957->13310|22028->13353|22044->13359|22116->13409|22220->13481|22270->13503|22324->13547|22365->13549|22419->13574|22490->13617|22506->13623|22557->13652|22673->13736|22723->13758|22777->13802|22818->13804|22872->13829|22943->13872|22959->13878|23011->13908|23116->13981|23166->14003|23220->14047|23261->14049|23315->14074|23386->14117|23402->14123|23444->14143|23538->14205|23588->14227|23642->14271|23683->14273|23737->14298|23808->14341|23824->14347|23871->14372|23977->14446|24027->14468|24081->14512|24122->14514|24176->14539|24247->14582|24263->14588|24313->14616|24425->14696|24476->14719|24530->14763|24571->14765|24625->14790|24696->14833|24712->14839|24760->14865|24869->14942|24920->14965|24974->15009|25015->15011|25069->15036|25140->15079|25156->15085|25209->15116|25315->15190|25365->15212|25419->15256|25460->15258|25514->15283|25585->15326|25601->15332|25653->15362|25761->15438|25811->15460|25865->15504|25906->15506|25960->15531|26031->15574|26047->15580|26097->15608|26206->15685|26256->15707|26310->15751|26351->15753|26405->15778|26476->15821|26492->15827|26543->15856|26660->15941|26710->15963|26764->16007|26805->16009|26859->16034|26930->16077|26946->16083|26995->16110|27103->16186|27153->16208|27207->16252|27248->16254|27302->16279|27373->16322|27389->16328|27436->16353|27542->16427|27589->16445|27688->16512|27730->16525|27794->16561|27848->16605|27889->16607|27935->16624|28121->16782|28175->16826|28216->16828|28266->16849|28333->16888|28349->16894|28399->16922|28496->16987|28542->17004|28641->17071|28683->17084|28747->17120|28801->17164|28842->17166|28888->17183|28926->17193|28942->17199|28982->17217|29076->17279|29118->17292|29182->17328|29236->17372|29277->17374|29323->17391|29550->17590|29566->17596|29614->17622|29750->17730|29766->17736|29807->17755|29934->17854|29950->17860|29997->17885|30130->17990|30146->17996|30190->18018|30320->18120|30336->18126|30375->18143|30501->18241|30517->18247|30555->18263|30707->18383|30749->18396
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|70->39|70->39|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|79->48|80->49|80->49|80->49|81->50|82->51|82->51|82->51|85->54|86->55|86->55|86->55|87->56|88->57|88->57|88->57|91->60|93->62|93->62|93->62|94->63|95->64|95->64|95->64|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|116->85|117->86|117->86|117->86|118->87|119->88|119->88|119->88|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|128->97|129->98|129->98|129->98|130->99|131->100|131->100|131->100|134->103|135->104|135->104|135->104|136->105|137->106|137->106|137->106|140->109|141->110|141->110|141->110|142->111|143->112|143->112|143->112|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|166->135|166->135|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|186->155|187->156|187->156|187->156|188->157|189->158|189->158|189->158|192->161|193->162|193->162|193->162|194->163|195->164|195->164|195->164|198->167|199->168|201->170|202->171|204->173|204->173|204->173|205->174|207->176|207->176|207->176|208->177|209->178|209->178|209->178|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|216->185|217->186|217->186|217->186|218->187|219->188|219->188|219->188|221->190|222->191|222->191|222->191|223->192|224->193|224->193|224->193|226->195|227->196|227->196|227->196|228->197|229->198|229->198|229->198|231->200|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|267->236|267->236|267->236|268->237|269->238|269->238|269->238|271->240|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|298->267|298->267|298->267|299->268|300->269|300->269|300->269|302->271|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|309->278|309->278|310->279|311->280|311->280|311->280|313->282|314->283|314->283|314->283|315->284|316->285|316->285|316->285|318->287|319->288|319->288|319->288|320->289|321->290|321->290|321->290|323->292|324->293|324->293|324->293|325->294|326->295|326->295|326->295|328->297|329->298|329->298|329->298|330->299|331->300|331->300|331->300|333->302|335->304|337->306|338->307|340->309|340->309|340->309|341->310|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|348->317|350->319|351->320|353->322|353->322|353->322|354->323|354->323|354->323|354->323|355->324|356->325|358->327|358->327|358->327|359->328|362->331|362->331|362->331|365->334|365->334|365->334|368->337|368->337|368->337|371->340|371->340|371->340|374->343|374->343|374->343|377->346|377->346|377->346|381->350|382->351
                  -- GENERATED --
              */
          