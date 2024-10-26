import java.util.Scanner;

class ProductArrayElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=2;i<size;i++){
            if(arr[i]==arr[i-2]*arr[i-1])
            {
                System.out.println("Element"+arr[i]);
            }
        }
        sc.close();
    }
}