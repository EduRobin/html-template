/*
  Tento program ilustruje rozd�ly
  mezi typy int a double
  Soubor nazv�te Priklad3.java.
*/
class Priklad3 {
  public static void main(String args[]) {
    int prom; // deklaruje prom�nnou typu int
    double x; // deklaruje prom�nnou s plovouc� desetinnou ��rkou

    prom = 10; // p�i�ad� prom�nn� prom hodnotu 10
    
    x = 10.0; // p�i�ad� prom�nn� x hodnotu 10.0

    System.out.println("P�vodn� hodnota prom�nn� prom: " + prom);
    System.out.println("P�vodn� hodnota prom�nn� x: " + x);
    System.out.println(); // vyp�e pr�zdn� ��dek

    // nyn� ob� prom�nn� vyd�l� ��slem 4
    prom = prom / 4;
    x = x / 4;

    System.out.println("Prom�nn� prom po d�len�: " + prom);
    System.out.println("Prom�nn� x po d�len�: " + x);
  }
}