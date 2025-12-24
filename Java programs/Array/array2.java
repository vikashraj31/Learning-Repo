package Array;
import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int j=0; j<size;j++){
        System.out.println("The value  is: " + numbers[j]);
        }
    }
}