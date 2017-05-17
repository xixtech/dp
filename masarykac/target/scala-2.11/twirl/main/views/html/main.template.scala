
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
            """),_display_(/*26.14*/navigation()),format.raw/*26.26*/("""

        """),format.raw/*28.9*/("""<div id="page-wrapper">
            """),_display_(/*29.14*/if(flash.containsKey("success"))/*29.46*/ {_display_(Seq[Any](format.raw/*29.48*/("""
                """),format.raw/*30.17*/("""<div class="alert-message warning">
                    <strong>CHYBA!</strong> """),_display_(/*31.46*/flash/*31.51*/.get("success")),format.raw/*31.66*/("""
                """),format.raw/*32.17*/("""</div>
            """)))}),format.raw/*33.14*/("""
            """),_display_(/*34.14*/content),format.raw/*34.21*/("""
        """),format.raw/*35.9*/("""</div>
            <!-- /#page-wrapper -->
        </div>
            <!-- /#wrapper -->


            <!-- jQuery -->
        <script src='"""),_display_(/*42.23*/routes/*42.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*42.67*/("""'></script>

            <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*45.23*/routes/*45.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*45.76*/("""'></script>

            <!-- Metis Menu Plugin JavaScript -->
        <script src='"""),_display_(/*48.23*/routes/*48.29*/.Assets.at("lib/metisMenu/metisMenu.min.js")),format.raw/*48.73*/("""'></script>

        """),_display_(/*50.10*/scripts),format.raw/*50.17*/("""

            """),format.raw/*52.13*/("""<!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*53.23*/routes/*53.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*53.68*/("""'></script>
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
                  DATE: Thu May 18 00:13:24 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: 8d4baddfcb8a41a3c376060aeecdab08606a4b49
                  MATRIX: 758->1|961->108|989->110|1388->482|1403->488|1464->528|1536->573|1568->584|1610->598|2103->1064|2136->1076|2173->1086|2237->1123|2278->1155|2318->1157|2363->1174|2471->1255|2485->1260|2521->1275|2566->1292|2617->1312|2658->1326|2686->1333|2722->1342|2890->1483|2905->1489|2964->1527|3073->1609|3088->1615|3156->1662|3268->1747|3283->1753|3348->1797|3397->1819|3425->1826|3467->1840|3549->1895|3564->1901|3624->1940
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|47->16|57->26|57->26|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|65->34|65->34|66->35|73->42|73->42|73->42|76->45|76->45|76->45|79->48|79->48|79->48|81->50|81->50|83->52|84->53|84->53|84->53
                  -- GENERATED --
              */
          