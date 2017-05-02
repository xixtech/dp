
package views.html.charts

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object morris_Scope0 {
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

class morris extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/localScripts/*3.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*5.67*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*6.65*/("""'></script>
    <script src='"""),_display_(/*7.19*/routes/*7.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*7.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*8.2*/("""

"""),_display_(/*10.2*/main(scripts = localScripts)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
    """),format.raw/*11.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Morris.js Charts</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Area Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div id="morris-area-chart"></div>
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
                    <div id="morris-bar-chart"></div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Line Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div id="morris-line-chart"></div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Donut Chart Example
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div id="morris-donut-chart"></div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Morris.js Usage
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <p>Morris.js is a jQuery based charting plugin created by Olly Smith. In SB Admin, we are using the most recent version of Morris.js which includes the resize function, which makes the charts fully responsive. The documentation for Morris.js is available on their website, <a target="_blank" href="http://morrisjs.github.io/morris.js/">http://morrisjs.github.io/morris.js/</a>.</p>
                    <a target="_blank" class="btn btn-default btn-lg btn-block" href="http://morrisjs.github.io/morris.js/">View Morris.js Documentation</a>
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
object morris extends morris_Scope0.morris
              /*
                  -- GENERATED --
                  DATE: Tue May 02 09:47:08 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/charts/morris.scala.html
                  HASH: 9a848fbc654cd9fb3c361178ab18917de09c5e23
                  MATRIX: 747->1|827->6|847->18|927->22|958->27|1036->79|1050->85|1112->127|1168->157|1182->163|1242->203|1298->233|1312->239|1372->279|1423->3|1451->292|1480->295|1517->323|1557->325|1589->330
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|41->8|43->10|43->10|43->10|44->11
                  -- GENERATED --
              */
          