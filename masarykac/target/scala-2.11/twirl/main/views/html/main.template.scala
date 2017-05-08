
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
        <style type="text/css"><!--
        body """),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""
            """),format.raw/*13.13*/("""font-family: Technika;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""

        """),format.raw/*16.9*/("""--></style>
        <title>Masarykáč</title>
        <link href='"""),_display_(/*18.22*/routes/*18.28*/.Assets.at("stylesheets/sb-admin-2.css")),format.raw/*18.68*/("""' rel="stylesheet" type="text/css">
        """),_display_(/*19.10*/stylesheets),format.raw/*19.21*/("""

        """),format.raw/*21.9*/("""<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*30.14*/navigation()),format.raw/*30.26*/("""

            """),format.raw/*32.13*/("""<div id="page-wrapper">
                """),_display_(/*33.18*/if(flash.containsKey("success"))/*33.50*/ {_display_(Seq[Any](format.raw/*33.52*/("""
                    """),format.raw/*34.21*/("""<div class="alert-message warning">
                        <strong>CHYBA!</strong> """),_display_(/*35.50*/flash/*35.55*/.get("success")),format.raw/*35.70*/("""
                    """),format.raw/*36.21*/("""</div>
                """)))}),format.raw/*37.18*/("""
                """),_display_(/*38.18*/content),format.raw/*38.25*/("""
            """),format.raw/*39.13*/("""</div>
            <!-- /#page-wrapper -->
        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->

        <script src='"""),_display_(/*46.23*/routes/*46.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*46.67*/("""'></script>

        <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*49.23*/routes/*49.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*49.76*/("""'></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src='"""),_display_(/*52.23*/routes/*52.29*/.Assets.at("lib/metisMenu/metisMenu.min.js")),format.raw/*52.73*/("""'></script>

        """),_display_(/*54.10*/scripts),format.raw/*54.17*/("""
        """),format.raw/*55.9*/("""<script type="text/javascript" src=""""),_display_(/*55.46*/routes/*55.52*/.Assets.at("javascript/jquery-3.1.1.min.js")),format.raw/*55.96*/(""""></script>
        <!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*57.23*/routes/*57.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*57.68*/("""'></script>
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
                  DATE: Mon May 08 19:25:34 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/main.scala.html
                  HASH: e4622dde55a78d5777c5a32e1255ccde2c60666a
                  MATRIX: 758->1|961->108|989->110|1383->476|1412->477|1453->490|1511->521|1540->522|1577->532|1670->598|1685->604|1746->644|1818->689|1850->700|1887->710|2371->1167|2404->1179|2446->1193|2514->1234|2555->1266|2595->1268|2644->1289|2756->1374|2770->1379|2806->1394|2855->1415|2910->1439|2955->1457|2983->1464|3024->1477|3184->1610|3199->1616|3258->1654|3363->1732|3378->1738|3446->1785|3554->1866|3569->1872|3634->1916|3683->1938|3711->1945|3747->1954|3811->1991|3826->1997|3891->2041|3993->2116|4008->2122|4068->2161
                  LINES: 27->1|32->1|34->3|43->12|43->12|44->13|45->14|45->14|47->16|49->18|49->18|49->18|50->19|50->19|52->21|61->30|61->30|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|68->37|69->38|69->38|70->39|77->46|77->46|77->46|80->49|80->49|80->49|83->52|83->52|83->52|85->54|85->54|86->55|86->55|86->55|86->55|88->57|88->57|88->57
                  -- GENERATED --
              */
          