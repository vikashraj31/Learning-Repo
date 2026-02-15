import java.util.Scanner;

public class BreakDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            if(i == 3) {
                break;   // loop stops when i = 3
            }

            System.out.println(i);
        }

        sc.close();
    }
}
