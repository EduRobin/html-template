import java.util.Scanner;

class MenovaKalkulacka {
    public static void main(String args[]) {

        double vypocet;
        double eur;
        double usd;   
        double mena; 
        int x; // volba
        int pokracovat; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej kurz eura: ");
        eur = sc.nextDouble();

        System.out.println("Zadej kurz usd: ");
        usd = sc.nextDouble();

        
        do {
            System.out.println(+eur);
            System.out.println(+usd);

            System.out.println("Zadej castku v czk");
            mena = sc.nextDouble();
            do {
                
                System.out.println("Na co chcete prevadet: 1.euro 2.usd ");
                x = sc.nextInt();

                if(x < 1 | x > 2) System.out.println("Chybna volba, zadejte hodnotu");
                
            }while(x > 2 | x < 1 );

            if( x == 1) {
                vypocet = mena / eur;
                System.out.println(vypocet);
                
                
            }
            else if( x == 2) {
                vypocet = mena / usd;
                System.out.println(vypocet); 
                
            }
            else {
                System.out.println("Spatne zadana mena");
            }

            System.out.println("Chcete pokračovat 1. Ano neno 2. Ne? ");
            pokracovat = sc.nextInt();

        }while( pokracovat == 1 | pokracovat != 2);
    }
}