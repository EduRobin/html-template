import java.util.Scanner;

class Pyramida {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Zadej hodnotu ");

    int x = sc.nextInt();
    
    for(int f = 1; f <= x; f++)
        System.out.println(f + " ");
    
    System.out.println("---------------------------------------------------------------");

    for(int g = 0; g <= x; g++) {
        for (int m = 1; m <= g; m++) {
            System.out.print(m + " ");
            
            }
            System.out.println();
            
        }
    }
}


