package HashMap;

import java.util.HashMap;

public class CountFrequency
{

    static void countFrequency(int[] A,int[] Q)
    {

        //Creating freq map


        int n=A.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int i=0;i<n;i++)
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

        System.out.println(map);

        //lets give the answer of every query

        for(int i=0;i<Q.length;i++)
        {
            int ele=Q[i];

            if(map.containsKey(ele)==false)
            {
                System.out.println(0);
            }
            else {

                System.out.println(map.get(ele));
            }
        }
    }
    public static void main(String[] args) {

        int[] A={1,2,3,1,3,2,1,4,5,6,6,5,4,7};

        int[] Q={2,1,4,9};

        countFrequency(A,Q);
    }
}
