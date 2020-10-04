
import java.util.*;
public class ListIterator {
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Steve");
     list.add("Carl");
     list.add("Raj");

    
     list.addFirst("Negan");

     
     list.addLast("Rick");

     
     list.add(2, "Glenn");

     
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
} 