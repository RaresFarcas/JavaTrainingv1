package OOP_Interfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void metodaInterfata(){

        // Persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("Nume 1", "Prenume 1", "Angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();


        // Persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("Nume 2", "Prenume 2", "student");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();
        persoanaStudent.setNume("Farcas");
        persoanaStudent.setPrenume("Rares");
        persoanaStudent.Invata();

        // Persoana angajat student
        PersoanaStudentAngajat persoanaStudentAngajat = new PersoanaStudentAngajat("Nume 3", "Prenume 3", " invata si munceste");
        persoanaStudentAngajat.Invata();
        persoanaStudentAngajat.Munceste();
        persoanaStudentAngajat.PrimesteBursa();
        persoanaStudentAngajat.PrimesteSalar();
        persoanaStudentAngajat.setMeserie("munceste si uneori mai si invata da rar");
        persoanaStudentAngajat.Munceste();
    }
}
