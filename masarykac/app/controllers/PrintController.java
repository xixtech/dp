package controllers;

import models.Person;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by Martin on 04.02.2017.
 */

public class PrintController  extends Controller {

    /**
     * přesměrování na vypsání údajů konkrétní osoby
     *
     * @param id
     * @return
     */
    public Result printUserDetails(Long id) {
        return redirect(routes.PrintController.detailsList(id));

    }


    /**
     * vypsání údajů konrétní osoby
     *
     * @param id
     * @return
     */
    public Result detailsList(long id) {
        return ok(views.html.personDetail.render(Person.personDetail(id)));
    }

}
