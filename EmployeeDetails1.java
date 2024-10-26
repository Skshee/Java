abstract class Employee1{
    int employeeId;
    String employeeName;
    double basicSalary;

    public Employee1(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public abstract double NetSalary();
    public abstract void Display();
}


class RegularEmployee extends Employee1{
    public RegularEmployee(int employeeId,String employeeName,double basicSalary){
    super(employeeId,employeeName,basicSalary);
}
    @Override
    public double NetSalary(){
        double DA = basicSalary*0.40;
        double HRA = basicSalary*0.10;
        double GrossSalary = DA + HRA;
        double tax = basicSalary*0.5;
        double NetSalary = GrossSalary-tax;
        return NetSalary;
    }

    @Override
    public void Display(){
        System.out.println("Regular Employee ID is :"+employeeId);
        System.out.println("Regular Employee Name is:"+employeeName);
        System.out.println("Regular Employee Salary is:"+NetSalary());
    }
}

class ContractEmployee extends Employee1{
    public ContractEmployee(int employeeId,String employeeName,double basicSalary){
    super(employeeId,employeeName,basicSalary);
}
    @Override
    public double NetSalary(){
        double DA = basicSalary*0.40;
        double HRA = basicSalary*0.10;
        double GrossSalary = basicSalary + DA + HRA;
        double tax = basicSalary*0.5;
        double NetSalary = GrossSalary-tax;
        return NetSalary;
    }

    @Override
    public void Display(){
        System.out.println("Contract Employee ID is :"+employeeId);
        System.out.println("Contract Employee Name is:"+employeeName);
        System.out.println("Contract Employee Salary is:"+NetSalary());
    }
}


public class EmployeeDetails1{
      public static void main(String[] args){
    RegularEmployee r = new RegularEmployee(1,"Suvan",5000);
 ContractEmployee c = new ContractEmployee(2,"Bellam",2000);

      r.Display();
      c.Display();
      }
}