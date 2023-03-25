package spital.factory_method.main;

import spital.factory_method.FactoryAsistent;
import spital.factory_method.FactoryMedic;
import spital.factory_method.Personal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryAsistent factoryAsistent = new FactoryAsistent();
        factoryAsistent.createPersonaal("Andrei");
        factoryMedic.createPersonaal("Matei");

        List<Personal> lista = new ArrayList<>();


    }
}
