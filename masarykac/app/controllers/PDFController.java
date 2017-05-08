package controllers;

import it.innove.play.pdf.PdfGenerator;
import models.Classroom;
import models.Employees;
import play.data.Form;
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
public class PDFController extends Controller {

    @Inject
    private FormFactory formFactory;

    @Inject
    public PdfGenerator pdfGenerator;

    public Result pdfTableEmployees() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableEmployeesPDF.render(Employees.search()), "http://localhost:9000");
    }
}
