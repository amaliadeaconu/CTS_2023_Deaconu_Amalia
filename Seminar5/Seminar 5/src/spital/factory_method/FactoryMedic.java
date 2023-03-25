package spital.factory_method;



public class FactoryMedic implements Factory {
    @Override
    public Asistent createPersonaal(String nume) {
        return new Medic(nume);
    }
}
