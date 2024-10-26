package Suvan;
interface EmpImpl{
    double NetSalary(double basicSalary);
    void Display();
}

class RegularEmployee1 implements EmpImpl{
    int ID;
    String name;
    double basicSalary;
    double NetSalary;

    public RegularEmployee1(int ID,String name,double basicSalary){
            this.ID=ID;
            this.name=name;
            this.basicSalary=basicSalary;
    }
    
  @Override
  public double NetSalary(double basicSalary) {
    
    double DA = basicSalary*0.40;
    
    double HRA = basicSalary*0.10;
    
    double GrossSalary = DA + HRA;
    
    double tax = basicSalary*0.2;
    
    double NetSalary = GrossSalary-tax;
    
    return NetSalary;
  }

  public void Display(){
    System.out.println("ID is "+ID);
    System.out.println("Name is "+name);
    System.out.println("BasicSalary is "+basicSalary);
  }
}


public class PackageEx {
public static void main(String[] args) {
    RegularEmployee1 emp1 = new RegularEmployee1(1,"Suvan",5000);
    emp1.Display();
    double result=emp1.NetSalary(5000);
    System.out.println(result);
}
}

