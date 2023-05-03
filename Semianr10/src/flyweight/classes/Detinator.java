package flyweight.classes;

public class Detinator implements ICont{
    private int codClient;
    private String nume;
    private String email;
    private String nrTelefon;
    private String adresa;

    public Detinator(int codClient,String nume, String email, String nrTelefon, String adresa) {
        this.codClient = codClient;
        this.nume = nume;
        this.email = email;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Detinator{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void creeazaObiect(Banca banca) {
        System.out.println(this.toString()+banca.toString());
    }
}
