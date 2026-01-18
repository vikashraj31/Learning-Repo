package OOPS.Constructors;

class Pen {
    String type;
    String name;

    // Parameterized Constructor
    Pen(String type, String name) {
        this.type = type;
        this.name = name;
    }

    // Default Constructor
    Pen() {
        this.type = "Not Defined";
        this.name = "Not Defined";
    }

    // Copy Constructor
    Pen(Pen p) {
        this.type = p.type;
        this.name = p.name;
    }

    void print() {
        System.out.println("Type is " + this.type);
        System.out.println("Name is " + this.name);
        System.out.println();
    }
}

public class ClassObject {
    public static void main(String[] args) {

        Pen p1 = new Pen("Ball", "Agni");
        System.out.println("Pen 1 is " + p1.type + "\n");

        Pen p2 = new Pen("Gel", "Super");

        p1.print();
        p2.print();

        // Default constructor
        Pen p3 = new Pen();
        p3.print();

        // Copy constructor
        Pen p4 = new Pen(p1);
        p4.print();
    }
}
