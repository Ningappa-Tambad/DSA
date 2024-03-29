package Subarrays;

public class MaxSubArraySum {

    public static int maxSubArrySum(int[] A,int k)
    {
        int n=A.length;

        int s=0;
        int e=k-1;
        int ans=Integer.MIN_VALUE;

        while(e<n)
        {
            int sum=0;
            for(int i=s;i<=e;i++)
            {
                sum=sum+A[i];
            }
            if(sum>ans)
            {
                ans=sum;
            }
            s++;
            e++;
        }
 return ans;
    }

    public static void main(String[] args) {

        int[] A={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=5;

        int ans=maxSubArrySum(A,k);
        System.out.println(ans);
    }
}


