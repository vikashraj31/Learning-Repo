package OOP.Encapsulation;

// Encapsulation Example
class Student {

    // Private data (data hiding)
    private int age;
    private String name;

    
    // Setter for age (with condition)
    public void setAge(int a) {
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Main class
public class EncapsulationDemo {

    public static void main(String[] args) {

        Student s = new Student();

        // Setting values using setters
        s.setAge(22);
        s.setName("Vikash");

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        // Invalid value test
        s.setAge(-5);



    }
}
