
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
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Osobní údaje<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*25.35*/routes/*25.41*/.PersonalStatisticController.index()),format.raw/*25.77*/("""">Zobrazit údaje</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>

            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i>Seznamy<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">


                    <li>
                        <a href='"""),_display_(/*37.35*/routes/*37.41*/.TableController.listPerson()),format.raw/*37.70*/("""'><i class="fa fa-table fa-fw"></i> Pracovníci</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*40.35*/routes/*40.41*/.TableController.listStudyPlans()),format.raw/*40.74*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní plány</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*45.35*/routes/*45.41*/.TableController.listScheduleInWeeks()),format.raw/*45.79*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh v týdnech</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*49.35*/routes/*49.41*/.TableController.listSchedule()),format.raw/*49.72*/("""'><i class="fa fa-table fa-fw"></i>
                            Rozvrh</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*54.35*/routes/*54.41*/.TableController.listEmployees()),format.raw/*54.73*/("""'><i class="fa fa-table fa-fw"></i>
                            Zaměstnanci</a>
                    </li>

                    <li>
                        <a href='"""),_display_(/*59.35*/routes/*59.41*/.TableController.listTeachers()),format.raw/*59.72*/("""'><i class="fa fa-table fa-fw"></i> Vyučující</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*62.35*/routes/*62.41*/.TableController.listStudyGroups()),format.raw/*62.75*/("""'><i class="fa fa-table fa-fw"></i>
                            Studijní skupiny</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*66.35*/routes/*66.41*/.TableController.listSemesters()),format.raw/*66.73*/("""'><i class="fa fa-table fa-fw"></i> Semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*69.35*/routes/*69.41*/.TableController.listSubjects()),format.raw/*69.72*/("""'><i class="fa fa-table fa-fw"></i> Předměty</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*72.35*/routes/*72.41*/.TableController.listFieldsOfStudy()),format.raw/*72.77*/("""'><i class="fa fa-table fa-fw"></i> Obory</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*75.35*/routes/*75.41*/.TableController.listCourses()),format.raw/*75.71*/("""'><i class="fa fa-table fa-fw"></i> Kurzy</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*78.35*/routes/*78.41*/.TableController.listCurrentSemesters()),format.raw/*78.80*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*82.35*/routes/*82.41*/.TableController.listCurrentSemestersUntilTheEndOfStudy()),format.raw/*82.98*/("""'><i class="fa fa-table fa-fw"></i>
                            Aktuální semestry do konce studia</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*86.35*/routes/*86.41*/.TableController.listDays()),format.raw/*86.68*/("""'><i class="fa fa-table fa-fw"></i> Dny</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Další stránky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.Pages.blank),format.raw/*95.53*/("""">Blank Page</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.Application.pdf()),format.raw/*98.59*/("""">pdf</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*101.35*/routes/*101.41*/.TestController.test()),format.raw/*101.63*/("""">test</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*104.35*/routes/*104.41*/.SubjectPlanTeachingController.index()),format.raw/*104.79*/("""">Přidání předmětu do kurzu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*107.35*/routes/*107.41*/.VisitsController.index()),format.raw/*107.66*/("""">Registrace výjezdu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*110.35*/routes/*110.41*/.ProjectController.index()),format.raw/*110.67*/("""">Registrace projektu</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*113.35*/routes/*113.41*/.PublicationsController.index()),format.raw/*113.72*/("""">Registrace publikace</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*116.35*/routes/*116.41*/.OrganizationalUnitsController.index()),format.raw/*116.79*/("""">Registrace organizační jednotky</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*119.35*/routes/*119.41*/.OrganizationalUnitsController.indexParticipants()),format.raw/*119.91*/("""">OJ zaměstnanec</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*122.35*/routes/*122.41*/.FinalWorksController.index()),format.raw/*122.70*/("""">Registrace závěrečné práce</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*126.35*/routes/*126.41*/.Application.kpiChoosePerson()),format.raw/*126.71*/("""">KPI výběr osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*129.35*/routes/*129.41*/.Application.roles()),format.raw/*129.61*/("""">Role</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*132.35*/routes/*132.41*/.PersonController.index()),format.raw/*132.66*/("""">Registrace osoby</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*135.35*/routes/*135.41*/.EmployeesController.index()),format.raw/*135.69*/("""">Registrace zaměstnance</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*139.35*/routes/*139.41*/.SubjectController.index()),format.raw/*139.67*/("""">Registrace předmětu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*143.35*/routes/*143.41*/.FieldOfStudyController.index()),format.raw/*143.72*/("""">Registrace oboru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*147.35*/routes/*147.41*/.StudyGroupsController.index()),format.raw/*147.71*/("""">Registrace skupiny</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*151.35*/routes/*151.41*/.SemestersController.index()),format.raw/*151.69*/("""">Registrace semestru</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*155.35*/routes/*155.41*/.StudyPlansController.index()),format.raw/*155.70*/("""">Registrace studijního plánu</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*159.35*/routes/*159.41*/.TeachersController.index()),format.raw/*159.68*/("""">Registrace učitele</a>
                    </li>

                    <li>
                        <a href=""""),_display_(/*163.35*/routes/*163.41*/.CourseController.index()),format.raw/*163.66*/("""">Registrace kurzu</a>
                    </li>

                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-files-o fa-fw"></i> Metodika<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*173.35*/routes/*173.41*/.MethodicsController.index()),format.raw/*173.69*/("""">Přidat metodiku</a>
                    </li>
                </ul>
                    <!-- /.nav-second-level -->
            </li>
            <li>
                <a href='"""),_display_(/*179.27*/routes/*179.33*/.Application.forms),format.raw/*179.51*/("""'><i class="fa fa-edit fa-fw"></i> Formuláře</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> UI prvky<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href=""""),_display_(/*185.35*/routes/*185.41*/.UiElements.panelsAndWells),format.raw/*185.67*/("""">Panels and Wells</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*188.35*/routes/*188.41*/.UiElements.buttons),format.raw/*188.60*/("""">Buttons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*191.35*/routes/*191.41*/.UiElements.notifications),format.raw/*191.66*/("""">Notifications</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*194.35*/routes/*194.41*/.UiElements.typography),format.raw/*194.63*/("""">Typography</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*197.35*/routes/*197.41*/.UiElements.icons),format.raw/*197.58*/(""""> Icons</a>
                    </li>
                    <li>
                        <a href=""""),_display_(/*200.35*/routes/*200.41*/.UiElements.grid),format.raw/*200.57*/("""">Grid</a>
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
                        <a href='"""),_display_(/*242.35*/routes/*242.41*/.Charts.flot),format.raw/*242.53*/("""'>Flot Charts</a>
                    </li>
                    <li>
                        <a href='"""),_display_(/*245.35*/routes/*245.41*/.Charts.morris),format.raw/*245.55*/("""'>Morris.js Charts</a>
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
                  DATE: Tue Mar 28 13:07:37 CEST 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/sidebar.scala.html
                  HASH: f878a7c0171899ed11602c54e84065cae5169298
                  MATRIX: 742->1|838->3|865->4|1586->698|1601->704|1644->726|2017->1072|2032->1078|2089->1114|2483->1481|2498->1487|2548->1516|2711->1652|2726->1658|2780->1691|2976->1860|2991->1866|3050->1904|3247->2074|3262->2080|3314->2111|3502->2272|3517->2278|3570->2310|3763->2476|3778->2482|3830->2513|3992->2648|4007->2654|4062->2688|4259->2858|4274->2864|4327->2896|4488->3030|4503->3036|4555->3067|4716->3201|4731->3207|4788->3243|4946->3374|4961->3380|5012->3410|5170->3541|5185->3547|5245->3586|5443->3757|5458->3763|5536->3820|5750->4007|5765->4013|5813->4040|6236->4436|6251->4442|6284->4454|6413->4556|6428->4562|6467->4580|6590->4675|6606->4681|6650->4703|6774->4799|6790->4805|6850->4843|6995->4960|7011->4966|7058->4991|7196->5101|7212->5107|7260->5133|7399->5244|7415->5250|7468->5281|7608->5393|7624->5399|7684->5437|7835->5560|7851->5566|7923->5616|8057->5722|8073->5728|8124->5757|8271->5876|8287->5882|8339->5912|8474->6019|8490->6025|8532->6045|8656->6141|8672->6147|8719->6172|8855->6280|8871->6286|8921->6314|9064->6429|9080->6435|9128->6461|9268->6573|9284->6579|9337->6610|9474->6719|9490->6725|9542->6755|9681->6866|9697->6872|9747->6900|9887->7012|9903->7018|9954->7047|10102->7167|10118->7173|10167->7200|10306->7311|10322->7317|10369->7342|10768->7713|10784->7719|10834->7747|11041->7926|11057->7932|11097->7950|11424->8249|11440->8255|11488->8281|11624->8389|11640->8395|11681->8414|11808->8513|11824->8519|11871->8544|12004->8649|12020->8655|12064->8677|12194->8779|12210->8785|12249->8802|12375->8900|12391->8906|12429->8922|14170->10635|14186->10641|14220->10653|14351->10756|14367->10762|14403->10776
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|56->25|56->25|56->25|68->37|68->37|68->37|71->40|71->40|71->40|76->45|76->45|76->45|80->49|80->49|80->49|85->54|85->54|85->54|90->59|90->59|90->59|93->62|93->62|93->62|97->66|97->66|97->66|100->69|100->69|100->69|103->72|103->72|103->72|106->75|106->75|106->75|109->78|109->78|109->78|113->82|113->82|113->82|117->86|117->86|117->86|126->95|126->95|126->95|129->98|129->98|129->98|132->101|132->101|132->101|135->104|135->104|135->104|138->107|138->107|138->107|141->110|141->110|141->110|144->113|144->113|144->113|147->116|147->116|147->116|150->119|150->119|150->119|153->122|153->122|153->122|157->126|157->126|157->126|160->129|160->129|160->129|163->132|163->132|163->132|166->135|166->135|166->135|170->139|170->139|170->139|174->143|174->143|174->143|178->147|178->147|178->147|182->151|182->151|182->151|186->155|186->155|186->155|190->159|190->159|190->159|194->163|194->163|194->163|204->173|204->173|204->173|210->179|210->179|210->179|216->185|216->185|216->185|219->188|219->188|219->188|222->191|222->191|222->191|225->194|225->194|225->194|228->197|228->197|228->197|231->200|231->200|231->200|273->242|273->242|273->242|276->245|276->245|276->245
                  -- GENERATED --
              */
          