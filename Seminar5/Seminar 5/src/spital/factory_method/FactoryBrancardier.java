package spital.factory_method;




public class FactoryBrancardier implements Factory {

    @Override
    public Asistent createPersonaal(String nume) {
        return new Brancardier(nume);
    }
}
