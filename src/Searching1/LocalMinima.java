package Searching1;

public class LocalMinima
{

    static int findLocalMinima(int[] A)
    {
        int n=A.length;

        int ans=-1;

        if (A[0] < A[1]) {

            return A[0];

        }
        else if(A[n-1]<A[n-2])
        {
            return A[n-1];
        }

        int lo=1,hi=n-2;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(A[mid]<A[mid-1] && A[mid]<A[mid+1])
            {
                return A[mid];
            }

            else if(A[mid-1]<A[mid])
            {
                hi=mid-1;
            }
            else if(A[mid+1]<A[mid])
            {
                lo=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] A={2,1,8,7,9,33,43,4,56};


//LOcal Minima -Element smaller than both of its neighbours
        int ans=findLocalMinima(A);
        System.out.println(ans);
    }
}
