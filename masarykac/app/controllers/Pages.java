package controllers;

import play.mvc.*;

public class Pages extends Controller {

    public Result blank() {
        return ok(views.html.pages.blank.render(""));
    }

}
