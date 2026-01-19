package OOPS.Inheritance;

class Person {
    String name;

    // Parent constructor
    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {

    int roll;

    // Child constructor calling parent constructor
    Student(int roll, String studentName) {
        super(studentName);   // calls Person constructor
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
