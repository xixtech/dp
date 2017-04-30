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
        listClassrooms.add(new Classroom(150,"103"));


        for (Classroom items : listClassrooms) {
            items.save();
        }

    }

}
