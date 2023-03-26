package builder.v1.classes;

public class RezervareBuilder implements Builder{
    private Rezervare rezervare;
    public RezervareBuilder(){
        rezervare = new Rezervare(false,false,false,false,false);
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa){
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare){
        rezervare.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }

    public RezervareBuilder setMuzica(boolean muzica){
        rezervare.setMuzica(muzica);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
