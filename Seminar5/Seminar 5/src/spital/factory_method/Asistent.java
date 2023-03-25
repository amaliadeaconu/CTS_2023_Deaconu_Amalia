package spital.factory_method;

import spital.simple_factory.PersonalSpital;

public class Asistent extends PersonalSpital {


    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume()+ "este un asistent");
    }
}