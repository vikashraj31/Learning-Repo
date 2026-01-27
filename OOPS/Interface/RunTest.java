package OOPS.Interface;

// This is interface, it hides implementation and provides full abstraction
interface Machine {
    void start();
}

class Computer implements Machine {
    public void start() {
        System.out.println("Computer is starting");
    }
}

class WashingMachine implements Machine {
    public void start() {
        System.out.println("Washing Machine is starting");
    }
}

public class RunTest {
    public static void main(String[] args) {

        Machine m1 = new Computer();
        m1.start();

        Machine m2 = new WashingMachine();
        m2.start();
    }
}
