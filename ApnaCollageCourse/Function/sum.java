package Function;
import java.util.*;

public class sum {

    static Scanner sc = new Scanner(System.in);

    static public int scan() {
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return sum(a, b);
    }

    static public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = scan();
        System.out.println("Sum is " + result);
    }
}
