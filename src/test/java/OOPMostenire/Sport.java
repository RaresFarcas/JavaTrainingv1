package OOPMostenire;

import org.junit.Test;

public class Sport {
    public String Nume;
    public String Denumire;
    public Boolean esteinEchipa;
    public Integer NrMembri;


    public Sport(String nume, String denumire, Boolean esteinEchipa, Integer NrMembri) {
        Nume = nume;
        Denumire = denumire;
        this.esteinEchipa = esteinEchipa;
        this.NrMembri = NrMembri;
    }

    // OOP MOSTENIRE = Principiul pe baza caruia clasa parinte poate sa fie mostenita de n clase copii.
    // Exemplu - casa bunicilor cu nepotii.
    // In java putem mosteni o singura clase, un coptil are doar un parinte
    // In momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam constructorul din clasa parinte.

    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteinEchipa);
        System.out.println(NrMembri);
    }

}


