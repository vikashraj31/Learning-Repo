package OOPS.ClassObject;


class Student {
    void show() {
        System.out.println("Student details");
    }
}

public class NullObjectDemo {
    public static void main(String[] args) {

        Student s = new Student();   // object created
        s.show();                   // works fine
    }
}
