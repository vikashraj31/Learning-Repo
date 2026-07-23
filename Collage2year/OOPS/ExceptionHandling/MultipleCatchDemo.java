package OOPS.ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);

           
            int result = 10 / 0;

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index error occurred");

        } catch (ArithmeticException e) {

            System.out.println("Division by zero error occurred");

        } catch (Exception e) {

            System.out.println("Some other error occurred");
        }

        System.out.println("Program continues...");
    }
}
