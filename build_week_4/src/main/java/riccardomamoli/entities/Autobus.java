package riccardomamoli.entities;

import java.util.List;

public class Autobus extends Mezzo {

    public Autobus(int capienza, StatoMezzo statoAttuale, List<TrattaPercorsa> trattePercorse, List<StatusMezzo> stati) {
        super(capienza, statoAttuale, trattePercorse, stati);
    }

    @Override
    public String toString() {
        return "Autobus{}";
    }
}