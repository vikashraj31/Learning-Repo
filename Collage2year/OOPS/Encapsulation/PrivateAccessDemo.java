package OOPS.Encapsulation;

class Employee {
    private int salary;

    // public void setSalary(int salary) {
    //     this.salary = salary;
    // }

    // public int getSalary() {
    //     return salary;
    // }

}

public class PrivateAccessDemo {
    public static void main(String[] args) {

        Employee e = new Employee();

        // e.setSalary(50000);

        e.salary = 50000;   //  Compile-time error
        System.out.println(e.salary); // Compile-time error
    }
}
