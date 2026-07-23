package OOPS.Interface;

interface Payment {
    void pay();

    default void receipt() {
        System.out.println("This is Receipt function");
    }
}

interface Security {
    void verify();
}

class OnlinePayment implements Payment, Security {

    //Alwaya use public berfor using interface function
    public void pay() {
        System.out.println("Pay");
    }

    public void verify() {
        System.out.println("Verify");
    }
}

public class FinalTest {
    public static void main(String[] args) {

        OnlinePayment O1 = new OnlinePayment();

        O1.pay();
        O1.verify();
        O1.receipt();   // default method called using object
        // Note: Static method is called using interface name
        // Default method is called using object and provides common implementation

    }
}
