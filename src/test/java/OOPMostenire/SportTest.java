package OOPMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest {

    @Test
    public void MostenireTest(){
        //facem primul obiect (copil) pentru fotbal
        List<String> ReguliFotbal = new ArrayList<>();
        ReguliFotbal.add("Nu atinge mingea cu mana");
        ReguliFotbal.add("Nu ai voie sa dai tricoul jos");
        ReguliFotbal.add("Nu ai voie sa faultezi");
        Fotbal fotbalSport= new Fotbal("Fotbal", "Sport de echipa", true, 11, true, 3, ReguliFotbal );

        fotbalSport.InfoFotbal();
        fotbalSport.InfoSport();
        fotbalSport.Reguli=null;
        fotbalSport.InfoFotbal();

        List<String> ReguliTenis = new ArrayList<>();
        ReguliTenis.add("Nu ai voie sa servesti din teren ");
        ReguliTenis.add("Nu ai voie sa atingi fileul");
        ReguliTenis.add("Mingea se loveste doar cu racheta ");
        Tenis tenisSport = new Tenis("Tenis", "Sport single", false, 1, true, 2, ReguliTenis);

        tenisSport.InfoTenis();
        tenisSport.InfoSport();

        List<String> ReguliHandball = new ArrayList<>();
        ReguliHandball.add("Nu ai voie sa atingi mingea cu piciorul ");
        ReguliHandball.add("Se poate juca si fara portar ");
        ReguliHandball.add("Nu ai voie sa calci in careul de 6m ");
        Handball handballSport = new Handball("Handball", "Sport in echipa", true, 6, true, 30, ReguliHandball);

        handballSport.InfoHandball();
        handballSport.InfoSport();

    }


// TEMA HANDBALL SI TENIS.
}
