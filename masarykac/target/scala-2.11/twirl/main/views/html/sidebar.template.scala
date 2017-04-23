
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
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.EmployeesController.info(session().get("email"))),format.raw/*17.90*/("""">Info</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*25.14*/if(session().get("role").equals("director"))/*25.58*/ {_display_(Seq[Any](format.raw/*25.60*/("""
                """),format.raw/*26.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">

                    """),_display_(/*29.22*/if(session().get("role").equals("director"))/*29.66*/ {_display_(Seq[Any](format.raw/*29.68*/("""
                        """),format.raw/*30.25*/("""<li>
                            <a href='"""),_display_(/*31.39*/routes/*31.45*/.TableController.listPerson()),format.raw/*31.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*34.22*/("""
                    """),_display_(/*35.22*/if(session().get("role").equals("director"))/*35.66*/ {_display_(Seq[Any](format.raw/*35.68*/("""
                        """),format.raw/*36.25*/("""<li>
                            <a href='"""),_display_(/*37.39*/routes/*37.45*/.TableController.listStudyPlans()),format.raw/*37.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*40.22*/("""
                    """),_display_(/*41.22*/if(session().get("role").equals("director"))/*41.66*/ {_display_(Seq[Any](format.raw/*41.68*/("""
                        """),format.raw/*42.25*/("""<li>
                            <a href='"""),_display_(/*43.39*/routes/*43.45*/.TableController.listScheduleInWeeks()),format.raw/*43.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*46.22*/("""
                    """),_display_(/*47.22*/if(session().get("role").equals("director"))/*47.66*/ {_display_(Seq[Any](format.raw/*47.68*/("""
                        """),format.raw/*48.25*/("""<li>
                            <a href='"""),_display_(/*49.39*/routes/*49.45*/.TableController.listSchedule()),format.raw/*49.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*52.22*/("""
                    """),_display_(/*53.22*/if(session().get("role").equals("director"))/*53.66*/ {_display_(Seq[Any](format.raw/*53.68*/("""
                        """),format.raw/*54.25*/("""<li>
                            <a href='"""),_display_(/*55.39*/routes/*55.45*/.TableController.listEmployees()),format.raw/*55.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*58.22*/("""
                    """),_display_(/*59.22*/if(session().get("role").equals("director"))/*59.66*/ {_display_(Seq[Any](format.raw/*59.68*/("""
                        """),format.raw/*60.25*/("""<li>
                            <a href='"""),_display_(/*61.39*/routes/*61.45*/.TableController.listTeachers()),format.raw/*61.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*64.22*/("""
                    """),_display_(/*65.22*/if(session().get("role").equals("director"))/*65.66*/ {_display_(Seq[Any](format.raw/*65.68*/("""
                        """),format.raw/*66.25*/("""<li>
                            <a href='"""),_display_(/*67.39*/routes/*67.45*/.TableController.listStudyGroups()),format.raw/*67.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*70.22*/("""
                    """),_display_(/*71.22*/if(session().get("role").equals("director"))/*71.66*/ {_display_(Seq[Any](format.raw/*71.68*/("""
                        """),format.raw/*72.25*/("""<li>
                            <a href='"""),_display_(/*73.39*/routes/*73.45*/.TableController.listSemesters()),format.raw/*73.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*76.22*/("""
                    """),_display_(/*77.22*/if(session().get("role").equals("director"))/*77.66*/ {_display_(Seq[Any](format.raw/*77.68*/("""
                        """),format.raw/*78.25*/("""<li>
                            <a href='"""),_display_(/*79.39*/routes/*79.45*/.TableController.listSubjects()),format.raw/*79.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*82.22*/("""
                    """),_display_(/*83.22*/if(session().get("role").equals("director"))/*83.66*/ {_display_(Seq[Any](format.raw/*83.68*/("""
                        """),format.raw/*84.25*/("""<li>
                            <a href='"""),_display_(/*85.39*/routes/*85.45*/.TableController.listFieldsOfStudy()),format.raw/*85.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*88.22*/("""
                    """),_display_(/*89.22*/if(session().get("role").equals("director"))/*89.66*/ {_display_(Seq[Any](format.raw/*89.68*/("""
                        """),format.raw/*90.25*/("""<li>
                            <a href='"""),_display_(/*91.39*/routes/*91.45*/.TableController.listCourses()),format.raw/*91.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*93.22*/("""
                    """),_display_(/*94.22*/if(session().get("role").equals("director"))/*94.66*/ {_display_(Seq[Any](format.raw/*94.68*/("""
                        """),format.raw/*95.25*/("""<li>
                            <a href='"""),_display_(/*96.39*/routes/*96.45*/.TableController.listCurrentSemesters()),format.raw/*96.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*99.22*/("""
                    """),_display_(/*100.22*/if(session().get("role").equals("director"))/*100.66*/ {_display_(Seq[Any](format.raw/*100.68*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*102.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("director"))/*106.66*/ {_display_(Seq[Any](format.raw/*106.68*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listDays()),format.raw/*108.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*110.22*/("""
                """),format.raw/*111.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*113.14*/("""
            """),format.raw/*114.13*/("""</li>
            <li>
            """),_display_(/*116.14*/if(session().get("role").equals("director"))/*116.58*/ {_display_(Seq[Any](format.raw/*116.60*/("""
                """),format.raw/*117.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*119.22*/if(session().get("role").equals("director"))/*119.66*/ {_display_(Seq[Any](format.raw/*119.68*/("""
                        """),format.raw/*120.25*/("""<li>
                            <a href=""""),_display_(/*121.39*/routes/*121.45*/.Pages.blank),format.raw/*121.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director"))/*124.66*/ {_display_(Seq[Any](format.raw/*124.68*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href=""""),_display_(/*126.39*/routes/*126.45*/.Application.pdf()),format.raw/*126.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*128.22*/("""
                    """),_display_(/*129.22*/if(session().get("role").equals("director"))/*129.66*/ {_display_(Seq[Any](format.raw/*129.68*/("""
                        """),format.raw/*130.25*/("""<li>
                            <a href=""""),_display_(/*131.39*/routes/*131.45*/.Application.raw()),format.raw/*131.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*133.22*/("""
                    """),_display_(/*134.22*/if(session().get("role").equals("director"))/*134.66*/ {_display_(Seq[Any](format.raw/*134.68*/("""
                        """),format.raw/*135.25*/("""<li>
                            <a href=""""),_display_(/*136.39*/routes/*136.45*/.TestController.test()),format.raw/*136.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*138.22*/("""
                    """),_display_(/*139.22*/if(session().get("role").equals("director"))/*139.66*/ {_display_(Seq[Any](format.raw/*139.68*/("""
                        """),format.raw/*140.25*/("""<li>
                            <a href=""""),_display_(/*141.39*/routes/*141.45*/.SubjectPlanTeachingController.index()),format.raw/*141.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*143.22*/("""
                    """),_display_(/*144.22*/if(session().get("role").equals("director"))/*144.66*/ {_display_(Seq[Any](format.raw/*144.68*/("""
                        """),format.raw/*145.25*/("""<li>
                            <a href=""""),_display_(/*146.39*/routes/*146.45*/.VisitsController.index()),format.raw/*146.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*148.22*/("""
                    """),_display_(/*149.22*/if(session().get("role").equals("director"))/*149.66*/ {_display_(Seq[Any](format.raw/*149.68*/("""
                        """),format.raw/*150.25*/("""<li>
                            <a href=""""),_display_(/*151.39*/routes/*151.45*/.ProjectController.index()),format.raw/*151.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*153.22*/("""
                    """),_display_(/*154.22*/if(session().get("role").equals("director"))/*154.66*/ {_display_(Seq[Any](format.raw/*154.68*/("""
                        """),format.raw/*155.25*/("""<li>
                            <a href=""""),_display_(/*156.39*/routes/*156.45*/.CommitteeController.index()),format.raw/*156.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*158.22*/("""
                    """),_display_(/*159.22*/if(session().get("role").equals("director"))/*159.66*/ {_display_(Seq[Any](format.raw/*159.68*/("""
                        """),format.raw/*160.25*/("""<li>
                            <a href=""""),_display_(/*161.39*/routes/*161.45*/.PublicationsController.index()),format.raw/*161.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director"))/*164.66*/ {_display_(Seq[Any](format.raw/*164.68*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href=""""),_display_(/*166.39*/routes/*166.45*/.OrganizationalUnitsController.index()),format.raw/*166.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*168.22*/("""
                    """),_display_(/*169.22*/if(session().get("role").equals("director"))/*169.66*/ {_display_(Seq[Any](format.raw/*169.68*/("""
                        """),format.raw/*170.25*/("""<li>
                            <a href=""""),_display_(/*171.39*/routes/*171.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*171.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*173.22*/("""
                    """),_display_(/*174.22*/if(session().get("role").equals("director"))/*174.66*/ {_display_(Seq[Any](format.raw/*174.68*/("""
                        """),format.raw/*175.25*/("""<li>
                            <a href=""""),_display_(/*176.39*/routes/*176.45*/.FinalWorksController.index()),format.raw/*176.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*178.22*/("""
                    """),_display_(/*179.22*/if(session().get("role").equals("director"))/*179.66*/ {_display_(Seq[Any](format.raw/*179.68*/("""
                        """),format.raw/*180.25*/("""<li>
                            <a href=""""),_display_(/*181.39*/routes/*181.45*/.Application.kpiChoosePerson()),format.raw/*181.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*183.22*/("""
                    """),_display_(/*184.22*/if(session().get("role").equals("director"))/*184.66*/ {_display_(Seq[Any](format.raw/*184.68*/("""
                        """),format.raw/*185.25*/("""<li>
                            <a href=""""),_display_(/*186.39*/routes/*186.45*/.Application.roles()),format.raw/*186.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(session().get("role").equals("director"))/*189.66*/ {_display_(Seq[Any](format.raw/*189.68*/("""
                        """),format.raw/*190.25*/("""<li>
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.PersonController.index()),format.raw/*191.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""
                    """),_display_(/*194.22*/if(session().get("role").equals("director"))/*194.66*/ {_display_(Seq[Any](format.raw/*194.68*/("""
                        """),format.raw/*195.25*/("""<li>
                            <a href=""""),_display_(/*196.39*/routes/*196.45*/.EmployeesController.index()),format.raw/*196.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*198.22*/("""

                    """),_display_(/*200.22*/if(session().get("role").equals("director"))/*200.66*/ {_display_(Seq[Any](format.raw/*200.68*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href=""""),_display_(/*202.39*/routes/*202.45*/.SubjectController.index()),format.raw/*202.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*204.22*/("""

                    """),_display_(/*206.22*/if(session().get("role").equals("director"))/*206.66*/ {_display_(Seq[Any](format.raw/*206.68*/("""
                        """),format.raw/*207.25*/("""<li>
                            <a href=""""),_display_(/*208.39*/routes/*208.45*/.FieldOfStudyController.index()),format.raw/*208.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*210.22*/("""
                    """),_display_(/*211.22*/if(session().get("role").equals("director"))/*211.66*/ {_display_(Seq[Any](format.raw/*211.68*/("""
                        """),format.raw/*212.25*/("""<li>
                            <a href=""""),_display_(/*213.39*/routes/*213.45*/.StudyGroupsController.index()),format.raw/*213.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*215.22*/("""
                    """),_display_(/*216.22*/if(session().get("role").equals("director"))/*216.66*/ {_display_(Seq[Any](format.raw/*216.68*/("""
                        """),format.raw/*217.25*/("""<li>
                            <a href=""""),_display_(/*218.39*/routes/*218.45*/.SemestersController.index()),format.raw/*218.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*220.22*/("""
                    """),_display_(/*221.22*/if(session().get("role").equals("director"))/*221.66*/ {_display_(Seq[Any](format.raw/*221.68*/("""
                        """),format.raw/*222.25*/("""<li>
                            <a href=""""),_display_(/*223.39*/routes/*223.45*/.StudyPlansController.index()),format.raw/*223.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*225.22*/("""
                    """),_display_(/*226.22*/if(session().get("role").equals("director"))/*226.66*/ {_display_(Seq[Any](format.raw/*226.68*/("""
                        """),format.raw/*227.25*/("""<li>
                            <a href=""""),_display_(/*228.39*/routes/*228.45*/.TeachersController.index()),format.raw/*228.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*230.22*/("""
                    """),_display_(/*231.22*/if(session().get("role").equals("director"))/*231.66*/ {_display_(Seq[Any](format.raw/*231.68*/("""
                        """),format.raw/*232.25*/("""<li>
                            <a href=""""),_display_(/*233.39*/routes/*233.45*/.CourseController.index()),format.raw/*233.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*235.22*/("""

                """),format.raw/*237.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*239.14*/("""
            """),format.raw/*240.13*/("""</li>
            <li>
            """),_display_(/*242.14*/if(session().get("role").equals("director"))/*242.58*/ {_display_(Seq[Any](format.raw/*242.60*/("""
                """),format.raw/*243.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*245.18*/if(session().get("role").equals("director"))/*245.62*/ {_display_(Seq[Any](format.raw/*245.64*/("""
                    """),format.raw/*246.21*/("""<li>
                        <a href=""""),_display_(/*247.35*/routes/*247.41*/.MethodicsController.index()),format.raw/*247.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*249.18*/("""
                """),format.raw/*250.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*252.14*/("""
            """),format.raw/*253.13*/("""</li>
            <li>
            """),_display_(/*255.14*/if(session().get("role").equals("director"))/*255.58*/ {_display_(Seq[Any](format.raw/*255.60*/("""
                """),format.raw/*256.17*/("""<a href='"""),_display_(/*256.27*/routes/*256.33*/.Application.forms),format.raw/*256.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*257.14*/("""
            """),format.raw/*258.13*/("""</li>
            <li>
            """),_display_(/*260.14*/if(session().get("role").equals("director"))/*260.58*/ {_display_(Seq[Any](format.raw/*260.60*/("""
                """),format.raw/*261.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*264.35*/routes/*264.41*/.UiElements.panelsAndWells),format.raw/*264.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*267.35*/routes/*267.41*/.UiElements.buttons),format.raw/*267.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*270.35*/routes/*270.41*/.UiElements.notifications),format.raw/*270.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*273.35*/routes/*273.41*/.UiElements.typography),format.raw/*273.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*276.35*/routes/*276.41*/.UiElements.icons),format.raw/*276.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*279.35*/routes/*279.41*/.UiElements.grid),format.raw/*279.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*283.14*/("""
            """),format.raw/*284.13*/("""</li>
            <li>
            """),_display_(/*286.14*/if(session().get("role").equals("director"))/*286.58*/ {_display_(Seq[Any](format.raw/*286.60*/("""
                """),format.raw/*287.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*316.14*/("""
            """),format.raw/*317.13*/("""</li>
            <li>
            """),_display_(/*319.14*/if(session().get("role").equals("director"))/*319.58*/ {_display_(Seq[Any](format.raw/*319.60*/("""
                """),format.raw/*320.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*325.35*/routes/*325.41*/.Charts.flot),format.raw/*325.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*328.35*/routes/*328.41*/.Charts.morris),format.raw/*328.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*332.14*/("""
            """),format.raw/*333.13*/("""</li>

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
                  DATE: Sun Apr 23 18:22:08 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 94210b38f8be8af38f4c406f25b694a658700c20
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1804->748|1819->754|1889->803|2073->960|2126->1004|2166->1006|2211->1023|2397->1182|2450->1226|2490->1228|2543->1253|2613->1296|2628->1302|2678->1331|2843->1465|2892->1487|2945->1531|2985->1533|3038->1558|3108->1601|3123->1607|3177->1640|3346->1778|3395->1800|3448->1844|3488->1846|3541->1871|3611->1914|3626->1920|3685->1958|3856->2098|3905->2120|3958->2164|3998->2166|4051->2191|4121->2234|4136->2240|4188->2271|4349->2401|4398->2423|4451->2467|4491->2469|4544->2494|4614->2537|4629->2543|4682->2575|4848->2710|4897->2732|4950->2776|4990->2778|5043->2803|5113->2846|5128->2852|5180->2883|5344->3016|5393->3038|5446->3082|5486->3084|5539->3109|5609->3152|5624->3158|5679->3192|5850->3332|5899->3354|5952->3398|5992->3400|6045->3425|6115->3468|6130->3474|6183->3506|6346->3638|6395->3660|6448->3704|6488->3706|6541->3731|6611->3774|6626->3780|6678->3811|6841->3943|6890->3965|6943->4009|6983->4011|7036->4036|7106->4079|7121->4085|7178->4121|7338->4250|7387->4272|7440->4316|7480->4318|7533->4343|7603->4386|7618->4392|7669->4422|7797->4519|7846->4541|7899->4585|7939->4587|7992->4612|8062->4655|8077->4661|8137->4700|8309->4841|8359->4863|8413->4907|8454->4909|8508->4934|8579->4977|8595->4983|8675->5040|8864->5197|8914->5219|8968->5263|9009->5265|9063->5290|9134->5333|9150->5339|9199->5366|9326->5461|9372->5478|9471->5545|9513->5558|9577->5594|9631->5638|9672->5640|9718->5657|9913->5824|9967->5868|10008->5870|10062->5895|10133->5938|10149->5944|10183->5956|10283->6024|10333->6046|10387->6090|10428->6092|10482->6117|10553->6160|10569->6166|10609->6184|10702->6245|10752->6267|10806->6311|10847->6313|10901->6338|10972->6381|10988->6387|11028->6405|11126->6471|11176->6493|11230->6537|11271->6539|11325->6564|11396->6607|11412->6613|11456->6635|11550->6697|11600->6719|11654->6763|11695->6765|11749->6790|11820->6833|11836->6839|11896->6877|12011->6960|12061->6982|12115->7026|12156->7028|12210->7053|12281->7096|12297->7102|12344->7127|12452->7203|12502->7225|12556->7269|12597->7271|12651->7296|12722->7339|12738->7345|12786->7371|12895->7448|12945->7470|12999->7514|13040->7516|13094->7541|13165->7584|13181->7590|13231->7618|13338->7693|13388->7715|13442->7759|13483->7761|13537->7786|13608->7829|13624->7835|13677->7866|13787->7944|13837->7966|13891->8010|13932->8012|13986->8037|14057->8080|14073->8086|14133->8124|14254->8213|14304->8235|14358->8279|14399->8281|14453->8306|14524->8349|14540->8355|14612->8405|14716->8477|14766->8499|14820->8543|14861->8545|14915->8570|14986->8613|15002->8619|15053->8648|15169->8732|15219->8754|15273->8798|15314->8800|15368->8825|15439->8868|15455->8874|15507->8904|15612->8977|15662->8999|15716->9043|15757->9045|15811->9070|15882->9113|15898->9119|15940->9139|16034->9201|16084->9223|16138->9267|16179->9269|16233->9294|16304->9337|16320->9343|16367->9368|16473->9442|16523->9464|16577->9508|16618->9510|16672->9535|16743->9578|16759->9584|16809->9612|16921->9692|16972->9715|17026->9759|17067->9761|17121->9786|17192->9829|17208->9835|17256->9861|17365->9938|17416->9961|17470->10005|17511->10007|17565->10032|17636->10075|17652->10081|17705->10112|17811->10186|17861->10208|17915->10252|17956->10254|18010->10279|18081->10322|18097->10328|18149->10358|18257->10434|18307->10456|18361->10500|18402->10502|18456->10527|18527->10570|18543->10576|18593->10604|18702->10681|18752->10703|18806->10747|18847->10749|18901->10774|18972->10817|18988->10823|19039->10852|19156->10937|19206->10959|19260->11003|19301->11005|19355->11030|19426->11073|19442->11079|19491->11106|19599->11182|19649->11204|19703->11248|19744->11250|19798->11275|19869->11318|19885->11324|19932->11349|20038->11423|20085->11441|20184->11508|20226->11521|20290->11557|20344->11601|20385->11603|20431->11620|20617->11778|20671->11822|20712->11824|20762->11845|20829->11884|20845->11890|20895->11918|20992->11983|21038->12000|21137->12067|21179->12080|21243->12116|21297->12160|21338->12162|21384->12179|21422->12189|21438->12195|21478->12213|21572->12275|21614->12288|21678->12324|21732->12368|21773->12370|21819->12387|22046->12586|22062->12592|22110->12618|22246->12726|22262->12732|22303->12751|22430->12850|22446->12856|22493->12881|22626->12986|22642->12992|22686->13014|22816->13116|22832->13122|22871->13139|22997->13237|23013->13243|23051->13259|23203->13379|23245->13392|23309->13428|23363->13472|23404->13474|23450->13491|24760->14769|24802->14782|24866->14818|24920->14862|24961->14864|25007->14881|25274->15120|25290->15126|25324->15138|25455->15241|25471->15247|25507->15261|25671->15393|25713->15406
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|56->25|56->25|56->25|57->26|60->29|60->29|60->29|61->30|62->31|62->31|62->31|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|77->46|78->47|78->47|78->47|79->48|80->49|80->49|80->49|83->52|84->53|84->53|84->53|85->54|86->55|86->55|86->55|89->58|90->59|90->59|90->59|91->60|92->61|92->61|92->61|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|101->70|102->71|102->71|102->71|103->72|104->73|104->73|104->73|107->76|108->77|108->77|108->77|109->78|110->79|110->79|110->79|113->82|114->83|114->83|114->83|115->84|116->85|116->85|116->85|119->88|120->89|120->89|120->89|121->90|122->91|122->91|122->91|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|141->110|142->111|144->113|145->114|147->116|147->116|147->116|148->117|150->119|150->119|150->119|151->120|152->121|152->121|152->121|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|159->128|160->129|160->129|160->129|161->130|162->131|162->131|162->131|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|174->143|175->144|175->144|175->144|176->145|177->146|177->146|177->146|179->148|180->149|180->149|180->149|181->150|182->151|182->151|182->151|184->153|185->154|185->154|185->154|186->155|187->156|187->156|187->156|189->158|190->159|190->159|190->159|191->160|192->161|192->161|192->161|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|199->168|200->169|200->169|200->169|201->170|202->171|202->171|202->171|204->173|205->174|205->174|205->174|206->175|207->176|207->176|207->176|209->178|210->179|210->179|210->179|211->180|212->181|212->181|212->181|214->183|215->184|215->184|215->184|216->185|217->186|217->186|217->186|219->188|220->189|220->189|220->189|221->190|222->191|222->191|222->191|224->193|225->194|225->194|225->194|226->195|227->196|227->196|227->196|229->198|231->200|231->200|231->200|232->201|233->202|233->202|233->202|235->204|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|262->231|262->231|262->231|263->232|264->233|264->233|264->233|266->235|268->237|270->239|271->240|273->242|273->242|273->242|274->243|276->245|276->245|276->245|277->246|278->247|278->247|278->247|280->249|281->250|283->252|284->253|286->255|286->255|286->255|287->256|287->256|287->256|287->256|288->257|289->258|291->260|291->260|291->260|292->261|295->264|295->264|295->264|298->267|298->267|298->267|301->270|301->270|301->270|304->273|304->273|304->273|307->276|307->276|307->276|310->279|310->279|310->279|314->283|315->284|317->286|317->286|317->286|318->287|347->316|348->317|350->319|350->319|350->319|351->320|356->325|356->325|356->325|359->328|359->328|359->328|363->332|364->333
                  -- GENERATED --
              */
          