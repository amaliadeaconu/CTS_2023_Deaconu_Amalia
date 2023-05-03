package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer,ICont> mapConturi;

    public FlyweightFactory() {
        this.mapConturi = new HashMap<>();
    }

    public ICont getCont(int cod){
        if(!mapConturi.containsKey(cod)){
            ICont cont = new Detinator(cod,"Ion","ion@gmail","07888","rasaritului 1");
            mapConturi.put(cod,cont);
            return cont;
        }
        return mapConturi.get(cod);
    }

}
