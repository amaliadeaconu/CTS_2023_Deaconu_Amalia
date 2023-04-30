package adapterResturant.Classes.existent;

public class Bucatarie implements IBucatarie{
    private String numeBucatar;

    public Bucatarie(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double suma) {
        System.out.println("Nota mesei este de "+suma);
    }
}
