package Searching1;

public class findFirstOccurenceUsingLogN {

    static int findFirstOccurence(int[] A,int k)
    {
        int n=A.length;

        int lo=0,hi=n-1,ans=-1;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(A[mid]==k)
            {
                ans=mid;
                hi=mid-1;
            } else if (A[mid]<k)
            {
             lo=mid+1;
            } else if (A[mid]>k)
            {
             hi=mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {


        int[] A={2,2,5,5,5,5,7,8,9,9};
        int k=9;


        System.out.println(findFirstOccurence(A,k));
    }
}
