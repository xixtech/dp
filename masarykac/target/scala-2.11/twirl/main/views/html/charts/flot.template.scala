
package views.html.charts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object flot_Scope0 {
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

class flot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/localScripts/*2.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<script src='"""),_display_(/*3.19*/routes/*3.25*/.Assets.at("lib/explorercanvas/excanvas.compiled.js")),format.raw/*3.78*/("""'></script>
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("lib/flot/jquery.flot.js")),format.raw/*4.62*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/flot/jquery.flot.pie.js")),format.raw/*5.66*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("lib/flot/jquery.flot.resize.js")),format.raw/*6.69*/("""'></script>
    <script src='"""),_display_(/*7.19*/routes/*7.25*/.Assets.at("lib/flot/jquery.flot.time.js")),format.raw/*7.67*/("""'></script>
    <script src='"""),_display_(/*8.19*/routes/*8.25*/.Assets.at("lib/flot.tooltip/js/jquery.flot.tooltip.min.js")),format.raw/*8.85*/("""'></script>
    <script src='"""),_display_(/*9.19*/routes/*9.25*/.Assets.at("javascripts/flot-data.js")),format.raw/*9.63*/("""'></script>
""")))};
Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/main(scripts = localScripts)/*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
    """),format.raw/*13.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Flot</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Line Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="flot-chart">
                        <div class="flot-chart-content" id="flot-line-chart"></div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Pie Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="flot-chart">
                        <div class="flot-chart-content" id="flot-pie-chart"></div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Multiple Axes Line Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="flot-chart">
                        <div class="flot-chart-content" id="flot-line-chart-multi"></div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Moving Line Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="flot-chart">
                        <div class="flot-chart-content" id="flot-line-chart-moving"></div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Bar Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="flot-chart">
                        <div class="flot-chart-content" id="flot-bar-chart"></div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Flot Charts Usage
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <p>Flot is a pure JavaScript plotting library for jQuery, with a focus on simple usage, attractive looks, and interactive features. In SB Admin, we are using the most recent version of Flot along with a few plugins to enhance the member experience. The Flot plugins being used are the tooltip plugin for hoverable tooltips, and the resize plugin for fully responsive charts. The documentation for Flot Charts is available on their website, <a target="_blank" href="http://www.flotcharts.org/">http://www.flotcharts.org/</a>.</p>
                    <a target="_blank" class="btn btn-default btn-lg btn-block" href="http://www.flotcharts.org/">View Flot Charts Documentation</a>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
    </div>
    <!-- /.row -->

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object flot extends flot_Scope0.flot
              /*
                  -- GENERATED --
                  DATE: Sun Feb 12 17:54:42 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/charts/flot.scala.html
                  HASH: 23f1fa8e25bad063d1a139fe876d99eac566f747
                  MATRIX: 743->1|823->5|843->17|923->21|954->26|994->40|1008->46|1081->99|1137->129|1151->135|1208->172|1264->202|1278->208|1339->249|1395->279|1409->285|1473->329|1529->359|1543->365|1605->407|1661->437|1675->443|1755->503|1811->533|1825->539|1883->577|1934->3|1962->590|1991->593|2028->621|2068->623|2100->628
                  LINES: 27->1|31->2|31->2|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|42->1|43->10|45->12|45->12|45->12|46->13
                  -- GENERATED --
              */
          