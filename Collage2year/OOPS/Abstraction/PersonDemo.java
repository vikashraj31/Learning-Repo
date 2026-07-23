package OOPS.Abstraction;

// As this is abstract class, it hides implementation details
abstract class Person {

    // Constructor of abstract class
    Person() {
        System.out.println("Person created");
    }

    // Abstract method (must be implemented by child classes)
    abstract void work();
}

// Child class Man
class Man extends Person {

    void work() {
        System.out.println("Man works at Apple");
    }
}

// Child class Female
class Female extends Person {

    void work() {
        System.out.println("Female works at home");
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Man();   // parent reference, child object
        p1.work();

        Person p2 = new Female();
        p2.work();
    }
}
