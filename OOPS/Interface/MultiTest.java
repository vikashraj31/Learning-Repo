package OOPS.Interface;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

//Multi Interface implements
class OfficeMachine implements Printable, Scannable {

    public void print() {
        System.out.println("This is Print Function");
    }

    public void scan() {
        System.out.println("This is Scan Function");
    }
}

public class MultiTest {
    public static void main(String[] args) {

        OfficeMachine om = new OfficeMachine();
        om.print();
        om.scan();
    }
}
