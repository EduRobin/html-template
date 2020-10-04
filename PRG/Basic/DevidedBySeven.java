import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class DevidedBySeven {
    public static void main(String[] args) {

        int i = 0;
        int pocet = 0;
        int zbytek = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo a zjisti jestli je delitelny sedmi");

        i = sc.nextInt();
        
        if(i % 7 == 0) {
            System.out.println("Cislo je delitelne sedmi");

        } else System.out.println("Cislo neni delitelne sedmi");

        System.out.println("-----------------------------------");

        for (int x = 0; x < 100; x++) {
            pocet = 0;
                for (int z = 1; z <= x; z++) {
                    zbytek = x%z; 
                    if (zbytek == 0) {
                        pocet = pocet + 1;
                }
            }if(pocet == 2) {
                System.out.println(x + ", ");
            }
        }

        
            Scanner filescanner = null;
            File cisla = new File("cisla.txt");
            try {
                filescanner = new Scanner(cisla);
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();
            }
            while (filescanner.hasNextInt()) {
                System.out.println(filescanner.nextInt());
            }
    }
}

