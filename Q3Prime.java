import java.util.Scanner;

class Q3Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number:");
        int m = sc.nextInt();
        System.out.print("Enter last number:");
        int n = sc.nextInt();
        int i;
        for(i=m;i<n;i++) 
        {
          boolean prime = true;
          for(int j=2;j<i/2;j++)
          {
            if(i%j==0)
            {
                prime = false;
                break;
            }
          }
          if(prime)
          {
            System.out.println(i);
          }
        }
    }
}
