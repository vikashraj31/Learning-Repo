package OOPS.Abstraction;

// Abstract parent class
abstract class Person {

    // Abstract method (must be implemented by child classes)
    abstract void work();

    // Normal method
    void eat() {
        System.out.println("Person eats food");
    }
}

class Man extends Person {

    // Implementing abstract method
    void work() {
        System.out.println("Man works in office");
    }

    // Overriding normal method
    void eat() {
        System.out.println("Men eat food");
    }
}

// In this class eat() is not overridden, so Person's eat() will run
class Female extends Person {

    void work() {
        System.out.println("Female works at home");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {

        Person p1 = new Man();
        p1.work();
        p1.eat();

        Person p2 = new Female();
        p2.work();
        p2.eat();
    }
}
