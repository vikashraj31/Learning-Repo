import java.util.Scanner;

class CheckNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total numbers: ");
        int c = sc.nextInt();

        int pos = 0;
        int neg = 0;

        System.out.println("Enter numbers:");

        for (int i = 0; i < c; i++) {
            int s = sc.nextInt();

            if (s > 0) {
                pos++;
            } else if (s < 0) {
                neg++;
            }
        }

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
    }
}
