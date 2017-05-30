package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class OrganizationalUnitsController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<OrganizationalUnits> organizationalUnitsForm = formFactory.form(OrganizationalUnits.class);
        return ok(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
    }

    public Result indexParticipants() {
        Form<OrganizationalUnitsParticipants> organizationalUnitsParticipantsForm = formFactory.form(OrganizationalUnitsParticipants.class);
        return ok(views.html.registerOUParticipants.render(organizationalUnitsParticipantsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<OrganizationalUnits> organizationalUnitsForm = formFactory.form(OrganizationalUnits.class).bindFromRequest();
        if (organizationalUnitsForm.hasErrors()) {
            return badRequest(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
        }
        Map<String, String[]> formData = request().body().asFormUrlEncoded();
        try {
            saveOrganizationalUnit(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerOrganizationalUnits.render(organizationalUnitsForm));
        }
    }

    public Result saveParticipants() {
        Form<OrganizationalUnitsParticipants> organizationalUnitsParticipantsForm = formFactory.form(OrganizationalUnitsParticipants.class).bindFromRequest();
        if (organizationalUnitsParticipantsForm.hasErrors()) {
            return badRequest(views.html.registerOUParticipants.render(organizationalUnitsParticipantsForm));
        }
        OrganizationalUnitsParticipants organizationalUnits = organizationalUnitsParticipantsForm.get();
        int state = 0;
        try {
            state=checkFunction(organizationalUnits);
            if (state == 1) {
                saveOUParticipants(organizationalUnits);
                return redirect(routes.Application.index());
            } else {
                return badRequest(views.html.registerOUParticipants.render(organizationalUnitsParticipantsForm));
            }
        } catch (Exception e) {
            return badRequest(views.html.registerOUParticipants.render(organizationalUnitsParticipantsForm));
        }
    }

    public static int checkFunction(OrganizationalUnitsParticipants organizationalUnits) throws Exception {
        boolean hasHead=false;
        hasHead=OrganizationalUnits.findById(organizationalUnits.getOrganizationalUnits().getId()).isHasHeadOfOrganization();
        boolean hasDeputy=false;
        hasDeputy=OrganizationalUnits.findById(organizationalUnits.getOrganizationalUnits().getId()).isHasDeputyHeadOfOrganization();
        String head = "head";
        String deputy = "deputy";
        int state = 0;
        List<OrganizationalUnitsParticipants> ou = OrganizationalUnitsParticipants.findOUID(organizationalUnits.getOrganizationalUnits());
        if (ou.size() == 0) {
            state = 1;
        } else if (ou.size() >0) {
            for (OrganizationalUnitsParticipants set : ou) {
                if(organizationalUnits.getEmployees()!=null) {
                    if (set.getEmployees().getId() == organizationalUnits.getEmployees().getId()) {
                        state = 0;
                    } else {
                        if (hasHead) {
                            if (set.getFunction().equals(organizationalUnits.getFunction())) {
                                state = 0;
                            } else {
                                state = 1;
                            }
                        } else if (hasDeputy) {
                            if (set.getFunction().equals(organizationalUnits.getFunction())) {
                                state = 0;
                            } else {
                                state = 1;
                            }
                        } else {
                            state = 1;
                        }
                    }
                }else{
                    state=1;
                }
            }
        }
        return state;
    }

    private void saveOrganizationalUnit(Map<String, String[]> formData) throws Exception {
        OrganizationalUnits ou = new OrganizationalUnits(formData.get("organizationalUnitNumber")[0], formData.get("organizationalUnitNumberParent")[0], formData.get("titleCzech")[0], formData.get("titleEnglish")[0], formData.get("functionNameOfSeniorEmployee")[0],
                formData.get("functionNameOfSeniorEmployeeAppointment")[0], formData.get("organizationalUnitResponsible")[0]);
        ou.save();

    }

    public static void saveOUParticipantsEmployees(OrganizationalUnitsParticipants orUnits, Employees employees) throws Exception {
        OrganizationalUnitsParticipants ou = new OrganizationalUnitsParticipants(orUnits.function, orUnits.functionName, employees, orUnits.organizationalUnits);
        ou.save();
        if(orUnits.function.equals("head")){
            OrganizationalUnits o= OrganizationalUnits.findById(ou.getOrganizationalUnits().getId());
            o.setHasHeadOfOrganization(true);
            o.update();
        }
        if(orUnits.function.equals("deputy")){
            OrganizationalUnits o= OrganizationalUnits.findById(ou.getOrganizationalUnits().getId());
            o.setHasDeputyHeadOfOrganization(true);
            o.update();
        }
    }

    public static void saveOUParticipants(OrganizationalUnitsParticipants orUnits) throws Exception {
        OrganizationalUnitsParticipants ou = new OrganizationalUnitsParticipants(orUnits.function, orUnits.functionName, orUnits.employees, orUnits.organizationalUnits);
        ou.save();
        if(orUnits.function.equals("head")){
            OrganizationalUnits o= OrganizationalUnits.findById(ou.getOrganizationalUnits().getId());
            o.setHasHeadOfOrganization(true);
            o.update();
        }
        if(orUnits.function.equals("deputy")){
            OrganizationalUnits o= OrganizationalUnits.findById(ou.getOrganizationalUnits().getId());
            o.setHasDeputyHeadOfOrganization(true);
            o.update();
        }
    }

}
