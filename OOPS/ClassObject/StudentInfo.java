package OOPS.ClassObject;

class Student {
    int age;
    String name;
    String section;

    final String School = "DAV";   // fixed for all students (cannot be changed)
    final String DN = "Vikash";    
}

public class StudentInfo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Ram";

        //s1.School = "SAV";  final things can not be change from main function

        System.out.println("Age is " + s1.age +
                           ", Name is " + s1.name +
                           ", DN is " + s1.DN +
                           ", School is " + s1.School);
    }
}
