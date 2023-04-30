package facadeRezervaPachet.classes;

public class Zbor {
    private CompanieAeriana companie;
    private String plecare;
    private String destinatie;

    public Zbor(CompanieAeriana companie, String plecare, String destinatie) {
        this.companie = companie;
        this.plecare = plecare;
        this.destinatie = destinatie;
    }

    public CompanieAeriana getCompanie() {
        return companie;
    }

    public void setCompanie(CompanieAeriana companie) {
        this.companie = companie;
    }

    public String getPlecare() {
        return plecare;
    }

    public void setPlecare(String plecare) {
        this.plecare = plecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        return "Zbor{" +
                "companie=" + companie +
                ", plecare='" + plecare + '\'' +
                ", destinatie='" + destinatie + '\'' +
                '}';
    }
}
