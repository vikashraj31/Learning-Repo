package OOPS.Constructors;

class Laptop {
    String brand;
    float price;

    // Default constructor
    Laptop() {
        this.brand = "HP";
        this.price = 23040f;
    }

    // Parameterized constructor
    Laptop(String brand, float value) {
        this.brand = brand;
        this.price = value;
    }

    // Method to print details
    void print() {
        System.out.println("Brand: " + this.brand + ", Price: " + this.price);
    }
}

public class LaptopInfo {
    public static void main(String[] args) {

        Laptop L1 = new Laptop();                 // default constructor
        Laptop L2 = new Laptop("Apple", 22299f);  // parameterized constructor

        L1.print();
        L2.print();
    }
}
