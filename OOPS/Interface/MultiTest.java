package OOPS.Interface;

interface Printable {
    void print();

}

interface Scannable{
    void scan();
}

class OfficeMachine implements Printable, Scannable {
    public void print() {
        System.out.println("This is Print Function");
        
    }

    public void scan() {
        System.out.println("This is Print Scan");
    }
}

public class MultiTest {
    
}
