package controllers;

import com.sun.org.apache.bcel.internal.util.ClassQueue;
import models.Classroom;
import models.Member;
import models.Visits;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class ClassroomController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Classroom> classroomForm = formFactory.form(Classroom.class);
        return ok(views.html.registerClassroom.render(classroomForm));
    }

    public Result edit(long id) {
        Classroom c = Classroom.findById(id);
        Form<Classroom> classroomForm = formFactory.form(Classroom.class).fill(c);
        return ok(views.html.editClassroom.render(id, classroomForm));
    }

    public Result save() {
        Form<Classroom> classroomForm = formFactory.form(Classroom.class).bindFromRequest();
        if (classroomForm.hasErrors()) {
            return badRequest(views.html.registerClassroom.render(classroomForm));
        }
        Classroom classroom = classroomForm.get();
        try {
            saveClassroom(classroom);
            return redirect(routes.Application.index());
        } catch (Exception e) {
            return badRequest(views.html.registerClassroom.render(classroomForm));
        }
    }

    public Result update(long id) {
        Form<Classroom> classroomForm = formFactory.form(Classroom.class).bindFromRequest();
        if (classroomForm.hasErrors()) {
            return badRequest(views.html.editClassroom.render(id, classroomForm));
        }
        Classroom classroom = classroomForm.get();
        try {
            updateClassroom(id, classroom);
            return redirect(routes.TableController.listClassrooms());
        } catch (Exception e) {
            return badRequest(views.html.editClassroom.render(id, classroomForm));
        }
    }

    private void saveClassroom(Classroom classroom) throws Exception {
        Classroom c = new Classroom(classroom.capacity, classroom.classroomName);
        c.save();
    }

    private void updateClassroom(long id, Classroom classroom) throws Exception {
        Classroom c = Classroom.findById(id);
        c.setCapacity(classroom.getCapacity());
        c.setClassroomName(classroom.getClassroomName());
        c.update();
    }

    public Result delete(long id) {
        Classroom c = Classroom.findById(id);
        c.setActive(false);
        c.update();
        return redirect(routes.TableController.listClassrooms());
    }
}
