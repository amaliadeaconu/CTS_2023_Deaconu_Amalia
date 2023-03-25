package spital.factory_method;



public class FactoryAsistent implements Factory {
    @Override
    public Asistent createPersonaal(String nume) {
        return new Asistent(nume);
    }
}
