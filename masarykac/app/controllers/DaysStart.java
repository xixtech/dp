package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
public class DaysStart {
    public void insertDaysStart() {

        List<Days> listDays = new ArrayList<Days>();
        listDays.add(new Days(1,"po","Pondělí"));
        listDays.add(new Days(2,"út","Úterý"));
        listDays.add(new Days(3,"st","Středa"));
        listDays.add(new Days(4,"čt","Čtvrtek"));
        listDays.add(new Days(5,"pá","Pátek"));
        listDays.add(new Days(6,"so","Sobota"));
        listDays.add(new Days(7,"ne","Neděle"));

        for (Days items : listDays) {
            items.save();
        }

    }

}
