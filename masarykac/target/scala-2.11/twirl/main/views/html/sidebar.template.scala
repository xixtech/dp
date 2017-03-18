
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
                        <a href=""""),_display_(/*89.35*/routes/*89.41*/.Application.kpiChoosePerson()),format.raw/*89.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*92.35*/routes/*92.41*/.Application.roles()),format.raw/*92.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.PersonController.index()),format.raw/*95.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.EmployeesController.index()),format.raw/*98.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*102.35*/routes/*102.41*/.SubjectController.index()),format.raw/*102.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*106.35*/routes/*106.41*/.FieldOfStudyController.index()),format.raw/*106.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*110.35*/routes/*110.41*/.StudyGroupsController.index()),format.raw/*110.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*114.35*/routes/*114.41*/.SemestersController.index()),format.raw/*114.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*118.35*/routes/*118.41*/.StudyPlansController.index()),format.raw/*118.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*122.35*/routes/*122.41*/.TeachersController.index()),format.raw/*122.68*/("""">Registrace učitele</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*132.35*/routes/*132.41*/.MethodicsController.index()),format.raw/*132.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*138.27*/routes/*138.33*/.Application.forms),format.raw/*138.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*144.35*/routes/*144.41*/.UiElements.panelsAndWells),format.raw/*144.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*147.35*/routes/*147.41*/.UiElements.buttons),format.raw/*147.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*150.35*/routes/*150.41*/.UiElements.notifications),format.raw/*150.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*153.35*/routes/*153.41*/.UiElements.typography),format.raw/*153.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*156.35*/routes/*156.41*/.UiElements.icons),format.raw/*156.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*159.35*/routes/*159.41*/.UiElements.grid),format.raw/*159.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*201.35*/routes/*201.41*/.Charts.flot),format.raw/*201.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*204.35*/routes/*204.41*/.Charts.morris),format.raw/*204.55*/("""'>Morris.js Charts</a>
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
                  DATE: Sat Mar 18 11:21:59 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: 523f46317bbdefd409cb68d0dbe6273c5201cea3
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2012->1067|2027->1073|2077->1102|2240->1238|2255->1244|2309->1277|2505->1446|2520->1452|2579->1490|2776->1660|2791->1666|2843->1697|3031->1858|3046->1864|3099->1896|3292->2062|3307->2068|3359->2099|3521->2234|3536->2240|3591->2274|3760->2416|3775->2422|3828->2454|3989->2588|4004->2594|4056->2625|4217->2759|4232->2765|4289->2801|4447->2932|4462->2938|4513->2968|4671->3099|4686->3105|4746->3144|4916->3287|4931->3293|5009->3350|5195->3509|5210->3515|5258->3542|5681->3938|5696->3944|5729->3956|5858->4058|5873->4064|5912->4082|6034->4177|6049->4183|6100->4213|6234->4320|6249->4326|6290->4346|6413->4442|6428->4448|6474->4473|6609->4581|6624->4587|6673->4615|6816->4730|6832->4736|6880->4762|7020->4874|7036->4880|7089->4911|7226->5020|7242->5026|7294->5056|7433->5167|7449->5173|7499->5201|7639->5313|7655->5319|7706->5348|7854->5468|7870->5474|7919->5501|8320->5874|8336->5880|8386->5908|8593->6087|8609->6093|8649->6111|8976->6410|8992->6416|9040->6442|9176->6550|9192->6556|9233->6575|9360->6674|9376->6680|9423->6705|9556->6810|9572->6816|9616->6838|9746->6940|9762->6946|9801->6963|9927->7061|9943->7067|9981->7083|11722->8796|11738->8802|11772->8814|11903->8917|11919->8923|11955->8937
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|59->28|59->28|59->28|62->31|62->31|62->31|67->36|67->36|67->36|71->40|71->40|71->40|76->45|76->45|76->45|81->50|81->50|81->50|84->53|84->53|84->53|87->56|87->56|87->56|90->59|90->59|90->59|93->62|93->62|93->62|96->65|96->65|96->65|99->68|99->68|99->68|102->71|102->71|102->71|105->74|105->74|105->74|114->83|114->83|114->83|117->86|117->86|117->86|120->89|120->89|120->89|123->92|123->92|123->92|126->95|126->95|126->95|129->98|129->98|129->98|133->102|133->102|133->102|137->106|137->106|137->106|141->110|141->110|141->110|145->114|145->114|145->114|149->118|149->118|149->118|153->122|153->122|153->122|163->132|163->132|163->132|169->138|169->138|169->138|175->144|175->144|175->144|178->147|178->147|178->147|181->150|181->150|181->150|184->153|184->153|184->153|187->156|187->156|187->156|190->159|190->159|190->159|232->201|232->201|232->201|235->204|235->204|235->204
                  -- GENERATED --
              */
          