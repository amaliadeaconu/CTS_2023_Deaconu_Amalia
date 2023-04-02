package simple_factory.main;


import simple_factory.classes.Factory;
import simple_factory.classes.Supa;
import simple_factory.classes.TipSupa;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Supa supa1 = null;
        Supa supa2 = null;

        try {
            supa1 = factory.createSupa(TipSupa.SupaCiuperci, 20, 300);
            supa2 = factory.createSupa(TipSupa.SupaLegume, 40, 350);
            System.out.println(supa1.toString());
            System.out.println(supa2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

