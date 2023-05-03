package flyweight.classes;

public class Banca {
    private String nume;

    public Banca(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
