import java.util.LinkedList;


class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("Robin");
        myList.add("Oliver");
        myList.add("Vojta");
        myList.add("Boris");
        myList.addFirst("Ondra"); // tahle metoda nam přídá jmeno uplne nahoru
        myList.addLast("Jara"); // prida jmeno uplne dolu
        myList.removeLast(); // odstrani posledni jmeno
        myList.removeFirst(); // odstrani prvni jmeno
        myList.add(1, "Stefan"); // prida jmeno Stefan na pozici 1 v listu
        myList.remove(2); // odstrani jemno na pozici 2
        
        System.out.println("Size of the linked list = " + myList.size());

        for(String x : myList) {
            System.out.println(x);
        }

    }
}