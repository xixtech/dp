
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
                        <a href=""""),_display_(/*92.35*/routes/*92.41*/.Application.kpiChoosePerson()),format.raw/*92.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.Application.roles()),format.raw/*95.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.PersonController.index()),format.raw/*98.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.EmployeesController.index()),format.raw/*101.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*105.35*/routes/*105.41*/.SubjectController.index()),format.raw/*105.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*109.35*/routes/*109.41*/.FieldOfStudyController.index()),format.raw/*109.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*113.35*/routes/*113.41*/.StudyGroupsController.index()),format.raw/*113.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*117.35*/routes/*117.41*/.SemestersController.index()),format.raw/*117.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*121.35*/routes/*121.41*/.StudyPlansController.index()),format.raw/*121.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*125.35*/routes/*125.41*/.TeachersController.index()),format.raw/*125.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*129.35*/routes/*129.41*/.CourseController.index()),format.raw/*129.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*139.35*/routes/*139.41*/.MethodicsController.index()),format.raw/*139.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*145.27*/routes/*145.33*/.Application.forms),format.raw/*145.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*151.35*/routes/*151.41*/.UiElements.panelsAndWells),format.raw/*151.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*154.35*/routes/*154.41*/.UiElements.buttons),format.raw/*154.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*157.35*/routes/*157.41*/.UiElements.notifications),format.raw/*157.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*160.35*/routes/*160.41*/.UiElements.typography),format.raw/*160.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*163.35*/routes/*163.41*/.UiElements.icons),format.raw/*163.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*166.35*/routes/*166.41*/.UiElements.grid),format.raw/*166.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*208.35*/routes/*208.41*/.Charts.flot),format.raw/*208.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*211.35*/routes/*211.41*/.Charts.morris),format.raw/*211.55*/("""'>Morris.js Charts</a>
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
                  DATE: Tue Mar 21 23:08:36 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 2754cbdd9fe5895eab0e6e6ababf71c40753f6d3
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2505->1446|2520->1452|2579->1490|2776->1660|2791->1666|2843->1697|3031->1858|3046->1864|3099->1896|3292->2062|3307->2068|3359->2099|3521->2234|3536->2240|3591->2274|3760->2416|3775->2422|3828->2454|3989->2588|4004->2594|4056->2625|4217->2759|4232->2765|4289->2801|4447->2932|4462->2938|4513->2968|4671->3099|4686->3105|4746->3144|4916->3287|4931->3293|5009->3350|5195->3509|5210->3515|5258->3542|5681->3938|5696->3944|5729->3956|5858->4058|5873->4064|5912->4082|6034->4177|6049->4183|6092->4205|6215->4301|6230->4307|6281->4337|6415->4444|6430->4450|6471->4470|6594->4566|6609->4572|6655->4597|6791->4705|6807->4711|6857->4739|7000->4854|7016->4860|7064->4886|7204->4998|7220->5004|7273->5035|7410->5144|7426->5150|7478->5180|7617->5291|7633->5297|7683->5325|7823->5437|7839->5443|7890->5472|8038->5592|8054->5598|8103->5625|8242->5736|8258->5742|8305->5767|8704->6138|8720->6144|8770->6172|8977->6351|8993->6357|9033->6375|9360->6674|9376->6680|9424->6706|9560->6814|9576->6820|9617->6839|9744->6938|9760->6944|9807->6969|9940->7074|9956->7080|10000->7102|10130->7204|10146->7210|10185->7227|10311->7325|10327->7331|10365->7347|12106->9060|12122->9066|12156->9078|12287->9181|12303->9187|12339->9201
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|71->40|71->40|71->40|76->45|76->45|76->45|81->50|81->50|81->50|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59|93->62|93->62|93->62|96->65|96->65|96->65|99->68|99->68|99->68|102->71|102->71|102->71|105->74|105->74|105->74|114->83|114->83|114->83|117->86|117->86|117->86|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|129->98|129->98|129->98|132->101|132->101|132->101|136->105|136->105|136->105|140->109|140->109|140->109|144->113|144->113|144->113|148->117|148->117|148->117|152->121|152->121|152->121|156->125|156->125|156->125|160->129|160->129|160->129|170->139|170->139|170->139|176->145|176->145|176->145|182->151|182->151|182->151|185->154|185->154|185->154|188->157|188->157|188->157|191->160|191->160|191->160|194->163|194->163|194->163|197->166|197->166|197->166|239->208|239->208|239->208|242->211|242->211|242->211
                  -- GENERATED --
              */
          