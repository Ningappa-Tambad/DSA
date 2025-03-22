package DynamicProgramming;

import java.util.Arrays;

public class SubSetSumEqualsToKUsingDP

{
    public static void main(String[] args) {
        int[] arr={2,3,7,8,10};
        int k=44;

        int i=arr.length-1;
        System.out.println(subSetSum(i,k,arr));
    }



    static boolean subSetSum(int i, int j, int[] ar)
    {
        int[][] dp = new int[ar.length][j + 1];
        for (int[] row : dp)
        {
            Arrays.fill(row, -1);
        }
        return subSetSumUtil(i, j, ar, dp);
    }
    static boolean subSetSumUtil(int i, int j, int[] ar, int[][] dp)
    {
        if (j == 0)
            return true;
        if (i < 0 || j < 0)
            return false;
        if (dp[i][j] != -1)
            return dp[i][j] == 1;

        boolean a = subSetSumUtil(i - 1, j, ar, dp);
        boolean b = (j >= ar[i]) && subSetSumUtil(i - 1, j - ar[i], ar, dp);
        dp[i][j] = (a || b) ? 1 : 0;
        return dp[i][j] == 1;
    }}



