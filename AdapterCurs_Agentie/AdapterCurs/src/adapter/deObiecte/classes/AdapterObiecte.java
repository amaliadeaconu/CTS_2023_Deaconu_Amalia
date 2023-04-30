package adapter.deObiecte.classes;

import adapter.deObiecte.classes.aditional.Masina;
import adapter.deObiecte.classes.aditional.MasinaInchiriata;

import java.sql.SQLOutput;

public class AdapterObiecte implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata ;

    public AdapterObiecte(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descriere() {
        this.masinaInchiriata.inchiriazaMasina();
    }
}
