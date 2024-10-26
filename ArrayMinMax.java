import java.util.*;


public class ArrayMinMax {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size:");
      int size = sc.nextInt();
      int numbers[] = new int[size];

      //input
      System.out.println("Enter array elements:");
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }

       int max= numbers[0];
       int min= numbers[0];
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
       sc.close();
   }
}


