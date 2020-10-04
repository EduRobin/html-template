import java.util.Scanner;

class LogOp {
    public static void main (String args[]) { 
                                              
        int x,y,z;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Zadej x");
        x = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Zadej y");
        y = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Zadej z");
        z = sc3.nextInt();

        if(x<10 & x>8) System.out.println("pro x je podminka: True");
        else System.out.println("pro x je podminka: False");

        if(y<10 | y>8) System.out.println("pro y je podminka: True");
        else System.out.println("pro y je podminka: False");

        if(z<10 ^ z>8) System.out.println("pro z je podminka: True");
        else System.out.println("pro z je podminka: False");
    }
}