import java.util.Scanner;

public class RodneCislo2 {

	public static void main(String[] args) {        
        fin();
    }
    
    static String zadejCislo() {
        System.out.println("Zadej sve rodne cislo vcetne lomitka");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    static String deleteSlash(String num){
        if (num.contains("/")) {
            num = num.replace("/", "");
            return num;
        } else {
            System.out.println("Zadal si spatne rodne cislo");
            System.exit(0);
            return null;
        }
    }
    
    static int transferInt(String num){
        if (num == null) {
            System.out.println("neco se podelalo");
            System.exit(0);
        }
        return Integer.parseInt(num);	
    }

    static boolean modulo(int num){
        if (num % 11 == 0) return true;
        else return false;
    }
    static void fin() {

        if (modulo(transferInt(deleteSlash(zadejCislo())))) System.out.println("Rodne cislo je platne");
        else                                                System.out.println("Rodne cislo je neplatne");
    }
}