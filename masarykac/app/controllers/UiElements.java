package controllers;

import play.mvc.*;

public class UiElements extends Controller {

    public static Result panelsAndWells() {
        return ok(views.html.uielements.panelsAndWells.render());
    }
    public static Result buttons() {
        return ok(views.html.uielements.buttons.render());
    }
    public static Result notifications() {
        return ok(views.html.uielements.notifications.render());
    }
    public static Result typography() {
        return ok(views.html.uielements.typography.render());
    }
    public static Result icons() {
        return ok(views.html.uielements.icons.render());
    }
    public static Result grid() {
        return ok(views.html.uielements.grid.render());
    }
}
