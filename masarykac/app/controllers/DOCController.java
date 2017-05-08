package controllers;

import it.innove.play.pdf.PdfGenerator;
import models.*;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class DOCController extends Controller {

    @Inject
    private FormFactory formFactory;

    public Result docTableAccessRole() {
        return ok(views.html.doc.tableAccessRoleDOC.render(AccessRole.search()));
    }

    public Result docTableClassroom() {
        return ok(views.html.doc.tableClassroomDOC.render(Classroom.search()));
    }

    public Result docTableCommittee() {
        List<Committee> com = Committee.search();
        List<CommitteeParticipants> compart = CommitteeParticipants.search();
        List<Semesters> s = Semesters.search();
        return ok(views.html.doc.tableCommitteesDOC.render(com, compart, s));
    }

   /* public Result pdfTableEmployeerActivity() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.doc.tableEmployeerActvitiyPDF.render(Employees.search()), "http://localhost:9000");
    }
    public Result pdfTableEmployeesActivity() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.doc.tableEmployeesActvitiyPDF.render(Employees.search()), "http://localhost:9000");
    }*/

    public Result docTableEmployees() {
        return ok(views.html.doc.tableEmployeesDOC.render(Employees.search()));
    }

    public Result docTableFieldsOfStudy() {
        return ok(views.html.doc.tableFieldsOfStudyDOC.render(FieldsOfStudy.search()));
    }

    public Result docTablePlublication() {
        List<Publications> pub = Publications.search();
        List<PublicationsParticipants> pubpart = PublicationsParticipants.search();
        List<Semesters> s = Semesters.search();
        return ok(views.html.doc.tablePublicationsDOC.render(pub, pubpart, s));
    }

    public Result docTableSPPrint() {
        return ok(views.html.doc.tableStudyPlansDOC.render(StudyPlans.search()));
    }

    public Result docTableStudyGroups() {
        return ok(views.html.doc.tableStudyGroupsDOC.render(StudyGroups.search()));
    }

    public Result docTableStudyPlans() {
        return ok(views.html.doc.tableStudyPlansDOC.render(StudyPlans.search()));
    }

    public Result docfTableSubjects() {
        return ok(views.html.doc.tableSubjectsDOC.render(Subjects.search()));
    }

    public Result docTableTeachingAAA() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caaa = Courses.searchAAA();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.doc.tableTeachingAAADOC.render(c, t, caaa, sem, schedules, scheduleInWeekses));
    }

    public Result docTableTeachingAAB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caab = Courses.searchAAB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.doc.tableTeachingAABDOC.render(c, t, caab, sem, schedules, scheduleInWeekses));
    }

    public Result docTableTeachingAccordingToPersons() {
        List<Employees> empl = Employees.find.all();
        List<Teachers> teachers = Teachers.find.all();
        List<Courses> c = Courses.find.all();
        List<Semesters> s = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.doc.tableTeachingAccordingToPersonsDOC.render(empl, c, teachers, s, schedules, scheduleInWeekses));
    }

    public Result docTableTeachingCB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> cb = Courses.searchCB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.doc.tableTeachingCBDOC.render(c, t, cb, sem, schedules, scheduleInWeekses));
    }

    public Result docTableTeachingDepartmentEmployee() {
        List<Employees> e = Employees.search();
        List<Teachers> t = Teachers.search();
        List<OrganizationalUnitsParticipants> oj = OrganizationalUnitsParticipants.search();
        List<Courses> c = Courses.search();
        List<Subjects> s = Subjects.searchAAA();
        List<Courses> caaa = Courses.searchAAA();
        List<Courses> caab = Courses.searchAAB();
        List<Courses> cb = Courses.searchCB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        return ok(views.html.doc.tableTeachingDepartmentEmployeeDOC.render(oj, e, c, s, t, caaa, caab, cb, sem, schedules, scheduleInWeekses));
    }
}
