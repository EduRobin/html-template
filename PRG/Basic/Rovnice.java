import java.util.Scanner;

class Rovnice {
    public static void main(String args[]) {

        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.println("zadej hodnotu x");

        x = sc.nextInt();

        y = x + 9 + x + 3 * x;

        System.out.println("Vysledek = " + y);

    }
}