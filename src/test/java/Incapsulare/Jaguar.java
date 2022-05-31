package Incapsulare;

public class Jaguar extends Masina{

    public Jaguar(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }
    @Override
    public void CumparaMasina(){
        System.out.println("Nu cumpara jaguar");
        super.CumparaMasina();
    }
}
