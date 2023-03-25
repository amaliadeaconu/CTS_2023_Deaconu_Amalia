package cts.ase.ro.simplefactory.clase;

public class AgentieFactory {

    public PachetTuristic createInstance(TipPachet tip) throws Exception {
        switch(tip){
            case pachetCazare:
                 return new PachetCazare();
            case pachetTransport:
                return new PachetTransport();
            case pachetCazareTransport:
                return new PachetCazareSiTransport();
            default:
                throw new Exception("Tipul primit nu este ok");
        }
    }
}
