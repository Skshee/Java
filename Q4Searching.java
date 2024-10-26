import java.util.Scanner;

class Q4Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+(i+1)+" element:");
            arr[i]=sc.nextInt();
        }
        int found=0;
        int c=0;
        System.out.print("Enter element to be searched:");
        int element = sc.nextInt();
        for (int i : arr)
        {
            if(i==element)
            {
                found = found + 1;
                System.out.println("a"+"["+c+"]");
            }
            c++;
        }
        if(found==0)
        {
            System.out.println("Element is not in the array");
        }
    }
}
