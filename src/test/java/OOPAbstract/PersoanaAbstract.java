package OOPAbstract;

public abstract class PersoanaAbstract {

    // Abstractizare = concept pe baza caruia definim comportamentul unei clase
    // recunoastem o clasa abstracta dupa cuvantul <abstract>
    // Clasa abstracta poate sau nu sa contina metode abstracte
    // O clasa poate extinde o clasa abstracta
    // O clasa abstracta poate sa implementeze o interfata
    // Poti sa mostenesti o singura clasa abstracta
    // Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
    // Clasa abstracta poate sa contina un constructor => nu poti crea obiecte

    abstract void Munceste();
    abstract void PrimesteSalar();
    abstract void Invata();
    abstract void Primestebursa();
    abstract void Someaza();
    abstract void PrimesteAjutor();


    public void VerificaVarsta(Integer varsta){
        if (varsta >= 18){
            System.out.println("Persoana e majora");
        }
        else{
            System.out.println("Persoana e minora");
        }
    }
}
