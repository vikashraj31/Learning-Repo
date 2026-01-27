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
        
    }
}

public class MultiTest {
    
}
