
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
                        <a href=""""),_display_(/*14.35*/routes/*14.41*/.StatisticController.index()),format.raw/*14.69*/("""">Zobrazit DČPS všechny</a>
                        <a href=""""),_display_(/*15.35*/routes/*15.41*/.StatisticController.dcpsPres()),format.raw/*15.72*/("""">Zobrazit DČPS prezenční</a>
                        <a href=""""),_display_(/*16.35*/routes/*16.41*/.StatisticController.dcpsCombi()),format.raw/*16.73*/("""">Zobrazit DČPS kombinované</a>
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.StatisticController.studyPlansTable()),format.raw/*17.79*/("""">Zobrazit SP</a>
                        <a href=""""),_display_(/*18.35*/routes/*18.41*/.EmployeesController.info(session().get("uid"))),format.raw/*18.88*/("""">Mé osobní údaje</a>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.StatisticController.listEmployeerActvitiy(session().get("uid"))),format.raw/*19.105*/("""">
                            Můj souhrn aktivity v semestrech</a>
                        <a href='"""),_display_(/*21.35*/routes/*21.41*/.PersonalStatisticController.listTableTeachingAccordingToId(session().get("uid"))),format.raw/*21.122*/("""'>
                            Má výuka</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
            """),_display_(/*29.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*29.98*/ {_display_(Seq[Any](format.raw/*29.100*/("""
                """),format.raw/*30.17*/("""<a href="#"><i class="fa fa-table fa-fw"></i>Seznamy a výstupy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*32.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*32.106*/ {_display_(Seq[Any](format.raw/*32.108*/("""
                        """),format.raw/*33.25*/("""<li>
                            <a href=""""),_display_(/*34.39*/routes/*34.45*/.PersonalStatisticController.teachingAAA()),format.raw/*34.87*/("""">Výuka AAA</a>
                        </li>
                    """)))}),format.raw/*36.22*/("""
                    """),_display_(/*37.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*37.106*/ {_display_(Seq[Any](format.raw/*37.108*/("""
                        """),format.raw/*38.25*/("""<li>
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.PersonalStatisticController.teachingAAB()),format.raw/*39.87*/("""">Výuka AAB</a>
                        </li>
                    """)))}),format.raw/*41.22*/("""
                    """),_display_(/*42.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*42.106*/ {_display_(Seq[Any](format.raw/*42.108*/("""
                        """),format.raw/*43.25*/("""<li>
                            <a href=""""),_display_(/*44.39*/routes/*44.45*/.PersonalStatisticController.teachingCB()),format.raw/*44.86*/("""">Výuka CB</a>
                        </li>
                    """)))}),format.raw/*46.22*/("""
                    """),_display_(/*47.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*47.106*/ {_display_(Seq[Any](format.raw/*47.108*/("""
                        """),format.raw/*48.25*/("""<li>
                            <a href=""""),_display_(/*49.39*/routes/*49.45*/.StatementController.index()),format.raw/*49.73*/("""">Zobrazit všechny výkazy</a>
                        </li>
                    """)))}),format.raw/*51.22*/("""
                    """),_display_(/*52.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*52.106*/ {_display_(Seq[Any](format.raw/*52.108*/("""
                        """),format.raw/*53.25*/("""<li>
                            <a href=""""),_display_(/*54.39*/routes/*54.45*/.PersonalStatisticController.index()),format.raw/*54.81*/("""">Výuka dle oddělení a osob</a>
                        </li>
                    """)))}),format.raw/*56.22*/("""
                    """),_display_(/*57.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*57.106*/ {_display_(Seq[Any](format.raw/*57.108*/("""
                        """),format.raw/*58.25*/("""<li>
                            <a href='"""),_display_(/*59.39*/routes/*59.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*59.111*/("""'>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*62.22*/("""
                    """),_display_(/*63.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*63.106*/ {_display_(Seq[Any](format.raw/*63.108*/("""
                        """),format.raw/*64.25*/("""<li>
                            <a href='"""),_display_(/*65.39*/routes/*65.45*/.TableController.listClassrooms()),format.raw/*65.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Místnosti</a>
                        </li>
                    """)))}),format.raw/*68.22*/("""
                    """),_display_(/*69.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*69.106*/ {_display_(Seq[Any](format.raw/*69.108*/("""
                        """),format.raw/*70.25*/("""<li>
                            <a href='"""),_display_(/*71.39*/routes/*71.45*/.TableController.listVisits()),format.raw/*71.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Výjezdy</a>
                        </li>
                    """)))}),format.raw/*74.22*/("""
                    """),_display_(/*75.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*75.106*/ {_display_(Seq[Any](format.raw/*75.108*/("""
                        """),format.raw/*76.25*/("""<li>
                            <a href='"""),_display_(/*77.39*/routes/*77.45*/.TableController.listOJ()),format.raw/*77.70*/("""'><i class="fa fa-table fa-fw"></i>
                                Organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*80.22*/("""
                    """),_display_(/*81.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*81.106*/ {_display_(Seq[Any](format.raw/*81.108*/("""
                        """),format.raw/*82.25*/("""<li>
                            <a href='"""),_display_(/*83.39*/routes/*83.45*/.TableController.listAccessRole()),format.raw/*83.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Role přístupů</a>
                        </li>
                    """)))}),format.raw/*86.22*/("""
                    """),_display_(/*87.22*/if(session().get("role").equals("xxx") || session().get("role").equals("xxx"))/*87.100*/ {_display_(Seq[Any](format.raw/*87.102*/("""
                        """),format.raw/*88.25*/("""<li>
                            <a href='"""),_display_(/*89.39*/routes/*89.45*/.TableController.listTeachersRole()),format.raw/*89.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Role předmětů</a>
                        </li>
                    """)))}),format.raw/*92.22*/("""
                    """),_display_(/*93.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*93.106*/ {_display_(Seq[Any](format.raw/*93.108*/("""
                        """),format.raw/*94.25*/("""<li>
                            <a href='"""),_display_(/*95.39*/routes/*95.45*/.PersonalStatisticController.listTableTeachingAccordingToPersons()),format.raw/*95.111*/("""'><i class="fa fa-table fa-fw"></i>
                                Výuka dle osob</a>
                        </li>
                    """)))}),format.raw/*98.22*/("""

                    """),_display_(/*100.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*100.106*/ {_display_(Seq[Any](format.raw/*100.108*/("""
                        """),format.raw/*101.25*/("""<li>
                            <a href='"""),_display_(/*102.39*/routes/*102.45*/.StatisticController.listEmployeesActvitiy()),format.raw/*102.89*/("""'><i class="fa fa-table fa-fw"></i>
                                Souhrn výuky dle osob v semestrech</a>
                        </li>
                    """)))}),format.raw/*105.22*/("""
                    """),_display_(/*106.22*/if(session().get("role").equals("xxx") || session().get("role").equals("xxx"))/*106.100*/ {_display_(Seq[Any](format.raw/*106.102*/("""
                        """),format.raw/*107.25*/("""<li>
                            <a href='"""),_display_(/*108.39*/routes/*108.45*/.TableController.listPerson()),format.raw/*108.74*/("""'><i class="fa fa-table fa-fw"></i>
                                Pracovníci</a>
                        </li>
                    """)))}),format.raw/*111.22*/("""
                    """),_display_(/*112.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*112.106*/ {_display_(Seq[Any](format.raw/*112.108*/("""
                        """),format.raw/*113.25*/("""<li>
                            <a href='"""),_display_(/*114.39*/routes/*114.45*/.TableController.listStudyPlans()),format.raw/*114.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní plány</a>
                        </li>
                    """)))}),format.raw/*117.22*/("""
                    """),_display_(/*118.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*118.106*/ {_display_(Seq[Any](format.raw/*118.108*/("""
                        """),format.raw/*119.25*/("""<li>
                            <a href='"""),_display_(/*120.39*/routes/*120.45*/.TableController.listScheduleInWeeks()),format.raw/*120.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh v týdnech</a>
                        </li>
                    """)))}),format.raw/*123.22*/("""
                    """),_display_(/*124.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*124.106*/ {_display_(Seq[Any](format.raw/*124.108*/("""
                        """),format.raw/*125.25*/("""<li>
                            <a href='"""),_display_(/*126.39*/routes/*126.45*/.TableController.listSchedule()),format.raw/*126.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Rozvrh</a>
                        </li>
                    """)))}),format.raw/*129.22*/("""
                    """),_display_(/*130.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*130.106*/ {_display_(Seq[Any](format.raw/*130.108*/("""
                        """),format.raw/*131.25*/("""<li>
                            <a href='"""),_display_(/*132.39*/routes/*132.45*/.TableController.listEmployees()),format.raw/*132.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Zaměstnanci</a>
                        </li>
                    """)))}),format.raw/*135.22*/("""
                    """),_display_(/*136.22*/if(session().get("role").equals("xxx") || session().get("role").equals("xxx"))/*136.100*/ {_display_(Seq[Any](format.raw/*136.102*/("""
                        """),format.raw/*137.25*/("""<li>
                            <a href='"""),_display_(/*138.39*/routes/*138.45*/.TableController.listTeachers()),format.raw/*138.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Vyučující</a>
                        </li>
                    """)))}),format.raw/*141.22*/("""
                    """),_display_(/*142.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*142.106*/ {_display_(Seq[Any](format.raw/*142.108*/("""
                        """),format.raw/*143.25*/("""<li>
                            <a href='"""),_display_(/*144.39*/routes/*144.45*/.TableController.listStudyGroups()),format.raw/*144.79*/("""'><i class="fa fa-table fa-fw"></i>
                                Studijní skupiny</a>
                        </li>
                    """)))}),format.raw/*147.22*/("""
                    """),_display_(/*148.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*148.106*/ {_display_(Seq[Any](format.raw/*148.108*/("""
                        """),format.raw/*149.25*/("""<li>
                            <a href='"""),_display_(/*150.39*/routes/*150.45*/.TableController.listSemesters()),format.raw/*150.77*/("""'><i class="fa fa-table fa-fw"></i>
                                Semestry</a>
                        </li>
                    """)))}),format.raw/*153.22*/("""
                    """),_display_(/*154.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*154.106*/ {_display_(Seq[Any](format.raw/*154.108*/("""
                        """),format.raw/*155.25*/("""<li>
                            <a href='"""),_display_(/*156.39*/routes/*156.45*/.TableController.listSubjects()),format.raw/*156.76*/("""'><i class="fa fa-table fa-fw"></i>
                                Předměty</a>
                        </li>
                    """)))}),format.raw/*159.22*/("""
                    """),_display_(/*160.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*160.106*/ {_display_(Seq[Any](format.raw/*160.108*/("""
                        """),format.raw/*161.25*/("""<li>
                            <a href='"""),_display_(/*162.39*/routes/*162.45*/.TableController.listFieldsOfStudy()),format.raw/*162.81*/("""'><i class="fa fa-table fa-fw"></i>
                                Obory</a>
                        </li>
                    """)))}),format.raw/*165.22*/("""
                    """),_display_(/*166.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*166.106*/ {_display_(Seq[Any](format.raw/*166.108*/("""
                        """),format.raw/*167.25*/("""<li>
                            <a href='"""),_display_(/*168.39*/routes/*168.45*/.TableController.listCourses()),format.raw/*168.75*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                        </li>
                    """)))}),format.raw/*170.22*/("""
                    """),_display_(/*171.22*/if(session().get("role").equals("xxx") || session().get("role").equals("xxx"))/*171.100*/ {_display_(Seq[Any](format.raw/*171.102*/("""
                        """),format.raw/*172.25*/("""<li>
                            <a href='"""),_display_(/*173.39*/routes/*173.45*/.TableController.listCurrentSemesters()),format.raw/*173.84*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry</a>
                        </li>
                    """)))}),format.raw/*176.22*/("""
                    """),_display_(/*177.22*/if(session().get("role").equals("xxx") || session().get("role").equals("xxx"))/*177.100*/ {_display_(Seq[Any](format.raw/*177.102*/("""
                        """),format.raw/*178.25*/("""<li>
                            <a href='"""),_display_(/*179.39*/routes/*179.45*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*179.102*/("""'><i class="fa fa-table fa-fw"></i>
                                Aktuální semestry do konce studia</a>
                        </li>
                    """)))}),format.raw/*182.22*/("""
                    """),_display_(/*183.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*183.106*/ {_display_(Seq[Any](format.raw/*183.108*/("""
                        """),format.raw/*184.25*/("""<li>
                            <a href='"""),_display_(/*185.39*/routes/*185.45*/.TableController.listDays()),format.raw/*185.72*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                        </li>
                    """)))}),format.raw/*187.22*/("""
                    """),_display_(/*188.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*188.106*/ {_display_(Seq[Any](format.raw/*188.108*/("""
                        """),format.raw/*189.25*/("""<li>
                            <a href='"""),_display_(/*190.39*/routes/*190.45*/.TableController.listCommittees()),format.raw/*190.78*/("""'><i class="fa fa-table fa-fw"></i>
                                Komise</a>
                        </li>
                    """)))}),format.raw/*193.22*/("""
                    """),_display_(/*194.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*194.106*/ {_display_(Seq[Any](format.raw/*194.108*/("""
                        """),format.raw/*195.25*/("""<li>
                            <a href='"""),_display_(/*196.39*/routes/*196.45*/.TableController.listPublications()),format.raw/*196.80*/("""'><i class="fa fa-table fa-fw"></i>
                                Publikace</a>
                        </li>
                    """)))}),format.raw/*199.22*/("""
                    """),_display_(/*200.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*200.106*/ {_display_(Seq[Any](format.raw/*200.108*/("""
                        """),format.raw/*201.25*/("""<li>
                            <a href='"""),_display_(/*202.39*/routes/*202.45*/.TableController.listTeachersInWeeks()),format.raw/*202.83*/("""'><i class="fa fa-table fa-fw"></i>
                                Učitelé v týdnech</a>
                        </li>
                    """)))}),format.raw/*205.22*/("""
                """),format.raw/*206.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*208.14*/("""
            """),format.raw/*209.13*/("""</li>
            <li>
            """),_display_(/*211.14*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*211.98*/ {_display_(Seq[Any](format.raw/*211.100*/("""
                """),format.raw/*212.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Oblast zadávání<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    """),_display_(/*214.22*/if(session().get("role").equals("director") || session().get("role").equals("head"))/*214.106*/ {_display_(Seq[Any](format.raw/*214.108*/("""
                        """),format.raw/*215.25*/("""<li>
                            <a href=""""),_display_(/*216.39*/routes/*216.45*/.ClassroomController.index()),format.raw/*216.73*/("""">Místnosti</a>
                        </li>
                    """)))}),format.raw/*218.22*/("""
                    """),_display_(/*219.22*/if(session().get("role").equals("xxx"))/*219.61*/ {_display_(Seq[Any](format.raw/*219.63*/("""
                        """),format.raw/*220.25*/("""<li>
                            <a href=""""),_display_(/*221.39*/routes/*221.45*/.TeachersRoleController.index()),format.raw/*221.76*/("""">Role u předmětů</a>
                        </li>
                    """)))}),format.raw/*223.22*/("""
                    """),_display_(/*224.22*/if(session().get("role").equals("xxx"))/*224.61*/ {_display_(Seq[Any](format.raw/*224.63*/("""
                        """),format.raw/*225.25*/("""<li>
                            <a href=""""),_display_(/*226.39*/routes/*226.45*/.Pages.blank),format.raw/*226.57*/("""">Blank Page</a>
                        </li>
                    """)))}),format.raw/*228.22*/("""
                    """),_display_(/*229.22*/if(session().get("role").equals("xxx"))/*229.61*/ {_display_(Seq[Any](format.raw/*229.63*/("""
                        """),format.raw/*230.25*/("""<li>
                            <a href=""""),_display_(/*231.39*/routes/*231.45*/.Application.pdf()),format.raw/*231.63*/("""">pdf</a>
                        </li>
                    """)))}),format.raw/*233.22*/("""
                    """),_display_(/*234.22*/if(session().get("role").equals("xxx"))/*234.61*/ {_display_(Seq[Any](format.raw/*234.63*/("""
                        """),format.raw/*235.25*/("""<li>
                            <a href=""""),_display_(/*236.39*/routes/*236.45*/.Application.raw()),format.raw/*236.63*/("""">Dokument</a>
                        </li>
                    """)))}),format.raw/*238.22*/("""
                    """),_display_(/*239.22*/if(session().get("role").equals("xxx"))/*239.61*/ {_display_(Seq[Any](format.raw/*239.63*/("""
                        """),format.raw/*240.25*/("""<li>
                            <a href=""""),_display_(/*241.39*/routes/*241.45*/.TestController.test()),format.raw/*241.67*/("""">test</a>
                        </li>
                    """)))}),format.raw/*243.22*/("""
                    """),_display_(/*244.22*/if(session().get("role").equals("director"))/*244.66*/ {_display_(Seq[Any](format.raw/*244.68*/("""
                        """),format.raw/*245.25*/("""<li>
                            <a href=""""),_display_(/*246.39*/routes/*246.45*/.SubjectPlanTeachingController.index()),format.raw/*246.83*/("""">Přidání předmětu do kurzu</a>
                        </li>
                    """)))}),format.raw/*248.22*/("""
                    """),_display_(/*249.22*/if(session().get("role").equals("director"))/*249.66*/ {_display_(Seq[Any](format.raw/*249.68*/("""
                        """),format.raw/*250.25*/("""<li>
                            <a href=""""),_display_(/*251.39*/routes/*251.45*/.VisitsController.index()),format.raw/*251.70*/("""">Registrace výjezdu</a>
                        </li>
                    """)))}),format.raw/*253.22*/("""
                    """),_display_(/*254.22*/if(session().get("role").equals("director"))/*254.66*/ {_display_(Seq[Any](format.raw/*254.68*/("""
                        """),format.raw/*255.25*/("""<li>
                            <a href=""""),_display_(/*256.39*/routes/*256.45*/.ProjectController.index()),format.raw/*256.71*/("""">Registrace projektu</a>
                        </li>
                    """)))}),format.raw/*258.22*/("""
                    """),_display_(/*259.22*/if(session().get("role").equals("director"))/*259.66*/ {_display_(Seq[Any](format.raw/*259.68*/("""
                        """),format.raw/*260.25*/("""<li>
                            <a href=""""),_display_(/*261.39*/routes/*261.45*/.CommitteeController.index()),format.raw/*261.73*/("""">Registrace komise</a>
                        </li>
                    """)))}),format.raw/*263.22*/("""
                    """),_display_(/*264.22*/if(session().get("role").equals("director"))/*264.66*/ {_display_(Seq[Any](format.raw/*264.68*/("""
                        """),format.raw/*265.25*/("""<li>
                            <a href=""""),_display_(/*266.39*/routes/*266.45*/.PublicationsController.index()),format.raw/*266.76*/("""">Registrace publikace</a>
                        </li>
                    """)))}),format.raw/*268.22*/("""
                    """),_display_(/*269.22*/if(session().get("role").equals("director"))/*269.66*/ {_display_(Seq[Any](format.raw/*269.68*/("""
                        """),format.raw/*270.25*/("""<li>
                            <a href=""""),_display_(/*271.39*/routes/*271.45*/.OrganizationalUnitsController.index()),format.raw/*271.83*/("""">Registrace organizační jednotky</a>
                        </li>
                    """)))}),format.raw/*273.22*/("""
                    """),_display_(/*274.22*/if(session().get("role").equals("director"))/*274.66*/ {_display_(Seq[Any](format.raw/*274.68*/("""
                        """),format.raw/*275.25*/("""<li>
                            <a href=""""),_display_(/*276.39*/routes/*276.45*/.OrganizationalUnitsController.indexParticipants()),format.raw/*276.95*/("""">
                                Přidání zaměstnanec do OJ</a>
                        </li>
                    """)))}),format.raw/*279.22*/("""
                    """),_display_(/*280.22*/if(session().get("role").equals("director"))/*280.66*/ {_display_(Seq[Any](format.raw/*280.68*/("""
                        """),format.raw/*281.25*/("""<li>
                            <a href=""""),_display_(/*282.39*/routes/*282.45*/.FinalWorksController.index()),format.raw/*282.74*/("""">Registrace závěrečné práce</a>
                        </li>
                    """)))}),format.raw/*284.22*/("""
                    """),_display_(/*285.22*/if(session().get("role").equals("director"))/*285.66*/ {_display_(Seq[Any](format.raw/*285.68*/("""
                        """),format.raw/*286.25*/("""<li>
                            <a href=""""),_display_(/*287.39*/routes/*287.45*/.Application.kpiChoosePerson()),format.raw/*287.75*/("""">KPI výběr osoby</a>
                        </li>
                    """)))}),format.raw/*289.22*/("""
                    """),_display_(/*290.22*/if(session().get("role").equals("xxx"))/*290.61*/ {_display_(Seq[Any](format.raw/*290.63*/("""
                        """),format.raw/*291.25*/("""<li>
                            <a href=""""),_display_(/*292.39*/routes/*292.45*/.Application.roles()),format.raw/*292.65*/("""">Role</a>
                        </li>
                    """)))}),format.raw/*294.22*/("""
                    """),_display_(/*295.22*/if(session().get("role").equals("director"))/*295.66*/ {_display_(Seq[Any](format.raw/*295.68*/("""
                        """),format.raw/*296.25*/("""<li>
                            <a href=""""),_display_(/*297.39*/routes/*297.45*/.PersonController.index()),format.raw/*297.70*/("""">Registrace osoby</a>
                        </li>
                    """)))}),format.raw/*299.22*/("""
                    """),_display_(/*300.22*/if(session().get("role").equals("director"))/*300.66*/ {_display_(Seq[Any](format.raw/*300.68*/("""
                        """),format.raw/*301.25*/("""<li>
                            <a href=""""),_display_(/*302.39*/routes/*302.45*/.EmployeesController.index()),format.raw/*302.73*/("""">Registrace zaměstnance</a>
                        </li>
                    """)))}),format.raw/*304.22*/("""

                    """),_display_(/*306.22*/if(session().get("role").equals("xxx"))/*306.61*/ {_display_(Seq[Any](format.raw/*306.63*/("""
                        """),format.raw/*307.25*/("""<li>
                            <a href=""""),_display_(/*308.39*/routes/*308.45*/.SubjectController.index()),format.raw/*308.71*/("""">Registrace předmětu</a>
                        </li>
                    """)))}),format.raw/*310.22*/("""

                    """),_display_(/*312.22*/if(session().get("role").equals("director"))/*312.66*/ {_display_(Seq[Any](format.raw/*312.68*/("""
                        """),format.raw/*313.25*/("""<li>
                            <a href=""""),_display_(/*314.39*/routes/*314.45*/.FieldOfStudyController.index()),format.raw/*314.76*/("""">Registrace oboru</a>
                        </li>
                    """)))}),format.raw/*316.22*/("""
                    """),_display_(/*317.22*/if(session().get("role").equals("director"))/*317.66*/ {_display_(Seq[Any](format.raw/*317.68*/("""
                        """),format.raw/*318.25*/("""<li>
                            <a href=""""),_display_(/*319.39*/routes/*319.45*/.StudyGroupsController.index()),format.raw/*319.75*/("""">Registrace skupiny</a>
                        </li>
                    """)))}),format.raw/*321.22*/("""
                    """),_display_(/*322.22*/if(session().get("role").equals("director"))/*322.66*/ {_display_(Seq[Any](format.raw/*322.68*/("""
                        """),format.raw/*323.25*/("""<li>
                            <a href=""""),_display_(/*324.39*/routes/*324.45*/.SemestersController.index()),format.raw/*324.73*/("""">Registrace semestru</a>
                        </li>
                    """)))}),format.raw/*326.22*/("""
                    """),_display_(/*327.22*/if(session().get("role").equals("xxx"))/*327.61*/ {_display_(Seq[Any](format.raw/*327.63*/("""
                        """),format.raw/*328.25*/("""<li>
                            <a href=""""),_display_(/*329.39*/routes/*329.45*/.StudyPlansController.index()),format.raw/*329.74*/("""">Registrace studijního plánu</a>
                        </li>
                    """)))}),format.raw/*331.22*/("""
                    """),_display_(/*332.22*/if(session().get("role").equals("xxx"))/*332.61*/ {_display_(Seq[Any](format.raw/*332.63*/("""
                        """),format.raw/*333.25*/("""<li>
                            <a href=""""),_display_(/*334.39*/routes/*334.45*/.TeachersController.index()),format.raw/*334.72*/("""">Registrace učitele</a>
                        </li>
                    """)))}),format.raw/*336.22*/("""
                    """),_display_(/*337.22*/if(session().get("role").equals("xxx"))/*337.61*/ {_display_(Seq[Any](format.raw/*337.63*/("""
                        """),format.raw/*338.25*/("""<li>
                            <a href=""""),_display_(/*339.39*/routes/*339.45*/.CourseController.index()),format.raw/*339.70*/("""">Registrace kurzu</a>
                        </li>
                    """)))}),format.raw/*341.22*/("""

                """),format.raw/*343.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*345.14*/("""
            """),format.raw/*346.13*/("""</li>
            <li>
            """),_display_(/*348.14*/if(session().get("role").equals("xxx"))/*348.53*/ {_display_(Seq[Any](format.raw/*348.55*/("""
                """),format.raw/*349.17*/("""<a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                """),_display_(/*351.18*/if(session().get("role").equals("director"))/*351.62*/ {_display_(Seq[Any](format.raw/*351.64*/("""
                    """),format.raw/*352.21*/("""<li>
                        <a href=""""),_display_(/*353.35*/routes/*353.41*/.MethodicsController.index()),format.raw/*353.69*/("""">Přidat metodiku</a>
                    </li>
                """)))}),format.raw/*355.18*/("""
                """),format.raw/*356.17*/("""</ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*358.14*/("""
            """),format.raw/*359.13*/("""</li>
            <li>
            """),_display_(/*361.14*/if(session().get("role").equals("xxx"))/*361.53*/ {_display_(Seq[Any](format.raw/*361.55*/("""
                """),format.raw/*362.17*/("""<a href='"""),_display_(/*362.27*/routes/*362.33*/.Application.forms),format.raw/*362.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            """)))}),format.raw/*363.14*/("""
            """),format.raw/*364.13*/("""</li>
            <li>
            """),_display_(/*366.14*/if(session().get("role").equals("xxx"))/*366.53*/ {_display_(Seq[Any](format.raw/*366.55*/("""
                """),format.raw/*367.17*/("""<a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*370.35*/routes/*370.41*/.UiElements.panelsAndWells),format.raw/*370.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*373.35*/routes/*373.41*/.UiElements.buttons),format.raw/*373.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*376.35*/routes/*376.41*/.UiElements.notifications),format.raw/*376.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*379.35*/routes/*379.41*/.UiElements.typography),format.raw/*379.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*382.35*/routes/*382.41*/.UiElements.icons),format.raw/*382.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*385.35*/routes/*385.41*/.UiElements.grid),format.raw/*385.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            """)))}),format.raw/*389.14*/("""
            """),format.raw/*390.13*/("""</li>
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
                  DATE: Thu May 18 00:13:26 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 83bae130488a8f1a0ad1d86df46d2dba53aabd2f
                  MATRIX: 742->1|838->3|865->4|1075->188|1089->194|1131->216|1504->562|1519->568|1568->596|1657->658|1672->664|1724->695|1815->759|1830->765|1883->797|1976->863|1991->869|2050->907|2129->959|2144->965|2212->1012|2295->1068|2310->1074|2396->1138|2525->1240|2540->1246|2643->1327|2859->1516|2952->1600|2993->1602|3038->1619|3233->1787|3327->1871|3368->1873|3421->1898|3491->1941|3506->1947|3569->1989|3667->2056|3716->2078|3810->2162|3851->2164|3904->2189|3974->2232|3989->2238|4052->2280|4150->2347|4199->2369|4293->2453|4334->2455|4387->2480|4457->2523|4472->2529|4534->2570|4631->2636|4680->2658|4774->2742|4815->2744|4868->2769|4938->2812|4953->2818|5002->2846|5114->2927|5163->2949|5257->3033|5298->3035|5351->3060|5421->3103|5436->3109|5493->3145|5607->3228|5656->3250|5750->3334|5791->3336|5844->3361|5914->3404|5929->3410|6017->3476|6153->3581|6202->3603|6296->3687|6337->3689|6390->3714|6460->3757|6475->3763|6529->3796|6693->3929|6742->3951|6836->4035|6877->4037|6930->4062|7000->4105|7015->4111|7065->4140|7227->4271|7276->4293|7370->4377|7411->4379|7464->4404|7534->4447|7549->4453|7595->4478|7770->4622|7819->4644|7913->4728|7954->4730|8007->4755|8077->4798|8092->4804|8146->4837|8314->4974|8363->4996|8451->5074|8492->5076|8545->5101|8615->5144|8630->5150|8686->5185|8854->5322|8903->5344|8997->5428|9038->5430|9091->5455|9161->5498|9176->5504|9264->5570|9433->5708|9484->5731|9579->5815|9621->5817|9675->5842|9746->5885|9762->5891|9828->5935|10018->6093|10068->6115|10157->6193|10199->6195|10253->6220|10324->6263|10340->6269|10391->6298|10557->6432|10607->6454|10702->6538|10744->6540|10798->6565|10869->6608|10885->6614|10940->6647|11110->6785|11160->6807|11255->6891|11297->6893|11351->6918|11422->6961|11438->6967|11498->7005|11670->7145|11720->7167|11815->7251|11857->7253|11911->7278|11982->7321|11998->7327|12051->7358|12213->7488|12263->7510|12358->7594|12400->7596|12454->7621|12525->7664|12541->7670|12595->7702|12762->7837|12812->7859|12901->7937|12943->7939|12997->7964|13068->8007|13084->8013|13137->8044|13302->8177|13352->8199|13447->8283|13489->8285|13543->8310|13614->8353|13630->8359|13686->8393|13858->8533|13908->8555|14003->8639|14045->8641|14099->8666|14170->8709|14186->8715|14240->8747|14404->8879|14454->8901|14549->8985|14591->8987|14645->9012|14716->9055|14732->9061|14785->9092|14949->9224|14999->9246|15094->9330|15136->9332|15190->9357|15261->9400|15277->9406|15335->9442|15496->9571|15546->9593|15641->9677|15683->9679|15737->9704|15808->9747|15824->9753|15876->9783|16005->9880|16055->9902|16144->9980|16186->9982|16240->10007|16311->10050|16327->10056|16388->10095|16561->10236|16611->10258|16700->10336|16742->10338|16796->10363|16867->10406|16883->10412|16963->10469|17152->10626|17202->10648|17297->10732|17339->10734|17393->10759|17464->10802|17480->10808|17529->10835|17656->10930|17706->10952|17801->11036|17843->11038|17897->11063|17968->11106|17984->11112|18039->11145|18201->11275|18251->11297|18346->11381|18388->11383|18442->11408|18513->11451|18529->11457|18586->11492|18751->11625|18801->11647|18896->11731|18938->11733|18992->11758|19063->11801|19079->11807|19139->11845|19312->11986|19358->12003|19457->12070|19499->12083|19563->12119|19657->12203|19699->12205|19745->12222|19942->12391|20037->12475|20079->12477|20133->12502|20204->12545|20220->12551|20270->12579|20369->12646|20419->12668|20468->12707|20509->12709|20563->12734|20634->12777|20650->12783|20703->12814|20808->12887|20858->12909|20907->12948|20948->12950|21002->12975|21073->13018|21089->13024|21123->13036|21223->13104|21273->13126|21322->13165|21363->13167|21417->13192|21488->13235|21504->13241|21544->13259|21637->13320|21687->13342|21736->13381|21777->13383|21831->13408|21902->13451|21918->13457|21958->13475|22056->13541|22106->13563|22155->13602|22196->13604|22250->13629|22321->13672|22337->13678|22381->13700|22475->13762|22525->13784|22579->13828|22620->13830|22674->13855|22745->13898|22761->13904|22821->13942|22936->14025|22986->14047|23040->14091|23081->14093|23135->14118|23206->14161|23222->14167|23269->14192|23377->14268|23427->14290|23481->14334|23522->14336|23576->14361|23647->14404|23663->14410|23711->14436|23820->14513|23870->14535|23924->14579|23965->14581|24019->14606|24090->14649|24106->14655|24156->14683|24263->14758|24313->14780|24367->14824|24408->14826|24462->14851|24533->14894|24549->14900|24602->14931|24712->15009|24762->15031|24816->15075|24857->15077|24911->15102|24982->15145|24998->15151|25058->15189|25179->15278|25229->15300|25283->15344|25324->15346|25378->15371|25449->15414|25465->15420|25537->15470|25685->15586|25735->15608|25789->15652|25830->15654|25884->15679|25955->15722|25971->15728|26022->15757|26138->15841|26188->15863|26242->15907|26283->15909|26337->15934|26408->15977|26424->15983|26476->16013|26581->16086|26631->16108|26680->16147|26721->16149|26775->16174|26846->16217|26862->16223|26904->16243|26998->16305|27048->16327|27102->16371|27143->16373|27197->16398|27268->16441|27284->16447|27331->16472|27437->16546|27487->16568|27541->16612|27582->16614|27636->16639|27707->16682|27723->16688|27773->16716|27885->16796|27936->16819|27985->16858|28026->16860|28080->16885|28151->16928|28167->16934|28215->16960|28324->17037|28375->17060|28429->17104|28470->17106|28524->17131|28595->17174|28611->17180|28664->17211|28770->17285|28820->17307|28874->17351|28915->17353|28969->17378|29040->17421|29056->17427|29108->17457|29216->17533|29266->17555|29320->17599|29361->17601|29415->17626|29486->17669|29502->17675|29552->17703|29661->17780|29711->17802|29760->17841|29801->17843|29855->17868|29926->17911|29942->17917|29993->17946|30110->18031|30160->18053|30209->18092|30250->18094|30304->18119|30375->18162|30391->18168|30440->18195|30548->18271|30598->18293|30647->18332|30688->18334|30742->18359|30813->18402|30829->18408|30876->18433|30982->18507|31029->18525|31128->18592|31170->18605|31234->18641|31283->18680|31324->18682|31370->18699|31556->18857|31610->18901|31651->18903|31701->18924|31768->18963|31784->18969|31834->18997|31931->19062|31977->19079|32076->19146|32118->19159|32182->19195|32231->19234|32272->19236|32318->19253|32356->19263|32372->19269|32412->19287|32506->19349|32548->19362|32612->19398|32661->19437|32702->19439|32748->19456|32975->19655|32991->19661|33039->19687|33175->19795|33191->19801|33232->19820|33359->19919|33375->19925|33422->19950|33555->20055|33571->20061|33615->20083|33745->20185|33761->20191|33800->20208|33926->20306|33942->20312|33980->20328|34132->20448|34174->20461
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|60->29|60->29|60->29|61->30|63->32|63->32|63->32|64->33|65->34|65->34|65->34|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|72->41|73->42|73->42|73->42|74->43|75->44|75->44|75->44|77->46|78->47|78->47|78->47|79->48|80->49|80->49|80->49|82->51|83->52|83->52|83->52|84->53|85->54|85->54|85->54|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|93->62|94->63|94->63|94->63|95->64|96->65|96->65|96->65|99->68|100->69|100->69|100->69|101->70|102->71|102->71|102->71|105->74|106->75|106->75|106->75|107->76|108->77|108->77|108->77|111->80|112->81|112->81|112->81|113->82|114->83|114->83|114->83|117->86|118->87|118->87|118->87|119->88|120->89|120->89|120->89|123->92|124->93|124->93|124->93|125->94|126->95|126->95|126->95|129->98|131->100|131->100|131->100|132->101|133->102|133->102|133->102|136->105|137->106|137->106|137->106|138->107|139->108|139->108|139->108|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|148->117|149->118|149->118|149->118|150->119|151->120|151->120|151->120|154->123|155->124|155->124|155->124|156->125|157->126|157->126|157->126|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|166->135|167->136|167->136|167->136|168->137|169->138|169->138|169->138|172->141|173->142|173->142|173->142|174->143|175->144|175->144|175->144|178->147|179->148|179->148|179->148|180->149|181->150|181->150|181->150|184->153|185->154|185->154|185->154|186->155|187->156|187->156|187->156|190->159|191->160|191->160|191->160|192->161|193->162|193->162|193->162|196->165|197->166|197->166|197->166|198->167|199->168|199->168|199->168|201->170|202->171|202->171|202->171|203->172|204->173|204->173|204->173|207->176|208->177|208->177|208->177|209->178|210->179|210->179|210->179|213->182|214->183|214->183|214->183|215->184|216->185|216->185|216->185|218->187|219->188|219->188|219->188|220->189|221->190|221->190|221->190|224->193|225->194|225->194|225->194|226->195|227->196|227->196|227->196|230->199|231->200|231->200|231->200|232->201|233->202|233->202|233->202|236->205|237->206|239->208|240->209|242->211|242->211|242->211|243->212|245->214|245->214|245->214|246->215|247->216|247->216|247->216|249->218|250->219|250->219|250->219|251->220|252->221|252->221|252->221|254->223|255->224|255->224|255->224|256->225|257->226|257->226|257->226|259->228|260->229|260->229|260->229|261->230|262->231|262->231|262->231|264->233|265->234|265->234|265->234|266->235|267->236|267->236|267->236|269->238|270->239|270->239|270->239|271->240|272->241|272->241|272->241|274->243|275->244|275->244|275->244|276->245|277->246|277->246|277->246|279->248|280->249|280->249|280->249|281->250|282->251|282->251|282->251|284->253|285->254|285->254|285->254|286->255|287->256|287->256|287->256|289->258|290->259|290->259|290->259|291->260|292->261|292->261|292->261|294->263|295->264|295->264|295->264|296->265|297->266|297->266|297->266|299->268|300->269|300->269|300->269|301->270|302->271|302->271|302->271|304->273|305->274|305->274|305->274|306->275|307->276|307->276|307->276|310->279|311->280|311->280|311->280|312->281|313->282|313->282|313->282|315->284|316->285|316->285|316->285|317->286|318->287|318->287|318->287|320->289|321->290|321->290|321->290|322->291|323->292|323->292|323->292|325->294|326->295|326->295|326->295|327->296|328->297|328->297|328->297|330->299|331->300|331->300|331->300|332->301|333->302|333->302|333->302|335->304|337->306|337->306|337->306|338->307|339->308|339->308|339->308|341->310|343->312|343->312|343->312|344->313|345->314|345->314|345->314|347->316|348->317|348->317|348->317|349->318|350->319|350->319|350->319|352->321|353->322|353->322|353->322|354->323|355->324|355->324|355->324|357->326|358->327|358->327|358->327|359->328|360->329|360->329|360->329|362->331|363->332|363->332|363->332|364->333|365->334|365->334|365->334|367->336|368->337|368->337|368->337|369->338|370->339|370->339|370->339|372->341|374->343|376->345|377->346|379->348|379->348|379->348|380->349|382->351|382->351|382->351|383->352|384->353|384->353|384->353|386->355|387->356|389->358|390->359|392->361|392->361|392->361|393->362|393->362|393->362|393->362|394->363|395->364|397->366|397->366|397->366|398->367|401->370|401->370|401->370|404->373|404->373|404->373|407->376|407->376|407->376|410->379|410->379|410->379|413->382|413->382|413->382|416->385|416->385|416->385|420->389|421->390
                  -- GENERATED --
              */
          