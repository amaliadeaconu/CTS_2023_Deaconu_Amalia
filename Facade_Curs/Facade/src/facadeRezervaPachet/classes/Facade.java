package facadeRezervaPachet.classes;

public class Facade {
    public void rezervaPachet(String orasPlecare,String orasDestinatie){
        CompanieAeriana cop = new CompanieAeriana("KLM");
        Zbor zborDus = cop.rezervaBilet(orasPlecare,orasDestinatie);
        Zbor zborIntors = cop.rezervaBilet(orasDestinatie,orasPlecare);

        Hotel hotel = new Hotel("Lake side");
        hotel.rezervaCamera(orasDestinatie);
    }
}
