package Structuri;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Matematica {


    // STRUCTURI = ALTERNATIVE
              //  = REPETITIVE

    //ALTERNATIVE =    if....then                   if....then
    //                      else

    //            =      Switch.....
    //                          case 1
    //                          case 2...


    @Test
    public void MatematicaTest(){
        NumarMaiMareCa0();
        NumarPar();
        NumarMaiMareCaOriceNr(10,5);
        NumarMaiMareCaOriceNr(0, -5);
        NumarMaiMareCaOriceNr(1,151);
        VerificareParitate(41);
        VerificareParitate(12);
        ImparDivizibil(5);
        ImparDivizibil(9);
        ImparDivizibil(10);
        ImparDivizibil(16);
        ImparDivizibilv2(5);
        ImparDivizibilv2(9);
        ImparDivizibilv2(10);
        ImparDivizibilv2(16);
        PrinteazaZiua("Marti");

    }
    // Verificam daca un numar e mai mare ca 0.
    public void NumarMaiMareCa0(){
        Integer a = 1;
        if (a>=0) {
            System.out.println(" Numarul 1 e mai mare sau egal cu 0");
        }
        else {
            System.out.println(" 1 e mai mic decat 0");
        }
    }

    // Verificam daca un nr este par
    // Daca vreau CATUL la impartire folosesc /
    // Daca vreau RESTUL la impartire folosesc %

    public void NumarPar(){
         Integer b = 21;
        if (b%2==0) {
            System.out.println( " Numarul este par. ");
        }
        else {
            System.out.println(" Numarul NU este par.");
        }
    }
/*         Test

    public void Pali() {
        Integer p = 121;
        if (p % 10 == 1) {
            System.out.println(p);
        } else System.out.println("nu bun");

    }         Test polindrom
*/
    public void NumarMaiMareCaOriceNr(Integer Numar, Integer Comparator){

        if (Numar>=Comparator) {
            System.out.println(" Numarul " + Numar + " e mai mare sau egal cu "+ Comparator);
        }
        else {
                    System.out.println(" Numarul " + Numar + "  e mai mic decat " + Comparator);
        }
    }

    public void VerificareParitate(Integer Num){
        if (Num%2==0) {
            System.out.println( " Numarul "+Num+" este par. ");
        }
        else {
            System.out.println(" Numarul "+Num+" NU este par.");
        }
    }

    // VERIFIC DACA UN NUMAR ESTE IMPAR SI DIVIZIBIL CU 5

    public void ImparDivizibil(Integer nr){
        if (nr%2==1){
            System.out.println(" Numarul " + nr + " este impar");
        }
        else {
            System.out.println(" Numarul " + nr + " este par!");
        }
        if (nr%5==0){
            System.out.println(" Numarul " + nr + " e divizibil cu 5!");
        }
        else {
            System.out.println(" Numarul " + nr + " nu e divizibil cu 5!");
        }


    }

    public void ImparDivizibilv2(Integer Numar) {
        if(Numar % 2 == 1){    // AICI INTRA PE IMPARITATE
            if (Numar % 5 == 0) {          // divizibilitate
                System.out.println( Numar + " impar div cu 5");
            }
            else {
                System.out.println(Numar + " impar dar nu div cu 5");
            }
        }
        else {        // AICI INTRA PE PARITATE
            if (Numar % 5 == 0){      // divizibilitate
                System.out.println(Numar+" E PAR SI DIV CU 5");
            }
            else {
                System.out.println(Numar+ " E PAR DAR NU DIV CU 5.");
            }
        }
    }


    // SWITCH CASE PE ZILELE SAPTAMANII

    public void PrinteazaZiua(String ZiCurenta){
        switch (ZiCurenta){
            case "Duminica":
                System.out.println("Astazi este Duminica!");
                break;
            case "Luni":
                System.out.println("Astazi este Luni!");
                break;
            case "Marti":
                System.out.println("Astazi este Marti!");
                break;
            case "Miercuri":
                System.out.println("Astazi este Miercuri!");
                break;
            case "Joi":
                System.out.println("Astazi e joi");
                break;
            case "Vineri":
                System.out.println("Azi e vineri");
                break;
            case "Sambata":
                System.out.println("Azi e Sambata");
                break;
        }
    }
/*
    public void SwitchCuNr(Integer index){
        List<Integer> Pare = new ArrayList<>();
        Pare.add(2);
        Pare.add(4);
        Pare.add(6);
        Pare.add(8);
        List<Integer> Impare = new ArrayList<>();
        Impare.add(1);
        Impare.add(3);
        Impare.add(5);
        Impare.add(7);
        Impare.add(9);

        switch (index){
            case List:
                System.out.println("index par mai mic ca 10");
                break;
            case Impare:
                System.out.println("index impar mai mic ca 10");
                break;
            case 0:
                System.out.println("index e 0");
                break;
            }

        }

 */
    }




