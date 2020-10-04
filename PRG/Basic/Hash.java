
import java.util.*;
public class Hash {
   public static void main(String args[]){

     HashSet<String> name = new HashSet<String>(3);
     name.add("Steve");
     name.add("Carl");
     name.add("Raj");
     

     
     Iterator<String> iterator = name.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
} 