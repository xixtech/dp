
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navigation_Scope0 {
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

class navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
    """),format.raw/*2.5*/("""<!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Masarykáč beta v0.2</a>
        </div>
        <!-- /.navbar-header -->
        <img src=""""),_display_(/*14.20*/routes/*14.26*/.Assets.at("images/logo_MUVS.jpg")),format.raw/*14.60*/("""" width="140" height="40" align="center"/>
        <ul class="nav navbar-top-links navbar-right">


            <li class="dropdown">
                <a href=""""),_display_(/*19.27*/routes/*19.33*/.Application.logout()),format.raw/*19.54*/(""""><i class="fa fa-gear fa-fw"></i> Odhlásit</a>
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->

        """),_display_(/*25.10*/sidebar()),format.raw/*25.19*/("""
        """),format.raw/*26.9*/("""<!-- /.navbar-static-side -->
    </nav>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navigation extends navigation_Scope0.navigation
              /*
                  -- GENERATED --
                  DATE: Wed Apr 26 19:37:07 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/navigation.scala.html
                  HASH: 4e41e887092aaf51022b779de7c9ecd130026905
                  MATRIX: 748->1|844->3|875->8|1532->638|1547->644|1602->678|1789->838|1804->844|1846->865|2031->1023|2061->1032|2097->1041
                  LINES: 27->1|32->1|33->2|45->14|45->14|45->14|50->19|50->19|50->19|56->25|56->25|57->26
                  -- GENERATED --
              */
          