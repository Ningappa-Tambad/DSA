package TwoDArray;

import java.util.Scanner;

public class printClockWiseDirection {

    static void displayClockWiseDirection(int[][] A)
    {
        int i=0;
        int j=0;

        int n= A.length;

        for(int k=1;k<=n-1;k++)
        {
            System.out.println(A[i][j]);
            j=j+1;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.println(A[i][j]);
            i=i+1;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.println(A[i][j]);
            j=j-1;
        }
        for(int k=1;k<=n-1;k++)
        {
            System.out.println(A[i][j]);
            i=i-1;
        }

        if(n==1)
        {
            System.out.println(A[i][j]);
        }
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] mat=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        displayClockWiseDirection(mat);
    }
}
