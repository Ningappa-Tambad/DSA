package HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class SubArrayWithSumZero {

    static int[] prefixSum(int[] A)
    {
        int n=A.length;

        int[] psum=new int[n];

        psum[0]=A[0];

        for(int i=1;i<n;i++)
        {
            psum[i]=psum[i-1]+A[i];
        }
        return psum;
    }

    static boolean findSubArraySumZeroOrNot(int[] A)
    {
        int n=A.length;

        int[] ps=prefixSum(A);

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(ps[i]==0)
            {
                return true;
            }
            else
            {
                hs.add(ps[i]);
            }
        }
        if(hs.size()!=n)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] A={2,4,-1,3,-2,5,1,6};

        boolean ans=findSubArraySumZeroOrNot(A);
        System.out.println(ans);
    }
}
