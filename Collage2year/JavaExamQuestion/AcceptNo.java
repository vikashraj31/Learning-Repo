package JavaExamQuestion;

// Accept 10 numbers from command line and count even and odd numbers

public class AcceptNo {
    public static void main(String[] args) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 10; i++) {

            int number = Integer.parseInt(args[i]);

            if (number % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers count = " + even);
        System.out.println("Odd numbers count = " + odd);
    }
}
