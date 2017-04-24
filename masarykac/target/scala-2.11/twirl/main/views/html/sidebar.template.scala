
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

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*26.14*/if(session().get("role").equals("director"))/*26.58*/ {_display_(Seq[Any](format.raw/*26.60*/("""
                """),format.raw/*27.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">

                    """),_display_(/*30.22*/if(session().get("role").equals("director"))/*30.66*/ {_display_(Seq[Any](format.raw/*30.68*/("""
                        """),format.raw/*31.25*/("""<li>
                            <a href='"""),_display_(/*32.39*/routes/*32.45*/.TableController.listPerson()),format.raw/*32.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*35.22*/("""
                    """),_display_(/*36.22*/if(session().get("role").equals("director"))/*36.66*/ {_display_(Seq[Any](format.raw/*36.68*/("""
                        """),format.raw/*37.25*/("""<li>
                            <a href='"""),_display_(/*38.39*/routes/*38.45*/.TableController.listStudyPlans()),format.raw/*38.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*41.22*/("""
                    """),_display_(/*42.22*/if(session().get("role").equals("director"))/*42.66*/ {_display_(Seq[Any](format.raw/*42.68*/("""
                        """),format.raw/*43.25*/("""<li>
                            <a href='"""),_display_(/*44.39*/routes/*44.45*/.TableController.listScheduleInWeeks()),format.raw/*44.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*47.22*/("""
                    """),_display_(/*48.22*/if(session().get("role").equals("director"))/*48.66*/ {_display_(Seq[Any](format.raw/*48.68*/("""
                        """),format.raw/*49.25*/("""<li>
                            <a href='"""),_display_(/*50.39*/routes/*50.45*/.TableController.listSchedule()),format.raw/*50.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*53.22*/("""
                    """),_display_(/*54.22*/if(session().get("role").equals("director"))/*54.66*/ {_display_(Seq[Any](format.raw/*54.68*/("""
                        """),format.raw/*55.25*/("""<li>
                            <a href='"""),_display_(/*56.39*/routes/*56.45*/.TableController.listEmployees()),format.raw/*56.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*59.22*/("""
                    """),_display_(/*60.22*/if(session().get("role").equals("director"))/*60.66*/ {_display_(Seq[Any](format.raw/*60.68*/("""
                        """),format.raw/*61.25*/("""<li>
                            <a href='"""),_display_(/*62.39*/routes/*62.45*/.TableController.listTeachers()),format.raw/*62.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*65.22*/("""
                    """),_display_(/*66.22*/if(session().get("role").equals("director"))/*66.66*/ {_display_(Seq[Any](format.raw/*66.68*/("""
                        """),format.raw/*67.25*/("""<li>
                            <a href='"""),_display_(/*68.39*/routes/*68.45*/.TableController.listStudyGroups()),format.raw/*68.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*71.22*/("""
                    """),_display_(/*72.22*/if(session().get("role").equals("director"))/*72.66*/ {_display_(Seq[Any](format.raw/*72.68*/("""
                        """),format.raw/*73.25*/("""<li>
                            <a href='"""),_display_(/*74.39*/routes/*74.45*/.TableController.listSemesters()),format.raw/*74.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*77.22*/("""
                    """),_display_(/*78.22*/if(session().get("role").equals("director"))/*78.66*/ {_display_(Seq[Any](format.raw/*78.68*/("""
                        """),format.raw/*79.25*/("""<li>
                            <a href='"""),_display_(/*80.39*/routes/*80.45*/.TableController.listSubjects()),format.raw/*80.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*83.22*/("""
                    """),_display_(/*84.22*/if(session().get("role").equals("director"))/*84.66*/ {_display_(Seq[Any](format.raw/*84.68*/("""
                        """),format.raw/*85.25*/("""<li>
                            <a href='"""),_display_(/*86.39*/routes/*86.45*/.TableController.listFieldsOfStudy()),format.raw/*86.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*89.22*/("""
                    """),_display_(/*90.22*/if(session().get("role").equals("director"))/*90.66*/ {_display_(Seq[Any](format.raw/*90.68*/("""
                        """),format.raw/*91.25*/("""<li>
                            <a href='"""),_display_(/*92.39*/routes/*92.45*/.TableController.listCourses()),format.raw/*92.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*94.22*/("""
                    """),_display_(/*95.22*/if(session().get("role").equals("director"))/*95.66*/ {_display_(Seq[Any](format.raw/*95.68*/("""
                        """),format.raw/*96.25*/("""<li>
                            <a href='"""),_display_(/*97.39*/routes/*97.45*/.TableController.listCurrentSemesters()),format.raw/*97.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*100.22*/("""
                    """),_display_(/*101.22*/if(session().get("role").equals("director"))/*101.66*/ {_display_(Seq[Any](format.raw/*101.68*/("""
                        """),format.raw/*102.25*/("""<li>
                            <a href='"""),_display_(/*103.39*/routes/*103.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*103.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*106.22*/("""
                    """),_display_(/*107.22*/if(session().get("role").equals("director"))/*107.66*/ {_display_(Seq[Any](format.raw/*107.68*/("""
                        """),format.raw/*108.25*/("""<li>
                            <a href='"""),_display_(/*109.39*/routes/*109.45*/.TableController.listDays()),format.raw/*109.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director"))/*112.66*/ {_display_(Seq[Any](format.raw/*112.68*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listCommittees()),format.raw/*114.78*/("""'><i class="fa fa-table fa-fw"></i> Komise</a>
                        </li>
                    """)))}),format.raw/*116.22*/("""
                """),format.raw/*117.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*119.14*/("""
            """),format.raw/*120.13*/("""</li>
            <li>
            """),_display_(/*122.14*/if(session().get("role").equals("director"))/*122.58*/ {_display_(Seq[Any](format.raw/*122.60*/("""
                """),format.raw/*123.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*125.22*/if(session().get("role").equals("director"))/*125.66*/ {_display_(Seq[Any](format.raw/*125.68*/("""
                        """),format.raw/*126.25*/("""<li>
                            <a href=""""),_display_(/*127.39*/routes/*127.45*/.Pages.blank),format.raw/*127.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director"))/*130.66*/ {_display_(Seq[Any](format.raw/*130.68*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href=""""),_display_(/*132.39*/routes/*132.45*/.Application.pdf()),format.raw/*132.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*134.22*/("""
                    """),_display_(/*135.22*/if(session().get("role").equals("director"))/*135.66*/ {_display_(Seq[Any](format.raw/*135.68*/("""
                        """),format.raw/*136.25*/("""<li>
                            <a href=""""),_display_(/*137.39*/routes/*137.45*/.Application.raw()),format.raw/*137.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*139.22*/("""
                    """),_display_(/*140.22*/if(session().get("role").equals("director"))/*140.66*/ {_display_(Seq[Any](format.raw/*140.68*/("""
                        """),format.raw/*141.25*/("""<li>
                            <a href=""""),_display_(/*142.39*/routes/*142.45*/.TestController.test()),format.raw/*142.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href=""""),_display_(/*147.39*/routes/*147.45*/.SubjectPlanTeachingController.index()),format.raw/*147.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(session().get("role").equals("director"))/*150.66*/ {_display_(Seq[Any](format.raw/*150.68*/("""
                        """),format.raw/*151.25*/("""<li>
                            <a href=""""),_display_(/*152.39*/routes/*152.45*/.VisitsController.index()),format.raw/*152.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*154.22*/("""
                    """),_display_(/*155.22*/if(session().get("role").equals("director"))/*155.66*/ {_display_(Seq[Any](format.raw/*155.68*/("""
                        """),format.raw/*156.25*/("""<li>
                            <a href=""""),_display_(/*157.39*/routes/*157.45*/.ProjectController.index()),format.raw/*157.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*159.22*/("""
                    """),_display_(/*160.22*/if(session().get("role").equals("director"))/*160.66*/ {_display_(Seq[Any](format.raw/*160.68*/("""
                        """),format.raw/*161.25*/("""<li>
                            <a href=""""),_display_(/*162.39*/routes/*162.45*/.CommitteeController.index()),format.raw/*162.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*164.22*/("""
                    """),_display_(/*165.22*/if(session().get("role").equals("director"))/*165.66*/ {_display_(Seq[Any](format.raw/*165.68*/("""
                        """),format.raw/*166.25*/("""<li>
                            <a href=""""),_display_(/*167.39*/routes/*167.45*/.PublicationsController.index()),format.raw/*167.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/if(session().get("role").equals("director"))/*170.66*/ {_display_(Seq[Any](format.raw/*170.68*/("""
                        """),format.raw/*171.25*/("""<li>
                            <a href=""""),_display_(/*172.39*/routes/*172.45*/.OrganizationalUnitsController.index()),format.raw/*172.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*174.22*/("""
                    """),_display_(/*175.22*/if(session().get("role").equals("director"))/*175.66*/ {_display_(Seq[Any](format.raw/*175.68*/("""
                        """),format.raw/*176.25*/("""<li>
                            <a href=""""),_display_(/*177.39*/routes/*177.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*177.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*179.22*/("""
                    """),_display_(/*180.22*/if(session().get("role").equals("director"))/*180.66*/ {_display_(Seq[Any](format.raw/*180.68*/("""
                        """),format.raw/*181.25*/("""<li>
                            <a href=""""),_display_(/*182.39*/routes/*182.45*/.FinalWorksController.index()),format.raw/*182.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*184.22*/("""
                    """),_display_(/*185.22*/if(session().get("role").equals("director"))/*185.66*/ {_display_(Seq[Any](format.raw/*185.68*/("""
                        """),format.raw/*186.25*/("""<li>
                            <a href=""""),_display_(/*187.39*/routes/*187.45*/.Application.kpiChoosePerson()),format.raw/*187.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*189.22*/("""
                    """),_display_(/*190.22*/if(session().get("role").equals("director"))/*190.66*/ {_display_(Seq[Any](format.raw/*190.68*/("""
                        """),format.raw/*191.25*/("""<li>
                            <a href=""""),_display_(/*192.39*/routes/*192.45*/.Application.roles()),format.raw/*192.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*194.22*/("""
                    """),_display_(/*195.22*/if(session().get("role").equals("director"))/*195.66*/ {_display_(Seq[Any](format.raw/*195.68*/("""
                        """),format.raw/*196.25*/("""<li>
                            <a href=""""),_display_(/*197.39*/routes/*197.45*/.PersonController.index()),format.raw/*197.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""
                    """),_display_(/*200.22*/if(session().get("role").equals("director"))/*200.66*/ {_display_(Seq[Any](format.raw/*200.68*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href=""""),_display_(/*202.39*/routes/*202.45*/.EmployeesController.index()),format.raw/*202.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*204.22*/("""

                    """),_display_(/*206.22*/if(session().get("role").equals("director"))/*206.66*/ {_display_(Seq[Any](format.raw/*206.68*/("""
                        """),format.raw/*207.25*/("""<li>
                            <a href=""""),_display_(/*208.39*/routes/*208.45*/.SubjectController.index()),format.raw/*208.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*210.22*/("""

                    """),_display_(/*212.22*/if(session().get("role").equals("director"))/*212.66*/ {_display_(Seq[Any](format.raw/*212.68*/("""
                        """),format.raw/*213.25*/("""<li>
                            <a href=""""),_display_(/*214.39*/routes/*214.45*/.FieldOfStudyController.index()),format.raw/*214.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*216.22*/("""
                    """),_display_(/*217.22*/if(session().get("role").equals("director"))/*217.66*/ {_display_(Seq[Any](format.raw/*217.68*/("""
                        """),format.raw/*218.25*/("""<li>
                            <a href=""""),_display_(/*219.39*/routes/*219.45*/.StudyGroupsController.index()),format.raw/*219.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*221.22*/("""
                    """),_display_(/*222.22*/if(session().get("role").equals("director"))/*222.66*/ {_display_(Seq[Any](format.raw/*222.68*/("""
                        """),format.raw/*223.25*/("""<li>
                            <a href=""""),_display_(/*224.39*/routes/*224.45*/.SemestersController.index()),format.raw/*224.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*226.22*/("""
                    """),_display_(/*227.22*/if(session().get("role").equals("director"))/*227.66*/ {_display_(Seq[Any](format.raw/*227.68*/("""
                        """),format.raw/*228.25*/("""<li>
                            <a href=""""),_display_(/*229.39*/routes/*229.45*/.StudyPlansController.index()),format.raw/*229.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*231.22*/("""
                    """),_display_(/*232.22*/if(session().get("role").equals("director"))/*232.66*/ {_display_(Seq[Any](format.raw/*232.68*/("""
                        """),format.raw/*233.25*/("""<li>
                            <a href=""""),_display_(/*234.39*/routes/*234.45*/.TeachersController.index()),format.raw/*234.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*236.22*/("""
                    """),_display_(/*237.22*/if(session().get("role").equals("director"))/*237.66*/ {_display_(Seq[Any](format.raw/*237.68*/("""
                        """),format.raw/*238.25*/("""<li>
                            <a href=""""),_display_(/*239.39*/routes/*239.45*/.CourseController.index()),format.raw/*239.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*241.22*/("""

                """),format.raw/*243.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*245.14*/("""
            """),format.raw/*246.13*/("""</li>
            <li>
            """),_display_(/*248.14*/if(session().get("role").equals("director"))/*248.58*/ {_display_(Seq[Any](format.raw/*248.60*/("""
                """),format.raw/*249.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*251.18*/if(session().get("role").equals("director"))/*251.62*/ {_display_(Seq[Any](format.raw/*251.64*/("""
                    """),format.raw/*252.21*/("""<li>
                        <a href=""""),_display_(/*253.35*/routes/*253.41*/.MethodicsController.index()),format.raw/*253.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*255.18*/("""
                """),format.raw/*256.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*258.14*/("""
            """),format.raw/*259.13*/("""</li>
            <li>
            """),_display_(/*261.14*/if(session().get("role").equals("director"))/*261.58*/ {_display_(Seq[Any](format.raw/*261.60*/("""
                """),format.raw/*262.17*/("""<a href='"""),_display_(/*262.27*/routes/*262.33*/.Application.forms),format.raw/*262.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*263.14*/("""
            """),format.raw/*264.13*/("""</li>
            <li>
            """),_display_(/*266.14*/if(session().get("role").equals("director"))/*266.58*/ {_display_(Seq[Any](format.raw/*266.60*/("""
                """),format.raw/*267.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*270.35*/routes/*270.41*/.UiElements.panelsAndWells),format.raw/*270.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*273.35*/routes/*273.41*/.UiElements.buttons),format.raw/*273.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*276.35*/routes/*276.41*/.UiElements.notifications),format.raw/*276.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*279.35*/routes/*279.41*/.UiElements.typography),format.raw/*279.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*282.35*/routes/*282.41*/.UiElements.icons),format.raw/*282.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*285.35*/routes/*285.41*/.UiElements.grid),format.raw/*285.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*289.14*/("""
            """),format.raw/*290.13*/("""</li>
            <li>
            """),_display_(/*292.14*/if(session().get("role").equals("director"))/*292.58*/ {_display_(Seq[Any](format.raw/*292.60*/("""
                """),format.raw/*293.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*322.14*/("""
            """),format.raw/*323.13*/("""</li>
            <li>
            """),_display_(/*325.14*/if(session().get("role").equals("director"))/*325.58*/ {_display_(Seq[Any](format.raw/*325.60*/("""
                """),format.raw/*326.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*331.35*/routes/*331.41*/.Charts.flot),format.raw/*331.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*334.35*/routes/*334.41*/.Charts.morris),format.raw/*334.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*338.14*/("""
            """),format.raw/*339.13*/("""</li>

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
                  DATE: Mon Apr 24 22:39:32 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 922640a4dd310a11e1a2d8139a4e56c0bc4319f5
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1805->749|1820->755|1890->804|2074->961|2127->1005|2167->1007|2212->1024|2398->1183|2451->1227|2491->1229|2544->1254|2614->1297|2629->1303|2679->1332|2844->1466|2893->1488|2946->1532|2986->1534|3039->1559|3109->1602|3124->1608|3178->1641|3347->1779|3396->1801|3449->1845|3489->1847|3542->1872|3612->1915|3627->1921|3686->1959|3857->2099|3906->2121|3959->2165|3999->2167|4052->2192|4122->2235|4137->2241|4189->2272|4350->2402|4399->2424|4452->2468|4492->2470|4545->2495|4615->2538|4630->2544|4683->2576|4849->2711|4898->2733|4951->2777|4991->2779|5044->2804|5114->2847|5129->2853|5181->2884|5345->3017|5394->3039|5447->3083|5487->3085|5540->3110|5610->3153|5625->3159|5680->3193|5851->3333|5900->3355|5953->3399|5993->3401|6046->3426|6116->3469|6131->3475|6184->3507|6347->3639|6396->3661|6449->3705|6489->3707|6542->3732|6612->3775|6627->3781|6679->3812|6842->3944|6891->3966|6944->4010|6984->4012|7037->4037|7107->4080|7122->4086|7179->4122|7339->4251|7388->4273|7441->4317|7481->4319|7534->4344|7604->4387|7619->4393|7670->4423|7798->4520|7847->4542|7900->4586|7940->4588|7993->4613|8063->4656|8078->4662|8138->4701|8311->4842|8361->4864|8415->4908|8456->4910|8510->4935|8581->4978|8597->4984|8677->5041|8866->5198|8916->5220|8970->5264|9011->5266|9065->5291|9136->5334|9152->5340|9201->5367|9328->5462|9378->5484|9432->5528|9473->5530|9527->5555|9598->5598|9614->5604|9669->5637|9799->5735|9845->5752|9944->5819|9986->5832|10050->5868|10104->5912|10145->5914|10191->5931|10386->6098|10440->6142|10481->6144|10535->6169|10606->6212|10622->6218|10656->6230|10756->6298|10806->6320|10860->6364|10901->6366|10955->6391|11026->6434|11042->6440|11082->6458|11175->6519|11225->6541|11279->6585|11320->6587|11374->6612|11445->6655|11461->6661|11501->6679|11599->6745|11649->6767|11703->6811|11744->6813|11798->6838|11869->6881|11885->6887|11929->6909|12023->6971|12073->6993|12127->7037|12168->7039|12222->7064|12293->7107|12309->7113|12369->7151|12484->7234|12534->7256|12588->7300|12629->7302|12683->7327|12754->7370|12770->7376|12817->7401|12925->7477|12975->7499|13029->7543|13070->7545|13124->7570|13195->7613|13211->7619|13259->7645|13368->7722|13418->7744|13472->7788|13513->7790|13567->7815|13638->7858|13654->7864|13704->7892|13811->7967|13861->7989|13915->8033|13956->8035|14010->8060|14081->8103|14097->8109|14150->8140|14260->8218|14310->8240|14364->8284|14405->8286|14459->8311|14530->8354|14546->8360|14606->8398|14727->8487|14777->8509|14831->8553|14872->8555|14926->8580|14997->8623|15013->8629|15085->8679|15189->8751|15239->8773|15293->8817|15334->8819|15388->8844|15459->8887|15475->8893|15526->8922|15642->9006|15692->9028|15746->9072|15787->9074|15841->9099|15912->9142|15928->9148|15980->9178|16085->9251|16135->9273|16189->9317|16230->9319|16284->9344|16355->9387|16371->9393|16413->9413|16507->9475|16557->9497|16611->9541|16652->9543|16706->9568|16777->9611|16793->9617|16840->9642|16946->9716|16996->9738|17050->9782|17091->9784|17145->9809|17216->9852|17232->9858|17282->9886|17394->9966|17445->9989|17499->10033|17540->10035|17594->10060|17665->10103|17681->10109|17729->10135|17838->10212|17889->10235|17943->10279|17984->10281|18038->10306|18109->10349|18125->10355|18178->10386|18284->10460|18334->10482|18388->10526|18429->10528|18483->10553|18554->10596|18570->10602|18622->10632|18730->10708|18780->10730|18834->10774|18875->10776|18929->10801|19000->10844|19016->10850|19066->10878|19175->10955|19225->10977|19279->11021|19320->11023|19374->11048|19445->11091|19461->11097|19512->11126|19629->11211|19679->11233|19733->11277|19774->11279|19828->11304|19899->11347|19915->11353|19964->11380|20072->11456|20122->11478|20176->11522|20217->11524|20271->11549|20342->11592|20358->11598|20405->11623|20511->11697|20558->11715|20657->11782|20699->11795|20763->11831|20817->11875|20858->11877|20904->11894|21090->12052|21144->12096|21185->12098|21235->12119|21302->12158|21318->12164|21368->12192|21465->12257|21511->12274|21610->12341|21652->12354|21716->12390|21770->12434|21811->12436|21857->12453|21895->12463|21911->12469|21951->12487|22045->12549|22087->12562|22151->12598|22205->12642|22246->12644|22292->12661|22519->12860|22535->12866|22583->12892|22719->13000|22735->13006|22776->13025|22903->13124|22919->13130|22966->13155|23099->13260|23115->13266|23159->13288|23289->13390|23305->13396|23344->13413|23470->13511|23486->13517|23524->13533|23676->13653|23718->13666|23782->13702|23836->13746|23877->13748|23923->13765|25233->15043|25275->15056|25339->15092|25393->15136|25434->15138|25480->15155|25747->15394|25763->15400|25797->15412|25928->15515|25944->15521|25980->15535|26144->15667|26186->15680
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|57->26|57->26|57->26|58->27|61->30|61->30|61->30|62->31|63->32|63->32|63->32|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|78->47|79->48|79->48|79->48|80->49|81->50|81->50|81->50|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|90->59|91->60|91->60|91->60|92->61|93->62|93->62|93->62|96->65|97->66|97->66|97->66|98->67|99->68|99->68|99->68|102->71|103->72|103->72|103->72|104->73|105->74|105->74|105->74|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|114->83|115->84|115->84|115->84|116->85|117->86|117->86|117->86|120->89|121->90|121->90|121->90|122->91|123->92|123->92|123->92|125->94|126->95|126->95|126->95|127->96|128->97|128->97|128->97|131->100|132->101|132->101|132->101|133->102|134->103|134->103|134->103|137->106|138->107|138->107|138->107|139->108|140->109|140->109|140->109|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|147->116|148->117|150->119|151->120|153->122|153->122|153->122|154->123|156->125|156->125|156->125|157->126|158->127|158->127|158->127|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|165->134|166->135|166->135|166->135|167->136|168->137|168->137|168->137|170->139|171->140|171->140|171->140|172->141|173->142|173->142|173->142|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|185->154|186->155|186->155|186->155|187->156|188->157|188->157|188->157|190->159|191->160|191->160|191->160|192->161|193->162|193->162|193->162|195->164|196->165|196->165|196->165|197->166|198->167|198->167|198->167|200->169|201->170|201->170|201->170|202->171|203->172|203->172|203->172|205->174|206->175|206->175|206->175|207->176|208->177|208->177|208->177|210->179|211->180|211->180|211->180|212->181|213->182|213->182|213->182|215->184|216->185|216->185|216->185|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|223->192|223->192|225->194|226->195|226->195|226->195|227->196|228->197|228->197|228->197|230->199|231->200|231->200|231->200|232->201|233->202|233->202|233->202|235->204|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|243->212|243->212|243->212|244->213|245->214|245->214|245->214|247->216|248->217|248->217|248->217|249->218|250->219|250->219|250->219|252->221|253->222|253->222|253->222|254->223|255->224|255->224|255->224|257->226|258->227|258->227|258->227|259->228|260->229|260->229|260->229|262->231|263->232|263->232|263->232|264->233|265->234|265->234|265->234|267->236|268->237|268->237|268->237|269->238|270->239|270->239|270->239|272->241|274->243|276->245|277->246|279->248|279->248|279->248|280->249|282->251|282->251|282->251|283->252|284->253|284->253|284->253|286->255|287->256|289->258|290->259|292->261|292->261|292->261|293->262|293->262|293->262|293->262|294->263|295->264|297->266|297->266|297->266|298->267|301->270|301->270|301->270|304->273|304->273|304->273|307->276|307->276|307->276|310->279|310->279|310->279|313->282|313->282|313->282|316->285|316->285|316->285|320->289|321->290|323->292|323->292|323->292|324->293|353->322|354->323|356->325|356->325|356->325|357->326|362->331|362->331|362->331|365->334|365->334|365->334|369->338|370->339
                  -- GENERATED --
              */
          