package controllers;

import models.Member;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import javax.inject.Inject;
/**
 * Created by Martin on 04.02.2017.
 */
@Security.Authenticated(Secured.class)
public class PrintController extends Controller {
    @Inject
    private FormFactory formFactory;
    /**
     * přesměrování na vypsání údajů konkrétní osoby
     *
     * @param id
     * @return
     */
    public Result printUserDetails(Long id) {
        return redirect(routes.PrintController.detailsList(id));

    }

    public Result printLector(Long id) {
        return redirect(routes.PrintController.detailsListLector(id));

    }


    /**
     * vypsání údajů konrétní osoby
     *
     * @param id
     * @return
     */
    public Result detailsList(long id) {
        Member member=Member.find.byId(id);
        return ok(views.html.personDetail.render(member));
    }

    /**
     * vypsání údajů konrétní osoby
     *
     * @param id
     * @return
     */
    public Result detailsListLector(long id) {
        Member member=Member.find.byId(id);
        Form<Member> registerForm = formFactory.form(Member.class);
        return ok(views.html.lectorCalculation.render(member,registerForm));
    }

}
