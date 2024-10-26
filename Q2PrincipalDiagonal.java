import java.util.Scanner;

class Q2PrincipalDiagonal{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int sum=0;
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    System.out.println("A Principal diagonal element is "+arr[i][j]);
                    sum=sum+arr[i][j];
                }
            }
        }
         System.out.println("The sum of the principal diagonal elements is:"+sum);
         sc.close();
      }
}