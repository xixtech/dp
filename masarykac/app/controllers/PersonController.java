package controllers;

import models.Person;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.HashMap;
import java.util.Map;

import static play.data.Form.form;

/**
 * Created by Martin on 03.02.2017.
 */
@Security.Authenticated(Secured.class)
public class PersonController extends Controller {
    final static Form<Person> PRACOVNIK_FORM = form(Person.class);
    static Map<Person, Double> casy = new HashMap<Person, Double>();
    static User osoba = null;


    /**
     * přesměrování na založení nového pracovníka
     *
     * @param id
     * @return
     */
    public static Result index(final Long id) {
        return ok(views.html.registracePracovnik.render(id, PRACOVNIK_FORM));
    }

    /**
     * uložení nového pracovníka
     *
     * @param id
     * @return
     */
    public static Result save(final Long id) {
            final Form<Person> pracovnikRegForm = PRACOVNIK_FORM
                    .bindFromRequest();
            osoba = User.find.byId(id);
            if (pracovnikRegForm.hasErrors()) {
                return badRequest(views.html.editPracovnik.render(id,
                        pracovnikRegForm));
            }
            try {
                savePracovnik(pracovnikRegForm);
                flash("success", "Uživatel byl zaměstnán");
                return redirect(routes.Application.index());
            } catch (Exception e) {
                return badRequest(views.html.editPracovnik.render(id,
                        pracovnikRegForm));
            }

    }

    /**
     * uložení nového pracovníka
     *
     * @return
     */
    public static void savePracovnik(final Form<Person> pracovnikRegForm) {
        final Person register = pracovnikRegForm.get();
        final Person pracovnik = new Person(register.plat,
                register.zarazeni, osoba);
        pracovnik.save();
        osoba.setPerson(pracovnik);
        osoba.update();
    }

    /**
     * přesměrování na vypsání všech pracovníků
     *
     * @param idZakazky
     * @param idPracovnika
     * @return
     */
    public static Result vypsatPracovniky(final long idZakazky,
                                          final long idPracovnika) {
        final Osoba o = Osoba.findByEmail(request().username());
        if (o.pracovnik != null) {
            return redirect(routes.VypisController.listPracovniku(0L, 0L, 0,
                    "zarazeni", "asc", ""));
        } else {
            notAccess();
            return redirect(routes.Application.index());
        }
    }


    public static void notAccess() {
        flash("success", "Pro tuto činnost nemáte přístup!");
    }
}
