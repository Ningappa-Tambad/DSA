package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class CountNoOfPairs {

    static int countNoOfPairs(int[] A, int k)

    {
        int n=A.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;
        for(int i=0;i<n;i++)
        {
            int x=k-A[i];

            //How many times x is coming in left

            if(map.containsKey(x)==true)
            {
                count+=map.get(x);
            }
            //put your impactin map
            if(map.containsKey(A[i])==false)
            {
                map.put(A[i],1);
            }
            else
            {
                int freq=map.get(A[i]);
                freq++;
                map.put(A[i],freq);
            }
        }
        return count;
    }

    public static void main(String[] args) {


        int[] A={2,5,1,5,2,7,10};
        int k=12;

        int ans=countNoOfPairs(A,k);
        System.out.println(ans);
    }
}
