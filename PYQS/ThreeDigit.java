import java.util.Scanner;

class ThreeDigit {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int num = sc.nextInt();
        int sum=0;
        int first,middle,last;
        
        first=(num/100)%10;
        //System.out.println(first);
        middle=(num/10)%10;
       // System.out.println(middle);
        last=num%10;
       // System.out.println(last);
        
        sum=first+last;
        

        if(middle==sum)
        {
            System.out.println("The divisors of "+middle+"are:");
            for(int i=1;i<=middle;i++)
            {
                if(middle%i==0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("Sum of first and last digit is:"+sum);
        }
        sc.close();
      }
}
