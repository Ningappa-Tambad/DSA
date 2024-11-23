package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDArrayCustomComparison

{

    public static void main(String[] args) {

        Integer[][] mat={
                {3,6},
                {-1,5},
                {2,5},
                {0,4},
                {-5,6},
                {1,3},
                {2,-5}
        };



        Arrays.sort(mat, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {

                int x1=a[0];
                int y1=a[1];
                int x2=b[0];
                int y2=b[1];

                if(x1!=x2)
                {
                    return x1-x2;
                }
                else {
                    return y1-y2;
                }


            }
        });

        for(int i=0;i<mat.length;i++)
        {
            int x=mat[i][0];
            int y=mat[i][1];

            System.out.println("("+x+","+y+")");
        }
    }
}
