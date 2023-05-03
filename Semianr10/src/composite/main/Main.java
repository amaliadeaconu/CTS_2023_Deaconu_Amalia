package composite.main;

import composite.classes.Agentie;
import composite.classes.Filiala;
import composite.classes.IBanca;

public class Main {
    public static void main(String[] args) {
        Filiala filiala1 = new Filiala("ING Sector 6",4);
        Filiala filiala2 = new Filiala("ING Gorjului",3);
        IBanca agentie = new Agentie("ING ");
        agentie.adaugaNod(filiala1);
        agentie.adaugaNod(filiala2);
        agentie.descriere();




    }
}