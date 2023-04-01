package seminar6.builder.v1.classes;

public class ContBuilder implements IBuilder{

    private ContBancar contBancar;

    public ContBuilder(){
        contBancar    = new ContBancar(false,false,false);
    }

    public ContBuilder setPrimesteSalriu(boolean primesteSalriu) {
        contBancar.setPrimesteSalriu(primesteSalriu);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        contBancar.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build() {
        return contBancar;
    }
}
