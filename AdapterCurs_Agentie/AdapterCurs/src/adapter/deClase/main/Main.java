package adapter.deClase.main;

import adapter.deClase.classes.*;

public class Main {
    public static void inchiriazaMasina(PachetTuristic pachetTuristic){
        pachetTuristic.descriere();
    }

    public static void main(String[] args) {
        PachetTuristic pachetCazare =  new PachetCazare();
        inchiriazaMasina(pachetCazare);
        Masina masina = new Masina("Opel",2000);
        AdapterClase adapterClase = new AdapterClase(masina);
        adapterClase.descriere();

    }
}
