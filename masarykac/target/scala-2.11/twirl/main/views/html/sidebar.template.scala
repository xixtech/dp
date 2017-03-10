
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

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.MethodicsController.index()),format.raw/*58.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*64.27*/routes/*64.33*/.Application.forms),format.raw/*64.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*70.35*/routes/*70.41*/.UiElements.panelsAndWells),format.raw/*70.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*73.35*/routes/*73.41*/.UiElements.buttons),format.raw/*73.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*76.35*/routes/*76.41*/.UiElements.notifications),format.raw/*76.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*79.35*/routes/*79.41*/.UiElements.typography),format.raw/*79.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*82.35*/routes/*82.41*/.UiElements.icons),format.raw/*82.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*85.35*/routes/*85.41*/.UiElements.grid),format.raw/*85.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*127.35*/routes/*127.41*/.Charts.flot),format.raw/*127.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*130.35*/routes/*130.41*/.Charts.morris),format.raw/*130.55*/("""'>Morris.js Charts</a>
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
                  DATE: Fri Mar 10 11:14:05 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 7ff34dcb5494f276f3edcf51b88d2dcf53578b51
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2011->1066|2026->1072|2069->1094|2499->1497|2514->1503|2547->1515|2676->1617|2691->1623|2730->1641|2852->1736|2867->1742|2918->1772|3052->1879|3067->1885|3108->1905|3231->2001|3246->2007|3292->2032|3690->2403|3705->2409|3754->2437|3960->2616|3975->2622|4014->2640|4340->2939|4355->2945|4402->2971|4537->3079|4552->3085|4592->3104|4718->3203|4733->3209|4779->3234|4911->3339|4926->3345|4969->3367|5098->3469|5113->3475|5151->3492|5276->3590|5291->3596|5328->3612|7069->5325|7085->5331|7119->5343|7250->5446|7266->5452|7302->5466
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|58->27|58->27|58->27|67->36|67->36|67->36|70->39|70->39|70->39|73->42|73->42|73->42|76->45|76->45|76->45|79->48|79->48|79->48|89->58|89->58|89->58|95->64|95->64|95->64|101->70|101->70|101->70|104->73|104->73|104->73|107->76|107->76|107->76|110->79|110->79|110->79|113->82|113->82|113->82|116->85|116->85|116->85|158->127|158->127|158->127|161->130|161->130|161->130
                  -- GENERATED --
              */
          