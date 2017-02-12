
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registerPerson_Scope0 {
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

class registerPerson extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Member],Form[Person],Form[Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Member], personForm: Form[Person], profileForm: Form[Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*3.2*/localScripts/*3.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<!-- Morris Charts JavaScript -->
    <script src='"""),_display_(/*5.19*/routes/*5.25*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*5.67*/("""'></script>
    <script src='"""),_display_(/*6.19*/routes/*6.25*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*6.65*/("""'></script>
    <script src='"""),_display_(/*7.19*/routes/*7.25*/.Assets.at("javascripts/morris-data.js")),format.raw/*7.65*/("""'></script>
""")))};
Seq[Any](format.raw/*1.82*/("""
"""),format.raw/*8.2*/("""
"""),_display_(/*9.2*/main(scripts = localScripts)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
    """),format.raw/*10.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Registrace</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
        <!-- /.row -->
    <div class="container">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div class="panel-body">
                """),_display_(/*21.18*/helper/*21.24*/.form(action = routes.PersonController.save)/*21.68*/ {_display_(Seq[Any](format.raw/*21.70*/("""

                    """),format.raw/*23.21*/("""<fieldset>
                        <legend>Přihlašovací údaje</legend>
                        """),_display_(/*25.26*/inputText(
                            signupForm("email"),
                            '_label -> "Email",
                            'class -> "form-control",
                            '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                            '_error -> signupForm.globalError
                        )),format.raw/*31.26*/("""

                        """),_display_(/*33.26*/inputPassword(
                            signupForm("password"),
                            '_label -> "Heslo",
                            'class -> "form-control",
                            '_help -> "Heslo musí mít nejméně 6 znaků."
                        )),format.raw/*38.26*/("""

                        """),_display_(/*40.26*/inputPassword(
                            signupForm("repeatPassword"),
                            '_label -> "Heslo pro kontrolu",
                            'class -> "form-control",
                            '_help -> "Prosím zadejte znovu heslo.",
                            '_error -> signupForm.error("password")
                        )),format.raw/*46.26*/("""

                    """),format.raw/*48.21*/("""</fieldset>

                    <fieldset>

                        <legend>Kontaktní informace</legend>

                        """),_display_(/*54.26*/inputText(
                            personForm("salary"),
                            '_label -> "Plat",
                            'class -> "form-control",
                            '_help -> "Zadejte plat.",
                            '_error -> personForm.globalError
                        )),format.raw/*60.26*/("""
                        """),_display_(/*61.26*/inputText(
                            personForm("jobTitle"),
                            '_label -> "Zařazení",
                            'class -> "form-control",
                            '_help -> "Zadejte zařazení.",
                            '_error -> personForm.globalError
                        )),format.raw/*67.26*/("""

                        """),_display_(/*69.26*/select(
                            personForm("role"),
                            options = options(Roles.selectCollection),
                            '_label -> "Role",
                            'class -> "form-control",
                            '_help -> "Vyberte zařazení.",
                            '_error -> personForm.globalError
                        )),format.raw/*76.26*/("""

                        """),_display_(/*78.26*/inputText(
                            profileForm("firstName"),
                            '_label -> "Křestní jméno",
                            'class -> "form-control",
                            '_help -> "Zadejte křestní jméno.",
                            '_error -> profileForm.globalError
                        )),format.raw/*84.26*/("""

                        """),_display_(/*86.26*/inputText(
                            profileForm("lastName"),
                            '_label -> "Příjmení",
                            'class -> "form-control",
                            '_help -> "Zadejte příjmení.",
                            '_error -> profileForm.globalError
                        )),format.raw/*92.26*/("""

                        """),_display_(/*94.26*/inputText(
                            profileForm("phoneNumber"),
                            '_label -> "Telefonní číslo",
                            'class -> "form-control",
                            '_help -> "Zadejte telefonní číslo.",
                            '_error -> profileForm.globalError
                        )),format.raw/*100.26*/("""

                    """),format.raw/*102.21*/("""</fieldset>

                    <div class="actions">

                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Uložit">
                        <a href=""""),_display_(/*107.35*/routes/*107.41*/.Application.index()),format.raw/*107.61*/("""" class="btn">Zrušit</a>
                    </div>

                """)))}),format.raw/*110.18*/("""
                """),format.raw/*111.17*/("""</div>
            </div>
        </div>
    </div>
""")))}),format.raw/*115.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[Member],personForm:Form[Person],profileForm:Form[Profile]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,personForm,profileForm)

  def f:((Form[Member],Form[Person],Form[Profile]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,personForm,profileForm) => apply(signupForm,personForm,profileForm)

  def ref: this.type = this

}


}

/**/
object registerPerson extends registerPerson_Scope0.registerPerson
              /*
                  -- GENERATED --
                  DATE: Sun Feb 12 21:04:20 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/registerPerson.scala.html
                  HASH: 4e7e1e3bbc984ce760c358cb31f22fb6ac878273
                  MATRIX: 796->1|969->102|989->114|1069->118|1101->124|1180->177|1194->183|1256->225|1313->256|1327->262|1387->302|1444->333|1458->339|1518->379|1571->81|1599->393|1627->396|1663->424|1702->426|1735->432|2120->790|2135->796|2188->840|2228->842|2280->866|2405->964|2764->1302|2820->1331|3112->1602|3168->1631|3545->1987|3597->2011|3762->2149|4093->2459|4147->2486|4488->2806|4544->2835|4946->3216|5002->3245|5356->3578|5412->3607|5755->3929|5811->3958|6172->4297|6225->4321|6450->4518|6466->4524|6508->4544|6613->4617|6660->4635|6748->4692
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|40->8|41->9|41->9|41->9|42->10|53->21|53->21|53->21|53->21|55->23|57->25|63->31|65->33|70->38|72->40|78->46|80->48|86->54|92->60|93->61|99->67|101->69|108->76|110->78|116->84|118->86|124->92|126->94|132->100|134->102|139->107|139->107|139->107|142->110|143->111|147->115
                  -- GENERATED --
              */
          