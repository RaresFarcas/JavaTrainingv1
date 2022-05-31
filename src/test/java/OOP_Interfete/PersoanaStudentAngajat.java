package OOP_Interfete;

public class PersoanaStudentAngajat extends PersoanaInterfata implements Student, Angajat{

    public PersoanaStudentAngajat(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " munceste" +getMeserie());

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " primeste salar");

    }

    @Override
    public void Invata() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Student/Angajat "+getNume()+ " " + getPrenume()+ " primeste bursa");

    }

}
