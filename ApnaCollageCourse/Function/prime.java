package Function;

public class prime {

    static public void prime() {
        System.out.println("Number is prime");
    }

    static public void notPrime() {
        System.out.println("Number is not prime");
    }

    public static void main(String[] args) {

        int n = 5;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            prime();
        else
            notPrime();
    }
}
