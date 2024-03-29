package Subarrays;

public class MaxSubArrSumWithPrefixTech {


    static int[] prefixArray(int[] A)
    {
        int n=A.length;

        int[] ps=new int[n];

        ps[0]=A[0];

        for(int i=1;i<n;i++)
        {
            ps[i]=ps[i-1]+A[i];
        }
        return ps;
    }
    public static long maxSubArrayWithPrefixSumTechnic(int[] A,int k)
    {
        int n=A.length;
        int s=0;
        int e=k-1;

        int[] psum=prefixArray(A);


        long ans=Integer.MIN_VALUE;
        while(e<n)
        {
            long sum=0;

            if(s==0)
            {
                sum=psum[e];
            }
            else {

                sum=psum[e]-psum[s-1];
            }
            if(sum>ans)
            {
                ans=sum;
            }

            s=s+1;
            e=e+1;

        }
        return ans;
    }


    //Tc: O(N) and SC :O(N)

    public static void main(String[] args) {


        int[] A={-3,4,-2,5,3,-2,8,2,-1,4};

        int k=5;

       long ans= maxSubArrayWithPrefixSumTechnic(A,k);
        System.out.println(ans);
    }
}
