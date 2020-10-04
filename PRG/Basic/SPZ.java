import java.util.Scanner;

class SPZ {
    public static void main(String args[]) {

        boolean next = true;
        
        String spz;
        
        Scanner sc = new Scanner(System.in);
        


        while(next){
            System.out.println("Zadejte SPZ znacku se 7 znaky a pismenem kraje");

            spz = sc.nextLine();

            if(spz.charAt(0) == 'Q') {
                next = false;
            }

            else if(spz.length()  != 7) {  
            System.out.println("Chyba");
            continue;
            }
            
            else { 
            
            
                switch(spz.charAt(1)) {
                    case 'A':
                        System.out.println("Auto je z Prahy ");
                        break;
                    case 'B':
                        System.out.println("Auto je z Jihomoravskeho kraje ");
                        break;
                    case 'C':
                        System.out.println("Auto je z Jihoceskyho kraje ");
                        break;
                    case 'E':
                        System.out.println("Auto je z Pardubickyho kraje ");
                        break;
                    case 'H':
                        System.out.println("Auto je z Kralovehradeckyho kraje ");
                        break;
                    case 'J':
                        System.out.println("Auto je z Kraje Vysocina");
                        break;
                    case 'K':
                        System.out.println("Auto je z Karlovarskyho kraje ");
                        break;
                    case 'L':
                        System.out.println("Auto je z Libereckyho  kraje ");
                        break;
                    case 'M':
                        System.out.println("Auto je z Olomouckyho kraje ");
                        break;
                    case 'P':
                        System.out.println("Auto je z Plzenskyho kraje ");
                        break;
                    case 'S':
                        System.out.println("Auto je ze Stredoceskyho kraje ");
                        break;
                    case 'T':
                        System.out.println("Auto je z Moravskoslezskyho kraje ");
                        break;
                    case 'U':
                        System.out.println("Auto je z Usteckyho kraje ");
                        break;
                    case 'Z':
                        System.out.println("Auto je ze Zlinskyho kraje");
                        break;
                    default:
                        System.out.println("Chybne zadana spz");
            }
        }
        
    }
}
}