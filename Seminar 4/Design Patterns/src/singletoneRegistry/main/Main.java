package singletoneRegistry.main;

import singletoneRegistry.InstitutiePublica;

public class Main {
    public static void main(String[] args) {

        InstitutiePublica politie = InstitutiePublica.getInstance("POLITIE");
        InstitutiePublica ploitieLocala = InstitutiePublica.getInstance("POLITIE");
        InstitutiePublica drpciv = InstitutiePublica.getInstance("DRPCIV");

        politie.setNrAngajati(20);
        ploitieLocala.setNrAngajati(3);

        System.out.println(politie);
        System.out.println(ploitieLocala);
    }
}
