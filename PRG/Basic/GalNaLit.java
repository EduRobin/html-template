/*
  Cvièení 1.1

  Tento program pøevádí galony na litry.

  Program nazvìte GalntaLit.java.
*/
class GalnaLit {
 public static void main(String args[]) {
  double galony; // obsahuje poèet galonù
  double litry; // ukládá hodnotu po pøevodu na litry

  galony = 10; // program zaèíná s 10 galony

  litry = galony * 3.7854; // pøevede hodnotu na litry

  System.out.println(galony + " galonù se rovná " + litry + " litrù.");
 }
}