import models.CriteriaKPI;
import models.CriteriaLector;
import models.ItemsKPI;
import models.SalaryScale;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 05.03.2017.
 */
public class KPIStart {
    public void insertKPIStart() {
        List<ItemsKPI> list = new ArrayList<ItemsKPI>();
        /*A */
        list.add(new ItemsKPI("A", "Pedagogická činnost", "", ""));
        list.add(new ItemsKPI("AA", "Výuka", "", ""));
        list.add(new ItemsKPI("AAA", "Předmět v akreditovaném oboru", "15 hod.", "1"));
        list.add(new ItemsKPI("AAB", "Jiný předmět", "15 hod.", "1"));
        list.add(new ItemsKPI("AB", "Zavedení předmětu", "15 hod.", "0.5"));
        list.add(new ItemsKPI("AC", "Vedení obhájených závěrečných prací", "1", "1"));
        list.add(new ItemsKPI("AD", "Autorství učebnice/skripta/e-learningového kursu", "100%", "1"));
        list.add(new ItemsKPI("AE", "Testy, zkoušky", "100%", "1"));
        list.add(new ItemsKPI("B", "Tvůrčí činnost", "", ""));
        list.add(new ItemsKPI("BAA", "Publikace RIV", "", ""));
        list.add(new ItemsKPI("BAA", "WoS 0-0,5", "100%", "14"));
        list.add(new ItemsKPI("BAA", "WoS 0,5-1", "100%", "26"));
        list.add(new ItemsKPI("BAA", "WoS 1 a více", "100%", "40"));
        list.add(new ItemsKPI("BAA", "Scopus 0-0,5", "100%", "14"));
        list.add(new ItemsKPI("BAA", "Scopus 0,5-1", "100%", "26"));
        list.add(new ItemsKPI("BAA", "Scopus 1 a více", "100%", "40"));
        list.add(new ItemsKPI("BAA", "ERIH", "100%", "10"));
        list.add(new ItemsKPI("BAA", "Článek ČR recenz.", "100%", "3"));
        list.add(new ItemsKPI("BAA", "Sborník (impakt.)", "100%", "3"));
        list.add(new ItemsKPI("BAA", "Monografie", "100%", "28"));
        list.add(new ItemsKPI("BAB", "Publikace ostatní", "", ""));
        list.add(new ItemsKPI("BAB", "Odborný článek", "100%", "2"));
        list.add(new ItemsKPI("BAB", "Neimpaktovaný sborník", "100%", "1"));
        list.add(new ItemsKPI("BB", "Projekt/konference/letní škola", "vedení/členství", "1"));
        list.add(new ItemsKPI("C", "Internacionalizace", "", ""));
        list.add(new ItemsKPI("CA", "Výjezd", "14 dní", "1"));
        list.add(new ItemsKPI("CB", "Výuka ve svět.jazyce/odb.jazyka", "15 hod", "0.3"));
        list.add(new ItemsKPI("CCA", "Článek ČR/monografie ve svět. jazyce", "RIV body", "0.5"));
        list.add(new ItemsKPI("CCB", "Učebnice ve svět. jazyce", "100%", "0.5"));
        list.add(new ItemsKPI("CD", "Mezinárodní projekt", "člen", "1"));
        list.add(new ItemsKPI("D", "Vedení (min. 1 pololetí)", "0/1", "1"));
        list.add(new ItemsKPI("", "Akad. úvazek na MÚVS", "%", ""));



        for (ItemsKPI items : list) {
            items.save();
        }

        List<CriteriaKPI> listCriteria = new ArrayList<CriteriaKPI>();
        listCriteria.add(new CriteriaKPI("ZH", "AAA,AB,CB", "4", "8", "8", "12"));
        listCriteria.add(new CriteriaKPI("ZH", "BA,CCA", "12", "9", "9", "0"));
        listCriteria.add(new CriteriaKPI("DH", "AAA,AAB,AB,CB", "4", "4", "4", "4"));
        listCriteria.add(new CriteriaKPI("DH", "AC", "12", "16", "16", "20"));
        listCriteria.add(new CriteriaKPI("DH", "AE", "20", "20", "20", "20"));
        listCriteria.add(new CriteriaKPI("DH", "BA,CCA", "12", "12", "12", "12"));
        listCriteria.add(new CriteriaKPI("DH", "AD,BB,CCB,CD", "2", "2", "2", "2"));
        listCriteria.add(new CriteriaKPI("DH", "CA,D", "1", "1", "1", "1"));
        listCriteria.add(new CriteriaKPI("ZH(povinné)", "Základní hodnotící jednotky - 1/0", "0", "0", "0", "0"));
        listCriteria.add(new CriteriaKPI("DH (povinné)", "Dodatečné hodnotící jednotky - 1/0", "0", "0", "0", "0"));
        listCriteria.add(new CriteriaKPI("DH (navíc)", "OO nad 100%, váha 20%", "0", "0", "0", "0"));
        listCriteria.add(new CriteriaKPI("OO (tenure)", "OO nad 0%, váha 10%", "0", "0", "0", "0"));

        for (CriteriaKPI items : listCriteria) {
            items.save();
        }

        List<CriteriaLector> listLector = new ArrayList<CriteriaLector>();
        for (CriteriaKPI items : listCriteria) {
            listLector.add(new CriteriaLector("II.2015", items.getIdentificator(), items.getItemsKPI(), items.getValueLektor()));
        }
        for (CriteriaLector items : listLector) {
            items.save();
        }

        List<SalaryScale> listSalary = new ArrayList<SalaryScale>();
        listSalary.add(new SalaryScale("ZP", "základní plat (100% úvazek)", "Kč/měs.", "27000", "23500", "20500", "20500"));
        listSalary.add(new SalaryScale("OO", "základ os. ohodnocení (100% úvazek)", "Kč/měs.", "900", "8000", "7000", "6000"));
        listSalary.add(new SalaryScale("", "koeficient navýšení OO", "pct.", "20%", "20%", "20%", "20%"));

        for (SalaryScale items : listSalary) {
            items.save();
        }

    }

}
