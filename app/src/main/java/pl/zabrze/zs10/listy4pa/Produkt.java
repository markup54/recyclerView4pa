package pl.zabrze.zs10.listy4pa;
public class Produkt {
    private String nazwa;
    private double cena;
    private String kategoria;

    public Produkt(String nazwa, double cena, String kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
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
