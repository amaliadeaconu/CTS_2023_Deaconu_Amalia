package adapterSpital.classes.aditional;

public class MedicamentReteta implements IMedicamentReteta {
    @Override
    public void achizitioneazaMedicament(String numeClient,String numeMedicament) {
        printeazaReteta(numeMedicament);
        System.out.println(numeClient+" a achizitionat reteta");
    }

    @Override
    public void printeazaReteta(String numeMedicament) {
        System.out.println("Medicul a recomandat medicamentul : "+numeMedicament);
    }
}
