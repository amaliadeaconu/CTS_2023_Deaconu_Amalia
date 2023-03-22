package singletone.classes;

//eager initialization
public class BazaDeDate {

    private int dimDate;
    private String denumire;
    private int nrTabele;

    public static BazaDeDate instanta=new BazaDeDate(3,"Magazin",4);

    private BazaDeDate(int dimDate,String denumire,int nrTabele){
        this.denumire=denumire;
        this.dimDate=dimDate;
        this.nrTabele=nrTabele;
    }

    public void setDimDate(int dimDate) {
        this.dimDate = dimDate;
    }

    public static BazaDeDate getInstance(){
        return BazaDeDate.instanta;
    }

    @Override
    public String toString() {
        var buffer = new StringBuffer();
        buffer.append("Denumire: ").append(denumire).append("\n");
        buffer.append("dim: ").append(dimDate).append("\n");
        buffer.append("Nr tabele: ").append(nrTabele);
        return buffer.toString();
    }


}
