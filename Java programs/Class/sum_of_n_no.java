package Class;
import java.util.*;

class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt(); // use scan items

        int sum = 0;

        for (int a = 1; a <= n; a++) {
            sum = sum + a;
        }

        System.out.println("Sum = " + sum);
    }
}
