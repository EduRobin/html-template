class Stat {

    public String nazevStatu;
    public double pocetObyvatel;
    public double pocetNakazenych;
    public double pocetUmrti;
    public double pocetVylecenych;
    public double procentoNakazenych;
    public double procentoUmrti;

    public Stat(String nazevStatu,double pocetObyvatel, double pocetNakazenych, double pocetUmrti, double pocetVylecenych) {
        this.nazevStatu = nazevStatu;
        this.pocetObyvatel = pocetObyvatel;
        this.pocetNakazenych = pocetNakazenych;
        this.pocetUmrti = pocetUmrti;
        this.pocetVylecenych = pocetVylecenych;
    }

    
    public String nazevStatu() {
        return nazevStatu;
    }

    public double pocetObyvatel() {
        return pocetObyvatel;
    }
    public double pocetNakazenych() {
        return pocetNakazenych;
    }
    public double pocetUmrti() {
        return pocetUmrti;
    }
    public double pocetVylecenych() {
        return pocetVylecenych;
    }

    public double vratProcentoNakazenychZPopulace() {
        this.procentoNakazenych = pocetNakazenych * 100 / pocetObyvatel;
        return procentoNakazenych;
    }

    public double vratProcentoUmrtiZNakazenych() {
        

        if(pocetUmrti == 0) {
            procentoUmrti = 0;
        } else {
            procentoUmrti = 100 * pocetUmrti / procentoNakazenych;
        }

        return procentoUmrti;
    }
}