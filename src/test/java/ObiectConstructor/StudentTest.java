package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    // Obiect = Instanta unei clase.
    // Obiectul e strict legat de constructor
    // Dintr-o clasa putem declara n obiecte.
    // Obiectele se diferentiaza pe baza numelui.
    // Structura obiect: "Numeleclasei" + "numeobiect" = new "Numeleclasei" (Valori parametri)
    // Recunoastem un obiect dupa cuvantul "new"

    @Test
    public void MetodaTest() {
        // Primul obiect
        List<Integer> NoteRomanaRares = new ArrayList<>();
        NoteRomanaRares.add(1);
        NoteRomanaRares.add(5);
        NoteRomanaRares.add(9);
        List<Integer> NoteMatematicaRares = new ArrayList<>();
        NoteMatematicaRares.add(2);
        NoteMatematicaRares.add(8);
        NoteMatematicaRares.add(10);
        Student RaresFarcas = new Student("Farcas", "Rares", 24, 1.85, 'M', true, NoteMatematicaRares, NoteRomanaRares);

        RaresFarcas.InfoStudent();
        RaresFarcas.InfoNote("romana");
        RaresFarcas.InfoNote("Matematica");
        RaresFarcas.Prenume="Flavius";
        RaresFarcas.InfoStudent();


        List<Integer> NoteRomanaAlex = new ArrayList<>();
        NoteRomanaAlex.add(5);
        NoteRomanaAlex.add(5);
        NoteRomanaAlex.add(1);
        List<Integer> NoteMatematicaAlex = new ArrayList<>();
        NoteMatematicaAlex.add(1);
        NoteMatematicaAlex.add(6);
        NoteMatematicaAlex.add(7);
        Student DorhaAlex = new Student("Dorha", "Alex", 27, 1.81, 'M', false, NoteMatematicaAlex, NoteRomanaAlex);

        DorhaAlex.InfoStudent();
        DorhaAlex.InfoNote("matematica");
        DorhaAlex.InfoNote("Romana");

        // Declaram un obiect pentru al doilea constructor.
        List<Integer> NoteMatematicaClaudiu = new ArrayList<>();
        NoteMatematicaClaudiu.add(2);
        NoteMatematicaClaudiu.add(5);
        NoteMatematicaClaudiu.add(1);
        Student PopClaudiu = new Student("Pop", "Claudiu", 17, 1.01, 'F', false, NoteMatematicaClaudiu);

        PopClaudiu.InfoStudent();
        PopClaudiu.InfoNote("matematica");

        List<Integer> NoteMaghiaraZoli = new ArrayList<>();
        NoteMaghiaraZoli.add(10);
        NoteMaghiaraZoli.add(8);
        NoteMaghiaraZoli.add(4);
        List<Integer> NoteRomanaZoli = new ArrayList<>();
        NoteRomanaZoli.add(2);
        NoteRomanaZoli.add(5);
        NoteRomanaZoli.add(5);
        List<Integer> NoteMatematicaZoli = new ArrayList<>();
        NoteMatematicaZoli.add(5);
        NoteMatematicaZoli.add(8);
        NoteMatematicaZoli.add(7);

        Student ZoliZoltan = new Student("Zoli", "Zoltan", 15, 1.91, 'M', false, NoteMatematicaZoli, NoteRomanaZoli, NoteMaghiaraZoli);
        ZoliZoltan.InfoNote("maghiara");
        ZoliZoltan.InfoStudent();

        RaresFarcas.PrintCalculMedie(NoteMatematicaRares);
        ZoliZoltan.PrintCalculMedie(NoteMatematicaZoli);
        DorhaAlex.PrintCalculMedie(NoteRomanaAlex);
    }

}
