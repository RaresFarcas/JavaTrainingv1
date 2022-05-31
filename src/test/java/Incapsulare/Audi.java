package Incapsulare;

import org.testng.TestNGAntTask;

import java.util.List;

public class Audi extends Masina {

public List<String> DotariInterioare;
public List<String> DotariExterioare;

    public Audi(String brand, String model, Integer pret) {

        super(brand, model, pret);
    }
    public void InfoAudi(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

    //Suprascriem o metoda din clasa parinte

    @Override
    public void CumparaMasina(){
        System.out.println("Vreau sa cumpar audi ");
        super.CumparaMasina();
    }

    // Polimorfism static

    public void AfiseazaMasini(){
        System.out.println("Nu avem masini");
    }
    public void AfiseazaMasini(String Brand) {
        System.out.println("Nu avem masini");
    }
    public void AfiseazaMasini(String Brand, Integer an){
        System.out.println("Nu avem masini");
    }
    public void AfiseazaMasini(Integer Brand){
        System.out.println("Nu avem masini");
    }

    // Polimorfism static la metode cu return

    public String getNume(){
        return "Rares";

    }
    public String getNume(Integer index){
        return "Rares";

    }
    public String getNume(String index){
        return "Rares";

    }

    public String getNume(Integer  index, String marca){
        return "Rares";

        // Polimorfismul static se poate aplica doar la metodele cu return care au parametri.
        // Nu are nicio importanta numele parametrilor sau tipul parametrilor.
    }
}
