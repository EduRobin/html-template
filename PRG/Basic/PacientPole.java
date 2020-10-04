import java.util.Scanner;


class PacientPole{
    public static void main(String args[]) {
        
        double hm,v,bmi;
        int x = 0;
        String jmeno,vyska,vaha,bmi2,text;
    
        Scanner sc = new Scanner(System.in);


        System.out.println("Zadejte pocet pacientu: ");
        x = sc.nextInt();


        String tabulka[][] = new String[5][x];

        /*tabulka[0][x] = "Jmeno";
        tabulka[1][x] = "vaha";
        tabulka[2][x] = "vyska";
        tabulka[3][x] = "BMI";
        tabulka[4][x] = "text";*/

        

        

        for(int i = 1; i < x; i++) {
            System.out.println("Zadejte jmeno" + x + "pacienta: ");
            jmeno = sc.next();

            System.out.println("Zadejte vahu" + x + "pacienta:");
            hm = sc.nextDouble();

            System.out.println("Zadejte výšku" + x + "pacienta: ");
            v = sc.nextDouble();

            bmi = hm / (v * v);


            bmi2 = Double.toString(bmi);
            vaha = Double.toString(hm);
            vyska = Double.toString(v);
            


        }
        


        /*switch(text) {
            case 1:
            if (bmi < 16.5) System.out.println("Mas tezkou podvyzivu");
            break;
            case 2:
            

        }





/*
        for(int i = 0; i >= x; i++) {
            for(int g = 0; i >= x; g++) {
                tabulka[i][g] = 0;
                System.out.println("Pacient " + x + ":");
            }
        }

       

       




/*

        bmi = hm / (v * v);
       


        

        

       if (BMI < 16.5) System.out.println("Mas tezkou podvyzivu"); 
        else if (BMI < 18.5) System.out.println("Mas podvahu");
        else if (BMI < 25) System.out.println("Mas idealni vahu");
        else if (BMI < 30) System.out.println("Mas nadvahu");
        else if (BMI < 35) System.out.println("Mas mirnou obezitu");
        else if (BMI < 40) System.out.println("Mas stredni obezitu");
        else System.out.println("Mas morbidni obezitu");
        


        switch(text) {

        }




        for(int t = 0; t < x; ++t) {
            for(int i = 0; i < 5; ++i) {
                tabulka[t][i] = 0;
                System.out.println(tabulka[t][i] + " ");
               
            }
            System.out.println();
        } */

    }
}