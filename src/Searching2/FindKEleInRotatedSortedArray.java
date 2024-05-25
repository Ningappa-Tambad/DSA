package Searching2;

public class FindKEleInRotatedSortedArray
{

    static int findKEleInRotatedSortAray(int[] A,int k)
    {
        int n=A.length;

        int lo=0,hi=n-1;

        while(lo<=hi)
        {
            int m=(lo+hi)/2;

            if(A[m]==k)
            {
                return A[m];
            } else if (A[lo]<A[m])
            {

                //lo to mid is sorted
                if(k>A[lo] && k<A[m])
                {
                    hi=m-1;
                }
                else
                {
                    lo=m+1;
                }
            }
            else
            {
                //Mid to hi is sorted
                if(k>A[m] && k<A[hi])
                {
                    lo=m+1;
                }
                else
                {
                    hi=m-1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {

        int[] A={90,100,25,50,75,80};

        int k=75;



        System.out.println( findKEleInRotatedSortAray(A,k));
    }
}
