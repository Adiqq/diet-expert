package sample;

import java.util.ArrayList;

public class Produkt {
    private String nazwa;
    private Integer kalorie;
    private Double bialko;
    private Double weglowodany;
    private Double tluszcz;
    private ArrayList<RodzajDiety> diety;
    private ArrayList<RodzajPosilku> rodzajePosilku;
    private Double minimalnaIlosc;
    private Double maksymalnaIlosc;
    private Double ilosc;
    private ArrayList<String> tagi;

    public Produkt(String nazwa, Integer kalorie, Double bialko, Double weglowodany, Double tluszcz,
                   ArrayList<RodzajDiety> diety, ArrayList<RodzajPosilku> rodzajePosilku, Double minimalnaIlosc,
                   Double maksymalnaIlosc) {
        this.nazwa = nazwa;
        this.kalorie = kalorie;
        this.bialko = bialko;
        this.weglowodany = weglowodany;
        this.tluszcz = tluszcz;
        this.diety = diety;
        this.rodzajePosilku = rodzajePosilku;
        this.minimalnaIlosc = minimalnaIlosc;
        this.maksymalnaIlosc = maksymalnaIlosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getKalorie() {
        return kalorie;
    }

    public void setKalorie(Integer kalorie) {
        this.kalorie = kalorie;
    }

    public Double getBialko() {
        return bialko;
    }

    public void setBialko(Double bialko) {
        this.bialko = bialko;
    }

    public Double getWeglowodany() {
        return weglowodany;
    }

    public void setWeglowodany(Double weglowodany) {
        this.weglowodany = weglowodany;
    }

    public Double getTluszcz() {
        return tluszcz;
    }

    public void setTluszcz(Double tluszcz) {
        this.tluszcz = tluszcz;
    }

    public ArrayList<RodzajDiety> getDiety() {
        return diety;
    }

    public void setDiety(ArrayList<RodzajDiety> diety) {
        this.diety = diety;
    }

    public ArrayList<RodzajPosilku> getRodzajePosilku() {
        return rodzajePosilku;
    }

    public void setRodzajePosilku(ArrayList<RodzajPosilku> rodzajePosilku) {
        this.rodzajePosilku = rodzajePosilku;
    }

    public Double getMinimalnaIlosc() {
        return minimalnaIlosc;
    }

    public void setMinimalnaIlosc(Double minimalnaIlosc) {
        this.minimalnaIlosc = minimalnaIlosc;
    }

    public Double getMaksymalnaIlosc() {
        return maksymalnaIlosc;
    }

    public void setMaksymalnaIlosc(Double maksymalnaIlosc) {
        this.maksymalnaIlosc = maksymalnaIlosc;
    }

    public Double getIlosc() {
        return ilosc;
    }

    public void setIlosc(Double ilosc) {
        this.ilosc = ilosc;
    }
}
