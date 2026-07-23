package JavaExamQuestion;

// Constructor overloading to calculate area of rectangle

class Rectangle {

    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int result = length * breadth;
        System.out.println("Area = " + result);
    }
}


public class ConstructorOverload {

     public static void main(String[] args) {

        Rectangle r1 = new Rectangle();   // default
        r1.area();

        Rectangle r2 = new Rectangle(10, 5); // parameterized
        r2.area();
    }
}
    
