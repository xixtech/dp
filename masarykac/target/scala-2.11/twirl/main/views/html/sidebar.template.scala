
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
                        <a href=""""),_display_(/*102.35*/routes/*102.41*/.TestController.test()),format.raw/*102.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.SubjectPlanTeachingController.index()),format.raw/*105.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.VisitsController.index()),format.raw/*108.66*/("""">Registrace výjezdu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*111.35*/routes/*111.41*/.ProjectController.index()),format.raw/*111.67*/("""">Registrace projektu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*114.35*/routes/*114.41*/.PublicationsController.index()),format.raw/*114.72*/("""">Registrace publikace</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*117.35*/routes/*117.41*/.OrganizationalUnitsController.index()),format.raw/*117.79*/("""">Registrace organizační jednotky</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*120.35*/routes/*120.41*/.OrganizationalUnitsController.indexParticipants()),format.raw/*120.91*/("""">OJ zaměstnanec</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*123.35*/routes/*123.41*/.FinalWorksController.index()),format.raw/*123.70*/("""">Registrace závěrečné práce</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*127.35*/routes/*127.41*/.Application.kpiChoosePerson()),format.raw/*127.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*130.35*/routes/*130.41*/.Application.roles()),format.raw/*130.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*133.35*/routes/*133.41*/.PersonController.index()),format.raw/*133.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*136.35*/routes/*136.41*/.EmployeesController.index()),format.raw/*136.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*140.35*/routes/*140.41*/.SubjectController.index()),format.raw/*140.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*144.35*/routes/*144.41*/.FieldOfStudyController.index()),format.raw/*144.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*148.35*/routes/*148.41*/.StudyGroupsController.index()),format.raw/*148.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*152.35*/routes/*152.41*/.SemestersController.index()),format.raw/*152.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*156.35*/routes/*156.41*/.StudyPlansController.index()),format.raw/*156.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*160.35*/routes/*160.41*/.TeachersController.index()),format.raw/*160.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*164.35*/routes/*164.41*/.CourseController.index()),format.raw/*164.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*174.35*/routes/*174.41*/.MethodicsController.index()),format.raw/*174.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*180.27*/routes/*180.33*/.Application.forms),format.raw/*180.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*186.35*/routes/*186.41*/.UiElements.panelsAndWells),format.raw/*186.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*189.35*/routes/*189.41*/.UiElements.buttons),format.raw/*189.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*192.35*/routes/*192.41*/.UiElements.notifications),format.raw/*192.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*195.35*/routes/*195.41*/.UiElements.typography),format.raw/*195.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*198.35*/routes/*198.41*/.UiElements.icons),format.raw/*198.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*201.35*/routes/*201.41*/.UiElements.grid),format.raw/*201.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*243.35*/routes/*243.41*/.Charts.flot),format.raw/*243.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*246.35*/routes/*246.41*/.Charts.morris),format.raw/*246.55*/("""'>Morris.js Charts</a>
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
                  DATE: Sun Apr 09 10:50:46 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 5e2f34806aef7f557bb8ed5207322f95f70699c3
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2017->1072|2032->1078|2089->1114|2171->1169|2186->1175|2235->1203|2628->1569|2643->1575|2693->1604|2856->1740|2871->1746|2925->1779|3121->1948|3136->1954|3195->1992|3392->2162|3407->2168|3459->2199|3647->2360|3662->2366|3715->2398|3908->2564|3923->2570|3975->2601|4137->2736|4152->2742|4207->2776|4404->2946|4419->2952|4472->2984|4633->3118|4648->3124|4700->3155|4861->3289|4876->3295|4933->3331|5091->3462|5106->3468|5157->3498|5315->3629|5330->3635|5390->3674|5588->3845|5603->3851|5681->3908|5895->4095|5910->4101|5958->4128|6381->4524|6396->4530|6429->4542|6558->4644|6573->4650|6612->4668|6735->4763|6751->4769|6795->4791|6919->4887|6935->4893|6995->4931|7140->5048|7156->5054|7203->5079|7341->5189|7357->5195|7405->5221|7544->5332|7560->5338|7613->5369|7753->5481|7769->5487|7829->5525|7980->5648|7996->5654|8068->5704|8202->5810|8218->5816|8269->5845|8416->5964|8432->5970|8484->6000|8619->6107|8635->6113|8677->6133|8801->6229|8817->6235|8864->6260|9000->6368|9016->6374|9066->6402|9209->6517|9225->6523|9273->6549|9413->6661|9429->6667|9482->6698|9619->6807|9635->6813|9687->6843|9826->6954|9842->6960|9892->6988|10032->7100|10048->7106|10099->7135|10247->7255|10263->7261|10312->7288|10451->7399|10467->7405|10514->7430|10913->7801|10929->7807|10979->7835|11186->8014|11202->8020|11242->8038|11569->8337|11585->8343|11633->8369|11769->8477|11785->8483|11826->8502|11953->8601|11969->8607|12016->8632|12149->8737|12165->8743|12209->8765|12339->8867|12355->8873|12394->8890|12520->8988|12536->8994|12574->9010|14315->10723|14331->10729|14365->10741|14496->10844|14512->10850|14548->10864
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|56->25|56->25|56->25|57->26|57->26|57->26|69->38|69->38|69->38|72->41|72->41|72->41|77->46|77->46|77->46|81->50|81->50|81->50|86->55|86->55|86->55|91->60|91->60|91->60|94->63|94->63|94->63|98->67|98->67|98->67|101->70|101->70|101->70|104->73|104->73|104->73|107->76|107->76|107->76|110->79|110->79|110->79|114->83|114->83|114->83|118->87|118->87|118->87|127->96|127->96|127->96|130->99|130->99|130->99|133->102|133->102|133->102|136->105|136->105|136->105|139->108|139->108|139->108|142->111|142->111|142->111|145->114|145->114|145->114|148->117|148->117|148->117|151->120|151->120|151->120|154->123|154->123|154->123|158->127|158->127|158->127|161->130|161->130|161->130|164->133|164->133|164->133|167->136|167->136|167->136|171->140|171->140|171->140|175->144|175->144|175->144|179->148|179->148|179->148|183->152|183->152|183->152|187->156|187->156|187->156|191->160|191->160|191->160|195->164|195->164|195->164|205->174|205->174|205->174|211->180|211->180|211->180|217->186|217->186|217->186|220->189|220->189|220->189|223->192|223->192|223->192|226->195|226->195|226->195|229->198|229->198|229->198|232->201|232->201|232->201|274->243|274->243|274->243|277->246|277->246|277->246
                  -- GENERATED --
              */
          