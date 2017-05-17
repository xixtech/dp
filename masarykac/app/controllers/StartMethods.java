package controllers;

import models.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
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

    public void insertOJ() {

        List<OrganizationalUnits> listOJ = new ArrayList<OrganizationalUnits>();
        listOJ.add(new OrganizationalUnits("32000", "00000", "Masarykův ústav vyšších studií", "Masaryk Institute of Advanced Studies", "ředitel", "rektor", ""));
        listOJ.add(new OrganizationalUnits("32151", "32000", "oddělení pedagogických a psychologických studií", "Department of Pedagogical and Psychological Studies", "vedoucí", "ředitel", "32151"));
        listOJ.add(new OrganizationalUnits("32104", "32000", "oddělení jazykových studií", "Department of Language Studies", "vedoucí", "ředitel", "32104"));
        listOJ.add(new OrganizationalUnits("32163", "32000", "oddělení ekonomických studií", "Department of Economic Studies", "vedoucí", "ředitel", "32163"));
        listOJ.add(new OrganizationalUnits("32116", "32000", "oddělení manažerských studií", "Department of Management Studies", "vedoucí", "ředitel", "32116"));
        listOJ.add(new OrganizationalUnits("32165", "32000", "oddělení veřejné správy a regionálních studií", "Department of Public Administration and Regional Studies", "vedoucí", "ředitel", "32165"));
        listOJ.add(new OrganizationalUnits("32201", "32000", "oddělení výzkumných aktivit", "Department for Research", "vedoucí", "ředitel", "32201"));
        listOJ.add(new OrganizationalUnits("32331", "32000", "oddělení ICT", "ICT Department", "vedoucí", "ředitel", "32331"));
        listOJ.add(new OrganizationalUnits("32911", "32000", "sekretariát ředitele", "Director’s Office", "vedoucí", "ředitel", "32911"));
        listOJ.add(new OrganizationalUnits("32921", "32000", "studijní oddělení", "Study Department", "vedoucí", "ředitel", ""));
        listOJ.add(new OrganizationalUnits("32941", "32000", "ekonomické oddělení", "Finance Department", "tajemník", "ředitel", "32941,32827"));
        listOJ.add(new OrganizationalUnits("32951", "32000", "oddělení celoživotního vzdělávání", "Department for Lifelong Learning", "vedoucí", "ředitel", "32951"));
        listOJ.add(new OrganizationalUnits("32961", "32000", "oddělení mezinárodní spolupráce", "Department for International Cooperation", "vedoucí", "ředitel", "32961"));
        listOJ.add(new OrganizationalUnits("32971", "32000", "oddělení rozvoje a vnějších vztahů", "Department for Development and Public Affairs", "vedoucí", "ředitel", "32971"));

        for (OrganizationalUnits items : listOJ) {
            items.save();
        }

    }

    public void insertSemesters() throws Exception {

        List<Semesters> listSemesters = new ArrayList<Semesters>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        Date date = format.parse("16.02.2015");
        SimpleDateFormat dt1 = new SimpleDateFormat("dd.MM.yyyy");
        String s = dt1.format(date);
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        Date date1 = format.parse("15.05.2015");
        SimpleDateFormat dt2 = new SimpleDateFormat("dd.MM.yyyy");
        String s1 = dt2.format(date);

        listSemesters.add(new Semesters("LS1415", "Letní semestr 2014/2015", "Letní semestr akademického roku 2014/2015", "2014/2015", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("22.02.2016");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("03.07.2016");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("LS1516", "Letní semestr 2015/2016", "Letní semestr akademického roku 2015/2016", "2013/2014", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("20.02.2017");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("02.07.2017");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("LS1617", "Letní semestr 2016/2017", "Zimní semestr akademického roku 2016/2017", "2016/2017", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("23.09.2013");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("20.12.2013");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("ZS1314", "Zimní semestr 2013/2013", "Zimní semestr akademického roku 2013/2013", "2013/2014", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("22.09.2014");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("19.12.2014");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("ZS1415", "Zimní semestr 2014/2015", "Zimní semestr akademického roku 2014/2015", "2014/2015", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("01.10.2015");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("21.02.2016");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("ZS1516", "Zimní semestr 2015/2016", "Zimní semestr akademického roku 2015/2016", "2015/2016", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("01.10.2016");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("19.02.2017");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("ZS1617", "Zimní semestr 2016/2017", "Zimní semestr akademického roku 2016/2017", "2016/2017", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("01.10.2017");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("18.02.2018");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("ZS1718", "Zimní semestr 2017/2018", "Zimní semestr akademického roku 2017/2018", "2017/2018", dt1.parse(s), dt2.parse(s1)));

        format = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date = format.parse("19.02.2018");
        dt1 = new SimpleDateFormat("dd.MM.yyyy");
        s = dt1.format(date);
        format1 = new SimpleDateFormat("yyyy-MM-dd", new Locale("cs", "CZ"));
        date1 = format.parse("01.07.2018");
        dt2 = new SimpleDateFormat("dd.MM.yyyy");
        s1 = dt2.format(date);

        listSemesters.add(new Semesters("LS1718", "Letní semestr 2017/2018", "Letní semestr akademického roku 2017/2018", "2017/2018", dt1.parse(s), dt2.parse(s1)));

        for (Semesters items : listSemesters) {
            items.save();
        }

    }

    public void insertEmployees() throws Exception{

        List<Employees> listE = new ArrayList<Employees>();
        listE.add(new Employees(111517,"Ing. Bc.","Andres","Pavel","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375057,"Ing.","Antušák","Emil","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459456,"Ing.","Baranyková","Zdeňka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(440369,"Ing.","Bártová","Tereza","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463499,"","Bendová","Jitka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(377993,"prof. PhDr.","Beneš","Zdeněk","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(21462,"doc. Ing.","Beran","Theodor","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(357944,"PhDr.","Beroušek","Petr","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(411269,"","Berry","Petra","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(30252,"doc. RNDr.","Bílek","Tomáš","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111090,"","Bísková","Daniela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462113,"Mgr.","Blažková","Barbora","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(421282,"Ing.","Bobek","Milan","MSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(334824,"","Bozděchová","Věra","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(101392,"","Bradáčová","Jaroslava","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(415653,"","Brandner","Meret","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463582,"Ing.Mgr.","Brejcha","Radim","PhD.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(440688,"","Briggs III","George Leonard","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(360231,"doc. Ing.","Brůna","Karel","Ph.d.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(410630,"","Bušková","Iveta","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(379391,"","Cindrová","Šárka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(469560,"Ing..","Cipovová","Eva","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(365952,"","Císlerová","Eva","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20751,"","Civínová","Zdeňka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462125,"","Crown","Darren Anthony","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(402411,"Ing.","Cupal","Libor","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385718,"Ing.","Cupalová","Soňa","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251369,"","Čadová","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385605,"Ing.","Čámská","Dagmar","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(444218,"Bc.","Čápová","Jitka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(390340,"Ing.","Čermáková","Daniela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(442959,"PhDr.","Černý","Jan","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(326823,"RNDr.","Čertíková","Marta","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251920,"Ing.","Čižmárová","Elena","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(359848,"doc. Ing.","Dědina","Jiří","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(344658,"doc. Ing. Mgr.","Dlouhý","Martin","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(110012,"doc. PhDr.","Dobrovská","Dana","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459486,"Mgr.","Dobrucká","Lucia","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399515,"RNDr. Ing.","Dobrylovský","Jiří","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462461,"Mgr.","Dohnalová","Gabriela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(380384,"","Dolejší","Kamila","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(314260,"Ing. ","Drábek ","Michal ","Ph.D. ",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(441002,"","Eade","Callum James","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(11442,"PhDr.","Emrová","Lenka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999904,"","externista","OJS","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999965,"","externista","OVSRS","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999963,"","externista","OES","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999977,"","externista","ČVUT","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999951,"","externista","OPPS","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(9999916,"","externista","OMS","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(14254,"","Fajfrová","Hana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(444614,"Ing.","Fanta","Petr","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(335638,"Ing.","Findová","Šárka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(357898,"","Fleková","Magda","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385259,"Ing.","Fukačová","Lenka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(357428,"PhDr.","Gajdošová","Anna","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(440371,"","Geer","Alexander George","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(319280,"Mgr.","Groll","Tomáš","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399516,"Ing.","Gullová","Soňa","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(348713,"PhDr.","Hájek","Vojtěch","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399950,"","Hall","Michael","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(335440,"","Havlíková","Marie","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462160,"Ing.","Havránek","Jan","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(24072,"Ing.","Herman","Aleš","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(413533,"RNDr.","Heřmanová","Eva","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470874,"","Hilton","Simon","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470885,"","Hlavičková","Zuzana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(464105,"","Hluboček","Pavel","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(422132,"Ing.","Holá","Hana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(110431,"","Holasová","Taťána","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(307355,"Ing.","Holman","Jiří","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(358773,"Ing.","Horová","Olga","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399060,"","Horová","Nicole","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(417526,"Mgr. et Mgr.","Hošková","Kateřina","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(441599,"","Hráská","Michaela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111066,"PhDr.","Hřebačková","Monika","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(456021,"RNDr.","Hudeček","Tomáš","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459765,"Ing.","Charvátová","Dagmar","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(441306,"Mgr.","Chmelenský","Jiří","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470642,"","Chvatíková","Zuzana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251753,"Ing.","Ivančík","Peter","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(467281,"Ing.","Jílková","Petra ","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(430563,"PhDr.","Jirkovská","Blanka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(430383,"doc. RNDr.","Jiří","Witzany","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111526,"Ing.","Joudalová","Barbora","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(350959,"Ing.","Junek","Alexander","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375467,"RNDr.","Jurková","Jitka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(366093,"Ing.","Kačín","Radovan","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(461632,"","Kadečková","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(325379,"Ing.","Kaiser","Jiří","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(333107,"","Katzl","Mirek","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(331353,"","Katzl","Valli Sharpless","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20699,"doc. Ing.","Kavan","Michal","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(404782,"prof. RNDr. Ing.","Kodera","Jan","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20281,"doc. Ing.","Kolovratník","Michal","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470095,"","Koska","Adam","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(326200,"Ing.","Košťálek","Josef","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(467841,"Ing.","Koťátková Stránská","Pavla","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385828,"RNDr.","Kouřilová","Jana","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(396224,"","Kovářík","Tomáš","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20034,"doc. RNDr.","Kračmar","Stanislav","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375961,"Ing.","Král","Petr","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(422437,"Ing. et Ing.","Kramulová","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(351203,"Ing.","Krause","Josef","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(394710,"Mgr.","Křenková","Eva","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(306091,"Ing.","Kubín","Milan","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385600,"Ing.","Kukliš","Igor","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(444417,"Ing. ","Kyncl","Martin ","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(389646,"doc.Ing.","Langhamrová","Jitka","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462164,"","Lewis","Suzanne Elaine","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(398015,"Ing. ","Lhota ","Jan ","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(339079,"Ing. ","Li","Martin ","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(252152,"Ing.","Líbenek","Tomáš","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(469802,"","Linková","Kamila","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(462858,"PhDr.","Lorenzová","Jitka","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(427790,"doc. RNDr. Ing.","Lukáš","Ladislav","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(24960,"doc. Ing.","Macák","Tomáš","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399662,"Ing.","Mackenzie","Iveta","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20551,"prof. Ing.","Mádl","Jan","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385464,"Ing.","Macháček","Jiří","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(397192,"","Machata","David","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459512,"Ing.","Makovský","Petr","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(389239,"Ing.","Malík","Zdeněk","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352365,"prof. Ing. ","Mandel","Martin","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(390240,"Bc.","Mansour","Lenka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(402351,"Mgr.","Marčíková","Hana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385983,"","Mason","David","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(306811,"Ing.","Maščuch","Jakub","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463736,"PhDr. Ing.","Mašín","Petr","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385411,"Mgr.","Matoušů","Hana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(342336,"Mgr.","Matušková","Magda","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463575,"","McDonnell","David Carroll","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(441246,"","McNally-Millar","Maximilian Brian","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111436,"PhDr.","Miňovský","Petr","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(80433,"","Morysková","Michaela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375820,"Ing.","Mráček","Karel","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(14806,"Ing. Bc.","Mrázková","Kateřina","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(416486,"Ing.","Mrázová","Lenka","ACCA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(427040,"PhDr.","Mynaříková","Lenka","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352061,"","Němečková","Lenka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352216,"Mgr.","Němečková","Lenka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(390546,"Ing.","Němečková","Iveta","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463734,"PhDr.","Nesvadba","Petr","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251611,"","Nešporová","Marta","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(441305,"Mgr.","Nosková","Simona","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(24084,"Ing.","Novák","Pavel","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(30387,"PhDr.","Nováková","Irena Petra","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(389066,"Ing.","Nováková","Lenka","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(367597,"","Nováková","Karolína","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470906,"Ing.","Opletalová","Michaela","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(335319,"","Otmarová","Ludmila","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(380385,"Mgr.","Pavelková","Hana","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(461515,"Ing.","Pavlíčková","Kateřina","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(390310,"","Peer","Carolyne Dolores","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(442952,"doc. PhDr.","Perottino","Michel","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(413651,"Mgr.","Pilařová","Irena","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(252499,"Ing.","Plachý","Martin","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(110684,"","Plíčková","Marie","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(24748,"Ing. BcA.","Podaný","Jan","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(335377,"","Podhajská","Eva","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(445317,"","Podolyan, CSc.","Ilona","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459477,"doc. Ing.","Pošta","Vít","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(15052,"JUDr.","Pourová","Irena","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(358947,"Ing.","Prokop","Jaromír","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(350642,"Ing.","Pros","Josef","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(30282,"","Průcha","Ladislav","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(343776,"","Rejchrtová KozlÍková","Abigail","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(342345,"","Rezlerová","Eva","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(341258,"Mgr.","Rinnová","Eugenie","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(463735,"PhDr.","Roll","Zdeněk","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(351981,"Ing.","Rosolová","Dana","MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(379581,"","Rösslerová","Anežka","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385335,"","Řandová","Zuzana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(464706,"","Říčka","Tomáš","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(412408,"Bc.","Římanová","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352053,"doc. Ing.","Sato","Alexej","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(418777,"PhDr.","Savický","Nikolaj","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111402,"doc. PhDr.","Semrád","Jiří","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352193,"doc. RNDr. Ing.","Scholleová","Hana","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(384157,"Ing.","Starkova","Olga","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(358772,"PhDr.","Surynek","Alois","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(416387,"Ing.","Svoboda","Jiří","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(110162,"prof. RNDr.","Svoboda","Emanuel","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(442018,"Ing.","Svoboda","Petr","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(357900,"Ing.","Šikýř","Martin","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(403039,"Ing.","Šimonová","Klára","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375468,"Ing.","Škorňová","Eva","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(430280,"","Škorpíková","Dagmar","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(250693,"PaedDr.","Škrabal","Milan","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(377312,"PhDr.","Šlajchová","Ladislava","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(412420,"PhDr.","Šnýdrová","Markéta","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(443210,"Mgr.","Štefl","Martin","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(397730,"Ing. arch.","Štěpánek","Petr","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399809,"","Štěrbová","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(398077,"Ing. ","Šulc ","Kryštof ","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375133,"Mgr.","Švábenická","Kateřina","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(342079,"doc. Ing.","Švecová","Lenka","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(417099,"PhDr.","Švihlíková","Svatava","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(111289,"","Tait","Elizabeth Ann","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(336479,"","Těhníková","Barbora","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20760,"PhDr.","Tichá","Ludmila","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(453862,"Ing.","Toth","Daniel","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(459505,"doc. Ing.","Tuček","David","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(399663,"PhDr.","Tureckiová","Michaela","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(403372,"","Tvarohová","Diane","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(394779,"Ing.","Tyll","Ladislav","Ph.D., MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251445,"PhDr.","Úlehlová","Hana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(470691,"Ing.","Uličná","Štěpánka","Ph.D. ",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(432513,"doc. Ing.","Vacík","Emil","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(364293,"Ing.","Valášek","Jan","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(445248,"","Valášková","Martina","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(251301,"prof. PhDr.","Vališová","Alena","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(250264,"doc. Ing.","Vaněček","David","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385810,"JUDr.","Vaněčková","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20721,"Ing.","Vaniš","Ladislav","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(351070,"Ing.","Vávra","Oldřich","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(33942,"prof. Ing.","Veber","Jaromír","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(373849,"","Vinterová","Helena","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(427734,"doc. Ing.","Vlachý","Jan","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(110041,"PhDr.","Vobořilová","Jarmila","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(310797,"Ing.","Vodný","Roman","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(335478,"","Vosková","Monika","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(353944,"prof. Ing. ","Vošvrda","Miloslav","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20571,"doc. Ing.","Vrabec","Martin","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(10795,"doc. Ing.","Vytlačil","Dalibor","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352054,"doc. Ing.","Zamykalová","Miroslava","CSc.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(375401,"","Zdvihalová","Alice","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20725,"doc. Ing.","Zralý","Martin","Ph.D.",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(385123,"Mgr.","Zvěřinová","Jana","",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(352250,"Ing.","Žáček","Vladimír","CSc., MBA",AccessRole.findByRoleName("employee")));
        listE.add(new Employees(20726,"Ing.","Žemlička","Petr","",AccessRole.findByRoleName("employee")));

        List<Member> listMember = new ArrayList<Member>();
        listMember.add(new Member("pavel.andres@cvut.cz","111517","andrepav"));
        listMember.add(new Member("375057","375057","375057"));
        listMember.add(new Member("459456","459456","459456"));
        listMember.add(new Member("440369","440369","440369"));
        listMember.add(new Member("jitka.bendova@cvut.cz","463499","bendojit"));
        listMember.add(new Member("377993","377993","377993"));
        listMember.add(new Member("21462","21462","21462"));
        listMember.add(new Member("357944","357944","357944"));
        listMember.add(new Member("411269","411269","411269"));
        listMember.add(new Member("30252","30252","30252"));
        listMember.add(new Member("111090","111090","111090"));
        listMember.add(new Member("462113","462113","462113"));
        listMember.add(new Member("421282","421282","421282"));
        listMember.add(new Member("vera.bozdechova@cvut.cz","334824","bozdever"));
        listMember.add(new Member("jaroslava.bradacova@cvut.cz","101392","bradajar"));
        listMember.add(new Member("415653","415653","415653"));
        listMember.add(new Member("463582","463582","463582"));
        listMember.add(new Member("440688","440688","440688"));
        listMember.add(new Member("360231","360231","360231"));
        listMember.add(new Member("410630","410630","410630"));
        listMember.add(new Member("sarka.cindrova@cvut.cz","379391","cindrsar"));
        listMember.add(new Member("eva.cipovova@cvut.cz","469560","cipoveva"));
        listMember.add(new Member("eva.cislerova@cvut.cz","365952","cisleeva"));
        listMember.add(new Member("20751","20751","20751"));
        listMember.add(new Member("462125","462125","462125"));
        listMember.add(new Member("libor.cupal@cvut.cz","402411","cupallib"));
        listMember.add(new Member("385718","385718","385718"));
        listMember.add(new Member("251369","251369","251369"));
        listMember.add(new Member("dagmar.camska@cvut.cz","385605","camskdag"));
        listMember.add(new Member("jitka.capova@cvut.cz","444218","capovjit"));
        listMember.add(new Member("390340","390340","390340"));
        listMember.add(new Member("442959","442959","442959"));
        listMember.add(new Member("326823","326823","326823"));
        listMember.add(new Member("251920","251920","251920"));
        listMember.add(new Member("359848","359848","359848"));
        listMember.add(new Member("martin.dlouhy@cvut.cz","344658","dlouhma5"));
        listMember.add(new Member("dana.dobrovska@cvut.cz","110012","dobrodan"));
        listMember.add(new Member("lucia.dobrucka@cvut.cz","459486","dobruluc"));
        listMember.add(new Member("399515","399515","399515"));
        listMember.add(new Member("gabriela.dohnalova@cvut.cz","462461","dohnagab"));
        listMember.add(new Member("380384","380384","380384"));
        listMember.add(new Member("314260","314260","314260"));
        listMember.add(new Member("441002","441002","441002"));
        listMember.add(new Member("lenka.emrova@cvut.cz","11442","emrovlen"));
        listMember.add(new Member("9999904","9999904","9999904"));
        listMember.add(new Member("9999965","9999965","9999965"));
        listMember.add(new Member("9999963","9999963","9999963"));
        listMember.add(new Member("9999977","9999977","9999977"));
        listMember.add(new Member("9999951","9999951","9999951"));
        listMember.add(new Member("9999916","9999916","9999916"));
        listMember.add(new Member("14254","14254","14254"));
        listMember.add(new Member("petr.fanta@cvut.cz","444614","fantape1"));
        listMember.add(new Member("335638","335638","335638"));
        listMember.add(new Member("357898","357898","357898"));
        listMember.add(new Member("lenka.fukacova@cvut.cz","385259","fukaclen"));
        listMember.add(new Member("357428","357428","357428"));
        listMember.add(new Member("440371","440371","440371"));
        listMember.add(new Member("tomas.groll@cvut.cz","319280","grolltom"));
        listMember.add(new Member("399516","399516","399516"));
        listMember.add(new Member("348713","348713","348713"));
        listMember.add(new Member("399950","399950","399950"));
        listMember.add(new Member("335440","335440","335440"));
        listMember.add(new Member("jan.havranek@cvut.cz","462160","havraja8"));
        listMember.add(new Member("24072","24072","24072"));
        listMember.add(new Member("413533","413533","413533"));
        listMember.add(new Member("470874","470874","470874"));
        listMember.add(new Member("470885","470885","470885"));
        listMember.add(new Member("464105","464105","464105"));
        listMember.add(new Member("422132","422132","422132"));
        listMember.add(new Member("110431","110431","110431"));
        listMember.add(new Member("307355","307355","307355"));
        listMember.add(new Member("358773","358773","358773"));
        listMember.add(new Member("399060","399060","399060"));
        listMember.add(new Member("417526","417526","417526"));
        listMember.add(new Member("441599","441599","441599"));
        listMember.add(new Member("monika.hrebackova@cvut.cz","111066","hrebamon"));
        listMember.add(new Member("tomas.hudecek@cvut.cz","456021","hudecto6"));
        listMember.add(new Member("459765","459765","459765"));
        listMember.add(new Member("441306","441306","441306"));
        listMember.add(new Member("470642","470642","470642"));
        listMember.add(new Member("peter.ivancik@fsv.cvut.cz","251753","ivancpet"));
        listMember.add(new Member("petra.jilkova@cvut.cz","467281","jilkopet"));
        listMember.add(new Member("blanka.jirkovska@cvut.cz","430563","jirkobla"));
        listMember.add(new Member("430383","430383","430383"));
        listMember.add(new Member("barbora.joudalova@cvut.cz","111526","sykorbar"));
        listMember.add(new Member("350959","350959","350959"));
        listMember.add(new Member("375467","375467","375467"));
        listMember.add(new Member("366093","366093","366093"));
        listMember.add(new Member("461632","461632","461632"));
        listMember.add(new Member("325379","325379","325379"));
        listMember.add(new Member("333107","333107","333107"));
        listMember.add(new Member("331353","331353","331353"));
        listMember.add(new Member("20699","20699","20699"));
        listMember.add(new Member("404782","404782","404782"));
        listMember.add(new Member("20281","20281","20281"));
        listMember.add(new Member("470095","470095","470095"));
        listMember.add(new Member("326200","326200","326200"));
        listMember.add(new Member("pavla.kotatkova.stranska@cvut.cz","467841","kotatpav"));
        listMember.add(new Member("385828","385828","385828"));
        listMember.add(new Member("396224","396224","396224"));
        listMember.add(new Member("20034","20034","20034"));
        listMember.add(new Member("375961","375961","375961"));
        listMember.add(new Member("422437","422437","422437"));
        listMember.add(new Member("351203","351203","351203"));
        listMember.add(new Member("eva.krenkova@cvut.cz","394710","jankoev1"));
        listMember.add(new Member("306091","306091","306091"));
        listMember.add(new Member("385600","385600","385600"));
        listMember.add(new Member("444417","444417","444417"));
        listMember.add(new Member("389646","389646","389646"));
        listMember.add(new Member("462164","462164","462164"));
        listMember.add(new Member("398015","398015","398015"));
        listMember.add(new Member("339079","339079","339079"));
        listMember.add(new Member("tomas.libenek@fsv.cvut.cz","252152","libenet"));
        listMember.add(new Member("","469802",""));
        listMember.add(new Member("jitka.lorenzova@cvut.cz","462858","lorenjit"));
        listMember.add(new Member("427790","427790","427790"));
        listMember.add(new Member("tomas.macak@cvut.cz","24960","macaktom"));
        listMember.add(new Member("399662","399662","399662"));
        listMember.add(new Member("20551","20551","20551"));
        listMember.add(new Member("385464","385464","385464"));
        listMember.add(new Member("david.machata@cvut.cz","397192","machada6"));
        listMember.add(new Member("petr.makovsky@cvut.cz","459512","makovpet"));
        listMember.add(new Member("389239","389239","389239"));
        listMember.add(new Member("352365","352365","352365"));
        listMember.add(new Member("390240","390240","390240"));
        listMember.add(new Member("402351","402351","402351"));
        listMember.add(new Member("385983","385983","385983"));
        listMember.add(new Member("306811","306811","306811"));
        listMember.add(new Member("463736","463736","463736"));
        listMember.add(new Member("385411","385411","385411"));
        listMember.add(new Member("magda.matuskova@cvut.cz","342336","burgemag"));
        listMember.add(new Member("463575","463575","463575"));
        listMember.add(new Member("441246","441246","441246"));
        listMember.add(new Member("111436","111436","111436"));
        listMember.add(new Member("80433","80433","80433"));
        listMember.add(new Member("375820","375820","375820"));
        listMember.add(new Member("14806","14806","14806"));
        listMember.add(new Member("416486","416486","416486"));
        listMember.add(new Member("lenka.mynarikova@cvut.cz","427040","mynarlen"));
        listMember.add(new Member("352061","352061","352061"));
        listMember.add(new Member("352216","352216","352216"));
        listMember.add(new Member("390546","390546","390546"));
        listMember.add(new Member("463734","463734","463734"));
        listMember.add(new Member("251611","251611","251611"));
        listMember.add(new Member("441305","441305","441305"));
        listMember.add(new Member("24084","24084","24084"));
        listMember.add(new Member("irena.petra.novakova@cvut.cz","30387","klimova"));
        listMember.add(new Member("389066","389066","389066"));
        listMember.add(new Member("367597","367597","367597"));
        listMember.add(new Member("470906","470906","470906"));
        listMember.add(new Member("335319","335319","335319"));
        listMember.add(new Member("hana.pavelkova@cvut.cz","380385","pavelhan"));
        listMember.add(new Member("katerina.pavlickova@cvut.cz","461515","pavlika2"));
        listMember.add(new Member("390310","390310","390310"));
        listMember.add(new Member("442952","442952","442952"));
        listMember.add(new Member("413651","413651","413651"));
        listMember.add(new Member("252499","252499","252499"));
        listMember.add(new Member("110684","110684","110684"));
        listMember.add(new Member("24748","24748","24748"));
        listMember.add(new Member("335377","335377","335377"));
        listMember.add(new Member("445317","445317","445317"));
        listMember.add(new Member("vit.posta@cvut.cz","459477","postavit"));
        listMember.add(new Member("irena.pourova@cvut.cz","15052","pouroire"));
        listMember.add(new Member("358947","358947","358947"));
        listMember.add(new Member("350642","350642","350642"));
        listMember.add(new Member("30282","30282","30282"));
        listMember.add(new Member("343776","343776","343776"));
        listMember.add(new Member("342345","342345","342345"));
        listMember.add(new Member("341258","341258","341258"));
        listMember.add(new Member("463735","463735","463735"));
        listMember.add(new Member("351981","351981","351981"));
        listMember.add(new Member("379581","379581","379581"));
        listMember.add(new Member("385335","385335","385335"));
        listMember.add(new Member("464706","464706","464706"));
        listMember.add(new Member("412408","412408","412408"));
        listMember.add(new Member("352053","352053","352053"));
        listMember.add(new Member("nikolaj.savicky@cvut.cz","418777","savicnik"));
        listMember.add(new Member("jiri.semrad@cvut.cz","111402","semrajir"));
        listMember.add(new Member("hana.scholleova@cvut.cz","352193","scholhan"));
        listMember.add(new Member("384157","384157","384157"));
        listMember.add(new Member("358772","358772","358772"));
        listMember.add(new Member("416387","416387","416387"));
        listMember.add(new Member("emanuel.svoboda@cvut.cz","110162","svoboema"));
        listMember.add(new Member("","442018",""));
        listMember.add(new Member("martin.sikyr@cvut.cz","357900","sikyrmar"));
        listMember.add(new Member("klara.simonova@cvut.cz","403039","simonkla"));
        listMember.add(new Member("eva.skornova@cvut.cz","375468","skorneva"));
        listMember.add(new Member("430280","430280","430280"));
        listMember.add(new Member("milan.skrabal@cvut.cz","250693","skrabmil"));
        listMember.add(new Member("377312","377312","377312"));
        listMember.add(new Member("412420","412420","412420"));
        listMember.add(new Member("martin.stefl@cvut.cz","443210","steflmar"));
        listMember.add(new Member("petr.stepanek@cvut.cz","397730","stepap22"));
        listMember.add(new Member("jana.sterbova@cvut.cz","399809","sterbja8"));
        listMember.add(new Member("398077","398077","398077"));
        listMember.add(new Member("375133","375133","375133"));
        listMember.add(new Member("lenka.svecova@cvut.cz","342079","svecolen"));
        listMember.add(new Member("svatava.svihlikova@cvut.cz","417099","svihlsva"));
        listMember.add(new Member("111289","111289","111289"));
        listMember.add(new Member("336479","336479","336479"));
        listMember.add(new Member("20760","20760","20760"));
        listMember.add(new Member("daniel.toth@cvut.cz","453862","tothdani"));
        listMember.add(new Member("david.tucek@cvut.cz","459505","tucekda3"));
        listMember.add(new Member("michaela.tureckiova@cvut.cz","399663","turecmic"));
        listMember.add(new Member("403372","403372","403372"));
        listMember.add(new Member("394779","394779","394779"));
        listMember.add(new Member("hana.ulehlova@cvut.cz","251445","brozkhan"));
        listMember.add(new Member("stepanka.ulicna@cvut.cz","470691","ulicnste"));
        listMember.add(new Member("emil.vacik@cvut.cz","432513","vacikemi"));
        listMember.add(new Member("364293","364293","364293"));
        listMember.add(new Member("445248","445248","445248"));
        listMember.add(new Member("alena.valisova@cvut.cz","251301","valisale"));
        listMember.add(new Member("david.vanecek@cvut.cz","250264","vanecdav"));
        listMember.add(new Member("jana.vaneckova@cvut.cz","385810","vanecja5"));
        listMember.add(new Member("20721","20721","20721"));
        listMember.add(new Member("351070","351070","351070"));
        listMember.add(new Member("jaromir.veber@cvut.cz","33942","veberja1"));
        listMember.add(new Member("373849","373849","373849"));
        listMember.add(new Member("jan.vlachy@cvut.cz","427734","vlachja8"));
        listMember.add(new Member("jarmila.voborilova@cvut.cz","110041","voborjar"));
        listMember.add(new Member("310797","310797","310797"));
        listMember.add(new Member("335478","335478","335478"));
        listMember.add(new Member("353944","353944","353944"));
        listMember.add(new Member("20571","20571","20571"));
        listMember.add(new Member("10795","10795","10795"));
        listMember.add(new Member("352054","352054","352054"));
        listMember.add(new Member("375401","375401","375401"));
        listMember.add(new Member("martin.zraly@cvut.cz","20725","zralymar"));
        listMember.add(new Member("jana.zverinova@cvut.cz","385123","zverija3"));
        listMember.add(new Member("352250","352250","352250"));
        listMember.add(new Member("20726","20726","20726"));


        for (int i = 0; i < listMember.size() ; i++) {
            listMember.get(i).save();
            listE.get(i).save();
            listE.get(i).setMember(listMember.get(i));
            listE.get(i).update();
            listMember.get(i).setEmployees(listE.get(i));
            listMember.get(i).update();
        }

    }

}
