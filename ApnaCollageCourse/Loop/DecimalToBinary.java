public class DecimalToBinary {
    public static void main(String[] args) {

        int n = 10;
        int binary = 0;
        int pow = 0;

        while(n > 0) {
            int rem = n % 2;
            binary = binary + rem * (int)Math.pow(10, pow);
            pow++;
            n = n / 2;
        }

        System.out.println(binary);
    }
}
