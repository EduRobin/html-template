class Serazeni {
  public static void main(String args[]) {
   int A;
   int B;
   int C;

   A = 5;
   B = 10;
   C = 15;

   if (A > B) {
    if (A > C) {
    System.out.println(A);
    if (C > B) {
     System.out.println(C);
     System.out.println(B);
    }
    else  {
     System.out.println(B);
     System.out.println(C);
    }
  }
  else  {
    System.out.println(C);
    System.out.println(A);
    System.out.println(B);
   }
 } else {
    if (B > C) {
     System.out.println(B);
     if (A > C) {
      System.out.println(A);
      System.out.println(C);
   }
   else  {
    System.out.println(C);
    System.out.println(A);
   }
 } else {
    System.out.println(C);
    System.out.println(B);
    System.out.println(A);
   }
  }
 }
}