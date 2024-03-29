package TwoDArray;

import java.util.Scanner;

public class SpiralMatrixPrinting {

    static void displaySpiralPrinting(int[][] A)
    {
        int n=A.length;

        int i=0;
        int j=0;

        while(n>1)
        {
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

            i=i+1;
            j=j+1;
            n=n-2;
        }
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

        displaySpiralPrinting(mat);
    }
}
