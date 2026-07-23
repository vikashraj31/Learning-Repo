package OOPS.Abstraction;

// Abstract class (Class ko abstract krna hoga tabhi us class me kuch hide kr skte hai)
abstract class Animal {

    // Abstract method (no body)
    abstract void sound(); 
    // jaise yaha abstract keyword use nhi krte to method define krna padhta

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Dog class
class Dog extends Animal {
    
    // yah abstract wala method use kr rha hai jo main class me hide hai 
    void sound() {
        System.out.println("Dog barks");
    }

    // Isko normal method override kr skte hai 
    void eat(){
        System.out.println("Dog eats chicken");
    }
}

// Cat class
class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {

        // ❌ Animal a = new Animal();  (not allowed because Animal is abstract)

        Animal a;   // parent reference

        a = new Dog();
        a.eat();
        a.sound();

        a = new Cat();
        a.sound();

    }
}
