package DynamicProgramming;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {

        int[] arr={10,22,9,33,21,50,41,60,80};
        System.out.println(longestIncreasingSubSequence(arr));
    }

    static int longestIncreasingSubSequence(int[] arr)
    {
        int n=arr.length;
        int[] dp=new int[n];

        for(int i=0;i<n;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
