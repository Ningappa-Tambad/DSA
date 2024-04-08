package HashMap;

import java.util.HashMap;

public class NoOfDistEleInEverySubArray {

    static void findNoOfDistinctEleInEverySubArray(int[] A,int k)
    {
        int n=A.length;

        //FInd first window

        HashMap<Integer,Integer> map=new HashMap<>();


        //Find the ans of first window
        for(int i=0;i<k;i++)
        {
            if(map.containsKey(A[i])==false)
            {
                map.put(A[i],1);
            }
            else {
                int freq=map.get(A[i]);
                        freq++;
                map.put(A[i],freq);
            }
        }
        System.out.println(map.size());


        int s=1,e=k;

        //Apply sliding window for rest of the window

        while(e<n)
        {

            //Rem0ve impact of A[s-1]

            int f = map.get(A[s-1]);
            f--;
            map.put(A[s-1],f);

            if(f==0)
            {
                map.remove(A[s-1]);
            }

            //add the impact of A[e]

            if(map.containsKey(A[e])==false)
            {
                map.put(A[e],1);
            }
            else {
                int freq = map.get(A[e]);
                freq++;
                map.put(A[e],freq);
            }

            System.out.println(map.size());
            s++;
            e++;
        }

    }

    public static void main(String[] args) {

        int[] A={2,3,4,2,5,2};
        int k=3;

        findNoOfDistinctEleInEverySubArray(A,k);
    }
}
