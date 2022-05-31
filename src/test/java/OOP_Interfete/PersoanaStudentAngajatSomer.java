package OOP_Interfete;

public class PersoanaStudentAngajatSomer extends PersoanaInterfata implements Student,Angajat,Somer{

    public PersoanaStudentAngajatSomer(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Munceste() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " munceste");

    }

    @Override
    public void PrimesteSalar() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " primeste salar");

    }

    @Override
    public void Someaza() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " someaza");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Student/Angajat/Somer "+getNume()+ " " + getPrenume()+ " primeste bursa");

    }
}
