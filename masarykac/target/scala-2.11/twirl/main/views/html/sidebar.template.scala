
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
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*19.107*/("""">Můj souhrn aktivity v semestrech</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*27.14*/if(session().get("role").equals("director"))/*27.58*/ {_display_(Seq[Any](format.raw/*27.60*/("""
                """),format.raw/*28.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*30.22*/if(session().get("role").equals("director"))/*30.66*/ {_display_(Seq[Any](format.raw/*30.68*/("""
                        """),format.raw/*31.25*/("""<li>
                            <a href='"""),_display_(/*32.39*/routes/*32.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*32.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*35.22*/("""
                    """),_display_(/*36.22*/if(session().get("role").equals("director"))/*36.66*/ {_display_(Seq[Any](format.raw/*36.68*/("""
                        """),format.raw/*37.25*/("""<li>
                            <a href='"""),_display_(/*38.39*/routes/*38.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*38.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*41.22*/("""
                    """),_display_(/*42.22*/if(session().get("role").equals("director"))/*42.66*/ {_display_(Seq[Any](format.raw/*42.68*/("""
                        """),format.raw/*43.25*/("""<li>
                            <a href='"""),_display_(/*44.39*/routes/*44.45*/.TableController.listPerson()),format.raw/*44.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*47.22*/("""
                    """),_display_(/*48.22*/if(session().get("role").equals("director"))/*48.66*/ {_display_(Seq[Any](format.raw/*48.68*/("""
                        """),format.raw/*49.25*/("""<li>
                            <a href='"""),_display_(/*50.39*/routes/*50.45*/.TableController.listStudyPlans()),format.raw/*50.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*53.22*/("""
                    """),_display_(/*54.22*/if(session().get("role").equals("director"))/*54.66*/ {_display_(Seq[Any](format.raw/*54.68*/("""
                        """),format.raw/*55.25*/("""<li>
                            <a href='"""),_display_(/*56.39*/routes/*56.45*/.TableController.listScheduleInWeeks()),format.raw/*56.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*59.22*/("""
                    """),_display_(/*60.22*/if(session().get("role").equals("director"))/*60.66*/ {_display_(Seq[Any](format.raw/*60.68*/("""
                        """),format.raw/*61.25*/("""<li>
                            <a href='"""),_display_(/*62.39*/routes/*62.45*/.TableController.listSchedule()),format.raw/*62.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*65.22*/("""
                    """),_display_(/*66.22*/if(session().get("role").equals("director"))/*66.66*/ {_display_(Seq[Any](format.raw/*66.68*/("""
                        """),format.raw/*67.25*/("""<li>
                            <a href='"""),_display_(/*68.39*/routes/*68.45*/.TableController.listEmployees()),format.raw/*68.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*71.22*/("""
                    """),_display_(/*72.22*/if(session().get("role").equals("director"))/*72.66*/ {_display_(Seq[Any](format.raw/*72.68*/("""
                        """),format.raw/*73.25*/("""<li>
                            <a href='"""),_display_(/*74.39*/routes/*74.45*/.TableController.listTeachers()),format.raw/*74.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*77.22*/("""
                    """),_display_(/*78.22*/if(session().get("role").equals("director"))/*78.66*/ {_display_(Seq[Any](format.raw/*78.68*/("""
                        """),format.raw/*79.25*/("""<li>
                            <a href='"""),_display_(/*80.39*/routes/*80.45*/.TableController.listStudyGroups()),format.raw/*80.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*83.22*/("""
                    """),_display_(/*84.22*/if(session().get("role").equals("director"))/*84.66*/ {_display_(Seq[Any](format.raw/*84.68*/("""
                        """),format.raw/*85.25*/("""<li>
                            <a href='"""),_display_(/*86.39*/routes/*86.45*/.TableController.listSemesters()),format.raw/*86.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*89.22*/("""
                    """),_display_(/*90.22*/if(session().get("role").equals("director"))/*90.66*/ {_display_(Seq[Any](format.raw/*90.68*/("""
                        """),format.raw/*91.25*/("""<li>
                            <a href='"""),_display_(/*92.39*/routes/*92.45*/.TableController.listSubjects()),format.raw/*92.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*95.22*/("""
                    """),_display_(/*96.22*/if(session().get("role").equals("director"))/*96.66*/ {_display_(Seq[Any](format.raw/*96.68*/("""
                        """),format.raw/*97.25*/("""<li>
                            <a href='"""),_display_(/*98.39*/routes/*98.45*/.TableController.listFieldsOfStudy()),format.raw/*98.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*101.22*/("""
                    """),_display_(/*102.22*/if(session().get("role").equals("director"))/*102.66*/ {_display_(Seq[Any](format.raw/*102.68*/("""
                        """),format.raw/*103.25*/("""<li>
                            <a href='"""),_display_(/*104.39*/routes/*104.45*/.TableController.listCourses()),format.raw/*104.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*106.22*/("""
                    """),_display_(/*107.22*/if(session().get("role").equals("director"))/*107.66*/ {_display_(Seq[Any](format.raw/*107.68*/("""
                        """),format.raw/*108.25*/("""<li>
                            <a href='"""),_display_(/*109.39*/routes/*109.45*/.TableController.listCurrentSemesters()),format.raw/*109.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*112.22*/("""
                    """),_display_(/*113.22*/if(session().get("role").equals("director"))/*113.66*/ {_display_(Seq[Any](format.raw/*113.68*/("""
                        """),format.raw/*114.25*/("""<li>
                            <a href='"""),_display_(/*115.39*/routes/*115.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*115.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*118.22*/("""
                    """),_display_(/*119.22*/if(session().get("role").equals("director"))/*119.66*/ {_display_(Seq[Any](format.raw/*119.68*/("""
                        """),format.raw/*120.25*/("""<li>
                            <a href='"""),_display_(/*121.39*/routes/*121.45*/.TableController.listDays()),format.raw/*121.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director"))/*124.66*/ {_display_(Seq[Any](format.raw/*124.68*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listCommittees()),format.raw/*126.78*/("""'><i class="fa fa-table fa-fw"></i> Komise</a>
                        </li>
                    """)))}),format.raw/*128.22*/("""
                    """),_display_(/*129.22*/if(session().get("role").equals("director"))/*129.66*/ {_display_(Seq[Any](format.raw/*129.68*/("""
                        """),format.raw/*130.25*/("""<li>
                            <a href='"""),_display_(/*131.39*/routes/*131.45*/.TableController.listPublications()),format.raw/*131.80*/("""'><i class="fa fa-table fa-fw"></i> Publikace</a>
                        </li>
                    """)))}),format.raw/*133.22*/("""
                    """),_display_(/*134.22*/if(session().get("role").equals("director"))/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""<li>
                            <a href='"""),_display_(/*136.39*/routes/*136.45*/.TableController.listTeachersInWeeks()),format.raw/*136.83*/("""'><i class="fa fa-table fa-fw"></i> Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                """),format.raw/*139.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*141.14*/("""
            """),format.raw/*142.13*/("""</li>
            <li>
            """),_display_(/*144.14*/if(session().get("role").equals("director"))/*144.58*/ {_display_(Seq[Any](format.raw/*144.60*/("""
                """),format.raw/*145.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*147.22*/if(session().get("role").equals("director"))/*147.66*/ {_display_(Seq[Any](format.raw/*147.68*/("""
                        """),format.raw/*148.25*/("""<li>
                            <a href=""""),_display_(/*149.39*/routes/*149.45*/.Pages.blank),format.raw/*149.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*151.22*/("""
                    """),_display_(/*152.22*/if(session().get("role").equals("director"))/*152.66*/ {_display_(Seq[Any](format.raw/*152.68*/("""
                        """),format.raw/*153.25*/("""<li>
                            <a href=""""),_display_(/*154.39*/routes/*154.45*/.Application.pdf()),format.raw/*154.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*156.22*/("""
                    """),_display_(/*157.22*/if(session().get("role").equals("director"))/*157.66*/ {_display_(Seq[Any](format.raw/*157.68*/("""
                        """),format.raw/*158.25*/("""<li>
                            <a href=""""),_display_(/*159.39*/routes/*159.45*/.Application.raw()),format.raw/*159.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*161.22*/("""
                    """),_display_(/*162.22*/if(session().get("role").equals("director"))/*162.66*/ {_display_(Seq[Any](format.raw/*162.68*/("""
                        """),format.raw/*163.25*/("""<li>
                            <a href=""""),_display_(/*164.39*/routes/*164.45*/.TestController.test()),format.raw/*164.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*166.22*/("""
                    """),_display_(/*167.22*/if(session().get("role").equals("director"))/*167.66*/ {_display_(Seq[Any](format.raw/*167.68*/("""
                        """),format.raw/*168.25*/("""<li>
                            <a href=""""),_display_(/*169.39*/routes/*169.45*/.SubjectPlanTeachingController.index()),format.raw/*169.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*171.22*/("""
                    """),_display_(/*172.22*/if(session().get("role").equals("director"))/*172.66*/ {_display_(Seq[Any](format.raw/*172.68*/("""
                        """),format.raw/*173.25*/("""<li>
                            <a href=""""),_display_(/*174.39*/routes/*174.45*/.VisitsController.index()),format.raw/*174.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*176.22*/("""
                    """),_display_(/*177.22*/if(session().get("role").equals("director"))/*177.66*/ {_display_(Seq[Any](format.raw/*177.68*/("""
                        """),format.raw/*178.25*/("""<li>
                            <a href=""""),_display_(/*179.39*/routes/*179.45*/.ProjectController.index()),format.raw/*179.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*181.22*/("""
                    """),_display_(/*182.22*/if(session().get("role").equals("director"))/*182.66*/ {_display_(Seq[Any](format.raw/*182.68*/("""
                        """),format.raw/*183.25*/("""<li>
                            <a href=""""),_display_(/*184.39*/routes/*184.45*/.CommitteeController.index()),format.raw/*184.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*186.22*/("""
                    """),_display_(/*187.22*/if(session().get("role").equals("director"))/*187.66*/ {_display_(Seq[Any](format.raw/*187.68*/("""
                        """),format.raw/*188.25*/("""<li>
                            <a href=""""),_display_(/*189.39*/routes/*189.45*/.PublicationsController.index()),format.raw/*189.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*191.22*/("""
                    """),_display_(/*192.22*/if(session().get("role").equals("director"))/*192.66*/ {_display_(Seq[Any](format.raw/*192.68*/("""
                        """),format.raw/*193.25*/("""<li>
                            <a href=""""),_display_(/*194.39*/routes/*194.45*/.OrganizationalUnitsController.index()),format.raw/*194.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*196.22*/("""
                    """),_display_(/*197.22*/if(session().get("role").equals("director"))/*197.66*/ {_display_(Seq[Any](format.raw/*197.68*/("""
                        """),format.raw/*198.25*/("""<li>
                            <a href=""""),_display_(/*199.39*/routes/*199.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*199.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*201.22*/("""
                    """),_display_(/*202.22*/if(session().get("role").equals("director"))/*202.66*/ {_display_(Seq[Any](format.raw/*202.68*/("""
                        """),format.raw/*203.25*/("""<li>
                            <a href=""""),_display_(/*204.39*/routes/*204.45*/.FinalWorksController.index()),format.raw/*204.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*206.22*/("""
                    """),_display_(/*207.22*/if(session().get("role").equals("director"))/*207.66*/ {_display_(Seq[Any](format.raw/*207.68*/("""
                        """),format.raw/*208.25*/("""<li>
                            <a href=""""),_display_(/*209.39*/routes/*209.45*/.Application.kpiChoosePerson()),format.raw/*209.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*211.22*/("""
                    """),_display_(/*212.22*/if(session().get("role").equals("director"))/*212.66*/ {_display_(Seq[Any](format.raw/*212.68*/("""
                        """),format.raw/*213.25*/("""<li>
                            <a href=""""),_display_(/*214.39*/routes/*214.45*/.Application.roles()),format.raw/*214.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*216.22*/("""
                    """),_display_(/*217.22*/if(session().get("role").equals("director"))/*217.66*/ {_display_(Seq[Any](format.raw/*217.68*/("""
                        """),format.raw/*218.25*/("""<li>
                            <a href=""""),_display_(/*219.39*/routes/*219.45*/.PersonController.index()),format.raw/*219.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*221.22*/("""
                    """),_display_(/*222.22*/if(session().get("role").equals("director"))/*222.66*/ {_display_(Seq[Any](format.raw/*222.68*/("""
                        """),format.raw/*223.25*/("""<li>
                            <a href=""""),_display_(/*224.39*/routes/*224.45*/.EmployeesController.index()),format.raw/*224.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*226.22*/("""

                    """),_display_(/*228.22*/if(session().get("role").equals("director"))/*228.66*/ {_display_(Seq[Any](format.raw/*228.68*/("""
                        """),format.raw/*229.25*/("""<li>
                            <a href=""""),_display_(/*230.39*/routes/*230.45*/.SubjectController.index()),format.raw/*230.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*232.22*/("""

                    """),_display_(/*234.22*/if(session().get("role").equals("director"))/*234.66*/ {_display_(Seq[Any](format.raw/*234.68*/("""
                        """),format.raw/*235.25*/("""<li>
                            <a href=""""),_display_(/*236.39*/routes/*236.45*/.FieldOfStudyController.index()),format.raw/*236.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*238.22*/("""
                    """),_display_(/*239.22*/if(session().get("role").equals("director"))/*239.66*/ {_display_(Seq[Any](format.raw/*239.68*/("""
                        """),format.raw/*240.25*/("""<li>
                            <a href=""""),_display_(/*241.39*/routes/*241.45*/.StudyGroupsController.index()),format.raw/*241.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*243.22*/("""
                    """),_display_(/*244.22*/if(session().get("role").equals("director"))/*244.66*/ {_display_(Seq[Any](format.raw/*244.68*/("""
                        """),format.raw/*245.25*/("""<li>
                            <a href=""""),_display_(/*246.39*/routes/*246.45*/.SemestersController.index()),format.raw/*246.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*248.22*/("""
                    """),_display_(/*249.22*/if(session().get("role").equals("director"))/*249.66*/ {_display_(Seq[Any](format.raw/*249.68*/("""
                        """),format.raw/*250.25*/("""<li>
                            <a href=""""),_display_(/*251.39*/routes/*251.45*/.StudyPlansController.index()),format.raw/*251.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*253.22*/("""
                    """),_display_(/*254.22*/if(session().get("role").equals("director"))/*254.66*/ {_display_(Seq[Any](format.raw/*254.68*/("""
                        """),format.raw/*255.25*/("""<li>
                            <a href=""""),_display_(/*256.39*/routes/*256.45*/.TeachersController.index()),format.raw/*256.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*258.22*/("""
                    """),_display_(/*259.22*/if(session().get("role").equals("director"))/*259.66*/ {_display_(Seq[Any](format.raw/*259.68*/("""
                        """),format.raw/*260.25*/("""<li>
                            <a href=""""),_display_(/*261.39*/routes/*261.45*/.CourseController.index()),format.raw/*261.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*263.22*/("""

                """),format.raw/*265.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*267.14*/("""
            """),format.raw/*268.13*/("""</li>
            <li>
            """),_display_(/*270.14*/if(session().get("role").equals("director"))/*270.58*/ {_display_(Seq[Any](format.raw/*270.60*/("""
                """),format.raw/*271.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*273.18*/if(session().get("role").equals("director"))/*273.62*/ {_display_(Seq[Any](format.raw/*273.64*/("""
                    """),format.raw/*274.21*/("""<li>
                        <a href=""""),_display_(/*275.35*/routes/*275.41*/.MethodicsController.index()),format.raw/*275.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*277.18*/("""
                """),format.raw/*278.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*280.14*/("""
            """),format.raw/*281.13*/("""</li>
            <li>
            """),_display_(/*283.14*/if(session().get("role").equals("director"))/*283.58*/ {_display_(Seq[Any](format.raw/*283.60*/("""
                """),format.raw/*284.17*/("""<a href='"""),_display_(/*284.27*/routes/*284.33*/.Application.forms),format.raw/*284.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*285.14*/("""
            """),format.raw/*286.13*/("""</li>
            <li>
            """),_display_(/*288.14*/if(session().get("role").equals("director"))/*288.58*/ {_display_(Seq[Any](format.raw/*288.60*/("""
                """),format.raw/*289.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*292.35*/routes/*292.41*/.UiElements.panelsAndWells),format.raw/*292.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*295.35*/routes/*295.41*/.UiElements.buttons),format.raw/*295.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*298.35*/routes/*298.41*/.UiElements.notifications),format.raw/*298.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*301.35*/routes/*301.41*/.UiElements.typography),format.raw/*301.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*304.35*/routes/*304.41*/.UiElements.icons),format.raw/*304.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*307.35*/routes/*307.41*/.UiElements.grid),format.raw/*307.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*311.14*/("""
            """),format.raw/*312.13*/("""</li>
            <li>
            """),_display_(/*314.14*/if(session().get("role").equals("director"))/*314.58*/ {_display_(Seq[Any](format.raw/*314.60*/("""
                """),format.raw/*315.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*344.14*/("""
            """),format.raw/*345.13*/("""</li>
            <li>
            """),_display_(/*347.14*/if(session().get("role").equals("director"))/*347.58*/ {_display_(Seq[Any](format.raw/*347.60*/("""
                """),format.raw/*348.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*353.35*/routes/*353.41*/.Charts.flot),format.raw/*353.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*356.35*/routes/*356.41*/.Charts.morris),format.raw/*356.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*360.14*/("""
            """),format.raw/*361.13*/("""</li>

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
                  DATE: Thu Apr 27 11:16:50 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 0f0485ce63fbd1e7e49ee3da9664356ea73ecf41
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1805->749|1820->755|1890->804|1962->849|1977->855|2065->921|2277->1106|2330->1150|2370->1152|2415->1169|2600->1327|2653->1371|2693->1373|2746->1398|2816->1441|2831->1447|2919->1513|3088->1651|3137->1673|3190->1717|3230->1719|3283->1744|3353->1787|3368->1793|3433->1837|3622->1995|3671->2017|3724->2061|3764->2063|3817->2088|3887->2131|3902->2137|3952->2166|4117->2300|4166->2322|4219->2366|4259->2368|4312->2393|4382->2436|4397->2442|4451->2475|4620->2613|4669->2635|4722->2679|4762->2681|4815->2706|4885->2749|4900->2755|4959->2793|5130->2933|5179->2955|5232->2999|5272->3001|5325->3026|5395->3069|5410->3075|5462->3106|5623->3236|5672->3258|5725->3302|5765->3304|5818->3329|5888->3372|5903->3378|5956->3410|6122->3545|6171->3567|6224->3611|6264->3613|6317->3638|6387->3681|6402->3687|6454->3718|6618->3851|6667->3873|6720->3917|6760->3919|6813->3944|6883->3987|6898->3993|6953->4027|7124->4167|7173->4189|7226->4233|7266->4235|7319->4260|7389->4303|7404->4309|7457->4341|7620->4473|7669->4495|7722->4539|7762->4541|7815->4566|7885->4609|7900->4615|7952->4646|8115->4778|8164->4800|8217->4844|8257->4846|8310->4871|8380->4914|8395->4920|8452->4956|8613->5085|8663->5107|8717->5151|8758->5153|8812->5178|8883->5221|8899->5227|8951->5257|9080->5354|9130->5376|9184->5420|9225->5422|9279->5447|9350->5490|9366->5496|9427->5535|9600->5676|9650->5698|9704->5742|9745->5744|9799->5769|9870->5812|9886->5818|9966->5875|10155->6032|10205->6054|10259->6098|10300->6100|10354->6125|10425->6168|10441->6174|10490->6201|10617->6296|10667->6318|10721->6362|10762->6364|10816->6389|10887->6432|10903->6438|10958->6471|11088->6569|11138->6591|11192->6635|11233->6637|11287->6662|11358->6705|11374->6711|11431->6746|11564->6847|11614->6869|11668->6913|11709->6915|11763->6940|11834->6983|11850->6989|11910->7027|12051->7136|12097->7153|12196->7220|12238->7233|12302->7269|12356->7313|12397->7315|12443->7332|12638->7499|12692->7543|12733->7545|12787->7570|12858->7613|12874->7619|12908->7631|13008->7699|13058->7721|13112->7765|13153->7767|13207->7792|13278->7835|13294->7841|13334->7859|13427->7920|13477->7942|13531->7986|13572->7988|13626->8013|13697->8056|13713->8062|13753->8080|13851->8146|13901->8168|13955->8212|13996->8214|14050->8239|14121->8282|14137->8288|14181->8310|14275->8372|14325->8394|14379->8438|14420->8440|14474->8465|14545->8508|14561->8514|14621->8552|14736->8635|14786->8657|14840->8701|14881->8703|14935->8728|15006->8771|15022->8777|15069->8802|15177->8878|15227->8900|15281->8944|15322->8946|15376->8971|15447->9014|15463->9020|15511->9046|15620->9123|15670->9145|15724->9189|15765->9191|15819->9216|15890->9259|15906->9265|15956->9293|16063->9368|16113->9390|16167->9434|16208->9436|16262->9461|16333->9504|16349->9510|16402->9541|16512->9619|16562->9641|16616->9685|16657->9687|16711->9712|16782->9755|16798->9761|16858->9799|16979->9888|17029->9910|17083->9954|17124->9956|17178->9981|17249->10024|17265->10030|17337->10080|17441->10152|17491->10174|17545->10218|17586->10220|17640->10245|17711->10288|17727->10294|17778->10323|17894->10407|17944->10429|17998->10473|18039->10475|18093->10500|18164->10543|18180->10549|18232->10579|18337->10652|18387->10674|18441->10718|18482->10720|18536->10745|18607->10788|18623->10794|18665->10814|18759->10876|18809->10898|18863->10942|18904->10944|18958->10969|19029->11012|19045->11018|19092->11043|19198->11117|19248->11139|19302->11183|19343->11185|19397->11210|19468->11253|19484->11259|19534->11287|19646->11367|19697->11390|19751->11434|19792->11436|19846->11461|19917->11504|19933->11510|19981->11536|20090->11613|20141->11636|20195->11680|20236->11682|20290->11707|20361->11750|20377->11756|20430->11787|20536->11861|20586->11883|20640->11927|20681->11929|20735->11954|20806->11997|20822->12003|20874->12033|20982->12109|21032->12131|21086->12175|21127->12177|21181->12202|21252->12245|21268->12251|21318->12279|21427->12356|21477->12378|21531->12422|21572->12424|21626->12449|21697->12492|21713->12498|21764->12527|21881->12612|21931->12634|21985->12678|22026->12680|22080->12705|22151->12748|22167->12754|22216->12781|22324->12857|22374->12879|22428->12923|22469->12925|22523->12950|22594->12993|22610->12999|22657->13024|22763->13098|22810->13116|22909->13183|22951->13196|23015->13232|23069->13276|23110->13278|23156->13295|23342->13453|23396->13497|23437->13499|23487->13520|23554->13559|23570->13565|23620->13593|23717->13658|23763->13675|23862->13742|23904->13755|23968->13791|24022->13835|24063->13837|24109->13854|24147->13864|24163->13870|24203->13888|24297->13950|24339->13963|24403->13999|24457->14043|24498->14045|24544->14062|24771->14261|24787->14267|24835->14293|24971->14401|24987->14407|25028->14426|25155->14525|25171->14531|25218->14556|25351->14661|25367->14667|25411->14689|25541->14791|25557->14797|25596->14814|25722->14912|25738->14918|25776->14934|25928->15054|25970->15067|26034->15103|26088->15147|26129->15149|26175->15166|27485->16444|27527->16457|27591->16493|27645->16537|27686->16539|27732->16556|27999->16795|28015->16801|28049->16813|28180->16916|28196->16922|28232->16936|28396->17068|28438->17081
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|50->19|50->19|50->19|58->27|58->27|58->27|59->28|61->30|61->30|61->30|62->31|63->32|63->32|63->32|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|78->47|79->48|79->48|79->48|80->49|81->50|81->50|81->50|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|90->59|91->60|91->60|91->60|92->61|93->62|93->62|93->62|96->65|97->66|97->66|97->66|98->67|99->68|99->68|99->68|102->71|103->72|103->72|103->72|104->73|105->74|105->74|105->74|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|114->83|115->84|115->84|115->84|116->85|117->86|117->86|117->86|120->89|121->90|121->90|121->90|122->91|123->92|123->92|123->92|126->95|127->96|127->96|127->96|128->97|129->98|129->98|129->98|132->101|133->102|133->102|133->102|134->103|135->104|135->104|135->104|137->106|138->107|138->107|138->107|139->108|140->109|140->109|140->109|143->112|144->113|144->113|144->113|145->114|146->115|146->115|146->115|149->118|150->119|150->119|150->119|151->120|152->121|152->121|152->121|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|159->128|160->129|160->129|160->129|161->130|162->131|162->131|162->131|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|169->138|170->139|172->141|173->142|175->144|175->144|175->144|176->145|178->147|178->147|178->147|179->148|180->149|180->149|180->149|182->151|183->152|183->152|183->152|184->153|185->154|185->154|185->154|187->156|188->157|188->157|188->157|189->158|190->159|190->159|190->159|192->161|193->162|193->162|193->162|194->163|195->164|195->164|195->164|197->166|198->167|198->167|198->167|199->168|200->169|200->169|200->169|202->171|203->172|203->172|203->172|204->173|205->174|205->174|205->174|207->176|208->177|208->177|208->177|209->178|210->179|210->179|210->179|212->181|213->182|213->182|213->182|214->183|215->184|215->184|215->184|217->186|218->187|218->187|218->187|219->188|220->189|220->189|220->189|222->191|223->192|223->192|223->192|224->193|225->194|225->194|225->194|227->196|228->197|228->197|228->197|229->198|230->199|230->199|230->199|232->201|233->202|233->202|233->202|234->203|235->204|235->204|235->204|237->206|238->207|238->207|238->207|239->208|240->209|240->209|240->209|242->211|243->212|243->212|243->212|244->213|245->214|245->214|245->214|247->216|248->217|248->217|248->217|249->218|250->219|250->219|250->219|252->221|253->222|253->222|253->222|254->223|255->224|255->224|255->224|257->226|259->228|259->228|259->228|260->229|261->230|261->230|261->230|263->232|265->234|265->234|265->234|266->235|267->236|267->236|267->236|269->238|270->239|270->239|270->239|271->240|272->241|272->241|272->241|274->243|275->244|275->244|275->244|276->245|277->246|277->246|277->246|279->248|280->249|280->249|280->249|281->250|282->251|282->251|282->251|284->253|285->254|285->254|285->254|286->255|287->256|287->256|287->256|289->258|290->259|290->259|290->259|291->260|292->261|292->261|292->261|294->263|296->265|298->267|299->268|301->270|301->270|301->270|302->271|304->273|304->273|304->273|305->274|306->275|306->275|306->275|308->277|309->278|311->280|312->281|314->283|314->283|314->283|315->284|315->284|315->284|315->284|316->285|317->286|319->288|319->288|319->288|320->289|323->292|323->292|323->292|326->295|326->295|326->295|329->298|329->298|329->298|332->301|332->301|332->301|335->304|335->304|335->304|338->307|338->307|338->307|342->311|343->312|345->314|345->314|345->314|346->315|375->344|376->345|378->347|378->347|378->347|379->348|384->353|384->353|384->353|387->356|387->356|387->356|391->360|392->361
                  -- GENERATED --
              */
          