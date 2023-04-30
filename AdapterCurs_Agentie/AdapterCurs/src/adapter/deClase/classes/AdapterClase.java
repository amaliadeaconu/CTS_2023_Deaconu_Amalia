package adapter.deClase.classes;

import adapter.deClase.classes.MasinaInchiriata;

public class AdapterClase extends MasinaInchiriata implements PachetTuristic {
    public AdapterClase(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        super.inchiriazaMasina();
    }
}
