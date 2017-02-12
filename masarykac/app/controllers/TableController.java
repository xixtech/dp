package controllers;

import models.Member;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Martin on 03.02.2017.
 */
@Security.Authenticated(Secured.class)
public class TableController extends Controller {

    public Result listPerson() {
        return ok(views.html.tables.workers.render(Member.search()));
    }
}
