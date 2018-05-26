package sample;

import java.util.ArrayList;

public class Dieta {
    private ArrayList<Posilek> posilki;

    public Dieta(ArrayList<Posilek> posilki) {
        this.posilki = posilki;
    }

    public ArrayList<Posilek> getPosilki() {
        return posilki;
    }

    public void setPosilki(ArrayList<Posilek> posilki) {
        this.posilki = posilki;
    }
}
