package PractiseQA;
interface EmployeePractise{
    double calculateSalary();
    void Display();
}

class RegularEmployeePractise implements EmployeePractise{
    int employeeId;
    String employeeName;
    double basicSalary;

    RegularEmployeePractise(int employeeId,String employeeName,double basicSalary){
        this.employeeId=employeeId;
        this.employeeName= employeeName;
        this.basicSalary=basicSalary;
    }

    public double calculateSalary(){
        double da= basicSalary*(0.4);
        double hra= basicSalary*(0.2);
        double GrossSalary = basicSalary+da+hra;
        System.out.println(GrossSalary);
        double tax=basicSalary*0.5;
        System.out.println(tax);
        double NetSalary = GrossSalary-tax;
        System.out.println(NetSalary);
        return NetSalary;
    }

    public  void Display(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("NetSalary:"+ calculateSalary());
    }
}

class PractiseQ1{
    public static void main(String[] args) {
        RegularEmployeePractise r = new RegularEmployeePractise(123,"Suvan",5000);
        r.Display();
    }
}





