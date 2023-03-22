package singletone.classes.main;

import singletone.classes.BazaDeDate;
import singletone.classes.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstance(2,2043);
        Secretariat secretariat2 = Secretariat.getInstance(5,3012);

        System.out.println(secretariat1);
        System.out.println(secretariat2);

        BazaDeDate baza1 = BazaDeDate.getInstance();
        BazaDeDate baza2 = BazaDeDate.getInstance();

        baza1.setDimDate(9);
        baza2.setDimDate(8);

        System.out.println(baza1);
        System.out.println(baza2);

    }
}