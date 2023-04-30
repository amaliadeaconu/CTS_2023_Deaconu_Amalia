package adapter.deObiecte.classes.aditional;

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

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
