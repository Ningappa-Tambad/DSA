package DynamicProgramming;

public class NStairs {



    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to reach the top of the stairs: " + climbStairs(n));
    }
}
