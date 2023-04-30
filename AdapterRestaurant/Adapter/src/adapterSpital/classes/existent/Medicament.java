package adapterSpital.classes.existent;

public class Medicament implements IMedicament{
    private String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void cumparaMedicament(String nume,String denumireMedicament) {
        System.out.println(nume + " a cumparat medicamentul "+denumireMedicament);
    }
}
