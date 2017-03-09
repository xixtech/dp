
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
                """),_display_(/*28.18*/content),format.raw/*28.25*/("""
            """),format.raw/*29.13*/("""</div>
            <!-- /#page-wrapper -->
        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->

        <script src='"""),_display_(/*36.23*/routes/*36.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*36.67*/("""'></script>

        <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*39.23*/routes/*39.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*39.76*/("""'></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src='"""),_display_(/*42.23*/routes/*42.29*/.Assets.at("lib/metisMenu/metisMenu.min.js")),format.raw/*42.73*/("""'></script>

        """),_display_(/*44.10*/scripts),format.raw/*44.17*/("""
        """),format.raw/*45.9*/("""<script type="text/javascript" src=""""),_display_(/*45.46*/routes/*45.52*/.Assets.at("javascript/jquery-3.1.1.min.js")),format.raw/*45.96*/(""""></script>
        <!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*47.23*/routes/*47.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*47.68*/("""'></script>
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
                  DATE: Tue Mar 07 18:57:45 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: ec821ac220d29180f4ab4125537e592578c63e12
                  MATRIX: 758->1|961->108|989->110|1370->464|1385->470|1446->510|1518->555|1550->566|1587->576|2071->1033|2104->1045|2146->1059|2214->1100|2242->1107|2283->1120|2443->1253|2458->1259|2517->1297|2622->1375|2637->1381|2705->1428|2813->1509|2828->1515|2893->1559|2942->1581|2970->1588|3006->1597|3070->1634|3085->1640|3150->1684|3252->1759|3267->1765|3327->1804
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|47->16|56->25|56->25|58->27|59->28|59->28|60->29|67->36|67->36|67->36|70->39|70->39|70->39|73->42|73->42|73->42|75->44|75->44|76->45|76->45|76->45|76->45|78->47|78->47|78->47
                  -- GENERATED --
              */
          