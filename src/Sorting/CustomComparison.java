package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CustomComparison {

    public static void main(String[] args) {


        Integer[] A={7,6,5,3,2,1,10,5,4};


        Arrays.sort(A, new Comparator<Integer>() {

            //If a is small-Keep a before b
            //if a is greater -Keep b beofre a
            //If both are equal-retun 0

            //return -ve -Keep a before b
            //return +ve-keep a after b

            @Override
            public int compare(Integer a, Integer b) {

              // return a-b;//In asc order

                return -(a-b);// In dsc order
            }
        });



for(int i=0;i<A.length;i++)
{
    System.out.print(A[i]+" ");
}

    }





}
