package controllers;

import play.mvc.*;

public class UiElements extends Controller {

    public Result panelsAndWells() {
        return ok(views.html.uielements.panelsAndWells.render());
    }
    public Result buttons() {
        return ok(views.html.uielements.buttons.render());
    }
    public Result notifications() {
        return ok(views.html.uielements.notifications.render());
    }
    public Result typography() {
        return ok(views.html.uielements.typography.render());
    }
    public Result icons() {
        return ok(views.html.uielements.icons.render());
    }
    public Result grid() {
        return ok(views.html.uielements.grid.render());
    }
}
