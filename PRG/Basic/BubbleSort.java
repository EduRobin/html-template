public class BubbleSort {

   public static void main(String[] args) {

       int[] x = new int[5];
      for(int i=1; i<x.length; i++) {
         int temp=0;
         if(x[i-1] > x[i]) {
            temp = x[i-1];
            x[i-1] = x[i];
            x[i] = temp;
         }
      }
   

   
      for(int i=0; i<x.length; i++) { 
        System.out.print(x[i] + " ");
   }

   
      // TestBubbleSort
      BubbleSort b = new BubbleSort();
      int[] num = {5,4,3,2,1};
      b.sortArray(num);
      b.printArray(num);   
   
    }
}

        

    