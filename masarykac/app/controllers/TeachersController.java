package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class TeachersController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Teachers> studyPlansForm = formFactory.form(Teachers.class);
        return ok(views.html.registerTeachers.render(studyPlansForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {

        Map<String, String[]> formData = request().body().asFormUrlEncoded();

        long courseId = 0;
        long employeesId = 0;
        long val = 0;
        long studyGroupsId = 0;
        long studyGroups1Id = 0;

        for (String insId : formData.get("courses.id")) {
            courseId = Long.parseLong(insId);
        }

        for (String insId : formData.get("employees.id")) {
            employeesId = Long.parseLong(insId);
        }

        for (String insId : formData.get("scale")) {
            val = Long.parseLong(insId);
        }


        Teachers t=new Teachers(Courses.findById(courseId),Employees.findById(employeesId),(int)val);
        t.save();
        return redirect(routes.Application.index());
    }


}