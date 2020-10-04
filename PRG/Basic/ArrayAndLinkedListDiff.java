import java.util.*;

class ArrayAndLinkedListDiff {
    public static void main(String args[]) {

    long n = (long) 1E7;
    ArrayList<Double> poroArray = new ArrayList<Double>();
    long milis = System.currentTimeMillis();

    for (double i = 0; i < n; i++) { 
        poroArray.add(i);
    }

    System.out.println("insert arraylist takes " + (System.currentTimeMillis() - milis) + " ms");

    LinkedList<Double> poroList = new LinkedList<Double>();
    milis = System.currentTimeMillis();

    for (double i = 0; i < n; i++)  {
        poroList.add(i);
    }

    System.out.println("insert linkedlist takes " + (System.currentTimeMillis() - milis) + " ms");

    milis = System.currentTimeMillis();
    poroArray.remove(1E5);
    System.out.println("insert arraylist takes " + (System.currentTimeMillis() - milis) + " ms");

    milis = System.currentTimeMillis();
    poroList.remove(1E5);
    System.out.println("insert linkedlist takes " + (System.currentTimeMillis() - milis) + " ms");

    milis = System.currentTimeMillis();
    poroArray.get((int)n/2);
    System.out.println("insert arraylist takes " + (System.currentTimeMillis() - milis) + " ms");

    milis = System.currentTimeMillis();
    poroList.get((int)n/2);
    System.out.println("insert linkedlist takes " + (System.currentTimeMillis() - milis) + " ms");
    }
}