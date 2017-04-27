
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
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.PersonalStatisticController.index()),format.raw/*15.77*/("""">Zobrazit údaje</a>
                        <a href=""""),_display_(/*16.35*/routes/*16.41*/.StatisticController.index()),format.raw/*16.69*/("""">Zobrazit DCPS</a>

                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.EmployeesController.info(session().get("email"))),format.raw/*18.90*/("""">Info</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*19.107*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*21.35*/routes/*21.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("email"))),format.raw/*21.124*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*30.14*/if(session().get("role").equals("director"))/*30.58*/ {_display_(Seq[Any](format.raw/*30.60*/("""
                """),format.raw/*31.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*33.22*/if(session().get("role").equals("director"))/*33.66*/ {_display_(Seq[Any](format.raw/*33.68*/("""
                        """),format.raw/*34.25*/("""<li>
                            <a href='"""),_display_(/*35.39*/routes/*35.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*35.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*38.22*/("""

                    """),_display_(/*40.22*/if(session().get("role").equals("director"))/*40.66*/ {_display_(Seq[Any](format.raw/*40.68*/("""
                        """),format.raw/*41.25*/("""<li>
                            <a href='"""),_display_(/*42.39*/routes/*42.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*42.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*45.22*/("""
                    """),_display_(/*46.22*/if(session().get("role").equals("director"))/*46.66*/ {_display_(Seq[Any](format.raw/*46.68*/("""
                        """),format.raw/*47.25*/("""<li>
                            <a href='"""),_display_(/*48.39*/routes/*48.45*/.TableController.listPerson()),format.raw/*48.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*51.22*/("""
                    """),_display_(/*52.22*/if(session().get("role").equals("director"))/*52.66*/ {_display_(Seq[Any](format.raw/*52.68*/("""
                        """),format.raw/*53.25*/("""<li>
                            <a href='"""),_display_(/*54.39*/routes/*54.45*/.TableController.listStudyPlans()),format.raw/*54.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*57.22*/("""
                    """),_display_(/*58.22*/if(session().get("role").equals("director"))/*58.66*/ {_display_(Seq[Any](format.raw/*58.68*/("""
                        """),format.raw/*59.25*/("""<li>
                            <a href='"""),_display_(/*60.39*/routes/*60.45*/.TableController.listScheduleInWeeks()),format.raw/*60.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*63.22*/("""
                    """),_display_(/*64.22*/if(session().get("role").equals("director"))/*64.66*/ {_display_(Seq[Any](format.raw/*64.68*/("""
                        """),format.raw/*65.25*/("""<li>
                            <a href='"""),_display_(/*66.39*/routes/*66.45*/.TableController.listSchedule()),format.raw/*66.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*69.22*/("""
                    """),_display_(/*70.22*/if(session().get("role").equals("director"))/*70.66*/ {_display_(Seq[Any](format.raw/*70.68*/("""
                        """),format.raw/*71.25*/("""<li>
                            <a href='"""),_display_(/*72.39*/routes/*72.45*/.TableController.listEmployees()),format.raw/*72.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*75.22*/("""
                    """),_display_(/*76.22*/if(session().get("role").equals("director"))/*76.66*/ {_display_(Seq[Any](format.raw/*76.68*/("""
                        """),format.raw/*77.25*/("""<li>
                            <a href='"""),_display_(/*78.39*/routes/*78.45*/.TableController.listTeachers()),format.raw/*78.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*81.22*/("""
                    """),_display_(/*82.22*/if(session().get("role").equals("director"))/*82.66*/ {_display_(Seq[Any](format.raw/*82.68*/("""
                        """),format.raw/*83.25*/("""<li>
                            <a href='"""),_display_(/*84.39*/routes/*84.45*/.TableController.listStudyGroups()),format.raw/*84.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*87.22*/("""
                    """),_display_(/*88.22*/if(session().get("role").equals("director"))/*88.66*/ {_display_(Seq[Any](format.raw/*88.68*/("""
                        """),format.raw/*89.25*/("""<li>
                            <a href='"""),_display_(/*90.39*/routes/*90.45*/.TableController.listSemesters()),format.raw/*90.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director"))/*94.66*/ {_display_(Seq[Any](format.raw/*94.68*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listSubjects()),format.raw/*96.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director"))/*100.66*/ {_display_(Seq[Any](format.raw/*100.68*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listFieldsOfStudy()),format.raw/*102.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director"))/*106.66*/ {_display_(Seq[Any](format.raw/*106.68*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listCourses()),format.raw/*108.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*110.22*/("""
                    """),_display_(/*111.22*/if(session().get("role").equals("director"))/*111.66*/ {_display_(Seq[Any](format.raw/*111.68*/("""
                        """),format.raw/*112.25*/("""<li>
                            <a href='"""),_display_(/*113.39*/routes/*113.45*/.TableController.listCurrentSemesters()),format.raw/*113.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*116.22*/("""
                    """),_display_(/*117.22*/if(session().get("role").equals("director"))/*117.66*/ {_display_(Seq[Any](format.raw/*117.68*/("""
                        """),format.raw/*118.25*/("""<li>
                            <a href='"""),_display_(/*119.39*/routes/*119.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*119.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*122.22*/("""
                    """),_display_(/*123.22*/if(session().get("role").equals("director"))/*123.66*/ {_display_(Seq[Any](format.raw/*123.68*/("""
                        """),format.raw/*124.25*/("""<li>
                            <a href='"""),_display_(/*125.39*/routes/*125.45*/.TableController.listDays()),format.raw/*125.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*127.22*/("""
                    """),_display_(/*128.22*/if(session().get("role").equals("director"))/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                        """),format.raw/*129.25*/("""<li>
                            <a href='"""),_display_(/*130.39*/routes/*130.45*/.TableController.listCommittees()),format.raw/*130.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*133.22*/("""
                    """),_display_(/*134.22*/if(session().get("role").equals("director"))/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""<li>
                            <a href='"""),_display_(/*136.39*/routes/*136.45*/.TableController.listPublications()),format.raw/*136.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*139.22*/("""
                    """),_display_(/*140.22*/if(session().get("role").equals("director"))/*140.66*/ {_display_(Seq[Any](format.raw/*140.68*/("""
                        """),format.raw/*141.25*/("""<li>
                            <a href='"""),_display_(/*142.39*/routes/*142.45*/.TableController.listTeachersInWeeks()),format.raw/*142.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*145.22*/("""
                """),format.raw/*146.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*148.14*/("""
            """),format.raw/*149.13*/("""</li>
            <li>
            """),_display_(/*151.14*/if(session().get("role").equals("director"))/*151.58*/ {_display_(Seq[Any](format.raw/*151.60*/("""
                """),format.raw/*152.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*154.22*/if(session().get("role").equals("director"))/*154.66*/ {_display_(Seq[Any](format.raw/*154.68*/("""
                        """),format.raw/*155.25*/("""<li>
                            <a href=""""),_display_(/*156.39*/routes/*156.45*/.Pages.blank),format.raw/*156.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*158.22*/("""
                    """),_display_(/*159.22*/if(session().get("role").equals("director"))/*159.66*/ {_display_(Seq[Any](format.raw/*159.68*/("""
                        """),format.raw/*160.25*/("""<li>
                            <a href=""""),_display_(/*161.39*/routes/*161.45*/.Application.pdf()),format.raw/*161.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director"))/*164.66*/ {_display_(Seq[Any](format.raw/*164.68*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href=""""),_display_(/*166.39*/routes/*166.45*/.Application.raw()),format.raw/*166.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*168.22*/("""
                    """),_display_(/*169.22*/if(session().get("role").equals("director"))/*169.66*/ {_display_(Seq[Any](format.raw/*169.68*/("""
                        """),format.raw/*170.25*/("""<li>
                            <a href=""""),_display_(/*171.39*/routes/*171.45*/.TestController.test()),format.raw/*171.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*173.22*/("""
                    """),_display_(/*174.22*/if(session().get("role").equals("director"))/*174.66*/ {_display_(Seq[Any](format.raw/*174.68*/("""
                        """),format.raw/*175.25*/("""<li>
                            <a href=""""),_display_(/*176.39*/routes/*176.45*/.SubjectPlanTeachingController.index()),format.raw/*176.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*178.22*/("""
                    """),_display_(/*179.22*/if(session().get("role").equals("director"))/*179.66*/ {_display_(Seq[Any](format.raw/*179.68*/("""
                        """),format.raw/*180.25*/("""<li>
                            <a href=""""),_display_(/*181.39*/routes/*181.45*/.VisitsController.index()),format.raw/*181.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*183.22*/("""
                    """),_display_(/*184.22*/if(session().get("role").equals("director"))/*184.66*/ {_display_(Seq[Any](format.raw/*184.68*/("""
                        """),format.raw/*185.25*/("""<li>
                            <a href=""""),_display_(/*186.39*/routes/*186.45*/.ProjectController.index()),format.raw/*186.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(session().get("role").equals("director"))/*189.66*/ {_display_(Seq[Any](format.raw/*189.68*/("""
                        """),format.raw/*190.25*/("""<li>
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.CommitteeController.index()),format.raw/*191.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""
                    """),_display_(/*194.22*/if(session().get("role").equals("director"))/*194.66*/ {_display_(Seq[Any](format.raw/*194.68*/("""
                        """),format.raw/*195.25*/("""<li>
                            <a href=""""),_display_(/*196.39*/routes/*196.45*/.PublicationsController.index()),format.raw/*196.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*198.22*/("""
                    """),_display_(/*199.22*/if(session().get("role").equals("director"))/*199.66*/ {_display_(Seq[Any](format.raw/*199.68*/("""
                        """),format.raw/*200.25*/("""<li>
                            <a href=""""),_display_(/*201.39*/routes/*201.45*/.OrganizationalUnitsController.index()),format.raw/*201.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*203.22*/("""
                    """),_display_(/*204.22*/if(session().get("role").equals("director"))/*204.66*/ {_display_(Seq[Any](format.raw/*204.68*/("""
                        """),format.raw/*205.25*/("""<li>
                            <a href=""""),_display_(/*206.39*/routes/*206.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*206.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*208.22*/("""
                    """),_display_(/*209.22*/if(session().get("role").equals("director"))/*209.66*/ {_display_(Seq[Any](format.raw/*209.68*/("""
                        """),format.raw/*210.25*/("""<li>
                            <a href=""""),_display_(/*211.39*/routes/*211.45*/.FinalWorksController.index()),format.raw/*211.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*213.22*/("""
                    """),_display_(/*214.22*/if(session().get("role").equals("director"))/*214.66*/ {_display_(Seq[Any](format.raw/*214.68*/("""
                        """),format.raw/*215.25*/("""<li>
                            <a href=""""),_display_(/*216.39*/routes/*216.45*/.Application.kpiChoosePerson()),format.raw/*216.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*218.22*/("""
                    """),_display_(/*219.22*/if(session().get("role").equals("director"))/*219.66*/ {_display_(Seq[Any](format.raw/*219.68*/("""
                        """),format.raw/*220.25*/("""<li>
                            <a href=""""),_display_(/*221.39*/routes/*221.45*/.Application.roles()),format.raw/*221.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*223.22*/("""
                    """),_display_(/*224.22*/if(session().get("role").equals("director"))/*224.66*/ {_display_(Seq[Any](format.raw/*224.68*/("""
                        """),format.raw/*225.25*/("""<li>
                            <a href=""""),_display_(/*226.39*/routes/*226.45*/.PersonController.index()),format.raw/*226.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*228.22*/("""
                    """),_display_(/*229.22*/if(session().get("role").equals("director"))/*229.66*/ {_display_(Seq[Any](format.raw/*229.68*/("""
                        """),format.raw/*230.25*/("""<li>
                            <a href=""""),_display_(/*231.39*/routes/*231.45*/.EmployeesController.index()),format.raw/*231.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*233.22*/("""

                    """),_display_(/*235.22*/if(session().get("role").equals("director"))/*235.66*/ {_display_(Seq[Any](format.raw/*235.68*/("""
                        """),format.raw/*236.25*/("""<li>
                            <a href=""""),_display_(/*237.39*/routes/*237.45*/.SubjectController.index()),format.raw/*237.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*239.22*/("""

                    """),_display_(/*241.22*/if(session().get("role").equals("director"))/*241.66*/ {_display_(Seq[Any](format.raw/*241.68*/("""
                        """),format.raw/*242.25*/("""<li>
                            <a href=""""),_display_(/*243.39*/routes/*243.45*/.FieldOfStudyController.index()),format.raw/*243.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*245.22*/("""
                    """),_display_(/*246.22*/if(session().get("role").equals("director"))/*246.66*/ {_display_(Seq[Any](format.raw/*246.68*/("""
                        """),format.raw/*247.25*/("""<li>
                            <a href=""""),_display_(/*248.39*/routes/*248.45*/.StudyGroupsController.index()),format.raw/*248.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*250.22*/("""
                    """),_display_(/*251.22*/if(session().get("role").equals("director"))/*251.66*/ {_display_(Seq[Any](format.raw/*251.68*/("""
                        """),format.raw/*252.25*/("""<li>
                            <a href=""""),_display_(/*253.39*/routes/*253.45*/.SemestersController.index()),format.raw/*253.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*255.22*/("""
                    """),_display_(/*256.22*/if(session().get("role").equals("director"))/*256.66*/ {_display_(Seq[Any](format.raw/*256.68*/("""
                        """),format.raw/*257.25*/("""<li>
                            <a href=""""),_display_(/*258.39*/routes/*258.45*/.StudyPlansController.index()),format.raw/*258.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*260.22*/("""
                    """),_display_(/*261.22*/if(session().get("role").equals("director"))/*261.66*/ {_display_(Seq[Any](format.raw/*261.68*/("""
                        """),format.raw/*262.25*/("""<li>
                            <a href=""""),_display_(/*263.39*/routes/*263.45*/.TeachersController.index()),format.raw/*263.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*265.22*/("""
                    """),_display_(/*266.22*/if(session().get("role").equals("director"))/*266.66*/ {_display_(Seq[Any](format.raw/*266.68*/("""
                        """),format.raw/*267.25*/("""<li>
                            <a href=""""),_display_(/*268.39*/routes/*268.45*/.CourseController.index()),format.raw/*268.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*270.22*/("""

                """),format.raw/*272.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*274.14*/("""
            """),format.raw/*275.13*/("""</li>
            <li>
            """),_display_(/*277.14*/if(session().get("role").equals("director"))/*277.58*/ {_display_(Seq[Any](format.raw/*277.60*/("""
                """),format.raw/*278.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*280.18*/if(session().get("role").equals("director"))/*280.62*/ {_display_(Seq[Any](format.raw/*280.64*/("""
                    """),format.raw/*281.21*/("""<li>
                        <a href=""""),_display_(/*282.35*/routes/*282.41*/.MethodicsController.index()),format.raw/*282.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*284.18*/("""
                """),format.raw/*285.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*287.14*/("""
            """),format.raw/*288.13*/("""</li>
            <li>
            """),_display_(/*290.14*/if(session().get("role").equals("director"))/*290.58*/ {_display_(Seq[Any](format.raw/*290.60*/("""
                """),format.raw/*291.17*/("""<a href='"""),_display_(/*291.27*/routes/*291.33*/.Application.forms),format.raw/*291.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*292.14*/("""
            """),format.raw/*293.13*/("""</li>
            <li>
            """),_display_(/*295.14*/if(session().get("role").equals("director"))/*295.58*/ {_display_(Seq[Any](format.raw/*295.60*/("""
                """),format.raw/*296.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*299.35*/routes/*299.41*/.UiElements.panelsAndWells),format.raw/*299.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*302.35*/routes/*302.41*/.UiElements.buttons),format.raw/*302.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*305.35*/routes/*305.41*/.UiElements.notifications),format.raw/*305.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*308.35*/routes/*308.41*/.UiElements.typography),format.raw/*308.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*311.35*/routes/*311.41*/.UiElements.icons),format.raw/*311.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*314.35*/routes/*314.41*/.UiElements.grid),format.raw/*314.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*318.14*/("""
            """),format.raw/*319.13*/("""</li>
            <li>
            """),_display_(/*321.14*/if(session().get("role").equals("director"))/*321.58*/ {_display_(Seq[Any](format.raw/*321.60*/("""
                """),format.raw/*322.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*351.14*/("""
            """),format.raw/*352.13*/("""</li>
            <li>
            """),_display_(/*354.14*/if(session().get("role").equals("director"))/*354.58*/ {_display_(Seq[Any](format.raw/*354.60*/("""
                """),format.raw/*355.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*360.35*/routes/*360.41*/.Charts.flot),format.raw/*360.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*363.35*/routes/*363.41*/.Charts.morris),format.raw/*363.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*367.14*/("""
            """),format.raw/*368.13*/("""</li>

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
                  DATE: Thu Apr 27 18:41:51 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 32b59e72a5ad6442470748e60e0c43345600aae6
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1805->749|1820->755|1890->804|1962->849|1977->855|2065->921|2194->1023|2209->1029|2314->1112|2531->1302|2584->1346|2624->1348|2669->1365|2854->1523|2907->1567|2947->1569|3000->1594|3070->1637|3085->1643|3173->1709|3342->1847|3392->1870|3445->1914|3485->1916|3538->1941|3608->1984|3623->1990|3688->2034|3877->2192|3926->2214|3979->2258|4019->2260|4072->2285|4142->2328|4157->2334|4207->2363|4372->2497|4421->2519|4474->2563|4514->2565|4567->2590|4637->2633|4652->2639|4706->2672|4875->2810|4924->2832|4977->2876|5017->2878|5070->2903|5140->2946|5155->2952|5214->2990|5385->3130|5434->3152|5487->3196|5527->3198|5580->3223|5650->3266|5665->3272|5717->3303|5878->3433|5927->3455|5980->3499|6020->3501|6073->3526|6143->3569|6158->3575|6211->3607|6377->3742|6426->3764|6479->3808|6519->3810|6572->3835|6642->3878|6657->3884|6709->3915|6873->4048|6922->4070|6975->4114|7015->4116|7068->4141|7138->4184|7153->4190|7208->4224|7379->4364|7428->4386|7481->4430|7521->4432|7574->4457|7644->4500|7659->4506|7712->4538|7875->4670|7924->4692|7977->4736|8017->4738|8070->4763|8140->4806|8155->4812|8207->4843|8370->4975|8420->4997|8474->5041|8515->5043|8569->5068|8640->5111|8656->5117|8714->5153|8875->5282|8925->5304|8979->5348|9020->5350|9074->5375|9145->5418|9161->5424|9213->5454|9342->5551|9392->5573|9446->5617|9487->5619|9541->5644|9612->5687|9628->5693|9689->5732|9862->5873|9912->5895|9966->5939|10007->5941|10061->5966|10132->6009|10148->6015|10228->6072|10417->6229|10467->6251|10521->6295|10562->6297|10616->6322|10687->6365|10703->6371|10752->6398|10879->6493|10929->6515|10983->6559|11024->6561|11078->6586|11149->6629|11165->6635|11220->6668|11382->6798|11432->6820|11486->6864|11527->6866|11581->6891|11652->6934|11668->6940|11725->6975|11890->7108|11940->7130|11994->7174|12035->7176|12089->7201|12160->7244|12176->7250|12236->7288|12409->7429|12455->7446|12554->7513|12596->7526|12660->7562|12714->7606|12755->7608|12801->7625|12996->7792|13050->7836|13091->7838|13145->7863|13216->7906|13232->7912|13266->7924|13366->7992|13416->8014|13470->8058|13511->8060|13565->8085|13636->8128|13652->8134|13692->8152|13785->8213|13835->8235|13889->8279|13930->8281|13984->8306|14055->8349|14071->8355|14111->8373|14209->8439|14259->8461|14313->8505|14354->8507|14408->8532|14479->8575|14495->8581|14539->8603|14633->8665|14683->8687|14737->8731|14778->8733|14832->8758|14903->8801|14919->8807|14979->8845|15094->8928|15144->8950|15198->8994|15239->8996|15293->9021|15364->9064|15380->9070|15427->9095|15535->9171|15585->9193|15639->9237|15680->9239|15734->9264|15805->9307|15821->9313|15869->9339|15978->9416|16028->9438|16082->9482|16123->9484|16177->9509|16248->9552|16264->9558|16314->9586|16421->9661|16471->9683|16525->9727|16566->9729|16620->9754|16691->9797|16707->9803|16760->9834|16870->9912|16920->9934|16974->9978|17015->9980|17069->10005|17140->10048|17156->10054|17216->10092|17337->10181|17387->10203|17441->10247|17482->10249|17536->10274|17607->10317|17623->10323|17695->10373|17799->10445|17849->10467|17903->10511|17944->10513|17998->10538|18069->10581|18085->10587|18136->10616|18252->10700|18302->10722|18356->10766|18397->10768|18451->10793|18522->10836|18538->10842|18590->10872|18695->10945|18745->10967|18799->11011|18840->11013|18894->11038|18965->11081|18981->11087|19023->11107|19117->11169|19167->11191|19221->11235|19262->11237|19316->11262|19387->11305|19403->11311|19450->11336|19556->11410|19606->11432|19660->11476|19701->11478|19755->11503|19826->11546|19842->11552|19892->11580|20004->11660|20055->11683|20109->11727|20150->11729|20204->11754|20275->11797|20291->11803|20339->11829|20448->11906|20499->11929|20553->11973|20594->11975|20648->12000|20719->12043|20735->12049|20788->12080|20894->12154|20944->12176|20998->12220|21039->12222|21093->12247|21164->12290|21180->12296|21232->12326|21340->12402|21390->12424|21444->12468|21485->12470|21539->12495|21610->12538|21626->12544|21676->12572|21785->12649|21835->12671|21889->12715|21930->12717|21984->12742|22055->12785|22071->12791|22122->12820|22239->12905|22289->12927|22343->12971|22384->12973|22438->12998|22509->13041|22525->13047|22574->13074|22682->13150|22732->13172|22786->13216|22827->13218|22881->13243|22952->13286|22968->13292|23015->13317|23121->13391|23168->13409|23267->13476|23309->13489|23373->13525|23427->13569|23468->13571|23514->13588|23700->13746|23754->13790|23795->13792|23845->13813|23912->13852|23928->13858|23978->13886|24075->13951|24121->13968|24220->14035|24262->14048|24326->14084|24380->14128|24421->14130|24467->14147|24505->14157|24521->14163|24561->14181|24655->14243|24697->14256|24761->14292|24815->14336|24856->14338|24902->14355|25129->14554|25145->14560|25193->14586|25329->14694|25345->14700|25386->14719|25513->14818|25529->14824|25576->14849|25709->14954|25725->14960|25769->14982|25899->15084|25915->15090|25954->15107|26080->15205|26096->15211|26134->15227|26286->15347|26328->15360|26392->15396|26446->15440|26487->15442|26533->15459|27843->16737|27885->16750|27949->16786|28003->16830|28044->16832|28090->16849|28357->17088|28373->17094|28407->17106|28538->17209|28554->17215|28590->17229|28754->17361|28796->17374
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|61->30|61->30|61->30|62->31|64->33|64->33|64->33|65->34|66->35|66->35|66->35|69->38|71->40|71->40|71->40|72->41|73->42|73->42|73->42|76->45|77->46|77->46|77->46|78->47|79->48|79->48|79->48|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|88->57|89->58|89->58|89->58|90->59|91->60|91->60|91->60|94->63|95->64|95->64|95->64|96->65|97->66|97->66|97->66|100->69|101->70|101->70|101->70|102->71|103->72|103->72|103->72|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|112->81|113->82|113->82|113->82|114->83|115->84|115->84|115->84|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|147->116|148->117|148->117|148->117|149->118|150->119|150->119|150->119|153->122|154->123|154->123|154->123|155->124|156->125|156->125|156->125|158->127|159->128|159->128|159->128|160->129|161->130|161->130|161->130|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|170->139|171->140|171->140|171->140|172->141|173->142|173->142|173->142|176->145|177->146|179->148|180->149|182->151|182->151|182->151|183->152|185->154|185->154|185->154|186->155|187->156|187->156|187->156|189->158|190->159|190->159|190->159|191->160|192->161|192->161|192->161|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|199->168|200->169|200->169|200->169|201->170|202->171|202->171|202->171|204->173|205->174|205->174|205->174|206->175|207->176|207->176|207->176|209->178|210->179|210->179|210->179|211->180|212->181|212->181|212->181|214->183|215->184|215->184|215->184|216->185|217->186|217->186|217->186|219->188|220->189|220->189|220->189|221->190|222->191|222->191|222->191|224->193|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|230->199|230->199|230->199|231->200|232->201|232->201|232->201|234->203|235->204|235->204|235->204|236->205|237->206|237->206|237->206|239->208|240->209|240->209|240->209|241->210|242->211|242->211|242->211|244->213|245->214|245->214|245->214|246->215|247->216|247->216|247->216|249->218|250->219|250->219|250->219|251->220|252->221|252->221|252->221|254->223|255->224|255->224|255->224|256->225|257->226|257->226|257->226|259->228|260->229|260->229|260->229|261->230|262->231|262->231|262->231|264->233|266->235|266->235|266->235|267->236|268->237|268->237|268->237|270->239|272->241|272->241|272->241|273->242|274->243|274->243|274->243|276->245|277->246|277->246|277->246|278->247|279->248|279->248|279->248|281->250|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|287->256|287->256|288->257|289->258|289->258|289->258|291->260|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|297->266|297->266|297->266|298->267|299->268|299->268|299->268|301->270|303->272|305->274|306->275|308->277|308->277|308->277|309->278|311->280|311->280|311->280|312->281|313->282|313->282|313->282|315->284|316->285|318->287|319->288|321->290|321->290|321->290|322->291|322->291|322->291|322->291|323->292|324->293|326->295|326->295|326->295|327->296|330->299|330->299|330->299|333->302|333->302|333->302|336->305|336->305|336->305|339->308|339->308|339->308|342->311|342->311|342->311|345->314|345->314|345->314|349->318|350->319|352->321|352->321|352->321|353->322|382->351|383->352|385->354|385->354|385->354|386->355|391->360|391->360|391->360|394->363|394->363|394->363|398->367|399->368
                  -- GENERATED --
              */
          