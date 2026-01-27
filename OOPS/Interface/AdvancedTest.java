package OOPS.Interface;

interface Device {

    void turnOn();

    default void showType() {
        System.out.println("This is SmartPhone");
    }

    static void info() {
        System.out.println("Device interface information");
    }
}

class Mobile implements Device {

    public void turnOn() {
        System.out.println("Phone is turned ON");
    }
}

public class AdvancedTest {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.turnOn();
        m1.showType();   // default method from interface

        Device.info();  // static method called using interface name
    }
}
