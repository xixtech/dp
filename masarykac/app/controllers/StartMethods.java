package controllers;

import models.AccessRole;
import models.Classroom;
import models.Days;
import models.TeachersRole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
public class StartMethods {
    public void insertClassroomStart() {

        List<Classroom> listClassrooms = new ArrayList<Classroom>();
        listClassrooms.add(new Classroom(48, "102"));
        listClassrooms.add(new Classroom(96, "103"));
        listClassrooms.add(new Classroom(48, "104"));
        listClassrooms.add(new Classroom(32, "M105"));
        listClassrooms.add(new Classroom(20, "M110"));
        listClassrooms.add(new Classroom(24, "203"));
        listClassrooms.add(new Classroom(24, "204"));
        listClassrooms.add(new Classroom(38, "209"));
        listClassrooms.add(new Classroom(32, "210"));
        listClassrooms.add(new Classroom(13, "301"));
        listClassrooms.add(new Classroom(24, "302"));
        listClassrooms.add(new Classroom(36, "303"));
        listClassrooms.add(new Classroom(20, "308"));
        listClassrooms.add(new Classroom(20, "309"));
        listClassrooms.add(new Classroom(16, "310"));
        listClassrooms.add(new Classroom(15, "401"));
        listClassrooms.add(new Classroom(34, "402"));
        listClassrooms.add(new Classroom(24, "403"));
        listClassrooms.add(new Classroom(40, "408"));
        listClassrooms.add(new Classroom(40, "409"));
        listClassrooms.add(new Classroom(16, "420"));
        listClassrooms.add(new Classroom(32, "421"));
        listClassrooms.add(new Classroom(24, "423"));
        listClassrooms.add(new Classroom(24, "424"));


        for (Classroom items : listClassrooms) {
            items.save();
        }

    }

    public void insertDaysStart() {

        List<Days> listDays = new ArrayList<Days>();
        listDays.add(new Days(1, "po", "Pondělí"));
        listDays.add(new Days(2, "út", "Úterý"));
        listDays.add(new Days(3, "st", "Středa"));
        listDays.add(new Days(4, "čt", "Čtvrtek"));
        listDays.add(new Days(5, "pá", "Pátek"));
        listDays.add(new Days(6, "so", "Sobota"));
        listDays.add(new Days(7, "ne", "Neděle"));

        for (Days items : listDays) {
            items.save();
        }

    }

    public void insertTeachersRole() {

        List<TeachersRole> listTeachersRole = new ArrayList<TeachersRole>();
        listTeachersRole.add(new TeachersRole("Garant"));
        listTeachersRole.add(new TeachersRole("Přednášející"));
        listTeachersRole.add(new TeachersRole("Cvičící"));

        for (TeachersRole items : listTeachersRole) {
            items.save();
        }

    }

    public void insertAccessRole() {

        List<AccessRole> listAccessRole = new ArrayList<AccessRole>();
        listAccessRole.add(new AccessRole("director", "Vedoucí"));
        listAccessRole.add(new AccessRole("head", "Zadavatel"));
        listAccessRole.add(new AccessRole("employee", "Zaměstnanec"));

        for (AccessRole items : listAccessRole) {
            items.save();
        }

    }

}
