package singletone.classes;
//lazy initialization  - cea mai buna varianta
public class Secretariat {
   private int nrAngajati;
   private int nrBirou;

   private static Secretariat instanta=null;

   private Secretariat(int nrAngajati, int nrBirou){
       this.nrAngajati=nrAngajati;
       this.nrBirou=nrBirou;
   }

   public synchronized static Secretariat getInstance(int nrAngajati,int nrBirou){
       if(instanta==null){
           Secretariat.instanta = new Secretariat(nrAngajati,nrBirou);
       }
       return Secretariat.instanta;
   }

    @Override
    public String toString() {
        var buffer = new StringBuffer();
        buffer.append("Nr angajati: ").append(nrAngajati).append("\n");
        buffer.append("Nr birou: ").append(nrBirou);
        return buffer.toString();
    }
}
