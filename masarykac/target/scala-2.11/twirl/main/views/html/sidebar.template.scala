
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
                <a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">

                    <li>
                        <a href='"""),_display_(/*27.35*/routes/*27.41*/.Application.workers()),format.raw/*27.63*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.Pages.blank),format.raw/*36.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*39.35*/routes/*39.41*/.Application.pdf()),format.raw/*39.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*42.35*/routes/*42.41*/.Application.kpiChoosePerson()),format.raw/*42.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*45.35*/routes/*45.41*/.Application.roles()),format.raw/*45.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*48.35*/routes/*48.41*/.PersonController.index()),format.raw/*48.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*51.35*/routes/*51.41*/.EmployeesController.index()),format.raw/*51.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*55.35*/routes/*55.41*/.SubjectController.index()),format.raw/*55.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.FieldOfStudyController.index()),format.raw/*59.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*63.35*/routes/*63.41*/.StudyGroupsController.index()),format.raw/*63.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.SemestersController.index()),format.raw/*67.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*71.35*/routes/*71.41*/.StudyPlansController.index()),format.raw/*71.70*/("""">Registrace studijního plánu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*81.35*/routes/*81.41*/.MethodicsController.index()),format.raw/*81.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*87.27*/routes/*87.33*/.Application.forms),format.raw/*87.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*93.35*/routes/*93.41*/.UiElements.panelsAndWells),format.raw/*93.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*96.35*/routes/*96.41*/.UiElements.buttons),format.raw/*96.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*99.35*/routes/*99.41*/.UiElements.notifications),format.raw/*99.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*102.35*/routes/*102.41*/.UiElements.typography),format.raw/*102.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.UiElements.icons),format.raw/*105.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.UiElements.grid),format.raw/*108.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*150.35*/routes/*150.41*/.Charts.flot),format.raw/*150.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*153.35*/routes/*153.41*/.Charts.morris),format.raw/*153.55*/("""'>Morris.js Charts</a>
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
                  DATE: Thu Mar 16 16:49:47 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: d472af5fb26b42dd6e15ec5ffafa28d8e5b9f52b
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2011->1066|2026->1072|2069->1094|2499->1497|2514->1503|2547->1515|2676->1617|2691->1623|2730->1641|2852->1736|2867->1742|2918->1772|3052->1879|3067->1885|3108->1905|3231->2001|3246->2007|3292->2032|3427->2140|3442->2146|3491->2174|3633->2289|3648->2295|3695->2321|3834->2433|3849->2439|3901->2470|4037->2579|4052->2585|4103->2615|4241->2726|4256->2732|4305->2760|4444->2872|4459->2878|4509->2907|4918->3289|4933->3295|4982->3323|5188->3502|5203->3508|5242->3526|5568->3825|5583->3831|5630->3857|5765->3965|5780->3971|5820->3990|5946->4089|5961->4095|6007->4120|6140->4225|6156->4231|6200->4253|6330->4355|6346->4361|6385->4378|6511->4476|6527->4482|6565->4498|8306->6211|8322->6217|8356->6229|8487->6332|8503->6338|8539->6352
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|58->27|58->27|58->27|67->36|67->36|67->36|70->39|70->39|70->39|73->42|73->42|73->42|76->45|76->45|76->45|79->48|79->48|79->48|82->51|82->51|82->51|86->55|86->55|86->55|90->59|90->59|90->59|94->63|94->63|94->63|98->67|98->67|98->67|102->71|102->71|102->71|112->81|112->81|112->81|118->87|118->87|118->87|124->93|124->93|124->93|127->96|127->96|127->96|130->99|130->99|130->99|133->102|133->102|133->102|136->105|136->105|136->105|139->108|139->108|139->108|181->150|181->150|181->150|184->153|184->153|184->153
                  -- GENERATED --
              */
          