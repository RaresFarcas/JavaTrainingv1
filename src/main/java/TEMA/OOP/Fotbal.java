package TEMA.OOP;

import java.util.Set;

public class Fotbal {
    private static String jucator;
    private static Integer numar;
    public static String echipa;

    public Fotbal(String jucator, Integer numar, String echipa) {
        this.jucator = jucator;
        this.numar = numar;
        this.echipa = echipa;
    }

    public static String getJucator(){
        return jucator;
    }
    public static Integer getNumar(){

        return numar;
    }
    public static String getEchipa(){

        return echipa;
    }

    public void SetEchipa(String echipa){
        this.echipa = echipa;
    }

}
