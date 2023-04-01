package seminar6.prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContCloneable{
   private String detinator;
   private int nrFileDosar;
   private Map<String,Integer> documente;

    public ContBancar(String detinator, int nrFileDosar, Map<String, Integer> documente) {
        int suma = 0;
        for (Integer file : documente.values()) {
            suma += file;
        }
        if (suma == nrFileDosar) {
            this.detinator = detinator;
            this.nrFileDosar = nrFileDosar;
            this.documente = documente;
        } else {
            throw new IllegalArgumentException("Nr inorect");
        }
    }

    private ContBancar(){
        this.documente = null;
    }



    @Override
    public IContCloneable copiaza() {
        ContBancar cont = new ContBancar();
        cont.detinator=detinator;
        cont.nrFileDosar = nrFileDosar;

        cont.documente = new HashMap<>();
        for(String key : this.documente.keySet()){
            cont.documente.put(key,this.documente.get(key));
        }
        return cont;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "detinator='" + detinator + '\'' +
                ", nrFileDosar=" + nrFileDosar +
                ", documente=" + documente +
                '}';
    }
}
