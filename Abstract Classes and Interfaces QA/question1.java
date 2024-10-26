
abstract class Pen{
    abstract void write();
    abstract void Refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void Refill(){
        System.out.println("Refilling");
    }
    void ChangeNib(){
        System.out.println("Changing nib");
    }

class Ballpen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void Refill(){
        System.out.println("Refilling");
    }
}
 public class question1{
    public static void main(String[] args){
         FountainPen pen = new FountainPen();
         pen.ChangeNib();
         //pen.Refill();
        }
    }
}