package HashSet;

public class TargetSumPair1 {

    static boolean targetSumPair(int[] A,int k)
    {
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            int x=k-A[i];

            for(int j=i+1;i<n;i++)
            {
                if(A[j]==x)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {


        int[] A={2,3,1,12,3,2};
        int k=5;

        boolean ans=targetSumPair(A,k);
        System.out.println(ans);

    }


}
