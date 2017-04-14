
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
                            <div class="row">
                                <div class="col-md-12">
                                """),_display_(/*28.34*/inputText(
                                    signupForm("email"),
                                    '_label -> "Email",
                                    'class -> "form-control",
                                    '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                    '_error -> signupForm.globalError
                                )),format.raw/*34.34*/("""
                                """),format.raw/*35.33*/("""</div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                """),_display_(/*39.34*/inputPassword(
                                    signupForm("password"),
                                    '_label -> "Heslo",
                                    'class -> "form-control",
                                    '_help -> "Heslo musí mít nejméně 6 znaků."
                                )),format.raw/*44.34*/("""
                                """),format.raw/*45.33*/("""</div>
                                <div class="col-md-6">
                                """),_display_(/*47.34*/inputPassword(
                                    signupForm("repeatPassword"),
                                    '_label -> "Heslo pro kontrolu",
                                    'class -> "form-control",
                                    '_help -> "Prosím zadejte znovu heslo.",
                                    '_error -> signupForm.error("password")
                                )),format.raw/*53.34*/("""
                                """),format.raw/*54.33*/("""</div>
                            </div>
                        </fieldset>

                        <fieldset>

                            <legend>Kontaktní informace</legend>
                            <div class="row">
                                <div class="col-md-12">
                                """),_display_(/*63.34*/inputText(
                                    personForm("salary"),
                                    '_label -> "Plat",
                                    'class -> "form-control",
                                    '_help -> "Zadejte plat.",
                                    '_error -> personForm.globalError
                                )),format.raw/*69.34*/("""
                                """),format.raw/*70.33*/("""</div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                """),_display_(/*74.34*/inputText(
                                    personForm("jobTitle"),
                                    '_label -> "Zařazení",
                                    'class -> "form-control",
                                    '_help -> "Zadejte zařazení.",
                                    '_error -> personForm.globalError
                                )),format.raw/*80.34*/("""
                                """),format.raw/*81.33*/("""</div>
                                <div class="col-md-6">
                                """),_display_(/*83.34*/select(
                                    personForm("role"),
                                    options = options(Roles.selectCollection),
                                    '_label -> "Role",
                                    'class -> "form-control",
                                    '_help -> "Vyberte zařazení.",
                                    '_error -> personForm.globalError
                                )),format.raw/*90.34*/("""
                                """),format.raw/*91.33*/("""</div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                """),_display_(/*95.34*/inputText(
                                    profileForm("firstName"),
                                    '_label -> "Křestní jméno",
                                    'class -> "form-control",
                                    '_help -> "Zadejte křestní jméno.",
                                    '_error -> profileForm.globalError
                                )),format.raw/*101.34*/("""
                                """),format.raw/*102.33*/("""</div>
                                <div class="col-md-6">
                                """),_display_(/*104.34*/inputText(
                                    profileForm("lastName"),
                                    '_label -> "Příjmení",
                                    'class -> "form-control",
                                    '_help -> "Zadejte příjmení.",
                                    '_error -> profileForm.globalError
                                )),format.raw/*110.34*/("""
                                """),format.raw/*111.33*/("""</div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                """),_display_(/*115.34*/inputText(
                                    profileForm("phoneNumber"),
                                    '_label -> "Telefonní číslo",
                                    'class -> "form-control",
                                    '_help -> "Zadejte telefonní číslo.",
                                    '_error -> profileForm.globalError
                                )),format.raw/*121.34*/("""
                                """),format.raw/*122.33*/("""</div>
                            </div>

                        </fieldset>

                        <div class="actions">

                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Uložit">
                            <a href=""""),_display_(/*130.39*/routes/*130.45*/.Application.index()),format.raw/*130.65*/("""" class="btn">Zrušit</a>
                        </div>

                    """)))}),format.raw/*133.22*/("""
                    """),format.raw/*134.21*/("""</div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*138.6*/("""
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
                  DATE: Fri Apr 14 13:27:43 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/registerPerson.scala.html
                  HASH: 491c6804510f3b2ee6a4cc587052933b265e8dfe
                  MATRIX: 796->1|969->110|989->122|1069->126|1105->136|1188->193|1202->199|1264->241|1325->276|1339->282|1399->322|1460->357|1474->363|1534->403|1591->81|1623->105|1653->421|1688->430|1725->458|1765->460|1802->470|2231->872|2246->878|2299->922|2339->924|2395->952|2636->1166|3043->1552|3105->1586|3312->1766|3644->2077|3706->2111|3830->2208|4255->2612|4317->2646|4668->2970|5047->3328|5109->3362|5316->3542|5705->3910|5767->3944|5891->4041|6349->4478|6411->4512|6618->4692|7021->5073|7084->5107|7209->5204|7601->5574|7664->5608|7873->5789|8282->6176|8345->6210|8652->6489|8668->6495|8710->6515|8823->6596|8874->6618|8978->6691
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|40->3|40->8|42->10|42->10|42->10|43->11|54->22|54->22|54->22|54->22|56->24|60->28|66->34|67->35|71->39|76->44|77->45|79->47|85->53|86->54|95->63|101->69|102->70|106->74|112->80|113->81|115->83|122->90|123->91|127->95|133->101|134->102|136->104|142->110|143->111|147->115|153->121|154->122|162->130|162->130|162->130|165->133|166->134|170->138
                  -- GENERATED --
              */
          