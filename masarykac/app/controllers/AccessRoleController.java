package controllers;

import models.AccessRole;
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
public class AccessRoleController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<AccessRole> accessRoleForm = formFactory.form(AccessRole.class);
        return ok(views.html.registerAccessRole.render(accessRoleForm));
    }

    public Result edit(long id) {
        AccessRole c=AccessRole.findById(id);
        Form<AccessRole> accessRoleForm = formFactory.form(AccessRole.class).fill(c);
        return ok(views.html.editAccessRole.render(id, accessRoleForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<AccessRole> accessRoleForm = formFactory.form(AccessRole.class).bindFromRequest();
        if (accessRoleForm.hasErrors()) {
            return ok(views.html.registerAccessRole.render(accessRoleForm));
        }
        AccessRole accessRole = accessRoleForm.get();
        try {
            saveAccessRole(accessRole);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerAccessRole.render(accessRoleForm));
        }
    }

    public Result update(long id) {
        Form<AccessRole> accessRoleForm = formFactory.form(AccessRole.class).bindFromRequest();
        if (accessRoleForm.hasErrors()) {
            return badRequest(views.html.editAccessRole.render(id, accessRoleForm));
        }
        AccessRole accessRole= accessRoleForm.get();
        try {
            updateAccessRole(id, accessRole);
            return redirect(routes.TableController.listAccessRole());
        } catch (Exception e) {
            return badRequest(views.html.editAccessRole.render(id, accessRoleForm));
        }
    }

    private void saveAccessRole(AccessRole accessRole) throws Exception {
        AccessRole a=new AccessRole(accessRole.role, accessRole.description);
        a.save();
    }

    private void updateAccessRole(long id, AccessRole accessRole) throws Exception {
        AccessRole a = AccessRole.findById(id);
        a.setRole(accessRole.getRole());
        a.setDescription(accessRole.getDescription());
        a.update();
    }


    public Result delete(long id) {
        AccessRole a = AccessRole.findById(id);
        a.setActive(false);
        a.update();
        return redirect(routes.TableController.listAccessRole());
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
