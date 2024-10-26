import java.util.Scanner;

public class Factorial {
   // A METHOD to calculate the factorial of a number
   public static int factorial(int num) {
      if (num == 0) {
         return 1;
      } else {
         return num * factorial(num - 1);
      }
   }

   public static void main(String[] args) {
      System.out.println("Enter the number:");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      sc.close(); // Closing the scanner
      System.out.println(factorial(num));
   }
}
