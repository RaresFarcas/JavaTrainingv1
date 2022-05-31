package TEMA.OOP;

public class Atacant extends Fotbal{

    public Atacant(String jucator, Integer numar, String echipa) {
        super(jucator, numar, echipa);
    }
    public static void InfoAtacant(){
        System.out.println(getJucator());
        System.out.println(getNumar());
        System.out.println(getEchipa());
    }

}
