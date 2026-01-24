package OOPS.Inheritance;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

//Extended class with extra input and super class 
class Student extends Person {
    
    int roll;
    Student(int roll, String studentName) {
        super(studentName); // super(studentName) is used instead of directly assigning to the variable
                            // because the parent (father) class has a parameterized constructor that
                            // must be called to initialize its own data.
        this.roll = roll;
    }

    void show() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class PersonInfo {
    public static void main(String[] args) {

        Student s1 = new Student(240525, "Vikash");
        s1.show();
    }

}
