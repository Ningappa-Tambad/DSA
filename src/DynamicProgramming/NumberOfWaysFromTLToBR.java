package DynamicProgramming;

public class NumberOfWaysFromTLToBR {

    public static void main(String[] args) {

        int n=2;
        int m=3;

        System.out.println(numberOfWays(n,m));
    }

    static int numberOfWays(int i,int j)
    {
        int[][] dp=new int[i+1][j+1];
        dp[i][j]=-1;
        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j]==0)
        {
            return 0;
        }

        if(i==0 && j==0)
        {
            return 1;
        }

        if(dp[i][j]==-1)
        {
            dp[i][j]=numberOfWays(i-1,j)+numberOfWays(i,j-1);
        }
        return dp[i][j];


    }
}
