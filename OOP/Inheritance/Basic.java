package OOP.Inheritance;

// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class Basic {

    public static void main(String[] args) {

        Dog d = new Dog();   // child object

        d.eat();   // inherited from Animal
        d.bark();  // own method
    }
}
