package Searching1;

public class FindKEleUsingLinearSearch
{

    static int findKElements(int[] A,int k)
    {
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            if(A[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {


        int[] A={1,5,23,4,3,17,8};
        int k=17;

       int ans= findKElements(A,k);

        System.out.println(ans);
    }
}
