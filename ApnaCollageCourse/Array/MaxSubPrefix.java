public class MaxSubPrefix {

    public static void MaxSubPre(int arr[]) {

        int max = Integer.MIN_VALUE;

        // prefix array
        int pre[] = new int[arr.length];

        pre[0] = arr[0];
        for(int i = 1; i < pre.length; i++){
            pre[i] = pre[i-1] + arr[i];
        }

        // find max subarray sum
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

                int sum;

                if(i == 0)
                    sum = pre[j];
                else
                    sum = pre[j] - pre[i-1];

                if(sum > max)
                    max = sum;
            }
        }

        System.out.println("Max Sum = " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -3, 5, -10, 6 };
        MaxSubPre(arr);
    }
}