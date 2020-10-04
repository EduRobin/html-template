public class Drogerie {
    public double cena;
    public String nazev;
    public String vyrobce;

    public Drogerie(double cena, String nazev, String vyrobce) {
        this.cena = cena;
        this.nazev = nazev;
        this.vyrobce = vyrobce;
    }

    public  void vratDrogerie() {
        System.out.println(cena + "kc " + "Nazev produktu: " +  nazev + "Znacka vyrobce: " +  vyrobce);
    }
}