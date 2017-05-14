package controllers;

import it.innove.play.pdf.PdfGenerator;
import models.*;
import play.data.Form;
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
public class PDFController extends Controller {

    @Inject
    private FormFactory formFactory;

    @Inject
    public PdfGenerator pdfGenerator;

    public Result pdfTableAccessRole() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableAccessRolePDF.render(AccessRole.search()), "http://localhost:9000");
    }

    public Result pdfTableDCPS() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.search();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> teachers = Teachers.find.all();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableDCPSPDF.render(sp, f, s, sem, c, teachers), "http://localhost:9000");
    }

    public Result pdfTableDCPSPres() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.searchPresentation();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.searchPresentation();
        List<Teachers> teachers = Teachers.find.all();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableDCPSPresPDF.render(sp, f, s, sem, c, teachers), "http://localhost:9000");
    }

    public Result pdfTableDCPSCombi() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.searchCombi();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.searchCombi();
        List<Teachers> teachers = Teachers.find.all();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableDCPSCombiPDF.render(sp, f, s, sem, c, teachers), "http://localhost:9000");
    }

    public Result pdfTableClassroom() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableClassroomPDF.render(Classroom.search()), "http://localhost:9000");
    }

    public Result pdfTableCommittee() {
        List<Committee> com = Committee.search();
        List<CommitteeParticipants> compart = CommitteeParticipants.search();
        List<Semesters> s = Semesters.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableCommitteesPDF.render(com, compart, s), "http://localhost:9000");
    }

   /* public Result pdfTableEmployeerActivity() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableEmployeerActvitiyPDF.render(Employees.search()), "http://localhost:9000");
    }
    public Result pdfTableEmployeesActivity() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableEmployeesActvitiyPDF.render(Employees.search()), "http://localhost:9000");
    }*/

    public Result pdfTableEmployees() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableEmployeesPDF.render(Employees.search()), "http://localhost:9000");
    }

    public Result pdfTableFieldsOfStudy() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableFieldsOfStudyPDF.render(FieldsOfStudy.search()), "http://localhost:9000");
    }

    public Result pdfTablePublication() {
        List<Publications> pub = Publications.search();
        List<PublicationsParticipants> pubpart = PublicationsParticipants.search();
        List<Semesters> s = Semesters.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tablePublicationsPDF.render(pub, pubpart, s), "http://localhost:9000");
    }

    public Result pdfTableSPPrint() {
        List<StudyPlans> sp = StudyPlans.search();
        List<FieldsOfStudy> f = FieldsOfStudy.search();
        List<Subjects> s = Subjects.search();
        List<StudyGroups> sg = StudyGroups.search();
        List<Semesters> sem = Semesters.search();
        List<Courses> c = Courses.search();
        List<Teachers> teachers = Teachers.find.all();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableSPPDF.render(sp, f, s, sem, c, teachers), "http://localhost:9000");
    }

    public Result pdfTableStudyGroups() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableStudyGroupsPDF.render(StudyGroups.search()), "http://localhost:9000");
    }

    public Result pdfTableStudyPlans() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableStudyPlansPDF.render(StudyPlans.search()), "http://localhost:9000");
    }

    public Result pdfTableSubjects() {
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableSubjectsPDF.render(Subjects.search()), "http://localhost:9000");
    }

    public Result pdfTableTeachingAAA() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caaa = Courses.searchAAA();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableTeachingAAAPDF.render(c, t, caaa, sem, schedules, scheduleInWeekses), "http://localhost:9000");
    }

    public Result pdfTableTeachingAAB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> caab = Courses.searchAAB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableTeachingAABPDF.render(c, t, caab, sem, schedules, scheduleInWeekses), "http://localhost:9000");
    }

    public Result pdfTableTeachingAccordingToPersons() {
        List<Employees> empl = Employees.find.all();
        List<Teachers> teachers = Teachers.find.all();
        List<Courses> c = Courses.find.all();
        List<Semesters> s = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableTeachingAccordingToPersonsPDF.render(empl, c, teachers, s, schedules, scheduleInWeekses), "http://localhost:9000");
    }

    public Result pdfTableTeachingCB() {
        List<Teachers> t = Teachers.search();
        List<Courses> c = Courses.search();
        List<Courses> cb = Courses.searchCB();
        List<Semesters> sem = Semesters.search();
        List<Schedule> schedules = Schedule.search();
        List<ScheduleInWeeks> scheduleInWeekses = ScheduleInWeeks.search();
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableTeachingCBPDF.render(c, t, cb, sem, schedules, scheduleInWeekses), "http://localhost:9000");
    }

    public Result pdfTableTeachingDepartmentEmployee() {
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
        pdfGenerator.loadTemporaryFonts(Arrays.asList(new String[]{"fonts/Technika-Regular.ttf"}));
        return pdfGenerator.ok(views.html.pdf.tableTeachingDepartmentEmployeePDF.render(oj, e, c, s, t, caaa, caab, cb, sem, schedules, scheduleInWeekses), "http://localhost:9000");
    }
}
