package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CustomComapBasedOnCountOfFactors {


    public static int countOfFactors(int n)
    {
        int count=0;

        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(i==n%i)
                {
                    count++;
                }
                else
                {
                    count+=2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {


        Integer[] A={2,3,7,1,13,10,8};

        Arrays.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {

                int fa=countOfFactors(a);
                int fb=countOfFactors(b);

                if(fa==fb)
                {
                  return a-b;
                }
                else
                {
                    return fa-fb;
                }

            }
        });

        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
