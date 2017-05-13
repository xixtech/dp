
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
            <a class="navbar-brand" href="/">Masarykáč v0.8</a>
        </div>
        <!-- /.navbar-header -->
        <img src=""""),_display_(/*8.20*/routes/*8.26*/.Assets.at("images/logo_MUVS.jpg")),format.raw/*8.60*/("""" width="140" height="40" align="center"/>
        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown">
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.Application.logout()),format.raw/*11.54*/(""""><i class="fa fa-gear fa-fw"></i> Odhlásit</a>
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->
        """),_display_(/*16.10*/sidebar()),format.raw/*16.19*/("""
        """),format.raw/*17.9*/("""<!-- /.navbar-static-side -->
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
                  DATE: Sat May 13 11:42:12 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/navigation.scala.html
                  HASH: f22f8a59d628e016eecdf537c6e85bc9969fae26
                  MATRIX: 748->1|844->3|875->8|1189->296|1203->302|1257->336|1442->494|1457->500|1499->521|1683->678|1713->687|1749->696
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|42->11|42->11|42->11|47->16|47->16|48->17
                  -- GENERATED --
              */
          