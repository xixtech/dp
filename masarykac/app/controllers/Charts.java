package controllers;

import play.mvc.*;
@Security.Authenticated(Secured.class)
public class Charts extends Controller {

    public Result flot() {
        return ok(views.html.charts.flot.render());
    }
    public Result morris() {
        return ok(views.html.charts.morris.render());
    }
}
