
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/localScripts/*2.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.18*/("""
    """),format.raw/*3.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*4.19*/routes/*4.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*4.67*/("""'></script>
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*5.65*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*6.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.16*/("""
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
        """),_display_(/*21.10*/if(session().get("role").equals("director"))/*21.54*/ {_display_(Seq[Any](format.raw/*21.56*/("""
            """),format.raw/*22.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.PersonController.index()),format.raw/*34.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace osoby</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*42.10*/("""
        """),format.raw/*43.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*46.10*/if(session().get("role").equals("director"))/*46.54*/ {_display_(Seq[Any](format.raw/*46.56*/("""
            """),format.raw/*47.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*59.27*/routes/*59.33*/.Application.kpiChoosePerson()),format.raw/*59.63*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">KPI Kalkulace</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*67.10*/("""
        """),format.raw/*68.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*70.10*/if(session().get("role").equals("director"))/*70.54*/ {_display_(Seq[Any](format.raw/*70.56*/("""
            """),format.raw/*71.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*83.27*/routes/*83.33*/.TableController.listPerson()),format.raw/*83.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam pracovníků</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*91.10*/("""
        """),format.raw/*92.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*95.10*/if(session().get("role").equals("director"))/*95.54*/ {_display_(Seq[Any](format.raw/*95.56*/("""
            """),format.raw/*96.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*116.10*/("""
        """),format.raw/*117.9*/("""</div>

    </div>

        <!-- /.row -->
    <div class="row">

        <div class="col-lg-3 col-md-6">
        """),_display_(/*125.10*/if(session().get("role").equals("director"))/*125.54*/ {_display_(Seq[Any](format.raw/*125.56*/("""
            """),format.raw/*126.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*138.27*/routes/*138.33*/.CourseController.index()),format.raw/*138.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace kurzu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*146.10*/("""
        """),format.raw/*147.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*149.10*/if(session().get("role").equals("director"))/*149.54*/ {_display_(Seq[Any](format.raw/*149.56*/("""
            """),format.raw/*150.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*162.27*/routes/*162.33*/.StudyPlansController.index()),format.raw/*162.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace studijního plánu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*170.10*/("""
        """),format.raw/*171.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*173.10*/if(session().get("role").equals("director"))/*173.54*/ {_display_(Seq[Any](format.raw/*173.56*/("""
            """),format.raw/*174.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*186.27*/routes/*186.33*/.TableController.listSemesters()),format.raw/*186.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam semestrů</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*194.10*/("""
        """),format.raw/*195.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*198.10*/if(session().get("role").equals("director"))/*198.54*/ {_display_(Seq[Any](format.raw/*198.56*/("""
            """),format.raw/*199.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*219.10*/("""
        """),format.raw/*220.9*/("""</div>

    </div>


        <!-- /.row -->
""")))}),format.raw/*226.2*/("""
"""))
      }
    }
  }

  def render(user:Member): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Member) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Wed May 03 11:25:58 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: aa4feadbe8a6c0b1ef6757eebdbda451610892a9
                  MATRIX: 753->1|845->17|865->29|945->33|976->38|1054->90|1068->96|1130->138|1186->168|1200->174|1260->214|1316->244|1330->250|1390->290|1442->15|1469->303|1499->307|1536->335|1576->337|1608->342|1925->632|1978->676|2018->678|2059->691|2616->1221|2631->1227|2677->1252|3056->1600|3092->1609|3176->1666|3229->1710|3269->1712|3310->1725|3862->2250|3877->2256|3928->2286|4304->2631|4340->2640|4423->2696|4476->2740|4516->2742|4557->2755|5114->3285|5129->3291|5179->3320|5559->3669|5595->3678|5679->3735|5732->3779|5772->3781|5813->3794|6697->4646|6734->4655|6877->4770|6931->4814|6972->4816|7014->4829|7572->5359|7588->5365|7635->5390|8015->5738|8052->5747|8136->5803|8190->5847|8231->5849|8273->5862|8840->6401|8856->6407|8907->6436|9298->6795|9335->6804|9419->6860|9473->6904|9514->6906|9556->6919|10112->7447|10128->7453|10182->7485|10561->7832|10598->7841|10683->7898|10737->7942|10778->7944|10820->7957|11704->8809|11741->8818|11817->8863
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|43->10|43->10|43->10|44->11|54->21|54->21|54->21|55->22|67->34|67->34|67->34|75->42|76->43|79->46|79->46|79->46|80->47|92->59|92->59|92->59|100->67|101->68|103->70|103->70|103->70|104->71|116->83|116->83|116->83|124->91|125->92|128->95|128->95|128->95|129->96|149->116|150->117|158->125|158->125|158->125|159->126|171->138|171->138|171->138|179->146|180->147|182->149|182->149|182->149|183->150|195->162|195->162|195->162|203->170|204->171|206->173|206->173|206->173|207->174|219->186|219->186|219->186|227->194|228->195|231->198|231->198|231->198|232->199|252->219|253->220|259->226
                  -- GENERATED --
              */
          