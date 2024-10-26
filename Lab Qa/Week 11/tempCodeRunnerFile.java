import java.util.ArrayList;
import java.util.EmptyStackException;

// Generic stack class
class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    // Push an element onto the stack
    public void push(T element) {
        stack.add(element);
    }

    // Pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek at the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

// Student class
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

// Employee class
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

// Main class to demonstrate the use of the GenericStack
public class Main {
    public static void main(String[] args) {
        // Using the stack with Student objects
        GenericStack<Student> studentStack = new GenericStack<>();
        studentStack.push(new Student("Alice", 1));
        studentStack.push(new Student("Bob", 2));

        System.out.println("Popped from student stack: " + studentStack.pop());
        System.out.println("Top of student stack: " + studentStack.peek());

        // Using the stack with Employee objects
        GenericStack<Employee> employeeStack = new GenericStack<>();
        employeeStack.push(new Employee("John", 50000));
        employeeStack.push(new Employee("Jane", 60000));

        System.out.println("Popped from employee stack: " + employeeStack.pop());
        System.out.println("Top of employee stack: " + employeeStack.peek());
    }
}
