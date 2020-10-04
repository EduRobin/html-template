import java.util.Scanner;

class Pozdrav  {
    public static void main (String args[]) {
        int x ;
        int  y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej hodnotu y");

        y = sc.nextInt();

        for( x = 0; x < y; x++) {
            System.out.println("Ahoj");
        }
        System.out.println("Omegalul");
        x= 0;
        if(y != 0) {
            do {
            x++;
            System.out.println("Ahoj");
            

            }  while (x < y);
        } 
    }
}