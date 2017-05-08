
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

"""),_display_(/*10.2*/main(scripts = localScripts)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
    """),format.raw/*11.5*/("""<div class="row">
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
                """),_display_(/*22.18*/helper/*22.24*/.form(action = routes.PersonController.save)/*22.68*/ {_display_(Seq[Any](format.raw/*22.70*/("""

                    """),format.raw/*24.21*/("""<fieldset>
                        <legend>Přihlašovací údaje</legend>
                        <div class="row">
                            <div class="col-md-12">
                            """),_display_(/*28.30*/inputText(
                                signupForm("email"),
                                '_label -> "Email",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                '_error -> signupForm.globalError
                            )),format.raw/*34.30*/("""
                            """),format.raw/*35.29*/("""</div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                            """),_display_(/*39.30*/inputText(
                                signupForm("uid"),
                                '_label -> "Uživatelské jméno",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte platné uživatelské jméno.",
                                '_error -> signupForm.globalError
                            )),format.raw/*45.30*/("""
                            """),format.raw/*46.29*/("""</div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                            """),_display_(/*50.30*/inputPassword(
                                signupForm("password"),
                                '_label -> "Heslo",
                                'class -> "form-control",
                                '_help -> "Heslo musí mít nejméně 6 znaků."
                            )),format.raw/*55.30*/("""
                            """),format.raw/*56.29*/("""</div>
                            <div class="col-md-6">
                            """),_display_(/*58.30*/inputPassword(
                                signupForm("repeatPassword"),
                                '_label -> "Heslo pro kontrolu",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte znovu heslo.",
                                '_error -> signupForm.error("password")
                            )),format.raw/*64.30*/("""
                            """),format.raw/*65.29*/("""</div>
                        </div>
                    </fieldset>

                    <fieldset>

                        <legend>Kontaktní informace</legend>
                        <div class="row">
                            <div class="col-md-12">
                            """),_display_(/*74.30*/inputText(
                                personForm("salary"),
                                '_label -> "Plat",
                                'class -> "form-control",
                                '_help -> "Zadejte plat.",
                                '_error -> personForm.globalError
                            )),format.raw/*80.30*/("""
                            """),format.raw/*81.29*/("""</div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                            """),_display_(/*85.30*/inputText(
                                personForm("jobTitle"),
                                '_label -> "Zařazení",
                                'class -> "form-control",
                                '_help -> "Zadejte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*91.30*/("""
                            """),format.raw/*92.29*/("""</div>
                            <div class="col-md-6">
                            """),_display_(/*94.30*/select(
                                personForm("role"),
                                options = options(Roles.selectCollection),
                                '_label -> "Role",
                                'class -> "form-control",
                                '_help -> "Vyberte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*101.30*/("""
                            """),format.raw/*102.29*/("""</div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                            """),_display_(/*106.30*/inputText(
                                profileForm("firstName"),
                                '_label -> "Křestní jméno",
                                'class -> "form-control",
                                '_help -> "Zadejte křestní jméno.",
                                '_error -> profileForm.globalError
                            )),format.raw/*112.30*/("""
                            """),format.raw/*113.29*/("""</div>
                            <div class="col-md-6">
                            """),_display_(/*115.30*/inputText(
                                profileForm("lastName"),
                                '_label -> "Příjmení",
                                'class -> "form-control",
                                '_help -> "Zadejte příjmení.",
                                '_error -> profileForm.globalError
                            )),format.raw/*121.30*/("""
                            """),format.raw/*122.29*/("""</div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                            """),_display_(/*126.30*/inputText(
                                profileForm("phoneNumber"),
                                '_label -> "Telefonní číslo",
                                'class -> "form-control",
                                '_help -> "Zadejte telefonní číslo.",
                                '_error -> profileForm.globalError
                            )),format.raw/*132.30*/("""
                            """),format.raw/*133.29*/("""</div>
                        </div>

                    </fieldset>

                    <div class="actions">

                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Uložit">
                        <a href=""""),_display_(/*141.35*/routes/*141.41*/.Application.index()),format.raw/*141.61*/("""" class="btn">Zrušit</a>
                    </div>

                """)))}),format.raw/*144.18*/("""
                """),format.raw/*145.17*/("""</div>
            </div>
        </div>
    </div>
""")))}),format.raw/*149.2*/("""
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
                  DATE: Mon May 08 16:56:12 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/registerPerson.scala.html
                  HASH: 7c1c9ba1b99718950b51db3d464ad97f515f8d3c
                  MATRIX: 796->1|969->102|989->114|1069->118|1101->124|1180->177|1194->183|1256->225|1313->256|1327->262|1387->302|1444->333|1458->339|1518->379|1571->81|1599->393|1630->398|1667->426|1707->428|1740->434|2125->792|2140->798|2193->842|2233->844|2285->868|2510->1066|2893->1428|2951->1458|3143->1623|3535->1994|3593->2024|3784->2188|4096->2479|4154->2509|4270->2598|4671->2978|4729->3008|5052->3304|5407->3638|5465->3668|5656->3832|6021->4176|6079->4206|6195->4295|6626->4704|6685->4734|6877->4898|7256->5255|7315->5285|7432->5374|7800->5720|7859->5750|8052->5915|8437->6278|8496->6308|8783->6567|8799->6573|8841->6593|8946->6666|8993->6684|9081->6741
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|40->8|42->10|42->10|42->10|43->11|54->22|54->22|54->22|54->22|56->24|60->28|66->34|67->35|71->39|77->45|78->46|82->50|87->55|88->56|90->58|96->64|97->65|106->74|112->80|113->81|117->85|123->91|124->92|126->94|133->101|134->102|138->106|144->112|145->113|147->115|153->121|154->122|158->126|164->132|165->133|173->141|173->141|173->141|176->144|177->145|181->149
                  -- GENERATED --
              */
          