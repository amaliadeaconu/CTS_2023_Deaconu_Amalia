package adapter.deObiecte.main;

import adapter.deObiecte.classes.AdapterObiecte;
import adapter.deObiecte.classes.PachetCazare;
import adapter.deObiecte.classes.PachetTuristic;
import adapter.deObiecte.classes.aditional.Masina;
import adapter.deObiecte.classes.aditional.MasinaInchiriata;

public class Main {
    //simulam aplicatia printr-o functie

    private static void inchiriazaMasina(PachetTuristic pachetTuristic){
        pachetTuristic.descriere();
    }
    public static void main(String[] args) {
    PachetTuristic pachetCazare = new PachetCazare();
    inchiriazaMasina(pachetCazare);

    Masina masina = new Masina("BMW",2000);
    MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
    PachetTuristic adapterObiecte = new AdapterObiecte(masinaInchiriata);
    inchiriazaMasina(adapterObiecte);
    }
}
