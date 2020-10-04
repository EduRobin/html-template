import java.util.Scanner;

class Objekty {
    public static void main(String args[]) {

        int vyberPlanety;
        int vyberLode;
        double vypocet, vypocetHmotnosti;
        double hmotnost;
        Scanner sc = new Scanner(System.in);

        Planety mars = new Planety("Mars", 25, 54600000, 3.711);
        Planety jupiter = new Planety("Jupiter", -140, 588000000, 24.79);
        Planety neptun = new Planety("Neptun", -200, 44000000, 11.15);
        Planety saturn = new Planety("Saturn", -140, 1647060620, 10.44);
        Planety uran = new Planety("Uran", -214, 26000000, 8.87);

        Lode spaceX = new Lode("spaceX", 50000000, 1500);
        Lode falcon = new Lode("falcon", 25000000, 8000);
        Lode starTrek = new Lode("StarTrek", 100000000, 10000);
        
        System.out.println("Zadej svoj hmotnost na planete Zemi");
        hmotnost = sc.nextDouble();


        System.out.println();
        System.out.println("Vyber na jakou plantu chces letet");
        System.out.println();

        mars.vratPlanety();
        jupiter.vratPlanety();
        neptun.vratPlanety();
        saturn.vratPlanety();
        uran.vratPlanety();

        vyberPlanety = sc.nextInt();

        if(vyberPlanety == 1) {

            System.out.println();
            System.out.println("Jakou lodi chces letet na tuto planetu?");
            System.out.println();

            spaceX.vratLode();
            falcon.vratLode();
            starTrek.vratLode();

            vyberLode = sc.nextInt();

            if(vyberLode == 1) { //Mars

                System.out.println();
                System.out.println("Lodi spaceX na planetu Mars nedoletis.");
                System.out.println();

            }else if(vyberLode == 2) {
                vypocet = 54600000 / 8000;
                vypocetHmotnosti = hmotnost / 9.79 * 3.711;
                
                System.out.println();
                System.out.println("Letis na planetu Mars lodi falcon");
                System.out.println("Lodi falcon na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Mars budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Mars: -140");
                System.out.println();

            }else if(vyberLode == 3) {
                System.out.println();
                System.out.println("Lodi starTrek na planetu Mars nedoletis.");
                System.out.println();
            }

        }else if(vyberPlanety == 2) { //Jupiter

            System.out.println();
            System.out.println("Jakou lodi chces letet na tuto planetu?");
            System.out.println();

            spaceX.vratLode();
            falcon.vratLode();
            starTrek.vratLode();

            vyberLode = sc.nextInt();

            if(vyberLode == 1) {
                System.out.println();
                System.out.println("Lodi spaceX na planetu Jupier nedoletis.");
                System.out.println();

            }else if(vyberLode == 2) { 
                
                System.out.println();
                System.out.println("Lodi falcon na planetu Jupier nedoletis.");
                System.out.println();

            }else if(vyberLode == 3) {
                vypocet = 588000000 / 10000;
                vypocetHmotnosti = hmotnost / 9.79 * 24.79;

                System.out.println();
                System.out.println("Letis lodi starTrek na planetu Jupiter.");
                System.out.println("Lodi starTrek na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Jupiter budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplo na povrchu na planete Jupiter je: -140");
                System.out.println();
            }
        }else if(vyberPlanety == 3) { //Neptun

            System.out.println();
            System.out.println("Jakou lodi chces letet na tuto planetu?");
            System.out.println();

            spaceX.vratLode();
            falcon.vratLode();
            starTrek.vratLode();

            vyberLode = sc.nextInt();

            if(vyberLode == 1) {
                vypocet = 44000000 / 1500;
                vypocetHmotnosti = hmotnost / 9.79 * 11.15;
                
                System.out.println();
                System.out.println("Letis na planetu Neptun lodi spaceX");
                System.out.println("Lodi spaceX na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Neptun budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Neptun: -200");
                System.out.println();

            }else if(vyberLode == 2) {

                System.out.println();
                System.out.println("Lodi Falcon na planetu Neptun nedoletis.");
                System.out.println();
                
            }else if(vyberLode == 3) {
                vypocet = 44000000 / 10000;
                vypocetHmotnosti = hmotnost / 9.79 * 11.15;

                System.out.println();
                System.out.println("Letis na planetu Neptun lodi StarTrek");
                System.out.println("Lodi StarTrek na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Neptun budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Neptun: -200");
                System.out.println();


            }

        }else if(vyberPlanety == 4) { //Saturn

            System.out.println();
            System.out.println("Jakou lodi chces letet na tuto planetu?");
            System.out.println();

            spaceX.vratLode();
            falcon.vratLode();
            starTrek.vratLode();

            vyberLode = sc.nextInt();

            if(vyberLode == 1) {
                vypocet =  1647060620 / 1500;
                vypocetHmotnosti = hmotnost / 9.79 * 10.44;
                
                System.out.println();
                System.out.println("Letis na planetu Saturn lodi spaceX");
                System.out.println("Lodi spaceX na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Saturn budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Saturn: -140");
                System.out.println();

            }else if(vyberLode == 2) {
                vypocet =  1647060620 / 8000;
                vypocetHmotnosti = hmotnost / 9.79 * 10.44;
                
                System.out.println();
                System.out.println("Letis na planetu Saturn lodi falcon");
                System.out.println("Lodi falcon na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Saturn budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Saturn: -140");
                System.out.println();


            }else if(vyberLode == 3) {
                vypocet =  1647060620 / 10000;
                vypocetHmotnosti = hmotnost / 9.79 * 10.44;
                
                System.out.println();
                System.out.println("Letis na planetu Saturn lodi starTrak");
                System.out.println("Lodi starTrak na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Saturn budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Saturn: -140");
                System.out.println();

            }
        }else if(vyberPlanety == 5) { //Uran

            System.out.println();
            System.out.println("Jakou lodi chces letet na tuto planetu?");
            System.out.println();

            spaceX.vratLode();
            falcon.vratLode();
            starTrek.vratLode();

            vyberLode = sc.nextInt();

            if(vyberLode == 1) {

                System.out.println();
                System.out.println("Lodi spaceX na planetu Uran nedoletis.");
                System.out.println();

            }else if(vyberLode == 2) {
                 vypocet =  26000000 / 1500;
                vypocetHmotnosti = hmotnost / 9.79 * 8.87;
                
                System.out.println();
                System.out.println("Letis na planetu Uran lodi falcon");
                System.out.println("Lodi falcon na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Uran budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Uran: -214");
                System.out.println();


            }else if(vyberLode == 3) {
                 vypocet =  26000000 / 10000;
                vypocetHmotnosti = hmotnost / 9.79 * 8.87;
                
                System.out.println();
                System.out.println("Letis na planetu Uran lodi starTrak");
                System.out.println("Lodi starTrak na tuto planetu doletis za: " + vypocet);
                System.out.println("Na planete Uran budes vazit: " + vypocetHmotnosti);
                System.out.println("Teplota na povrchu na planete Uran: -140");
                System.out.println();
            }
        }
    }
}