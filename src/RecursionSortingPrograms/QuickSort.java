package RecursionSortingPrograms;

import java.util.Arrays;

public class QuickSort {

        public static void main(String[] args) {

        int[] A={5,4,3,2,1};
        quickSort(A,0,A.length-1);

        System.out.println(Arrays.toString(A));


    }

    static void quickSort(int[] A,int low,int high)
    {

        int s=low;
        int e=high;
        if(s>=e)
        {
            return;
        }


        int m=s+(e-s)/2;
        int pivot=A[m];


        while(s<=e)
        {
            while(A[s]<pivot)
            {
                s++;
            }
            while(A[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=A[s];
                A[s]=A[e];
                A[e]=temp;
                s++;
                e--;
            }
        }
        quickSort(A,low,e);
        quickSort(A,s,high);
    }
}
