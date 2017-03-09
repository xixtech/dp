
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
    """),_display_(/*9.6*/main(scripts = localScripts)/*9.34*/ {_display_(Seq[Any](format.raw/*9.36*/("""
        """),format.raw/*10.9*/("""<div class="row">
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
                    """),_display_(/*21.22*/helper/*21.28*/.form(action = routes.PersonController.save)/*21.72*/ {_display_(Seq[Any](format.raw/*21.74*/("""

                        """),format.raw/*23.25*/("""<fieldset>
                            <legend>Přihlašovací údaje</legend>
                            """),_display_(/*25.30*/inputText(
                                signupForm("email"),
                                '_label -> "Email",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                '_error -> signupForm.globalError
                            )),format.raw/*31.30*/("""

                            """),_display_(/*33.30*/inputPassword(
                                signupForm("password"),
                                '_label -> "Heslo",
                                'class -> "form-control",
                                '_help -> "Heslo musí mít nejméně 6 znaků."
                            )),format.raw/*38.30*/("""

                            """),_display_(/*40.30*/inputPassword(
                                signupForm("repeatPassword"),
                                '_label -> "Heslo pro kontrolu",
                                'class -> "form-control",
                                '_help -> "Prosím zadejte znovu heslo.",
                                '_error -> signupForm.error("password")
                            )),format.raw/*46.30*/("""

                        """),format.raw/*48.25*/("""</fieldset>

                        <fieldset>

                            <legend>Kontaktní informace</legend>

                            """),_display_(/*54.30*/inputText(
                                personForm("salary"),
                                '_label -> "Plat",
                                'class -> "form-control",
                                '_help -> "Zadejte plat.",
                                '_error -> personForm.globalError
                            )),format.raw/*60.30*/("""
                            """),_display_(/*61.30*/inputText(
                                personForm("jobTitle"),
                                '_label -> "Zařazení",
                                'class -> "form-control",
                                '_help -> "Zadejte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*67.30*/("""

                            """),_display_(/*69.30*/select(
                                personForm("role"),
                                options = options(Roles.selectCollection),
                                '_label -> "Role",
                                'class -> "form-control",
                                '_help -> "Vyberte zařazení.",
                                '_error -> personForm.globalError
                            )),format.raw/*76.30*/("""

                            """),_display_(/*78.30*/inputText(
                                profileForm("firstName"),
                                '_label -> "Křestní jméno",
                                'class -> "form-control",
                                '_help -> "Zadejte křestní jméno.",
                                '_error -> profileForm.globalError
                            )),format.raw/*84.30*/("""

                            """),_display_(/*86.30*/inputText(
                                profileForm("lastName"),
                                '_label -> "Příjmení",
                                'class -> "form-control",
                                '_help -> "Zadejte příjmení.",
                                '_error -> profileForm.globalError
                            )),format.raw/*92.30*/("""

                            """),_display_(/*94.30*/inputText(
                                profileForm("phoneNumber"),
                                '_label -> "Telefonní číslo",
                                'class -> "form-control",
                                '_help -> "Zadejte telefonní číslo.",
                                '_error -> profileForm.globalError
                            )),format.raw/*100.30*/("""

                        """),format.raw/*102.25*/("""</fieldset>

                        <div class="actions">

                            <input type="submit" class="btn btn-lg btn-success btn-block" value="Uložit">
                            <a href=""""),_display_(/*107.39*/routes/*107.45*/.Application.index()),format.raw/*107.65*/("""" class="btn">Zrušit</a>
                        </div>

                    """)))}),format.raw/*110.22*/("""
                    """),format.raw/*111.21*/("""</div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*115.6*/("""
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
                  DATE: Thu Mar 09 11:29:22 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/registerPerson.scala.html
                  HASH: 42c1a06d0800f5b55977ce424302047bc90af73c
                  MATRIX: 796->1|969->110|989->122|1069->126|1105->136|1188->193|1202->199|1264->241|1325->276|1339->282|1399->322|1460->357|1474->363|1534->403|1591->81|1623->105|1653->421|1685->428|1721->456|1760->458|1797->468|2226->870|2241->876|2294->920|2334->922|2390->950|2523->1056|2906->1418|2966->1451|3278->1742|3338->1775|3739->2155|3795->2183|3972->2333|4327->2667|4385->2698|4750->3042|4810->3075|5240->3484|5300->3517|5678->3874|5738->3907|6105->4253|6165->4286|6550->4649|6607->4677|6844->4886|6860->4892|6902->4912|7015->4993|7066->5015|7170->5088
                  LINES: 27->1|31->3|31->3|33->3|34->4|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|39->1|40->3|40->8|41->9|41->9|41->9|42->10|53->21|53->21|53->21|53->21|55->23|57->25|63->31|65->33|70->38|72->40|78->46|80->48|86->54|92->60|93->61|99->67|101->69|108->76|110->78|116->84|118->86|124->92|126->94|132->100|134->102|139->107|139->107|139->107|142->110|143->111|147->115
                  -- GENERATED --
              */
          