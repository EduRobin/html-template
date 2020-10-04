import java.util.Scanner;

class MalaVelka {
    public static void main(String args[]) {

        char znak;
        int pocet = 0; // konverze
        
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("Pro skonceni programu stisknete klavesu '.' ");
        System.out.println("---------------------------------------------");
        
        do {
            

            System.out.println("Zadej znak: ");
            znak = sc.nextLine().charAt(0);

            if('a' <= znak | znak >= 'z' ) { 
                znak -= 32;
                pocet  ++;
                System.out.println(znak);
            }
            else if('A' <= znak | znak >= 'Z') { 
                znak += 32;
                pocet  ++;
                System.out.println(znak);

                
            }

            
        }while (znak != '.') ;
        System.out.println("nashledanou");

    }
} 