import java.util.Scanner;

class Square {
      int side;
      public int getArea(int side){
        return side*side;
      }
      public int getPerimeter(int side){
        return 4*side;
      }
}

class Circle {
 int radius;

 public double getArea(int radius){
  return 3.1418*radius*radius;
}
public double getPerimeter(int radius){
  return 2*3.1418*radius;
}
}

class Rectangle{
  private int length;
  private int breadth;

  public double getArea(int length, int breadth){
    return length*breadth;
  }

  public double getPerimeter(int length, int breadth){
    return 2*(length+breadth);
  }


public Rectangle(int length, int breadth){
  this.length = length;
  this.breadth = breadth;
}

public class geometry{
  public static void main(String[] args) {
    Square sq = new Square();
    System.out.println("Enter the side");
    Scanner sc = new Scanner(System.in);
    sq.side=sc.nextInt();
    System.out.println("Area is "+sq.getArea(sq.side));
    System.out.println("Perimeter is "+sq.getPerimeter(sq.side));

  Circle c = new Circle();
  System.out.println("Enter the radius");
  c.radius= sc.nextInt();
  System.out.println("Area is "+c.getArea(c.radius));
  System.out.println("Perimeter is "+c.getPerimeter(c.radius));

  Rectangle rec = new Rectangle(9, 12);
  System.out.println("Enter length and breadth");
  rec.length= sc.nextInt();
  rec.breadth = sc.nextInt();
  System.out.println("Area is "+rec.getArea(rec.length,rec.breadth));
  System.out.println("Perimeter is "+rec.getPerimeter(rec.length, rec.breadth));
  }
}
}


