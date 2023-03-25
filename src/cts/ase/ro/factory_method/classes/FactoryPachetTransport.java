package cts.ase.ro.factory_method.classes;

public class FactoryPachetTransport implements Factory{

    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
