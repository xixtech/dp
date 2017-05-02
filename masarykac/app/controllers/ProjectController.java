package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class ProjectController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Projects> projectsForm = formFactory.form(Projects.class);
        Form<ProjectsParticipants> projectsParticipantsForm = formFactory.form(ProjectsParticipants.class);
        return ok(views.html.registerProjects.render(projectsForm, projectsParticipantsForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<Projects> projectsForm = formFactory.form(Projects.class).bindFromRequest();
        Form<ProjectsParticipants> projectsParticipantsForm = formFactory.form(ProjectsParticipants.class).bindFromRequest();
        if (projectsForm.hasErrors() || projectsParticipantsForm.hasErrors()) {
            return badRequest(views.html.registerProjects.render(projectsForm, projectsParticipantsForm));
        }

        try {
            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveProject(formData);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerProjects.render(projectsForm, projectsParticipantsForm));
        }
    }

    private void saveProject(Map<String, String[]> formData) throws Exception {
        List<String> projectName = new ArrayList<>();

        for (String insId : formData.get("projectName")) {
            projectName.add(insId);
        }

        List<Date> projectFrom = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);

        for (String insId : formData.get("projectFrom")) {

            projectFrom.add(format.parse(insId));
        }

        List<Date> projectTo = new ArrayList<>();

        for (String insId : formData.get("projectTo")) {
            projectTo.add(format.parse(insId));
        }

        List<String> semester = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semester.add(insId);
        }

        List<Boolean> hasGrant = new ArrayList<>();
        if (formData.containsKey("hasGrant")) {
            for (String insId : formData.get("hasGrant")) {
                if (insId != null) {
                    hasGrant.add(Boolean.parseBoolean(insId));
                } else {
                    hasGrant.add(false);
                }
            }
        } else {
            hasGrant.add(false);
        }

        List<String> grantValue = new ArrayList<>();

        for (String insId : formData.get("grantValue")) {
            grantValue.add(insId);
        }

        List<String> employees = new ArrayList<>();

        for (String insId : formData.get("employees.id")) {
            employees.add(insId);
        }

        List<String> projectRole = new ArrayList<>();

        for (String insId : formData.get("projectRole")) {
            projectRole.add(insId);
        }


        long projectId = 0;

        for (int i = 0; i < projectName.size(); i++) {

            Projects p = new Projects(projectName.get(i), projectFrom.get(i), projectTo.get(i), Semesters.findById(Long.parseLong(semester.get(i))), hasGrant.get(i), grantValue.get(i));
            p.save();
            projectId = p.getId();
        }

        ProjectsParticipants[] projectPart = new ProjectsParticipants[employees.size()];
        for (int i = 0; i < employees.size(); i++) {

            ProjectsParticipants pp = new ProjectsParticipants(Employees.findById(Long.parseLong(employees.get(i))), Projects.findById(projectId), projectRole.get(i));
            pp.save();
            projectPart[i] = pp;
        }

        List<Statement> s = Statement.findBySemester(Long.parseLong(semester.get(0)));
        for (int i = 0; i < employees.size(); i++) {
            boolean saved = false;
            if (s.size() > 0) {
                for (Statement statement : s) {
                    if (statement.getEmployees().getId() == Long.parseLong(employees.get(i))) {
                        StatementProjectsParticipants spp = new StatementProjectsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), projectPart[i], statement);
                        spp.save();
                        saved = true;
                    }
                }
                if (saved == false) {
                    Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                    st.save();
                    StatementProjectsParticipants spp = new StatementProjectsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), projectPart[i], st);
                    spp.save();
                }
            } else {
                Statement st = new Statement(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), Employees.findById(Long.parseLong(employees.get(i))));
                st.save();
                StatementProjectsParticipants spp = new StatementProjectsParticipants(new Date(), "Vytvořeno", Semesters.findById(Long.parseLong(semester.get(0))), projectPart[i], st);
                spp.save();
            }
        }
    }
}
