package Subarrays;

public class MaxSubArrayWithSlidingWIndowTech {

    static int maxSubArrayWithSlidingWIndowTech(int[] A,int k)
    {
        //find the sum of first window

        int n=A.length;

        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+A[i];
        }

        int ans=sum;

        //Apply sliding window tech for other windows

        int s=1;
        int e=k;

        while(e<n)
        {
            sum=sum-A[s-1]+A[e];

            if(sum>ans)
            {
                ans=sum;
            }
            s=s+1;
            e=e+1;
        }
        return ans;
    }

    public static void main(String[] args) {


        int[] A={3,4,-2,5,3,-2,8,2,-1,4};

        int k=5;

       int ans= maxSubArrayWithSlidingWIndowTech(A,k);
        System.out.println(ans);
    }
}
