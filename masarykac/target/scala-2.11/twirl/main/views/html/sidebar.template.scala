
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
                            <a href=""""),_display_(/*156.39*/routes/*156.45*/.PublicationsController.index()),format.raw/*156.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*158.22*/("""
                    """),_display_(/*159.22*/if(session().get("role").equals("director"))/*159.66*/ {_display_(Seq[Any](format.raw/*159.68*/("""
                        """),format.raw/*160.25*/("""<li>
                            <a href=""""),_display_(/*161.39*/routes/*161.45*/.OrganizationalUnitsController.index()),format.raw/*161.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*163.22*/("""
                    """),_display_(/*164.22*/if(session().get("role").equals("director"))/*164.66*/ {_display_(Seq[Any](format.raw/*164.68*/("""
                        """),format.raw/*165.25*/("""<li>
                            <a href=""""),_display_(/*166.39*/routes/*166.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*166.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*168.22*/("""
                    """),_display_(/*169.22*/if(session().get("role").equals("director"))/*169.66*/ {_display_(Seq[Any](format.raw/*169.68*/("""
                        """),format.raw/*170.25*/("""<li>
                            <a href=""""),_display_(/*171.39*/routes/*171.45*/.FinalWorksController.index()),format.raw/*171.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*173.22*/("""
                    """),_display_(/*174.22*/if(session().get("role").equals("director"))/*174.66*/ {_display_(Seq[Any](format.raw/*174.68*/("""
                        """),format.raw/*175.25*/("""<li>
                            <a href=""""),_display_(/*176.39*/routes/*176.45*/.Application.kpiChoosePerson()),format.raw/*176.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*178.22*/("""
                    """),_display_(/*179.22*/if(session().get("role").equals("director"))/*179.66*/ {_display_(Seq[Any](format.raw/*179.68*/("""
                        """),format.raw/*180.25*/("""<li>
                            <a href=""""),_display_(/*181.39*/routes/*181.45*/.Application.roles()),format.raw/*181.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*183.22*/("""
                    """),_display_(/*184.22*/if(session().get("role").equals("director"))/*184.66*/ {_display_(Seq[Any](format.raw/*184.68*/("""
                        """),format.raw/*185.25*/("""<li>
                            <a href=""""),_display_(/*186.39*/routes/*186.45*/.PersonController.index()),format.raw/*186.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*188.22*/("""
                    """),_display_(/*189.22*/if(session().get("role").equals("director"))/*189.66*/ {_display_(Seq[Any](format.raw/*189.68*/("""
                        """),format.raw/*190.25*/("""<li>
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.EmployeesController.index()),format.raw/*191.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""

                    """),_display_(/*195.22*/if(session().get("role").equals("director"))/*195.66*/ {_display_(Seq[Any](format.raw/*195.68*/("""
                        """),format.raw/*196.25*/("""<li>
                            <a href=""""),_display_(/*197.39*/routes/*197.45*/.SubjectController.index()),format.raw/*197.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""

                    """),_display_(/*201.22*/if(session().get("role").equals("director"))/*201.66*/ {_display_(Seq[Any](format.raw/*201.68*/("""
                        """),format.raw/*202.25*/("""<li>
                            <a href=""""),_display_(/*203.39*/routes/*203.45*/.FieldOfStudyController.index()),format.raw/*203.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*205.22*/("""
                    """),_display_(/*206.22*/if(session().get("role").equals("director"))/*206.66*/ {_display_(Seq[Any](format.raw/*206.68*/("""
                        """),format.raw/*207.25*/("""<li>
                            <a href=""""),_display_(/*208.39*/routes/*208.45*/.StudyGroupsController.index()),format.raw/*208.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*210.22*/("""
                    """),_display_(/*211.22*/if(session().get("role").equals("director"))/*211.66*/ {_display_(Seq[Any](format.raw/*211.68*/("""
                        """),format.raw/*212.25*/("""<li>
                            <a href=""""),_display_(/*213.39*/routes/*213.45*/.SemestersController.index()),format.raw/*213.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*215.22*/("""
                    """),_display_(/*216.22*/if(session().get("role").equals("director"))/*216.66*/ {_display_(Seq[Any](format.raw/*216.68*/("""
                        """),format.raw/*217.25*/("""<li>
                            <a href=""""),_display_(/*218.39*/routes/*218.45*/.StudyPlansController.index()),format.raw/*218.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*220.22*/("""
                    """),_display_(/*221.22*/if(session().get("role").equals("director"))/*221.66*/ {_display_(Seq[Any](format.raw/*221.68*/("""
                        """),format.raw/*222.25*/("""<li>
                            <a href=""""),_display_(/*223.39*/routes/*223.45*/.TeachersController.index()),format.raw/*223.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*225.22*/("""
                    """),_display_(/*226.22*/if(session().get("role").equals("director"))/*226.66*/ {_display_(Seq[Any](format.raw/*226.68*/("""
                        """),format.raw/*227.25*/("""<li>
                            <a href=""""),_display_(/*228.39*/routes/*228.45*/.CourseController.index()),format.raw/*228.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*230.22*/("""

                """),format.raw/*232.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*234.14*/("""
            """),format.raw/*235.13*/("""</li>
            <li>
            """),_display_(/*237.14*/if(session().get("role").equals("director"))/*237.58*/ {_display_(Seq[Any](format.raw/*237.60*/("""
                """),format.raw/*238.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*240.18*/if(session().get("role").equals("director"))/*240.62*/ {_display_(Seq[Any](format.raw/*240.64*/("""
                    """),format.raw/*241.21*/("""<li>
                        <a href=""""),_display_(/*242.35*/routes/*242.41*/.MethodicsController.index()),format.raw/*242.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*244.18*/("""
                """),format.raw/*245.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*247.14*/("""
            """),format.raw/*248.13*/("""</li>
            <li>
            """),_display_(/*250.14*/if(session().get("role").equals("director"))/*250.58*/ {_display_(Seq[Any](format.raw/*250.60*/("""
                """),format.raw/*251.17*/("""<a href='"""),_display_(/*251.27*/routes/*251.33*/.Application.forms),format.raw/*251.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*252.14*/("""
            """),format.raw/*253.13*/("""</li>
            <li>
            """),_display_(/*255.14*/if(session().get("role").equals("director"))/*255.58*/ {_display_(Seq[Any](format.raw/*255.60*/("""
                """),format.raw/*256.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*259.35*/routes/*259.41*/.UiElements.panelsAndWells),format.raw/*259.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*262.35*/routes/*262.41*/.UiElements.buttons),format.raw/*262.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*265.35*/routes/*265.41*/.UiElements.notifications),format.raw/*265.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*268.35*/routes/*268.41*/.UiElements.typography),format.raw/*268.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*271.35*/routes/*271.41*/.UiElements.icons),format.raw/*271.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*274.35*/routes/*274.41*/.UiElements.grid),format.raw/*274.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*278.14*/("""
            """),format.raw/*279.13*/("""</li>
            <li>
            """),_display_(/*281.14*/if(session().get("role").equals("director"))/*281.58*/ {_display_(Seq[Any](format.raw/*281.60*/("""
                """),format.raw/*282.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*311.14*/("""
            """),format.raw/*312.13*/("""</li>
            <li>
            """),_display_(/*314.14*/if(session().get("role").equals("director"))/*314.58*/ {_display_(Seq[Any](format.raw/*314.60*/("""
                """),format.raw/*315.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*320.35*/routes/*320.41*/.Charts.flot),format.raw/*320.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*323.35*/routes/*323.41*/.Charts.morris),format.raw/*323.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*327.14*/("""
            """),format.raw/*328.13*/("""</li>

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
                  DATE: Sun Apr 23 10:57:12 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: d9b4bdd33f0f6a0b0d82c2dc03f29a790a35821b
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1804->748|1819->754|1889->803|2073->960|2126->1004|2166->1006|2211->1023|2397->1182|2450->1226|2490->1228|2543->1253|2613->1296|2628->1302|2678->1331|2843->1465|2892->1487|2945->1531|2985->1533|3038->1558|3108->1601|3123->1607|3177->1640|3346->1778|3395->1800|3448->1844|3488->1846|3541->1871|3611->1914|3626->1920|3685->1958|3856->2098|3905->2120|3958->2164|3998->2166|4051->2191|4121->2234|4136->2240|4188->2271|4349->2401|4398->2423|4451->2467|4491->2469|4544->2494|4614->2537|4629->2543|4682->2575|4848->2710|4897->2732|4950->2776|4990->2778|5043->2803|5113->2846|5128->2852|5180->2883|5344->3016|5393->3038|5446->3082|5486->3084|5539->3109|5609->3152|5624->3158|5679->3192|5850->3332|5899->3354|5952->3398|5992->3400|6045->3425|6115->3468|6130->3474|6183->3506|6346->3638|6395->3660|6448->3704|6488->3706|6541->3731|6611->3774|6626->3780|6678->3811|6841->3943|6890->3965|6943->4009|6983->4011|7036->4036|7106->4079|7121->4085|7178->4121|7338->4250|7387->4272|7440->4316|7480->4318|7533->4343|7603->4386|7618->4392|7669->4422|7797->4519|7846->4541|7899->4585|7939->4587|7992->4612|8062->4655|8077->4661|8137->4700|8309->4841|8359->4863|8413->4907|8454->4909|8508->4934|8579->4977|8595->4983|8675->5040|8864->5197|8914->5219|8968->5263|9009->5265|9063->5290|9134->5333|9150->5339|9199->5366|9326->5461|9372->5478|9471->5545|9513->5558|9577->5594|9631->5638|9672->5640|9718->5657|9913->5824|9967->5868|10008->5870|10062->5895|10133->5938|10149->5944|10183->5956|10283->6024|10333->6046|10387->6090|10428->6092|10482->6117|10553->6160|10569->6166|10609->6184|10702->6245|10752->6267|10806->6311|10847->6313|10901->6338|10972->6381|10988->6387|11028->6405|11126->6471|11176->6493|11230->6537|11271->6539|11325->6564|11396->6607|11412->6613|11456->6635|11550->6697|11600->6719|11654->6763|11695->6765|11749->6790|11820->6833|11836->6839|11896->6877|12011->6960|12061->6982|12115->7026|12156->7028|12210->7053|12281->7096|12297->7102|12344->7127|12452->7203|12502->7225|12556->7269|12597->7271|12651->7296|12722->7339|12738->7345|12786->7371|12895->7448|12945->7470|12999->7514|13040->7516|13094->7541|13165->7584|13181->7590|13234->7621|13344->7699|13394->7721|13448->7765|13489->7767|13543->7792|13614->7835|13630->7841|13690->7879|13811->7968|13861->7990|13915->8034|13956->8036|14010->8061|14081->8104|14097->8110|14169->8160|14273->8232|14323->8254|14377->8298|14418->8300|14472->8325|14543->8368|14559->8374|14610->8403|14726->8487|14776->8509|14830->8553|14871->8555|14925->8580|14996->8623|15012->8629|15064->8659|15169->8732|15219->8754|15273->8798|15314->8800|15368->8825|15439->8868|15455->8874|15497->8894|15591->8956|15641->8978|15695->9022|15736->9024|15790->9049|15861->9092|15877->9098|15924->9123|16030->9197|16080->9219|16134->9263|16175->9265|16229->9290|16300->9333|16316->9339|16366->9367|16478->9447|16529->9470|16583->9514|16624->9516|16678->9541|16749->9584|16765->9590|16813->9616|16922->9693|16973->9716|17027->9760|17068->9762|17122->9787|17193->9830|17209->9836|17262->9867|17368->9941|17418->9963|17472->10007|17513->10009|17567->10034|17638->10077|17654->10083|17706->10113|17814->10189|17864->10211|17918->10255|17959->10257|18013->10282|18084->10325|18100->10331|18150->10359|18259->10436|18309->10458|18363->10502|18404->10504|18458->10529|18529->10572|18545->10578|18596->10607|18713->10692|18763->10714|18817->10758|18858->10760|18912->10785|18983->10828|18999->10834|19048->10861|19156->10937|19206->10959|19260->11003|19301->11005|19355->11030|19426->11073|19442->11079|19489->11104|19595->11178|19642->11196|19741->11263|19783->11276|19847->11312|19901->11356|19942->11358|19988->11375|20174->11533|20228->11577|20269->11579|20319->11600|20386->11639|20402->11645|20452->11673|20549->11738|20595->11755|20694->11822|20736->11835|20800->11871|20854->11915|20895->11917|20941->11934|20979->11944|20995->11950|21035->11968|21129->12030|21171->12043|21235->12079|21289->12123|21330->12125|21376->12142|21603->12341|21619->12347|21667->12373|21803->12481|21819->12487|21860->12506|21987->12605|22003->12611|22050->12636|22183->12741|22199->12747|22243->12769|22373->12871|22389->12877|22428->12894|22554->12992|22570->12998|22608->13014|22760->13134|22802->13147|22866->13183|22920->13227|22961->13229|23007->13246|24317->14524|24359->14537|24423->14573|24477->14617|24518->14619|24564->14636|24831->14875|24847->14881|24881->14893|25012->14996|25028->15002|25064->15016|25228->15148|25270->15161
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|56->25|56->25|56->25|57->26|60->29|60->29|60->29|61->30|62->31|62->31|62->31|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|71->40|72->41|72->41|72->41|73->42|74->43|74->43|74->43|77->46|78->47|78->47|78->47|79->48|80->49|80->49|80->49|83->52|84->53|84->53|84->53|85->54|86->55|86->55|86->55|89->58|90->59|90->59|90->59|91->60|92->61|92->61|92->61|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|101->70|102->71|102->71|102->71|103->72|104->73|104->73|104->73|107->76|108->77|108->77|108->77|109->78|110->79|110->79|110->79|113->82|114->83|114->83|114->83|115->84|116->85|116->85|116->85|119->88|120->89|120->89|120->89|121->90|122->91|122->91|122->91|124->93|125->94|125->94|125->94|126->95|127->96|127->96|127->96|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|141->110|142->111|144->113|145->114|147->116|147->116|147->116|148->117|150->119|150->119|150->119|151->120|152->121|152->121|152->121|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|159->128|160->129|160->129|160->129|161->130|162->131|162->131|162->131|164->133|165->134|165->134|165->134|166->135|167->136|167->136|167->136|169->138|170->139|170->139|170->139|171->140|172->141|172->141|172->141|174->143|175->144|175->144|175->144|176->145|177->146|177->146|177->146|179->148|180->149|180->149|180->149|181->150|182->151|182->151|182->151|184->153|185->154|185->154|185->154|186->155|187->156|187->156|187->156|189->158|190->159|190->159|190->159|191->160|192->161|192->161|192->161|194->163|195->164|195->164|195->164|196->165|197->166|197->166|197->166|199->168|200->169|200->169|200->169|201->170|202->171|202->171|202->171|204->173|205->174|205->174|205->174|206->175|207->176|207->176|207->176|209->178|210->179|210->179|210->179|211->180|212->181|212->181|212->181|214->183|215->184|215->184|215->184|216->185|217->186|217->186|217->186|219->188|220->189|220->189|220->189|221->190|222->191|222->191|222->191|224->193|226->195|226->195|226->195|227->196|228->197|228->197|228->197|230->199|232->201|232->201|232->201|233->202|234->203|234->203|234->203|236->205|237->206|237->206|237->206|238->207|239->208|239->208|239->208|241->210|242->211|242->211|242->211|243->212|244->213|244->213|244->213|246->215|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|252->221|252->221|252->221|253->222|254->223|254->223|254->223|256->225|257->226|257->226|257->226|258->227|259->228|259->228|259->228|261->230|263->232|265->234|266->235|268->237|268->237|268->237|269->238|271->240|271->240|271->240|272->241|273->242|273->242|273->242|275->244|276->245|278->247|279->248|281->250|281->250|281->250|282->251|282->251|282->251|282->251|283->252|284->253|286->255|286->255|286->255|287->256|290->259|290->259|290->259|293->262|293->262|293->262|296->265|296->265|296->265|299->268|299->268|299->268|302->271|302->271|302->271|305->274|305->274|305->274|309->278|310->279|312->281|312->281|312->281|313->282|342->311|343->312|345->314|345->314|345->314|346->315|351->320|351->320|351->320|354->323|354->323|354->323|358->327|359->328
                  -- GENERATED --
              */
          