package controllers;

import play.mvc.*;



public class Application extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result dashboard() {
        return ok(views.html.dashboard.render());
    }
    @Security.Authenticated(Secured.class)
    public static Result index() {
        return ok(views.html.dashboard.render());
    }
    @Security.Authenticated(Secured.class)
    public static Result tables() {
        return ok(views.html.tables.tables.render());
    }
    @Security.Authenticated(Secured.class)
    public static Result workers() {
        return ok(views.html.tables.workers.render());
    }
    @Security.Authenticated(Secured.class)
    public static Result forms() {
        return ok(views.html.forms.render());
    }

    /**
     * odhlášení osoby ze systému
     *
     * @return
     */
    public static Result logout() {
        session().clear();
        flash("success", "Byl/a jste odhlášen/a.");
        return redirect(routes.Login.index());
    }
}
