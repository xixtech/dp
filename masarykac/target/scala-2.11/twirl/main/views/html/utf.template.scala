
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object utf_Scope0 {
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

class utf extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(map: java.util.Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/html">
    <head>
        <title>Platy tisk</title>
        <meta charset="UTF-8" />
        <style type="text/css"><!--
        body """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/("""
            """),format.raw/*11.13*/("""font-family: Technika;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""

        """),format.raw/*14.9*/("""--></style>
        <script src='"""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/dynamicFields.js")),format.raw/*15.71*/("""'></script>
    </head>
    <body>
        <button onclick="export2Word(window.docx)">Export</button>
        <div id="docx">
            <div class="WordSection1">
        <header>
            <table style="width: 500px">
                <tr>
                    <td> </td>
                    <td>ČESKÉ VYSOKÉ UČENÍ TECHNICKÉ V PRAZE</td>
                </tr>
                <tr>
                    <td> </td>
                    <td>Masarykův ústav vyšších studií</td>
                </tr>
                <tr>
                    <td> </td>
                    <td>ředitelka</td>
                </tr>
                <tr>
                    <td> </td>
                    <td>Kolejní 2637/2a, 160 00 Praha 6</td>
                </tr>
            </table>
        </header>
        </br>
        <section>
            <article>
                <header>
                    <h2>Změna platu</h2>
                </header>

                <p>Žádám Vás o změnu platového výměru k """),_display_(/*48.58*/map/*48.61*/.get("date")),format.raw/*48.73*/(""".</br>Zároveň Vás žádám, aby kmenovost pracovnice byla na středisku 32165. </p>

            </article>

            <article>
                <p>Osobní číslo: """),_display_(/*53.35*/map/*53.38*/.get("personalNumber")),format.raw/*53.60*/(""" """),format.raw/*53.61*/("""</br>
                    Příjmení a jméno: """),_display_(/*54.40*/map/*54.43*/.get("surname")),format.raw/*54.58*/(""" """),_display_(/*54.60*/map/*54.63*/.get("name")),format.raw/*54.75*/("""</p>
            </article>

            <article>
                <table style="width: 650px">
                    <tr>
                        <th>Zakázka</th>
                        <th>Tarifní plat</th>
                        <th>Osobní ohodnocení</th>
                        <th>Příplatek za vedení</th>
                    </tr>
                    <tr>
                        <td>číslo1</td>
                        <td>11000</td>
                        <td>5500</td>
                        <td>100Kč</td>

                    </tr>
                    <tr>
                        <td>číslo2</td>
                        <td>11000</td>
                        <td>100 Kč</td>
                        <td>100 Kč</td>
                    </tr>
                    <tr>
                        <td>prázdné</td>
                        <td>10 Kč</td>
                        <td>20 Kč</td>
                        <td>30 Kč</td>
                    </tr>
                    <tr>
                        <td> </td>

                    </tr>
                    <tr>
                        <td>Celkem od 1. října 2016</td>
                        <td rowspan="4">29000</td>

                    </tr>
                    <tr>
                        <td>Předchozí plat</td>
                        <td rowspan="4">29000</td>
                    </tr>
                </table>
            </article>
        </section>
        </br></br>
        <article>
            <p>Děkuji a jsem s pozdravem</p>

        </article>
        <article>
            <p>doc. Ing. Lenka Švecová, Ph.D.</br>
                ředitelka Masarykova ústavu vyšších studií</br>
                České vysoké učení technické v Praze</p>
        </article>
        </br></br>
        </br></br>
        <footer>
            <table style="width: 750px">
                <tr>
                    <td><p style="font-size:10px">ČVUT v Praze</p></td>
                    <td><p style="font-size:10px">tel.: (+420) 224 353 161</p></td>
                    <td><p style="font-size:10px">IČO: 68 40 77 00</p></td>
                </tr>
                <tr>
                    <td><p style="font-size:10px">Masarykův ústav vyšších studií</p></td>
                    <td> </td>
                    <td><p style="font-size:10px">DIČ: CZ 68 40 77 00</p></td>
                </tr>
                <tr>
                    <td><p style="font-size:10px">ředitelka</p></td>
                    <td><p style="font-size:10px">lenka.svecova&#64;cvut.cz</p></td>
                    <td><p style="font-size:10px">Bankovní spojení: KB Praha 6 č.ú.:19-8491620277/0100 </p></td>
                </tr>
                <tr>
                    <td><p style="font-size:10px">Kolejní 2637/2a, 160 00 Praha 6</p></td>
                    <td><p style="font-size:10px">www.muvs.cvut.cz</p></td>
                    <td><p style="font-size:10px">Číslo jednací živnostenského listu: ŽO/0000035/99/ZAK</p></td>
                </tr>
            </table>
        </footer>
            </div>
        </div>
    </body>

</html>"""))
      }
    }
  }

  def render(map:java.util.Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(map)

  def f:((java.util.Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (map) => apply(map)

  def ref: this.type = this

}


}

/**/
object utf extends utf_Scope0.utf
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 00:33:48 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/utf.scala.html
                  HASH: 1bb9109e33bf5a16a8a58529699ef591ac545f75
                  MATRIX: 764->1|895->37|923->39|1138->226|1167->227|1208->240|1266->271|1295->272|1332->282|1393->316|1408->322|1471->364|2486->1352|2498->1355|2531->1367|2719->1528|2731->1531|2774->1553|2803->1554|2875->1599|2887->1602|2923->1617|2952->1619|2964->1622|2997->1634
                  LINES: 27->1|32->1|34->3|41->10|41->10|42->11|43->12|43->12|45->14|46->15|46->15|46->15|79->48|79->48|79->48|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54
                  -- GENERATED --
              */
          