package spital.simple_factory;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume){
        switch (tipPersonal){
            case Medic: return new Medic(nume);
            case Asistent: return new Asistent(nume);
            case Brancardier:return  new Brancardier(nume);
            default: return null;
        }
    }
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int aniVechime){
        switch (tipPersonal){
            case Anestezist:return new Anestezist(nume,aniVechime);
            default: return createPersonal(tipPersonal,nume);
        }
    }

}
