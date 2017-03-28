package controllers;

import models.OrganizationalUnits;
import models.OrganizationalUnitsParticipants;
import models.Subjects;
import models.Visits;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.List;

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
        OrganizationalUnits organizationalUnits = organizationalUnitsForm.get();
        try {
            saveOrganizationalUnit(organizationalUnits);
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
                if (set.getEmployees().getId() == organizationalUnits.getEmployees().getId()) {
                    state = 0;
                } else {
                    if(hasHead){
                        if(set.getFunction().equals(organizationalUnits.getFunction())){
                            state=0;
                        }else{
                            state=1;
                        }
                    }else if(hasDeputy){
                        if(set.getFunction().equals(organizationalUnits.getFunction())){
                            state=0;
                        }else{
                            state=1;
                        }
                    }else{
                        state=1;
                    }
                }

            }
        }


        try {
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

    private void saveOrganizationalUnit(OrganizationalUnits orUnits) throws Exception {
        OrganizationalUnits ou = new OrganizationalUnits(orUnits.organizationalUnitNumber, orUnits.organizationalUnitNumberParent, orUnits.titleCzech, orUnits.titleEnglish, orUnits.functionNameOfSeniorEmployee,
                orUnits.functionNameOfSeniorEmployeeAppointment, orUnits.organizationalUnitResponsible);
        ou.save();

    }

    private void saveOUParticipants(OrganizationalUnitsParticipants orUnits) throws Exception {
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
