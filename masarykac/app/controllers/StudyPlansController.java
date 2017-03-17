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
public class StudyPlansController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<StudyPlans> studyPlansForm = formFactory.form(StudyPlans.class);
        return ok(views.html.registerStudyPlans.render(studyPlansForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {

        Map<String, String[]> formData = request().body().asFormUrlEncoded();

        long subjectsId = 0;
        long fieldsOfStudyId = 0;
        long semestersId = 0;
        long val = 0;
        long studyGroupsId = 0;
        long studyGroups1Id = 0;

        for (String insId : formData.get("subjects.id")) {
            subjectsId = Long.parseLong(insId);
        }

        for (String insId : formData.get("fieldsOfStudy.id")) {
            fieldsOfStudyId = Long.parseLong(insId);
        }

        for (String insId : formData.get("semesters.id")) {
            semestersId = Long.parseLong(insId);
        }

        for (String insId : formData.get("semesterValue")) {
            val = Long.parseLong(insId);
        }

        for (String insId : formData.get("studyGroups.id")) {
            studyGroupsId = Long.parseLong(insId);
        }

        for (String insId : formData.get("studyGroups1.id")) {
            studyGroups1Id = Long.parseLong(insId);
        }

        StudyPlans sp = new StudyPlans(Subjects.findById(subjectsId), FieldsOfStudy.findById(fieldsOfStudyId), Semesters.findById(semestersId), (int) val,
                StudyGroups.findById(studyGroupsId), StudyGroups1.findById(studyGroups1Id));
        sp.save();

        return redirect(routes.Application.index());
    }

    private void saveStudyPlans(StudyPlans studyPlans) throws Exception {
        StudyPlans sp = new StudyPlans(studyPlans.subjects, studyPlans.fieldsOfStudy, studyPlans.semesters, studyPlans.semesterValue,
                studyPlans.studyGroups, studyPlans.studyGroups1);
        sp.save();

    }

}
