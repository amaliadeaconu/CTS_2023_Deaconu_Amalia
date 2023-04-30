package adapter.deClase.classes;

public class Masina {
    private String model;
    private int capacitate;

    public Masina(String model, int capacitate) {
        this.model = model;
        this.capacitate = capacitate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
