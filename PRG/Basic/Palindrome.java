import java.util.*;
 
class Palindrome {
  public static void main(String args[])
  {
    String original, opak = ""; 
    Scanner in = new Scanner(System.in);
    System.out.println("Zadej slovo");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1; i >= 0; i--)
      opak = opak + original.charAt(i);

    if (original.equals(opak))
      System.out.println("Slovo je palindrom");
    else
      System.out.println("Slovi neni palindrom");
  }
}