package StringBuilder;

public class Clearbit {
    public static void main(String[] args) {
        int n = 5;      // 0101
        int pos = 2;

        int bitMask = 1 << pos;      // 0100
        int notBitMask = ~bitMask;   // 1011 (32-bit)

        int result = notBitMask & n;
        System.out.println(result);
    }
}
