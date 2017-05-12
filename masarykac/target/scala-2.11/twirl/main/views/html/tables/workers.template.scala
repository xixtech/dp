
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
            $(document).ready(function () """),format.raw/*13.43*/("""{"""),format.raw/*13.44*/("""
                """),format.raw/*14.17*/("""$('#dataTables-example').DataTable("""),format.raw/*14.52*/("""{"""),format.raw/*14.53*/("""
                    """),format.raw/*15.21*/("""responsive: true
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/(""");
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*5.2*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*21.62*/ {_display_(Seq[Any](format.raw/*21.64*/("""
    """),format.raw/*22.5*/("""<div class="row">
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
                                    <th>Uživatelské jméno</th>
                                </tr>
                            </thead>
                            <tbody>

                            """),_display_(/*49.30*/for(member <- currentPage) yield /*49.56*/ {_display_(Seq[Any](format.raw/*49.58*/("""
                                """),format.raw/*50.33*/("""<tr>

                                    <td class="center">
                                    """),_display_(/*53.38*/if(member.profile != null)/*53.64*/ {_display_(Seq[Any](format.raw/*53.66*/("""
                                        """),_display_(/*54.42*/if(member.profile.getFirstName == null)/*54.81*/ {_display_(Seq[Any](format.raw/*54.83*/("""
                                            """),format.raw/*55.45*/("""<em>-</em>
                                        """)))}/*56.43*/else/*56.48*/{_display_(Seq[Any](format.raw/*56.49*/("""
                                            """),_display_(/*57.46*/member/*57.52*/.profile.getFirstName),format.raw/*57.73*/("""
                                        """)))}),format.raw/*58.42*/("""
                                    """)))}),format.raw/*59.38*/("""
                                    """),format.raw/*60.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*62.38*/if(member.profile != null)/*62.64*/ {_display_(Seq[Any](format.raw/*62.66*/("""
                                        """),_display_(/*63.42*/if(member.profile.getLastName == null)/*63.80*/ {_display_(Seq[Any](format.raw/*63.82*/("""
                                            """),format.raw/*64.45*/("""<em>-</em>
                                        """)))}/*65.43*/else/*65.48*/{_display_(Seq[Any](format.raw/*65.49*/("""
                                            """),_display_(/*66.46*/member/*66.52*/.profile.getLastName),format.raw/*66.72*/("""
                                        """)))}),format.raw/*67.42*/("""
                                    """)))}),format.raw/*68.38*/("""
                                    """),format.raw/*69.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*71.38*/if(member.profile != null)/*71.64*/ {_display_(Seq[Any](format.raw/*71.66*/("""
                                        """),_display_(/*72.42*/if(member.profile.phoneNumber == null)/*72.80*/ {_display_(Seq[Any](format.raw/*72.82*/("""
                                            """),format.raw/*73.45*/("""<em>-</em>
                                        """)))}/*74.43*/else/*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""
                                            """),_display_(/*75.46*/member/*75.52*/.profile.phoneNumber),format.raw/*75.72*/("""
                                        """)))}),format.raw/*76.42*/("""
                                    """)))}),format.raw/*77.38*/("""
                                    """),format.raw/*78.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*80.38*/if(member.profile != null)/*80.64*/ {_display_(Seq[Any](format.raw/*80.66*/("""
                                        """),_display_(/*81.42*/form(routes.PrintController.printUserDetails(member.id), 'class -> "topRight")/*81.120*/ {_display_(Seq[Any](format.raw/*81.122*/("""
                                            """),format.raw/*82.45*/("""<input type="submit" value=""""),_display_(/*82.74*/member/*82.80*/.uid),format.raw/*82.84*/("""" class="btn success">
                                            """)))}),format.raw/*83.46*/("""
                                    """)))}),format.raw/*84.38*/("""
                                    """),format.raw/*85.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*87.38*/if(member.profile != null)/*87.64*/ {_display_(Seq[Any](format.raw/*87.66*/("""
                                        """),_display_(/*88.42*/form(routes.SalaryController.printLector(member.id), 'class -> "topRight")/*88.116*/ {_display_(Seq[Any](format.raw/*88.118*/("""
                                            """),format.raw/*89.45*/("""<input type="submit" value=""""),_display_(/*89.74*/member/*89.80*/.uid),format.raw/*89.84*/("""" class="btn success">
                                            """)))}),format.raw/*90.46*/("""
                                    """)))}),format.raw/*91.38*/("""
                                    """),format.raw/*92.37*/("""</td>
                                </tr>
                            """)))}),format.raw/*94.30*/("""
                            """),format.raw/*95.29*/("""</tbody>
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
                  DATE: Fri May 12 20:28:33 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/tables/workers.scala.html
                  HASH: a2b6e1f40eec295e7e1e8a1cea86966902ce72d7
                  MATRIX: 762->1|882->47|906->63|986->67|1017->72|1056->85|1070->91|1126->127|1185->167|1205->179|1285->183|1320->192|1395->241|1409->247|1496->314|1553->344|1568->350|1663->424|1828->561|1857->562|1902->579|1965->614|1994->615|2043->636|2104->669|2133->670|2176->685|2205->686|2262->28|2289->164|2318->704|2347->707|2416->767|2456->769|2488->774|3597->1856|3639->1882|3679->1884|3740->1917|3866->2016|3901->2042|3941->2044|4010->2086|4058->2125|4098->2127|4171->2172|4242->2225|4255->2230|4294->2231|4367->2277|4382->2283|4424->2304|4497->2346|4566->2384|4631->2421|4757->2520|4792->2546|4832->2548|4901->2590|4948->2628|4988->2630|5061->2675|5132->2728|5145->2733|5184->2734|5257->2780|5272->2786|5313->2806|5386->2848|5455->2886|5520->2923|5646->3022|5681->3048|5721->3050|5790->3092|5837->3130|5877->3132|5950->3177|6021->3230|6034->3235|6073->3236|6146->3282|6161->3288|6202->3308|6275->3350|6344->3388|6409->3425|6535->3524|6570->3550|6610->3552|6679->3594|6767->3672|6808->3674|6881->3719|6937->3748|6952->3754|6977->3758|7076->3826|7145->3864|7210->3901|7336->4000|7371->4026|7411->4028|7480->4070|7564->4144|7605->4146|7678->4191|7734->4220|7749->4226|7774->4230|7873->4298|7942->4336|8007->4373|8111->4446|8168->4475
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|35->7|35->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|43->13|43->13|44->14|44->14|44->14|45->15|46->16|46->16|47->17|47->17|50->1|51->5|53->19|55->21|55->21|55->21|56->22|83->49|83->49|83->49|84->50|87->53|87->53|87->53|88->54|88->54|88->54|89->55|90->56|90->56|90->56|91->57|91->57|91->57|92->58|93->59|94->60|96->62|96->62|96->62|97->63|97->63|97->63|98->64|99->65|99->65|99->65|100->66|100->66|100->66|101->67|102->68|103->69|105->71|105->71|105->71|106->72|106->72|106->72|107->73|108->74|108->74|108->74|109->75|109->75|109->75|110->76|111->77|112->78|114->80|114->80|114->80|115->81|115->81|115->81|116->82|116->82|116->82|116->82|117->83|118->84|119->85|121->87|121->87|121->87|122->88|122->88|122->88|123->89|123->89|123->89|123->89|124->90|125->91|126->92|128->94|129->95
                  -- GENERATED --
              */
          