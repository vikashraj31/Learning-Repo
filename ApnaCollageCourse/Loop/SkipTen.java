import java.util.Scanner;

public class SkipTen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to enter: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter number ");
            int num = sc.nextInt();

            if(num == 10) {
                continue;   // skip printing 10
            }

            System.out.println("Your No : " + num);
        }

        
    }
}
