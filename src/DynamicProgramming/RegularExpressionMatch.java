package DynamicProgramming;

import java.util.Arrays;

public class RegularExpressionMatch {

    public static void main(String[] args) {

        String s = "aaa";
        String p = "a*?";
        int i=0;
        int j=0;
        System.out.println(isMatch(s, p,i,j));
    }

    static int isMatch(String A, String B, int i, int j) {
        int T = A.length();
        int P = B.length();
        int[][] dp = new int[T + 1][P + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        if(i<0 && j<0)
        {
            return 1;
        }
        else if (i<0)
        {
          for(int k=0;k<=j;k++)
          {
              if(B.charAt(k)!='*')
              {
                  return 0;
              }
              return 1;
          }
        }
        else if (j<0)
        {
            return 0;
        }

        if(dp[i][j]==-1)
        {
            if(A.charAt(i)==B.charAt(j) || B.charAt(j)=='?')
            {
                dp[i][j]=isMatch(A,B,i-1,j-1);
            }
            else if(B.charAt(j)=='*')
            {
                dp[i][j]=isMatch(A,B,i-1,j) | isMatch(A,B,i,j-1);
            }
            else
            {
                dp[i][j]=0;
            }
        }
        return dp[i][j];

    }
}
