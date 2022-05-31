package VariableMethod;

import org.junit.Test;

public class Cursant {

    //ASTA-I UN COMENTARIU
    /*
    Asta-i alt fel de comentariu
     */
    // Class = O colectie de Variabile si Metode
    // Intr-un fisier Java putem avea mai multe clase.
    // Recunoastem o clasa dupa cuvantul cheie "class"
    // 1 fisier = 1 clasa recomandat da nu neaparat
    // Structura "clasa" = public class Name {}
    // Orice structura invatam trebuie scrisa in interiorul unei clase (la JAVA)


    // Variabila = Atributul unei clase
    // O clasa poate avea n variabile / sau deloc
    // Tipuri variabile = Globala si Locala
    // O variabila trebuie sau nu sa primeasca o valoare

    // Structura variabila GLOBALA = public tip variabila Nume
    // Dam o valoare unei variabile cu =
    // = inseamna atribuire

    public String nume;
    public String prenume;
    public Integer varsta;
    public String ocupatie;
    public Character sex;
    public Double inaltime;
    public Boolean EsteAngajat;

    // Metoda = Actiunea unei clase
    // O clasa poate sa contina n metode
    // Tipuri metode: void si return

    // Structura Metoda Void = public void Nume metoda () {cod}
    // Metodele pot sau nu sa contina parametri


    @Test
    public void AtribuireVariabile() {
        // Dam valori pentru variabilele de mai sus
        nume = "Farcas";
        prenume = "Rares Flavius Cristian";
        varsta = 24;
        ocupatie = "ing";
        sex = 'M';
        inaltime = 188.88;
        EsteAngajat = true;

        // Printam o valoare in consola

        System.out.print(sex);
        System.out.print(' ');
        System.out.print(inaltime);
        System.out.print('\n');
        System.out.print(EsteAngajat);
        System.out.print(' ');
        System.out.print(varsta);
        System.out.println(' ');
        System.out.print(nume);
        System.out.print(' ');
        System.out.print(prenume);
        System.out.print(' ');
        System.out.println(ocupatie);
        printeazanota();
        promovarecurs();
        System.out.println(' ');
        System.out.println(getSalar());
        System.out.println(getSalar2());
        System.out.print(getNr());
        System.out.println(" km/h");

        // print = printeaza si ramane pe randul curent
        // println = printeaza si sare la randul urmator


    }

    // Variabila Locala = tip variabila + Nume

    public void printeazanota() {
        Integer notamanual = 10;
        Integer notaauto = 6;
        System.out.println("Cursantul Rares a luat notele: " + notamanual + " , " + notaauto);
    }

    public void promovarecurs() {
        Boolean promovare = true;
        System.out.println("A promovat cursantul " + nume + " " + prenume + " ?");
        System.out.print(promovare);

    }

    // Metoda return = exprimare care contine "returneaza"
    // Structura return = public tip de data + nume(){}
    // Exista o conventie in Java ca metodele cu return sa aiba in fata "get"

    // Returnam salarul dorit



    public Integer getSalar() {
        Integer Salar = 9999;
        System.out.print("Salariul e: ");
        return Salar;

    }

    // alta varianta mai CORECTA
    // Cu asta pot pune string si inainte si dupa

    public String getSalar2() {
        Integer Salar2 = 111;
        String s = String.valueOf (Salar2) + " RON ";
        System.out.print("Salariul e: ");
        return s;
    }

    public Double getNr(){
        Integer o = 120;
        Double d= Double.valueOf (o);
        System.out.println("!!!!!Cati km pe ora prinde masina?!!!!!");
        return d ;
    }


}
