
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
                        <a href=""""),_display_(/*20.35*/routes/*20.41*/.StatisticController.index()),format.raw/*20.69*/("""">Zobrazit DCPS</a>

                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.EmployeesController.info(session().get("email"))),format.raw/*22.90*/("""">Info</a>
                        <a href=""""),_display_(/*23.35*/routes/*23.41*/.StatisticController.listEmployeerActvitiy(session().get("email"))),format.raw/*23.107*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*25.35*/routes/*25.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("email"))),format.raw/*25.124*/("""'>
                            Má výuka</a>

                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*34.14*/if(session().get("role").equals("director"))/*34.58*/ {_display_(Seq[Any](format.raw/*34.60*/("""
                """),format.raw/*35.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*37.22*/if(session().get("role").equals("director"))/*37.66*/ {_display_(Seq[Any](format.raw/*37.68*/("""
                        """),format.raw/*38.25*/("""<li>
                            <a href='"""),_display_(/*39.39*/routes/*39.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*39.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*42.22*/("""

                    """),_display_(/*44.22*/if(session().get("role").equals("director"))/*44.66*/ {_display_(Seq[Any](format.raw/*44.68*/("""
                        """),format.raw/*45.25*/("""<li>
                            <a href='"""),_display_(/*46.39*/routes/*46.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*46.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*49.22*/("""
                    """),_display_(/*50.22*/if(session().get("role").equals("director"))/*50.66*/ {_display_(Seq[Any](format.raw/*50.68*/("""
                        """),format.raw/*51.25*/("""<li>
                            <a href='"""),_display_(/*52.39*/routes/*52.45*/.TableController.listPerson()),format.raw/*52.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*55.22*/("""
                    """),_display_(/*56.22*/if(session().get("role").equals("director"))/*56.66*/ {_display_(Seq[Any](format.raw/*56.68*/("""
                        """),format.raw/*57.25*/("""<li>
                            <a href='"""),_display_(/*58.39*/routes/*58.45*/.TableController.listStudyPlans()),format.raw/*58.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*61.22*/("""
                    """),_display_(/*62.22*/if(session().get("role").equals("director"))/*62.66*/ {_display_(Seq[Any](format.raw/*62.68*/("""
                        """),format.raw/*63.25*/("""<li>
                            <a href='"""),_display_(/*64.39*/routes/*64.45*/.TableController.listScheduleInWeeks()),format.raw/*64.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*67.22*/("""
                    """),_display_(/*68.22*/if(session().get("role").equals("director"))/*68.66*/ {_display_(Seq[Any](format.raw/*68.68*/("""
                        """),format.raw/*69.25*/("""<li>
                            <a href='"""),_display_(/*70.39*/routes/*70.45*/.TableController.listSchedule()),format.raw/*70.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*73.22*/("""
                    """),_display_(/*74.22*/if(session().get("role").equals("director"))/*74.66*/ {_display_(Seq[Any](format.raw/*74.68*/("""
                        """),format.raw/*75.25*/("""<li>
                            <a href='"""),_display_(/*76.39*/routes/*76.45*/.TableController.listEmployees()),format.raw/*76.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*79.22*/("""
                    """),_display_(/*80.22*/if(session().get("role").equals("director"))/*80.66*/ {_display_(Seq[Any](format.raw/*80.68*/("""
                        """),format.raw/*81.25*/("""<li>
                            <a href='"""),_display_(/*82.39*/routes/*82.45*/.TableController.listTeachers()),format.raw/*82.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*85.22*/("""
                    """),_display_(/*86.22*/if(session().get("role").equals("director"))/*86.66*/ {_display_(Seq[Any](format.raw/*86.68*/("""
                        """),format.raw/*87.25*/("""<li>
                            <a href='"""),_display_(/*88.39*/routes/*88.45*/.TableController.listStudyGroups()),format.raw/*88.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*91.22*/("""
                    """),_display_(/*92.22*/if(session().get("role").equals("director"))/*92.66*/ {_display_(Seq[Any](format.raw/*92.68*/("""
                        """),format.raw/*93.25*/("""<li>
                            <a href='"""),_display_(/*94.39*/routes/*94.45*/.TableController.listSemesters()),format.raw/*94.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*97.22*/("""
                    """),_display_(/*98.22*/if(session().get("role").equals("director"))/*98.66*/ {_display_(Seq[Any](format.raw/*98.68*/("""
                        """),format.raw/*99.25*/("""<li>
                            <a href='"""),_display_(/*100.39*/routes/*100.45*/.TableController.listSubjects()),format.raw/*100.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*103.22*/("""
                    """),_display_(/*104.22*/if(session().get("role").equals("director"))/*104.66*/ {_display_(Seq[Any](format.raw/*104.68*/("""
                        """),format.raw/*105.25*/("""<li>
                            <a href='"""),_display_(/*106.39*/routes/*106.45*/.TableController.listFieldsOfStudy()),format.raw/*106.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*109.22*/("""
                    """),_display_(/*110.22*/if(session().get("role").equals("director"))/*110.66*/ {_display_(Seq[Any](format.raw/*110.68*/("""
                        """),format.raw/*111.25*/("""<li>
                            <a href='"""),_display_(/*112.39*/routes/*112.45*/.TableController.listCourses()),format.raw/*112.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*114.22*/("""
                    """),_display_(/*115.22*/if(session().get("role").equals("director"))/*115.66*/ {_display_(Seq[Any](format.raw/*115.68*/("""
                        """),format.raw/*116.25*/("""<li>
                            <a href='"""),_display_(/*117.39*/routes/*117.45*/.TableController.listCurrentSemesters()),format.raw/*117.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*120.22*/("""
                    """),_display_(/*121.22*/if(session().get("role").equals("director"))/*121.66*/ {_display_(Seq[Any](format.raw/*121.68*/("""
                        """),format.raw/*122.25*/("""<li>
                            <a href='"""),_display_(/*123.39*/routes/*123.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*123.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*126.22*/("""
                    """),_display_(/*127.22*/if(session().get("role").equals("director"))/*127.66*/ {_display_(Seq[Any](format.raw/*127.68*/("""
                        """),format.raw/*128.25*/("""<li>
                            <a href='"""),_display_(/*129.39*/routes/*129.45*/.TableController.listDays()),format.raw/*129.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*131.22*/("""
                    """),_display_(/*132.22*/if(session().get("role").equals("director"))/*132.66*/ {_display_(Seq[Any](format.raw/*132.68*/("""
                        """),format.raw/*133.25*/("""<li>
                            <a href='"""),_display_(/*134.39*/routes/*134.45*/.TableController.listCommittees()),format.raw/*134.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*137.22*/("""
                    """),_display_(/*138.22*/if(session().get("role").equals("director"))/*138.66*/ {_display_(Seq[Any](format.raw/*138.68*/("""
                        """),format.raw/*139.25*/("""<li>
                            <a href='"""),_display_(/*140.39*/routes/*140.45*/.TableController.listPublications()),format.raw/*140.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*143.22*/("""
                    """),_display_(/*144.22*/if(session().get("role").equals("director"))/*144.66*/ {_display_(Seq[Any](format.raw/*144.68*/("""
                        """),format.raw/*145.25*/("""<li>
                            <a href='"""),_display_(/*146.39*/routes/*146.45*/.TableController.listTeachersInWeeks()),format.raw/*146.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*149.22*/("""
                """),format.raw/*150.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*152.14*/("""
            """),format.raw/*153.13*/("""</li>
            <li>
            """),_display_(/*155.14*/if(session().get("role").equals("director"))/*155.58*/ {_display_(Seq[Any](format.raw/*155.60*/("""
                """),format.raw/*156.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*158.22*/if(session().get("role").equals("director"))/*158.66*/ {_display_(Seq[Any](format.raw/*158.68*/("""
                        """),format.raw/*159.25*/("""<li>
                            <a href=""""),_display_(/*160.39*/routes/*160.45*/.Pages.blank),format.raw/*160.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*162.22*/("""
                    """),_display_(/*163.22*/if(session().get("role").equals("director"))/*163.66*/ {_display_(Seq[Any](format.raw/*163.68*/("""
                        """),format.raw/*164.25*/("""<li>
                            <a href=""""),_display_(/*165.39*/routes/*165.45*/.Application.pdf()),format.raw/*165.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*167.22*/("""
                    """),_display_(/*168.22*/if(session().get("role").equals("director"))/*168.66*/ {_display_(Seq[Any](format.raw/*168.68*/("""
                        """),format.raw/*169.25*/("""<li>
                            <a href=""""),_display_(/*170.39*/routes/*170.45*/.Application.raw()),format.raw/*170.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*172.22*/("""
                    """),_display_(/*173.22*/if(session().get("role").equals("director"))/*173.66*/ {_display_(Seq[Any](format.raw/*173.68*/("""
                        """),format.raw/*174.25*/("""<li>
                            <a href=""""),_display_(/*175.39*/routes/*175.45*/.TestController.test()),format.raw/*175.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*177.22*/("""
                    """),_display_(/*178.22*/if(session().get("role").equals("director"))/*178.66*/ {_display_(Seq[Any](format.raw/*178.68*/("""
                        """),format.raw/*179.25*/("""<li>
                            <a href=""""),_display_(/*180.39*/routes/*180.45*/.SubjectPlanTeachingController.index()),format.raw/*180.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*182.22*/("""
                    """),_display_(/*183.22*/if(session().get("role").equals("director"))/*183.66*/ {_display_(Seq[Any](format.raw/*183.68*/("""
                        """),format.raw/*184.25*/("""<li>
                            <a href=""""),_display_(/*185.39*/routes/*185.45*/.VisitsController.index()),format.raw/*185.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*187.22*/("""
                    """),_display_(/*188.22*/if(session().get("role").equals("director"))/*188.66*/ {_display_(Seq[Any](format.raw/*188.68*/("""
                        """),format.raw/*189.25*/("""<li>
                            <a href=""""),_display_(/*190.39*/routes/*190.45*/.ProjectController.index()),format.raw/*190.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*192.22*/("""
                    """),_display_(/*193.22*/if(session().get("role").equals("director"))/*193.66*/ {_display_(Seq[Any](format.raw/*193.68*/("""
                        """),format.raw/*194.25*/("""<li>
                            <a href=""""),_display_(/*195.39*/routes/*195.45*/.CommitteeController.index()),format.raw/*195.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*197.22*/("""
                    """),_display_(/*198.22*/if(session().get("role").equals("director"))/*198.66*/ {_display_(Seq[Any](format.raw/*198.68*/("""
                        """),format.raw/*199.25*/("""<li>
                            <a href=""""),_display_(/*200.39*/routes/*200.45*/.PublicationsController.index()),format.raw/*200.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*202.22*/("""
                    """),_display_(/*203.22*/if(session().get("role").equals("director"))/*203.66*/ {_display_(Seq[Any](format.raw/*203.68*/("""
                        """),format.raw/*204.25*/("""<li>
                            <a href=""""),_display_(/*205.39*/routes/*205.45*/.OrganizationalUnitsController.index()),format.raw/*205.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*207.22*/("""
                    """),_display_(/*208.22*/if(session().get("role").equals("director"))/*208.66*/ {_display_(Seq[Any](format.raw/*208.68*/("""
                        """),format.raw/*209.25*/("""<li>
                            <a href=""""),_display_(/*210.39*/routes/*210.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*210.95*/("""">OJ zaměstnanec</a>
                        </li>
                    """)))}),format.raw/*212.22*/("""
                    """),_display_(/*213.22*/if(session().get("role").equals("director"))/*213.66*/ {_display_(Seq[Any](format.raw/*213.68*/("""
                        """),format.raw/*214.25*/("""<li>
                            <a href=""""),_display_(/*215.39*/routes/*215.45*/.FinalWorksController.index()),format.raw/*215.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*217.22*/("""
                    """),_display_(/*218.22*/if(session().get("role").equals("director"))/*218.66*/ {_display_(Seq[Any](format.raw/*218.68*/("""
                        """),format.raw/*219.25*/("""<li>
                            <a href=""""),_display_(/*220.39*/routes/*220.45*/.Application.kpiChoosePerson()),format.raw/*220.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*222.22*/("""
                    """),_display_(/*223.22*/if(session().get("role").equals("director"))/*223.66*/ {_display_(Seq[Any](format.raw/*223.68*/("""
                        """),format.raw/*224.25*/("""<li>
                            <a href=""""),_display_(/*225.39*/routes/*225.45*/.Application.roles()),format.raw/*225.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*227.22*/("""
                    """),_display_(/*228.22*/if(session().get("role").equals("director"))/*228.66*/ {_display_(Seq[Any](format.raw/*228.68*/("""
                        """),format.raw/*229.25*/("""<li>
                            <a href=""""),_display_(/*230.39*/routes/*230.45*/.PersonController.index()),format.raw/*230.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*232.22*/("""
                    """),_display_(/*233.22*/if(session().get("role").equals("director"))/*233.66*/ {_display_(Seq[Any](format.raw/*233.68*/("""
                        """),format.raw/*234.25*/("""<li>
                            <a href=""""),_display_(/*235.39*/routes/*235.45*/.EmployeesController.index()),format.raw/*235.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*237.22*/("""

                    """),_display_(/*239.22*/if(session().get("role").equals("director"))/*239.66*/ {_display_(Seq[Any](format.raw/*239.68*/("""
                        """),format.raw/*240.25*/("""<li>
                            <a href=""""),_display_(/*241.39*/routes/*241.45*/.SubjectController.index()),format.raw/*241.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*243.22*/("""

                    """),_display_(/*245.22*/if(session().get("role").equals("director"))/*245.66*/ {_display_(Seq[Any](format.raw/*245.68*/("""
                        """),format.raw/*246.25*/("""<li>
                            <a href=""""),_display_(/*247.39*/routes/*247.45*/.FieldOfStudyController.index()),format.raw/*247.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*249.22*/("""
                    """),_display_(/*250.22*/if(session().get("role").equals("director"))/*250.66*/ {_display_(Seq[Any](format.raw/*250.68*/("""
                        """),format.raw/*251.25*/("""<li>
                            <a href=""""),_display_(/*252.39*/routes/*252.45*/.StudyGroupsController.index()),format.raw/*252.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*254.22*/("""
                    """),_display_(/*255.22*/if(session().get("role").equals("director"))/*255.66*/ {_display_(Seq[Any](format.raw/*255.68*/("""
                        """),format.raw/*256.25*/("""<li>
                            <a href=""""),_display_(/*257.39*/routes/*257.45*/.SemestersController.index()),format.raw/*257.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*259.22*/("""
                    """),_display_(/*260.22*/if(session().get("role").equals("director"))/*260.66*/ {_display_(Seq[Any](format.raw/*260.68*/("""
                        """),format.raw/*261.25*/("""<li>
                            <a href=""""),_display_(/*262.39*/routes/*262.45*/.StudyPlansController.index()),format.raw/*262.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*264.22*/("""
                    """),_display_(/*265.22*/if(session().get("role").equals("director"))/*265.66*/ {_display_(Seq[Any](format.raw/*265.68*/("""
                        """),format.raw/*266.25*/("""<li>
                            <a href=""""),_display_(/*267.39*/routes/*267.45*/.TeachersController.index()),format.raw/*267.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*269.22*/("""
                    """),_display_(/*270.22*/if(session().get("role").equals("director"))/*270.66*/ {_display_(Seq[Any](format.raw/*270.68*/("""
                        """),format.raw/*271.25*/("""<li>
                            <a href=""""),_display_(/*272.39*/routes/*272.45*/.CourseController.index()),format.raw/*272.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*274.22*/("""

                """),format.raw/*276.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*278.14*/("""
            """),format.raw/*279.13*/("""</li>
            <li>
            """),_display_(/*281.14*/if(session().get("role").equals("director"))/*281.58*/ {_display_(Seq[Any](format.raw/*281.60*/("""
                """),format.raw/*282.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*284.18*/if(session().get("role").equals("director"))/*284.62*/ {_display_(Seq[Any](format.raw/*284.64*/("""
                    """),format.raw/*285.21*/("""<li>
                        <a href=""""),_display_(/*286.35*/routes/*286.41*/.MethodicsController.index()),format.raw/*286.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*288.18*/("""
                """),format.raw/*289.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*291.14*/("""
            """),format.raw/*292.13*/("""</li>
            <li>
            """),_display_(/*294.14*/if(session().get("role").equals("director"))/*294.58*/ {_display_(Seq[Any](format.raw/*294.60*/("""
                """),format.raw/*295.17*/("""<a href='"""),_display_(/*295.27*/routes/*295.33*/.Application.forms),format.raw/*295.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*296.14*/("""
            """),format.raw/*297.13*/("""</li>
            <li>
            """),_display_(/*299.14*/if(session().get("role").equals("director"))/*299.58*/ {_display_(Seq[Any](format.raw/*299.60*/("""
                """),format.raw/*300.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*303.35*/routes/*303.41*/.UiElements.panelsAndWells),format.raw/*303.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*306.35*/routes/*306.41*/.UiElements.buttons),format.raw/*306.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*309.35*/routes/*309.41*/.UiElements.notifications),format.raw/*309.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*312.35*/routes/*312.41*/.UiElements.typography),format.raw/*312.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*315.35*/routes/*315.41*/.UiElements.icons),format.raw/*315.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*318.35*/routes/*318.41*/.UiElements.grid),format.raw/*318.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*322.14*/("""
            """),format.raw/*323.13*/("""</li>
            <li>
            """),_display_(/*325.14*/if(session().get("role").equals("director"))/*325.58*/ {_display_(Seq[Any](format.raw/*325.60*/("""
                """),format.raw/*326.17*/("""<a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            """)))}),format.raw/*355.14*/("""
            """),format.raw/*356.13*/("""</li>
            <li>
            """),_display_(/*358.14*/if(session().get("role").equals("director"))/*358.58*/ {_display_(Seq[Any](format.raw/*358.60*/("""
                """),format.raw/*359.17*/("""<a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*364.35*/routes/*364.41*/.Charts.flot),format.raw/*364.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*367.35*/routes/*367.41*/.Charts.morris),format.raw/*367.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*371.14*/("""
            """),format.raw/*372.13*/("""</li>

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
                  DATE: Sat Apr 29 09:35:29 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: fe43cfec426297ca8ab0073f5e046ede215c6a5f
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1670->671|1685->677|1773->743|1855->798|1870->804|1933->846|2010->896|2025->902|2088->944|2165->994|2180->1000|2242->1041|2318->1090|2333->1096|2382->1124|2464->1179|2479->1185|2549->1234|2621->1279|2636->1285|2724->1351|2853->1453|2868->1459|2973->1542|3190->1732|3243->1776|3283->1778|3328->1795|3513->1953|3566->1997|3606->1999|3659->2024|3729->2067|3744->2073|3832->2139|4001->2277|4051->2300|4104->2344|4144->2346|4197->2371|4267->2414|4282->2420|4347->2464|4536->2622|4585->2644|4638->2688|4678->2690|4731->2715|4801->2758|4816->2764|4866->2793|5031->2927|5080->2949|5133->2993|5173->2995|5226->3020|5296->3063|5311->3069|5365->3102|5534->3240|5583->3262|5636->3306|5676->3308|5729->3333|5799->3376|5814->3382|5873->3420|6044->3560|6093->3582|6146->3626|6186->3628|6239->3653|6309->3696|6324->3702|6376->3733|6537->3863|6586->3885|6639->3929|6679->3931|6732->3956|6802->3999|6817->4005|6870->4037|7036->4172|7085->4194|7138->4238|7178->4240|7231->4265|7301->4308|7316->4314|7368->4345|7532->4478|7581->4500|7634->4544|7674->4546|7727->4571|7797->4614|7812->4620|7867->4654|8038->4794|8087->4816|8140->4860|8180->4862|8233->4887|8303->4930|8318->4936|8371->4968|8534->5100|8583->5122|8636->5166|8676->5168|8729->5193|8800->5236|8816->5242|8869->5273|9033->5405|9083->5427|9137->5471|9178->5473|9232->5498|9303->5541|9319->5547|9377->5583|9538->5712|9588->5734|9642->5778|9683->5780|9737->5805|9808->5848|9824->5854|9876->5884|10005->5981|10055->6003|10109->6047|10150->6049|10204->6074|10275->6117|10291->6123|10352->6162|10525->6303|10575->6325|10629->6369|10670->6371|10724->6396|10795->6439|10811->6445|10891->6502|11080->6659|11130->6681|11184->6725|11225->6727|11279->6752|11350->6795|11366->6801|11415->6828|11542->6923|11592->6945|11646->6989|11687->6991|11741->7016|11812->7059|11828->7065|11883->7098|12045->7228|12095->7250|12149->7294|12190->7296|12244->7321|12315->7364|12331->7370|12388->7405|12553->7538|12603->7560|12657->7604|12698->7606|12752->7631|12823->7674|12839->7680|12899->7718|13072->7859|13118->7876|13217->7943|13259->7956|13323->7992|13377->8036|13418->8038|13464->8055|13659->8222|13713->8266|13754->8268|13808->8293|13879->8336|13895->8342|13929->8354|14029->8422|14079->8444|14133->8488|14174->8490|14228->8515|14299->8558|14315->8564|14355->8582|14448->8643|14498->8665|14552->8709|14593->8711|14647->8736|14718->8779|14734->8785|14774->8803|14872->8869|14922->8891|14976->8935|15017->8937|15071->8962|15142->9005|15158->9011|15202->9033|15296->9095|15346->9117|15400->9161|15441->9163|15495->9188|15566->9231|15582->9237|15642->9275|15757->9358|15807->9380|15861->9424|15902->9426|15956->9451|16027->9494|16043->9500|16090->9525|16198->9601|16248->9623|16302->9667|16343->9669|16397->9694|16468->9737|16484->9743|16532->9769|16641->9846|16691->9868|16745->9912|16786->9914|16840->9939|16911->9982|16927->9988|16977->10016|17084->10091|17134->10113|17188->10157|17229->10159|17283->10184|17354->10227|17370->10233|17423->10264|17533->10342|17583->10364|17637->10408|17678->10410|17732->10435|17803->10478|17819->10484|17879->10522|18000->10611|18050->10633|18104->10677|18145->10679|18199->10704|18270->10747|18286->10753|18358->10803|18462->10875|18512->10897|18566->10941|18607->10943|18661->10968|18732->11011|18748->11017|18799->11046|18915->11130|18965->11152|19019->11196|19060->11198|19114->11223|19185->11266|19201->11272|19253->11302|19358->11375|19408->11397|19462->11441|19503->11443|19557->11468|19628->11511|19644->11517|19686->11537|19780->11599|19830->11621|19884->11665|19925->11667|19979->11692|20050->11735|20066->11741|20113->11766|20219->11840|20269->11862|20323->11906|20364->11908|20418->11933|20489->11976|20505->11982|20555->12010|20667->12090|20718->12113|20772->12157|20813->12159|20867->12184|20938->12227|20954->12233|21002->12259|21111->12336|21162->12359|21216->12403|21257->12405|21311->12430|21382->12473|21398->12479|21451->12510|21557->12584|21607->12606|21661->12650|21702->12652|21756->12677|21827->12720|21843->12726|21895->12756|22003->12832|22053->12854|22107->12898|22148->12900|22202->12925|22273->12968|22289->12974|22339->13002|22448->13079|22498->13101|22552->13145|22593->13147|22647->13172|22718->13215|22734->13221|22785->13250|22902->13335|22952->13357|23006->13401|23047->13403|23101->13428|23172->13471|23188->13477|23237->13504|23345->13580|23395->13602|23449->13646|23490->13648|23544->13673|23615->13716|23631->13722|23678->13747|23784->13821|23831->13839|23930->13906|23972->13919|24036->13955|24090->13999|24131->14001|24177->14018|24363->14176|24417->14220|24458->14222|24508->14243|24575->14282|24591->14288|24641->14316|24738->14381|24784->14398|24883->14465|24925->14478|24989->14514|25043->14558|25084->14560|25130->14577|25168->14587|25184->14593|25224->14611|25318->14673|25360->14686|25424->14722|25478->14766|25519->14768|25565->14785|25792->14984|25808->14990|25856->15016|25992->15124|26008->15130|26049->15149|26176->15248|26192->15254|26239->15279|26372->15384|26388->15390|26432->15412|26562->15514|26578->15520|26617->15537|26743->15635|26759->15641|26797->15657|26949->15777|26991->15790|27055->15826|27109->15870|27150->15872|27196->15889|28506->17167|28548->17180|28612->17216|28666->17260|28707->17262|28753->17279|29020->17518|29036->17524|29070->17536|29201->17639|29217->17645|29253->17659|29417->17791|29459->17804
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|70->39|70->39|70->39|73->42|75->44|75->44|75->44|76->45|77->46|77->46|77->46|80->49|81->50|81->50|81->50|82->51|83->52|83->52|83->52|86->55|87->56|87->56|87->56|88->57|89->58|89->58|89->58|92->61|93->62|93->62|93->62|94->63|95->64|95->64|95->64|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|110->79|111->80|111->80|111->80|112->81|113->82|113->82|113->82|116->85|117->86|117->86|117->86|118->87|119->88|119->88|119->88|122->91|123->92|123->92|123->92|124->93|125->94|125->94|125->94|128->97|129->98|129->98|129->98|130->99|131->100|131->100|131->100|134->103|135->104|135->104|135->104|136->105|137->106|137->106|137->106|140->109|141->110|141->110|141->110|142->111|143->112|143->112|143->112|145->114|146->115|146->115|146->115|147->116|148->117|148->117|148->117|151->120|152->121|152->121|152->121|153->122|154->123|154->123|154->123|157->126|158->127|158->127|158->127|159->128|160->129|160->129|160->129|162->131|163->132|163->132|163->132|164->133|165->134|165->134|165->134|168->137|169->138|169->138|169->138|170->139|171->140|171->140|171->140|174->143|175->144|175->144|175->144|176->145|177->146|177->146|177->146|180->149|181->150|183->152|184->153|186->155|186->155|186->155|187->156|189->158|189->158|189->158|190->159|191->160|191->160|191->160|193->162|194->163|194->163|194->163|195->164|196->165|196->165|196->165|198->167|199->168|199->168|199->168|200->169|201->170|201->170|201->170|203->172|204->173|204->173|204->173|205->174|206->175|206->175|206->175|208->177|209->178|209->178|209->178|210->179|211->180|211->180|211->180|213->182|214->183|214->183|214->183|215->184|216->185|216->185|216->185|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|223->192|224->193|224->193|224->193|225->194|226->195|226->195|226->195|228->197|229->198|229->198|229->198|230->199|231->200|231->200|231->200|233->202|234->203|234->203|234->203|235->204|236->205|236->205|236->205|238->207|239->208|239->208|239->208|240->209|241->210|241->210|241->210|243->212|244->213|244->213|244->213|245->214|246->215|246->215|246->215|248->217|249->218|249->218|249->218|250->219|251->220|251->220|251->220|253->222|254->223|254->223|254->223|255->224|256->225|256->225|256->225|258->227|259->228|259->228|259->228|260->229|261->230|261->230|261->230|263->232|264->233|264->233|264->233|265->234|266->235|266->235|266->235|268->237|270->239|270->239|270->239|271->240|272->241|272->241|272->241|274->243|276->245|276->245|276->245|277->246|278->247|278->247|278->247|280->249|281->250|281->250|281->250|282->251|283->252|283->252|283->252|285->254|286->255|286->255|286->255|287->256|288->257|288->257|288->257|290->259|291->260|291->260|291->260|292->261|293->262|293->262|293->262|295->264|296->265|296->265|296->265|297->266|298->267|298->267|298->267|300->269|301->270|301->270|301->270|302->271|303->272|303->272|303->272|305->274|307->276|309->278|310->279|312->281|312->281|312->281|313->282|315->284|315->284|315->284|316->285|317->286|317->286|317->286|319->288|320->289|322->291|323->292|325->294|325->294|325->294|326->295|326->295|326->295|326->295|327->296|328->297|330->299|330->299|330->299|331->300|334->303|334->303|334->303|337->306|337->306|337->306|340->309|340->309|340->309|343->312|343->312|343->312|346->315|346->315|346->315|349->318|349->318|349->318|353->322|354->323|356->325|356->325|356->325|357->326|386->355|387->356|389->358|389->358|389->358|390->359|395->364|395->364|395->364|398->367|398->367|398->367|402->371|403->372
                  -- GENERATED --
              */
          