import java.util.Scanner;
class Q1Box{
    double l,w,h,volume;
    
    public void SetDimensions(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    public double volume(){
           volume =  l*w*h;
           return volume;
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Q1Box mybox = new Q1Box();
           System.out.println("Enter dimensions");
           int l=sc.nextInt();
           int w=sc.nextInt();
           int h=sc.nextInt();
           mybox.SetDimensions(l,w,h);
           System.out.println("Volume is:"+mybox.volume());
    }
}