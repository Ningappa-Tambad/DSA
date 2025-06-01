package DynamicProgramming;

import java.util.Arrays;

public class CountNumberOfSubsetSumEqualToKUsingDynamicProgramming1
{
    public static void main(String[] args)
{
    int[] arr = {2, 3, 5, 6, 8, 10};
    int k = 10; int i = arr.length - 1;
    System.out.println(countNumberOfSubsetSumEqualToK(i, k, arr));
} static int countNumberOfSubsetSumEqualToK(int i, int j, int[] arr)
{ int[][] dp = new int[arr.length][j + 1];
    for (int[] row : dp)
    {
        Arrays.fill(row, -1);
    }
    return countNumberOfSubsetSumUtil(i, j, arr, dp);
}
static int countNumberOfSubsetSumUtil(int i, int j, int[] arr, int[][] dp)
{
    if (j == 0)
    {
        return 1;
    }

    if (i < 0 || j < 0)
    { return 0;
    } if (dp[i][j] != -1)
    {
        return dp[i][j];
    }
    int a = countNumberOfSubsetSumUtil(i - 1, j, arr, dp); // Correctly decrementing the index
     int b = (j >= arr[i]) ? countNumberOfSubsetSumUtil(i - 1, j - arr[i], arr, dp) : 0; // Ensuring j - arr[i] is not out of bounds
     dp[i][j] = a + b;
     return dp[i][j];
}}


