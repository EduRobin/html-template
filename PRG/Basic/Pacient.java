import java.util.Scanner;

class Pacient {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String jmeno, vaha, vyska, bmiS, text;
    double m, v, bmi;
    int x;
    
    System.out.println("Zadejte pocet pacientu: ");
    x = scan.nextInt();
    
    String pacient[][] = new String[5][x];
    pacient[0] = new String[x-1];
    pacient[1] = new String[x-1];
    pacient[2] = new String[x-1];
    pacient[3] = new String[x-1];
    pacient[4] = new String[x-1];
    
   

    /*pacient[0][x] = "Jmeno";
    pacient[1][x] = " Vaha";
    pacient[2][x] = "Vyska";
    pacient[3][x] = "BMI";
    pacient[4][x] = "      ";*/

    for (int y = 0; y <= x; y++) {
      System.out.println("--------------------------------------------------------");
      System.out.println("Zadejte sve jmeno: ");
      jmeno = scan.nextLine();

      System.out.println("Zadejte svoji vahu v kilogramech: ");
      m = scan.nextDouble();
  
      System.out.println("Zadejte svoji vysku v metrech: ");
      v = scan.nextDouble();

      bmi = m / (v * v);

      vaha = Double.toString(m);
      vyska = Double.toString(v);
      bmiS = Double.toString(bmi);
  

      if (bmi < 18.5) 
        text = "Mate podvahu.";

      else if (bmi >= 18.5 && bmi < 25) 
        text = "Jste v norme.";
    
      else if (bmi >= 25 && bmi < 30) 
        text = "Mate nadvahu."; 
        
      else if (bmi >= 30 && bmi < 35) 
        text = "Mate obezitu I. stupne.";
     
      else if (bmi >= 35 && bmi < 40) 
        text = "Mate obezitu II. stupne.";
  
      else 
        text = "Mate obezitu III. stupne.";

        pacient[0][x-1] = jmeno;
        pacient[1][x-1] = vaha;
        pacient[2][x-1] = vyska;
        pacient[3][x-1] = bmiS;
        pacient[4][x-1] = text;
    }
  
    System.out.println("--------------------------------------------------------");

    for (int i = 0; i < x; ++i) {
      for(int j = 0; j < 5; ++j) {
        System.out.print(pacient[i][j] + "   ");
      }
      System.out.println();
    }
  } 
}