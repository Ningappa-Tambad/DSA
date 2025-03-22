package DynamicProgramming;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] A) {
        int n = A.length;
        int[] dp = new int[n];
        int maxProfit = 0;
        int min = A[0];

        if(n<1)
        {
            return 0;
        }

        for (int i = 1; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            } else {
                dp[i] = A[i] - min;
                maxProfit = Math.max(maxProfit, dp[i]);
            }
        }
        return maxProfit;
    }
}