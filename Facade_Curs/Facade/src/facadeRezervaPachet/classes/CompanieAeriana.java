package facadeRezervaPachet.classes;

public class CompanieAeriana {
    private String nume;

    public CompanieAeriana(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "CompanieAeriana{" +
                "nume='" + nume + '\'' +
                '}';
    }

    public Zbor rezervaBilet(String plecare, String destinatie){
        Zbor zbor = new Zbor(this,plecare,destinatie);
        return zbor;
    }

}
