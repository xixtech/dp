
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
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Masarykáč</title>
        <link href='"""),_display_(/*13.22*/routes/*13.28*/.Assets.at("stylesheets/sb-admin-2.css")),format.raw/*13.68*/("""' rel="stylesheet" type="text/css">
        """),_display_(/*14.10*/stylesheets),format.raw/*14.21*/("""

        """),format.raw/*16.9*/("""<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*25.14*/navigation()),format.raw/*25.26*/("""

            """),format.raw/*27.13*/("""<div id="page-wrapper">
                """),_display_(/*28.18*/if(flash.containsKey("success"))/*28.50*/ {_display_(Seq[Any](format.raw/*28.52*/("""
                    """),format.raw/*29.21*/("""<div class="alert-message warning">
                        <strong>ERROR!</strong> """),_display_(/*30.50*/flash/*30.55*/.get("success")),format.raw/*30.70*/("""
                    """),format.raw/*31.21*/("""</div>
                """)))}),format.raw/*32.18*/("""
                """),_display_(/*33.18*/content),format.raw/*33.25*/("""
            """),format.raw/*34.13*/("""</div>
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
        """),format.raw/*50.9*/("""<script type="text/javascript" src=""""),_display_(/*50.46*/routes/*50.52*/.Assets.at("javascript/jquery-3.1.1.min.js")),format.raw/*50.96*/(""""></script>
        <!-- Custom Theme JavaScript -->
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
                  DATE: Sat Apr 29 09:13:04 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: 9e2191fa369da9995b9ec3e661f2fddc866ae159
                  MATRIX: 758->1|961->108|989->110|1370->464|1385->470|1446->510|1518->555|1550->566|1587->576|2071->1033|2104->1045|2146->1059|2214->1100|2255->1132|2295->1134|2344->1155|2456->1240|2470->1245|2506->1260|2555->1281|2610->1305|2655->1323|2683->1330|2724->1343|2884->1476|2899->1482|2958->1520|3063->1598|3078->1604|3146->1651|3254->1732|3269->1738|3334->1782|3383->1804|3411->1811|3447->1820|3511->1857|3526->1863|3591->1907|3693->1982|3708->1988|3768->2027
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|47->16|56->25|56->25|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|64->33|65->34|72->41|72->41|72->41|75->44|75->44|75->44|78->47|78->47|78->47|80->49|80->49|81->50|81->50|81->50|81->50|83->52|83->52|83->52
                  -- GENERATED --
              */
          