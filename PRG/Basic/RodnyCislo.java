import java.util.Scanner;

class RodnyCislo {
    Scanner sc = new Scanner(System.in);
    static int cisloToInt = 0;
    static String x;
    static int y;
    static int cisloWithoutSlash;

     static void main(String args[]) {
    
    System.out.println(modulo(getInteger(removeSlash(getNum()))));

    }
    
      static void getNum() {
        System.out.println("Zadej svoje rodne čislo včetně lomítka");
        String x = sc.nextLine();
    }

      static void removeSlash() {
        if(x.contains("/")) {
           x.replaceAll();
        }else System.out.println("Spatne");
        System.exit(0);

    }

      static void getInteger(String cisloWithoutSlash) {
        y = Integer.valueOf(cisloWithoutSlash);
        
    }

    static boolean modulo(int cislo) {
        if(y % 11 == 0) {  
        System.out.println("spravne");
        return true;
        }else 
        System.out.println("spatne");
        return false;
    }

    
    
}