package composite.classes;

public class Filiala implements IBanca{
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta unitate se numeste : "+nume+" si are "+nrAngajati+" angajati");
    }

    @Override
    public void adaugaNod(IBanca a) {
        throw new RuntimeException("Nu este implementata");
    }

    @Override
    public void stergeNod(IBanca a) {
        throw new RuntimeException("Nu este implementata");
    }

    @Override
    public void getNod(int index) {
        throw new RuntimeException("Nu este implementata");
    }
}
