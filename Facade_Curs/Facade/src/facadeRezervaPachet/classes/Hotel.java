package facadeRezervaPachet.classes;

public class Hotel {
    private String denumire;

    public Hotel(String denumire) {
        this.denumire = denumire;
    }

    public  void rezervaCamera(String oras){
        System.out.println("In hotelul: "+ this.denumire +" din orasul "+oras+"s a rezervat camera");
    }
}
