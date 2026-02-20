package Array;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = { 1, 3, 2, 55, 44, 6, 40, 30, 57, 86 };
        int find = 40;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                index = i;
                break;
            }
        }

        System.out.println("Element found at index: " + index);

    }
}
