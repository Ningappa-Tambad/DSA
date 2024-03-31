package SubMatrix;

import java.util.Scanner;

public class FIndsubMatrixsum {

    static int[][] prefixTwoD(int[][] A)
    {
        //apply row wise prefix sum

        int n=A.length;
        int m=A[0].length;

        int[][] psum=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j==0) {
                    psum[i][j] = A[i][j];
                }
                else {

                    psum[i][j]=psum[i][j-1]+A[i][j];
                }
            }
        }

        //Apply colm wise psum
        for(int j=0;j<m;j++)
        {
            for(int i=1;i<n;i++)
            {
                psum[i][j]=psum[i-1][j]+psum[i][j];
            }
        }
        return psum;
    }

    static void subMatrixSum(int[][] arr,int[][] query)
    {

        int[][] ps=prefixTwoD(arr);

        for(int i=0;i<query.length;i++)
        {
            int x1=query[i][0];
            int y1=query[i][1];
            int x2=query[i][2];
            int y2=query[i][3];

            int sum=0;

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

            System.out.println(sum);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] mat=new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int n1=sc.nextInt();
        int m1=sc.nextInt();

        int[][] query=new int[n1][m1];

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                query[i][j]=sc.nextInt();
            }
        }



        subMatrixSum(mat,query);

    }



}
