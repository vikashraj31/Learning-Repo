package Class;
import java.util.*;

class table {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int start = 1;

        for (int i = 1; i <= 10; i++) {
            start = i * T;
            System.out.println(T + " x " + i + " = " + start);
        }

    }
}
