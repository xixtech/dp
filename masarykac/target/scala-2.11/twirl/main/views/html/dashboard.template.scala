
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Member,Long,Long,List[Statement],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Member,idE: Long,idS: Long,stPage: List[Statement]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/localScripts/*2.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("DataTables/DataTables-1.10.13/js/jquery.dataTables.js")),format.raw/*4.92*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("DataTables/DataTables-1.10.13/js/dataTables.bootstrap.min.js")),format.raw/*5.99*/("""'></script>
""")))};
Seq[Any](format.raw/*1.60*/("""
"""),format.raw/*6.2*/("""


"""),_display_(/*9.2*/main(scripts = localScripts)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
    """),format.raw/*10.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Hlavní plocha</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
        <!-- /.row -->
    <div class="row">
        <h4>Rychlý přístup</h4>
        <div class="col-lg-3 col-md-6">
            """),_display_(/*20.14*/if(stPage.size()!=0)/*20.34*/ {_display_(Seq[Any](format.raw/*20.36*/("""
                """),format.raw/*21.17*/("""<div class="panel panel-red">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-tasks fa-5x"></i>
                            </div>
                            <div class="col-xs-9 text-right">
                                <div class="huge">"""),_display_(/*28.52*/stPage/*28.58*/.size()),format.raw/*28.65*/("""</div>
                                <div>Nový výkaz ke schválení</div>
                            </div>
                        </div>
                    </div>
                    <a href=""""),_display_(/*33.31*/routes/*33.37*/.StatementController.employeeCheckStatement(idE,idS)),format.raw/*33.89*/("""">
                        <div class="panel-footer">
                            <span class="pull-left">Výkaz</span>
                            <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                            <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            """)))}),format.raw/*41.14*/("""

        """),_display_(/*43.10*/if(session().get("role").equals("director"))/*43.54*/ {_display_(Seq[Any](format.raw/*43.56*/("""
            """),format.raw/*44.13*/("""<div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Registrace zaměstnance</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*56.27*/routes/*56.33*/.EmployeesController.index()),format.raw/*56.61*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace zaměstnance</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*64.10*/("""
        """),format.raw/*65.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*67.10*/if(session().get("role").equals("director"))/*67.54*/ {_display_(Seq[Any](format.raw/*67.56*/("""
            """),format.raw/*68.13*/("""<div class="panel panel-yellow">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Seznam zaměstnanců</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*80.27*/routes/*80.33*/.TableController.listEmployees()),format.raw/*80.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam zaměstnanců</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*88.10*/("""
        """),format.raw/*89.9*/("""</div>
    </div>

        <!-- /.row -->
    <div class="row">

        <div class="col-lg-3 col-md-6">
        """),_display_(/*96.10*/if(session().get("role").equals("director"))/*96.54*/ {_display_(Seq[Any](format.raw/*96.56*/("""
            """),format.raw/*97.13*/("""<div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Registrace předmětu</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*109.27*/routes/*109.33*/.SubjectPlanTeachingController.index()),format.raw/*109.71*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace kurzu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*117.10*/("""
        """),format.raw/*118.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*120.10*/if(session().get("role").equals("director"))/*120.54*/ {_display_(Seq[Any](format.raw/*120.56*/("""
            """),format.raw/*121.13*/("""<div class="panel panel-green">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Registrace studijního plánu</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*133.27*/routes/*133.33*/.StudyPlansController.index()),format.raw/*133.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace studijního plánu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*141.10*/("""
        """),format.raw/*142.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*144.10*/if(session().get("role").equals("director"))/*144.54*/ {_display_(Seq[Any](format.raw/*144.56*/("""
            """),format.raw/*145.13*/("""<div class="panel panel-yellow">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Seznam semestrů</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*157.27*/routes/*157.33*/.TableController.listSemesters()),format.raw/*157.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam semestrů</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*165.10*/("""
        """),format.raw/*166.9*/("""</div>
    </div>


        <!-- /.row -->
""")))}),format.raw/*171.2*/("""
"""))
      }
    }
  }

  def render(user:Member,idE:Long,idS:Long,stPage:List[Statement]): play.twirl.api.HtmlFormat.Appendable = apply(user,idE,idS,stPage)

  def f:((Member,Long,Long,List[Statement]) => play.twirl.api.HtmlFormat.Appendable) = (user,idE,idS,stPage) => apply(user,idE,idS,stPage)

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Mon May 15 11:25:49 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: c085a9e60cc2bb36a538384b57125e52a45bb022
                  MATRIX: 779->1|915->61|935->73|1015->77|1046->82|1124->134|1138->140|1225->207|1281->237|1295->243|1389->317|1441->59|1468->330|1497->334|1533->362|1572->364|1604->369|1925->663|1954->683|1994->685|2039->702|2451->1087|2466->1093|2494->1100|2718->1297|2733->1303|2806->1355|3206->1724|3244->1735|3297->1779|3337->1781|3378->1794|3941->2330|3956->2336|4005->2364|4390->2718|4426->2727|4509->2783|4562->2827|4602->2829|4643->2842|5201->3373|5216->3379|5269->3411|5650->3761|5686->3770|5827->3884|5880->3928|5920->3930|5961->3943|6522->4476|6538->4482|6598->4520|6978->4868|7015->4877|7099->4933|7153->4977|7194->4979|7236->4992|7803->5531|7819->5537|7870->5566|8261->5925|8298->5934|8382->5990|8436->6034|8477->6036|8519->6049|9075->6577|9091->6583|9145->6615|9524->6962|9561->6971|9636->7015
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|38->1|39->6|42->9|42->9|42->9|43->10|53->20|53->20|53->20|54->21|61->28|61->28|61->28|66->33|66->33|66->33|74->41|76->43|76->43|76->43|77->44|89->56|89->56|89->56|97->64|98->65|100->67|100->67|100->67|101->68|113->80|113->80|113->80|121->88|122->89|129->96|129->96|129->96|130->97|142->109|142->109|142->109|150->117|151->118|153->120|153->120|153->120|154->121|166->133|166->133|166->133|174->141|175->142|177->144|177->144|177->144|178->145|190->157|190->157|190->157|198->165|199->166|204->171
                  -- GENERATED --
              */
          