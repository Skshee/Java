import java.util.Scanner;
class Q3Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(+(j+i-1)+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
