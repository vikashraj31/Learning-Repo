package Array;

import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT ROW AND COLUMN
        System.out.print("Enter the number of Rows and Columns: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // 2D ARRAY DECLARATION
        int[][] arr = new int[rows][columns];

        System.out.println("Enter the values for each index:");

        // Input values
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i) + ":");
            for (int j = 0; j < columns; j++) {
                System.out.print("Column " + (j) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the 2D array
        System.out.println("\nYour 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the no to find");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Found at index [" + i + "][" + j + "]");
                }
            }

        }
    }
}