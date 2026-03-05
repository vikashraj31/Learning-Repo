public class stringLenght {

    public static boolean checkPalindram(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12321";

        System.out.println(checkPalindram(str));

    }

}
