package TEMA.OOP;

import org.testng.annotations.Test;

public class FotbalTest {

    @Test
    public void atacantfotbalTest(){

        Atacant Messi = new Atacant("Messi", 10, "PSG");
        Messi.InfoAtacant();

    }

}
