import java.util.*;


class HraOOP {
    public static void main(String args[]) {

        char random = ' ';
        Scanner sc = new Scanner(System.in);
        

        game();

    }
    static void game() {
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Vitejte ve hre, kde Vaším úkolem je zasáhnout vojenskou základu protivníka.\nSoupeřem Vám bude AI samotného počítače.\nPo stisku klávesy níže, máte 5 hracích kol na poražení soupeře.\nV každém kole soupeř umístí na obrazovce vojenskou základu (symbol W) a Vaším\núkolem je zadat správnou vzdálenost základny pro dolet rakety tak, aby základnu trefila přesně.");
        System.out.println("------------------------------------------------------------------------------------------------");

        logic();

                    
    }
        
    static void logic() {

        int odhad = 0;
        Scanner sc = new Scanner(System.in);
        double vzdalenostBunkru;
        int hrac = 0;
        int pc = 0;
        
            for(int l = 0; l < 5;l++) { 
                for(int a = 0; a < 10;a++) {
                    System.out.println();
                }

                vzdalenostBunkru = Math.floor(Math.random() * 51);

                Bunkr bunkr = new Bunkr(vzdalenostBunkru);
                    

                for(int j = 0; j < bunkr.vzdalenostBunkru; j++) {
                    System.out.print(" ");
                }
                System.out.println("W");


                for(int b = 0; b < 10; b++) {
                    System.out.println();
                }

                

                System.out.print("Zadej pozici na ktery si myslis, ze se bunkr nachazi: ");
                odhad = sc.nextInt();

                for(int h = 0; h < odhad; h++) {
                    System.out.print(">");
                }

                if(odhad == bunkr.vzdalenostBunkru) {
                    System.out.println("  Skvely odhad! Trefil jste cil!");
                    
                }
                System.out.println("  Spatny odhad, zkuste to znovu!");
                
                    

                
            }
        
    }
}