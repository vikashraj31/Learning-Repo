package OOPS.Constructors;

class Student {
    int age;
    String name;
    String section;

    // Constructor using this keyword
    Student(int age, String name, String section) {
        this.age = age;
        this.name = name;
        this.section = section;
    }
}

public class StudentMultiple {
    public static void main(String[] args) {

        Student s1 = new Student(21, "Vikash", "A");
        Student s2 = new Student(22, "Aman", "D");
        Student s3 = new Student(20, "Ram", "C");

        System.out.println("Name: " + s1.name + ", Age: " + s1.age + ", Section: " + s1.section);
        System.out.println("Name: " + s2.name + ", Age: " + s2.age + ", Section: " + s2.section);
        System.out.println("Name: " + s3.name + ", Age: " + s3.age + ", Section: " + s3.section);
    }
}
