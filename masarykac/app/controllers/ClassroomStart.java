package controllers;

import models.Classroom;
import models.Days;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
public class ClassroomStart {
    public void insertClassroomStart() {

        List<Classroom> listClassrooms = new ArrayList<Classroom>();
        listClassrooms.add(new Classroom(48,"102"));
        listClassrooms.add(new Classroom(96,"103"));
        listClassrooms.add(new Classroom(48,"104"));
        listClassrooms.add(new Classroom(32,"M105"));
        listClassrooms.add(new Classroom(20,"M110"));
        listClassrooms.add(new Classroom(24,"203"));
        listClassrooms.add(new Classroom(24,"204"));
        listClassrooms.add(new Classroom(38,"209"));
        listClassrooms.add(new Classroom(32,"210"));
        listClassrooms.add(new Classroom(13,"301"));
        listClassrooms.add(new Classroom(24,"302"));
        listClassrooms.add(new Classroom(36,"303"));
        listClassrooms.add(new Classroom(20,"308"));
        listClassrooms.add(new Classroom(20,"309"));
        listClassrooms.add(new Classroom(16,"310"));
        listClassrooms.add(new Classroom(15,"401"));
        listClassrooms.add(new Classroom(34,"402"));
        listClassrooms.add(new Classroom(24,"403"));
        listClassrooms.add(new Classroom(40,"408"));
        listClassrooms.add(new Classroom(40,"409"));
        listClassrooms.add(new Classroom(16,"420"));
        listClassrooms.add(new Classroom(32,"421"));
        listClassrooms.add(new Classroom(24,"423"));
        listClassrooms.add(new Classroom(24,"424"));



        for (Classroom items : listClassrooms) {
            items.save();
        }

    }

}
