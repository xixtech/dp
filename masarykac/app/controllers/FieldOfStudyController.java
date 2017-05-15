package controllers;

import models.FieldsOfStudy;
import models.Subjects;
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
public class FieldOfStudyController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<FieldsOfStudy> fieldsOfStudyForm = formFactory.form(FieldsOfStudy.class);
        return ok(views.html.registerFieldsOfStudy.render(fieldsOfStudyForm));
    }

    public Result edit(long id) {
        FieldsOfStudy fieldsOfStudy = FieldsOfStudy.findById(id);
        Form<FieldsOfStudy> fieldsOfStudyForm = formFactory.form(FieldsOfStudy.class).fill(fieldsOfStudy);
        return ok(views.html.editFieldsOfStudy.render(id, fieldsOfStudyForm));
    }

    public Result update(long id) {
        Form<FieldsOfStudy> fieldsOfStudyForm = formFactory.form(FieldsOfStudy.class).bindFromRequest();
        if (fieldsOfStudyForm.hasErrors()) {
            return badRequest(views.html.registerFieldsOfStudy.render(fieldsOfStudyForm));
        }
        FieldsOfStudy fieldsOfStudy = fieldsOfStudyForm.get();
        try {
            updateFieldsOfStudy(fieldsOfStudy, id);
            return redirect(routes.TableController.listFieldsOfStudy());
        } catch (Exception e) {
            return badRequest(views.html.registerFieldsOfStudy.render(fieldsOfStudyForm));
        }
    }

    public Result save() {
        Form<FieldsOfStudy> fieldsOfStudyForm = formFactory.form(FieldsOfStudy.class).bindFromRequest();
        if (fieldsOfStudyForm.hasErrors()) {
            return badRequest(views.html.registerFieldsOfStudy.render(fieldsOfStudyForm));
        }
        FieldsOfStudy fieldsOfStudy = fieldsOfStudyForm.get();
        try {
            saveFieldsOfStudy(fieldsOfStudy);
            return redirect(routes.TableController.listFieldsOfStudy());
        } catch (Exception e) {
            return badRequest(views.html.registerFieldsOfStudy.render(fieldsOfStudyForm));
        }
    }

    private void saveFieldsOfStudy(FieldsOfStudy fieldsOfStudyForm) throws Exception {
        FieldsOfStudy fieldsOfStudy = new FieldsOfStudy(fieldsOfStudyForm.fieldOfStudy, fieldsOfStudyForm.fieldOfStudyV, fieldsOfStudyForm.study,
                fieldsOfStudyForm.fieldsOfStudyLanguage, fieldsOfStudyForm.formOfTeaching);
        fieldsOfStudy.save();

    }

    private void updateFieldsOfStudy(FieldsOfStudy fieldsOfStudyForm, long id) throws Exception {
        FieldsOfStudy fieldsOfStudy = FieldsOfStudy.findById(id);
        fieldsOfStudy.setFieldOfStudy(fieldsOfStudyForm.fieldOfStudy);
        fieldsOfStudy.setFieldOfStudyV(fieldsOfStudyForm.fieldOfStudyV);
        fieldsOfStudy.setStudy(fieldsOfStudyForm.study);
        fieldsOfStudy.setFieldsOfStudyLanguage(fieldsOfStudyForm.fieldsOfStudyLanguage);
        fieldsOfStudy.setFormOfTeaching(fieldsOfStudyForm.formOfTeaching);
        fieldsOfStudy.update();

    }

}
