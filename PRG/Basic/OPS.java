import java.util.Scanner;
import java.util.*;
import java.util.Collections;


class OPS {
    public static void main(String args[]) {
        ArrayList<String> cisla = new ArrayList<String>();
        ArrayList<Double> cislo2 = new ArrayList<Double>();

        Scanner sc = new Scanner(System.in);

        String input = ""; v  
        
        int suma = 0;
        


        while(!input.equals("END")) {

            System.out.println("Zadej cislo  a nebo END pro ukonceni");
            input = sc.nextLine();
            cisla.add(input);
        }

        int y = cisla.size()-1;
        cisla.remove(y);

        for(int i = 0; i < cisla.size(); i++) {
            cislo2.add(Double.parseDouble(cisla.get(i)));
        }

        for(int a = 0; a < cislo2.size(); a++) {
            suma += cislo2.get(a);
        }


        System.out.println("ArrayList Min Value: " + Collections.min(cisla));
        System.out.println("ArrayList Max Value: " + Collections.max(cisla));
        System.out.println("Sum: " + suma);
        System.out.println("Average: " + getAverage(cislo2));

    }

    private static double getAverage(ArrayList<Double> cislo2) {
            int sum = 0;
            if(!cislo2.isEmpty()) {
                for(Double mark : cislo2) {
                    sum += mark;
                }
                return sum / cislo2.size();
            }
            return sum;
        }
}