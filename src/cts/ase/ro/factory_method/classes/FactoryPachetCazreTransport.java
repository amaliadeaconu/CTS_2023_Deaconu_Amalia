package cts.ase.ro.factory_method.classes;

public class FactoryPachetCazreTransport implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazareTransport();
    }
}
