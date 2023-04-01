package seminar6.builder.v1.classes;

public class ContBancar {
   boolean primesteSalriu;
   boolean cardAtasat;
   boolean internetBanking;

    public ContBancar(boolean primesteSalriu, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalriu = primesteSalriu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public void setPrimesteSalriu(boolean primesteSalriu) {
        this.primesteSalriu = primesteSalriu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "primesteSalriu=" + primesteSalriu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}
