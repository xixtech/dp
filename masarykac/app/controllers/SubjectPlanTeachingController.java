package controllers;

import models.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import javax.inject.Inject;
import java.util.*;

import play.Logger;

/**
 * Created by Martin on 16.03.2017.
 */
@Security.Authenticated(Secured.class)
public class SubjectPlanTeachingController extends Controller {

    @Inject
    private FormFactory formFactory;

    /**
     * přesměrování na registrační formulář
     *
     * @return
     */
    public Result index() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class);
        Form<Courses> coursesForm = formFactory.form(Courses.class);
        Form<Schedule> scheduleForm = formFactory.form(Schedule.class);
        Form<StudyPlans> studyPlansForm = formFactory.form(StudyPlans.class);
        return ok(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm, studyPlansForm));
    }

    /**
     * uložení osoby, profilu a zákazníka z formuláře
     *
     * @return
     */
    public Result save() {
        Form<Subjects> subjectsForm = formFactory.form(Subjects.class).bindFromRequest();
        Form<Courses> coursesForm = formFactory.form(Courses.class).bindFromRequest();
        Form<Schedule> scheduleForm = formFactory.form(Schedule.class).bindFromRequest();
        Form<StudyPlans> studyPlansForm = formFactory.form(StudyPlans.class).bindFromRequest();
        if (subjectsForm.hasErrors() || coursesForm.hasErrors() || scheduleForm.hasErrors() || studyPlansForm.hasErrors()) {
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm, studyPlansForm));
        }
        Map<String, String[]> formData = request().body().asFormUrlEncoded();

        try {
            saveCourse(formData);
            return redirect(routes.Application.index());
        } catch (Throwable t) {
            Logger.error("Exception ", t);
            return badRequest(views.html.registerSubjectPlanTeaching.render(subjectsForm, coursesForm, scheduleForm, studyPlansForm));
        }
    }

    private void saveCourse(Map<String, String[]> formData) throws Exception {
        List<String> ident = new ArrayList<>();

        for (String insId : formData.get("ident")) {
            ident.add(insId);
        }

        List<Integer> hoursP = new ArrayList<>();

        for (String insId : formData.get("hoursP")) {
            hoursP.add(Integer.parseInt(insId));
        }

        List<Boolean> credit = new ArrayList<>();
        if (formData.containsKey("credit")) {
            for (String insId : formData.get("credit")) {
                if (insId != null) {
                    credit.add(Boolean.parseBoolean(insId));
                } else {
                    credit.add(false);
                }
            }
        } else {
            credit.add(false);
        }

        List<Boolean> formPresentation = new ArrayList<>();
        if (formData.containsKey("formPresentation")) {
            for (String insId : formData.get("formPresentation")) {
                if (insId != null) {
                    formPresentation.add(Boolean.parseBoolean(insId));
                } else {
                    formPresentation.add(false);
                }
            }
        } else {
            formPresentation.add(false);
        }

        List<String> identOld = new ArrayList<>();

        for (String insId : formData.get("identOld")) {
            identOld.add(insId);
        }

        List<Integer> hoursC = new ArrayList<>();

        for (String insId : formData.get("hoursC")) {
            hoursC.add(Integer.parseInt(insId));
        }

        List<Boolean> exam = new ArrayList<>();
        if (formData.containsKey("exam")) {
            for (String insId : formData.get("exam")) {
                if (insId != null) {
                    exam.add(Boolean.parseBoolean(insId));
                } else {
                    exam.add(false);
                }
            }
        } else {
            exam.add(false);
        }

        List<Boolean> formCombined = new ArrayList<>();
        if (formData.containsKey("formCombined")) {
            for (String insId : formData.get("formCombined")) {
                if (insId != null) {
                    formCombined.add(Boolean.parseBoolean(insId));
                } else {
                    formCombined.add(false);
                }
            }
        } else {
            formCombined.add(false);
        }

        List<String> titleC = new ArrayList<>();

        for (String insId : formData.get("titleC")) {
            titleC.add(insId);
        }

        List<Integer> credits = new ArrayList<>();

        for (String insId : formData.get("credits")) {
            credits.add(Integer.parseInt(insId));
        }

        List<Boolean> classifiedCredit = new ArrayList<>();
        if (formData.containsKey("classifiedCredit")) {
            for (String insId : formData.get("classifiedCredit")) {
                if (insId != null) {

                    classifiedCredit.add(Boolean.parseBoolean(insId));
                } else {
                    classifiedCredit.add(false);
                }
            }
        } else {
            classifiedCredit.add(false);
        }

        List<String> titleA = new ArrayList<>();

        for (String insId : formData.get("titleA")) {
            titleA.add(insId);
        }

        List<Integer> hoursSemester = new ArrayList<>();

        for (String insId : formData.get("hoursSemester")) {
            hoursSemester.add(Integer.parseInt(insId));
        }

        List<String> department = new ArrayList<>();

        for (String insId : formData.get("department")) {
            department.add(insId);
        }

        List<String> semesters = new ArrayList<>();

        for (String insId : formData.get("semester.id")) {
            semesters.add(insId);
        }

        List<String> course = new ArrayList<>();

        for (String insId : formData.get("course")) {
            course.add(insId);
        }


        List<Integer> numberOfStudents = new ArrayList<>();

        for (String insId : formData.get("numberOfStudents")) {
            numberOfStudents.add(Integer.parseInt(insId));
        }

        List<String> days = new ArrayList<>();

        for (String insId : formData.get("days.id")) {
            days.add(insId);
        }


        List<String> scheduleFrom = new ArrayList<>();

        for (String insId : formData.get("scheduleFrom")) {
            scheduleFrom.add(insId);
        }

        List<String> scheduleTo = new ArrayList<>();

        for (String insId : formData.get("scheduleTo")) {
            scheduleTo.add(insId);
        }

        List<String> classRoom = new ArrayList<>();

        for (String insId : formData.get("classRoom")) {
            classRoom.add(insId);
        }

        List<String> teachers = new ArrayList<>();
        List<String> teacherKey = new ArrayList<>();
        List<String> teacherValue = new ArrayList<>();

        for (Map.Entry<String, String[]> entry : formData.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("tname")) {
                for (String insId : entry.getValue()) {
                    teachers.add(insId);
                    String subKey = entry.getKey();

                    teacherKey.add(subKey.substring(5));
                    teacherValue.add(insId);
                }
            }

        }


        String[][] tn = new String[teacherKey.size()][2];
        for (int i = 0; i < teacherKey.size(); i++) {
            tn[i][0] = teacherKey.get(i);
            tn[i][1] = teacherValue.get(i);
        }

        Arrays.sort(tn, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String key1 = entry1[0];
                final String key2 = entry2[0];
                return key1.compareTo(key2);
            }
        });

        List<Integer> teachersScale = new ArrayList<>();
        List<String> scaleKey = new ArrayList<>();
        List<String> scaleValue = new ArrayList<>();
        for (Map.Entry<String, String[]> entry : formData.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("tvalue")) {
                for (String insId : entry.getValue()) {
                    teachersScale.add(Integer.parseInt(insId));
                    String subKey = entry.getKey();

                    scaleKey.add(subKey.substring(6));
                    scaleValue.add(insId);
                }
            }

        }
        String[][] ts = new String[scaleKey.size()][2];
        for (int i = 0; i < scaleKey.size(); i++) {
            ts[i][0] = scaleKey.get(i);
            ts[i][1] = scaleValue.get(i);
        }
        Arrays.sort(ts, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String key1 = entry1[0];
                final String key2 = entry2[0];
                return key1.compareTo(key2);
            }
        });


        String[][] uchodnota = new String[ts.length][3];
        String prev="";
        int sameKey=0;
        for (int i = 0; i < tn.length; i++) {
            if(prev.equals(tn[i][0].substring(0,3))){
                sameKey++;
            }
            else{
                prev=tn[i][0].substring(0,3);
            }
            uchodnota[i][0] = tn[i][0];
            uchodnota[i][1] = tn[i][1];
            uchodnota[i][2] = ts[i][1];

        }


        List<Integer> scheduleWeek = new ArrayList<>();
        List<String> scheduleWeekKey = new ArrayList<>();
        List<String> scheduleWeekValue = new ArrayList<>();

        for (Map.Entry<String, String[]> entry : formData.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("scheduleWeek")) {
                for (String insId : entry.getValue()) {
                    scheduleWeek.add(Integer.parseInt(insId));
                    String subKey = entry.getKey();

                    scheduleWeekKey.add(subKey.substring(12));
                    scheduleWeekValue.add(insId);
                }
            }

        }
        String[][] sw = new String[scheduleWeekKey.size()][2];
        for (int i = 0; i < scheduleWeekKey.size(); i++) {
            sw[i][0] = scheduleWeekKey.get(i);
            sw[i][1] = scheduleWeekValue.get(i);
        }
        Arrays.sort(sw, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String key1 = entry1[0];
                final String key2 = entry2[0];
                return key1.compareTo(key2);
            }
        });

        List<Integer> scheduleYear = new ArrayList<>();
        List<String> scheduleYearKey = new ArrayList<>();
        List<String> scheduleYearValue = new ArrayList<>();

        for (Map.Entry<String, String[]> entry : formData.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("scheduleYear")) {
                for (String insId : entry.getValue()) {
                    scheduleYear.add(Integer.parseInt(insId));
                    String subKey = entry.getKey();

                    scheduleYearKey.add(subKey.substring(12));
                    scheduleYearValue.add(insId);
                }
            }

        }
        String[][] sy = new String[scheduleYearKey.size()][2];
        for (int i = 0; i < scheduleYearKey.size(); i++) {
            sy[i][0] = scheduleYearKey.get(i);
            sy[i][1] = scheduleYearValue.get(i);
        }
        Arrays.sort(sy, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String key1 = entry1[0];
                final String key2 = entry2[0];
                return key1.compareTo(key2);
            }
        });


        String[][] swyear = new String[sy.length][3];
        for (int i = 0; i < sy.length; i++) {
            swyear[i][0] = sw[i][0];
            swyear[i][1] = sw[i][1];
            swyear[i][2] = sy[i][1];

        }
        String[][] teacherWeeks = new String[swyear.length+sameKey][5];
        int index = 0;

        for (int i = 0; i < swyear.length; i++) {
            int countEquals=0;
            for (int j = 0; j < uchodnota.length; j++) {
                String pom=uchodnota[j][0].substring(0,3);
                if (swyear[i][0].equals(pom)) {
                    countEquals++;
                    teacherWeeks[index][0] = swyear[i][0];
                    teacherWeeks[index][1] = swyear[i][1];
                    teacherWeeks[index][2] = swyear[i][2];

                    teacherWeeks[index][3] = uchodnota[j][1];
                    teacherWeeks[index][4] = uchodnota[j][2];
                    index++;
                }
            }
            if(countEquals==0){
                teacherWeeks[index][0] = swyear[i][0];
                teacherWeeks[index][1] = swyear[i][1];
                teacherWeeks[index][2] = swyear[i][2];

                teacherWeeks[index][3] = null;
                teacherWeeks[index][4] = null;
                index++;
            }

        }


        List<Integer> fieldsOfStudy = new ArrayList<>();

        for (String insId : formData.get("fieldsOfStudy.id")) {
            fieldsOfStudy.add(Integer.parseInt(insId));
        }

        List<Integer> semesterValue = new ArrayList<>();

        for (String insId : formData.get("semesterValue")) {
            semesterValue.add(Integer.parseInt(insId));
        }


        List<Integer> studyGroups = new ArrayList<>();

        for (String insId : formData.get("studyGroups.id")) {
            studyGroups.add(Integer.parseInt(insId));
        }

        List<Integer> studyGroups1 = new ArrayList<>();

        for (String insId : formData.get("studyGroups1.id")) {
            studyGroups1.add(Integer.parseInt(insId));
        }


        Subjects subjects = null;
        for (int i = 0; i < ident.size(); i++) {
            subjects = new Subjects(ident.get(i), identOld.get(i), titleC.get(i), titleA.get(i),
                    hoursP.get(i), hoursC.get(i), hoursSemester.get(i), credits.get(i), credit.get(i), exam.get(i), classifiedCredit.get(i),
                    department.get(i), formPresentation.get(i), formCombined.get(i));
            subjects.save();

        }

        StudyPlans sp = null;
        for (int i = 0; i < ident.size(); i++) {
            sp = new StudyPlans(subjects, FieldsOfStudy.findById(fieldsOfStudy.get(0)), Semesters.findById(Long.parseLong(semesters.get(0))), semesterValue.get(0),
                    StudyGroups.findById(studyGroups.get(0)), StudyGroups1.findById(studyGroups1.get(0)));
            sp.save();

        }


        for (int i = 0; i < teacherWeeks.length; i++) {
            Test test = new Test("teacherWeeks " + teacherWeeks[i][0] + ":" + teacherWeeks[i][1] + ":" + teacherWeeks[i][2] + ":" + teacherWeeks[i][3] + ":" + teacherWeeks[i][4], " sy " + teacherWeeks[i][0] + ":" + teacherWeeks[i][2]);
            test.save();
        }
        Courses c = null;
        for (int i = 0; i < course.size(); i++) {
            c = new Courses(course.get(i), numberOfStudents.get(i), subjects, Semesters.findById(Long.parseLong(semesters.get(0))));
            c.save();

            for (int j = 0; j < uchodnota.length; j++) {
                Test test = new Test("tn " + uchodnota[j][0] + ":" + uchodnota[j][1], " same " + sameKey + ":" + swyear[j][2]);
                test.save();

                Teachers t = new Teachers(c, Employees.findById(Long.parseLong(uchodnota[j][1])), Integer.parseInt(uchodnota[j][2]));
                t.save();
            }
        }

        for (int i = 0; i < days.size(); i++) {
            Schedule s = new Schedule(Semesters.findById(Long.parseLong(semesters.get(0))), ident.get(0), c, Days.findById(Long.parseLong(days.get(0))), scheduleFrom.get(0), scheduleTo.get(0), classRoom.get(0));

            s.save();

            for (int j = 0; j < scheduleWeek.size(); j++) {


                ScheduleInWeeks siw = new ScheduleInWeeks(Semesters.findById(Long.parseLong(semesters.get(0))), ident.get(0), c, Days.findById(Long.parseLong(days.get(0))), scheduleFrom.get(0), scheduleTo.get(0), classRoom.get(0),
                        scheduleWeek.get(j), scheduleYear.get(j), s);

                siw.save();


            }

        }


    }

}
