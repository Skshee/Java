import java.util.Scanner;

class Q3SymmetricMatrix{
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        int check = 0;
        if(rows!=columns){
            System.out.println("It cannot be symmetric as it is not a square matrix");
        }

        if(rows==columns)
        {
            System.out.println("Enter the elements:");
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    if(arr[i][j]!=arr[j][i])
                    {
                        check=1;
                        break;
                    }
                }
            }
            if(check==0){
            System.out.println("It is a symmetric matrix");
            }
            else{
            System.out.println("It is not a symmetric matrix");
            }
        }
        sc.close();
    }
}