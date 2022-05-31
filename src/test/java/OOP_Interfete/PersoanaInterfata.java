package OOP_Interfete;

public class PersoanaInterfata {

    // Abstractizare = Conceptul pe baza caruia se defineste comportamentul unei clase.
    // Conceptul se poate face cu interfete sau clase abstracte.


    private String nume;
    private String prenume;         // nu neaparat private
    private String meserie;

    public PersoanaInterfata(String nume, String prenume, String meserie) {
        this.nume = nume;
        this.prenume = prenume;
        this.meserie = meserie;

    }
        // getter si setter - click dreapta > generate > getter setter.

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getMeserie() {
        return meserie;
    }

    public void setMeserie(String meserie) {
        this.meserie = meserie;
    }

}
