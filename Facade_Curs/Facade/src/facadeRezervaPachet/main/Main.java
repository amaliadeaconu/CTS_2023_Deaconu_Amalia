package facadeRezervaPachet.main;

import facadeRezervaPachet.classes.Facade;

public class Main {
    public static void main(String[] args) {
        //ce ar fi facut operatorul daca nu am avea fatada
//        Hotel hotel = new Hotel("Azora");
//        hotel.rezervaCamera("LA");
//        CompanieAeriana companie = new CompanieAeriana("KLM");
//        Zbor zbor = new Zbor(companie,"Buc","LA");

        Facade facade = new Facade();
        facade.rezervaPachet("Bucuresti","New York");

    }
}