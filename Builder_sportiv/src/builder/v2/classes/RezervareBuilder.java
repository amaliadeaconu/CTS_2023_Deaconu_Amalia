package builder.v2.classes;

public class RezervareBuilder implements Builder{
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzica;
    private boolean genMuzica;

    public RezervareBuilder() {
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public RezervareBuilder setMuzica(boolean muzica) {
        this.muzica = muzica;
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.mancareInclusa, this.scaunErgonomic, this.bauturaRacoritoare, this.muzica, this.genMuzica);

    }
}
