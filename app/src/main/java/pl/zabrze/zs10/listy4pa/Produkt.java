package pl.zabrze.zs10.listy4pa;
public class Produkt {
    private String nazwa;
    private double cena;
    private String kategoria;
    private boolean zaznaczony;

    public Produkt(String nazwa, double cena, String kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        zaznaczony =false;
    }

    public boolean isZaznaczony() {
        return zaznaczony;
    }

    public void setZaznaczony(boolean zaznaczony) {
        this.zaznaczony = zaznaczony;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKategoria() {
        return kategoria;
    }
}
