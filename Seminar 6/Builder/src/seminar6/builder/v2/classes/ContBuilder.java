package seminar6.builder.v2.classes;

public class ContBuilder implements IBuilder{

    boolean primesteSalriu;
    boolean cardAtasat;
    boolean internetBanking;

    public ContBuilder() {
    }

    public ContBuilder setPrimesteSalriu(boolean primesteSalriu) {
        this.primesteSalriu = primesteSalriu;
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }


    @Override
    public ContBancar build() {
        return new ContBancar(this.primesteSalriu,this.cardAtasat,this.internetBanking);
    }
}
