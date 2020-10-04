import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {

    ArrayList<Integer> myList = new ArrayList<Integer>(5);

    myList.add(3);
    myList.add(4);
    myList.add(5);
    myList.add(6);
    myList.add(31);
    

    for(Integer x : myList) {
        System.out.println(x);
    }

    System.out.println("size of the arraylist = " + myList.size());
    myList.remove(2);

    for(Integer x : myList) {
        System.out.println(x);
    }

    System.out.println("size of the arraylist = " + myList.size());

    myList.set(0, 100); // zemnil jsem cislo na pozici [0] na 100

    for(Integer x : myList) {
        System.out.println(x);
    }
    
    myList.clear();
    System.out.println("size of the arraylist = " + myList.size());

    
    
    }
    
}