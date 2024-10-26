import java.util.Scanner;
class Employee{
    Scanner sc = new Scanner(System.in);
    String EmployeeName;
    String City;
    double basicSalary,DA,HRA;

    public void getData(){
         System.out.print("Enter the name of the employee:");
         EmployeeName = sc.nextLine();
         System.out.print("Enter the name of the City:");
         City = sc.nextLine();
         System.out.print("Enter basic Salary:");
         basicSalary = sc.nextDouble();
         System.out.print("Enter Dearness Allowance:");
         DA = sc.nextDouble();
         System.out.print("Enter House Rent Allowance:");
         HRA = sc.nextDouble();
    }

    public double calculate(){
        return basicSalary+basicSalary*(DA/100)+basicSalary*(HRA/100);
    }

    public void display(){
        System.out.println("Employee name:"+EmployeeName);
        System.out.println("City Name:"+City);
        System.out.println("Basic Salary:"+basicSalary);
        System.out.println("Dearness Allowance:"+DA+"%");
        System.out.println("House Rent Allowance:"+HRA+"%");
        System.out.println("Total salary:"+calculate());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getData();
        e.display();
    }
}