package adapterResturant.Classes.existent;

import adapterResturant.Classes.aditional.Bar;

public class AdapterClase extends Bar implements IBucatarie{

    public AdapterClase(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double suma) {
     super.printeazaNotaBauturi(suma);
    }
}
