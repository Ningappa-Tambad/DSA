package DynamicProgramming;

import java.util.Arrays;

public class CountNumberOfSubsetSumEqualToKUsingDynamicProgramming
{

    public static void main(String[] args)
    {

        int[] arr = {2, 3, 5, 6, 8, 10};
        int k = 10;


        System.out.println(countNumberOfSubsetSumEqualToK(arr.length, k, arr));
    }

    static int countNumberOfSubsetSumEqualToK(int n, int sum, int[] arr)
    {
        int[][] dp = new int[n+1][sum + 1];
        for (int[] row : dp)
        {
            Arrays.fill(row, -1);
        }
        return countNumberOfSubsetSumUtil(n, sum, arr, dp);
    }

    static int countNumberOfSubsetSumUtil(int i, int j, int[] arr, int[][] dp)
    {

        if (j == 0)
        {
            return 1;
        }

        if (i ==0)
        {
            return 0;
        }

        if (dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int a = countNumberOfSubsetSumUtil(i - 1, j, arr, dp); // Correctly decrementing the index

        int b=0;
        if(j >= arr[i-1])
        {
            b= countNumberOfSubsetSumUtil(i - 1, j - arr[i-1], arr, dp);
        }
        // Ensuring j - arr[i] is not out of bounds
         dp[i][j] = a + b;
         return dp[i][j];
    }

 }

