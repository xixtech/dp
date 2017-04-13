package controllers;

import it.innove.play.pdf.PdfGenerator;
import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.*;

@Security.Authenticated(Secured.class)
public class TestController extends Controller {

    @Inject
    private FormFactory formFactory;

    private static Map<String, String> mapa=new HashMap<>();

    public Result test() {
        Form<Test> testForm = formFactory.form(Test.class);
        return ok(views.html.test.render(testForm, Test.search()));
    }



    public Result save() {

        Map<String, String[]> formData = request().body().asFormUrlEncoded();

       List<String> names=new ArrayList<>();
        for (String insId : formData.get("names[]")) {
                names.add(insId);
        }

        List<String> values=new ArrayList<>();

        for (String insId : formData.get("values[]")) {
            values.add(insId);
        }

        for (int i = 0; i < names.size(); i++) {
            Test t=new Test(names.get(i),values.get(i));
            t.save();
        }

        List<String> f=new ArrayList<>();
        for (String insId : formData.get("field-name")) {
            f.add(insId);
        }

        for (int i = 0; i < f.size(); i++) {
            Test t=new Test(f.get(i),"yy");
            t.save();
        }


        return redirect(routes.Application.index());
    }
}
