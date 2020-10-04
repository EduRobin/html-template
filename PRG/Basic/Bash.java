import java.util.Scanner;

class Bash {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = " ";
        String end = "end";
        

        while(!input.equals(end)) {
            System.out.println("Zadej jakekoliv slovo");
            input = sc.nextLine();
        }
    }
}