import java.util.Scanner;

class MesicVRoce {
    public static void main(String args[]) {
        int  Mesice;

        Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Zadej cislo mesice");

                Mesice = sc.nextInt();

            } while(Mesice < 1 | Mesice > 12);
        

            switch(Mesice) {
                case 1:
                  System.out.println("je Leden.");
                  break;
                case 2:
                  System.out.println("Je Únor.");
                  break;
                case 3:
                  System.out.println("Je Březen.");
                  break;
                case 4:
                  System.out.println("Je duben");
                  break;
                case 5:
                  System.out.println("Je Kveten");
                  break;
                case 6:
                  System.out.println("Je Cerven");
                  break;
                case 7:
                  System.out.println("Je Cervenec");
                  break;
                case 8:
                  System.out.println("Je Srpen");
                  break;
                case 9:
                  System.out.println("Je Zari");
                  break;
                case 10:
                  System.out.println("Je Rijen");
                  break;
                case 11:
                  System.out.println(" Je Listopad");
                  break;
                case 12:
                  System.out.println("Je Prosinec");
                  break;
               }

           
    }
}