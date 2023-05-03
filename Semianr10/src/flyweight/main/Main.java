package flyweight.main;

import flyweight.classes.Banca;
import flyweight.classes.FlyweightFactory;
import flyweight.classes.ICont;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Banca banca1  = new Banca("ING");

        ICont cont1 = factory.getCont(1);
        cont1.creeazaObiect(banca1);

    }
}
