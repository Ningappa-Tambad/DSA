package Bitmanipulation;

public class FindSingleElement {

    static int findSingleEle(int[] A)
    {
        int n=A.length;

        int ans=0;

        for(int i=0;i<n;i++)
        {
            ans=ans^A[i];
        }
        return ans;
    }

    public static void main(String[] args) {


        int[] A={5,9,4,9,8,5,4};

        int ans=findSingleEle(A);

        System.out.println(ans);
    }
}
