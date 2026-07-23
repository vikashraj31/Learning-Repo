package Class;

class patten7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) { // rows

        for (int j = 1; j <= i; j++) { // numbers in each row
        System.out.print(j);
        }

        System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
