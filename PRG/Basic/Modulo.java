import java.util.Scanner;

class Modulo {
    public static void main(String args[]) {

        int x;

        System.out.println("zadej hodnotu");
        
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextInt();

        if (x % 2 == 0)
            System.out.println("hodnota je suda"); 
        else 
            System.out.println("hodnota je licha");
    }
}
		
			