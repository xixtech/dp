
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
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
                    <!-- /input-group -->
            </li>
            <li>
                <a href='"""),_display_(/*17.27*/routes/*17.33*/.Application.dashboard),format.raw/*17.55*/("""'>
                    <i class="fa fa-dashboard fa-fw"></i> Nástěnka
                </a>
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Osobní údaje<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.PersonalStatisticController.index()),format.raw/*25.77*/("""">Zobrazit údaje</a>
                        <a href=""""),_display_(/*26.35*/routes/*26.41*/.StatisticController.index()),format.raw/*26.69*/("""">Zobrazit DCPS</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">


                    <li>
                        <a href='"""),_display_(/*38.35*/routes/*38.41*/.TableController.listPerson()),format.raw/*38.70*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*41.35*/routes/*41.41*/.TableController.listStudyPlans()),format.raw/*41.74*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní plány</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*46.35*/routes/*46.41*/.TableController.listScheduleInWeeks()),format.raw/*46.79*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh v týdnech</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*50.35*/routes/*50.41*/.TableController.listSchedule()),format.raw/*50.72*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*55.35*/routes/*55.41*/.TableController.listEmployees()),format.raw/*55.73*/("""'><i class="fa fa-table fa-fw"></i>
                            Zaměstnanci</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*60.35*/routes/*60.41*/.TableController.listTeachers()),format.raw/*60.72*/("""'><i class="fa fa-table fa-fw"></i> Vyučující</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*63.35*/routes/*63.41*/.TableController.listStudyGroups()),format.raw/*63.75*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní skupiny</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*67.35*/routes/*67.41*/.TableController.listSemesters()),format.raw/*67.73*/("""'><i class="fa fa-table fa-fw"></i> Semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*70.35*/routes/*70.41*/.TableController.listSubjects()),format.raw/*70.72*/("""'><i class="fa fa-table fa-fw"></i> Předměty</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*73.35*/routes/*73.41*/.TableController.listFieldsOfStudy()),format.raw/*73.77*/("""'><i class="fa fa-table fa-fw"></i> Obory</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*76.35*/routes/*76.41*/.TableController.listCourses()),format.raw/*76.71*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*79.35*/routes/*79.41*/.TableController.listCurrentSemesters()),format.raw/*79.80*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*83.35*/routes/*83.41*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*83.98*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry do konce studia</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*87.35*/routes/*87.41*/.TableController.listDays()),format.raw/*87.68*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*96.35*/routes/*96.41*/.Pages.blank),format.raw/*96.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*99.35*/routes/*99.41*/.Application.pdf()),format.raw/*99.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*102.35*/routes/*102.41*/.Application.raw()),format.raw/*102.59*/("""">Dokument</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.TestController.test()),format.raw/*105.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.SubjectPlanTeachingController.index()),format.raw/*108.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*111.35*/routes/*111.41*/.VisitsController.index()),format.raw/*111.66*/("""">Registrace výjezdu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*114.35*/routes/*114.41*/.ProjectController.index()),format.raw/*114.67*/("""">Registrace projektu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*117.35*/routes/*117.41*/.PublicationsController.index()),format.raw/*117.72*/("""">Registrace publikace</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*120.35*/routes/*120.41*/.OrganizationalUnitsController.index()),format.raw/*120.79*/("""">Registrace organizační jednotky</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*123.35*/routes/*123.41*/.OrganizationalUnitsController.indexParticipants()),format.raw/*123.91*/("""">OJ zaměstnanec</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*126.35*/routes/*126.41*/.FinalWorksController.index()),format.raw/*126.70*/("""">Registrace závěrečné práce</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*130.35*/routes/*130.41*/.Application.kpiChoosePerson()),format.raw/*130.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*133.35*/routes/*133.41*/.Application.roles()),format.raw/*133.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*136.35*/routes/*136.41*/.PersonController.index()),format.raw/*136.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*139.35*/routes/*139.41*/.EmployeesController.index()),format.raw/*139.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*143.35*/routes/*143.41*/.SubjectController.index()),format.raw/*143.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*147.35*/routes/*147.41*/.FieldOfStudyController.index()),format.raw/*147.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*151.35*/routes/*151.41*/.StudyGroupsController.index()),format.raw/*151.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*155.35*/routes/*155.41*/.SemestersController.index()),format.raw/*155.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*159.35*/routes/*159.41*/.StudyPlansController.index()),format.raw/*159.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*163.35*/routes/*163.41*/.TeachersController.index()),format.raw/*163.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*167.35*/routes/*167.41*/.CourseController.index()),format.raw/*167.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*177.35*/routes/*177.41*/.MethodicsController.index()),format.raw/*177.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*183.27*/routes/*183.33*/.Application.forms),format.raw/*183.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*189.35*/routes/*189.41*/.UiElements.panelsAndWells),format.raw/*189.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*192.35*/routes/*192.41*/.UiElements.buttons),format.raw/*192.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*195.35*/routes/*195.41*/.UiElements.notifications),format.raw/*195.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*198.35*/routes/*198.41*/.UiElements.typography),format.raw/*198.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*201.35*/routes/*201.41*/.UiElements.icons),format.raw/*201.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*204.35*/routes/*204.41*/.UiElements.grid),format.raw/*204.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*246.35*/routes/*246.41*/.Charts.flot),format.raw/*246.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*249.35*/routes/*249.41*/.Charts.morris),format.raw/*249.55*/("""'>Morris.js Charts</a>
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
                  DATE: Wed Apr 19 00:28:36 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 2b4c703e60b75c108f07608826fcfb9a98badeb9
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2017->1072|2032->1078|2089->1114|2171->1169|2186->1175|2235->1203|2628->1569|2643->1575|2693->1604|2856->1740|2871->1746|2925->1779|3121->1948|3136->1954|3195->1992|3392->2162|3407->2168|3459->2199|3647->2360|3662->2366|3715->2398|3908->2564|3923->2570|3975->2601|4137->2736|4152->2742|4207->2776|4404->2946|4419->2952|4472->2984|4633->3118|4648->3124|4700->3155|4861->3289|4876->3295|4933->3331|5091->3462|5106->3468|5157->3498|5315->3629|5330->3635|5390->3674|5588->3845|5603->3851|5681->3908|5895->4095|5910->4101|5958->4128|6381->4524|6396->4530|6429->4542|6558->4644|6573->4650|6612->4668|6735->4763|6751->4769|6791->4787|6919->4887|6935->4893|6979->4915|7103->5011|7119->5017|7179->5055|7324->5172|7340->5178|7387->5203|7525->5313|7541->5319|7589->5345|7728->5456|7744->5462|7797->5493|7937->5605|7953->5611|8013->5649|8164->5772|8180->5778|8252->5828|8386->5934|8402->5940|8453->5969|8600->6088|8616->6094|8668->6124|8803->6231|8819->6237|8861->6257|8985->6353|9001->6359|9048->6384|9184->6492|9200->6498|9250->6526|9393->6641|9409->6647|9457->6673|9597->6785|9613->6791|9666->6822|9803->6931|9819->6937|9871->6967|10010->7078|10026->7084|10076->7112|10216->7224|10232->7230|10283->7259|10431->7379|10447->7385|10496->7412|10635->7523|10651->7529|10698->7554|11097->7925|11113->7931|11163->7959|11370->8138|11386->8144|11426->8162|11753->8461|11769->8467|11817->8493|11953->8601|11969->8607|12010->8626|12137->8725|12153->8731|12200->8756|12333->8861|12349->8867|12393->8889|12523->8991|12539->8997|12578->9014|12704->9112|12720->9118|12758->9134|14499->10847|14515->10853|14549->10865|14680->10968|14696->10974|14732->10988
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|56->25|56->25|56->25|57->26|57->26|57->26|69->38|69->38|69->38|72->41|72->41|72->41|77->46|77->46|77->46|81->50|81->50|81->50|86->55|86->55|86->55|91->60|91->60|91->60|94->63|94->63|94->63|98->67|98->67|98->67|101->70|101->70|101->70|104->73|104->73|104->73|107->76|107->76|107->76|110->79|110->79|110->79|114->83|114->83|114->83|118->87|118->87|118->87|127->96|127->96|127->96|130->99|130->99|130->99|133->102|133->102|133->102|136->105|136->105|136->105|139->108|139->108|139->108|142->111|142->111|142->111|145->114|145->114|145->114|148->117|148->117|148->117|151->120|151->120|151->120|154->123|154->123|154->123|157->126|157->126|157->126|161->130|161->130|161->130|164->133|164->133|164->133|167->136|167->136|167->136|170->139|170->139|170->139|174->143|174->143|174->143|178->147|178->147|178->147|182->151|182->151|182->151|186->155|186->155|186->155|190->159|190->159|190->159|194->163|194->163|194->163|198->167|198->167|198->167|208->177|208->177|208->177|214->183|214->183|214->183|220->189|220->189|220->189|223->192|223->192|223->192|226->195|226->195|226->195|229->198|229->198|229->198|232->201|232->201|232->201|235->204|235->204|235->204|277->246|277->246|277->246|280->249|280->249|280->249
                  -- GENERATED --
              */
          