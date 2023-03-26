package builder.v1.classes;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzica;
    private boolean genMuzica;

    public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzica, boolean genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzica = muzica;
        this.genMuzica = genMuzica;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoare=" + bauturaRacoritoare +
                ", muzica=" + muzica +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
