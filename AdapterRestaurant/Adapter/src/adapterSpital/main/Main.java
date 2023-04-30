package adapterSpital.main;

import adapterSpital.classes.aditional.IMedicamentReteta;
import adapterSpital.classes.aditional.MedicamentReteta;
import adapterSpital.classes.existent.AdapterClase;
import adapterSpital.classes.existent.AdapterObiecte;
import adapterSpital.classes.existent.IMedicament;
import adapterSpital.classes.existent.Medicament;

public class Main {
    public static void achizitioneaza(IMedicament medicament, String numeClient, String denumireMedicament){
        medicament.cumparaMedicament(numeClient,denumireMedicament);
    }

    public static void main(String[] args) {
        IMedicament medicament = new Medicament("Algocalmin");
       achizitioneaza(medicament,"Ion","Algocalmin");
        MedicamentReteta medicamentReteta = new MedicamentReteta();
        //achizitioneaza(medicamentReteta,"Alin","Aspacardin");
        AdapterObiecte adapterObiecte = new AdapterObiecte(medicamentReteta);
        achizitioneaza(adapterObiecte,"Alin","Aspacardin");
        AdapterClase adapterClase = new AdapterClase();
        achizitioneaza(adapterClase,"Ana","Paracetamol");
    }
}
