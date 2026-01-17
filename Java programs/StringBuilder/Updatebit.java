package StringBuilder;

public class Updatebit {
    public static void main(String[] args) {
        int n = 5;     // 0101
        int pos = 2;

        int bitMask = 1 << pos;

        // For setting bit to 1
        int setBitResult = n | bitMask;
        System.out.println(setBitResult);

        // For clearing bit to 0
        int notBitMask = ~bitMask;
        int clearBitResult = n & notBitMask;
        System.out.println(clearBitResult);
    }
}
