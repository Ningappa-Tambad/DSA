package Subarrays;

public class MaxSubArraySumON {

    public static int kadaneAlgo(int[] A)
    {
        int n=A.length;

        int sum=0;
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(sum>0)
            {
                sum+=A[i];
            }
            else
            {
                sum=A[i];
            }

            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A={-3,2,4,-1,3,-4,3};

       int ans= kadaneAlgo(A);

        System.out.println(ans);
    }
}
