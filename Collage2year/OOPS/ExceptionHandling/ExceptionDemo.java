package OOPS.ExceptionHandling;


public class ExceptionDemo {
    public static void main(String[] args) {

        int arr1[] = {2, 3, 4, 2, 4};
        int arr2[] = {1, 3, 1, 0, 2};   // contains 0 (will cause exception)

        for (int i = 0; i < arr1.length; i++) {

            try {
                int div = arr1[i] / arr2[i];   // risky code
                System.out.println("Result: " + div);

            } catch (Exception e) {
                System.out.println("Cannot divide by zero at index " + i);
            }
        }
    }
}

