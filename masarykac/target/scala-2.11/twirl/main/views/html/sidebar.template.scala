
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
                <a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*27.35*/routes/*27.41*/.Charts.flot),format.raw/*27.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*30.35*/routes/*30.41*/.Charts.morris),format.raw/*30.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i> Tabulky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*39.35*/routes/*39.41*/.Application.tables),format.raw/*39.60*/("""'><i class="fa fa-table fa-fw"></i> Tables</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*42.35*/routes/*42.41*/.Application.workers),format.raw/*42.61*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*48.27*/routes/*48.33*/.Application.forms),format.raw/*48.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*54.35*/routes/*54.41*/.UiElements.panelsAndWells),format.raw/*54.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*57.35*/routes/*57.41*/.UiElements.buttons),format.raw/*57.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*60.35*/routes/*60.41*/.UiElements.notifications),format.raw/*60.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*63.35*/routes/*63.41*/.UiElements.typography),format.raw/*63.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*66.35*/routes/*66.41*/.UiElements.icons),format.raw/*66.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*69.35*/routes/*69.41*/.UiElements.grid),format.raw/*69.57*/("""">Grid</a>
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
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Sample Pages<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*109.35*/routes/*109.41*/.Pages.blank),format.raw/*109.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*112.35*/routes/*112.41*/.Application.pdf()),format.raw/*112.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*115.35*/routes/*115.41*/.Application.roles()),format.raw/*115.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*118.35*/routes/*118.41*/.PersonController.index()),format.raw/*118.66*/("""">Registrace osoby</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*128.35*/routes/*128.41*/.MethodicsController.index()),format.raw/*128.69*/("""">Přidat metodiku</a>
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
                  DATE: Sun Feb 12 17:54:42 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 8b5cd7db11977e28bae01a82e04c30c4e7e0421c
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2052->1107|2067->1113|2100->1125|2230->1228|2245->1234|2280->1248|2674->1615|2689->1621|2729->1640|2888->1772|2903->1778|2944->1798|3179->2006|3194->2012|3233->2030|3559->2329|3574->2335|3621->2361|3756->2469|3771->2475|3811->2494|3937->2593|3952->2599|3998->2624|4130->2729|4145->2735|4188->2757|4317->2859|4332->2865|4370->2882|4495->2980|4510->2986|4547->3002|6253->4680|6269->4686|6303->4698|6433->4800|6449->4806|6489->4824|6612->4919|6628->4925|6670->4945|6794->5041|6810->5047|6857->5072|7256->5443|7272->5449|7322->5477
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|58->27|58->27|58->27|61->30|61->30|61->30|70->39|70->39|70->39|73->42|73->42|73->42|79->48|79->48|79->48|85->54|85->54|85->54|88->57|88->57|88->57|91->60|91->60|91->60|94->63|94->63|94->63|97->66|97->66|97->66|100->69|100->69|100->69|140->109|140->109|140->109|143->112|143->112|143->112|146->115|146->115|146->115|149->118|149->118|149->118|159->128|159->128|159->128
                  -- GENERATED --
              */
          