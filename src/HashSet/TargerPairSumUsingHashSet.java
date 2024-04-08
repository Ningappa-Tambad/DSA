package HashSet;

import java.util.HashSet;

public class TargerPairSumUsingHashSet {

    static boolean targetSumPair(int[] A,int k)
    {
        int n=A.length;

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            int x=k-A[i];

            //FInd in x in left side

            if(hs.contains(x)==true)
            {
                return true;
            }

            hs.add(A[i]);
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
