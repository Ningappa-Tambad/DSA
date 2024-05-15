package Sorting3;

public class QuickSortUsingRecursion
{


    static int partition(int[] A,int lo,int hi,int pivot)
    {
        int i=lo,j=lo;

        while(j<hi)
        {
            if(A[j]>=pivot)
            {
                j++;
            }
            else
            {
                //Swamp A[i]and A[j]
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j++;
            }


        }
        //swamp A[i] to A[hi]

        int temp=A[i];
        A[i]=A[hi];
        A[hi]=temp;

        return i;

    }

    static void quickSort(int[] A,int lo,int hi)
    {

        if(lo>=hi)
        {
            return;
        }

        int pivot=A[hi];
        int pi=partition(A,lo,hi,pivot);

        quickSort(A,lo,pi-1);
        quickSort(A,pi+1,hi);
    }
    public static void main(String[] args) {


        int[] A={5,3,2,6,8,9,7};

        quickSort(A,0,A.length-1);

        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
