
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
            """),format.raw/*11.13*/("""font-family: "Berlin Sans FB Demi";
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""--></style>
    </head>
    <body>
        <header>
            <table style="width:500px">
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

                <p>Žádám Vás o změnu platového výměru k """),_display_(/*43.58*/map/*43.61*/.get("date")),format.raw/*43.73*/(""".</br>Zároveň Vás žádám, aby kmenovost pracovnice byla na středisku 32165. </p>

            </article>

            <article>
                <p>Osobní číslo: """),_display_(/*48.35*/map/*48.38*/.get("personalNumber")),format.raw/*48.60*/(""" """),format.raw/*48.61*/("""</br>Příjmení a jméno: """),_display_(/*48.85*/map/*48.88*/.get("surname")),format.raw/*48.103*/(""" """),_display_(/*48.105*/map/*48.108*/.get("name")),format.raw/*48.120*/("""</p>
            </article>

            <article>
                <table style="width:650px">
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
                        <td>Kč</td>

                    </tr>
                    <tr>
                        <td>číslo2</td>
                        <td>11000</td>
                        <td>Kč</td>
                        <td>Kč</td>
                    </tr>
                    <tr>
                        <td>pr�zdn�</td>
                        <td>Kč</td>
                        <td>Kč</td>
                        <td>Kč</td>
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

        <article>
            <p>Děkuji a jsem s pozdravem</p>

        </article>
        </br>
        <article>
            <p>doc. Ing. Lenka Švecová, Ph.D.</br>
                ředitelka Masarykova ústavu vyšších studií</br>
                České vysoké učení technické v Praze</p>
        </article>
        </br></br>
        <footer>
            <table style="width:700px">
                <tr>
                    <td>ČVUT v Praze</td>
                    <td>tel.: (+420) 224 353 161</td>
                    <td>IČO: 68 40 77 00</td>
                </tr>
                <tr>
                    <td>Masarykův ústav vyšších studií</td>
                    <td> </td>
                    <td>DIČ: CZ 68 40 77 00</td>
                </tr>
                <tr>
                    <td>ředitelka</td>
                    <td>lenka.svecova&#64;cvut.cz</td>
                    <td>Bankovní spojení: KB Praha 6 č.ú.:19-8491620277/0100 </td>
                </tr>
                <tr>
                    <td>Kolejní 2637/2a, 160 00 Praha 6</td>
                    <td>www.muvs.cvut.cz</td>
                    <td>Číslo jednací živnostenského listu: ŽO/0000035/99/ZAK</td>
                </tr>
            </table>
        </footer>

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
                  DATE: Mon Mar 06 12:15:54 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/utf.scala.html
                  HASH: 4ea03142b7307ba970d63be1be54aa85f4533ea2
                  MATRIX: 764->1|895->37|923->39|1138->226|1167->227|1208->240|1279->284|1308->285|1344->294|2228->1151|2240->1154|2273->1166|2461->1327|2473->1330|2516->1352|2545->1353|2596->1377|2608->1380|2645->1395|2675->1397|2688->1400|2722->1412
                  LINES: 27->1|32->1|34->3|41->10|41->10|42->11|43->12|43->12|44->13|74->43|74->43|74->43|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48
                  -- GENERATED --
              */
          