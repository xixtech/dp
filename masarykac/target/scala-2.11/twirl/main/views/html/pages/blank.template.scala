
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object blank_Scope0 {
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

class blank extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(text: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
    """),format.raw/*3.5*/("""<div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Blank</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
    </div>
""")))}))
      }
    }
  }

  def render(text:String): play.twirl.api.HtmlFormat.Appendable = apply(text)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (text) => apply(text)

  def ref: this.type = this

}


}

/**/
object blank extends blank_Scope0.blank
              /*
                  -- GENERATED --
                  DATE: Sun Feb 12 17:54:42 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/blank.scala.html
                  HASH: 83b04c9607bfec546c779461412c0664fcb904a7
                  MATRIX: 751->1|860->15|887->17|900->23|939->25|970->30
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          