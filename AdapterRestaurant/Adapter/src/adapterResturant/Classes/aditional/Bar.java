package adapterResturant.Classes.aditional;

public class Bar implements IBar{
    private String denumire;

    public Bar(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void printeazaNotaBauturi(double suma) {
        System.out.println("Nota pt bar este de "+suma);
    }
}
