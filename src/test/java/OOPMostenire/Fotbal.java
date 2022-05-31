package OOPMostenire;

import java.util.List;

// asta e copil, Sport e parinte

public class Fotbal extends Sport {

    public Boolean Capitan;
    public Integer nrEchipamente;
    public List<String> Reguli;

    public Fotbal(String nume, String denumire, Boolean esteinEchipa, Integer nrMembri, Boolean Capitan, Integer nrEchipamente, List<String> Reguli) {
        super(nume, denumire, esteinEchipa, nrMembri);

        this.Capitan = Capitan;
        this.nrEchipamente = nrEchipamente;
        this.Reguli = Reguli;


    }

    public void InfoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        InfoSport();
        System.out.println(Capitan);
        System.out.println(nrEchipamente);
        System.out.println(Reguli);

    }
}
