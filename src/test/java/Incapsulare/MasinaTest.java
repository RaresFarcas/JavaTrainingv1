package Incapsulare;

import org.junit.Test;

public class MasinaTest {

    @Test
    public void incapsulareTest(){
        Audi audiA6 = new Audi("audi", "A6", 55000);
        System.out.println(audiA6.getPret());
        // audiA6.Pret=1500;
        //System.out.println(audiA6.Pret);

        audiA6.setModel("A3");
        System.out.println(audiA6.getModel());
        audiA6.CumparaMasina();
        audiA6.InfoAudi();

        Jaguar jaguarNou = new Jaguar("Jaguar", "XF", 77777);
        jaguarNou.CumparaMasina();
    }


}
