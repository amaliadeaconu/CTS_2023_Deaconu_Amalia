package adapterSpital.classes.existent;

import adapterSpital.classes.aditional.MedicamentReteta;

public class AdapterObiecte implements IMedicament{
    private MedicamentReteta medicamentReteta;

    public AdapterObiecte(MedicamentReteta medicamentReteta) {
        this.medicamentReteta = medicamentReteta;
    }

    @Override
    public void cumparaMedicament(String nume,String denumireMedicamnet) {
        medicamentReteta.achizitioneazaMedicament(nume,denumireMedicamnet);
    }
}
