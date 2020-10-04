/*Vytvořit dva cycly A, Cyclus, který bude vypisovat čísla od 0 do 30 po třech číslech
druhý cyclus bude vypisovat malá písmena od a - z v cyklu. */



class TestCyclus {
public static void main (String args[]) {

    int pocet;
    char a = 'a';
    int x;

    
    
    System.out.println("1");
    for(pocet = 3; pocet < 31 ; pocet = pocet + 3){
		  System.out.println( pocet);
        
	
        }

    for(x = 0; x < 26; x++) {
	    System.out.println("" + a);
	    a++;

        }

	  

	}

}