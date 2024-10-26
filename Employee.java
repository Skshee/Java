class EmployeeDetails {
    
        double empsalary;
        String empname;
        public double getSalary(){
            return empsalary;
        }
        public String getName(){
            return empname;
        }
        public void setName (String name){
            empname=name;
        }
        public void setSalary (double salary){
            empsalary=salary;
        }
    }

    public class Employee{
    public static void main(String[] args) {
        EmployeeDetails emp=new EmployeeDetails();
        emp.setName("Suvan Kumar Shee ");
        System.out.println(emp.getName());
        emp.setSalary(2000);
        System.out.println(emp.getSalary());
    } 
}
    



