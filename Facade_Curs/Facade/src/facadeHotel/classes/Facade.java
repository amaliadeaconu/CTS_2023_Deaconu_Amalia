package facadeHotel.classes;

public class Facade {
    public static String verificaDisponibilitate(int codCamera) {
        CamereLibere camereLibere = new CamereLibere();
        if (camereLibere.verificaCamereLibere(codCamera)) {
            Menajera menajera = new Menajera();
            if (menajera.areProsoapeNoi(codCamera) && menajera.esteCameraCurata(codCamera))
            { return "Camera este gata";}
            else {
                return "Asteapta pana se face curat";
        }
        }

        else {return "Nu avem camere disponibile";}
    }
}
