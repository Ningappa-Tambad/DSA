package HashSet;

import java.util.HashSet;

public class SubArrayWithSumK {

    static boolean findSubArrayWithSumK(int[] A,int k)
    {
        int n=A.length;

        HashSet<Integer> hs=new HashSet<>();

        hs.add(0);
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=A[i];

            if(hs.contains(sum-k)==true)
            {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {

        int[] A={5,3,-1,4};
        int k=7;

        System.out.println(findSubArrayWithSumK(A,k));

    }


}
