package DynamicProgramming;

public class countMinNoOfsquares
{
    public static void main(String[] args) {

        int n=5;
        System.out.println(countMinNoOfSquares(n));
    }

    static int countMinNoOfSquares(int n)
    {
        int[] dp=new int[n+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        for(int i=4;i<=n;i++)
        {
            dp[i]=i;
            for(int x=1;x<=Math.ceil(Math.sqrt(i));x++)
            {
                int temp=x*x;
                if(temp>i)
                {
                    break;
                }
                else
                {
                    dp[i]=Math.min(dp[i],1+dp[i-temp]);
                }
            }
        }
        return dp[n];
    }
}
