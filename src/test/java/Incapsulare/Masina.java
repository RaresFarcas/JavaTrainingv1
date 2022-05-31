package Incapsulare;

public class Masina {

    // Incapsulare = concept prin care tinem departe de exterior valorile variabilelor.
    // private = access control care blocheaza valorile variabilelor sa fie vazute in afara clasei in care ai declarat
    // ca sa vedem / modificam valorile folosim conceptul de "get" si "set".

    private String Brand;
    private String Model;
    private Integer Pret;


    // Polimorfismul e dinamic si static
    // Polimorfism dinamic = Intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    // Polimorfism static = Mai multe metode cu acelasi nume se pot diferentia prin numarul de parametri si tipul parametrilor.
    // Polimorfismul dinamic = override.
    // Polimorfism static = overload.
    // Polimorfismul static nu se poate aplica la metodele cu return


    public Masina(String brand, String model, Integer pret) {
        Brand = brand;
        Model = model;
        Pret = pret;

    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setModel(String model) {
        Model = model;
    }

    // Definim o metoda pe care o vom suprascrie (override)

    public void CumparaMasina(){
        System.out.println("Vreau sa cumpar o masinita ");
    }
}
