
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
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.70*/routes/*11.76*/.Assets.at("lib/bootstrap-social/bootstrap-social.css")),format.raw/*11.131*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.70*/routes/*12.76*/.Assets.at("lib/bootstrap.css")),format.raw/*12.107*/("""">

        <title>Přihlášení</title>
        <link href='"""),_display_(/*15.22*/routes/*15.28*/.Assets.at("stylesheets/sb-admin-2.css")),format.raw/*15.68*/("""' rel="stylesheet" type="text/css">

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
                    <img src=""""),_display_(/*28.32*/routes/*28.38*/.Assets.at("images/logo_CVUT.jpg")),format.raw/*28.72*/("""" width="400" height="200" />
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Přihlaste se</h3>
                        </div>
                        <div class="panel-body">

                            <fieldset>
                            """),_display_(/*40.30*/helper/*40.36*/.form(routes.Login.authenticate)/*40.68*/ {_display_(Seq[Any](format.raw/*40.70*/("""
                                """),format.raw/*41.33*/("""<div class="form-group">
                                """),_display_(/*42.34*/inputText(
                                    signupForm("email"),
                                    '_label -> "Email",
                                    'class -> "form-control",
                                    '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                    '_error -> signupForm.globalError

                                )),format.raw/*49.34*/("""
                                """),format.raw/*50.33*/("""</div>
                                <div class="form-group">
                                """),_display_(/*52.34*/inputPassword(
                                    signupForm("password"),
                                    '_label -> "Heslo",
                                    'class -> "form-control",
                                    '_help -> "Heslo musí mít nejméně 6 znaků."
                                )),format.raw/*57.34*/("""
                                """),format.raw/*58.33*/("""</div>
                                <div class="actions">
                                    <input type="submit" class="btn btn-lg btn-success btn-block" value="Přihlásit">
                                </div>
                            """)))}),format.raw/*62.30*/("""
                            """),format.raw/*63.29*/("""</fieldset>
                        </div>
                    </div>
                </div>
            </div>

        </div>

            <!-- jQuery -->
        <script src='"""),_display_(/*72.23*/routes/*72.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*72.67*/("""'></script>

            <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*75.23*/routes/*75.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*75.76*/("""'></script>

            <!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*78.23*/routes/*78.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*78.68*/("""'></script>
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
                  DATE: Fri Mar 10 09:13:08 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/login.scala.html
                  HASH: 337a301f490e27540176120f5a090a7276003d76
                  MATRIX: 767->1|913->37|940->55|1325->413|1340->419|1417->474|1516->546|1531->552|1584->583|1670->642|1685->648|1746->688|2395->1310|2410->1316|2465->1350|2986->1844|3001->1850|3042->1882|3082->1884|3143->1917|3228->1975|3630->2356|3691->2389|3815->2486|4142->2792|4203->2825|4480->3071|4537->3100|4743->3279|4758->3285|4817->3323|4926->3405|4941->3411|5009->3458|5116->3538|5131->3544|5191->3583
                  LINES: 27->1|32->1|33->3|41->11|41->11|41->11|42->12|42->12|42->12|45->15|45->15|45->15|58->28|58->28|58->28|70->40|70->40|70->40|70->40|71->41|72->42|79->49|80->50|82->52|87->57|88->58|92->62|93->63|102->72|102->72|102->72|105->75|105->75|105->75|108->78|108->78|108->78
                  -- GENERATED --
              */
          