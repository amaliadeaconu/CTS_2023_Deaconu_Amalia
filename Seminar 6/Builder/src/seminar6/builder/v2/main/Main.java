package seminar6.builder.v2.main;

import seminar6.builder.v2.classes.ContBancar;
import seminar6.builder.v2.classes.ContBuilder;

public class Main {

    public static void main(String[] args) {
        ContBuilder contBuilder = new ContBuilder();
        contBuilder.setCardAtasat(true);
        ContBancar contBancar = contBuilder.build();
        contBuilder.setInternetBanking(true);
        ContBancar contBancar1 = contBuilder.build();
        System.out.println(contBancar);
        System.out.println(contBancar1);

    }

}
