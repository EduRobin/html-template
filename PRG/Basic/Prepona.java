/*
    Pomoci Pythagorovy v�ty
    zjistit d�lku p�epony
    z d�lek dvou protilehl�ch
    stran.
*/
class Prepona {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("P�epona m� d�lku " +z);
    }
}