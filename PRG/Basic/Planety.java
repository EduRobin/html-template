class Planety {

        public String nazev;
        public double teplotaPovrchu;
        public double vzdalenostOdZeme;
        public double gravitace;

        public Planety(String nazev, double teplotaPovrchu, double vzdalenostOdZeme, double gravitace) {
            this.nazev = nazev;
            this.teplotaPovrchu = teplotaPovrchu;
            this.vzdalenostOdZeme = vzdalenostOdZeme;
            this.gravitace = gravitace;
        }

        public  void vratPlanety() {
            System.out.println("Nazev planety: " + nazev + ", Teplota na povrchu je:" + teplotaPovrchu + ", Vzdalenost od zeme je: " + vzdalenostOdZeme + ", Gravitace na tyhle planete je: " + gravitace);
            
        }


        

    
}