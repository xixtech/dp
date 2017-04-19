
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

<html xmlns:o='urn:schemas-microsoft-com:office:office' xmlns:w='urn:schemas-microsoft-com:office:word' xmlns='http://www.w3.org/TR/REC-html40'>
    <head>
        <title>Platy tisk</title>
        <meta charset="UTF-8" />
        <style type="text/css"><!--
        body """),format.raw/*10.14*/("""{"""),format.raw/*10.15*/("""
            """),format.raw/*11.13*/("""font-family: Technika;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""

        """),format.raw/*14.9*/("""--></style>

        <script src='"""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/dynamicFields.js")),format.raw/*16.71*/("""'></script>
    </head>
    <body onload="export2Word(window.docx,'"""),_display_(/*18.45*/map/*18.48*/.get("surname")),format.raw/*18.63*/("""','"""),_display_(/*18.67*/map/*18.70*/.get("name")),format.raw/*18.82*/("""').click();">

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

                <p>Žádám Vás o změnu platového výměru k """),_display_(/*49.58*/map/*49.61*/.get("date")),format.raw/*49.73*/(""".</br>Zároveň Vás žádám, aby kmenovost pracovnice byla na středisku 32165. </p>

            </article>

            <article>
                <p>Osobní číslo: """),_display_(/*54.35*/map/*54.38*/.get("personalNumber")),format.raw/*54.60*/(""" """),format.raw/*54.61*/("""</br>
                    Příjmení a jméno: """),_display_(/*55.40*/map/*55.43*/.get("surname")),format.raw/*55.58*/(""" """),_display_(/*55.60*/map/*55.63*/.get("name")),format.raw/*55.75*/("""</p>
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
                  DATE: Wed Apr 19 17:42:54 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/utf.scala.html
                  HASH: 046b19a1db1233facc80408f87b3b7577805e5c3
                  MATRIX: 764->1|895->37|923->39|1240->328|1269->329|1310->342|1368->373|1397->374|1434->384|1496->419|1511->425|1574->467|1669->535|1681->538|1717->553|1748->557|1760->560|1793->572|2721->1473|2733->1476|2766->1488|2954->1649|2966->1652|3009->1674|3038->1675|3110->1720|3122->1723|3158->1738|3187->1740|3199->1743|3232->1755
                  LINES: 27->1|32->1|34->3|41->10|41->10|42->11|43->12|43->12|45->14|47->16|47->16|47->16|49->18|49->18|49->18|49->18|49->18|49->18|80->49|80->49|80->49|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55
                  -- GENERATED --
              */
          