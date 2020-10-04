class TryCatchDeleni {
    public static void main(String args[]) {
        try { 
        int cislo1 = 10;
        int cislo2 = 2;

        int vysledek = cislo1 / cislo2;
        System.out.println(vysledek);

        }catch(Exception e) {
            System.out.println("Nesmí se dělit nulou");
    }
        

        
    }
}