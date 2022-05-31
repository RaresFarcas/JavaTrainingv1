package OOPMostenire;

import java.util.List;

public class Handball extends Sport {

    public Boolean cuMinge;

    public Integer nrGoluri;

    public List<String> Reguli;
    public Handball(String nume, String denumire, Boolean esteinEchipa, Integer NrMembri, Boolean cuMinge, Integer nrGoluri, List<String> Reguli) {
        super(nume, denumire, esteinEchipa, NrMembri);

        this.cuMinge = cuMinge;
        this.nrGoluri = nrGoluri;
        this.Reguli = Reguli;

    }
    public void InfoHandball(){
        System.out.println("Informatiile despre handball sunt: ");
        InfoSport();
        System.out.println(cuMinge);
        System.out.println(nrGoluri);
        System.out.println(Reguli);
    }
}
