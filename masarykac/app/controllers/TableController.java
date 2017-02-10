package controllers;

import models.Person;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Martin on 03.02.2017.
 */

public class TableController extends Controller {

    public Result listPerson() {
        return ok(views.html.tables.workers.render(Person.search()));
    }
}
