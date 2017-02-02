package controllers;

import play.mvc.*;

public class Pages extends Controller {

    public static Result blank() {
        return ok(views.html.pages.blank.render());
    }

}
