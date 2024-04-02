package SubMatrix;

import java.util.Scanner;

public class PrefixSumTwoDMatrix {


    static int[][] TwoDPrefixSum(int[][] A)
    {
        int n=A.length;
        int m=A[0].length;

        int[][] ps=new int[n][m];

        //apply row wise prefix sum

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                {
                    ps[i][j]=A[i][j];
                }
                else {

                    ps[i][j]=ps[i][j-1]+A[i][j];
                }
            }
        }

        //Apply col wise prefix sum

        for(int j=0;j<m;j++)
        {
            for(int i=1;i<n;i++)
            {
                ps[i][j]=ps[i-1][j]+ps[i][j];
            }
        }

        return ps;
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m= sc.nextInt();

        int[][] prefixSum=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                prefixSum[i][j]=sc.nextInt();
            }
        }

        int[][] ans=TwoDPrefixSum(prefixSum);

        for(int i=0;i<=ans.length;i++)
        {
            for(int j=0;j<=ans.length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
