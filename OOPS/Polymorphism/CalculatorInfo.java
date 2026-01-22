package OOPS.Polymorphism;

class Calculator {

    
    int calculation(int x, int y) {
        return x + y;
    }
    int calculation(int x, int y, int z) {
        return x + y + z;
    }

    int calculation(double x, double y) {
        return (int)(x - y);
    }

}

public class CalculatorInfo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        // In this way we can give value but proble in printing because all function has name same 

        // c.calculation(2, 3);
        // c.calculation(1,2,3);
        // c.calculation(23.2, 2.34);

        //This is solution for above problem
        int r1 = c.calculation(2, 3);
        int r2 = c.calculation(1, 2, 3);
        int r3 = c.calculation(23.2, 2.34);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        //This is direct methor to give data and print them
        // System.out.println("Sum of 2 numbers: " + c.calculation(10, 5));
        // System.out.println("Sum of 3 numbers: " + c.calculation(10, 5, 2));
        // System.out.println("Subtraction: " + c.calculation(10.5, 5.5));
    }
}
