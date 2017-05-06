
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
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*4.67*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*5.65*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*6.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.60*/("""
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
            """),_display_(/*21.14*/if(stPage.size()!=0)/*21.34*/ {_display_(Seq[Any](format.raw/*21.36*/("""

                """),format.raw/*23.17*/("""<div class="panel panel-red">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-tasks fa-5x"></i>
                            </div>
                            <div class="col-xs-9 text-right">
                                <div class="huge">"""),_display_(/*30.52*/stPage/*30.58*/.size()),format.raw/*30.65*/("""</div>
                                <div>Nový výkaz ke schválení</div>
                            </div>
                        </div>
                    </div>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.StatementController.employeeCheckStatement(idE,idS)),format.raw/*35.89*/("""">
                        <div class="panel-footer">
                            <span class="pull-left">Výkaz</span>
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

  def render(user:Member,idE:Long,idS:Long,stPage:List[Statement]): play.twirl.api.HtmlFormat.Appendable = apply(user,idE,idS,stPage)

  def f:((Member,Long,Long,List[Statement]) => play.twirl.api.HtmlFormat.Appendable) = (user,idE,idS,stPage) => apply(user,idE,idS,stPage)

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Sat May 06 22:02:10 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: 535cec96035f8ea1eb4a012997d9aab716a23a5c
                  MATRIX: 779->1|915->61|935->73|1015->77|1046->82|1124->134|1138->140|1200->182|1256->212|1270->218|1330->258|1386->288|1400->294|1460->334|1512->59|1539->347|1569->351|1606->379|1646->381|1678->386|1999->680|2028->700|2068->702|2114->720|2526->1105|2541->1111|2569->1118|2793->1315|2808->1321|2881->1373|3281->1742|3319->1753|3372->1797|3412->1799|3453->1812|4010->2342|4025->2348|4071->2373|4450->2721|4486->2730|4570->2787|4623->2831|4663->2833|4704->2846|5256->3371|5271->3377|5322->3407|5698->3752|5734->3761|5817->3817|5870->3861|5910->3863|5951->3876|6509->4406|6525->4412|6576->4441|6957->4790|6994->4799|7079->4856|7133->4900|7174->4902|7216->4915|8100->5767|8137->5776|8280->5891|8334->5935|8375->5937|8417->5950|8975->6480|8991->6486|9038->6511|9418->6859|9455->6868|9539->6924|9593->6968|9634->6970|9676->6983|10243->7522|10259->7528|10310->7557|10701->7916|10738->7925|10822->7981|10876->8025|10917->8027|10959->8040|11515->8568|11531->8574|11585->8606|11964->8953|12001->8962|12086->9019|12140->9063|12181->9065|12223->9078|13107->9930|13144->9939|13220->9984
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|43->10|43->10|43->10|44->11|54->21|54->21|54->21|56->23|63->30|63->30|63->30|68->35|68->35|68->35|76->43|78->45|78->45|78->45|79->46|91->58|91->58|91->58|99->66|100->67|103->70|103->70|103->70|104->71|116->83|116->83|116->83|124->91|125->92|127->94|127->94|127->94|128->95|140->107|140->107|140->107|148->115|149->116|152->119|152->119|152->119|153->120|173->140|174->141|182->149|182->149|182->149|183->150|195->162|195->162|195->162|203->170|204->171|206->173|206->173|206->173|207->174|219->186|219->186|219->186|227->194|228->195|230->197|230->197|230->197|231->198|243->210|243->210|243->210|251->218|252->219|255->222|255->222|255->222|256->223|276->243|277->244|283->250
                  -- GENERATED --
              */
          