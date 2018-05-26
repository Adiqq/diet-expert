package sample;

import java.util.ArrayList;

public class Posilek {
    private RodzajPosilku rodzaj;
    private ArrayList<Produkt> produkty;

    public Posilek(RodzajPosilku rodzaj, ArrayList<Produkt> produkty) {
        this.rodzaj = rodzaj;
        this.produkty = produkty;
    }

    public RodzajPosilku getNazwa() {
        return rodzaj;
    }

    public void setNazwa(RodzajPosilku rodzaj) {
        this.rodzaj = rodzaj;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
}
