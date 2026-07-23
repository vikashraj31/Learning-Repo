package OOPS.Polymorphism;

class Shave {

    void draw() {
        System.out.println("This is shave class");
    }
}

class Circle extends Shave {

    void draw() {
        System.out.println("This is Circle Class");
    }
}

class Rectange extends Shave {

    void draw() {
        System.out.println("This is Rectange class");
    }
}

// Main
public class ShapeInfo {
    public static void main(String[] args) {

        Shave s = new Circle(); //Runtime polymorphism
        // Here creating Shave type reference but object is of Circle

        // Circle c = new Rectange();  
        // Here same but we cannot create because Rectangle is not a child of Circle
        // (Sibling classes cannot be assigned to each other)

        s.draw();   // Calls Circle's draw() at runtime (polymorphism)

        // Now try another object
        s = new Rectange();
        s.draw();   // Calls Rectangle's draw()
    }
}
