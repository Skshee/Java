class Circle{
    public int radius; // Adding PUBLIC is IMPORTANT

    Circle(int r){
        System.out.println("This is a circle");
        this.radius = r;
    }
    public double Area(){
        System.err.println("The Area of Circle is:");
        return radius*radius;
    }
    
    public double Circumference(){
        System.err.println("The Circumference of Circle is:");
        return 2*3.14*radius;
    }
}

class Cylinder extends Circle{
    //int radius; // Radius will be taken from Circle
   public int height; // Adding PUBLIC is IMPORTANT

    Cylinder(int r,int h){
        super(r);
        System.out.println("This is a cylinder");
        this.height = h;
    }

    public double SurfaceArea(){
        System.err.println("The Area of Cylinder is:");
        return 2*3.14*radius*height;
    }

    public double Volume(){
        System.err.println("The Volume of Cylinder is:");
        return 3.14*radius*height;
    }

}

public class Practice_Q1 {
    public static void main(String arg[]){
        Cylinder obj = new Cylinder(12,4);
        System.out.println(obj.SurfaceArea());
        System.out.println(obj.Volume());

    }
}
