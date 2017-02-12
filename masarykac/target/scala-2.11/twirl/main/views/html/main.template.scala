
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

        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
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
        <script src='"""),_display_(/*35.23*/routes/*35.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*35.67*/("""'></script>

        <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*38.23*/routes/*38.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*38.76*/("""'></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src='"""),_display_(/*41.23*/routes/*41.29*/.Assets.at("lib/metisMenu/metisMenu.min.js")),format.raw/*41.73*/("""'></script>

        """),_display_(/*43.10*/scripts),format.raw/*43.17*/("""

        """),format.raw/*45.9*/("""<!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*46.23*/routes/*46.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*46.68*/("""'></script>
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
                  DATE: Sun Feb 12 17:54:42 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: b6510a19689046255ed8b802f24fff428dfacb5c
                  MATRIX: 758->1|961->108|989->110|1332->426|1358->431|1415->461|1430->467|1491->507|1563->552|1595->563|1632->573|2116->1030|2149->1042|2191->1056|2259->1097|2287->1104|2328->1117|2487->1249|2502->1255|2561->1293|2666->1371|2681->1377|2749->1424|2857->1505|2872->1511|2937->1555|2986->1577|3014->1584|3051->1594|3133->1649|3148->1655|3208->1694
                  LINES: 27->1|32->1|34->3|43->12|43->12|44->13|44->13|44->13|45->14|45->14|47->16|56->25|56->25|58->27|59->28|59->28|60->29|66->35|66->35|66->35|69->38|69->38|69->38|72->41|72->41|72->41|74->43|74->43|76->45|77->46|77->46|77->46
                  -- GENERATED --
              */
          