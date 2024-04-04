package HashSet;

import java.util.HashMap;

public class FODistinctEleUsingHashMap {

    static void findDistinctElementsUsingHashMap(int[] A)
    {
        int n=A.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
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
        System.out.println(map);

        System.out.println(map.size());
    }

    public static void main(String[] args) {


        int A[]={1,2,3,4,5,1,2,3,4,5,6,7,8};

        findDistinctElementsUsingHashMap(A);
    }
}
