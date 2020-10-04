import java.util.Scanner;

class VypoctiBMI {
    public static void main(String args[]) {

        double hm;  
        double v;   
        double BMI;

        Scanner sc = new Scanner(System.in);

        System.out.println("zadej svoji hmotnost v kg");

        hm = sc.nextDouble();

        System.out.println("Zadej svoji vysku v centimetrech");

        v = sc.nextDouble();

        v = v / 100;
        
        BMI = hm / (v * v);

        System.out.println("Tvoje BMI = " + BMI);

        if (BMI < 16.5) System.out.println("Mas tezkou podvyzivu"); 
        else if (BMI < 18.5) System.out.println("Mas podvahu");
        else if (BMI < 25) System.out.println("Mas idealni vahu");
        else if (BMI < 30) System.out.println("Mas nadvahu");
        else if (BMI < 35) System.out.println("Mas mirnou obezitu");
        else if (BMI < 40) System.out.println("Mas stredni obezitu");
        else System.out.println("Mas morbidni obezitu");
    }
}