
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
                MyUserObject["js1value"] = """"),_display_(/*30.46*/Employees/*30.55*/.getJS1Value()),format.raw/*30.69*/("""";
                MyUserObject["js1key"] = """"),_display_(/*31.44*/Employees/*31.53*/.getJS1Key()),format.raw/*31.65*/("""";

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
                  DATE: Fri Apr 14 10:45:45 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/blank.scala.html
                  HASH: 3c95cf4122d8ae9d150b8b130c09d744e59a55d0
                  MATRIX: 751->1|843->18|867->34|947->38|978->43|1134->172|1162->173|1197->182|1359->317|1387->318|1420->324|1476->352|1505->353|1541->362|1679->473|1707->474|1739->479|1772->492|1793->504|1874->508|1906->513|2112->692|2127->698|2190->740|2547->1069|2576->1070|2622->1088|2669->1107|2698->1108|2727->1109|2801->1156|2819->1165|2854->1179|2927->1225|2945->1234|2978->1246|3069->1309|3098->1310|3155->15|3184->489|3213->1328|3242->1331|3311->1391|3351->1393|3383->1398
                  LINES: 27->1|31->3|31->3|33->3|34->4|38->8|38->8|39->9|41->11|41->11|43->13|43->13|43->13|44->14|45->15|45->15|46->16|47->19|47->19|49->19|50->20|52->22|52->22|52->22|57->27|57->27|59->29|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|64->34|64->34|67->1|69->17|71->36|73->38|73->38|73->38|74->39
                  -- GENERATED --
              */
          