package OOPS.ClassObject;

class Car {
    String brand;
    int speed;

    void showDetails() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed);
    }
}

public class CarInfo {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.speed = 300;
        c1.brand = "BMW";

        Car c2 = new Car();
        c2.speed = 250;
        c2.brand = "XUV700";

        // Calling methods
        c1.showDetails();
        c2.showDetails();
    }
}
