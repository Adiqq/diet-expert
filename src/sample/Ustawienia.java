package sample;

public class Ustawienia
{
    private Integer liczbaKalorii;

    @Override
    public String toString() {
        return "Ustawienia{" +
                "liczbaKalorii=" + liczbaKalorii +
                ", minBialka=" + minBialka +
                ", maxBialka=" + maxBialka +
                ", minWegli=" + minWegli +
                ", maxWegli=" + maxWegli +
                ", minTluszczu=" + minTluszczu +
                ", maxTluszczu=" + maxTluszczu +
                ", rodzajDiety=" + rodzajDiety +
                ", liczbaPosilkow=" + liczbaPosilkow +
                '}';
    }

    public Ustawienia(Integer liczbaKalorii, Integer minBialka, Integer maxBialka, Integer minWegli, Integer maxWegli,
                      Integer minTluszczu, Integer maxTluszczu, RodzajDiety rodzajDiety, Integer liczbaPosilkow) {
        this.liczbaKalorii = liczbaKalorii;
        this.minBialka = minBialka;
        this.maxBialka = maxBialka;
        this.minWegli = minWegli;
        this.maxWegli = maxWegli;
        this.minTluszczu = minTluszczu;
        this.maxTluszczu = maxTluszczu;
        this.rodzajDiety = rodzajDiety;
        this.liczbaPosilkow = liczbaPosilkow;
    }

    public Integer getLiczbaKalorii() {
        return liczbaKalorii;
    }

    public void setLiczbaKalorii(Integer liczbaKalorii) {
        this.liczbaKalorii = liczbaKalorii;
    }

    public Integer getMinBialka() {
        return minBialka;
    }

    public void setMinBialka(Integer minBialka) {
        this.minBialka = minBialka;
    }

    public Integer getMaxBialka() {
        return maxBialka;
    }

    public void setMaxBialka(Integer maxBialka) {
        this.maxBialka = maxBialka;
    }

    public Integer getMinWegli() {
        return minWegli;
    }

    public void setMinWegli(Integer minWegli) {
        this.minWegli = minWegli;
    }

    public Integer getMaxWegli() {
        return maxWegli;
    }

    public void setMaxWegli(Integer maxWegli) {
        this.maxWegli = maxWegli;
    }

    public Integer getMinTluszczu() {
        return minTluszczu;
    }

    public void setMinTluszczu(Integer minTluszczu) {
        this.minTluszczu = minTluszczu;
    }

    public Integer getMaxTluszczu() {
        return maxTluszczu;
    }

    public void setMaxTluszczu(Integer maxTluszczu) {
        this.maxTluszczu = maxTluszczu;
    }

    public RodzajDiety getRodzajDiety() {
        return rodzajDiety;
    }

    public void setRodzajDiety(RodzajDiety rodzajDiety) {
        this.rodzajDiety = rodzajDiety;
    }

    public Integer getLiczbaPosilkow() {
        return liczbaPosilkow;
    }

    public void setLiczbaPosilkow(Integer liczbaPosilkow) {
        this.liczbaPosilkow = liczbaPosilkow;
    }

    private Integer minBialka;
    private Integer maxBialka;
    private Integer minWegli;
    private Integer maxWegli;
    private Integer minTluszczu;
    private Integer maxTluszczu;
    private RodzajDiety rodzajDiety;
    private Integer liczbaPosilkow;

}
