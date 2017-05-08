package controllers;

import it.innove.play.pdf.PdfGenerator;
import models.Employees;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class DOCController extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result docTableEmployees() {
        return ok(views.html.doc.tableEmployeesDOC.render(Employees.search()));
    }
}
