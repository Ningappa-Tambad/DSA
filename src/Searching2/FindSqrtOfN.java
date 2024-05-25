package Searching2;

public class FindSqrtOfN {

    static int findSqrtOfN(int[] A,int N)
    {
        int n=A.length;

        int lo=0,hi=n-1;
        int ans=0;

        while(lo<=hi)
        {
            int m=(lo+hi)/2;

            if(m*m<=N)
            {
               ans=m;
               lo=m+1;
            }
            else {
                hi=m-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A={1,2,3,4,5,6};
        int N=16;


        System.out.println( findSqrtOfN(A,N));
    }
}
