package OOP.Abstract;

// Abstract class
abstract class Animal {

    abstract void walk();   // abstract method

    public void eat() {     // concrete method
        System.out.println("Eat everything");
    }
}

// Hen class
class Hen extends Animal {

    public void walk() {
        System.out.println("2 Legs");
    }

    public void eat() {
        System.out.println("Grass");
    }
}

// Cow class
class Cow extends Animal {

    public void walk() {
        System.out.println("4 Legs");
    }

    public void eat() {
        System.out.println("Gives Milk");
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {

        Animal h1 = new Hen();   // abstraction
        Animal c1 = new Cow();  // abstraction

        h1.walk();
        h1.eat();

        c1.walk();
        c1.eat();
    }
}
