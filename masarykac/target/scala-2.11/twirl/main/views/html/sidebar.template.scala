
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
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">


                    <li>
                        <a href='"""),_display_(/*28.35*/routes/*28.41*/.TableController.listPerson()),format.raw/*28.70*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*31.35*/routes/*31.41*/.TableController.listStudyPlans()),format.raw/*31.74*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní plány</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*36.35*/routes/*36.41*/.TableController.listScheduleInWeeks()),format.raw/*36.79*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh v týdnech</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*40.35*/routes/*40.41*/.TableController.listSchedule()),format.raw/*40.72*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*45.35*/routes/*45.41*/.TableController.listEmployees()),format.raw/*45.73*/("""'><i class="fa fa-table fa-fw"></i>
                            Zaměstnanci</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*50.35*/routes/*50.41*/.TableController.listTeachers()),format.raw/*50.72*/("""'><i class="fa fa-table fa-fw"></i> Vyučující</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*53.35*/routes/*53.41*/.TableController.listStudyGroups()),format.raw/*53.75*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní skupiny</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*57.35*/routes/*57.41*/.TableController.listSemesters()),format.raw/*57.73*/("""'><i class="fa fa-table fa-fw"></i> Semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*60.35*/routes/*60.41*/.TableController.listSubjects()),format.raw/*60.72*/("""'><i class="fa fa-table fa-fw"></i> Předměty</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*63.35*/routes/*63.41*/.TableController.listFieldsOfStudy()),format.raw/*63.77*/("""'><i class="fa fa-table fa-fw"></i> Obory</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*66.35*/routes/*66.41*/.TableController.listCourses()),format.raw/*66.71*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*69.35*/routes/*69.41*/.TableController.listCurrentSemesters()),format.raw/*69.80*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*73.35*/routes/*73.41*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*73.98*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry do konce studia</a>
                    </li>
                    """),_display_(/*76.22*/if(session().get("role").equals("empxxxloyee"))/*76.69*/{_display_(Seq[Any](format.raw/*76.70*/("""
                    """),format.raw/*77.21*/("""<li>
                        <a href='"""),_display_(/*78.35*/routes/*78.41*/.TableController.listDays()),format.raw/*78.68*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                    </li>
                    """)))}),format.raw/*80.22*/("""
                """),format.raw/*81.17*/("""</ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*88.35*/routes/*88.41*/.Pages.blank),format.raw/*88.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*91.35*/routes/*91.41*/.Application.pdf()),format.raw/*91.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*94.35*/routes/*94.41*/.Application.raw()),format.raw/*94.59*/("""">Dokument</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*97.35*/routes/*97.41*/.TestController.test()),format.raw/*97.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*100.35*/routes/*100.41*/.SubjectPlanTeachingController.index()),format.raw/*100.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*103.35*/routes/*103.41*/.VisitsController.index()),format.raw/*103.66*/("""">Registrace výjezdu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*106.35*/routes/*106.41*/.ProjectController.index()),format.raw/*106.67*/("""">Registrace projektu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*109.35*/routes/*109.41*/.PublicationsController.index()),format.raw/*109.72*/("""">Registrace publikace</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*112.35*/routes/*112.41*/.OrganizationalUnitsController.index()),format.raw/*112.79*/("""">Registrace organizační jednotky</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*115.35*/routes/*115.41*/.OrganizationalUnitsController.indexParticipants()),format.raw/*115.91*/("""">OJ zaměstnanec</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*118.35*/routes/*118.41*/.FinalWorksController.index()),format.raw/*118.70*/("""">Registrace závěrečné práce</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*122.35*/routes/*122.41*/.Application.kpiChoosePerson()),format.raw/*122.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*125.35*/routes/*125.41*/.Application.roles()),format.raw/*125.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*128.35*/routes/*128.41*/.PersonController.index()),format.raw/*128.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*131.35*/routes/*131.41*/.EmployeesController.index()),format.raw/*131.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*135.35*/routes/*135.41*/.SubjectController.index()),format.raw/*135.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*139.35*/routes/*139.41*/.FieldOfStudyController.index()),format.raw/*139.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*143.35*/routes/*143.41*/.StudyGroupsController.index()),format.raw/*143.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*147.35*/routes/*147.41*/.SemestersController.index()),format.raw/*147.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*151.35*/routes/*151.41*/.StudyPlansController.index()),format.raw/*151.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*155.35*/routes/*155.41*/.TeachersController.index()),format.raw/*155.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*159.35*/routes/*159.41*/.CourseController.index()),format.raw/*159.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*169.35*/routes/*169.41*/.MethodicsController.index()),format.raw/*169.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*175.27*/routes/*175.33*/.Application.forms),format.raw/*175.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*181.35*/routes/*181.41*/.UiElements.panelsAndWells),format.raw/*181.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*184.35*/routes/*184.41*/.UiElements.buttons),format.raw/*184.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*187.35*/routes/*187.41*/.UiElements.notifications),format.raw/*187.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*190.35*/routes/*190.41*/.UiElements.typography),format.raw/*190.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*193.35*/routes/*193.41*/.UiElements.icons),format.raw/*193.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*196.35*/routes/*196.41*/.UiElements.grid),format.raw/*196.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-sitemap fa-fw"></i>
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
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*238.35*/routes/*238.41*/.Charts.flot),format.raw/*238.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*241.35*/routes/*241.41*/.Charts.morris),format.raw/*241.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

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
                  DATE: Fri Apr 21 13:58:36 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: ab66af318976fd18291418f7cb1242237c3c7d70
                  MATRIX: 742->1|838->3|865->4|1076->189|1090->195|1132->217|1505->563|1520->569|1577->605|1659->660|1674->666|1723->694|2116->1060|2131->1066|2181->1095|2344->1231|2359->1237|2413->1270|2609->1439|2624->1445|2683->1483|2880->1653|2895->1659|2947->1690|3135->1851|3150->1857|3203->1889|3396->2055|3411->2061|3463->2092|3625->2227|3640->2233|3695->2267|3892->2437|3907->2443|3960->2475|4121->2609|4136->2615|4188->2646|4349->2780|4364->2786|4421->2822|4579->2953|4594->2959|4645->2989|4803->3120|4818->3126|4878->3165|5076->3336|5091->3342|5169->3399|5345->3548|5401->3595|5440->3596|5489->3617|5555->3656|5570->3662|5618->3689|5740->3780|5785->3797|6122->4107|6137->4113|6170->4125|6299->4227|6314->4233|6353->4251|6475->4346|6490->4352|6529->4370|6656->4470|6671->4476|6714->4498|6838->4594|6854->4600|6914->4638|7059->4755|7075->4761|7122->4786|7260->4896|7276->4902|7324->4928|7463->5039|7479->5045|7532->5076|7672->5188|7688->5194|7748->5232|7899->5355|7915->5361|7987->5411|8121->5517|8137->5523|8188->5552|8335->5671|8351->5677|8403->5707|8538->5814|8554->5820|8596->5840|8720->5936|8736->5942|8783->5967|8919->6075|8935->6081|8985->6109|9128->6224|9144->6230|9192->6256|9332->6368|9348->6374|9401->6405|9538->6514|9554->6520|9606->6550|9745->6661|9761->6667|9811->6695|9951->6807|9967->6813|10018->6842|10166->6962|10182->6968|10231->6995|10370->7106|10386->7112|10433->7137|10832->7508|10848->7514|10898->7542|11105->7721|11121->7727|11161->7745|11488->8044|11504->8050|11552->8076|11688->8184|11704->8190|11745->8209|11872->8308|11888->8314|11935->8339|12068->8444|12084->8450|12128->8472|12258->8574|12274->8580|12313->8597|12439->8695|12455->8701|12493->8717|14234->10430|14250->10436|14284->10448|14415->10551|14431->10557|14467->10571
                  LINES: 27->1|32->1|33->2|38->7|38->7|38->7|46->15|46->15|46->15|47->16|47->16|47->16|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|71->40|71->40|71->40|76->45|76->45|76->45|81->50|81->50|81->50|84->53|84->53|84->53|88->57|88->57|88->57|91->60|91->60|91->60|94->63|94->63|94->63|97->66|97->66|97->66|100->69|100->69|100->69|104->73|104->73|104->73|107->76|107->76|107->76|108->77|109->78|109->78|109->78|111->80|112->81|119->88|119->88|119->88|122->91|122->91|122->91|125->94|125->94|125->94|128->97|128->97|128->97|131->100|131->100|131->100|134->103|134->103|134->103|137->106|137->106|137->106|140->109|140->109|140->109|143->112|143->112|143->112|146->115|146->115|146->115|149->118|149->118|149->118|153->122|153->122|153->122|156->125|156->125|156->125|159->128|159->128|159->128|162->131|162->131|162->131|166->135|166->135|166->135|170->139|170->139|170->139|174->143|174->143|174->143|178->147|178->147|178->147|182->151|182->151|182->151|186->155|186->155|186->155|190->159|190->159|190->159|200->169|200->169|200->169|206->175|206->175|206->175|212->181|212->181|212->181|215->184|215->184|215->184|218->187|218->187|218->187|221->190|221->190|221->190|224->193|224->193|224->193|227->196|227->196|227->196|269->238|269->238|269->238|272->241|272->241|272->241
                  -- GENERATED --
              */
          