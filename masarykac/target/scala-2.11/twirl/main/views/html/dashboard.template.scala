
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
                """),format.raw/*22.17*/("""<div class="panel panel-red">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-xs-3">
                                <i class="fa fa-tasks fa-5x"></i>
                            </div>
                            <div class="col-xs-9 text-right">
                                <div class="huge">"""),_display_(/*29.52*/stPage/*29.58*/.size()),format.raw/*29.65*/("""</div>
                                <div>Nový výkaz ke schválení</div>
                            </div>
                        </div>
                    </div>
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.StatementController.employeeCheckStatement(idE,idS)),format.raw/*34.89*/("""">
                        <div class="panel-footer">
                            <span class="pull-left">Výkaz</span>
                            <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                            <div class="clearfix"></div>
                        </div>
                    </a>
                </div>
            """)))}),format.raw/*42.14*/("""

        """),_display_(/*44.10*/if(session().get("role").equals("director"))/*44.54*/ {_display_(Seq[Any](format.raw/*44.56*/("""
            """),format.raw/*45.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*57.27*/routes/*57.33*/.EmployeesController.index()),format.raw/*57.61*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace zaměstnance</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*65.10*/("""
        """),format.raw/*66.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*68.10*/if(session().get("role").equals("director"))/*68.54*/ {_display_(Seq[Any](format.raw/*68.56*/("""
            """),format.raw/*69.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*81.27*/routes/*81.33*/.TableController.listEmployees()),format.raw/*81.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam zaměstnanců</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*89.10*/("""
        """),format.raw/*90.9*/("""</div>
    </div>

        <!-- /.row -->
    <div class="row">

        <div class="col-lg-3 col-md-6">
        """),_display_(/*97.10*/if(session().get("role").equals("director"))/*97.54*/ {_display_(Seq[Any](format.raw/*97.56*/("""
            """),format.raw/*98.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*110.27*/routes/*110.33*/.SubjectPlanTeachingController.index()),format.raw/*110.71*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace kurzu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*118.10*/("""
        """),format.raw/*119.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*121.10*/if(session().get("role").equals("director"))/*121.54*/ {_display_(Seq[Any](format.raw/*121.56*/("""
            """),format.raw/*122.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*134.27*/routes/*134.33*/.StudyPlansController.index()),format.raw/*134.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace studijního plánu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*142.10*/("""
        """),format.raw/*143.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*145.10*/if(session().get("role").equals("director"))/*145.54*/ {_display_(Seq[Any](format.raw/*145.56*/("""
            """),format.raw/*146.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*158.27*/routes/*158.33*/.TableController.listSemesters()),format.raw/*158.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam semestrů</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*166.10*/("""
        """),format.raw/*167.9*/("""</div>
    </div>


        <!-- /.row -->
""")))}),format.raw/*172.2*/("""
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
                  DATE: Sat May 13 11:42:11 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: 8360e71fd313b5cbc57a4dc7228916548f99531d
                  MATRIX: 779->1|915->61|935->73|1015->77|1046->82|1124->134|1138->140|1200->182|1256->212|1270->218|1330->258|1386->288|1400->294|1460->334|1512->59|1539->347|1569->351|1606->379|1646->381|1678->386|1999->680|2028->700|2068->702|2113->719|2525->1104|2540->1110|2568->1117|2792->1314|2807->1320|2880->1372|3280->1741|3318->1752|3371->1796|3411->1798|3452->1811|4015->2347|4030->2353|4079->2381|4464->2735|4500->2744|4583->2800|4636->2844|4676->2846|4717->2859|5275->3390|5290->3396|5343->3428|5724->3778|5760->3787|5901->3901|5954->3945|5994->3947|6035->3960|6596->4493|6612->4499|6672->4537|7052->4885|7089->4894|7173->4950|7227->4994|7268->4996|7310->5009|7877->5548|7893->5554|7944->5583|8335->5942|8372->5951|8456->6007|8510->6051|8551->6053|8593->6066|9149->6594|9165->6600|9219->6632|9598->6979|9635->6988|9710->7032
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|43->10|43->10|43->10|44->11|54->21|54->21|54->21|55->22|62->29|62->29|62->29|67->34|67->34|67->34|75->42|77->44|77->44|77->44|78->45|90->57|90->57|90->57|98->65|99->66|101->68|101->68|101->68|102->69|114->81|114->81|114->81|122->89|123->90|130->97|130->97|130->97|131->98|143->110|143->110|143->110|151->118|152->119|154->121|154->121|154->121|155->122|167->134|167->134|167->134|175->142|176->143|178->145|178->145|178->145|179->146|191->158|191->158|191->158|199->166|200->167|205->172
                  -- GENERATED --
              */
          