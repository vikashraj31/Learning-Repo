public class MaxSubArray {

    public static void MaxSub(int arr[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int curr = 0; // reset for each subarray
                // Sub Array
                for (int k = i; k <= j; k++) {
                    curr += arr[k];
                }
                System.out.print(curr);

                if (curr > max)
                    max = curr;
            }
            System.out.println();
        }

        System.out.println("Maximum Sum = " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -3, 5, -10, 6 };
        MaxSub(arr);
    }
}