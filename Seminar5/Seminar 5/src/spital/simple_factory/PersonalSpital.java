package spital.simple_factory;

public abstract class PersonalSpital {
    private String nume;

    public String getNume() {
        return nume;
    }

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void  afiseazaDescriere();

}
