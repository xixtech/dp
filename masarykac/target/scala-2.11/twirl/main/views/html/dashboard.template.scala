
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/localScripts/*2.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*4.67*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*5.65*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*6.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*7.2*/("""
"""),_display_(/*8.2*/main(scripts = localScripts)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
    """),format.raw/*9.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Nástěnka</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <h4>Rychlý přístup</h4>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Registrace osoby</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*31.27*/routes/*31.33*/.PersonController.index()),format.raw/*31.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace osoby</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-green">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">KPI Kalkulace</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*53.27*/routes/*53.33*/.Application.kpiChoosePerson()),format.raw/*53.63*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">KPI Kalkulace</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="panel panel-yellow">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Seznam pracovníků</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*75.27*/routes/*75.33*/.TableController.listPerson()),format.raw/*75.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam pracovníků</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        </div>

        <div class="col-lg-3 col-md-6">
            <div class="panel panel-red">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">13</div>
                            <div>Test</div>
                        </div>
                    </div>
                </div>
                <a href="#">
                    <div class="panel-footer">
                        <span class="pull-left">Test</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        </div>

    </div>

    <!-- /.row -->



    <!-- /.row -->
""")))}),format.raw/*115.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Fri Mar 17 10:26:28 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: c96e939f4f4c9ab58d2949c20dc3fd1dc740c1f5
                  MATRIX: 746->1|826->5|846->17|926->21|957->26|1035->78|1049->84|1111->126|1167->156|1181->162|1241->202|1297->232|1311->238|1371->278|1422->3|1449->291|1476->293|1512->321|1551->323|1582->328|2419->1138|2434->1144|2480->1169|3438->2100|3453->2106|3504->2136|4464->3069|4479->3075|4529->3104|5881->4425
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|41->8|41->8|41->8|42->9|64->31|64->31|64->31|86->53|86->53|86->53|108->75|108->75|108->75|148->115
                  -- GENERATED --
              */
          