package DynamicProgramming;

import java.util.Arrays;

public class MaximumSubSequenceSum2ndWay {

    public static void main(String[] args) {
        int[] arr = {9,4,-13,2};
        int i=0;
        System.out.println(maxSubSeqSum(arr,i));


    }

    static int maxSubSeqSum(int[] arr, int i) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);


        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] == -1) {
            dp[i] = Math.max(maxSubSeqSum(arr,i+ 1), maxSubSeqSum(arr, i + 2) + arr[i]);
        }
        return dp[i];
    }
}
