public class ProfitCheck {
    public static int StockProfit(int array[]) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < array.length; i++) {
            if (buy < array[i]) {
                int profit = array[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = array[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int Array[] = { 7, 1, 5, 3, 6, 4 };
        int Result = StockProfit(Array);
        System.out.println(Result);
    }

}
