package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestToLowestSort
{

    static String solve(int[] A)
    {
        int n=A.length;

        //Convert int[] to Integer array to sort

        Integer[] arr=new Integer[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=A[i];
        }

        //  Sort the Array

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                String as=a+"";
                String bs=b+"";

                String v1=as+bs;
                String v2=bs+as;

                return v1.compareTo(v2);

            }
        });

       /* //Sort the array asc order
        String ans="";

        for(int i=0;i<n;i++)
        {
            ans+=arr[i];
        }*/

        //Sort the array desc order
        String ans="";

        for(int i=n-1;i>=0;i--)
        {
            ans+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {


        int[] A={6,7,3,2,4,5,6};

        System.out.println(solve(A));


    }
}
