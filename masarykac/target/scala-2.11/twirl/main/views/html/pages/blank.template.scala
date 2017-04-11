
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
                MyUserObject["prd1"] = """"),_display_(/*30.42*/Employees/*30.51*/.getJS1Value()),format.raw/*30.65*/("""";
                MyUserObject["krk1"] = """"),_display_(/*31.42*/Employees/*31.51*/.getJS1Key()),format.raw/*31.63*/("""";

                hokuspokusCislo(MyUserObject);
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*17.2*/("""

"""),format.raw/*36.2*/("""

"""),_display_(/*38.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*38.62*/ {_display_(Seq[Any](format.raw/*38.64*/("""
    """),format.raw/*39.5*/("""<div class="col-md-12">
        <div class="row">
            <div class="dataTable_wrapper">
                <table id="example" class="table table-striped table-bordered table-hover" cellspacing=" 0" width="100%">
                <thead>
                    <tr>
                        <th>First name</th>
                        <th>Last name</th>
                        <th>Position</th>
                        <th>Office</th>
                        <th>Age</th>
                        <th>Start date</th>
                        <th>Salary</th>
                        <th>Extn.</th>
                        <th>E-mail</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>Tiger</td>
                        <td>Nixon</td>
                        <td>System Architect</td>
                        <td>Edinburgh</td>
                        <td>61</td>
                        <td>2011/04/25</td>
                        <td>$320,800</td>
                        <td>5421</td>
                        <td>yy</td>
                    </tr>
                    <tr>
                        <td>Garrett</td>
                        <td>Winters</td>
                        <td>Accountant</td>
                        <td>Tokyo</td>
                        <td>63</td>
                        <td>2011/07/25</td>
                        <td>$170,750</td>
                        <td>8422</td>
                        <td>xx</td>
                    </tr>
                    <tr>
                        <td>Ashton</td>
                        <td>Cox</td>
                        <td>Junior Technical Author</td>
                        <td>San Francisco</td>
                        <td>66</td>
                        <td>2009/01/12</td>
                        <td>$86,000</td>
                        <td>1562</td>
                        <td>cc</td>
                    </tr>
                </tbody>
                </table>
            </div>
        </div>
    </div>


    <div class="row">

    </div>
    --------------------------
    <div class="row">
        <div class="col-md-12">

            <input type="button" class="btn btn" value="Přidat" onclick="addCourseTeacher();" />
            <div id="0"></div>

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
                  DATE: Tue Apr 11 23:23:09 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/blank.scala.html
                  HASH: cdc1e9d6ab51a8da4d88e255fcb19e29258e0a99
                  MATRIX: 751->1|843->18|867->34|947->38|978->43|1134->172|1162->173|1197->182|1359->317|1387->318|1420->324|1476->352|1505->353|1541->362|1679->473|1707->474|1739->479|1772->492|1793->504|1874->508|1906->513|2112->692|2127->698|2190->740|2547->1069|2576->1070|2622->1088|2669->1107|2698->1108|2727->1109|2797->1152|2815->1161|2850->1175|2921->1219|2939->1228|2972->1240|3063->1303|3092->1304|3149->15|3178->489|3207->1322|3236->1325|3305->1385|3345->1387|3377->1392
                  LINES: 27->1|31->3|31->3|33->3|34->4|38->8|38->8|39->9|41->11|41->11|43->13|43->13|43->13|44->14|45->15|45->15|46->16|47->19|47->19|49->19|50->20|52->22|52->22|52->22|57->27|57->27|59->29|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|64->34|64->34|67->1|69->17|71->36|73->38|73->38|73->38|74->39
                  -- GENERATED --
              */
          