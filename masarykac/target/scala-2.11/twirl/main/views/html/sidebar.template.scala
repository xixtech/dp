
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
                        <a href='"""),_display_(/*53.35*/routes/*53.41*/.TableController.listStudyGroups()),format.raw/*53.75*/("""'><i class="fa fa-table fa-fw"></i> Studijní skupiny</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*56.35*/routes/*56.41*/.TableController.listSemesters()),format.raw/*56.73*/("""'><i class="fa fa-table fa-fw"></i> Semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*59.35*/routes/*59.41*/.TableController.listSubjects()),format.raw/*59.72*/("""'><i class="fa fa-table fa-fw"></i> Předměty</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*62.35*/routes/*62.41*/.TableController.listFieldsOfStudy()),format.raw/*62.77*/("""'><i class="fa fa-table fa-fw"></i> Obory</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*65.35*/routes/*65.41*/.TableController.listCourses()),format.raw/*65.71*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*68.35*/routes/*68.41*/.TableController.listCurrentSemesters()),format.raw/*68.80*/("""'><i class="fa fa-table fa-fw"></i> Aktuální semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*71.35*/routes/*71.41*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*71.98*/("""'><i class="fa fa-table fa-fw"></i> Aktuální semestry do konce studia</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*74.35*/routes/*74.41*/.TableController.listDays()),format.raw/*74.68*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*83.35*/routes/*83.41*/.Pages.blank),format.raw/*83.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*86.35*/routes/*86.41*/.Application.pdf()),format.raw/*86.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*89.35*/routes/*89.41*/.TestController.test()),format.raw/*89.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*92.35*/routes/*92.41*/.SubjectPlanTeachingController.index()),format.raw/*92.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.Application.kpiChoosePerson()),format.raw/*95.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.Application.roles()),format.raw/*98.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.PersonController.index()),format.raw/*101.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*104.35*/routes/*104.41*/.EmployeesController.index()),format.raw/*104.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*108.35*/routes/*108.41*/.SubjectController.index()),format.raw/*108.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*112.35*/routes/*112.41*/.FieldOfStudyController.index()),format.raw/*112.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*116.35*/routes/*116.41*/.StudyGroupsController.index()),format.raw/*116.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*120.35*/routes/*120.41*/.SemestersController.index()),format.raw/*120.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*124.35*/routes/*124.41*/.StudyPlansController.index()),format.raw/*124.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*128.35*/routes/*128.41*/.TeachersController.index()),format.raw/*128.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*132.35*/routes/*132.41*/.CourseController.index()),format.raw/*132.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*142.35*/routes/*142.41*/.MethodicsController.index()),format.raw/*142.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*148.27*/routes/*148.33*/.Application.forms),format.raw/*148.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*154.35*/routes/*154.41*/.UiElements.panelsAndWells),format.raw/*154.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*157.35*/routes/*157.41*/.UiElements.buttons),format.raw/*157.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*160.35*/routes/*160.41*/.UiElements.notifications),format.raw/*160.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*163.35*/routes/*163.41*/.UiElements.typography),format.raw/*163.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*166.35*/routes/*166.41*/.UiElements.icons),format.raw/*166.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*169.35*/routes/*169.41*/.UiElements.grid),format.raw/*169.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*211.35*/routes/*211.41*/.Charts.flot),format.raw/*211.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*214.35*/routes/*214.41*/.Charts.morris),format.raw/*214.55*/("""'>Morris.js Charts</a>
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
                  DATE: Fri Mar 24 22:10:45 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 9a01459ea43deacdf23308f38393cd93da47a5f0
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2505->1446|2520->1452|2579->1490|2776->1660|2791->1666|2843->1697|3031->1858|3046->1864|3099->1896|3292->2062|3307->2068|3359->2099|3521->2234|3536->2240|3591->2274|3760->2416|3775->2422|3828->2454|3989->2588|4004->2594|4056->2625|4217->2759|4232->2765|4289->2801|4447->2932|4462->2938|4513->2968|4671->3099|4686->3105|4746->3144|4916->3287|4931->3293|5009->3350|5195->3509|5210->3515|5258->3542|5681->3938|5696->3944|5729->3956|5858->4058|5873->4064|5912->4082|6034->4177|6049->4183|6092->4205|6215->4301|6230->4307|6289->4345|6433->4462|6448->4468|6499->4498|6633->4605|6648->4611|6689->4631|6813->4727|6829->4733|6876->4758|7012->4866|7028->4872|7078->4900|7221->5015|7237->5021|7285->5047|7425->5159|7441->5165|7494->5196|7631->5305|7647->5311|7699->5341|7838->5452|7854->5458|7904->5486|8044->5598|8060->5604|8111->5633|8259->5753|8275->5759|8324->5786|8463->5897|8479->5903|8526->5928|8925->6299|8941->6305|8991->6333|9198->6512|9214->6518|9254->6536|9581->6835|9597->6841|9645->6867|9781->6975|9797->6981|9838->7000|9965->7099|9981->7105|10028->7130|10161->7235|10177->7241|10221->7263|10351->7365|10367->7371|10406->7388|10532->7486|10548->7492|10586->7508|12327->9221|12343->9227|12377->9239|12508->9342|12524->9348|12560->9362
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|71->40|71->40|71->40|76->45|76->45|76->45|81->50|81->50|81->50|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59|93->62|93->62|93->62|96->65|96->65|96->65|99->68|99->68|99->68|102->71|102->71|102->71|105->74|105->74|105->74|114->83|114->83|114->83|117->86|117->86|117->86|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|129->98|129->98|129->98|132->101|132->101|132->101|135->104|135->104|135->104|139->108|139->108|139->108|143->112|143->112|143->112|147->116|147->116|147->116|151->120|151->120|151->120|155->124|155->124|155->124|159->128|159->128|159->128|163->132|163->132|163->132|173->142|173->142|173->142|179->148|179->148|179->148|185->154|185->154|185->154|188->157|188->157|188->157|191->160|191->160|191->160|194->163|194->163|194->163|197->166|197->166|197->166|200->169|200->169|200->169|242->211|242->211|242->211|245->214|245->214|245->214
                  -- GENERATED --
              */
          