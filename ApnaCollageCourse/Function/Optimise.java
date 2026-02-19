package Function;

public class Optimise {
    public static void main(String[] args) {

        int n = 66;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else if (n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("No is Prime");
        else
            System.out.println("No is not Prime");
    }
}
