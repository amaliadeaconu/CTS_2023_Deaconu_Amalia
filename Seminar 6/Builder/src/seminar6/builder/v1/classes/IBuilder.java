package seminar6.builder.v1.classes;

public interface IBuilder {
    ContBancar build();

    public ContBuilder setPrimesteSalriu(boolean primesteSalriu);

    public ContBuilder setCardAtasat(boolean cardAtasat) ;

    public ContBuilder setInternetBanking(boolean internetBanking);
}
