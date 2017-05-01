
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
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.PersonalStatisticController.index()),format.raw/*15.77*/("""">Výuka dle oddělení a osob</a>
                        <a href='"""),_display_(/*16.35*/routes/*16.41*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*16.107*/("""'>Výuka dle osob</a>
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.PersonalStatisticController.teachingAAA()),format.raw/*17.83*/("""">Výuka AAA</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.PersonalStatisticController.teachingAAB()),format.raw/*18.83*/("""">Výuka AAB</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.PersonalStatisticController.teachingCB()),format.raw/*19.82*/("""">Výuka CB</a>
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.StatisticController.index()),format.raw/*20.69*/("""">Zobrazit DČPS</a>
                        <a href=""""),_display_(/*21.35*/routes/*21.41*/.StatisticController.studyPlansTable()),format.raw/*21.79*/("""">Zobrazit SP</a>

                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.EmployeesController.info(session().get("email"))),format.raw/*23.90*/("""">Info</a>
                        <a href=""""),_display_(/*24.35*/routes/*24.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*24.107*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*26.35*/routes/*26.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("email"))),format.raw/*26.124*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*35.14*/if(session().get("role").equals("director"))/*35.58*/ {_display_(Seq[Any](format.raw/*35.60*/("""
                """),format.raw/*36.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*38.22*/if(session().get("role").equals("director"))/*38.66*/ {_display_(Seq[Any](format.raw/*38.68*/("""
                        """),format.raw/*39.25*/("""<li>
                            <a href='"""),_display_(/*40.39*/routes/*40.45*/.TableController.listClassrooms()),format.raw/*40.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*43.22*/("""
                    """),_display_(/*44.22*/if(session().get("role").equals("director"))/*44.66*/ {_display_(Seq[Any](format.raw/*44.68*/("""
                        """),format.raw/*45.25*/("""<li>
                            <a href='"""),_display_(/*46.39*/routes/*46.45*/.TableController.listTeachersRole()),format.raw/*46.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*49.22*/("""
                    """),_display_(/*50.22*/if(session().get("role").equals("director"))/*50.66*/ {_display_(Seq[Any](format.raw/*50.68*/("""
                        """),format.raw/*51.25*/("""<li>
                            <a href='"""),_display_(/*52.39*/routes/*52.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*52.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*55.22*/("""

                    """),_display_(/*57.22*/if(session().get("role").equals("director"))/*57.66*/ {_display_(Seq[Any](format.raw/*57.68*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*59.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director"))/*63.66*/ {_display_(Seq[Any](format.raw/*63.68*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.TableController.listPerson()),format.raw/*65.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""
                    """),_display_(/*69.22*/if(session().get("role").equals("director"))/*69.66*/ {_display_(Seq[Any](format.raw/*69.68*/("""
                        """),format.raw/*70.25*/("""<li>
                            <a href='"""),_display_(/*71.39*/routes/*71.45*/.TableController.listStudyPlans()),format.raw/*71.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*74.22*/("""
                    """),_display_(/*75.22*/if(session().get("role").equals("director"))/*75.66*/ {_display_(Seq[Any](format.raw/*75.68*/("""
                        """),format.raw/*76.25*/("""<li>
                            <a href='"""),_display_(/*77.39*/routes/*77.45*/.TableController.listScheduleInWeeks()),format.raw/*77.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*80.22*/("""
                    """),_display_(/*81.22*/if(session().get("role").equals("director"))/*81.66*/ {_display_(Seq[Any](format.raw/*81.68*/("""
                        """),format.raw/*82.25*/("""<li>
                            <a href='"""),_display_(/*83.39*/routes/*83.45*/.TableController.listSchedule()),format.raw/*83.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*86.22*/("""
                    """),_display_(/*87.22*/if(session().get("role").equals("director"))/*87.66*/ {_display_(Seq[Any](format.raw/*87.68*/("""
                        """),format.raw/*88.25*/("""<li>
                            <a href='"""),_display_(/*89.39*/routes/*89.45*/.TableController.listEmployees()),format.raw/*89.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(session().get("role").equals("director"))/*93.66*/ {_display_(Seq[Any](format.raw/*93.68*/("""
                        """),format.raw/*94.25*/("""<li>
                            <a href='"""),_display_(/*95.39*/routes/*95.45*/.TableController.listTeachers()),format.raw/*95.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*98.22*/("""
                    """),_display_(/*99.22*/if(session().get("role").equals("director"))/*99.66*/ {_display_(Seq[Any](format.raw/*99.68*/("""
                        """),format.raw/*100.25*/("""<li>
                            <a href='"""),_display_(/*101.39*/routes/*101.45*/.TableController.listStudyGroups()),format.raw/*101.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*104.22*/("""
                    """),_display_(/*105.22*/if(session().get("role").equals("director"))/*105.66*/ {_display_(Seq[Any](format.raw/*105.68*/("""
                        """),format.raw/*106.25*/("""<li>
                            <a href='"""),_display_(/*107.39*/routes/*107.45*/.TableController.listSemesters()),format.raw/*107.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*110.22*/("""
                    """),_display_(/*111.22*/if(session().get("role").equals("director"))/*111.66*/ {_display_(Seq[Any](format.raw/*111.68*/("""
                        """),format.raw/*112.25*/("""<li>
                            <a href='"""),_display_(/*113.39*/routes/*113.45*/.TableController.listSubjects()),format.raw/*113.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*116.22*/("""
                    """),_display_(/*117.22*/if(session().get("role").equals("director"))/*117.66*/ {_display_(Seq[Any](format.raw/*117.68*/("""
                        """),format.raw/*118.25*/("""<li>
                            <a href='"""),_display_(/*119.39*/routes/*119.45*/.TableController.listFieldsOfStudy()),format.raw/*119.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*122.22*/("""
                    """),_display_(/*123.22*/if(session().get("role").equals("director"))/*123.66*/ {_display_(Seq[Any](format.raw/*123.68*/("""
                        """),format.raw/*124.25*/("""<li>
                            <a href='"""),_display_(/*125.39*/routes/*125.45*/.TableController.listCourses()),format.raw/*125.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director"))/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCurrentSemesters()),format.raw/*130.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*133.22*/("""
                    """),_display_(/*134.22*/if(session().get("role").equals("director"))/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""<li>
                            <a href='"""),_display_(/*136.39*/routes/*136.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*136.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*139.22*/("""
                    """),_display_(/*140.22*/if(session().get("role").equals("director"))/*140.66*/ {_display_(Seq[Any](format.raw/*140.68*/("""
                        """),format.raw/*141.25*/("""<li>
                            <a href='"""),_display_(/*142.39*/routes/*142.45*/.TableController.listDays()),format.raw/*142.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href='"""),_display_(/*147.39*/routes/*147.45*/.TableController.listCommittees()),format.raw/*147.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*150.22*/("""
                    """),_display_(/*151.22*/if(session().get("role").equals("director"))/*151.66*/ {_display_(Seq[Any](format.raw/*151.68*/("""
                        """),format.raw/*152.25*/("""<li>
                            <a href='"""),_display_(/*153.39*/routes/*153.45*/.TableController.listPublications()),format.raw/*153.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*156.22*/("""
                    """),_display_(/*157.22*/if(session().get("role").equals("director"))/*157.66*/ {_display_(Seq[Any](format.raw/*157.68*/("""
                        """),format.raw/*158.25*/("""<li>
                            <a href='"""),_display_(/*159.39*/routes/*159.45*/.TableController.listTeachersInWeeks()),format.raw/*159.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*162.22*/("""
                """),format.raw/*163.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*165.14*/("""
            """),format.raw/*166.13*/("""</li>
            <li>
            """),_display_(/*168.14*/if(session().get("role").equals("director"))/*168.58*/ {_display_(Seq[Any](format.raw/*168.60*/("""
                """),format.raw/*169.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*171.22*/if(session().get("role").equals("director"))/*171.66*/ {_display_(Seq[Any](format.raw/*171.68*/("""
                        """),format.raw/*172.25*/("""<li>
                            <a href=""""),_display_(/*173.39*/routes/*173.45*/.ClassroomController.index()),format.raw/*173.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*175.22*/("""
                    """),_display_(/*176.22*/if(session().get("role").equals("director"))/*176.66*/ {_display_(Seq[Any](format.raw/*176.68*/("""
                        """),format.raw/*177.25*/("""<li>
                            <a href=""""),_display_(/*178.39*/routes/*178.45*/.TeachersRoleController.index()),format.raw/*178.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*180.22*/("""
                    """),_display_(/*181.22*/if(session().get("role").equals("director"))/*181.66*/ {_display_(Seq[Any](format.raw/*181.68*/("""
                        """),format.raw/*182.25*/("""<li>
                            <a href=""""),_display_(/*183.39*/routes/*183.45*/.Pages.blank),format.raw/*183.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*185.22*/("""
                    """),_display_(/*186.22*/if(session().get("role").equals("director"))/*186.66*/ {_display_(Seq[Any](format.raw/*186.68*/("""
                        """),format.raw/*187.25*/("""<li>
                            <a href=""""),_display_(/*188.39*/routes/*188.45*/.Application.pdf()),format.raw/*188.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*190.22*/("""
                    """),_display_(/*191.22*/if(session().get("role").equals("director"))/*191.66*/ {_display_(Seq[Any](format.raw/*191.68*/("""
                        """),format.raw/*192.25*/("""<li>
                            <a href=""""),_display_(/*193.39*/routes/*193.45*/.Application.raw()),format.raw/*193.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*195.22*/("""
                    """),_display_(/*196.22*/if(session().get("role").equals("director"))/*196.66*/ {_display_(Seq[Any](format.raw/*196.68*/("""
                        """),format.raw/*197.25*/("""<li>
                            <a href=""""),_display_(/*198.39*/routes/*198.45*/.TestController.test()),format.raw/*198.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*200.22*/("""
                    """),_display_(/*201.22*/if(session().get("role").equals("director"))/*201.66*/ {_display_(Seq[Any](format.raw/*201.68*/("""
                        """),format.raw/*202.25*/("""<li>
                            <a href=""""),_display_(/*203.39*/routes/*203.45*/.SubjectPlanTeachingController.index()),format.raw/*203.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*205.22*/("""
                    """),_display_(/*206.22*/if(session().get("role").equals("director"))/*206.66*/ {_display_(Seq[Any](format.raw/*206.68*/("""
                        """),format.raw/*207.25*/("""<li>
                            <a href=""""),_display_(/*208.39*/routes/*208.45*/.VisitsController.index()),format.raw/*208.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*210.22*/("""
                    """),_display_(/*211.22*/if(session().get("role").equals("director"))/*211.66*/ {_display_(Seq[Any](format.raw/*211.68*/("""
                        """),format.raw/*212.25*/("""<li>
                            <a href=""""),_display_(/*213.39*/routes/*213.45*/.ProjectController.index()),format.raw/*213.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*215.22*/("""
                    """),_display_(/*216.22*/if(session().get("role").equals("director"))/*216.66*/ {_display_(Seq[Any](format.raw/*216.68*/("""
                        """),format.raw/*217.25*/("""<li>
                            <a href=""""),_display_(/*218.39*/routes/*218.45*/.CommitteeController.index()),format.raw/*218.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*220.22*/("""
                    """),_display_(/*221.22*/if(session().get("role").equals("director"))/*221.66*/ {_display_(Seq[Any](format.raw/*221.68*/("""
                        """),format.raw/*222.25*/("""<li>
                            <a href=""""),_display_(/*223.39*/routes/*223.45*/.PublicationsController.index()),format.raw/*223.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*225.22*/("""
                    """),_display_(/*226.22*/if(session().get("role").equals("director"))/*226.66*/ {_display_(Seq[Any](format.raw/*226.68*/("""
                        """),format.raw/*227.25*/("""<li>
                            <a href=""""),_display_(/*228.39*/routes/*228.45*/.OrganizationalUnitsController.index()),format.raw/*228.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*230.22*/("""
                    """),_display_(/*231.22*/if(session().get("role").equals("director"))/*231.66*/ {_display_(Seq[Any](format.raw/*231.68*/("""
                        """),format.raw/*232.25*/("""<li>
                            <a href=""""),_display_(/*233.39*/routes/*233.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*233.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*235.22*/("""
                    """),_display_(/*236.22*/if(session().get("role").equals("director"))/*236.66*/ {_display_(Seq[Any](format.raw/*236.68*/("""
                        """),format.raw/*237.25*/("""<li>
                            <a href=""""),_display_(/*238.39*/routes/*238.45*/.FinalWorksController.index()),format.raw/*238.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*240.22*/("""
                    """),_display_(/*241.22*/if(session().get("role").equals("director"))/*241.66*/ {_display_(Seq[Any](format.raw/*241.68*/("""
                        """),format.raw/*242.25*/("""<li>
                            <a href=""""),_display_(/*243.39*/routes/*243.45*/.Application.kpiChoosePerson()),format.raw/*243.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*245.22*/("""
                    """),_display_(/*246.22*/if(session().get("role").equals("director"))/*246.66*/ {_display_(Seq[Any](format.raw/*246.68*/("""
                        """),format.raw/*247.25*/("""<li>
                            <a href=""""),_display_(/*248.39*/routes/*248.45*/.Application.roles()),format.raw/*248.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*250.22*/("""
                    """),_display_(/*251.22*/if(session().get("role").equals("director"))/*251.66*/ {_display_(Seq[Any](format.raw/*251.68*/("""
                        """),format.raw/*252.25*/("""<li>
                            <a href=""""),_display_(/*253.39*/routes/*253.45*/.PersonController.index()),format.raw/*253.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*255.22*/("""
                    """),_display_(/*256.22*/if(session().get("role").equals("director"))/*256.66*/ {_display_(Seq[Any](format.raw/*256.68*/("""
                        """),format.raw/*257.25*/("""<li>
                            <a href=""""),_display_(/*258.39*/routes/*258.45*/.EmployeesController.index()),format.raw/*258.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*260.22*/("""

                    """),_display_(/*262.22*/if(session().get("role").equals("director"))/*262.66*/ {_display_(Seq[Any](format.raw/*262.68*/("""
                        """),format.raw/*263.25*/("""<li>
                            <a href=""""),_display_(/*264.39*/routes/*264.45*/.SubjectController.index()),format.raw/*264.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*266.22*/("""

                    """),_display_(/*268.22*/if(session().get("role").equals("director"))/*268.66*/ {_display_(Seq[Any](format.raw/*268.68*/("""
                        """),format.raw/*269.25*/("""<li>
                            <a href=""""),_display_(/*270.39*/routes/*270.45*/.FieldOfStudyController.index()),format.raw/*270.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*272.22*/("""
                    """),_display_(/*273.22*/if(session().get("role").equals("director"))/*273.66*/ {_display_(Seq[Any](format.raw/*273.68*/("""
                        """),format.raw/*274.25*/("""<li>
                            <a href=""""),_display_(/*275.39*/routes/*275.45*/.StudyGroupsController.index()),format.raw/*275.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*277.22*/("""
                    """),_display_(/*278.22*/if(session().get("role").equals("director"))/*278.66*/ {_display_(Seq[Any](format.raw/*278.68*/("""
                        """),format.raw/*279.25*/("""<li>
                            <a href=""""),_display_(/*280.39*/routes/*280.45*/.SemestersController.index()),format.raw/*280.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*282.22*/("""
                    """),_display_(/*283.22*/if(session().get("role").equals("director"))/*283.66*/ {_display_(Seq[Any](format.raw/*283.68*/("""
                        """),format.raw/*284.25*/("""<li>
                            <a href=""""),_display_(/*285.39*/routes/*285.45*/.StudyPlansController.index()),format.raw/*285.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*287.22*/("""
                    """),_display_(/*288.22*/if(session().get("role").equals("director"))/*288.66*/ {_display_(Seq[Any](format.raw/*288.68*/("""
                        """),format.raw/*289.25*/("""<li>
                            <a href=""""),_display_(/*290.39*/routes/*290.45*/.TeachersController.index()),format.raw/*290.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*292.22*/("""
                    """),_display_(/*293.22*/if(session().get("role").equals("director"))/*293.66*/ {_display_(Seq[Any](format.raw/*293.68*/("""
                        """),format.raw/*294.25*/("""<li>
                            <a href=""""),_display_(/*295.39*/routes/*295.45*/.CourseController.index()),format.raw/*295.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*297.22*/("""

                """),format.raw/*299.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*301.14*/("""
            """),format.raw/*302.13*/("""</li>
            <li>
            """),_display_(/*304.14*/if(session().get("role").equals("director"))/*304.58*/ {_display_(Seq[Any](format.raw/*304.60*/("""
                """),format.raw/*305.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*307.18*/if(session().get("role").equals("director"))/*307.62*/ {_display_(Seq[Any](format.raw/*307.64*/("""
                    """),format.raw/*308.21*/("""<li>
                        <a href=""""),_display_(/*309.35*/routes/*309.41*/.MethodicsController.index()),format.raw/*309.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*311.18*/("""
                """),format.raw/*312.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*314.14*/("""
            """),format.raw/*315.13*/("""</li>
            <li>
            """),_display_(/*317.14*/if(session().get("role").equals("director"))/*317.58*/ {_display_(Seq[Any](format.raw/*317.60*/("""
                """),format.raw/*318.17*/("""<a href='"""),_display_(/*318.27*/routes/*318.33*/.Application.forms),format.raw/*318.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*319.14*/("""
            """),format.raw/*320.13*/("""</li>
            <li>
            """),_display_(/*322.14*/if(session().get("role").equals("director"))/*322.58*/ {_display_(Seq[Any](format.raw/*322.60*/("""
                """),format.raw/*323.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*326.35*/routes/*326.41*/.UiElements.panelsAndWells),format.raw/*326.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*329.35*/routes/*329.41*/.UiElements.buttons),format.raw/*329.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*332.35*/routes/*332.41*/.UiElements.notifications),format.raw/*332.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*335.35*/routes/*335.41*/.UiElements.typography),format.raw/*335.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*338.35*/routes/*338.41*/.UiElements.icons),format.raw/*338.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*341.35*/routes/*341.41*/.UiElements.grid),format.raw/*341.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*345.14*/("""
            """),format.raw/*346.13*/("""</li>
            <li>
            """),_display_(/*348.14*/if(session().get("role").equals("director"))/*348.58*/ {_display_(Seq[Any](format.raw/*348.60*/("""
                """),format.raw/*349.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*378.14*/("""
            """),format.raw/*379.13*/("""</li>
            <li>
            """),_display_(/*381.14*/if(session().get("role").equals("director"))/*381.58*/ {_display_(Seq[Any](format.raw/*381.60*/("""
                """),format.raw/*382.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*387.35*/routes/*387.41*/.Charts.flot),format.raw/*387.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*390.35*/routes/*390.41*/.Charts.morris),format.raw/*390.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*394.14*/("""
            """),format.raw/*395.13*/("""</li>

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
                  DATE: Mon May 01 19:30:57 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: cbc59baff876fae15067f1a23a969d6476938d55
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1670->671|1685->677|1773->743|1855->798|1870->804|1933->846|2010->896|2025->902|2088->944|2165->994|2180->1000|2242->1041|2318->1090|2333->1096|2382->1124|2463->1178|2478->1184|2537->1222|2617->1275|2632->1281|2702->1330|2774->1375|2789->1381|2877->1447|3006->1549|3021->1555|3126->1638|3343->1828|3396->1872|3436->1874|3481->1891|3666->2049|3719->2093|3759->2095|3812->2120|3882->2163|3897->2169|3951->2202|4115->2335|4164->2357|4217->2401|4257->2403|4310->2428|4380->2471|4395->2477|4451->2512|4619->2649|4668->2671|4721->2715|4761->2717|4814->2742|4884->2785|4899->2791|4987->2857|5156->2995|5206->3018|5259->3062|5299->3064|5352->3089|5422->3132|5437->3138|5502->3182|5691->3340|5740->3362|5793->3406|5833->3408|5886->3433|5956->3476|5971->3482|6021->3511|6186->3645|6235->3667|6288->3711|6328->3713|6381->3738|6451->3781|6466->3787|6520->3820|6689->3958|6738->3980|6791->4024|6831->4026|6884->4051|6954->4094|6969->4100|7028->4138|7199->4278|7248->4300|7301->4344|7341->4346|7394->4371|7464->4414|7479->4420|7531->4451|7692->4581|7741->4603|7794->4647|7834->4649|7887->4674|7957->4717|7972->4723|8025->4755|8191->4890|8240->4912|8293->4956|8333->4958|8386->4983|8456->5026|8471->5032|8523->5063|8687->5196|8736->5218|8789->5262|8829->5264|8883->5289|8954->5332|8970->5338|9026->5372|9198->5512|9248->5534|9302->5578|9343->5580|9397->5605|9468->5648|9484->5654|9538->5686|9702->5818|9752->5840|9806->5884|9847->5886|9901->5911|9972->5954|9988->5960|10041->5991|10205->6123|10255->6145|10309->6189|10350->6191|10404->6216|10475->6259|10491->6265|10549->6301|10710->6430|10760->6452|10814->6496|10855->6498|10909->6523|10980->6566|10996->6572|11048->6602|11177->6699|11227->6721|11281->6765|11322->6767|11376->6792|11447->6835|11463->6841|11524->6880|11697->7021|11747->7043|11801->7087|11842->7089|11896->7114|11967->7157|11983->7163|12063->7220|12252->7377|12302->7399|12356->7443|12397->7445|12451->7470|12522->7513|12538->7519|12587->7546|12714->7641|12764->7663|12818->7707|12859->7709|12913->7734|12984->7777|13000->7783|13055->7816|13217->7946|13267->7968|13321->8012|13362->8014|13416->8039|13487->8082|13503->8088|13560->8123|13725->8256|13775->8278|13829->8322|13870->8324|13924->8349|13995->8392|14011->8398|14071->8436|14244->8577|14290->8594|14389->8661|14431->8674|14495->8710|14549->8754|14590->8756|14636->8773|14831->8940|14885->8984|14926->8986|14980->9011|15051->9054|15067->9060|15117->9088|15216->9155|15266->9177|15320->9221|15361->9223|15415->9248|15486->9291|15502->9297|15555->9328|15660->9401|15710->9423|15764->9467|15805->9469|15859->9494|15930->9537|15946->9543|15980->9555|16080->9623|16130->9645|16184->9689|16225->9691|16279->9716|16350->9759|16366->9765|16406->9783|16499->9844|16549->9866|16603->9910|16644->9912|16698->9937|16769->9980|16785->9986|16825->10004|16923->10070|16973->10092|17027->10136|17068->10138|17122->10163|17193->10206|17209->10212|17253->10234|17347->10296|17397->10318|17451->10362|17492->10364|17546->10389|17617->10432|17633->10438|17693->10476|17808->10559|17858->10581|17912->10625|17953->10627|18007->10652|18078->10695|18094->10701|18141->10726|18249->10802|18299->10824|18353->10868|18394->10870|18448->10895|18519->10938|18535->10944|18583->10970|18692->11047|18742->11069|18796->11113|18837->11115|18891->11140|18962->11183|18978->11189|19028->11217|19135->11292|19185->11314|19239->11358|19280->11360|19334->11385|19405->11428|19421->11434|19474->11465|19584->11543|19634->11565|19688->11609|19729->11611|19783->11636|19854->11679|19870->11685|19930->11723|20051->11812|20101->11834|20155->11878|20196->11880|20250->11905|20321->11948|20337->11954|20409->12004|20513->12076|20563->12098|20617->12142|20658->12144|20712->12169|20783->12212|20799->12218|20850->12247|20966->12331|21016->12353|21070->12397|21111->12399|21165->12424|21236->12467|21252->12473|21304->12503|21409->12576|21459->12598|21513->12642|21554->12644|21608->12669|21679->12712|21695->12718|21737->12738|21831->12800|21881->12822|21935->12866|21976->12868|22030->12893|22101->12936|22117->12942|22164->12967|22270->13041|22320->13063|22374->13107|22415->13109|22469->13134|22540->13177|22556->13183|22606->13211|22718->13291|22769->13314|22823->13358|22864->13360|22918->13385|22989->13428|23005->13434|23053->13460|23162->13537|23213->13560|23267->13604|23308->13606|23362->13631|23433->13674|23449->13680|23502->13711|23608->13785|23658->13807|23712->13851|23753->13853|23807->13878|23878->13921|23894->13927|23946->13957|24054->14033|24104->14055|24158->14099|24199->14101|24253->14126|24324->14169|24340->14175|24390->14203|24499->14280|24549->14302|24603->14346|24644->14348|24698->14373|24769->14416|24785->14422|24836->14451|24953->14536|25003->14558|25057->14602|25098->14604|25152->14629|25223->14672|25239->14678|25288->14705|25396->14781|25446->14803|25500->14847|25541->14849|25595->14874|25666->14917|25682->14923|25729->14948|25835->15022|25882->15040|25981->15107|26023->15120|26087->15156|26141->15200|26182->15202|26228->15219|26414->15377|26468->15421|26509->15423|26559->15444|26626->15483|26642->15489|26692->15517|26789->15582|26835->15599|26934->15666|26976->15679|27040->15715|27094->15759|27135->15761|27181->15778|27219->15788|27235->15794|27275->15812|27369->15874|27411->15887|27475->15923|27529->15967|27570->15969|27616->15986|27843->16185|27859->16191|27907->16217|28043->16325|28059->16331|28100->16350|28227->16449|28243->16455|28290->16480|28423->16585|28439->16591|28483->16613|28613->16715|28629->16721|28668->16738|28794->16836|28810->16842|28848->16858|29000->16978|29042->16991|29106->17027|29160->17071|29201->17073|29247->17090|30557->18368|30599->18381|30663->18417|30717->18461|30758->18463|30804->18480|31071->18719|31087->18725|31121->18737|31252->18840|31268->18846|31304->18860|31468->18992|31510->19005
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|66->35|66->35|66->35|67->36|69->38|69->38|69->38|70->39|71->40|71->40|71->40|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|80->49|81->50|81->50|81->50|82->51|83->52|83->52|83->52|86->55|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|105->74|106->75|106->75|106->75|107->76|108->77|108->77|108->77|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|117->86|118->87|118->87|118->87|119->88|120->89|120->89|120->89|123->92|124->93|124->93|124->93|125->94|126->95|126->95|126->95|129->98|130->99|130->99|130->99|131->100|132->101|132->101|132->101|135->104|136->105|136->105|136->105|137->106|138->107|138->107|138->107|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|147->116|148->117|148->117|148->117|149->118|150->119|150->119|150->119|153->122|154->123|154->123|154->123|155->124|156->125|156->125|156->125|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|170->139|171->140|171->140|171->140|172->141|173->142|173->142|173->142|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|181->150|182->151|182->151|182->151|183->152|184->153|184->153|184->153|187->156|188->157|188->157|188->157|189->158|190->159|190->159|190->159|193->162|194->163|196->165|197->166|199->168|199->168|199->168|200->169|202->171|202->171|202->171|203->172|204->173|204->173|204->173|206->175|207->176|207->176|207->176|208->177|209->178|209->178|209->178|211->180|212->181|212->181|212->181|213->182|214->183|214->183|214->183|216->185|217->186|217->186|217->186|218->187|219->188|219->188|219->188|221->190|222->191|222->191|222->191|223->192|224->193|224->193|224->193|226->195|227->196|227->196|227->196|228->197|229->198|229->198|229->198|231->200|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|267->236|267->236|267->236|268->237|269->238|269->238|269->238|271->240|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|293->262|293->262|293->262|294->263|295->264|295->264|295->264|297->266|299->268|299->268|299->268|300->269|301->270|301->270|301->270|303->272|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|309->278|309->278|310->279|311->280|311->280|311->280|313->282|314->283|314->283|314->283|315->284|316->285|316->285|316->285|318->287|319->288|319->288|319->288|320->289|321->290|321->290|321->290|323->292|324->293|324->293|324->293|325->294|326->295|326->295|326->295|328->297|330->299|332->301|333->302|335->304|335->304|335->304|336->305|338->307|338->307|338->307|339->308|340->309|340->309|340->309|342->311|343->312|345->314|346->315|348->317|348->317|348->317|349->318|349->318|349->318|349->318|350->319|351->320|353->322|353->322|353->322|354->323|357->326|357->326|357->326|360->329|360->329|360->329|363->332|363->332|363->332|366->335|366->335|366->335|369->338|369->338|369->338|372->341|372->341|372->341|376->345|377->346|379->348|379->348|379->348|380->349|409->378|410->379|412->381|412->381|412->381|413->382|418->387|418->387|418->387|421->390|421->390|421->390|425->394|426->395
                  -- GENERATED --
              */
          