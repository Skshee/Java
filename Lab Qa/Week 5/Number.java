import java.util.Scanner;
class Number{
    private int num;
     
      Number(int num)
      {
        this.num=num;
      }
      boolean isZero(){
        return num==0;
      }
      boolean isPositive(){
        return num>0;
      }
      boolean isNegative(){
        return num<0;
      }
      boolean isOdd(){
        return num%2!=0;
      }
      boolean isEven(){
        return num%2==0;
      }
      boolean isPrime(){
        int check=0;
        for(int i=1;i<num/2;i++){
            if(num%i==0){
                check=1;
                break;
            }
        }
        return check==0;
      }
      boolean isArmstrong(){
        int sum=0,rem;
        int number=num;
        for(int i=0;num>0;i++)
        {
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        //System.out.println(sum);
        return sum==number;
      }

      public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        Number n = new Number(num);
        System.out.println(n.isZero());
        System.out.println(n.isPositive());
        System.out.println(n.isNegative());
        System.out.println(n.isOdd());
        System.out.println(n.isEven());
        System.out.println(n.isPrime());
        System.out.println(n.isArmstrong());
        sc.close();
      }
}