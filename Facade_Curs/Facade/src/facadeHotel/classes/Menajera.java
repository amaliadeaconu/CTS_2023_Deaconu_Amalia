package facadeHotel.classes;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> listaCamereCurate;

    public Menajera(){
        listaCamereCurate = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            listaCamereCurate.add(false);
        }
        for (int i = 6; i <11 ; i++) {
            listaCamereCurate.add(true);
        }
    }

    public boolean esteCameraCurata(int cod){
        return listaCamereCurate.contains(cod);
    }

    public boolean areProsoapeNoi(int cod){
        return listaCamereCurate.contains(cod);
    }
}
