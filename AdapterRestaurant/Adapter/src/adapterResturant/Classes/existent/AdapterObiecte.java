package adapterResturant.Classes.existent;

import adapterResturant.Classes.aditional.Bar;

public class AdapterObiecte implements IBucatarie{
   private Bar bar;

   public AdapterObiecte(Bar bar) {
      this.bar = bar;
   }

   @Override
   public void printeazaNota(double suma) {
      bar.printeazaNotaBauturi(suma);
   }
}
