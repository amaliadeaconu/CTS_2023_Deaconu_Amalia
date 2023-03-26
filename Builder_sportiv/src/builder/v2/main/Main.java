package builder.v2.main;

import builder.v2.classes.Rezervare;
import builder.v2.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rb = new RezervareBuilder();
        rb.setBauturaRacoritoare(true).setMancareInclusa(true);
        Rezervare rez1 = rb.build();
        rb.setMuzica(true);
        Rezervare rez2 = rb.build();
        System.out.println(rez1);
        System.out.println(rez2);

    }


}
