import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
   int a,b,i,gcd=0;
   System.out.println("Enter numbers:");
   Scanner sc= new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   for(i=1;i<=a;i++) // Assuming that a is smaller
   {
    if(a%i==0 && b%i==0)
    {
     gcd=i;
    }
   }
   System.out.println("The GCD is :"+gcd);
   sc.close();
    }
}

