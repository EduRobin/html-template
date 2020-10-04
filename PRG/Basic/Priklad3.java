/*
  Tento program ilustruje rozdíly
  mezi typy int a double
  Soubor nazvìte Priklad3.java.
*/
class Priklad3 {
  public static void main(String args[]) {
    int prom; // deklaruje promìnnou typu int
    double x; // deklaruje promìnnou s plovoucí desetinnou èárkou

    prom = 10; // pøiøadí promìnné prom hodnotu 10
    
    x = 10.0; // pøiøadí promìnné x hodnotu 10.0

    System.out.println("Pùvodní hodnota promìnné prom: " + prom);
    System.out.println("Pùvodní hodnota promìnné x: " + x);
    System.out.println(); // vypíše prázdný øádek

    // nyní obì promìnné vydìlí èíslem 4
    prom = prom / 4;
    x = x / 4;

    System.out.println("Promìnná prom po dìlení: " + prom);
    System.out.println("Promìnná x po dìlení: " + x);
  }
}