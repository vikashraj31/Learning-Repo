package Array;

import java.util.Scanner;

public class search_in_arr {

    public static void main(String[] args) {
        //Scan funtion for all
        Scanner sc = new Scanner(System.in);

        //Size of Array
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];

        //Value at all index3
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the no to Search");
        int x = sc.nextInt();
        
        //For search
        for (int j = 0; j < size; j++) {
            if (numbers[j] == x) {
                System.out.println("At index " + j);
            }
        }
    }

}
