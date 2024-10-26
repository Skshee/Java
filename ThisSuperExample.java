
class EkClass1{ 
int a; 
public int getA() { 
return a; 
} 
EkClass1(int a){ 
this.a = a;
 } 
public int returnone(){
 return 1; 
} 
} 
class DoClass1 extends EkClass1
{
 DoClass1(int c)
 { 
    super(c); 
    System.out.println("I am a constructor");
 } 
} 
public class ThisSuperExample { 
public static void main(String[] args) {
 EkClass1 e = new EkClass1(65); 
DoClass1 d = new DoClass1(5); 
System.out.println(e.getA());
 }
 }