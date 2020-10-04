class Lode {

    public String nazev;
    public double dolet;
    public double rychlost;

    public Lode(String nazev, double dolet, double rychlost) {
        this.nazev = nazev;
        this.dolet = dolet;
        this.rychlost = rychlost;
    }

    public void vratLode() {
            System.out.println("Nazev lode: " + nazev + ", maximalni dolet: " + dolet + ", rychlost ve svetelnych letech: " + rychlost );
        }
}