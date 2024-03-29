package Subarrays;

public class leftMaxArray {

    static int[] leftMax(int[] A)
    {
        int n=A.length;
        int[] leftmax=new int[n];

        leftmax[0]=A[0];

        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],A[i]);
        }
        return  leftmax;
    }

    public static void main(String[] args) {

        int[] A={10,4,3,13,4};

        int[] ans=leftMax(A);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
