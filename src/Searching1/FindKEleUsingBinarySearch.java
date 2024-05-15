package Searching1;

public class FindKEleUsingBinarySearch {


    static int findKEleUsingBinarySearch(int[] A,int k)
    {
        int n=A.length;

        int lo=0,hi=n-1;

        while(lo<=hi)
        {
            int mid=(lo+hi)/2;

            if(A[mid]==k)
            {
                return mid;
            }
            else if(A[mid]<k)
            {
                //Discard the left side
                lo=mid+1;
            }

            else if(A[mid]>k)
            {
                //discard right side
                hi=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int[] A={1,2,3,4,5,6,7,8};

        int k=5;

      int ans=  findKEleUsingBinarySearch(A,k);

        System.out.println(ans);
    }
}
