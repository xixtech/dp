
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String = "", scripts: Html = HtmlFormat.empty, stylesheets: Html = HtmlFormat.empty)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.109*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="cs">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <meta name="description" content=""/>
        <meta name="author" content="Martin Tyrol"/>
        <meta charset="UTF-8" />

        <title>Masarykáč</title>
        <link href='"""),_display_(/*13.22*/routes/*13.28*/.Assets.at("stylesheets/sb-admin-2.css")),format.raw/*13.68*/("""' rel="stylesheet" type="text/css">
        """),_display_(/*14.10*/stylesheets),format.raw/*14.21*/("""

            """),format.raw/*16.13*/("""<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
            <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*25.14*/navigation()),format.raw/*25.26*/("""

        """),format.raw/*27.9*/("""<div id="page-wrapper">
            """),_display_(/*28.14*/if(flash.containsKey("success"))/*28.46*/ {_display_(Seq[Any](format.raw/*28.48*/("""
                """),format.raw/*29.17*/("""<div class="alert-message warning">
                    <strong>CHYBA!</strong> """),_display_(/*30.46*/flash/*30.51*/.get("success")),format.raw/*30.66*/("""
                """),format.raw/*31.17*/("""</div>
            """)))}),format.raw/*32.14*/("""
            """),_display_(/*33.14*/content),format.raw/*33.21*/("""
        """),format.raw/*34.9*/("""</div>
            <!-- /#page-wrapper -->
        </div>
            <!-- /#wrapper -->


            <!-- jQuery -->
        <script src='"""),_display_(/*41.23*/routes/*41.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*41.67*/("""'></script>

            <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*44.23*/routes/*44.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*44.76*/("""'></script>

            <!-- Metis Menu Plugin JavaScript -->
        <script src='"""),_display_(/*47.23*/routes/*47.29*/.Assets.at("lib/metisMenu/metisMenu.min.js")),format.raw/*47.73*/("""'></script>

        """),_display_(/*49.10*/scripts),format.raw/*49.17*/("""

            """),format.raw/*51.13*/("""<!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*52.23*/routes/*52.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*52.68*/("""'></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,scripts:Html,stylesheets:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts,stylesheets)(content)

  def f:((String,Html,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts,stylesheets) => (content) => apply(title,scripts,stylesheets)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat May 13 11:53:51 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: 45053f0a60df53f9d688eea2e57bac60bb17d1a5
                  MATRIX: 758->1|961->108|989->110|1388->482|1403->488|1464->528|1536->573|1568->584|1610->598|2102->1063|2135->1075|2172->1085|2236->1122|2277->1154|2317->1156|2362->1173|2470->1254|2484->1259|2520->1274|2565->1291|2616->1311|2657->1325|2685->1332|2721->1341|2889->1482|2904->1488|2963->1526|3072->1608|3087->1614|3155->1661|3267->1746|3282->1752|3347->1796|3396->1818|3424->1825|3466->1839|3548->1894|3563->1900|3623->1939
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|47->16|56->25|56->25|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|64->33|65->34|72->41|72->41|72->41|75->44|75->44|75->44|78->47|78->47|78->47|80->49|80->49|82->51|83->52|83->52|83->52
                  -- GENERATED --
              */
          