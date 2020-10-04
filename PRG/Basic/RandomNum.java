import java.util.Random;

class RandomNum {
    public static void main(String args[]) {
        
        Random rn = new Random();
        int randomNum;
        int[] array= new int[11];

        for(int i = 1; i < 11; i++) {
            randomNum = rn.nextInt(11);
            array[i] = randomNum;
            System.out.println("Random generated number: " + randomNum);
            
       
            System.out.println(" " + array[i] + " ");
        }
        
        

        
        
    }
}