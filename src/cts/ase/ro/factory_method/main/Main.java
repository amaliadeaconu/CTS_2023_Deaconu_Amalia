package cts.ase.ro.factory_method.main;

import cts.ase.ro.factory_method.classes.Factory;
import cts.ase.ro.factory_method.classes.FactoryPachetCazare;
import cts.ase.ro.factory_method.classes.PachetTuristic;

public class Main {
    public static void afisare(Factory fabrica){
        PachetTuristic pachetTuristic = fabrica.createPachet();
        pachetTuristic.descriere();
    }

    public static void main(String[] args) {
        afisare(new FactoryPachetCazare());
    }
}
