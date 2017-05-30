package controllers;

import models.Classroom;
import models.TeachersRole;
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
public class TeachersRoleController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<TeachersRole> teachersRoleForm = formFactory.form(TeachersRole.class);
        return ok(views.html.registerTeachersRole.render(teachersRoleForm));
    }

    public Result edit(long id) {
        TeachersRole c=TeachersRole.findById(id);
        Form<TeachersRole> teachersRoleForm = formFactory.form(TeachersRole.class).fill(c);
        return ok(views.html.editTeachersRole.render(id, teachersRoleForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<TeachersRole> teachersRoleForm = formFactory.form(TeachersRole.class).bindFromRequest();
        if (teachersRoleForm.hasErrors()) {
            return ok(views.html.registerTeachersRole.render(teachersRoleForm));
        }
        TeachersRole teachersRole = teachersRoleForm.get();
        try {
            saveTeachersRole(teachersRole);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerTeachersRole.render(teachersRoleForm));
        }
    }

    public Result update(long id) {
        Form<TeachersRole> teachersRoleForm = formFactory.form(TeachersRole.class).bindFromRequest();
        if (teachersRoleForm.hasErrors()) {
            return badRequest(views.html.editTeachersRole.render(id, teachersRoleForm));
        }
        TeachersRole teachersRole = teachersRoleForm.get();
        try {
            updateTeachersRole(id, teachersRole);
            return redirect(routes.TableController.listTeachersRole());
        } catch (Exception e) {
            return badRequest(views.html.editTeachersRole.render(id, teachersRoleForm));
        }
    }

    private void saveTeachersRole(TeachersRole teachersRole) throws Exception {
        TeachersRole t=new TeachersRole(teachersRole.role);
        t.save();
    }

    private void updateTeachersRole(long id, TeachersRole teachersRole) throws Exception {
        TeachersRole t = TeachersRole.findById(id);
        t.setRole(teachersRole.getRole());
        t.update();
    }


    public Result delete(long id) {
        TeachersRole t = TeachersRole.findById(id);
        t.setActive(false);
        t.update();
        return redirect(routes.TableController.listTeachersRole());
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
