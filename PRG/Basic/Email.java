import java.util.Scanner;

class Email {
    public static void main(String args[]) { 

    String jmeno;
    String prijmeni;

    Scanner sc = new Scanner(System.in);

    System.out.println("Zadej jmeno");
    jmeno = sc.nextLine();

    System.out.println("----------------------------");

    System.out.println("Zadej prijmeni");
    prijmeni = sc.nextLine();

    System.out.println("----------------------------");

    System.out.println(jmeno.substring(0,1) + prijmeni.substring(0,1));
    
    System.out.println(jmeno + "." + prijmeni + "@gmail.com");
    




    }
}