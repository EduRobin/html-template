import java.util.Scanner;



class KinoRezervace {
    public static void main(String args[]) {
        String volno = "v";
        String rada;
        String sedacka[][] = new String[16][20];

        System.out.println("Dobry den, vitejte v rezervavnim systemu kina");

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte radu (1-16): ");
        rada = sc.nextInt();
         
        System.out.println("Zadej sedacku (1-20): ");
        sedacka = sc.nextInt();

        for(int i = 0; i < 16;++i) {
            for(int t; i < 20;++t) {
                sedacka[i][t] = 0;
                System.out.println(sedacka[i][t] + " ");
            
            }
        }
            
    }
}

        

    