package RecursionSortingPrograms;

import java.util.Arrays;

public class MergeSortEx {

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid=arr.length/2;

        //Sort left and right array

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second)
    {
        int[] ans=new int[first.length+second.length];
        int i=0,j=0,k=0;

        //compare both the first and second array and add the smallest element to the ans array

        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                ans[k]=first[i];
                i++;
            }
            else
            {
                ans[k]=second[j];
                j++;
            }
            k++;
        }

        //Add the remaining elements of first array to the ans array

        while(i<first.length)
        {
            ans[k]=first[i];
            i++;
            k++;
        }

        //Add the remaining elements of second array to the ans array

        while (j<second.length)
        {
            ans[k]=second[j];
            j++;
            k++;
        }

        return ans;
    }
}
