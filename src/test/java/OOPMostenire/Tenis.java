package OOPMostenire;

import java.util.List;

public class Tenis extends Sport{

    public Boolean EchipamentSpecial;

    public Integer NrRachete;

    public List<String> Reguli;

    public Tenis(String nume, String denumire, Boolean esteinEchipa, Integer NrMembri, Boolean EchipamentSpecial, Integer NrRachete, List<String> Reguli) {
        super(nume, denumire, esteinEchipa, NrMembri);
        this.EchipamentSpecial = EchipamentSpecial;
        this.NrRachete = NrRachete;
        this.Reguli = Reguli;
    }

    public void InfoTenis(){
        System.out.println("Informatiile despre tenis sunt: ");
        InfoSport();
        System.out.println(EchipamentSpecial);
        System.out.println(NrRachete);
        System.out.println(Reguli);
    }
}
