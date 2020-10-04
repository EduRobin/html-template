import java.util.Scanner;
class EasyCalc {
    public static void main(String args[]) {
       
        String priklad;

        
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Zadej priklad");
        priklad = sc.nextLine();

             
             
             
        
        
        
        if(priklad.indexOf('+') != -1) 
            System.out.println("Vysledek prikladu: " +  sectiCisla(priklad));
            
        else if(priklad.indexOf('-') != -1) 
            System.out.println("Vysledek prikladu: " +  odectiCisla(priklad));

            
        else if(priklad.indexOf('*') != -1) 
            System.out.println("Vysledek prikladu: " +  nasobCisla(priklad));

            
        else if(priklad.indexOf('/') != -1)
            System.out.println("Vysledek prikladu: " + vydelCisla(priklad));
    }
            
    }

    static double sectiCisla(String priklad){
        int pozice = priklad.indexOf('+');
        double druhyCislo = Double.parseDouble(priklad.substring(pozice+1));
        double prvniCislo = Double.parseDouble(priklad.substring(0, pozice));
        double vysledek = prvniCislo + druhyCislo;
        return vysledek;
    }
    static double odectiCisla(String priklad){
        int pozice = priklad.indexOf('-');
        double druhyCislo = Double.parseDouble(priklad.substring(pozice+1));
        double prvniCislo = Double.parseDouble(priklad.substring(0, pozice));
        double vysledek = prvniCislo - druhyCislo;
        return vysledek;
    }
    static double nasobCisla(String priklad){
        int pozice = priklad.indexOf('*');
        double druhyCislo = Double.parseDouble(priklad.substring(pozice+1));
        double prvniCislo = Double.parseDouble(priklad.substring(0, pozice));
        double vysledek = prvniCislo * druhyCislo;
        return vysledek;
    }
    static double vydelCisla(String priklad){
        int pozice = priklad.indexOf('/');
        double druhyCislo = Double.parseDouble(priklad.substring(pozice+1));
        double prvniCislo = Double.parseDouble(priklad.substring(0, pozice));
        double vysledek = prvniCislo / druhyCislo;
        return vysledek;
    }
}



