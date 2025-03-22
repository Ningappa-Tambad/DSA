package DynamicProgramming;

import java.util.Arrays;

public class MaximubSubSequenceSum {

    public static void main(String[] args) {

        int [] arr={-2,3,4,-1,5,-12,6,1,3};


        arr= new int[]{maxSubSequenceSum(arr, arr.length - 1)};
        System.out.println(Arrays.toString(arr));
    }

    static int maxSubSequenceSum(int[] arr,int i)
    {

//        int dp[arr]=new int[arr.length];

        int dp[]=new int[arr.length];


        //base condition

        if(i==0)
        {
            return arr[0];
        }

        if(dp[i]==-1)
        {
            dp[i]=Math.max(maxSubSequenceSum(arr,i-1),maxSubSequenceSum(arr,i-2)+arr[i]);
        }

        return dp[i];
    }
}
