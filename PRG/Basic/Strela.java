import java.util.Scanner;
class Strela {

    public int odhad;

    public Strela(int odhad) {
        this.odhad = odhad;
    }

    public void getStrela(Bunkr bunkr) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadej pozici na ktery si myslis, ze se bunkr nachazi: ");
        odhad = sc.nextInt();

        for(int h = 0; h < odhad; h++) {
            System.out.print(">");
        }

        if(odhad == bunkr.vzdalenostBunkru) {
            System.out.println("  Skvely odhad! Trefil jste cil!");
        }
        System.out.println("  Spatny odhad, zkuste to znovu!");
    }
}

    