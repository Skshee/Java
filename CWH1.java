interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class CWH1 implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public void say(){
        System.out.println("This is say method");
    }
    public static void main(String[] args) {
        CWH obj1 = new CWH();
        obj1.bark();
        obj1.say();
    }


}