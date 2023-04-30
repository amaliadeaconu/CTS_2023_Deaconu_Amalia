package adapterResturant.main;

import adapterResturant.Classes.aditional.Bar;
import adapterResturant.Classes.existent.AdapterClase;
import adapterResturant.Classes.existent.AdapterObiecte;
import adapterResturant.Classes.existent.Bucatarie;
import adapterResturant.Classes.existent.IBucatarie;

public class Main {

    public static void printeazaNota(IBucatarie bucatarie,double suma){
        bucatarie.printeazaNota(suma);
    }
    public static void main(String[] args) {
        IBucatarie bucatarie = new Bucatarie("Gigel");
        printeazaNota(bucatarie,30f);
        Bar bar = new Bar("Trattoria");
        //printeazaNota(bar,30f);
        AdapterObiecte adapterObiecte = new AdapterObiecte(bar);
        printeazaNota(adapterObiecte,40f);
        AdapterClase adapterClase = new AdapterClase("Funky");
        printeazaNota(adapterClase,50f);

    }
}