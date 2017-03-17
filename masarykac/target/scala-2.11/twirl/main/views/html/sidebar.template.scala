
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

                    <li>
                        <a href='"""),_display_(/*39.35*/routes/*39.41*/.TableController.listEmployees()),format.raw/*39.73*/("""'><i class="fa fa-table fa-fw"></i> Zaměstnanci</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*43.35*/routes/*43.41*/.TableController.listTeachers()),format.raw/*43.72*/("""'><i class="fa fa-table fa-fw"></i> Vyučující</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*52.35*/routes/*52.41*/.Pages.blank),format.raw/*52.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*55.35*/routes/*55.41*/.Application.pdf()),format.raw/*55.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*58.35*/routes/*58.41*/.Application.kpiChoosePerson()),format.raw/*58.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*61.35*/routes/*61.41*/.Application.roles()),format.raw/*61.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*64.35*/routes/*64.41*/.PersonController.index()),format.raw/*64.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*67.35*/routes/*67.41*/.EmployeesController.index()),format.raw/*67.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*71.35*/routes/*71.41*/.SubjectController.index()),format.raw/*71.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*75.35*/routes/*75.41*/.FieldOfStudyController.index()),format.raw/*75.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*79.35*/routes/*79.41*/.StudyGroupsController.index()),format.raw/*79.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*83.35*/routes/*83.41*/.SemestersController.index()),format.raw/*83.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*87.35*/routes/*87.41*/.StudyPlansController.index()),format.raw/*87.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*91.35*/routes/*91.41*/.TeachersController.index()),format.raw/*91.68*/("""">Registrace učitele</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.MethodicsController.index()),format.raw/*101.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*107.27*/routes/*107.33*/.Application.forms),format.raw/*107.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*113.35*/routes/*113.41*/.UiElements.panelsAndWells),format.raw/*113.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*116.35*/routes/*116.41*/.UiElements.buttons),format.raw/*116.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*119.35*/routes/*119.41*/.UiElements.notifications),format.raw/*119.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*122.35*/routes/*122.41*/.UiElements.typography),format.raw/*122.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*125.35*/routes/*125.41*/.UiElements.icons),format.raw/*125.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*128.35*/routes/*128.41*/.UiElements.grid),format.raw/*128.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*170.35*/routes/*170.41*/.Charts.flot),format.raw/*170.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*173.35*/routes/*173.41*/.Charts.morris),format.raw/*173.55*/("""'>Morris.js Charts</a>
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
                  DATE: Fri Mar 17 19:11:38 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: bf6587e291cdccf6e72b00fa9498306ea017ff0d
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2477->1418|2492->1424|2551->1462|2721->1605|2736->1611|2789->1643|2954->1781|2969->1787|3021->1818|3450->2220|3465->2226|3498->2238|3627->2340|3642->2346|3681->2364|3803->2459|3818->2465|3869->2495|4003->2602|4018->2608|4059->2628|4182->2724|4197->2730|4243->2755|4378->2863|4393->2869|4442->2897|4584->3012|4599->3018|4646->3044|4785->3156|4800->3162|4852->3193|4988->3302|5003->3308|5054->3338|5192->3449|5207->3455|5256->3483|5395->3595|5410->3601|5460->3630|5607->3750|5622->3756|5670->3783|6071->4156|6087->4162|6137->4190|6344->4369|6360->4375|6400->4393|6727->4692|6743->4698|6791->4724|6927->4832|6943->4838|6984->4857|7111->4956|7127->4962|7174->4987|7307->5092|7323->5098|7367->5120|7497->5222|7513->5228|7552->5245|7678->5343|7694->5349|7732->5365|9473->7078|9489->7084|9523->7096|9654->7199|9670->7205|9706->7219
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|66->35|66->35|66->35|70->39|70->39|70->39|74->43|74->43|74->43|83->52|83->52|83->52|86->55|86->55|86->55|89->58|89->58|89->58|92->61|92->61|92->61|95->64|95->64|95->64|98->67|98->67|98->67|102->71|102->71|102->71|106->75|106->75|106->75|110->79|110->79|110->79|114->83|114->83|114->83|118->87|118->87|118->87|122->91|122->91|122->91|132->101|132->101|132->101|138->107|138->107|138->107|144->113|144->113|144->113|147->116|147->116|147->116|150->119|150->119|150->119|153->122|153->122|153->122|156->125|156->125|156->125|159->128|159->128|159->128|201->170|201->170|201->170|204->173|204->173|204->173
                  -- GENERATED --
              */
          