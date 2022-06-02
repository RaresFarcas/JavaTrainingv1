package ProtectedControl;

import AccessControl.AccessControl;
import com.beust.ah.A;

public class Carte {
    public void bbb(){
        AccessControl carticica = new AccessControl();
        carticica.metodaPublica();

        // metoda protected nu mai e vizibila
    }
}
