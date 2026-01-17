import java.util.Scanner;

public class CheckMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int max = sc.nextInt();
        for(int i = 1; i < 10; i++) {
            int n = sc.nextInt();

            if(n > max) {
                max = n;
            }
        }

        System.out.println("Maximum number is " + max);
    }
}
