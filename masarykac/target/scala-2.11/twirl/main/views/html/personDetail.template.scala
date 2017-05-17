
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object personDetail_Scope0 {
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

class personDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Member,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(member: models.Member):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*3.2*/localStylesheets/*3.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<link href='"""),_display_(/*4.16*/routes/*4.22*/.Assets.at("stylesheets/tables.css")),format.raw/*4.58*/("""' rel="stylesheet" type="text/css">
""")))};def /*7.2*/localScripts/*7.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.18*/("""
  """),format.raw/*8.3*/("""<!-- Morris Charts JavaScript -->
  <script src='"""),_display_(/*9.17*/routes/*9.23*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*9.65*/("""'></script>
  <script src='"""),_display_(/*10.17*/routes/*10.23*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*10.63*/("""'></script>
  <script src='"""),_display_(/*11.17*/routes/*11.23*/.Assets.at("javascripts/morris-data.js")),format.raw/*11.63*/("""'></script>
  <script src='"""),_display_(/*12.17*/routes/*12.23*/.Assets.at("DataTables/DataTables-1.10.13/js/jquery.dataTables.js")),format.raw/*12.90*/("""'></script>
  <script src='"""),_display_(/*13.17*/routes/*13.23*/.Assets.at("DataTables/DataTables-1.10.13/js/dataTables.bootstrap.min.js")),format.raw/*13.97*/("""'></script>

""")))};
Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*5.2*/("""

"""),format.raw/*15.2*/("""
"""),_display_(/*16.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*16.62*/ {_display_(Seq[Any](format.raw/*16.64*/("""
  """),format.raw/*17.3*/("""<div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Detail</h1>
    </div>
      <!-- /.col-lg-12 -->
  </div>
    <!-- /.row -->
  <div class="container">
    <div class="row">
      <div class="col-md-8 col-md-offset-2">
        <div class="panel-body">
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
              <tr>

                <td class="center">
                """),_display_(/*41.18*/if(member.profile.getFirstName == null)/*41.57*/ {_display_(Seq[Any](format.raw/*41.59*/("""
                  """),format.raw/*42.19*/("""<em>-</em>
                """)))}/*43.19*/else/*43.24*/{_display_(Seq[Any](format.raw/*43.25*/("""
                  """),_display_(/*44.20*/member/*44.26*/.profile.getFirstName),format.raw/*44.47*/("""
                """)))}),format.raw/*45.18*/("""
                """),format.raw/*46.17*/("""</td>
                <td class="center">
                """),_display_(/*48.18*/if(member.profile.getLastName == null)/*48.56*/ {_display_(Seq[Any](format.raw/*48.58*/("""
                  """),format.raw/*49.19*/("""<em>-</em>
                """)))}/*50.19*/else/*50.24*/{_display_(Seq[Any](format.raw/*50.25*/("""
                  """),_display_(/*51.20*/member/*51.26*/.profile.getLastName),format.raw/*51.46*/("""
                """)))}),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""</td>
                <td class="center">
                """),_display_(/*55.18*/if(member.profile.phoneNumber == null)/*55.56*/ {_display_(Seq[Any](format.raw/*55.58*/("""
                  """),format.raw/*56.19*/("""<em>-</em>
                """)))}/*57.19*/else/*57.24*/{_display_(Seq[Any](format.raw/*57.25*/("""
                  """),_display_(/*58.20*/member/*58.26*/.profile.phoneNumber),format.raw/*58.46*/("""
                """)))}),format.raw/*59.18*/("""
                """),format.raw/*60.17*/("""</td>

                <td class="center">
                """),_display_(/*63.18*/form(routes.Application.pdf(), 'class -> "topRight")/*63.70*/ {_display_(Seq[Any](format.raw/*63.72*/("""
                  """),format.raw/*64.19*/("""<input type="submit" value=""""),_display_(/*64.48*/member/*64.54*/.uid),format.raw/*64.58*/("""" class="btn success">
                  """)))}),format.raw/*65.20*/("""
                """),format.raw/*66.17*/("""</td>
              </tr>

            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(member:models.Member): play.twirl.api.HtmlFormat.Appendable = apply(member)

  def f:((models.Member) => play.twirl.api.HtmlFormat.Appendable) = (member) => apply(member)

  def ref: this.type = this

}


}

/**/
object personDetail extends personDetail_Scope0.personDetail
              /*
                  -- GENERATED --
                  DATE: Thu May 18 00:13:24 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/personDetail.scala.html
                  HASH: caed2ae256877f63af51b6dc0033c425dd688270
                  MATRIX: 766->1|882->45|906->61|986->65|1016->69|1055->82|1069->88|1125->124|1185->167|1205->179|1285->183|1315->187|1392->238|1406->244|1468->286|1524->315|1539->321|1600->361|1656->390|1671->396|1732->436|1788->465|1803->471|1891->538|1947->567|1962->573|2057->647|2112->24|2140->162|2171->663|2200->666|2269->726|2309->728|2340->732|3079->1444|3127->1483|3167->1485|3215->1505|3263->1535|3276->1540|3315->1541|3363->1562|3378->1568|3420->1589|3470->1608|3516->1626|3604->1687|3651->1725|3691->1727|3739->1747|3787->1777|3800->1782|3839->1783|3887->1804|3902->1810|3943->1830|3993->1849|4039->1867|4127->1928|4174->1966|4214->1968|4262->1988|4310->2018|4323->2023|4362->2024|4410->2045|4425->2051|4466->2071|4516->2090|4562->2108|4652->2171|4713->2223|4753->2225|4801->2245|4857->2274|4872->2280|4897->2284|4971->2327|5017->2345|5172->2470
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|35->7|35->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|46->1|47->5|49->15|50->16|50->16|50->16|51->17|75->41|75->41|75->41|76->42|77->43|77->43|77->43|78->44|78->44|78->44|79->45|80->46|82->48|82->48|82->48|83->49|84->50|84->50|84->50|85->51|85->51|85->51|86->52|87->53|89->55|89->55|89->55|90->56|91->57|91->57|91->57|92->58|92->58|92->58|93->59|94->60|97->63|97->63|97->63|98->64|98->64|98->64|98->64|99->65|100->66|109->75
                  -- GENERATED --
              */
          