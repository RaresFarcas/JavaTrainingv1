package ObiectConstructor;

import com.google.errorprone.annotations.Var;

import java.util.Arrays;
import java.util.List;

public class Student {

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltimea;
    public Character Sex;
    public Boolean areBursa;

    public List<Integer> NoteMatematica;
    public List<Integer> NoteRomana;
    public List<Integer> NoteMaghiara;

    // Obiect = Instanta unei clase
    // Constructor = Are ca rol sa initializeze variabilele unei clase
    // Tipuri de Constructor = cu parametri
    //                          fara parametri

    // By default avem un constructor fara parametri in orice clasa.
    // Intr-o clasa putem avea n constructori, minim 1.
    // Structura constructor: public + "numele clasei" + ( are sau nu parametri )
    // Nu exista constructor cu return.

    public Student(String Nume, String Prenume, Integer Varsta, Double Inaltimea, Character Sex, Boolean areBursa, List<Integer> NoteMatematica, List<Integer> NoteRomana) {  // Acesta e un constructor
        this.Nume = Nume;
        this.Prenume = Prenume;
        this.Varsta = Varsta;
        this.Inaltimea = Inaltimea;
        this.Sex = Sex;
        this.areBursa = areBursa;
        this.NoteMatematica = NoteMatematica;
        this.NoteRomana = NoteRomana;

    }
    // Facem un alt constructor doar cu nota la matematica


    public Student(String nume, String prenume, Integer varsta, Double inaltimea, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltimea = inaltimea;
        Sex = sex;
        this.areBursa = areBursa;
        NoteMatematica = noteMatematica;
    }

    public Student(String nume, String prenume, Integer varsta, Double inaltimea, Character sex, Boolean areBursa, List<Integer> noteMatematica, List<Integer> noteRomana, List<Integer> noteMaghiara) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltimea = inaltimea;
        Sex = sex;
        this.areBursa = areBursa;
        NoteMatematica = noteMatematica;
        NoteRomana = noteRomana;
        NoteMaghiara = noteMaghiara;
    }

    public void InfoStudent() {
        System.out.println("Numele studentului este " + Nume);
        System.out.println("Prenumele studentului este " + Prenume);
        System.out.println("Varsta studentului este " + Varsta);
        System.out.println("Inaltimea studentului este " + Inaltimea);
        System.out.println("Sexul studentului este " + Sex);
        System.out.println("Studentul are bursa? " + areBursa);

    }

    public void InfoNote(String Materie) {
        if (Materie.equals("romana") || Materie.equals("Romana")) {
            System.out.println("Notele studentului la Romana sunt urmatoarele: ");
            PrintCalculMedie(NoteRomana);
        }
        if (Materie.equals("matematica") || Materie.equals("Matematica")) {
            System.out.println("Notele studentului la Matematica sunt urmatoarele: ");
            PrintCalculMedie(NoteMatematica);
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara")) {
            System.out.println("Notele studentului la Maghiara sunt urmatoarele: ");
            PrintCalculMedie(NoteMaghiara);

            }
        }


    public void PrintCalculMedie(List<Integer> note) {
        double suma = 0;
        Integer nrElemente = note.size();

        for (Integer index = 0; index < note.size(); index++) {
            suma=suma+note.get(index);
        }
        double Medie = suma / nrElemente;
        System.out.println(Medie);
        }

}



