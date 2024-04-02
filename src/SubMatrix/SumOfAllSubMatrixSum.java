package SubMatrix;

import java.util.Scanner;

public class SumOfAllSubMatrixSum {

    static int sumOfAllSubMatrixSum(int[][] A)
    {
        int n=A.length;
        int m=A[0].length;

        int ans=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int freq=(i+1)*(j+1)*(n-i)*(m-j);
                ans+=freq*A[i][j];
            }
        }
        return ans;
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

        int ans=sumOfAllSubMatrixSum(mat);
        System.out.println(ans);
    }
}
