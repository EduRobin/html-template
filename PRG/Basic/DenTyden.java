import java.util.Scanner;


class DenTyden {
    public static void main(String args[]) { 

        int x;
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Zadejte číslo dne v týdnu");
            x = sc.nextInt();

            if( x<1 || x>7 ) 
                System.out.println("Chybne zadane cislo dne");
                
            }while( 0<x || x>8 );
            vratDen(x);
            System.out.println("Konec programu");
            }
            

            static void vratDen(int x) { 
            switch(x) {
                    case '1':
                        System.out.println("Pondeli ");
                        break;
                    case '2':
                        System.out.println("Utery ");
                        break;
                    case '3':
                        System.out.println("Streda #me je treba");
                        break;
                    case '4':
                        System.out.println("Ctvrtek ");
                        break;
                    case '5':
                        System.out.println("Patek ");
                        break;
                    case '6':
                        System.out.println("Sobota ");
                        break;
                    case '7':
                        System.out.println("Nedele ");
                        break;
                    default:
                        System.out.println("Chybne zadany den");
              }
            }
            
        
    }







