
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
                    """),_display_(/*117.22*/if(session().get("role").equals("director"))/*117.66*/ {_display_(Seq[Any](format.raw/*117.68*/("""
                        """),format.raw/*118.25*/("""<li>
                            <a href='"""),_display_(/*119.39*/routes/*119.45*/.TableController.listPublications()),format.raw/*119.80*/("""'><i class="fa fa-table fa-fw"></i> Publikace</a>
                        </li>
                    """)))}),format.raw/*121.22*/("""
                    """),_display_(/*122.22*/if(session().get("role").equals("director"))/*122.66*/ {_display_(Seq[Any](format.raw/*122.68*/("""
                        """),format.raw/*123.25*/("""<li>
                            <a href='"""),_display_(/*124.39*/routes/*124.45*/.TableController.listTeachersInWeeks()),format.raw/*124.83*/("""'><i class="fa fa-table fa-fw"></i> Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*126.22*/("""
                """),format.raw/*127.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*129.14*/("""
            """),format.raw/*130.13*/("""</li>
            <li>
            """),_display_(/*132.14*/if(session().get("role").equals("director"))/*132.58*/ {_display_(Seq[Any](format.raw/*132.60*/("""
                """),format.raw/*133.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*135.22*/if(session().get("role").equals("director"))/*135.66*/ {_display_(Seq[Any](format.raw/*135.68*/("""
                        """),format.raw/*136.25*/("""<li>
                            <a href=""""),_display_(/*137.39*/routes/*137.45*/.Pages.blank),format.raw/*137.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*139.22*/("""
                    """),_display_(/*140.22*/if(session().get("role").equals("director"))/*140.66*/ {_display_(Seq[Any](format.raw/*140.68*/("""
                        """),format.raw/*141.25*/("""<li>
                            <a href=""""),_display_(/*142.39*/routes/*142.45*/.Application.pdf()),format.raw/*142.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*144.22*/("""
                    """),_display_(/*145.22*/if(session().get("role").equals("director"))/*145.66*/ {_display_(Seq[Any](format.raw/*145.68*/("""
                        """),format.raw/*146.25*/("""<li>
                            <a href=""""),_display_(/*147.39*/routes/*147.45*/.Application.raw()),format.raw/*147.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                    """),_display_(/*150.22*/if(session().get("role").equals("director"))/*150.66*/ {_display_(Seq[Any](format.raw/*150.68*/("""
                        """),format.raw/*151.25*/("""<li>
                            <a href=""""),_display_(/*152.39*/routes/*152.45*/.TestController.test()),format.raw/*152.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*154.22*/("""
                    """),_display_(/*155.22*/if(session().get("role").equals("director"))/*155.66*/ {_display_(Seq[Any](format.raw/*155.68*/("""
                        """),format.raw/*156.25*/("""<li>
                            <a href=""""),_display_(/*157.39*/routes/*157.45*/.SubjectPlanTeachingController.index()),format.raw/*157.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*159.22*/("""
                    """),_display_(/*160.22*/if(session().get("role").equals("director"))/*160.66*/ {_display_(Seq[Any](format.raw/*160.68*/("""
                        """),format.raw/*161.25*/("""<li>
                            <a href=""""),_display_(/*162.39*/routes/*162.45*/.VisitsController.index()),format.raw/*162.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*164.22*/("""
                    """),_display_(/*165.22*/if(session().get("role").equals("director"))/*165.66*/ {_display_(Seq[Any](format.raw/*165.68*/("""
                        """),format.raw/*166.25*/("""<li>
                            <a href=""""),_display_(/*167.39*/routes/*167.45*/.ProjectController.index()),format.raw/*167.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/if(session().get("role").equals("director"))/*170.66*/ {_display_(Seq[Any](format.raw/*170.68*/("""
                        """),format.raw/*171.25*/("""<li>
                            <a href=""""),_display_(/*172.39*/routes/*172.45*/.CommitteeController.index()),format.raw/*172.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*174.22*/("""
                    """),_display_(/*175.22*/if(session().get("role").equals("director"))/*175.66*/ {_display_(Seq[Any](format.raw/*175.68*/("""
                        """),format.raw/*176.25*/("""<li>
                            <a href=""""),_display_(/*177.39*/routes/*177.45*/.PublicationsController.index()),format.raw/*177.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*179.22*/("""
                    """),_display_(/*180.22*/if(session().get("role").equals("director"))/*180.66*/ {_display_(Seq[Any](format.raw/*180.68*/("""
                        """),format.raw/*181.25*/("""<li>
                            <a href=""""),_display_(/*182.39*/routes/*182.45*/.OrganizationalUnitsController.index()),format.raw/*182.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*184.22*/("""
                    """),_display_(/*185.22*/if(session().get("role").equals("director"))/*185.66*/ {_display_(Seq[Any](format.raw/*185.68*/("""
                        """),format.raw/*186.25*/("""<li>
                            <a href=""""),_display_(/*187.39*/routes/*187.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*187.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*189.22*/("""
                    """),_display_(/*190.22*/if(session().get("role").equals("director"))/*190.66*/ {_display_(Seq[Any](format.raw/*190.68*/("""
                        """),format.raw/*191.25*/("""<li>
                            <a href=""""),_display_(/*192.39*/routes/*192.45*/.FinalWorksController.index()),format.raw/*192.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*194.22*/("""
                    """),_display_(/*195.22*/if(session().get("role").equals("director"))/*195.66*/ {_display_(Seq[Any](format.raw/*195.68*/("""
                        """),format.raw/*196.25*/("""<li>
                            <a href=""""),_display_(/*197.39*/routes/*197.45*/.Application.kpiChoosePerson()),format.raw/*197.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""
                    """),_display_(/*200.22*/if(session().get("role").equals("director"))/*200.66*/ {_display_(Seq[Any](format.raw/*200.68*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href=""""),_display_(/*202.39*/routes/*202.45*/.Application.roles()),format.raw/*202.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*204.22*/("""
                    """),_display_(/*205.22*/if(session().get("role").equals("director"))/*205.66*/ {_display_(Seq[Any](format.raw/*205.68*/("""
                        """),format.raw/*206.25*/("""<li>
                            <a href=""""),_display_(/*207.39*/routes/*207.45*/.PersonController.index()),format.raw/*207.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*209.22*/("""
                    """),_display_(/*210.22*/if(session().get("role").equals("director"))/*210.66*/ {_display_(Seq[Any](format.raw/*210.68*/("""
                        """),format.raw/*211.25*/("""<li>
                            <a href=""""),_display_(/*212.39*/routes/*212.45*/.EmployeesController.index()),format.raw/*212.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*214.22*/("""

                    """),_display_(/*216.22*/if(session().get("role").equals("director"))/*216.66*/ {_display_(Seq[Any](format.raw/*216.68*/("""
                        """),format.raw/*217.25*/("""<li>
                            <a href=""""),_display_(/*218.39*/routes/*218.45*/.SubjectController.index()),format.raw/*218.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*220.22*/("""

                    """),_display_(/*222.22*/if(session().get("role").equals("director"))/*222.66*/ {_display_(Seq[Any](format.raw/*222.68*/("""
                        """),format.raw/*223.25*/("""<li>
                            <a href=""""),_display_(/*224.39*/routes/*224.45*/.FieldOfStudyController.index()),format.raw/*224.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*226.22*/("""
                    """),_display_(/*227.22*/if(session().get("role").equals("director"))/*227.66*/ {_display_(Seq[Any](format.raw/*227.68*/("""
                        """),format.raw/*228.25*/("""<li>
                            <a href=""""),_display_(/*229.39*/routes/*229.45*/.StudyGroupsController.index()),format.raw/*229.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*231.22*/("""
                    """),_display_(/*232.22*/if(session().get("role").equals("director"))/*232.66*/ {_display_(Seq[Any](format.raw/*232.68*/("""
                        """),format.raw/*233.25*/("""<li>
                            <a href=""""),_display_(/*234.39*/routes/*234.45*/.SemestersController.index()),format.raw/*234.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*236.22*/("""
                    """),_display_(/*237.22*/if(session().get("role").equals("director"))/*237.66*/ {_display_(Seq[Any](format.raw/*237.68*/("""
                        """),format.raw/*238.25*/("""<li>
                            <a href=""""),_display_(/*239.39*/routes/*239.45*/.StudyPlansController.index()),format.raw/*239.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*241.22*/("""
                    """),_display_(/*242.22*/if(session().get("role").equals("director"))/*242.66*/ {_display_(Seq[Any](format.raw/*242.68*/("""
                        """),format.raw/*243.25*/("""<li>
                            <a href=""""),_display_(/*244.39*/routes/*244.45*/.TeachersController.index()),format.raw/*244.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*246.22*/("""
                    """),_display_(/*247.22*/if(session().get("role").equals("director"))/*247.66*/ {_display_(Seq[Any](format.raw/*247.68*/("""
                        """),format.raw/*248.25*/("""<li>
                            <a href=""""),_display_(/*249.39*/routes/*249.45*/.CourseController.index()),format.raw/*249.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*251.22*/("""

                """),format.raw/*253.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*255.14*/("""
            """),format.raw/*256.13*/("""</li>
            <li>
            """),_display_(/*258.14*/if(session().get("role").equals("director"))/*258.58*/ {_display_(Seq[Any](format.raw/*258.60*/("""
                """),format.raw/*259.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*261.18*/if(session().get("role").equals("director"))/*261.62*/ {_display_(Seq[Any](format.raw/*261.64*/("""
                    """),format.raw/*262.21*/("""<li>
                        <a href=""""),_display_(/*263.35*/routes/*263.41*/.MethodicsController.index()),format.raw/*263.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*265.18*/("""
                """),format.raw/*266.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*268.14*/("""
            """),format.raw/*269.13*/("""</li>
            <li>
            """),_display_(/*271.14*/if(session().get("role").equals("director"))/*271.58*/ {_display_(Seq[Any](format.raw/*271.60*/("""
                """),format.raw/*272.17*/("""<a href='"""),_display_(/*272.27*/routes/*272.33*/.Application.forms),format.raw/*272.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*273.14*/("""
            """),format.raw/*274.13*/("""</li>
            <li>
            """),_display_(/*276.14*/if(session().get("role").equals("director"))/*276.58*/ {_display_(Seq[Any](format.raw/*276.60*/("""
                """),format.raw/*277.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*280.35*/routes/*280.41*/.UiElements.panelsAndWells),format.raw/*280.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*283.35*/routes/*283.41*/.UiElements.buttons),format.raw/*283.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*286.35*/routes/*286.41*/.UiElements.notifications),format.raw/*286.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*289.35*/routes/*289.41*/.UiElements.typography),format.raw/*289.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*292.35*/routes/*292.41*/.UiElements.icons),format.raw/*292.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*295.35*/routes/*295.41*/.UiElements.grid),format.raw/*295.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*299.14*/("""
            """),format.raw/*300.13*/("""</li>
            <li>
            """),_display_(/*302.14*/if(session().get("role").equals("director"))/*302.58*/ {_display_(Seq[Any](format.raw/*302.60*/("""
                """),format.raw/*303.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*332.14*/("""
            """),format.raw/*333.13*/("""</li>
            <li>
            """),_display_(/*335.14*/if(session().get("role").equals("director"))/*335.58*/ {_display_(Seq[Any](format.raw/*335.60*/("""
                """),format.raw/*336.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*341.35*/routes/*341.41*/.Charts.flot),format.raw/*341.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*344.35*/routes/*344.41*/.Charts.morris),format.raw/*344.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*348.14*/("""
            """),format.raw/*349.13*/("""</li>

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
                  DATE: Wed Apr 26 18:36:12 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 6388723ed710f270630eccb597cbbe955a84c20a
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|1805->749|1820->755|1890->804|2074->961|2127->1005|2167->1007|2212->1024|2398->1183|2451->1227|2491->1229|2544->1254|2614->1297|2629->1303|2679->1332|2844->1466|2893->1488|2946->1532|2986->1534|3039->1559|3109->1602|3124->1608|3178->1641|3347->1779|3396->1801|3449->1845|3489->1847|3542->1872|3612->1915|3627->1921|3686->1959|3857->2099|3906->2121|3959->2165|3999->2167|4052->2192|4122->2235|4137->2241|4189->2272|4350->2402|4399->2424|4452->2468|4492->2470|4545->2495|4615->2538|4630->2544|4683->2576|4849->2711|4898->2733|4951->2777|4991->2779|5044->2804|5114->2847|5129->2853|5181->2884|5345->3017|5394->3039|5447->3083|5487->3085|5540->3110|5610->3153|5625->3159|5680->3193|5851->3333|5900->3355|5953->3399|5993->3401|6046->3426|6116->3469|6131->3475|6184->3507|6347->3639|6396->3661|6449->3705|6489->3707|6542->3732|6612->3775|6627->3781|6679->3812|6842->3944|6891->3966|6944->4010|6984->4012|7037->4037|7107->4080|7122->4086|7179->4122|7339->4251|7388->4273|7441->4317|7481->4319|7534->4344|7604->4387|7619->4393|7670->4423|7798->4520|7847->4542|7900->4586|7940->4588|7993->4613|8063->4656|8078->4662|8138->4701|8311->4842|8361->4864|8415->4908|8456->4910|8510->4935|8581->4978|8597->4984|8677->5041|8866->5198|8916->5220|8970->5264|9011->5266|9065->5291|9136->5334|9152->5340|9201->5367|9328->5462|9378->5484|9432->5528|9473->5530|9527->5555|9598->5598|9614->5604|9669->5637|9799->5735|9849->5757|9903->5801|9944->5803|9998->5828|10069->5871|10085->5877|10142->5912|10275->6013|10325->6035|10379->6079|10420->6081|10474->6106|10545->6149|10561->6155|10621->6193|10762->6302|10808->6319|10907->6386|10949->6399|11013->6435|11067->6479|11108->6481|11154->6498|11349->6665|11403->6709|11444->6711|11498->6736|11569->6779|11585->6785|11619->6797|11719->6865|11769->6887|11823->6931|11864->6933|11918->6958|11989->7001|12005->7007|12045->7025|12138->7086|12188->7108|12242->7152|12283->7154|12337->7179|12408->7222|12424->7228|12464->7246|12562->7312|12612->7334|12666->7378|12707->7380|12761->7405|12832->7448|12848->7454|12892->7476|12986->7538|13036->7560|13090->7604|13131->7606|13185->7631|13256->7674|13272->7680|13332->7718|13447->7801|13497->7823|13551->7867|13592->7869|13646->7894|13717->7937|13733->7943|13780->7968|13888->8044|13938->8066|13992->8110|14033->8112|14087->8137|14158->8180|14174->8186|14222->8212|14331->8289|14381->8311|14435->8355|14476->8357|14530->8382|14601->8425|14617->8431|14667->8459|14774->8534|14824->8556|14878->8600|14919->8602|14973->8627|15044->8670|15060->8676|15113->8707|15223->8785|15273->8807|15327->8851|15368->8853|15422->8878|15493->8921|15509->8927|15569->8965|15690->9054|15740->9076|15794->9120|15835->9122|15889->9147|15960->9190|15976->9196|16048->9246|16152->9318|16202->9340|16256->9384|16297->9386|16351->9411|16422->9454|16438->9460|16489->9489|16605->9573|16655->9595|16709->9639|16750->9641|16804->9666|16875->9709|16891->9715|16943->9745|17048->9818|17098->9840|17152->9884|17193->9886|17247->9911|17318->9954|17334->9960|17376->9980|17470->10042|17520->10064|17574->10108|17615->10110|17669->10135|17740->10178|17756->10184|17803->10209|17909->10283|17959->10305|18013->10349|18054->10351|18108->10376|18179->10419|18195->10425|18245->10453|18357->10533|18408->10556|18462->10600|18503->10602|18557->10627|18628->10670|18644->10676|18692->10702|18801->10779|18852->10802|18906->10846|18947->10848|19001->10873|19072->10916|19088->10922|19141->10953|19247->11027|19297->11049|19351->11093|19392->11095|19446->11120|19517->11163|19533->11169|19585->11199|19693->11275|19743->11297|19797->11341|19838->11343|19892->11368|19963->11411|19979->11417|20029->11445|20138->11522|20188->11544|20242->11588|20283->11590|20337->11615|20408->11658|20424->11664|20475->11693|20592->11778|20642->11800|20696->11844|20737->11846|20791->11871|20862->11914|20878->11920|20927->11947|21035->12023|21085->12045|21139->12089|21180->12091|21234->12116|21305->12159|21321->12165|21368->12190|21474->12264|21521->12282|21620->12349|21662->12362|21726->12398|21780->12442|21821->12444|21867->12461|22053->12619|22107->12663|22148->12665|22198->12686|22265->12725|22281->12731|22331->12759|22428->12824|22474->12841|22573->12908|22615->12921|22679->12957|22733->13001|22774->13003|22820->13020|22858->13030|22874->13036|22914->13054|23008->13116|23050->13129|23114->13165|23168->13209|23209->13211|23255->13228|23482->13427|23498->13433|23546->13459|23682->13567|23698->13573|23739->13592|23866->13691|23882->13697|23929->13722|24062->13827|24078->13833|24122->13855|24252->13957|24268->13963|24307->13980|24433->14078|24449->14084|24487->14100|24639->14220|24681->14233|24745->14269|24799->14313|24840->14315|24886->14332|26196->15610|26238->15623|26302->15659|26356->15703|26397->15705|26443->15722|26710->15961|26726->15967|26760->15979|26891->16082|26907->16088|26943->16102|27107->16234|27149->16247
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|57->26|57->26|57->26|58->27|61->30|61->30|61->30|62->31|63->32|63->32|63->32|66->35|67->36|67->36|67->36|68->37|69->38|69->38|69->38|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|78->47|79->48|79->48|79->48|80->49|81->50|81->50|81->50|84->53|85->54|85->54|85->54|86->55|87->56|87->56|87->56|90->59|91->60|91->60|91->60|92->61|93->62|93->62|93->62|96->65|97->66|97->66|97->66|98->67|99->68|99->68|99->68|102->71|103->72|103->72|103->72|104->73|105->74|105->74|105->74|108->77|109->78|109->78|109->78|110->79|111->80|111->80|111->80|114->83|115->84|115->84|115->84|116->85|117->86|117->86|117->86|120->89|121->90|121->90|121->90|122->91|123->92|123->92|123->92|125->94|126->95|126->95|126->95|127->96|128->97|128->97|128->97|131->100|132->101|132->101|132->101|133->102|134->103|134->103|134->103|137->106|138->107|138->107|138->107|139->108|140->109|140->109|140->109|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|147->116|148->117|148->117|148->117|149->118|150->119|150->119|150->119|152->121|153->122|153->122|153->122|154->123|155->124|155->124|155->124|157->126|158->127|160->129|161->130|163->132|163->132|163->132|164->133|166->135|166->135|166->135|167->136|168->137|168->137|168->137|170->139|171->140|171->140|171->140|172->141|173->142|173->142|173->142|175->144|176->145|176->145|176->145|177->146|178->147|178->147|178->147|180->149|181->150|181->150|181->150|182->151|183->152|183->152|183->152|185->154|186->155|186->155|186->155|187->156|188->157|188->157|188->157|190->159|191->160|191->160|191->160|192->161|193->162|193->162|193->162|195->164|196->165|196->165|196->165|197->166|198->167|198->167|198->167|200->169|201->170|201->170|201->170|202->171|203->172|203->172|203->172|205->174|206->175|206->175|206->175|207->176|208->177|208->177|208->177|210->179|211->180|211->180|211->180|212->181|213->182|213->182|213->182|215->184|216->185|216->185|216->185|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|223->192|223->192|225->194|226->195|226->195|226->195|227->196|228->197|228->197|228->197|230->199|231->200|231->200|231->200|232->201|233->202|233->202|233->202|235->204|236->205|236->205|236->205|237->206|238->207|238->207|238->207|240->209|241->210|241->210|241->210|242->211|243->212|243->212|243->212|245->214|247->216|247->216|247->216|248->217|249->218|249->218|249->218|251->220|253->222|253->222|253->222|254->223|255->224|255->224|255->224|257->226|258->227|258->227|258->227|259->228|260->229|260->229|260->229|262->231|263->232|263->232|263->232|264->233|265->234|265->234|265->234|267->236|268->237|268->237|268->237|269->238|270->239|270->239|270->239|272->241|273->242|273->242|273->242|274->243|275->244|275->244|275->244|277->246|278->247|278->247|278->247|279->248|280->249|280->249|280->249|282->251|284->253|286->255|287->256|289->258|289->258|289->258|290->259|292->261|292->261|292->261|293->262|294->263|294->263|294->263|296->265|297->266|299->268|300->269|302->271|302->271|302->271|303->272|303->272|303->272|303->272|304->273|305->274|307->276|307->276|307->276|308->277|311->280|311->280|311->280|314->283|314->283|314->283|317->286|317->286|317->286|320->289|320->289|320->289|323->292|323->292|323->292|326->295|326->295|326->295|330->299|331->300|333->302|333->302|333->302|334->303|363->332|364->333|366->335|366->335|366->335|367->336|372->341|372->341|372->341|375->344|375->344|375->344|379->348|380->349
                  -- GENERATED --
              */
          