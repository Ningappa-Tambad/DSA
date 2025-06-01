package DynamicProgramming;

public class dpfib {

    public static void main(String[] args)
    { int n = 5;
        //
        // Example to calculate the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        }
        public static int fibonacci(int n)
    {
        if (n <= 1)
    {
        return n;
    }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2];
        } return dp[n];
    } }