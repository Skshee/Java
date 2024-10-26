import java.util.*;

interface StudentInterface{
    public int ComputeTotal();
}

class Student implements StudentInterface{
    int REGNumber;
    String name;

    public Student(int REGNumber,String name)
    {
        this.REGNumber=REGNumber;
        this.name=name;
    }
    public int ComputeTotal(){
       return -1; 
    }
}

class UGStudent extends Student implements StudentInterface{
    int sessional;
    int assignments;
    int endsems;
    int total; 
    
    public UGStudent(int REGNumber,String name)
    {
        super(REGNumber,name);
    }

    public void setUGStudent(int sessional,int assignments,int endsems){
        this.sessional=sessional;
        this.assignments=assignments;
        this.endsems=endsems;
    }

    public int ComputeTotal()
    {
        total = sessional + assignments + endsems;
        return total;
    }

    public void Display(){
        ComputeTotal();
        System.out.println("The total marks is:"+total);
    }


public static void main(String[] args)
{
    UGStudent student= new UGStudent(123,"Suvan");
    student.setUGStudent(20,29,47);
    student.Display();
}
}
