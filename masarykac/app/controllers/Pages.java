package controllers;

import play.mvc.*;
@Security.Authenticated(Secured.class)
public class Pages extends Controller {

    public Result blank() {
        return ok(views.html.pages.blank.render(""));
    }

}
