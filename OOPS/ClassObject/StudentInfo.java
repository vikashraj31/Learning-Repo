package OOPS;

// This is Student class
class Student {
    int age;
    String name;
    String section;

    final String School = "DAV";   // fixed for all students
    final String DN = "Vikash";    // cannot be changed
}

public class StudentInfo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Ram";

        // s1.School = "SAV";  //  cannot change final variable
        // s1.DN = "Rahul";    //  cannot change final variable

        System.out.println("Age is " + s1.age +
                           ", Name is " + s1.name +
                           ", DN is " + s1.DN +
                           ", School is " + s1.School);
    }
}
