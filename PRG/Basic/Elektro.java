public class Elektro {
    public double cena;
    public String nazev;
    public String znacka;

    public Elektro( double cena, String nazev, String znacka) {
        this.cena = cena;
        this.nazev = nazev;
        this.znacka = znacka;
    }

    public  void vratElektro() {
        System.out.println("Cena " + cena + "kc " + "Nazev produktu: " +  nazev + "Znacka produktu: " +  znacka);
    }


}