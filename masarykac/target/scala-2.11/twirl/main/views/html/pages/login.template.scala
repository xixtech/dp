
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Login.LoginModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Login.LoginModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.38*/("""
    """),format.raw/*3.1*/("""<!DOCTYPE html>
    <html>
        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <meta name="description" content="">
            <meta name="author" content="">
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.74*/routes/*11.80*/.Assets.at("lib/bootstrap-social/bootstrap-social.css")),format.raw/*11.135*/("""">
            <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.74*/routes/*12.80*/.Assets.at("lib/bootstrap.css")),format.raw/*12.111*/("""">

            <title>Přihlášení</title>
            <link href='"""),_display_(/*15.26*/routes/*15.32*/.Assets.at("stylesheets/sb-admin-2.css")),format.raw/*15.72*/("""' rel="stylesheet" type="text/css">

                <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
                <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
                <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        </head>
        <body>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <img src=""""),_display_(/*28.36*/routes/*28.42*/.Assets.at("images/logo_CVUT.jpg")),format.raw/*28.76*/("""" width="400" height="200" />
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-md-offset-4">
                        <div class="login-panel panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Přihlaste se</h3>
                            </div>
                            <div class="panel-body">

                                """),_display_(/*39.34*/if(flash.containsKey("success"))/*39.66*/ {_display_(Seq[Any](format.raw/*39.68*/("""
                                    """),format.raw/*40.37*/("""<div class="alert-message warning">
                                        <strong>Hotovo!</strong> """),_display_(/*41.67*/flash/*41.72*/.get("success")),format.raw/*41.87*/("""
                                    """),format.raw/*42.37*/("""</div>
                                """)))}),format.raw/*43.34*/("""
                                """),_display_(/*44.34*/if(flash.get("globalError"))/*44.62*/ {_display_(Seq[Any](format.raw/*44.64*/("""
                                    """),format.raw/*45.37*/("""<div style="background: red">
                                        <h4>Error!</h4>
                                        """),_display_(/*47.42*/flash/*47.47*/.get("globalError")),format.raw/*47.66*/("""
                                    """),format.raw/*48.37*/("""</div>
                                """)))}),format.raw/*49.34*/("""
                            """),format.raw/*50.29*/("""<fieldset>
                            """),_display_(/*51.30*/helper/*51.36*/.form(routes.Login.authenticate)/*51.68*/ {_display_(Seq[Any](format.raw/*51.70*/("""
                                """),format.raw/*52.33*/("""<div class="form-group">
                                """),_display_(/*53.34*/inputText(
                                    signupForm("email"),
                                    '_label -> "Email",
                                    'class -> "form-control",
                                    '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                    '_error -> signupForm.globalError

                                )),format.raw/*60.34*/("""
                                """),format.raw/*61.33*/("""</div>
                                <div class="form-group">
                                """),_display_(/*63.34*/inputPassword(
                                    signupForm("password"),
                                    '_label -> "Heslo",
                                    'class -> "form-control",
                                    '_help -> "Heslo musí mít nejméně 6 znaků."
                                )),format.raw/*68.34*/("""
                                """),format.raw/*69.33*/("""</div>
                                <div class="actions">
                                    <input type="submit" class="btn btn-lg btn-success btn-block" value="Přihlásit">
                                </div>
                            """)))}),format.raw/*73.30*/("""
                            """),format.raw/*74.29*/("""</fieldset>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

                <!-- jQuery -->
            <script src='"""),_display_(/*83.27*/routes/*83.33*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*83.71*/("""'></script>

                <!-- Bootstrap Core JavaScript -->
            <script src='"""),_display_(/*86.27*/routes/*86.33*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*86.80*/("""'></script>

                <!-- Custom Theme JavaScript -->
            <script src='"""),_display_(/*89.27*/routes/*89.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*89.72*/("""'></script>
        </body>
    </html>"""))
      }
    }
  }

  def render(signupForm:Form[Login.LoginModel]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Login.LoginModel]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Mar 26 20:01:43 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/login.scala.html
                  HASH: f809056919c0eff45febe5e77fc87ae27b1f443d
                  MATRIX: 767->1|913->37|944->59|1361->449|1376->455|1453->510|1556->586|1571->592|1624->623|1718->690|1733->696|1794->736|2479->1394|2494->1400|2549->1434|3071->1929|3112->1961|3152->1963|3217->2000|3346->2102|3360->2107|3396->2122|3461->2159|3532->2199|3593->2233|3630->2261|3670->2263|3735->2300|3889->2427|3903->2432|3943->2451|4008->2488|4079->2528|4136->2557|4203->2597|4218->2603|4259->2635|4299->2637|4360->2670|4445->2728|4847->3109|4908->3142|5032->3239|5359->3545|5420->3578|5697->3824|5754->3853|5988->4060|6003->4066|6062->4104|6179->4194|6194->4200|6262->4247|6377->4335|6392->4341|6452->4380
                  LINES: 27->1|32->1|33->3|41->11|41->11|41->11|42->12|42->12|42->12|45->15|45->15|45->15|58->28|58->28|58->28|69->39|69->39|69->39|70->40|71->41|71->41|71->41|72->42|73->43|74->44|74->44|74->44|75->45|77->47|77->47|77->47|78->48|79->49|80->50|81->51|81->51|81->51|81->51|82->52|83->53|90->60|91->61|93->63|98->68|99->69|103->73|104->74|113->83|113->83|113->83|116->86|116->86|116->86|119->89|119->89|119->89
                  -- GENERATED --
              */
          