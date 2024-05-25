package Searching3;

public class painterPartition {

    static boolean isPossible(int[] arr,int mid,int K)
    {
        int n=arr.length;

        int cunt=1;
        int curr=0;

        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            if(curr>mid)
            {
                cunt++;
                curr=arr[i];

            }
            if(cunt>mid)
            {
                return false;
            }
        }
        return true;
    }

    static int solvePainterPartition(int[] A,int T,int K)
    {
        int n=A.length;

        int[] arr=new int[n];

        int max=Integer.MIN_VALUE;

        int sum=0;

        for(int i=0;i<n;i++)
        {
            arr[i]=A[i]*T;
            max=Math.max(max,arr[i]);

            sum+=arr[i];

        }

        int lo=max,hi=sum;
        int ans=0;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(isPossible(arr,mid,K)==true)
            {
                ans=mid;
                hi=mid-1;

            }
            else {
                lo=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A={5,3,6,1,7};
        int K=3;
        int T=2;


        System.out.println(solvePainterPartition(A,T,K));
    }
}
