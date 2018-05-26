package sample;

import java.util.ArrayList;

public class ProduktWazony extends Produkt {
    private Integer mnoznikGramy;

    public ProduktWazony(String nazwa, Integer kalorie, Double bialko, Double weglowodany, Double tluszcz,
                         ArrayList<RodzajDiety> diety, ArrayList<RodzajPosilku> rodzajePosilku, Double minimalnaIlosc,
                         Double maksymalnaIlosc, Integer mnoznikGramy) {
        super(nazwa, kalorie, bialko, weglowodany, tluszcz, diety, rodzajePosilku, minimalnaIlosc, maksymalnaIlosc);
        this.mnoznikGramy = mnoznikGramy;
    }

    public Integer getMnoznikGramy() {
        return mnoznikGramy;
    }

    public void setMnoznikGramy(Integer mnoznikGramy) {
        this.mnoznikGramy = mnoznikGramy;
    }
}
