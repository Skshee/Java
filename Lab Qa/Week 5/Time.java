import java.util.Scanner;

class Time{
    int hours,minutes,seconds;

    Time(int hours,int minutes,int seconds){
         this.hours=hours;
         this.minutes=minutes;
         this.seconds=seconds;
    }

    Time add(Time t){
        int totalSeconds=this.seconds+t.seconds;
        int totalMinutes=this.minutes+t.minutes+totalSeconds/60;
        int totalHours=this.hours+t.hours+totalMinutes/60;

        return new Time(totalHours%12,totalMinutes%60,totalSeconds%60);
    }

    public void display(){
        System.out.println(+hours+":"+minutes+":"+seconds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time:");
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int s1=sc.nextInt();
        Time t1= new Time(h1,m1,s1);
        System.out.println("Enter the other time:");
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int s2=sc.nextInt();
        Time t2= new Time(h2,m2,s2);
        t1.display();
        t2.display();
        Time t3=t1.add(t2);
        t3.display();
    }
}