import java.util.Scanner;

class Lightning {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej  kolik sekund ubehlo, nez si slysel hrom");
        
        System.out.println("Vzdalenost hromu je" + calculate() + " metru ");

        
    }

    public static  double calculate() {
        int lightSpeed = 340;
        double result;
        
        result = getTime() * lightSpeed;
        
        return result;
    }

    public static int getTime() {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        return sec;
    }
    
}