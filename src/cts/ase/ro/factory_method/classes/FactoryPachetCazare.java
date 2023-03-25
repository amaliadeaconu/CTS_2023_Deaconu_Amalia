package cts.ase.ro.factory_method.classes;

public class FactoryPachetCazare implements Factory{


    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
