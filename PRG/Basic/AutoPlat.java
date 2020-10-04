import java.util.Scanner;

class AutoPlat {
    public static void main(String args[]) {

        int plat;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej svuj mesicni plat");

        plat = sc.nextInt();

        plat = plat * 12;

         if(plat < 200000) System.out.println("Jezdi MHD");  
            else if(plat < 410000) System.out.println("Jezdi Ladovkou");
            else if(plat < 2000000) System.out.println("Jezdi Octavii");
            else System.out.println("Jezdi S class");
            
    }
}