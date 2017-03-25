
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
                        <a href='"""),_display_(/*31.35*/routes/*31.41*/.TableController.listStudyPlans()),format.raw/*31.74*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní plány</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*36.35*/routes/*36.41*/.TableController.listScheduleInWeeks()),format.raw/*36.79*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh v týdnech</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*40.35*/routes/*40.41*/.TableController.listSchedule()),format.raw/*40.72*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*45.35*/routes/*45.41*/.TableController.listEmployees()),format.raw/*45.73*/("""'><i class="fa fa-table fa-fw"></i>
                            Zaměstnanci</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*50.35*/routes/*50.41*/.TableController.listTeachers()),format.raw/*50.72*/("""'><i class="fa fa-table fa-fw"></i> Vyučující</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*53.35*/routes/*53.41*/.TableController.listStudyGroups()),format.raw/*53.75*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní skupiny</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*57.35*/routes/*57.41*/.TableController.listSemesters()),format.raw/*57.73*/("""'><i class="fa fa-table fa-fw"></i> Semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*60.35*/routes/*60.41*/.TableController.listSubjects()),format.raw/*60.72*/("""'><i class="fa fa-table fa-fw"></i> Předměty</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*63.35*/routes/*63.41*/.TableController.listFieldsOfStudy()),format.raw/*63.77*/("""'><i class="fa fa-table fa-fw"></i> Obory</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*66.35*/routes/*66.41*/.TableController.listCourses()),format.raw/*66.71*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*69.35*/routes/*69.41*/.TableController.listCurrentSemesters()),format.raw/*69.80*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*73.35*/routes/*73.41*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*73.98*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry do konce studia</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*77.35*/routes/*77.41*/.TableController.listDays()),format.raw/*77.68*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*86.35*/routes/*86.41*/.Pages.blank),format.raw/*86.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*89.35*/routes/*89.41*/.Application.pdf()),format.raw/*89.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*92.35*/routes/*92.41*/.TestController.test()),format.raw/*92.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.SubjectPlanTeachingController.index()),format.raw/*95.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.VisitsController.index()),format.raw/*98.66*/("""">Registrace výjezdu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.ProjectController.index()),format.raw/*101.67*/("""">Registrace projektu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*104.35*/routes/*104.41*/.PublicationsController.index()),format.raw/*104.72*/("""">Registrace publikace</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*107.35*/routes/*107.41*/.FinalWorksController.index()),format.raw/*107.70*/("""">Registrace závěrečné práce</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*111.35*/routes/*111.41*/.Application.kpiChoosePerson()),format.raw/*111.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*114.35*/routes/*114.41*/.Application.roles()),format.raw/*114.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*117.35*/routes/*117.41*/.PersonController.index()),format.raw/*117.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*120.35*/routes/*120.41*/.EmployeesController.index()),format.raw/*120.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*124.35*/routes/*124.41*/.SubjectController.index()),format.raw/*124.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*128.35*/routes/*128.41*/.FieldOfStudyController.index()),format.raw/*128.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*132.35*/routes/*132.41*/.StudyGroupsController.index()),format.raw/*132.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*136.35*/routes/*136.41*/.SemestersController.index()),format.raw/*136.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*140.35*/routes/*140.41*/.StudyPlansController.index()),format.raw/*140.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*144.35*/routes/*144.41*/.TeachersController.index()),format.raw/*144.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*148.35*/routes/*148.41*/.CourseController.index()),format.raw/*148.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*158.35*/routes/*158.41*/.MethodicsController.index()),format.raw/*158.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*164.27*/routes/*164.33*/.Application.forms),format.raw/*164.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*170.35*/routes/*170.41*/.UiElements.panelsAndWells),format.raw/*170.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*173.35*/routes/*173.41*/.UiElements.buttons),format.raw/*173.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*176.35*/routes/*176.41*/.UiElements.notifications),format.raw/*176.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*179.35*/routes/*179.41*/.UiElements.typography),format.raw/*179.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*182.35*/routes/*182.41*/.UiElements.icons),format.raw/*182.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*185.35*/routes/*185.41*/.UiElements.grid),format.raw/*185.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*227.35*/routes/*227.41*/.Charts.flot),format.raw/*227.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*230.35*/routes/*230.41*/.Charts.morris),format.raw/*230.55*/("""'>Morris.js Charts</a>
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
                  DATE: Sat Mar 25 09:30:07 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: fad82fc2e500857271fd3047d031377c139ea4a2
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2505->1446|2520->1452|2579->1490|2776->1660|2791->1666|2843->1697|3031->1858|3046->1864|3099->1896|3292->2062|3307->2068|3359->2099|3521->2234|3536->2240|3591->2274|3788->2444|3803->2450|3856->2482|4017->2616|4032->2622|4084->2653|4245->2787|4260->2793|4317->2829|4475->2960|4490->2966|4541->2996|4699->3127|4714->3133|4774->3172|4972->3343|4987->3349|5065->3406|5279->3593|5294->3599|5342->3626|5765->4022|5780->4028|5813->4040|5942->4142|5957->4148|5996->4166|6118->4261|6133->4267|6176->4289|6299->4385|6314->4391|6373->4429|6517->4546|6532->4552|6578->4577|6716->4687|6732->4693|6780->4719|6919->4830|6935->4836|6988->4867|7128->4979|7144->4985|7195->5014|7342->5133|7358->5139|7410->5169|7545->5276|7561->5282|7603->5302|7727->5398|7743->5404|7790->5429|7926->5537|7942->5543|7992->5571|8135->5686|8151->5692|8199->5718|8339->5830|8355->5836|8408->5867|8545->5976|8561->5982|8613->6012|8752->6123|8768->6129|8818->6157|8958->6269|8974->6275|9025->6304|9173->6424|9189->6430|9238->6457|9377->6568|9393->6574|9440->6599|9839->6970|9855->6976|9905->7004|10112->7183|10128->7189|10168->7207|10495->7506|10511->7512|10559->7538|10695->7646|10711->7652|10752->7671|10879->7770|10895->7776|10942->7801|11075->7906|11091->7912|11135->7934|11265->8036|11281->8042|11320->8059|11446->8157|11462->8163|11500->8179|13241->9892|13257->9898|13291->9910|13422->10013|13438->10019|13474->10033
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|71->40|71->40|71->40|76->45|76->45|76->45|81->50|81->50|81->50|84->53|84->53|84->53|88->57|88->57|88->57|91->60|91->60|91->60|94->63|94->63|94->63|97->66|97->66|97->66|100->69|100->69|100->69|104->73|104->73|104->73|108->77|108->77|108->77|117->86|117->86|117->86|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|129->98|129->98|129->98|132->101|132->101|132->101|135->104|135->104|135->104|138->107|138->107|138->107|142->111|142->111|142->111|145->114|145->114|145->114|148->117|148->117|148->117|151->120|151->120|151->120|155->124|155->124|155->124|159->128|159->128|159->128|163->132|163->132|163->132|167->136|167->136|167->136|171->140|171->140|171->140|175->144|175->144|175->144|179->148|179->148|179->148|189->158|189->158|189->158|195->164|195->164|195->164|201->170|201->170|201->170|204->173|204->173|204->173|207->176|207->176|207->176|210->179|210->179|210->179|213->182|213->182|213->182|216->185|216->185|216->185|258->227|258->227|258->227|261->230|261->230|261->230
                  -- GENERATED --
              */
          