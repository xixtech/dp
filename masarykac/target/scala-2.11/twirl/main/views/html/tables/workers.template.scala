
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
    <style type="text/css"><!--
    table """),format.raw/*6.11*/("""{"""),format.raw/*6.12*/("""
        """),format.raw/*7.9*/("""width: 100%;
        table-layout: fixed;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""td """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
        """),format.raw/*12.9*/("""word-wrap: break-word; /* All browsers since IE 5.5+ */
        overflow-wrap: break-word;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""--></style>

""")))};def /*20.2*/localScripts/*20.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.18*/("""
        """),format.raw/*21.9*/("""<!-- DataTables JavaScript -->
    <script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.at("DataTables/DataTables-1.10.13/js/jquery.dataTables.js")),format.raw/*22.92*/("""'></script>
    <script src='"""),_display_(/*23.19*/routes/*23.25*/.Assets.at("DataTables/DataTables-1.10.13/js/dataTables.bootstrap.min.js")),format.raw/*23.99*/("""'></script>
        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
            $(document).ready(function () """),format.raw/*26.43*/("""{"""),format.raw/*26.44*/("""
                """),format.raw/*27.17*/("""$('#dataTables-example').DataTable("""),format.raw/*27.52*/("""{"""),format.raw/*27.53*/("""
                    """),format.raw/*28.21*/("""responsive: true
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/(""");
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*18.2*/("""

"""),format.raw/*32.2*/("""

"""),_display_(/*34.2*/main(scripts = localScripts, stylesheets = localStylesheets)/*34.62*/ {_display_(Seq[Any](format.raw/*34.64*/("""
    """),format.raw/*35.5*/("""<div class="row">
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

                            """),_display_(/*62.30*/for(member <- currentPage) yield /*62.56*/ {_display_(Seq[Any](format.raw/*62.58*/("""
                                """),format.raw/*63.33*/("""<tr>

                                    <td class="center">
                                    """),_display_(/*66.38*/if(member.profile != null)/*66.64*/ {_display_(Seq[Any](format.raw/*66.66*/("""
                                        """),_display_(/*67.42*/if(member.profile.getFirstName == null)/*67.81*/ {_display_(Seq[Any](format.raw/*67.83*/("""
                                            """),format.raw/*68.45*/("""<em>-</em>
                                        """)))}/*69.43*/else/*69.48*/{_display_(Seq[Any](format.raw/*69.49*/("""
                                            """),_display_(/*70.46*/member/*70.52*/.profile.getFirstName),format.raw/*70.73*/("""
                                        """)))}),format.raw/*71.42*/("""
                                    """)))}),format.raw/*72.38*/("""
                                    """),format.raw/*73.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*75.38*/if(member.profile != null)/*75.64*/ {_display_(Seq[Any](format.raw/*75.66*/("""
                                        """),_display_(/*76.42*/if(member.profile.getLastName == null)/*76.80*/ {_display_(Seq[Any](format.raw/*76.82*/("""
                                            """),format.raw/*77.45*/("""<em>-</em>
                                        """)))}/*78.43*/else/*78.48*/{_display_(Seq[Any](format.raw/*78.49*/("""
                                            """),_display_(/*79.46*/member/*79.52*/.profile.getLastName),format.raw/*79.72*/("""
                                        """)))}),format.raw/*80.42*/("""
                                    """)))}),format.raw/*81.38*/("""
                                    """),format.raw/*82.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*84.38*/if(member.profile != null)/*84.64*/ {_display_(Seq[Any](format.raw/*84.66*/("""
                                        """),_display_(/*85.42*/if(member.profile.phoneNumber == null)/*85.80*/ {_display_(Seq[Any](format.raw/*85.82*/("""
                                            """),format.raw/*86.45*/("""<em>-</em>
                                        """)))}/*87.43*/else/*87.48*/{_display_(Seq[Any](format.raw/*87.49*/("""
                                            """),_display_(/*88.46*/member/*88.52*/.profile.phoneNumber),format.raw/*88.72*/("""
                                        """)))}),format.raw/*89.42*/("""
                                    """)))}),format.raw/*90.38*/("""
                                    """),format.raw/*91.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*93.38*/if(member.profile != null)/*93.64*/ {_display_(Seq[Any](format.raw/*93.66*/("""
                                        """),_display_(/*94.42*/form(routes.PrintController.printUserDetails(member.id), 'class -> "topRight")/*94.120*/ {_display_(Seq[Any](format.raw/*94.122*/("""
                                            """),format.raw/*95.45*/("""<input type="submit" value=""""),_display_(/*95.74*/member/*95.80*/.uid),format.raw/*95.84*/("""" class="btn success">
                                            """)))}),format.raw/*96.46*/("""
                                    """)))}),format.raw/*97.38*/("""
                                    """),format.raw/*98.37*/("""</td>
                                    <td class="center">
                                    """),_display_(/*100.38*/if(member.profile != null)/*100.64*/ {_display_(Seq[Any](format.raw/*100.66*/("""
                                        """),_display_(/*101.42*/form(routes.SalaryController.printLector(member.id), 'class -> "topRight")/*101.116*/ {_display_(Seq[Any](format.raw/*101.118*/("""
                                            """),format.raw/*102.45*/("""<input type="submit" value=""""),_display_(/*102.74*/member/*102.80*/.uid),format.raw/*102.84*/("""" class="btn success">
                                            """)))}),format.raw/*103.46*/("""
                                    """)))}),format.raw/*104.38*/("""
                                    """),format.raw/*105.37*/("""</td>
                                </tr>
                            """)))}),format.raw/*107.30*/("""
                            """),format.raw/*108.29*/("""</tbody>
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
                  DATE: Thu May 18 01:08:47 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/tables/workers.scala.html
                  HASH: 65b77528cc8789b18991e6179f4da8ca3181a0f8
                  MATRIX: 762->1|882->47|906->63|986->67|1017->72|1056->85|1070->91|1126->127|1231->205|1259->206|1294->215|1366->261|1393->262|1426->268|1456->271|1484->272|1520->281|1642->376|1670->377|1703->383|1740->400|1761->412|1842->416|1878->425|1954->474|1969->480|2057->547|2114->577|2129->583|2224->657|2389->794|2418->795|2463->812|2526->847|2555->848|2604->869|2665->902|2694->903|2737->918|2766->919|2823->28|2851->397|2880->937|2909->940|2978->1000|3018->1002|3050->1007|4159->2089|4201->2115|4241->2117|4302->2150|4428->2249|4463->2275|4503->2277|4572->2319|4620->2358|4660->2360|4733->2405|4804->2458|4817->2463|4856->2464|4929->2510|4944->2516|4986->2537|5059->2579|5128->2617|5193->2654|5319->2753|5354->2779|5394->2781|5463->2823|5510->2861|5550->2863|5623->2908|5694->2961|5707->2966|5746->2967|5819->3013|5834->3019|5875->3039|5948->3081|6017->3119|6082->3156|6208->3255|6243->3281|6283->3283|6352->3325|6399->3363|6439->3365|6512->3410|6583->3463|6596->3468|6635->3469|6708->3515|6723->3521|6764->3541|6837->3583|6906->3621|6971->3658|7097->3757|7132->3783|7172->3785|7241->3827|7329->3905|7370->3907|7443->3952|7499->3981|7514->3987|7539->3991|7638->4059|7707->4097|7772->4134|7899->4233|7935->4259|7976->4261|8046->4303|8131->4377|8173->4379|8247->4424|8304->4453|8320->4459|8346->4463|8446->4531|8516->4569|8582->4606|8687->4679|8745->4708
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|36->6|36->6|37->7|39->9|39->9|41->11|41->11|41->11|42->12|44->14|44->14|46->16|48->20|48->20|50->20|51->21|52->22|52->22|52->22|53->23|53->23|53->23|56->26|56->26|57->27|57->27|57->27|58->28|59->29|59->29|60->30|60->30|63->1|64->18|66->32|68->34|68->34|68->34|69->35|96->62|96->62|96->62|97->63|100->66|100->66|100->66|101->67|101->67|101->67|102->68|103->69|103->69|103->69|104->70|104->70|104->70|105->71|106->72|107->73|109->75|109->75|109->75|110->76|110->76|110->76|111->77|112->78|112->78|112->78|113->79|113->79|113->79|114->80|115->81|116->82|118->84|118->84|118->84|119->85|119->85|119->85|120->86|121->87|121->87|121->87|122->88|122->88|122->88|123->89|124->90|125->91|127->93|127->93|127->93|128->94|128->94|128->94|129->95|129->95|129->95|129->95|130->96|131->97|132->98|134->100|134->100|134->100|135->101|135->101|135->101|136->102|136->102|136->102|136->102|137->103|138->104|139->105|141->107|142->108
                  -- GENERATED --
              */
          