package controllers;

import models.Classroom;
import models.Ideas;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Date;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class IdeasController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Ideas> ideasForm = formFactory.form(Ideas.class);
        return ok(views.html.registerIdeas.render(ideasForm));
    }

    public Result save() {
        Form<Ideas> ideasForm = formFactory.form(Ideas.class).bindFromRequest();
        if (ideasForm.hasErrors()) {
            return badRequest(views.html.registerIdeas.render(ideasForm));
        }
        Ideas ideas = ideasForm.get();
        try {
            saveIdeas(ideas);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerIdeas.render(ideasForm));
        }
    }

    private void saveIdeas(Ideas ideas) throws Exception {
        Ideas i = new Ideas(ideas.idea, new Date());
        i.save();
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
