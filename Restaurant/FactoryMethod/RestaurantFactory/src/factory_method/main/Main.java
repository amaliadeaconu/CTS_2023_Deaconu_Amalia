package factory_method.main;

import factory_method.classes.Factory;
import factory_method.classes.Supa;
import factory_method.classes.SupaLegume;
import factory_method.classes.SupaLegumeFactory;

public class Main {

    public static void afisare(Factory farbica){
        Supa supa = farbica.createSupa(20,300);
        System.out.println(supa.toString());
    }

    public static void main(String[] args) {
        afisare(new SupaLegumeFactory());
    }
}
