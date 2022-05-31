package TEMA;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.Test;
import org.testng.internal.ConstructorOrMethod;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class tema1 {

    public String Hi;
    public Integer varsta;
    public String nume;
    public String prenume;
    public Integer zi;
    public Integer luna;
    public Integer an;
    public Integer ora;
    public Integer min;
    public String PmAm;
    public Boolean Luni;
    public Boolean Marti;


    @Test
    public void variabile() {
        Hi = "Hi world!";
        varsta = 24;
        nume = "Rares";
        prenume = "Farcas";
        zi = 12;
        luna = 04;
        an = 2245;
        ora = 18;
        min = 56;
        PmAm = "PM";
        Luni = true;
        Marti = false;

        System.out.println(Hi);
        System.out.println(varsta);
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println("Care e data de astazi?");
        System.out.print(zi);
        System.out.print("/");
        System.out.print(luna);
        System.out.print("/");
        System.out.println(an);
        System.out.print(ora);
        System.out.print(":");
        System.out.print(min);
        System.out.print(" ");
        System.out.println(PmAm);
        System.out.print("Astazi este Luni ");
        System.out.println(Luni);
        System.out.print("Astazi este Marti ");
        System.out.println(Marti);
        operatie();
        SumaDouble(12.5, 2.1, 6.61, 5, 8);
        CaractM("Luni", 'M');
        HelloH("Hello", 'H');
        AnaAre();
        System.out.println(" Poti pleca acasa dupa ce iti verific munca!");
        NumereFaine(1,10,2);
        DA();
        DA2("5");
        Div3(15);
        Div5(15);
        Pare(0 );
        Max10(1, 2);
        Produs5();
        Bucatarie();
        Suma5nr();

    }

    public void operatie() {
        Integer a;
        a = 3 * 4;

        Integer b;

        b = a + 2 - 3;

        Double c;

        c = b.doubleValue() / 3;

        System.out.println("Rezultatul corect al operatiei [2+(3*4)-3]/3  este " + c);


    }


    public void SumaDouble(Double a, Double b, Double c, Integer d, Integer e) {
        Double x;
        x = a + b + c;

        Integer f;
        f = d * e;
        System.out.println(" Suma numerelor " + a + " " + b + " " + c + " este = " + x);
        System.out.println(" Produsul numerelor " + d + " si " + e + " este " + f);
        System.out.println("Stiu ca am calculat corect, rezultatele corecte sunt " + String.valueOf(x) + " si " + String.valueOf(f) + "!");

    }

    public void CaractM(String a, Character b) {
        String c = a + String.valueOf(b);
        System.out.println(c);
    }

    public void HelloH(String a, Character b) {
        String c = String.valueOf(b) + a;
        System.out.println(c);
    }

    /*
    public void AAA(){
        String Ana = "Ana";
        Ana=Ana.substring(0,Ana.length()-1);
        System.out.println(Ana.substring(1));
    }

     */

    public void AnaAre(){

        System.out.println("Ana"+'Z'+ " are" +'Z'+ " mere" + 'Z'+ ", pere"+'Z'+ ", prune"+'Z'+".");
    }

    public void NumereFaine(Integer a, Integer b, Integer c){
        if (a == b){
            System.out.println("Valorile nu sunt bune!");
            if (b == c){
                System.out.println("Valorile nu sunt bune!");
            }
        }
        else {
            if ( a + b > c){
                System.out.println("Suma dintre " +a+ " si "+b+ " este mai mare ca " +c+ "\n " + a + " + " + b + " = "+ String.valueOf(a+b));
            }
            else {
            System.out.println(" Suma dintre "+a+ " si "+b+ " NU e mai mare ca "+c);
        }
    }
    }


    public void DA(){

        System.out.println("DA DA DA DA DA");
    }

    public void DA2(String dada){
    switch (dada){
        case "5":
            System.out.print("DA ");
        case "da2":
            System.out.print("DA ");
        case "da3":
            System.out.print("DA ");
        case "da4":
            System.out.print("DA ");
        case "da5":
            System.out.println("DA");
            break;

    }

    }

    public void Div3(Integer max){
        Integer index = 0;
        System.out.println("Primele 5 numere divizibile cu 3 sunt: ");
        while (index<max+1){
            index++;
            if (index % 3 == 0){
                System.out.println(index);
            }
        }
        }

        public void Div5(Integer max){
        Integer index = 0;
            System.out.println("Primele 3 numere divizibile cu 5 sunt: ");
            while (index<max+1){
                index++;
                if (index % 5 == 0){
                    System.out.println(index);
                }
            }
        }

        public void Pare(Integer index){
        while (index < 8){
            index++;
            if (index % 2 == 0){
                System.out.println(index);

            }
            }
        }
        public void Max10(Integer a, Integer b){
        while ( a + b < 10){
            a++;
        if (a + b == 10){
            System.out.println(" Numarul a este: " +a);
            System.out.println(" Numarul b este: "+b);
        }

        }
        }

        public void Produs5(){
            Integer a = 0;
            Integer b = 1;
        while (a * b < 5){
            a++;
            if (a*b==5){
                System.out.println("a este: "+a);
                System.out.println("b este: "+b);
            }

        }
        }

        public void Bucatarie(){

            List<String> Condimente = new ArrayList<>();
            Condimente.add("piper");
            Condimente.add("sare");
            Condimente.add("boia");
            Condimente.add("eros pisto");
            List<String> Ustensile = new ArrayList<>();
            Ustensile.add("furculita");
            Ustensile.add("cutit");
            Ustensile.add("blid");
            Ustensile.add("Culpator");
            List<String> Mancare = new ArrayList<>();
            Mancare.add("Oua umplute");
            Mancare.add("Paste");
            Mancare.add("Cartofi pai");
            Mancare.add("Popricas");

            HashMap<String,List<String>> Bucatarie = new HashMap <>();
            Bucatarie.put("Condimente", Condimente);
            Bucatarie.put("Ustensile", Ustensile);
            Bucatarie.put("Mancare", Mancare);

            for (String cheie: Bucatarie.keySet()){
                System.out.println("In bucatarie gasim " + cheie);
                System.out.println("Mama are in bucatarie "+Bucatarie.get(cheie));
            }

        }
        public void Suma5nr(){
        Integer suma = 0;
        for (Integer a = 1; a<=5; a++){
            suma = suma+a;
            System.out.println(suma);
            }
        }
        }





