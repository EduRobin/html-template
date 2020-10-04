/*
    Pomoci Pythagorovy vìty
    zjistit délku pøepony
    z délek dvou protilehlých
    stran.
*/
class Prepona {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Pøepona má délku " +z);
    }
}