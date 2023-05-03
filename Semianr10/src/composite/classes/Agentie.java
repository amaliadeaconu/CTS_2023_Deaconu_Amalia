package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IBanca{

    private String denumire;
    private List<IBanca> listaUnitati;

    public Agentie(String denumire) {
        this.denumire = denumire;
        this.listaUnitati = new ArrayList<>();
        }


    @Override
    public void descriere() {
        System.out.println("Aceasta unitate are denumirea "+ denumire);
        for(var a : listaUnitati){
            a.descriere();
        }
    }

    @Override
    public void adaugaNod(IBanca a) {
        listaUnitati.add(a);
    }

    @Override
    public void stergeNod(IBanca a) {
        listaUnitati.remove(a);
    }

    @Override
    public void getNod(int index) {
        listaUnitati.get(index);
    }
}
