package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Obiect {

    @Test
    public void Obiect(){
       // Array = toate elementele sunt de acelasi fel
       //List = nu imi bat capu cu pozitii
       //Hashmap
        PrintNumeArray();
        PrintNumeList();
        PrintValHashmap();
        TariOrase();
    }

    //PRINTAM TOATE VALORILE DINTR-UN ARRAY
    public void PrintNumeArray(){

        String[] Sir = new String[4];
        Sir[0]="ANA";
        Sir[1]="ALEX";
        Sir[2]="BOGDAN";
        Sir[3]="Rares";

        for (Integer index=0; index <Sir.length; index++){
            System.out.println(Sir[index]);
        }
    }

    public void PrintNumeList(){
        List<String> Lista= new ArrayList<>();
        Lista.add("ANA");
        Lista.add("ALEX");
        Lista.add("BOGDAN");
        Lista.add("Rares");
        for (Integer index=0; index<Lista.size(); index++){
            System.out.println(Lista.get(index));
        }
    }

    // Printeaza valori diferite dintr-o multime
    public void PrintValHashmap(){
        HashMap<String,String> HHBB= new HashMap<>();
        HHBB.put("fruct","mar");
        HHBB.put("haina","pantaloni");
        HHBB.put("leguma","cartof");
        for (String key: HHBB.keySet()){
            System.out.println("Cheia este "+ key );
            System.out.println("Valoarea este " + HHBB.get(key));
        }
    }

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("DEJ");
        OraseRomania.add("GHERLA");
        OraseRomania.add("CLUJ");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("ROMA");
        OraseItalia.add("TORINO");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("BARCELONA");
        OraseSpania.add("VALENCIA");
        OraseSpania.add("MALAGA");
        OraseSpania.add("madrid");

        HashMap<String,List<String>> HMAP = new HashMap<>();
        HMAP.put("ROMANIA", OraseRomania);
        HMAP.put("ITALIA", OraseItalia);
        HMAP.put("SPANIA", OraseSpania);

        for (String key: HMAP.keySet()){
            System.out.println("Tara este "+ key );
            System.out.println("Orasele sunt " + HMAP.get(key));
        }
    }

}
