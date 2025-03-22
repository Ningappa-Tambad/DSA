package DynamicProgramming;

public class fibonacciUsingDP {

    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
    }

    public static int fib(int n) {

        int[] dp=new int[n+1];

        if(n<=1)
        {
            dp[n]=n;
            return n;
        }

        if(dp[n]==0)
        {
            dp[n]=fib(n-1)+fib(n-2);
        }
        return dp[n];

    }
}
