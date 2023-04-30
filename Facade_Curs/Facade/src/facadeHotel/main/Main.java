package facadeHotel.main;

import facadeHotel.classes.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println(facade.verificaDisponibilitate(2));
    }

}
