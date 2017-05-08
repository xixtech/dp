
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
            """),_display_(/*34.14*/if(session().get("role").equals("director"))/*34.58*/ {_display_(Seq[Any](format.raw/*34.60*/("""
                """),format.raw/*35.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy a výstupy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*37.22*/if(session().get("role").equals("director"))/*37.66*/ {_display_(Seq[Any](format.raw/*37.68*/("""
                        """),format.raw/*38.25*/("""<li>
                            <a href='"""),_display_(/*39.39*/routes/*39.45*/.TableController.listClassrooms()),format.raw/*39.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*42.22*/("""
                    """),_display_(/*43.22*/if(session().get("role").equals("director"))/*43.66*/ {_display_(Seq[Any](format.raw/*43.68*/("""
                        """),format.raw/*44.25*/("""<li>
                            <a href='"""),_display_(/*45.39*/routes/*45.45*/.TableController.listAccessRole()),format.raw/*45.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*48.22*/("""
                    """),_display_(/*49.22*/if(session().get("role").equals("director"))/*49.66*/ {_display_(Seq[Any](format.raw/*49.68*/("""
                        """),format.raw/*50.25*/("""<li>
                            <a href='"""),_display_(/*51.39*/routes/*51.45*/.TableController.listTeachersRole()),format.raw/*51.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*54.22*/("""
                    """),_display_(/*55.22*/if(session().get("role").equals("director"))/*55.66*/ {_display_(Seq[Any](format.raw/*55.68*/("""
                        """),format.raw/*56.25*/("""<li>
                            <a href='"""),_display_(/*57.39*/routes/*57.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*57.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*60.22*/("""

                    """),_display_(/*62.22*/if(session().get("role").equals("director"))/*62.66*/ {_display_(Seq[Any](format.raw/*62.68*/("""
                        """),format.raw/*63.25*/("""<li>
                            <a href='"""),_display_(/*64.39*/routes/*64.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*64.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*67.22*/("""
                    """),_display_(/*68.22*/if(session().get("role").equals("director"))/*68.66*/ {_display_(Seq[Any](format.raw/*68.68*/("""
                        """),format.raw/*69.25*/("""<li>
                            <a href='"""),_display_(/*70.39*/routes/*70.45*/.TableController.listPerson()),format.raw/*70.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*73.22*/("""
                    """),_display_(/*74.22*/if(session().get("role").equals("director"))/*74.66*/ {_display_(Seq[Any](format.raw/*74.68*/("""
                        """),format.raw/*75.25*/("""<li>
                            <a href='"""),_display_(/*76.39*/routes/*76.45*/.TableController.listStudyPlans()),format.raw/*76.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*79.22*/("""
                    """),_display_(/*80.22*/if(session().get("role").equals("director"))/*80.66*/ {_display_(Seq[Any](format.raw/*80.68*/("""
                        """),format.raw/*81.25*/("""<li>
                            <a href='"""),_display_(/*82.39*/routes/*82.45*/.TableController.listScheduleInWeeks()),format.raw/*82.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*85.22*/("""
                    """),_display_(/*86.22*/if(session().get("role").equals("director"))/*86.66*/ {_display_(Seq[Any](format.raw/*86.68*/("""
                        """),format.raw/*87.25*/("""<li>
                            <a href='"""),_display_(/*88.39*/routes/*88.45*/.TableController.listSchedule()),format.raw/*88.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*91.22*/("""
                    """),_display_(/*92.22*/if(session().get("role").equals("director"))/*92.66*/ {_display_(Seq[Any](format.raw/*92.68*/("""
                        """),format.raw/*93.25*/("""<li>
                            <a href='"""),_display_(/*94.39*/routes/*94.45*/.TableController.listEmployees()),format.raw/*94.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*97.22*/("""
                    """),_display_(/*98.22*/if(session().get("role").equals("director"))/*98.66*/ {_display_(Seq[Any](format.raw/*98.68*/("""
                        """),format.raw/*99.25*/("""<li>
                            <a href='"""),_display_(/*100.39*/routes/*100.45*/.TableController.listTeachers()),format.raw/*100.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*103.22*/("""
                    """),_display_(/*104.22*/if(session().get("role").equals("director"))/*104.66*/ {_display_(Seq[Any](format.raw/*104.68*/("""
                        """),format.raw/*105.25*/("""<li>
                            <a href='"""),_display_(/*106.39*/routes/*106.45*/.TableController.listStudyGroups()),format.raw/*106.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*109.22*/("""
                    """),_display_(/*110.22*/if(session().get("role").equals("director"))/*110.66*/ {_display_(Seq[Any](format.raw/*110.68*/("""
                        """),format.raw/*111.25*/("""<li>
                            <a href='"""),_display_(/*112.39*/routes/*112.45*/.TableController.listSemesters()),format.raw/*112.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*115.22*/("""
                    """),_display_(/*116.22*/if(session().get("role").equals("director"))/*116.66*/ {_display_(Seq[Any](format.raw/*116.68*/("""
                        """),format.raw/*117.25*/("""<li>
                            <a href='"""),_display_(/*118.39*/routes/*118.45*/.TableController.listSubjects()),format.raw/*118.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director"))/*122.66*/ {_display_(Seq[Any](format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listFieldsOfStudy()),format.raw/*124.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director"))/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCourses()),format.raw/*130.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*132.22*/("""
                    """),_display_(/*133.22*/if(session().get("role").equals("director"))/*133.66*/ {_display_(Seq[Any](format.raw/*133.68*/("""
                        """),format.raw/*134.25*/("""<li>
                            <a href='"""),_display_(/*135.39*/routes/*135.45*/.TableController.listCurrentSemesters()),format.raw/*135.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director"))/*139.66*/ {_display_(Seq[Any](format.raw/*139.68*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href='"""),_display_(/*141.39*/routes/*141.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*141.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listDays()),format.raw/*147.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(session().get("role").equals("director"))/*150.66*/ {_display_(Seq[Any](format.raw/*150.68*/("""
                        """),format.raw/*151.25*/("""<li>
                            <a href='"""),_display_(/*152.39*/routes/*152.45*/.TableController.listCommittees()),format.raw/*152.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*155.22*/("""
                    """),_display_(/*156.22*/if(session().get("role").equals("director"))/*156.66*/ {_display_(Seq[Any](format.raw/*156.68*/("""
                        """),format.raw/*157.25*/("""<li>
                            <a href='"""),_display_(/*158.39*/routes/*158.45*/.TableController.listPublications()),format.raw/*158.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*161.22*/("""
                    """),_display_(/*162.22*/if(session().get("role").equals("director"))/*162.66*/ {_display_(Seq[Any](format.raw/*162.68*/("""
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
            """),_display_(/*173.14*/if(session().get("role").equals("director"))/*173.58*/ {_display_(Seq[Any](format.raw/*173.60*/("""
                """),format.raw/*174.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*176.22*/if(session().get("role").equals("director"))/*176.66*/ {_display_(Seq[Any](format.raw/*176.68*/("""
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
                  DATE: Tue May 09 00:13:49 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 040d80faea044d9b7a1888b3228520774c59d160
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1650->651|1665->657|1722->693|1815->759|1830->765|1918->831|2000->886|2015->892|2078->934|2155->984|2170->990|2233->1032|2310->1082|2325->1088|2387->1129|2463->1178|2478->1184|2527->1212|2608->1266|2623->1272|2682->1310|2761->1362|2776->1368|2844->1415|2916->1460|2931->1466|3017->1530|3146->1632|3161->1638|3264->1719|3481->1909|3534->1953|3574->1955|3619->1972|3814->2140|3867->2184|3907->2186|3960->2211|4030->2254|4045->2260|4099->2293|4263->2426|4312->2448|4365->2492|4405->2494|4458->2519|4528->2562|4543->2568|4597->2601|4765->2738|4814->2760|4867->2804|4907->2806|4960->2831|5030->2874|5045->2880|5101->2915|5269->3052|5318->3074|5371->3118|5411->3120|5464->3145|5534->3188|5549->3194|5637->3260|5806->3398|5856->3421|5909->3465|5949->3467|6002->3492|6072->3535|6087->3541|6152->3585|6341->3743|6390->3765|6443->3809|6483->3811|6536->3836|6606->3879|6621->3885|6671->3914|6836->4048|6885->4070|6938->4114|6978->4116|7031->4141|7101->4184|7116->4190|7170->4223|7339->4361|7388->4383|7441->4427|7481->4429|7534->4454|7604->4497|7619->4503|7678->4541|7849->4681|7898->4703|7951->4747|7991->4749|8044->4774|8114->4817|8129->4823|8181->4854|8342->4984|8391->5006|8444->5050|8484->5052|8537->5077|8607->5120|8622->5126|8675->5158|8841->5293|8890->5315|8943->5359|8983->5361|9036->5386|9107->5429|9123->5435|9176->5466|9341->5599|9391->5621|9445->5665|9486->5667|9540->5692|9611->5735|9627->5741|9683->5775|9855->5915|9905->5937|9959->5981|10000->5983|10054->6008|10125->6051|10141->6057|10195->6089|10359->6221|10409->6243|10463->6287|10504->6289|10558->6314|10629->6357|10645->6363|10698->6394|10862->6526|10912->6548|10966->6592|11007->6594|11061->6619|11132->6662|11148->6668|11206->6704|11367->6833|11417->6855|11471->6899|11512->6901|11566->6926|11637->6969|11653->6975|11705->7005|11834->7102|11884->7124|11938->7168|11979->7170|12033->7195|12104->7238|12120->7244|12181->7283|12354->7424|12404->7446|12458->7490|12499->7492|12553->7517|12624->7560|12640->7566|12720->7623|12909->7780|12959->7802|13013->7846|13054->7848|13108->7873|13179->7916|13195->7922|13244->7949|13371->8044|13421->8066|13475->8110|13516->8112|13570->8137|13641->8180|13657->8186|13712->8219|13874->8349|13924->8371|13978->8415|14019->8417|14073->8442|14144->8485|14160->8491|14217->8526|14382->8659|14432->8681|14486->8725|14527->8727|14581->8752|14652->8795|14668->8801|14728->8839|14901->8980|14947->8997|15046->9064|15088->9077|15152->9113|15206->9157|15247->9159|15293->9176|15490->9345|15544->9389|15585->9391|15639->9416|15710->9459|15726->9465|15776->9493|15875->9560|15925->9582|15979->9626|16020->9628|16074->9653|16145->9696|16161->9702|16214->9733|16319->9806|16369->9828|16423->9872|16464->9874|16518->9899|16589->9942|16605->9948|16639->9960|16739->10028|16789->10050|16843->10094|16884->10096|16938->10121|17009->10164|17025->10170|17065->10188|17158->10249|17208->10271|17262->10315|17303->10317|17357->10342|17428->10385|17444->10391|17484->10409|17582->10475|17632->10497|17686->10541|17727->10543|17781->10568|17852->10611|17868->10617|17912->10639|18006->10701|18056->10723|18110->10767|18151->10769|18205->10794|18276->10837|18292->10843|18352->10881|18467->10964|18517->10986|18571->11030|18612->11032|18666->11057|18737->11100|18753->11106|18800->11131|18908->11207|18958->11229|19012->11273|19053->11275|19107->11300|19178->11343|19194->11349|19242->11375|19351->11452|19401->11474|19455->11518|19496->11520|19550->11545|19621->11588|19637->11594|19687->11622|19794->11697|19844->11719|19898->11763|19939->11765|19993->11790|20064->11833|20080->11839|20133->11870|20243->11948|20293->11970|20347->12014|20388->12016|20442->12041|20513->12084|20529->12090|20589->12128|20710->12217|20760->12239|20814->12283|20855->12285|20909->12310|20980->12353|20996->12359|21068->12409|21172->12481|21222->12503|21276->12547|21317->12549|21371->12574|21442->12617|21458->12623|21509->12652|21625->12736|21675->12758|21729->12802|21770->12804|21824->12829|21895->12872|21911->12878|21963->12908|22068->12981|22118->13003|22172->13047|22213->13049|22267->13074|22338->13117|22354->13123|22396->13143|22490->13205|22540->13227|22594->13271|22635->13273|22689->13298|22760->13341|22776->13347|22823->13372|22929->13446|22979->13468|23033->13512|23074->13514|23128->13539|23199->13582|23215->13588|23265->13616|23377->13696|23428->13719|23482->13763|23523->13765|23577->13790|23648->13833|23664->13839|23712->13865|23821->13942|23872->13965|23926->14009|23967->14011|24021->14036|24092->14079|24108->14085|24161->14116|24267->14190|24317->14212|24371->14256|24412->14258|24466->14283|24537->14326|24553->14332|24605->14362|24713->14438|24763->14460|24817->14504|24858->14506|24912->14531|24983->14574|24999->14580|25049->14608|25158->14685|25208->14707|25262->14751|25303->14753|25357->14778|25428->14821|25444->14827|25495->14856|25612->14941|25662->14963|25716->15007|25757->15009|25811->15034|25882->15077|25898->15083|25947->15110|26055->15186|26105->15208|26159->15252|26200->15254|26254->15279|26325->15322|26341->15328|26388->15353|26494->15427|26541->15445|26640->15512|26682->15525|26746->15561|26800->15605|26841->15607|26887->15624|27073->15782|27127->15826|27168->15828|27218->15849|27285->15888|27301->15894|27351->15922|27448->15987|27494->16004|27593->16071|27635->16084|27699->16120|27753->16164|27794->16166|27840->16183|27878->16193|27894->16199|27934->16217|28028->16279|28070->16292|28134->16328|28188->16372|28229->16374|28275->16391|28502->16590|28518->16596|28566->16622|28702->16730|28718->16736|28759->16755|28886->16854|28902->16860|28949->16885|29082->16990|29098->16996|29142->17018|29272->17120|29288->17126|29327->17143|29453->17241|29469->17247|29507->17263|29659->17383|29701->17396
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|70->39|70->39|73->42|74->43|74->43|74->43|75->44|76->45|76->45|76->45|79->48|80->49|80->49|80->49|81->50|82->51|82->51|82->51|85->54|86->55|86->55|86->55|87->56|88->57|88->57|88->57|91->60|93->62|93->62|93->62|94->63|95->64|95->64|95->64|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|116->85|117->86|117->86|117->86|118->87|119->88|119->88|119->88|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|128->97|129->98|129->98|129->98|130->99|131->100|131->100|131->100|134->103|135->104|135->104|135->104|136->105|137->106|137->106|137->106|140->109|141->110|141->110|141->110|142->111|143->112|143->112|143->112|146->115|147->116|147->116|147->116|148->117|149->118|149->118|149->118|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|166->135|166->135|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|186->155|187->156|187->156|187->156|188->157|189->158|189->158|189->158|192->161|193->162|193->162|193->162|194->163|195->164|195->164|195->164|198->167|199->168|201->170|202->171|204->173|204->173|204->173|205->174|207->176|207->176|207->176|208->177|209->178|209->178|209->178|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|216->185|217->186|217->186|217->186|218->187|219->188|219->188|219->188|221->190|222->191|222->191|222->191|223->192|224->193|224->193|224->193|226->195|227->196|227->196|227->196|228->197|229->198|229->198|229->198|231->200|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|267->236|267->236|267->236|268->237|269->238|269->238|269->238|271->240|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|298->267|298->267|298->267|299->268|300->269|300->269|300->269|302->271|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|309->278|309->278|310->279|311->280|311->280|311->280|313->282|314->283|314->283|314->283|315->284|316->285|316->285|316->285|318->287|319->288|319->288|319->288|320->289|321->290|321->290|321->290|323->292|324->293|324->293|324->293|325->294|326->295|326->295|326->295|328->297|329->298|329->298|329->298|330->299|331->300|331->300|331->300|333->302|335->304|337->306|338->307|340->309|340->309|340->309|341->310|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|348->317|350->319|351->320|353->322|353->322|353->322|354->323|354->323|354->323|354->323|355->324|356->325|358->327|358->327|358->327|359->328|362->331|362->331|362->331|365->334|365->334|365->334|368->337|368->337|368->337|371->340|371->340|371->340|374->343|374->343|374->343|377->346|377->346|377->346|381->350|382->351
                  -- GENERATED --
              */
          