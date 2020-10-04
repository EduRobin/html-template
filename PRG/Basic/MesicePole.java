import java.util.Scanner;

class MesicePole {
    public static void main(String args[]) {

        String mesice[][] = {  
                              {"Leden", "Unor", "Brezen", "Duben", "Kveten", "Cerven", "Cervenec", "Srpen", "Zari", "Rijen", "Listopad", "Prosinec"},
                              {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"} 
                          };

        //String[][] mesice = new String[12];
        String cislo;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo od 0 do 11, podle toho jaky mesic chcete");
        cislo = sc.next();

        

        for(int i = 0; i < mesice[1].length; i++) {
            if(cislo.equals(mesice[1][i]))
            System.out.println(mesice[0][i]);
        }

        //System.out.println(mesice[cislo -1]);

          

    }
}