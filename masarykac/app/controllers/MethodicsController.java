package controllers;

import models.Methodics;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import static play.data.Form.form;

/**
 * Created by Martin on 10.02.2017.
 */
@Security.Authenticated(Secured.class)
public class MethodicsController extends Controller{
    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Methodics> methodicsForm = formFactory.form(Methodics.class);
        return ok(views.html.registerMethodics.render(methodicsForm));
    }

    public Result save() {
        Form<Methodics> methodicsForm = formFactory.form(Methodics.class).bindFromRequest();
        if (methodicsForm.hasErrors()) {
            return badRequest(views.html.registerMethodics.render(methodicsForm));
        }
        Methodics registerMethodics = methodicsForm.get();
        Result resultError = checkBeforeSave(methodicsForm, registerMethodics.title);
        if (resultError != null) {
            return resultError;
        }
        try {
            saveMethodics(registerMethodics);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerMethodics.render(methodicsForm));
        }
    }

    private void saveMethodics(Methodics registerMethodics) throws Exception {
        Methodics methodics = new Methodics(registerMethodics.title,registerMethodics.coefficient);
        methodics.save();
    }

    private Result checkBeforeSave(Form<Methodics> registerMethodics, String title) {
        // Check unique title
        if (Methodics.findByTitle(title) != null) {
            registerMethodics.reject("title",
                    "Tento název již existuje, zvolte jiný");
            return badRequest(views.html.registerMethodics.render(registerMethodics));

        }
        return null;
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
