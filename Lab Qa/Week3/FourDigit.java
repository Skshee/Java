    import java.util.Scanner;

    class FourDigit{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Case-1");
            System.out.println("Enter the 4 numbers:");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            int n4=sc.nextInt();
            int num1=0,num2=0,num3=0,num4=0;
            System.out.println("Case-1");
            for(int i=0;i<4;i++){
                    if(i==0)
                    {
                        num1=n1;
                    }
                    if(i==1)
                    {
                        num1=n2;
                    }
                    if(i==2)
                    {
                        num1=n3;
                    }
                    if(i==3)
                    {
                        num1=n4;
                    }
                for(int j=0;j<4;j++){
                    if(j==0)
                    {
                        num2=n1;
                    }
                    if(j==1)
                    {
                        num2=n2;
                    }
                    if(j==2)
                    {
                        num2=n3;
                    }
                    if(j==3)
                    {
                        num2=n4;
                    }
                for(int k=0;k<4;k++){
                    if(k==0)
                    {
                        num3=n1;
                    }
                    if(k==1)
                    {
                        num3=n2;
                    }
                    if(k==2)
                    {
                        num3=n3;
                    }
                    if(k==3)
                    {
                        num3=n4;
                    }
                for(int l=0;l<4;l++){
                    if(l==0)
                    {
                        num4=n1;
                    }
                    if(l==1)
                    {
                        num4=n2;
                    }
                    if(l==2)
                    {
                        num4=n3;
                    }
                    if(l==3)
                    {
                        num4=n4;
                    }
                    System.out.print(""+num1+""+num2+""+num3+""+num4+ " ");
                            }
                        }
                    }
                }
                sc.close();
                System.out.println();
                System.out.println("Case 2");
                for(int i=0;i<4;i++){
                    if(i==0)
                    {
                        num1=n1;
                    }
                    if(i==1)
                    {
                        num1=n2;
                    }
                    if(i==2)
                    {
                        num1=n3;
                    }
                    if(i==3)
                    {
                        num1=n4;
                    }
                for(int j=0;j<4;j++){
                    if(j==0)
                    {
                        num2=n1;
                    }
                    if(j==1)
                    {
                        num2=n2;
                    }
                    if(j==2)
                    {
                        num2=n3;
                    }
                    if(j==3)
                    {
                        num2=n4;
                    }
                for(int k=0;k<4;k++){
                    if(k==0)
                    {
                        num3=n1;
                    }
                    if(k==1)
                    {
                        num3=n2;
                    }
                    if(k==2)
                    {
                        num3=n3;
                    }
                    if(k==3)
                    {
                        num3=n4;
                    }
                for(int l=0;l<4;l++){
                    if(l==0)
                    {
                        num4=n1;
                    }
                    if(l==1)
                    {
                        num4=n2;
                    }
                    if(l==2)
                    {
                        num4=n3;
                    }
                    if(l==3)
                    {
                        num4=n4;
                    }
                    if(num1!=num2||num1!=num3||num1!=num4||num2!=num3||num2!=num4
                    ||num3!=num4){
                    System.out.print(""+num1+""+num2+""+num3+""+num4+" ");
                    }
                            }
                        }
                    }
                }
            }
        }  