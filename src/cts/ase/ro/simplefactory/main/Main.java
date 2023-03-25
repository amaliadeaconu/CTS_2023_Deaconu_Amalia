package cts.ase.ro.simplefactory.main;

import cts.ase.ro.simplefactory.clase.AgentieFactory;
import cts.ase.ro.simplefactory.clase.PachetTuristic;
import cts.ase.ro.simplefactory.clase.TipPachet;

public class Main {
    public static void main(String[] args) {

        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        try{
            pachetTuristic = agentieFactory.createInstance(TipPachet.pachetCazare);
        }catch (Exception e){
            e.printStackTrace();
        }
        pachetTuristic.descriere();
    }
}