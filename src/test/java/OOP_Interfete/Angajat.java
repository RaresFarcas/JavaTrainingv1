package OOP_Interfete;

public interface Angajat {

    // Interfata contine doar metode abstracte (se defineste tipul metodei fara sa contina BODY adica acolade)
    // Interfata se recunoaste dupa cuvantul interface
    // poate sa contina variabile sau nu
    // Interfata nu se mosteneste, ci se implementeaza
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele interfete
    // O clasa poate sa implementeze mai multe interfete
    // O clasa abstracta poate sa implementeze o interfata
    // O interfata nu contine un constructor => nu putem declara obiecte

    void Munceste();            // Asta e metoda abstracta
    void PrimesteSalar();

}
