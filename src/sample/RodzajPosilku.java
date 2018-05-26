package sample;

import java.util.ArrayList;

public enum RodzajPosilku {
    Sniadanie,
    DrugieSniadanie,
    Obiad,
    Deser,
    Podwieczorek,
    Kolacja;

    public static ArrayList<RodzajPosilku> wszystkiePosilki(){
        ArrayList<RodzajPosilku> posilki = new ArrayList<>();
        posilki.add(Sniadanie);
        posilki.add(DrugieSniadanie);
        posilki.add(Obiad);
        posilki.add(Deser);
        posilki.add(Podwieczorek);
        posilki.add(Kolacja);

        return posilki;
    }
}
