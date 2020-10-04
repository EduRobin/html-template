import java.util.Scanner;

class RozborSlova {
    public static void main(String args[])  {

        String slovo;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej slovo: ");
        slovo = sc.nextLine();
        

        for(i = 0; i < slovo.length(); i++)
        System.out.println(slovo.charAt(i));


        }
    }