package spital.factory_method;

import spital.simple_factory.PersonalSpital;

public class Brancardier extends PersonalSpital {


    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume()+ "este un brancardier");
    }
}
