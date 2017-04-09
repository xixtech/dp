
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
def /*3.6*/localScripts/*3.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.22*/("""
        """),format.raw/*4.9*/("""<!-- Morris Charts JavaScript -->
        <script src='"""),_display_(/*5.23*/routes/*5.29*/.Assets.at("lib/raphaeljs/raphael-min.js")),format.raw/*5.71*/("""'></script>
        <script src='"""),_display_(/*6.23*/routes/*6.29*/.Assets.at("lib/morrisjs/morris.min.js")),format.raw/*6.69*/("""'></script>
        <script src='"""),_display_(/*7.23*/routes/*7.29*/.Assets.at("javascripts/morris-data.js")),format.raw/*7.69*/("""'></script>
    """)))};
Seq[Any](format.raw/*1.82*/("""
    """),format.raw/*3.1*/("""    """),format.raw/*8.6*/("""

    """),_display_(/*10.6*/main(scripts = localScripts)/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
        """),format.raw/*11.9*/("""<div class="row">
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
                    """),_display_(/*22.22*/helper/*22.28*/.form(action = routes.PersonController.save)/*22.72*/ {_display_(Seq[Any](format.raw/*22.74*/("""

                        """),format.raw/*24.25*/("""<fieldset>
                            <legend>Přihlašovací údaje</legend>
                            """),_display_(/*26.30*/inputText(
                                signupForm("email"),
                                '_label -> "Email",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                '_error -> signupForm.globalError
                            )),format.raw/*32.30*/("""

                            """),_display_(/*34.30*/inputPassword(
                                signupForm("password"),
                                '_label -> "Heslo",
                                'class -> "form-control",
                                '_help -> "Heslo musí mít nejméně 6 znaků."
                            )),format.raw/*39.30*/("""

                            """),_display_(/*41.30*/inputPassword(
                                signupForm("repeatPassword"),
                                '_label -> "Heslo pro kontrolu",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte znovu heslo.",
                                '_error -> signupForm.error("password")
                            )),format.raw/*47.30*/("""

                        """),format.raw/*49.25*/("""</fieldset>

                        <fieldset>

                            <legend>Kontaktní informace</legend>

                            """),_display_(/*55.30*/inputText(
                                personForm("salary"),
                                '_label -> "Plat",
                                'class -> "form-control",
                                '_help -> "Zadejte plat.",
                                '_error -> personForm.globalError
                            )),format.raw/*61.30*/("""
                            """),_display_(/*62.30*/inputText(
                                personForm("jobTitle"),
                                '_label -> "Zařazení",
                                'class -> "form-control",
                                '_help -> "Zadejte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*68.30*/("""

                            """),_display_(/*70.30*/select(
                                personForm("role"),
                                options = options(Roles.selectCollection),
                                '_label -> "Role",
                                'class -> "form-control",
                                '_help -> "Vyberte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*77.30*/("""

                            """),_display_(/*79.30*/inputText(
                                profileForm("firstName"),
                                '_label -> "Křestní jméno",
                                'class -> "form-control",
                                '_help -> "Zadejte křestní jméno.",
                                '_error -> profileForm.globalError
                            )),format.raw/*85.30*/("""

                            """),_display_(/*87.30*/inputText(
                                profileForm("lastName"),
                                '_label -> "Příjmení",
                                'class -> "form-control",
                                '_help -> "Zadejte příjmení.",
                                '_error -> profileForm.globalError
                            )),format.raw/*93.30*/("""

                            """),_display_(/*95.30*/inputText(
                                profileForm("phoneNumber"),
                                '_label -> "Telefonní číslo",
                                'class -> "form-control",
                                '_help -> "Zadejte telefonní číslo.",
                                '_error -> profileForm.globalError
                            )),format.raw/*101.30*/("""

                        """),format.raw/*103.25*/("""</fieldset>

                        <div class="actions">

                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Uložit">
                            <a href=""""),_display_(/*108.39*/routes/*108.45*/.Application.index()),format.raw/*108.65*/("""" class="btn">Zrušit</a>
                        </div>

                    """)))}),format.raw/*111.22*/("""
                    """),format.raw/*112.21*/("""</div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*116.6*/("""
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
                  DATE: Sun Apr 09 10:50:46 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/registerPerson.scala.html
                  HASH: 56bad0a7d81133eada0e9936207af1fcd7428040
                  MATRIX: 796->1|969->110|989->122|1069->126|1105->136|1188->193|1202->199|1264->241|1325->276|1339->282|1399->322|1460->357|1474->363|1534->403|1591->81|1623->105|1653->421|1688->430|1725->458|1765->460|1802->470|2231->872|2246->878|2299->922|2339->924|2395->952|2528->1058|2911->1420|2971->1453|3283->1744|3343->1777|3744->2157|3800->2185|3977->2335|4332->2669|4390->2700|4755->3044|4815->3077|5245->3486|5305->3519|5683->3876|5743->3909|6110->4255|6170->4288|6555->4651|6612->4679|6849->4888|6865->4894|6907->4914|7020->4995|7071->5017|7175->5090
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|40->3|40->8|42->10|42->10|42->10|43->11|54->22|54->22|54->22|54->22|56->24|58->26|64->32|66->34|71->39|73->41|79->47|81->49|87->55|93->61|94->62|100->68|102->70|109->77|111->79|117->85|119->87|125->93|127->95|133->101|135->103|140->108|140->108|140->108|143->111|144->112|148->116
                  -- GENERATED --
              */
          