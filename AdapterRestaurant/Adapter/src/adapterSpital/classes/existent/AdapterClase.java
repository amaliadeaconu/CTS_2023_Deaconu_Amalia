package adapterSpital.classes.existent;

import adapterSpital.classes.aditional.MedicamentReteta;

public class AdapterClase  extends MedicamentReteta implements IMedicament{

    public AdapterClase() {
        super();
    }

    @Override
    public void cumparaMedicament(String numeClient, String denumireMedicament) {
            super.achizitioneazaMedicament(numeClient,denumireMedicament);
    }
}
