package OOPS.Constructors;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    void show() {
        System.out.println("Employee Name: " + this.name + ", Salary: " + this.salary);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Vikash", 50000);
        Employee e2 = new Employee("Aman", 60000);

    
        e1.show();
        e2.show();
    }
}
