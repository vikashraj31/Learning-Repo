package Class;
class patten3 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();

        }

        // Next Question
        System.out.println("\n");
        int r = 6;
        for (int i = r; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();

        }
    }
}