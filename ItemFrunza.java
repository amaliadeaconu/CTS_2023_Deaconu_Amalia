package cts.Composite.classes;

public class ItemFrunza implements IOptiuneMeniu{
    private String denumire;

    public ItemFrunza(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaOptiune(IOptiuneMeniu optiuneMeniu) {
        System.out.println("Acesta este un nod frunza!");
    }

    @Override
    public void stergereOptiune(IOptiuneMeniu optiuneMeniu) {
        System.out.println("Acesta este un nod frunza!");

    }

    @Override
    public void getOptiune(int index) {
        System.out.println("Acesta este un nod frunza!");

    }

    @Override
    public void descriere() {
        System.out.println(" Item: "+ denumire);
    }
}
