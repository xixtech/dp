
package views.html.uielements

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object buttons_Scope0 {
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

class buttons extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main()/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Buttons</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Default Buttons
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <h4>Normal Buttons</h4>
                    <p>
                        <button type="button" class="btn btn-default">Default</button>
                        <button type="button" class="btn btn-primary">Primary</button>
                        <button type="button" class="btn btn-success">Success</button>
                        <button type="button" class="btn btn-info">Info</button>
                        <button type="button" class="btn btn-warning">Warning</button>
                        <button type="button" class="btn btn-danger">Danger</button>
                        <button type="button" class="btn btn-link">Link</button>
                    </p>
                    <br>
                    <h4>Disabled Buttons</h4>
                    <p>
                        <button type="button" class="btn btn-default disabled">Default</button>
                        <button type="button" class="btn btn-primary disabled">Primary</button>
                        <button type="button" class="btn btn-success disabled">Success</button>
                        <button type="button" class="btn btn-info disabled">Info</button>
                        <button type="button" class="btn btn-warning disabled">Warning</button>
                        <button type="button" class="btn btn-danger disabled">Danger</button>
                        <button type="button" class="btn btn-link disabled">Link</button>
                    </p>
                    <br>
                    <h4>Button Sizes</h4>
                    <p>
                        <button type="button" class="btn btn-primary btn-lg">Large button</button>
                        <button type="button" class="btn btn-primary">Default button</button>
                        <button type="button" class="btn btn-primary btn-sm">Small button</button>
                        <button type="button" class="btn btn-primary btn-xs">Mini button</button>
                        <br>
                        <br>
                        <button type="button" class="btn btn-primary btn-lg btn-block">Block level button</button>
                    </p>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
            <div class="panel panel-default">
                <div class="panel-heading">
                    Circle Icon Buttons with Font Awesome Icons
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <h4>Normal Circle Buttons</h4>
                    <button type="button" class="btn btn-default btn-circle"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i>
                    </button>
                    <button type="button" class="btn btn-success btn-circle"><i class="fa fa-link"></i>
                    </button>
                    <button type="button" class="btn btn-info btn-circle"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i>
                    </button>
                    <button type="button" class="btn btn-danger btn-circle"><i class="fa fa-heart"></i>
                    </button>
                    <br>
                    <br>
                    <h4>Large Circle Buttons</h4>
                    <button type="button" class="btn btn-default btn-circle btn-lg"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-primary btn-circle btn-lg"><i class="fa fa-list"></i>
                    </button>
                    <button type="button" class="btn btn-success btn-circle btn-lg"><i class="fa fa-link"></i>
                    </button>
                    <button type="button" class="btn btn-info btn-circle btn-lg"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-warning btn-circle btn-lg"><i class="fa fa-times"></i>
                    </button>
                    <button type="button" class="btn btn-danger btn-circle btn-lg"><i class="fa fa-heart"></i>
                    </button>
                    <br>
                    <br>
                    <h4>Extra Large Circle Buttons</h4>
                    <button type="button" class="btn btn-default btn-circle btn-xl"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-primary btn-circle btn-xl"><i class="fa fa-list"></i>
                    </button>
                    <button type="button" class="btn btn-success btn-circle btn-xl"><i class="fa fa-link"></i>
                    </button>
                    <button type="button" class="btn btn-info btn-circle btn-xl"><i class="fa fa-check"></i>
                    </button>
                    <button type="button" class="btn btn-warning btn-circle btn-xl"><i class="fa fa-times"></i>
                    </button>
                    <button type="button" class="btn btn-danger btn-circle btn-xl"><i class="fa fa-heart"></i>
                    </button>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
        <div class="col-lg-6">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Outline Buttons with Smooth Transition
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <h4>Outline Buttons</h4>
                    <p>
                        <button type="button" class="btn btn-outline btn-default">Default</button>
                        <button type="button" class="btn btn-outline btn-primary">Primary</button>
                        <button type="button" class="btn btn-outline btn-success">Success</button>
                        <button type="button" class="btn btn-outline btn-info">Info</button>
                        <button type="button" class="btn btn-outline btn-warning">Warning</button>
                        <button type="button" class="btn btn-outline btn-danger">Danger</button>
                        <button type="button" class="btn btn-outline btn-link">Link</button>
                    </p>
                    <br>
                    <h4>Outline Button Sizes</h4>
                    <p>
                        <button type="button" class="btn btn-outline btn-primary btn-lg">Large button</button>
                        <button type="button" class="btn btn-outline btn-primary">Default button</button>
                        <button type="button" class="btn btn-outline btn-primary btn-sm">Small button</button>
                        <button type="button" class="btn btn-outline btn-primary btn-xs">Mini button</button>
                        <br>
                        <br>
                        <button type="button" class="btn btn-outline btn-primary btn-lg btn-block">Block level button</button>
                    </p>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
            <div class="panel panel-default">
                <div class="panel-heading">
                    Social Buttons with Font Awesome Icons
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <h4>Social Buttons</h4>
                    <a class="btn btn-block btn-social btn-bitbucket">
                        <i class="fa fa-bitbucket"></i> Sign in with Bitbucket
                    </a>
                    <a class="btn btn-block btn-social btn-dropbox">
                        <i class="fa fa-dropbox"></i> Sign in with Dropbox
                    </a>
                    <a class="btn btn-block btn-social btn-facebook">
                        <i class="fa fa-facebook"></i> Sign in with Facebook
                    </a>
                    <a class="btn btn-block btn-social btn-flickr">
                        <i class="fa fa-flickr"></i> Sign in with Flickr
                    </a>
                    <a class="btn btn-block btn-social btn-github">
                        <i class="fa fa-github"></i> Sign in with GitHub
                    </a>
                    <a class="btn btn-block btn-social btn-google-plus">
                        <i class="fa fa-google-plus"></i> Sign in with Google
                    </a>
                    <a class="btn btn-block btn-social btn-instagram">
                        <i class="fa fa-instagram"></i> Sign in with Instagram
                    </a>
                    <a class="btn btn-block btn-social btn-linkedin">
                        <i class="fa fa-linkedin"></i> Sign in with LinkedIn
                    </a>
                    <a class="btn btn-block btn-social btn-pinterest">
                        <i class="fa fa-pinterest"></i> Sign in with Pinterest
                    </a>
                    <a class="btn btn-block btn-social btn-tumblr">
                        <i class="fa fa-tumblr"></i> Sign in with Tumblr
                    </a>
                    <a class="btn btn-block btn-social btn-twitter">
                        <i class="fa fa-twitter"></i> Sign in with Twitter
                    </a>
                    <a class="btn btn-block btn-social btn-vk">
                        <i class="fa fa-vk"></i> Sign in with VK
                    </a>

                    <hr>

                    <div class="text-center">
                        <a class="btn btn-social-icon btn-bitbucket"><i class="fa fa-bitbucket"></i></a>
                        <a class="btn btn-social-icon btn-dropbox"><i class="fa fa-dropbox"></i></a>
                        <a class="btn btn-social-icon btn-facebook"><i class="fa fa-facebook"></i></a>
                        <a class="btn btn-social-icon btn-flickr"><i class="fa fa-flickr"></i></a>
                        <a class="btn btn-social-icon btn-github"><i class="fa fa-github"></i></a>
                        <a class="btn btn-social-icon btn-google-plus"><i class="fa fa-google-plus"></i></a>
                        <a class="btn btn-social-icon btn-instagram"><i class="fa fa-instagram"></i></a>
                        <a class="btn btn-social-icon btn-linkedin"><i class="fa fa-linkedin"></i></a>
                        <a class="btn btn-social-icon btn-pinterest"><i class="fa fa-pinterest"></i></a>
                        <a class="btn btn-social-icon btn-tumblr"><i class="fa fa-tumblr"></i></a>
                        <a class="btn btn-social-icon btn-twitter"><i class="fa fa-twitter"></i></a>
                        <a class="btn btn-social-icon btn-vk"><i class="fa fa-vk"></i></a>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-6 -->
    </div>
    <!-- /.row -->
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object buttons extends buttons_Scope0.buttons
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 16:23:48 CET 2017
                  SOURCE: C:/Users/Martin/dp/masarykac/app/views/uielements/buttons.scala.html
                  HASH: 5b646066a76543ccd1aa10f5a18215099a690625
                  MATRIX: 753->1|849->3|877->6|890->12|929->14|960->19
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          