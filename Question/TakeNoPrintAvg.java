package Question;

import java.util.Scanner;

public class TakeNoPrintAvg {


    // Function
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        //Function Call
         calculateAverage(num1, num2, num3);

         double average=calculateAverage(num1, num2, num3);

        System.out.printf("Average of %d, %d and %d is: %.2f%n",
                num1, num2, num3, average);

        scanner.close();
    }
}