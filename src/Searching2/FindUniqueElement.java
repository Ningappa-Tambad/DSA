package Searching2;

public class FindUniqueElement {

    static int findUniqueElement(int[] A)
    {
        int n=A.length;

        if(A[0]!=A[1])
        {
            return A[0];
        }

        if(A[n-1]!=A[n-2])
        {
            return A[n-1];
        }

        int lo=0,hi=n-1;

        while(lo<=hi)
        {
            int m=(lo+hi)/2;

            if(A[m]!=A[m-1] && A[m]!=A[m+1])
            {
                return A[m];
            }

            else if(A[m-1]==A[m])
            {
                int fvi=m-1;

                if(fvi%2==0)
                {
                    lo=m+1;
                }
                else
                {
                    hi=m-1;
                }
            }
            else if(A[m]==A[m+1])
            {
                int fvi=m;

                if(fvi%2==0)
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

        int[] A={1,1,2,2,5,5,6,6,8,8,10,12,12};

        System.out.print(findUniqueElement(A));
    }
}
