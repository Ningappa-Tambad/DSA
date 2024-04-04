package HashMap;

import java.util.HashMap;

public class FindFirstNonRepeatingEle {

    static void findFirstNonRepeatingElement(int[] A)
    {
        int n=A.length;

        HashMap<Integer,Integer> map=new HashMap<>();

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

        //travel through the array and print whose freq is 1

        for(int i=0;i<n;i++)
        {
            int ele=A[i];
            if(map.get(ele)==1)
            {
                System.out.println(ele);
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] A={2,5,4,5,2,6};

        findFirstNonRepeatingElement(A);
    }
}
