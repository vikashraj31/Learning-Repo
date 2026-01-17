package OOP.Interfaces;

// Interface 1
interface Subject {   // all methods are public and abstract by default
    void name();
}

// Interface 2
interface Hervorus {
    void type();
}

// Class implementing multiple interfaces
class Maths implements Subject, Hervorus {

    public void name() {
        System.out.println("Subject is Maths");
    }

    public void type() {
        System.out.println("Category is Science Subject");
    }
}

// Main class
public class InterfaceDemo {

    public static void main(String[] args) {

        Subject s = new Maths();   // interface as reference type
        s.name();

        Hervorus h = new Maths();  // another interface reference
        h.type();
    }
}
