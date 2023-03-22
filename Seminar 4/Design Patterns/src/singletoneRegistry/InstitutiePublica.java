package singletoneRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    int nrAngajati;

    private static Map<String,InstitutiePublica> registruInstitutie = new HashMap<>();

    private InstitutiePublica(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public synchronized static InstitutiePublica getInstance(String denumire){
        if(registruInstitutie.containsKey(denumire)){
            return registruInstitutie.get(denumire);
        }
        else {
            InstitutiePublica institutiePublica = new InstitutiePublica(denumire, 0);
            registruInstitutie.put(institutiePublica.denumire,institutiePublica);
            return institutiePublica;
        }
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
