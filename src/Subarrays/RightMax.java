package Subarrays;

public class RightMax {

    static int[] rightMaxArray(int[] A)
    {
        int n=A.length;

        int[] rmax=new int[n];

        rmax[n-1]=A[n-1];

        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],A[i]);
        }
        return rmax;
    }

    public static void main(String[] args) {

        int[] A={3,23,15,3,17,5,6,10};

        int[] ans=rightMaxArray(A);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
