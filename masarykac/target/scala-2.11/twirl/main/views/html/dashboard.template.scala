
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Member,Long,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Member,idE: Long,idS: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/localScripts/*2.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*4.67*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*5.65*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*6.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*7.2*/("""


"""),_display_(/*10.2*/main(scripts = localScripts)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
    """),format.raw/*11.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Hlavní plocha</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
        <!-- /.row -->
    <div class="row">
        <h4>Rychlý přístup</h4>
        <div class="col-lg-3 col-md-6">
            """),_display_(/*21.14*/if(idS.equals(0))/*21.31*/ {_display_(Seq[Any](format.raw/*21.33*/("""
            """)))}/*22.14*/else/*22.18*/{_display_(Seq[Any](format.raw/*22.19*/("""
                """),format.raw/*23.17*/("""<div class="panel panel-red">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-tasks fa-5x"></i>
                            </div>
                            <div class="col-xs-9 text-right">
                                <div class="huge">13</div>
                                <div>Nový výkaz ke schválení</div>
                            </div>
                        </div>
                    </div>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.StatementController.employeeCheckStatement(idE,idS)),format.raw/*35.89*/("""">
                        <div class="panel-footer">
                            <span class="pull-left">Test</span>
                            <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                            <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            """)))}),format.raw/*43.14*/("""

        """),_display_(/*45.10*/if(session().get("role").equals("director"))/*45.54*/ {_display_(Seq[Any](format.raw/*45.56*/("""
            """),format.raw/*46.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.PersonController.index()),format.raw/*58.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace osoby</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*66.10*/("""
        """),format.raw/*67.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*70.10*/if(session().get("role").equals("director"))/*70.54*/ {_display_(Seq[Any](format.raw/*70.56*/("""
            """),format.raw/*71.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*83.27*/routes/*83.33*/.Application.kpiChoosePerson()),format.raw/*83.63*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">KPI Kalkulace</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*91.10*/("""
        """),format.raw/*92.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*94.10*/if(session().get("role").equals("director"))/*94.54*/ {_display_(Seq[Any](format.raw/*94.56*/("""
            """),format.raw/*95.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*107.27*/routes/*107.33*/.TableController.listPerson()),format.raw/*107.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam pracovníků</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*115.10*/("""
        """),format.raw/*116.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*119.10*/if(session().get("role").equals("director"))/*119.54*/ {_display_(Seq[Any](format.raw/*119.56*/("""
            """),format.raw/*120.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*140.10*/("""
        """),format.raw/*141.9*/("""</div>

    </div>

        <!-- /.row -->
    <div class="row">

        <div class="col-lg-3 col-md-6">
        """),_display_(/*149.10*/if(session().get("role").equals("director"))/*149.54*/ {_display_(Seq[Any](format.raw/*149.56*/("""
            """),format.raw/*150.13*/("""<div class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-3">
                            <i class="fa fa-tasks fa-5x"></i>
                        </div>
                        <div class="col-xs-9 text-right">
                            <div class="huge">Registrace kurzu</div>
                            <div></div>
                        </div>
                    </div>
                </div>
                <a href=""""),_display_(/*162.27*/routes/*162.33*/.CourseController.index()),format.raw/*162.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace kurzu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*170.10*/("""
        """),format.raw/*171.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*173.10*/if(session().get("role").equals("director"))/*173.54*/ {_display_(Seq[Any](format.raw/*173.56*/("""
            """),format.raw/*174.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*186.27*/routes/*186.33*/.StudyPlansController.index()),format.raw/*186.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace studijního plánu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*194.10*/("""
        """),format.raw/*195.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*197.10*/if(session().get("role").equals("director"))/*197.54*/ {_display_(Seq[Any](format.raw/*197.56*/("""
            """),format.raw/*198.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*210.27*/routes/*210.33*/.TableController.listSemesters()),format.raw/*210.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam semestrů</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*218.10*/("""
        """),format.raw/*219.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*222.10*/if(session().get("role").equals("director"))/*222.54*/ {_display_(Seq[Any](format.raw/*222.56*/("""
            """),format.raw/*223.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*243.10*/("""
        """),format.raw/*244.9*/("""</div>

    </div>


        <!-- /.row -->
""")))}),format.raw/*250.2*/("""
"""))
      }
    }
  }

  def render(user:Member,idE:Long,idS:Long): play.twirl.api.HtmlFormat.Appendable = apply(user,idE,idS)

  def f:((Member,Long,Long) => play.twirl.api.HtmlFormat.Appendable) = (user,idE,idS) => apply(user,idE,idS)

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Sat May 06 20:09:45 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: 5ca717a978a0c4b37a6a2eb6b42ad194e6878aee
                  MATRIX: 763->1|875->37|895->49|975->53|1006->58|1084->110|1098->116|1160->158|1216->188|1230->194|1290->234|1346->264|1360->270|1420->310|1472->35|1499->323|1529->327|1566->355|1606->357|1638->362|1959->656|1985->673|2025->675|2058->689|2071->693|2110->694|2155->711|2765->1294|2780->1300|2853->1352|3252->1720|3290->1731|3343->1775|3383->1777|3424->1790|3981->2320|3996->2326|4042->2351|4421->2699|4457->2708|4541->2765|4594->2809|4634->2811|4675->2824|5227->3349|5242->3355|5293->3385|5669->3730|5705->3739|5788->3795|5841->3839|5881->3841|5922->3854|6480->4384|6496->4390|6547->4419|6928->4768|6965->4777|7050->4834|7104->4878|7145->4880|7187->4893|8071->5745|8108->5754|8251->5869|8305->5913|8346->5915|8388->5928|8946->6458|8962->6464|9009->6489|9389->6837|9426->6846|9510->6902|9564->6946|9605->6948|9647->6961|10214->7500|10230->7506|10281->7535|10672->7894|10709->7903|10793->7959|10847->8003|10888->8005|10930->8018|11486->8546|11502->8552|11556->8584|11935->8931|11972->8940|12057->8997|12111->9041|12152->9043|12194->9056|13078->9908|13115->9917|13191->9962
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|43->10|43->10|43->10|44->11|54->21|54->21|54->21|55->22|55->22|55->22|56->23|68->35|68->35|68->35|76->43|78->45|78->45|78->45|79->46|91->58|91->58|91->58|99->66|100->67|103->70|103->70|103->70|104->71|116->83|116->83|116->83|124->91|125->92|127->94|127->94|127->94|128->95|140->107|140->107|140->107|148->115|149->116|152->119|152->119|152->119|153->120|173->140|174->141|182->149|182->149|182->149|183->150|195->162|195->162|195->162|203->170|204->171|206->173|206->173|206->173|207->174|219->186|219->186|219->186|227->194|228->195|230->197|230->197|230->197|231->198|243->210|243->210|243->210|251->218|252->219|255->222|255->222|255->222|256->223|276->243|277->244|283->250
                  -- GENERATED --
              */
          