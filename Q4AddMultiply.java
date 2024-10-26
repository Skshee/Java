import java.util.Scanner;

class Q4AddMultiply{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the first matrix:");
        int rows1 = sc.nextInt();
        int columns1 = sc.nextInt();
        int[][] arr1 = new int[rows1][columns1];

        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the rows and columns of the 2nd matrix:");
        int rows2 = sc.nextInt();
        int columns2 = sc.nextInt();
        int[][] arr2 = new int[rows2][columns2];

        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<rows2;i++){
            for(int j=0;j<columns2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Addition:");
        if(rows1==rows2 && columns1==columns2)
        {
            int[][] sum= new int[rows1][columns1];
            System.out.println("Addition is possible");
            System.out.println("The sum matrix is:");
            for(int i=0;i<rows1;i++){
                for(int j=0;j<columns1;j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }     
        }
        else{
            System.out.println("AAddition is not possible");
        }

        System.out.println("Multiplication:");
        if(columns1==rows2)
        {
            int k=columns1=rows2;
            System.out.println("Multiplication is possible:");
            int[][] C = new int[rows2][columns1];
            for(int i=0;i<rows1;i++){
                for(int j=0;j<columns2;j++){
                    C[i][j]=0;
                }
            }
            for(int i=0;i<k;i++){
                for(int j=0;j<k;j++){
                    C[i][j]=C[i][j]+arr1[i][j]*arr2[i][j];
                    System.out.print(C[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication not possible");
        }
        sc.close();
    }

}