public class palindrome {
    public static void main(String[] args) {

        int num = 232;
        int original = num;   // save original
        int reverse = 0;

        while (num > 0) {
            int last = num % 10;
            reverse = reverse * 10 + last;
            num = num / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
