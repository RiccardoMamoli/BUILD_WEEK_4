package riccardomamoli.entities;

import java.util.List;

public class Tram extends Mezzo {
    public Tram(int capienza, StatoMezzo statoAttuale, List<Tratta> tratte, List<TrattaPercorsa> trattePercorse, List<StatusMezzo> stati) {
        super(capienza, statoAttuale, trattePercorse, stati);
    }

    @Override
    public String toString() {
        return "Tram{}";
    }
}