import java.util.Scanner;

class KontrolaHesla {
    public static void main(String args[]) {

        boolean next = true;
        String heslo;
        char znak;

        Scanner sc = new Scanner(System.in);

       /* while(next){
            System.out.println("Zadej heslo, které musí mít aspoň 8 znaků, obsahuje pouze pismena a alespon 2 cislice");
            heslo = sc.nextLine();

            if(heslo.length() == 8) {
                continue;
            }



            else if(heslo.length() >= 8) {
                System.out.println("chybne zadane heslo");
                continue;
            }

            for(znak = 0;znak  ;znak++)

        }
    }
}*/


        void main() {
            String heslo();
            heslo = sc.nextLine();

            if(zkontrolujDelku(heslo,8)) { 
                System.out.println("Heslo OK");
            }
            else { 
                System.out.println("Neni OK");
            }
        }

        static boolean zkontrolujDelku(String heslo,int minDelka) {
            if (heslo.length() >= minDelka)
                return true;
            else
                return false;
        }

