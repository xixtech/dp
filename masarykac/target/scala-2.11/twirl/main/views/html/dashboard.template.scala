
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
            <h1 class="page-header">Nástěnka</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
        <!-- /.row -->
    <div class="row">
        <h4>Rychlý přístup</h4>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*22.10*/if(session().get("role").equals("director"))/*22.54*/ {_display_(Seq[Any](format.raw/*22.56*/("""
            """),format.raw/*23.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.PersonController.index()),format.raw/*35.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace osoby</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*47.10*/if(session().get("role").equals("director"))/*47.54*/ {_display_(Seq[Any](format.raw/*47.56*/("""
            """),format.raw/*48.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*60.27*/routes/*60.33*/.Application.kpiChoosePerson()),format.raw/*60.63*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">KPI Kalkulace</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*68.10*/("""
        """),format.raw/*69.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*71.10*/if(session().get("role").equals("director"))/*71.54*/ {_display_(Seq[Any](format.raw/*71.56*/("""
            """),format.raw/*72.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*84.27*/routes/*84.33*/.TableController.listPerson()),format.raw/*84.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam pracovníků</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*92.10*/("""
        """),format.raw/*93.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*96.10*/if(session().get("role").equals("director"))/*96.54*/ {_display_(Seq[Any](format.raw/*96.56*/("""
            """),format.raw/*97.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*117.10*/("""
        """),format.raw/*118.9*/("""</div>

    </div>

        <!-- /.row -->
    <div class="row">

        <div class="col-lg-3 col-md-6">
        """),_display_(/*126.10*/if(session().get("role").equals("director"))/*126.54*/ {_display_(Seq[Any](format.raw/*126.56*/("""
            """),format.raw/*127.13*/("""<div class="panel panel-primary">
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
                <a href=""""),_display_(/*139.27*/routes/*139.33*/.CourseController.index()),format.raw/*139.58*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace kurzu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*147.10*/("""
        """),format.raw/*148.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*150.10*/if(session().get("role").equals("director"))/*150.54*/ {_display_(Seq[Any](format.raw/*150.56*/("""
            """),format.raw/*151.13*/("""<div class="panel panel-green">
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
                <a href=""""),_display_(/*163.27*/routes/*163.33*/.StudyPlansController.index()),format.raw/*163.62*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Registrace studijního plánu</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*171.10*/("""
        """),format.raw/*172.9*/("""</div>
        <div class="col-lg-3 col-md-6">
        """),_display_(/*174.10*/if(session().get("role").equals("director"))/*174.54*/ {_display_(Seq[Any](format.raw/*174.56*/("""
            """),format.raw/*175.13*/("""<div class="panel panel-yellow">
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
                <a href=""""),_display_(/*187.27*/routes/*187.33*/.TableController.listSemesters()),format.raw/*187.65*/("""">
                    <div class="panel-footer">
                        <span class="pull-left">Seznam semestrů</span>
                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                        <div class="clearfix"></div>
                    </div>
                </a>
            </div>
        """)))}),format.raw/*195.10*/("""
        """),format.raw/*196.9*/("""</div>

        <div class="col-lg-3 col-md-6">
        """),_display_(/*199.10*/if(session().get("role").equals("director"))/*199.54*/ {_display_(Seq[Any](format.raw/*199.56*/("""
            """),format.raw/*200.13*/("""<div class="panel panel-red">
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
        """)))}),format.raw/*220.10*/("""
        """),format.raw/*221.9*/("""</div>

    </div>


        <!-- /.row -->
""")))}),format.raw/*227.2*/("""
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
                  DATE: Wed Apr 26 19:37:07 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/dashboard.scala.html
                  HASH: 4eced53fd43b6fba15f536ea394755cf38e80380
                  MATRIX: 753->1|845->17|865->29|945->33|976->38|1054->90|1068->96|1130->138|1186->168|1200->174|1260->214|1316->244|1330->250|1390->290|1442->15|1469->303|1499->307|1536->335|1576->337|1608->342|1921->628|1974->672|2014->674|2055->687|2612->1217|2627->1223|2673->1248|3052->1596|3088->1605|3172->1662|3225->1706|3265->1708|3306->1721|3858->2246|3873->2252|3924->2282|4300->2627|4336->2636|4419->2692|4472->2736|4512->2738|4553->2751|5110->3281|5125->3287|5175->3316|5555->3665|5591->3674|5675->3731|5728->3775|5768->3777|5809->3790|6693->4642|6730->4651|6873->4766|6927->4810|6968->4812|7010->4825|7568->5355|7584->5361|7631->5386|8011->5734|8048->5743|8132->5799|8186->5843|8227->5845|8269->5858|8836->6397|8852->6403|8903->6432|9294->6791|9331->6800|9415->6856|9469->6900|9510->6902|9552->6915|10108->7443|10124->7449|10178->7481|10557->7828|10594->7837|10679->7894|10733->7938|10774->7940|10816->7953|11700->8805|11737->8814|11813->8859
                  LINES: 27->1|31->2|31->2|33->2|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->1|40->7|43->10|43->10|43->10|44->11|55->22|55->22|55->22|56->23|68->35|68->35|68->35|76->43|77->44|80->47|80->47|80->47|81->48|93->60|93->60|93->60|101->68|102->69|104->71|104->71|104->71|105->72|117->84|117->84|117->84|125->92|126->93|129->96|129->96|129->96|130->97|150->117|151->118|159->126|159->126|159->126|160->127|172->139|172->139|172->139|180->147|181->148|183->150|183->150|183->150|184->151|196->163|196->163|196->163|204->171|205->172|207->174|207->174|207->174|208->175|220->187|220->187|220->187|228->195|229->196|232->199|232->199|232->199|233->200|253->220|254->221|260->227
                  -- GENERATED --
              */
          