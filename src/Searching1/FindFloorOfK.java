package Searching1;

public class FindFloorOfK
{

    static int findFloorOfK(int[] A,int k)
    {
        int n=A.length;

        int lo=0,hi=n-1,ans=-1;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(A[mid]<=k) {
                ans = A[mid];
                lo = mid + 1;
            }
            else
            {
             hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {


//Floor -Max of values which are <=k
        int[] A={12,19,21,25,28,32,35,8,9,9};
        int k=24;


        System.out.println(findFloorOfK(A,k));
    }
}
