package spital.factory_method;

public abstract class Personal {
    private String nume;

    public String getNume() {
        return nume;
    }

    public Personal(String nume) {
        this.nume = nume;
    }

    public abstract void  afiseazaDescriere();

}
