import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.File;



class TextoveSoubory {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char r;
        
        
        
        do { 

        System.out.println("----------------------------------------------------------------------------------");
            
        System.out.println("Vyberte jakou operaci chcete vybrat a), b), nebo zmacknete X pro ukonceni programu");
        r = sc.next().charAt(0);

        System.out.println("----------------------------------------------------------------------------------");

        

        

        

            if(r == 'a') { 
                System.out.println("Zadejte kolik chcete mit jmen");
                int numberOfNames = sc.nextInt();

                sc.nextLine();
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("soubor.txt", true))) {
                
                for(int i = 1; i <= numberOfNames; i++) {
                    System.out.println("Zadej jmeno a prijmeni " + i + " uzivatele ");
                    String jmeno = sc.nextLine();
                    bw.newLine();
                    bw.write(jmeno);
                    bw.flush();
                    }
                }catch (Exception e){
                System.err.println("Do souboru se nepovedlo zapsat.");
            }

            }
            
            else if(r == 'b') {
                try (BufferedReader br = new BufferedReader(new FileReader("soubor.txt")))
                {   
                String s;
                while ((s = br.readLine()) != null)
                {
                    System.out.println(s);
                }
                }
                catch (Exception e)
                {
                    System.err.println("Chyba při čtení ze souboru.");
                }   
                
            }

            
        
        }while(r != 'X');

        if(r == 'X') {
            System.out.println("Program se ukončil");
        }
    }
}