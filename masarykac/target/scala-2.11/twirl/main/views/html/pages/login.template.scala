
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
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Přihlaste se</h3>
                        </div>
                        <div class="panel-body">

                                    <fieldset>
                                """),_display_(/*35.34*/helper/*35.40*/.form(routes.Login.authenticate)/*35.72*/ {_display_(Seq[Any](format.raw/*35.74*/("""
                                    """),format.raw/*36.37*/("""<div class="form-group">
                                        """),_display_(/*37.42*/inputText(
                                            signupForm("email"),
                                            '_label -> "Email",
                                            'class -> "form-control",
                                            '_help -> "Prosím zadejte platnou e-mailovou adresu.",
                                            '_error -> signupForm.globalError

                                        )),format.raw/*44.42*/("""
                                    """),format.raw/*45.37*/("""</div>
                                    <div class="form-group">
                                        """),_display_(/*47.42*/inputPassword(
                                            signupForm("password"),
                                            '_label -> "Heslo",
                                            'class -> "form-control",
                                            '_help -> "Heslo musí mít nejméně 6 znaků."
                                        )),format.raw/*52.42*/("""
                                    """),format.raw/*53.37*/("""</div>
                                    <div class="actions">
                                        <input type="submit" class="btn btn-lg btn-success btn-block" value="Přihlásit">
                                    </div>
                                """)))}),format.raw/*57.34*/("""
                                """),format.raw/*58.33*/("""</fieldset>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- jQuery -->
        <script src='"""),_display_(/*67.23*/routes/*67.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*67.67*/("""'></script>

        <!-- Bootstrap Core JavaScript -->
        <script src='"""),_display_(/*70.23*/routes/*70.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*70.76*/("""'></script>

        <!-- Custom Theme JavaScript -->
        <script src='"""),_display_(/*73.23*/routes/*73.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*73.68*/("""'></script>
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
                  DATE: Thu Feb 09 12:02:31 CET 2017
                  SOURCE: E:/Users/Martin/Downloads/masarykac/app/views/pages/login.scala.html
                  HASH: 3e08525457e0a72f12e3bff7690fa3a912f72c3c
                  MATRIX: 767->1|913->37|940->55|1325->413|1340->419|1417->474|1516->546|1531->552|1584->583|1670->642|1685->648|1746->688|2701->1616|2716->1622|2757->1654|2797->1656|2862->1693|2955->1759|3405->2188|3470->2225|3606->2334|3973->2680|4038->2717|4331->2979|4392->3012|4594->3187|4609->3193|4668->3231|4773->3309|4788->3315|4856->3362|4959->3438|4974->3444|5034->3483
                  LINES: 27->1|32->1|33->3|41->11|41->11|41->11|42->12|42->12|42->12|45->15|45->15|45->15|65->35|65->35|65->35|65->35|66->36|67->37|74->44|75->45|77->47|82->52|83->53|87->57|88->58|97->67|97->67|97->67|100->70|100->70|100->70|103->73|103->73|103->73
                  -- GENERATED --
              */
          