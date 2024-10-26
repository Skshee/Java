
interface BasicAnimal {
    void eat();
    void sleep();
}

   class Monkey implements BasicAnimal{
   public void eat(){
    System.out.println("Eating");
   }
   public void sleep(){
    System.out.println("Sleeping");
   }
   void bite(){
    System.out.println("Biting");
   }
    void jump(){
    System.out.println("Jumping");
   }
}

public class Question2 {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.bite();
        m.sleep();
        m.eat();
        m.jump();
    }
}
