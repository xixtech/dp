package controllers;

import models.Semesters;
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
public class SemestersController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Semesters> semestersForm = formFactory.form(Semesters.class);
        return ok(views.html.registerSemester.render(semestersForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save()throws Exception {
        Form<Semesters> semestersForm = formFactory.form(Semesters.class).bindFromRequest();


            Map<String, String[]> formData = request().body().asFormUrlEncoded();
            saveSemester(formData);
            return redirect(routes.Application.index());

    }

    private void saveSemester(Map<String, String[]> formData) throws Exception {

        List<String> semesterValue = new ArrayList<>();

        for (String insId : formData.get("semesterValue")) {
            semesterValue.add(insId);
        }

        List<String> semesterVK = new ArrayList<>();

        for (String insId : formData.get("semesterVK")) {
            semesterVK.add(insId);
        }

        List<String> semesterVD = new ArrayList<>();

        for (String insId : formData.get("semesterVD")) {
            semesterVD.add(insId);
        }

        List<String> semesterAr = new ArrayList<>();

        for (String insId : formData.get("semesterAr")) {
            semesterAr.add(insId);
        }


        List<Date> semesterFrom = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        for (String insId : formData.get("semesterFrom")) {
            Date date = format.parse(insId);
            SimpleDateFormat dt1 = new SimpleDateFormat("dd.MM.yyyy");
            String s = dt1.format(date);
            semesterFrom.add(dt1.parse(s));
        }

        List<Date> semesterTo = new ArrayList<>();
        for (String insId : formData.get("semesterTo")) {
            Date date = format.parse(insId);
            SimpleDateFormat dt1 = new SimpleDateFormat("dd.MM.yyyy");
            String s = dt1.format(date);
            semesterTo.add(dt1.parse(s));
        }


        Semesters s = new Semesters(semesterValue.get(0), semesterVK.get(0), semesterVD.get(0), semesterAr.get(0), semesterFrom.get(0), semesterTo.get(0));
        s.save();
    }

    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }

}
