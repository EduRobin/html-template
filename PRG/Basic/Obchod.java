class Obchod {

    public static void main(String args[]) {
        Elektro mobil = new Elektro(15000, "Iphone", "Apple");
        Elektro pc = new Elektro(20000, "MacBook", "Apple");
        Elektro tablet = new Elektro(10000, "Ipad", "Apple");

        Drogerie sampon = new Drogerie(30, "Axe", "Axe");
        Drogerie pasta = new Drogerie(20, "Colgate", "Parnik");
        Drogerie savo = new Drogerie(50, "Savo", "Nevim");

        Knihy jedna = new Knihy(100, "Kaktus", "Fizi");
        Knihy dva = new Knihy(200,"Bambus", "Freescoot");
        Knihy tri = new Knihy(300,"Autobus", "Denny");

        
        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        mobil.vratElektro();
        pc.vratElektro();
        tablet.vratElektro();

        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        sampon.vratDrogerie();
        pasta.vratDrogerie();
        savo.vratDrogerie();

        System.out.println(" ");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");

        jedna.vratKnihy();
        dva.vratKnihy();             
        tri.vratKnihy();

    }
}