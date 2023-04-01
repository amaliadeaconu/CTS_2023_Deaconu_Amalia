package seminar6.builder.v1.main;

import seminar6.builder.v1.classes.ContBancar;
import seminar6.builder.v1.classes.ContBuilder;
import seminar6.builder.v1.classes.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder cont = new ContBuilder();
        cont.setCardAtasat(true).setInternetBanking(true);
        ContBancar cont1 = cont.build();

        ContBancar cont2 = cont.setInternetBanking(true).build();

        System.out.println(cont1);
        System.out.println(cont2);
    }
}