package Arrays;

public class BestTimeToBuyAndSellStock {

    private static int maxProfitSell(int[] arr, int len) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i=0;i<len;i+=1) {
            int buyDay = arr[i];
            int j = len-1;
            while (j > i) {
                maxProfit = Math.max(maxProfit, (arr[j] - buyDay));
                j -= 1;
            }
        }

        if (maxProfit > 0)
            return maxProfit;
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int len = arr.length;
        System.out.println("Profit: " + maxProfitSell(arr, len));
    }    
}
