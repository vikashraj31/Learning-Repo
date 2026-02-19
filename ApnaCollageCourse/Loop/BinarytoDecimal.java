public class BinarytoDecimal {
    public static void main(String[] args) {

        int n = 100101010;

        int dec = 0;
        int pow = 0;

        while (n != 0) {
            int last = n % 10;   
            dec = dec + (last * (int)Math.pow(2, pow)); //type caste kiye hai yaha
            pow++;
            n = n / 10;
        }

        System.out.println(dec);
    }
}
