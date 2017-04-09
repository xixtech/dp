
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

class workers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Member],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: List[Member]):play.twirl.api.HtmlFormat.Appendable = {
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
                                    """),_display_(/*54.38*/if(member.profile != null)/*54.64*/ {_display_(Seq[Any](format.raw/*54.66*/("""
                                        """),_display_(/*55.42*/if(member.profile.getFirstName == null)/*55.81*/ {_display_(Seq[Any](format.raw/*55.83*/("""
                                            """),format.raw/*56.45*/("""<em>-</em>
                                        """)))}/*57.43*/else/*57.48*/{_display_(Seq[Any](format.raw/*57.49*/("""
                                            """),_display_(/*58.46*/member/*58.52*/.profile.getFirstName),format.raw/*58.73*/("""
                                        """)))}),format.raw/*59.42*/("""
                                    """)))}),format.raw/*60.38*/("""
                                    """),format.raw/*61.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*63.38*/if(member.profile != null)/*63.64*/ {_display_(Seq[Any](format.raw/*63.66*/("""
                                        """),_display_(/*64.42*/if(member.profile.getLastName == null)/*64.80*/ {_display_(Seq[Any](format.raw/*64.82*/("""
                                            """),format.raw/*65.45*/("""<em>-</em>
                                        """)))}/*66.43*/else/*66.48*/{_display_(Seq[Any](format.raw/*66.49*/("""
                                            """),_display_(/*67.46*/member/*67.52*/.profile.getLastName),format.raw/*67.72*/("""
                                        """)))}),format.raw/*68.42*/("""
                                    """)))}),format.raw/*69.38*/("""
                                    """),format.raw/*70.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*72.38*/if(member.profile != null)/*72.64*/ {_display_(Seq[Any](format.raw/*72.66*/("""
                                        """),_display_(/*73.42*/if(member.profile.phoneNumber == null)/*73.80*/ {_display_(Seq[Any](format.raw/*73.82*/("""
                                            """),format.raw/*74.45*/("""<em>-</em>
                                        """)))}/*75.43*/else/*75.48*/{_display_(Seq[Any](format.raw/*75.49*/("""
                                            """),_display_(/*76.46*/member/*76.52*/.profile.phoneNumber),format.raw/*76.72*/("""
                                        """)))}),format.raw/*77.42*/("""
                                    """)))}),format.raw/*78.38*/("""
                                    """),format.raw/*79.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*81.38*/if(member.profile != null)/*81.64*/ {_display_(Seq[Any](format.raw/*81.66*/("""
                                        """),_display_(/*82.42*/form(routes.PrintController.printUserDetails(member.id), 'class -> "topRight")/*82.120*/ {_display_(Seq[Any](format.raw/*82.122*/("""
                                            """),format.raw/*83.45*/("""<input type="submit" value=""""),_display_(/*83.74*/member/*83.80*/.email),format.raw/*83.86*/("""" class="btn success">
                                            """)))}),format.raw/*84.46*/("""
                                    """)))}),format.raw/*85.38*/("""
                                    """),format.raw/*86.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*88.38*/if(member.profile != null)/*88.64*/ {_display_(Seq[Any](format.raw/*88.66*/("""
                                        """),_display_(/*89.42*/form(routes.SalaryController.printLector(member.id), 'class -> "topRight")/*89.116*/ {_display_(Seq[Any](format.raw/*89.118*/("""
                                            """),format.raw/*90.45*/("""<input type="submit" value=""""),_display_(/*90.74*/member/*90.80*/.email),format.raw/*90.86*/("""" class="btn success">
                                            """)))}),format.raw/*91.46*/("""
                                    """)))}),format.raw/*92.38*/("""
                                    """),format.raw/*93.37*/("""</td>
                                </tr>
                            """)))}),format.raw/*95.30*/("""
                            """),format.raw/*96.29*/("""</tbody>
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

  def render(currentPage:List[Member]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((List[Member]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


}

/**/
object workers extends workers_Scope0.workers
              /*
                  -- GENERATED --
                  DATE: Sun Apr 09 10:50:49 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/tables/workers.scala.html
                  HASH: 2c974a794dce02515d62013cafbdbb9785a84fd8
                  MATRIX: 762->1|882->47|906->63|986->67|1017->72|1056->85|1070->91|1126->127|1185->167|1205->179|1285->183|1320->192|1395->241|1409->247|1496->314|1553->344|1568->350|1663->424|1829->562|1858->563|1903->580|1966->615|1995->616|2044->637|2105->670|2134->671|2177->686|2206->687|2263->28|2290->164|2319->705|2348->708|2417->768|2457->770|2489->775|3587->1846|3629->1872|3669->1874|3730->1907|3856->2006|3891->2032|3931->2034|4000->2076|4048->2115|4088->2117|4161->2162|4232->2215|4245->2220|4284->2221|4357->2267|4372->2273|4414->2294|4487->2336|4556->2374|4621->2411|4747->2510|4782->2536|4822->2538|4891->2580|4938->2618|4978->2620|5051->2665|5122->2718|5135->2723|5174->2724|5247->2770|5262->2776|5303->2796|5376->2838|5445->2876|5510->2913|5636->3012|5671->3038|5711->3040|5780->3082|5827->3120|5867->3122|5940->3167|6011->3220|6024->3225|6063->3226|6136->3272|6151->3278|6192->3298|6265->3340|6334->3378|6399->3415|6525->3514|6560->3540|6600->3542|6669->3584|6757->3662|6798->3664|6871->3709|6927->3738|6942->3744|6969->3750|7068->3818|7137->3856|7202->3893|7328->3992|7363->4018|7403->4020|7472->4062|7556->4136|7597->4138|7670->4183|7726->4212|7741->4218|7768->4224|7867->4292|7936->4330|8001->4367|8105->4440|8162->4469
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|35->7|35->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|44->14|44->14|45->15|45->15|45->15|46->16|47->17|47->17|48->18|48->18|51->1|52->5|54->20|56->22|56->22|56->22|57->23|84->50|84->50|84->50|85->51|88->54|88->54|88->54|89->55|89->55|89->55|90->56|91->57|91->57|91->57|92->58|92->58|92->58|93->59|94->60|95->61|97->63|97->63|97->63|98->64|98->64|98->64|99->65|100->66|100->66|100->66|101->67|101->67|101->67|102->68|103->69|104->70|106->72|106->72|106->72|107->73|107->73|107->73|108->74|109->75|109->75|109->75|110->76|110->76|110->76|111->77|112->78|113->79|115->81|115->81|115->81|116->82|116->82|116->82|117->83|117->83|117->83|117->83|118->84|119->85|120->86|122->88|122->88|122->88|123->89|123->89|123->89|124->90|124->90|124->90|124->90|125->91|126->92|127->93|129->95|130->96
                  -- GENERATED --
              */
          