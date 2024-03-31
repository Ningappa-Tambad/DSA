package SubMatrix;

import java.util.Scanner;

public class FIndMaximumSubMatrixSum {

    static int[][] twoDPrefixSum(int[][] A)
    {
        int n=A.length;
        int m=A[0].length;

        int[][] psum=new int[n][m];

        //Apply row wise prefix sum

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0)
                {
                    psum[i][j]=psum[i][j];
                }
                else {

                    psum[i][j]=psum[i][j-1]+A[i][j];
                }
            }
        }

        //Apply col wise matrix

        for(int j=0;j<m;j++)
        {
            for(int i=1;i<n;i++)
            {
                psum[i][j]=psum[i-1][j]+psum[i][j];
            }
        }
        return psum;
    }

    static int maximumSubMatrixSum(int[][] A)
    {

        int[][] ps=twoDPrefixSum(A);

        int ans=Integer.MIN_VALUE;

        int n=A.length;
        int m=A[0].length;

        int x2=n-1;
        int y2=m-1;



        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {

                int x1=i;
                int y1=j;

                int sum=0;

                //FInd sum of sub matrix TL x1,y1 and BR x2,y2

                sum+=ps[x2][y2];

                if(x1>0)
                {
                    sum-=ps[x1-1][y2];
                }

               if(y1>0)
               {
                   sum-=ps[x2][y1-1];
               }

               if(x1>0 && y1>0)
               {
                   sum+=ps[x1-1][y1-1];
               }


               if(sum>ans)
               {
                   ans=sum;
               }


            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m= sc.nextInt();

        int[][] mat=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

       int ans= maximumSubMatrixSum(mat);

        System.out.println(ans);
    }
}
