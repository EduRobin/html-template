public class Knihy {
    public double cena;
    public String nazev;
    public String autor;

    public Knihy(double cena, String nazev, String autor) {
        this.cena = cena;
        this.nazev = nazev;
        this.autor = autor;
    }

    public  void vratKnihy() {
        System.out.println(cena + "kc " + "Nazev knihy: " +  nazev + "Autor knihy: " +  autor);
    }
}