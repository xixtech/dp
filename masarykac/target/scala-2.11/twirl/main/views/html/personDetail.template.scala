
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

class personDetail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: List[Person]):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.29*/("""
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

            """),_display_(/*39.14*/for(member <- currentPage) yield /*39.40*/ {_display_(Seq[Any](format.raw/*39.42*/("""
              """),format.raw/*40.15*/("""<tr>

                <td class="center">
                """),_display_(/*43.18*/if(member.member.profile.firstName == null)/*43.61*/ {_display_(Seq[Any](format.raw/*43.63*/("""
                  """),format.raw/*44.19*/("""<em>-</em>
                """)))}/*45.19*/else/*45.24*/{_display_(Seq[Any](format.raw/*45.25*/("""
                  """),_display_(/*46.20*/member/*46.26*/.member.profile.firstName),format.raw/*46.51*/("""
                """)))}),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""</td>
                <td class="center">
                """),_display_(/*50.18*/if(member.member.profile.lastName == null)/*50.60*/ {_display_(Seq[Any](format.raw/*50.62*/("""
                  """),format.raw/*51.19*/("""<em>-</em>
                """)))}/*52.19*/else/*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
                  """),_display_(/*53.20*/member/*53.26*/.member.profile.lastName),format.raw/*53.50*/("""
                """)))}),format.raw/*54.18*/("""
                """),format.raw/*55.17*/("""</td>
                <td class="center">
                """),_display_(/*57.18*/if(member.member.profile.phoneNumber == null)/*57.63*/ {_display_(Seq[Any](format.raw/*57.65*/("""
                  """),format.raw/*58.19*/("""<em>-</em>
                """)))}/*59.19*/else/*59.24*/{_display_(Seq[Any](format.raw/*59.25*/("""
                  """),_display_(/*60.20*/member/*60.26*/.member.profile.phoneNumber),format.raw/*60.53*/("""
                """)))}),format.raw/*61.18*/("""
                """),format.raw/*62.17*/("""</td>

                <td class="center">
                """),_display_(/*65.18*/form(routes.Application.pdf(), 'class -> "topRight")/*65.70*/ {_display_(Seq[Any](format.raw/*65.72*/("""
                  """),format.raw/*66.19*/("""<input type="submit" value=""""),_display_(/*66.48*/member/*66.54*/.member.email),format.raw/*66.67*/("""" class="btn success">
                  """)))}),format.raw/*67.20*/("""
                """),format.raw/*68.17*/("""</td>
              </tr>
            """)))}),format.raw/*70.14*/("""
            """),format.raw/*71.13*/("""</tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(currentPage:List[Person]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage)

  def f:((List[Person]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage) => apply(currentPage)

  def ref: this.type = this

}


}

/**/
object personDetail extends personDetail_Scope0.personDetail
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 11:22:35 CET 2017
                  SOURCE: E:/Users/Martin/Downloads/masarykac/app/views/personDetail.scala.html
                  HASH: 9f81a0934c9f292b2668cdf6e3b2d4a455c8719c
                  MATRIX: 765->1|885->49|909->65|989->69|1019->73|1058->86|1072->92|1128->128|1188->171|1208->183|1288->187|1318->191|1395->242|1409->248|1471->290|1527->319|1542->325|1603->365|1659->394|1674->400|1735->440|1791->469|1806->475|1894->542|1950->571|1965->577|2060->651|2115->28|2143->166|2174->667|2203->670|2272->730|2312->732|2343->736|3021->1387|3063->1413|3103->1415|3147->1431|3236->1493|3288->1536|3328->1538|3376->1558|3424->1588|3437->1593|3476->1594|3524->1615|3539->1621|3585->1646|3635->1665|3681->1683|3769->1744|3820->1786|3860->1788|3908->1808|3956->1838|3969->1843|4008->1844|4056->1865|4071->1871|4116->1895|4166->1914|4212->1932|4300->1993|4354->2038|4394->2040|4442->2060|4490->2090|4503->2095|4542->2096|4590->2117|4605->2123|4653->2150|4703->2169|4749->2187|4839->2250|4900->2302|4940->2304|4988->2324|5044->2353|5059->2359|5093->2372|5167->2415|5213->2433|5285->2474|5327->2488|5440->2571
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|35->7|35->7|37->7|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|46->1|47->5|49->15|50->16|50->16|50->16|51->17|73->39|73->39|73->39|74->40|77->43|77->43|77->43|78->44|79->45|79->45|79->45|80->46|80->46|80->46|81->47|82->48|84->50|84->50|84->50|85->51|86->52|86->52|86->52|87->53|87->53|87->53|88->54|89->55|91->57|91->57|91->57|92->58|93->59|93->59|93->59|94->60|94->60|94->60|95->61|96->62|99->65|99->65|99->65|100->66|100->66|100->66|100->66|101->67|102->68|104->70|105->71|111->77
                  -- GENERATED --
              */
          