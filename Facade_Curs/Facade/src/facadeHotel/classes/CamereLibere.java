package facadeHotel.classes;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
    private List<Integer> camereLibere;

    public CamereLibere() {
        this.camereLibere = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            camereLibere.add(i);
        }
    }

    public boolean verificaCamereLibere(int codCamera){
        return camereLibere.contains(codCamera);
    }
}
