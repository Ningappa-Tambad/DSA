package HashMap;

import java.util.HashMap;

public class SubArrayWithSumK {

static int subArryWithSumcountK(int[] A,int k)
{
    int n=A.length;

    HashMap<Integer,Integer> map=new HashMap<>();
    int sum=0;
    int count=0;

    map.put(0,1);
    for(int i=0;i<n;i++)
    {
       sum+=A[i];

        if(map.containsKey(sum-k)==true)
        {
            count+=map.get(sum-k);
        }
       if(map.containsKey(sum)==false) {

           map.put(sum, 1);
       }
       else {

            //give impact in your map
            int freq=map.get(sum);
            freq++;
            map.put(A[i],freq);
        }
    }

return count;



}
    public static void main(String[] args) {

        int[] A={3,11,-4,1,-2,5,6,2};
        int k=6;

        System.out.println(subArryWithSumcountK(A,k));



        /*int[] A={3,11,-4,1,-2,5,6,2};
        int k=6;

        System.out.println(subArryWithSumcountK(A,k));*/


    }
}
