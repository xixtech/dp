
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

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""
    """),format.raw/*4.5*/("""<div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Blank</h1>
            </div>
                <!-- /.col-lg-12 -->
        </div>

        <div>

            <input id="first" type="text"/>
            <input id="second" type="text" onchange="compute()"/>
            <input id="result" type="text" />
            <script type="text/javascript">

                    function compute() """),format.raw/*19.40*/("""{"""),format.raw/*19.41*/("""
                        """),format.raw/*20.25*/("""var myBox1 = document.getElementById('first').value;
                        var myBox2 = document.getElementById('second').value;

                        var grade = (parseInt(myBox1) + parseInt(myBox2));
                        result.value = grade;
                    """),format.raw/*25.21*/("""}"""),format.raw/*25.22*/("""
            """),format.raw/*26.13*/("""</script>

        </div>

        <fieldset>
            <div class="container">
                <div class="row">
                    <form action="#">
                        <div class="col-xs-3">
                            <div class="form-group">
                                <label for="firstname">Firstname</label>
                                <input type="text" class="form-control" id="firstname" placeholder="Firstname">
                            </div>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" id="email">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                        </div>
                        <div class="col-xs-3">
                            <div class="form-group">
                                <label for="lastname">Last Name</label>
                                <input type="text" class="form-control" id="lastname" placeholder="Last Name">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" id="password" placeholder="Password">
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </fieldset>
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
                  DATE: Sun Mar 26 20:01:42 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/pages/blank.scala.html
                  HASH: 7c7e8196b8ac2d66c590df672c7bb21f8b79ac23
                  MATRIX: 751->1|860->15|888->18|901->24|940->26|971->31|1469->501|1498->502|1551->527|1852->800|1881->801|1922->814
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19|51->20|56->25|56->25|57->26
                  -- GENERATED --
              */
          