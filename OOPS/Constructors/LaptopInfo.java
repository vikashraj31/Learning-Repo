package OOPS.Constructors;

class Laptop {
    String brand;
    float price;

    
    Laptop() {
        this.brand = "HP";
        this.price = 23040f;
    }

    Laptop(String brand, float value) {
        this.brand = brand;
        this.price = value;
    }

    
    void print() {
        System.out.println("Brand: " + this.brand + ", Price: " + this.price);
    }
}

public class LaptopInfo {
    public static void main(String[] args) {

        Laptop L1 = new Laptop();                 
        Laptop L2 = new Laptop("Apple", 22299f);  

        L1.print();
        L2.print();
    }
}
