
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sidebar_Scope0 {
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

class sidebar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
                    <!-- /input-group -->
            </li>
            <li>
                <a href='"""),_display_(/*17.27*/routes/*17.33*/.Application.dashboard),format.raw/*17.55*/("""'>
                    <i class="fa fa-dashboard fa-fw"></i> Nástěnka
                </a>
            </li>

            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">


                    <li>
                        <a href='"""),_display_(/*28.35*/routes/*28.41*/.TableController.listPerson()),format.raw/*28.70*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*31.35*/routes/*31.41*/.TableController.listStudyPlans()),format.raw/*31.74*/("""'><i class="fa fa-table fa-fw"></i> Studijní plány</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*35.35*/routes/*35.41*/.TableController.listScheduleInWeeks()),format.raw/*35.79*/("""'><i class="fa fa-table fa-fw"></i> Rozvrh v týdnech</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*44.35*/routes/*44.41*/.Pages.blank),format.raw/*44.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*47.35*/routes/*47.41*/.Application.pdf()),format.raw/*47.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*50.35*/routes/*50.41*/.Application.kpiChoosePerson()),format.raw/*50.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*53.35*/routes/*53.41*/.Application.roles()),format.raw/*53.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*56.35*/routes/*56.41*/.PersonController.index()),format.raw/*56.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*59.35*/routes/*59.41*/.EmployeesController.index()),format.raw/*59.69*/("""">Registrace vyučujícího</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*63.35*/routes/*63.41*/.SubjectController.index()),format.raw/*63.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.FieldOfStudyController.index()),format.raw/*67.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*71.35*/routes/*71.41*/.StudyGroupsController.index()),format.raw/*71.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*75.35*/routes/*75.41*/.SemestersController.index()),format.raw/*75.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*79.35*/routes/*79.41*/.StudyPlansController.index()),format.raw/*79.70*/("""">Registrace studijního plánu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*89.35*/routes/*89.41*/.MethodicsController.index()),format.raw/*89.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*95.27*/routes/*95.33*/.Application.forms),format.raw/*95.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.UiElements.panelsAndWells),format.raw/*101.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*104.35*/routes/*104.41*/.UiElements.buttons),format.raw/*104.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*107.35*/routes/*107.41*/.UiElements.notifications),format.raw/*107.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*110.35*/routes/*110.41*/.UiElements.typography),format.raw/*110.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*113.35*/routes/*113.41*/.UiElements.icons),format.raw/*113.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*116.35*/routes/*116.41*/.UiElements.grid),format.raw/*116.57*/("""">Grid</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-sitemap fa-fw"></i>
                    Multi-Level Dropdown<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Third Level <span class="fa arrow"></span></a>
                        <ul class="nav nav-third-level">
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                        </ul>
                            <!-- /.nav-third-level -->
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#">
                    <i class="fa fa-bar-chart-o fa-fw"></i> Grafy<span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href='"""),_display_(/*158.35*/routes/*158.41*/.Charts.flot),format.raw/*158.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*161.35*/routes/*161.41*/.Charts.morris),format.raw/*161.55*/("""'>Morris.js Charts</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

        </ul>
    </div>
        <!-- /.sidebar-collapse -->
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object sidebar extends sidebar_Scope0.sidebar
              /*
                  -- GENERATED --
                  DATE: Fri Mar 17 10:45:15 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 3c06ef44ee665cdf3874adc0ba5849cb71d5888f
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2477->1418|2492->1424|2551->1462|2987->1871|3002->1877|3035->1889|3164->1991|3179->1997|3218->2015|3340->2110|3355->2116|3406->2146|3540->2253|3555->2259|3596->2279|3719->2375|3734->2381|3780->2406|3915->2514|3930->2520|3979->2548|4121->2663|4136->2669|4183->2695|4322->2807|4337->2813|4389->2844|4525->2953|4540->2959|4591->2989|4729->3100|4744->3106|4793->3134|4932->3246|4947->3252|4997->3281|5406->3663|5421->3669|5470->3697|5676->3876|5691->3882|5730->3900|6057->4199|6073->4205|6121->4231|6257->4339|6273->4345|6314->4364|6441->4463|6457->4469|6504->4494|6637->4599|6653->4605|6697->4627|6827->4729|6843->4735|6882->4752|7008->4850|7024->4856|7062->4872|8803->6585|8819->6591|8853->6603|8984->6706|9000->6712|9036->6726
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|66->35|66->35|66->35|75->44|75->44|75->44|78->47|78->47|78->47|81->50|81->50|81->50|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59|94->63|94->63|94->63|98->67|98->67|98->67|102->71|102->71|102->71|106->75|106->75|106->75|110->79|110->79|110->79|120->89|120->89|120->89|126->95|126->95|126->95|132->101|132->101|132->101|135->104|135->104|135->104|138->107|138->107|138->107|141->110|141->110|141->110|144->113|144->113|144->113|147->116|147->116|147->116|189->158|189->158|189->158|192->161|192->161|192->161
                  -- GENERATED --
              */
          