package controllers;

import play.mvc.*;

public class Charts extends Controller {

    public static Result flot() {
        return ok(views.html.charts.flot.render());
    }
    public static Result morris() {
        return ok(views.html.charts.morris.render());
    }
}
