import java.util.Scanner;

class Complex{
    int real1,real2,im1,im2;
    public void add(int real1,int real2,int im){
        System.out.println("Sum is:"+(real1+real2)+"+i"+im);
    }
    public void add(int real1,int real2,int im1,int im2){
        System.out.println("Sum is:"+(real1+real2)+"+i"+(im1+im2));
    }

    public static void main(String[] args) {
        System.out.println("Enter values to add real and complex numbers:");
        Scanner sc = new Scanner(System.in);
        int real1=sc.nextInt();
        int real2=sc.nextInt();
        int im=sc.nextInt();
        //int im2=sc.nextInt();
        Complex c = new Complex();
        c.add(real1,real2,im);
        System.out.println("Enter values to add 2 complex numbers:");
         int real3=sc.nextInt();
         int real4=sc.nextInt();
         int im1=sc.nextInt();
         int im2=sc.nextInt();
         c.add(real3,real4,im1,im2);
         sc.close();
    }
}