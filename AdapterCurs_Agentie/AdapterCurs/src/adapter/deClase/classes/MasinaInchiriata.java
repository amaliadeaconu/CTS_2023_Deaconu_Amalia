package adapter.deClase.classes;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("A fost inchiriata masinaa "+masina.getModel());
    }

    @Override
    public String toString() {
        return "MasinaInchiriata{" +
                "masina=" + masina +
                '}';
    }
}
