public class TrappingRainwater {

    public static int Water(int arr[], int n) {

        int totalWater = 0;

        for (int j = 0; j < n; j++) {

            int maxl = arr[j];
            int maxr = arr[j];

            
            for (int k = 0; k <= j; k++) {
                if (arr[k] > maxl)
                    maxl = arr[k];
            }

            
            for (int L = j; L < n; L++) {
                if (arr[L] > maxr)
                    maxr = arr[L];
            }

            int mostmax = Math.min(maxl, maxr);

            int w = mostmax - arr[j];

            totalWater += w;
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int Array[] = {1, 3, 4, 5, 3, 10, 2};
        int n = Array.length;

        int Ans = Water(Array, n);
        System.out.println(Ans);
    }
}