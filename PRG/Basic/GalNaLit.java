/*
  Cvi�en� 1.1

  Tento program p�ev�d� galony na litry.

  Program nazv�te GalntaLit.java.
*/
class GalnaLit {
 public static void main(String args[]) {
  double galony; // obsahuje po�et galon�
  double litry; // ukl�d� hodnotu po p�evodu na litry

  galony = 10; // program za��n� s 10 galony

  litry = galony * 3.7854; // p�evede hodnotu na litry

  System.out.println(galony + " galon� se rovn� " + litry + " litr�.");
 }
}