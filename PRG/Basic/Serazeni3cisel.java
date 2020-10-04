import java.util.Scanner;

class Serazeni3cisel {
  public static void main(String args[]) {
   int cislo1;
   int cislo2;
   int cislo3;
   int x; //volba
   int v;
   int s;

   Scanner sc = new Scanner(System.in);
   System.out.println("Zadej cislo 1: ");
   cislo1 = sc.nextInt();

   System.out.println("Zadej cislo 2: ");
   cislo2 = sc.nextInt();

   System.out.println("Zadej cislo 3: ");
   cislo3 = sc.nextInt();
   
   do {
        System.out.println("Jak chcete cisla: s = svisle v = vodorovne? ");
        x = sc.nextInt();

        if(x < s | x > v) System.out.println("Chybna volba, zadejte hodnotu");
                
        }while(x > s | x < v );

   
if(x == s){ 
   if (cislo1 > cislo2) {
    if (cislo1 > cislo3) {
    System.out.println(cislo1);
    if (cislo3 > cislo2) {
     System.out.println(cislo3);
     System.out.println(cislo2);
    }
    else  {
     System.out.println(cislo2);
     System.out.println(cislo3);
    }
  }
  else  {
    System.out.println(cislo3);
    System.out.println(cislo1);
    System.out.println(cislo2);
   }
 } else {
    if (cislo2 > cislo3) {
     System.out.println(cislo2);
     if (cislo1 > cislo3) {
      System.out.println(cislo1);
      System.out.println(cislo3);
   }
   else  {
    System.out.println(cislo3);
    System.out.println(cislo1);
   }
 } else {
    System.out.println(cislo3);
    System.out.println(cislo2);
    System.out.println(cislo1);
 }
   }
  }
 }
}

if(x == v){ 
   if (cislo1 > cislo2) {
    if (cislo1 > cislo3) {
    System.out.print(cislo1);
    if (cislo3 > cislo2) {
     System.out.print(cislo3);
     System.out.print(cislo2);
    }
    else  {
     System.out.print(cislo2);
     System.out.print(cislo3);
    }
  }
  else  {
    System.out.print(cislo3);
    System.out.print(cislo1);
    System.out.print(cislo2);
   }
 } else {
    if (cislo2 > cislo3) {
     System.out.print(cislo2);
     if (cislo1 > cislo3) {
      System.out.print(cislo1);
      System.out.print(cislo3);
   }
   else  {
    System.out.print(cislo3);
    System.out.println(cislo1);
   }
 } else {
    System.out.print(cislo3);
    System.out.print(cislo2);
    System.out.print(cislo1);
 }
   }
  }
 }
}