
package views.html.tables

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object workers_Scope0 {
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

class workers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: List[Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*3.2*/localStylesheets/*3.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<link href='"""),_display_(/*4.18*/routes/*4.24*/.Assets.at("stylesheets/tables.css")),format.raw/*4.60*/("""' rel="stylesheet" type="text/css">
""")))};def /*7.2*/localScripts/*7.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.18*/("""
        """),format.raw/*8.9*/("""<!-- DataTables JavaScript -->
    <script src='"""),_display_(/*9.19*/routes/*9.25*/.Assets.at("DataTables/DataTables-1.10.13/js/jquery.dataTables.js")),format.raw/*9.92*/("""'></script>
    <script src='"""),_display_(/*10.19*/routes/*10.25*/.Assets.at("DataTables/DataTables-1.10.13/js/dataTables.bootstrap.min.js")),format.raw/*10.99*/("""'></script>

        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
            $(document).ready(function () """),format.raw/*14.43*/("""{"""),format.raw/*14.44*/("""
                """),format.raw/*15.17*/("""$('#dataTables-example').DataTable("""),format.raw/*15.52*/("""{"""),format.raw/*15.53*/("""
                    """),format.raw/*16.21*/("""responsive: true
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/(""");
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*5.2*/("""

"""),format.raw/*20.2*/("""

"""),_display_(/*22.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*22.62*/ {_display_(Seq[Any](format.raw/*22.64*/("""
    """),format.raw/*23.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Zaměstnanci</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
        <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Výpis zaměstnanců
                </div>
                    <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="dataTable_wrapper">
                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                            <thead>
                                <tr>
                                    <th>Jméno</th>
                                    <th>Příjmení</th>
                                    <th>Telefonní číslo</th>
                                    <th>E-mail</th>
                                </tr>
                            </thead>
                            <tbody>

                            """),_display_(/*50.30*/for(member <- currentPage) yield /*50.56*/ {_display_(Seq[Any](format.raw/*50.58*/("""
                                """),format.raw/*51.33*/("""<tr>

                                    <td class="center">
                                    """),_display_(/*54.38*/if(member.member.profile.firstName == null)/*54.81*/ {_display_(Seq[Any](format.raw/*54.83*/("""
                                        """),format.raw/*55.41*/("""<em>-</em>
                                    """)))}/*56.39*/else/*56.44*/{_display_(Seq[Any](format.raw/*56.45*/("""
                                        """),_display_(/*57.42*/member/*57.48*/.member.profile.firstName),format.raw/*57.73*/("""
                                    """)))}),format.raw/*58.38*/("""
                                    """),format.raw/*59.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*61.38*/if(member.member.profile.lastName == null)/*61.80*/ {_display_(Seq[Any](format.raw/*61.82*/("""
                                        """),format.raw/*62.41*/("""<em>-</em>
                                    """)))}/*63.39*/else/*63.44*/{_display_(Seq[Any](format.raw/*63.45*/("""
                                        """),_display_(/*64.42*/member/*64.48*/.member.profile.lastName),format.raw/*64.72*/("""
                                    """)))}),format.raw/*65.38*/("""
                                    """),format.raw/*66.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*68.38*/if(member.member.profile.phoneNumber == null)/*68.83*/ {_display_(Seq[Any](format.raw/*68.85*/("""
                                        """),format.raw/*69.41*/("""<em>-</em>
                                    """)))}/*70.39*/else/*70.44*/{_display_(Seq[Any](format.raw/*70.45*/("""
                                        """),_display_(/*71.42*/member/*71.48*/.member.profile.phoneNumber),format.raw/*71.75*/("""
                                    """)))}),format.raw/*72.38*/("""
                                    """),format.raw/*73.37*/("""</td>
                                    <td class="center">
                                        """),_display_(/*75.42*/form(routes.PrintController.printUserDetails(member.id), 'class -> "topRight")/*75.120*/ {_display_(Seq[Any](format.raw/*75.122*/("""
                                            """),format.raw/*76.45*/("""<input type="submit" value=""""),_display_(/*76.74*/member/*76.80*/.member.email),format.raw/*76.93*/("""" class="btn success">
                                        """)))}),format.raw/*77.42*/("""
                                    """),format.raw/*78.37*/("""</td>
                                </tr>
                            """)))}),format.raw/*80.30*/("""
                            """),format.raw/*81.29*/("""</tbody>
                        </table>
                    </div>
                        <!-- /.table-responsive -->
                </div>
                    <!-- /.panel-body -->
            </div>
                <!-- /.panel -->
        </div>
            <!-- /.col-lg-12 -->
    </div>

""")))}))
      }
    }
  }

  def render(currentPage:List[Person]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((List[Person]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


}

/**/
object workers extends workers_Scope0.workers
              /*
                  -- GENERATED --
                  DATE: Thu Feb 09 12:02:31 CET 2017
                  SOURCE: E:/Users/Martin/Downloads/masarykac/app/views/tables/workers.scala.html
                  HASH: b0d86146cd226b26844deb8240bf92c161f31ed2
                  MATRIX: 762->1|882->47|906->63|986->67|1017->72|1056->85|1070->91|1126->127|1185->167|1205->179|1285->183|1320->192|1395->241|1409->247|1496->314|1553->344|1568->350|1663->424|1829->562|1858->563|1903->580|1966->615|1995->616|2044->637|2105->670|2134->671|2177->686|2206->687|2263->28|2290->164|2319->705|2348->708|2417->768|2457->770|2489->775|3587->1846|3629->1872|3669->1874|3730->1907|3856->2006|3908->2049|3948->2051|4017->2092|4084->2141|4097->2146|4136->2147|4205->2189|4220->2195|4266->2220|4335->2258|4400->2295|4526->2394|4577->2436|4617->2438|4686->2479|4753->2528|4766->2533|4805->2534|4874->2576|4889->2582|4934->2606|5003->2644|5068->2681|5194->2780|5248->2825|5288->2827|5357->2868|5424->2917|5437->2922|5476->2923|5545->2965|5560->2971|5608->2998|5677->3036|5742->3073|5872->3176|5960->3254|6001->3256|6074->3301|6130->3330|6145->3336|6179->3349|6274->3413|6339->3450|6443->3523|6500->3552
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|35->7|35->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|44->14|44->14|45->15|45->15|45->15|46->16|47->17|47->17|48->18|48->18|51->1|52->5|54->20|56->22|56->22|56->22|57->23|84->50|84->50|84->50|85->51|88->54|88->54|88->54|89->55|90->56|90->56|90->56|91->57|91->57|91->57|92->58|93->59|95->61|95->61|95->61|96->62|97->63|97->63|97->63|98->64|98->64|98->64|99->65|100->66|102->68|102->68|102->68|103->69|104->70|104->70|104->70|105->71|105->71|105->71|106->72|107->73|109->75|109->75|109->75|110->76|110->76|110->76|110->76|111->77|112->78|114->80|115->81
                  -- GENERATED --
              */
          