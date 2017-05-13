
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blank_Scope0 {
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

class blank extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(text: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/localStylesheets/*3.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<link rel="stylesheet" href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.css" />


    <style>
    td.details-control """),format.raw/*8.24*/("""{"""),format.raw/*8.25*/("""
        """),format.raw/*9.9*/("""background: url('http://www.datatables.net/examples/resources/details_open.png') no-repeat center center;
        cursor: pointer;
    """),format.raw/*11.5*/("""}"""),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""tr.shown td.details-control """),format.raw/*13.33*/("""{"""),format.raw/*13.34*/("""
        """),format.raw/*14.9*/("""background: url('http://www.datatables.net/examples/resources/details_close.png') no-repeat center center;
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</style>
""")))};def /*19.2*/localScripts/*19.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.18*/("""
    """),format.raw/*20.5*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.at("javascripts/dynamicFields.js")),format.raw/*22.67*/("""'></script>
    <script src="http://cdn.datatables.net/responsive/1.0.1/js/dataTables.responsive.min.js"></script>
    <script src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
            $(document).ready(function () """),format.raw/*27.43*/("""{"""),format.raw/*27.44*/("""

                """),format.raw/*29.17*/("""var MyUserObject = """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""}"""),format.raw/*29.38*/(""";
                MyUserObject["v"] = """"),_display_(/*30.39*/Employees/*30.48*/.getJS1Value()),format.raw/*30.62*/("""";
                MyUserObject["k"] = """"),_display_(/*31.39*/Employees/*31.48*/.getJS1Key()),format.raw/*31.60*/("""";

                employeeArray(MyUserObject);
                publicationArray(MyUserObject);
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*17.2*/("""

"""),format.raw/*37.2*/("""

"""),_display_(/*39.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*39.62*/ {_display_(Seq[Any](format.raw/*39.64*/("""
    """),format.raw/*40.5*/("""<div class="col-md-12">
        <div class="row">

        </div>
    </div>


    <div class="row">

    </div>
    --------------------------
    <div class="row">
        <div class="col-md-6">

            <input type="button" class="btn btn" value="Přidat" onclick="addCourseTeacher();" />
            <div id="radky"></div>

        </div>
    </div>


""")))}))
      }
    }
  }

  def render(text:String): play.twirl.api.HtmlFormat.Appendable = apply(text)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (text) => apply(text)

  def ref: this.type = this

}


}

/**/
object blank extends blank_Scope0.blank
              /*
                  -- GENERATED --
                  DATE: Sat May 13 11:42:15 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/blank.scala.html
                  HASH: cd78c7a049f606b977610204bc8e8f1950b49525
                  MATRIX: 751->1|843->18|867->34|947->38|978->43|1134->172|1162->173|1197->182|1359->317|1387->318|1420->324|1476->352|1505->353|1541->362|1679->473|1707->474|1739->479|1772->492|1793->504|1874->508|1906->513|2112->692|2127->698|2190->740|2547->1069|2576->1070|2622->1088|2669->1107|2698->1108|2727->1109|2794->1149|2812->1158|2847->1172|2915->1213|2933->1222|2966->1234|3103->1343|3132->1344|3189->15|3218->489|3247->1362|3276->1365|3345->1425|3385->1427|3417->1432
                  LINES: 27->1|31->3|31->3|33->3|34->4|38->8|38->8|39->9|41->11|41->11|43->13|43->13|43->13|44->14|45->15|45->15|46->16|47->19|47->19|49->19|50->20|52->22|52->22|52->22|57->27|57->27|59->29|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|65->35|65->35|68->1|70->17|72->37|74->39|74->39|74->39|75->40
                  -- GENERATED --
              */
          