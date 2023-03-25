package spital.simple_factory.main;

import spital.simple_factory.PersonalSpital;
import spital.simple_factory.SimpleFactory;
import spital.simple_factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        PersonalSpital personalSpital = simpleFactory.createPersonal(TipPersonal.Asistent,"Amalia");
        PersonalSpital personalSpital1 = simpleFactory.createPersonal(TipPersonal.Medic,"Andrei");
        PersonalSpital personalSpital2 = simpleFactory.createPersonal(TipPersonal.Brancardier,"Gigi");
        PersonalSpital personalSpital3 = simpleFactory.createPersonal(TipPersonal.Brancardier,"Vasile");
        PersonalSpital personalSpital4 = simpleFactory.createPersonal(TipPersonal.Anestezist,"Razvan",3);

        List<PersonalSpital> lista = new ArrayList<PersonalSpital>();
        lista.addAll(List.of(personalSpital,personalSpital1,personalSpital2,personalSpital3,personalSpital4));
        for(PersonalSpital p : lista){
            p.afiseazaDescriere();
        }




    }
}