import java.util.Random;

class SudaLicha {
    public static void main(String args[]) {

        int x;

        Random rnd = new Random();

        x = rnd.nextInt(10)+1;

        if ((x % 2) == 0)
            System.out.println("hodnota " + x + " je suda"); 
        if((x % 2) != 0)
            System.out.println("hodnota " + x + " je licha");
    }
}