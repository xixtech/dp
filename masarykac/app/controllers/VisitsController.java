package controllers;

import models.Subjects;
import models.Visits;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class VisitsController extends Controller {

    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Visits> visitsForm = formFactory.form(Visits.class);
        return ok(views.html.registerVisits.render(visitsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     *
     */
    public Result save() {
        Form<Visits> visitsForm = formFactory.form(Visits.class).bindFromRequest();
        if (visitsForm.hasErrors()) {
            return badRequest(views.html.registerVisits.render(visitsForm));
        }
        Visits visits = visitsForm.get();
        try {
            saveVisit(visits);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerVisits.render(visitsForm));
        }
    }

    private void saveVisit(Visits visits) throws Exception {
       Visits v=new Visits(visits.purposeOfVisit,visits.country,visits.event,visits.visitFrom,visits.visitTo,visits.employees,visits.semester);
        v.save();

    }

}
