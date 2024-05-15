package Sorting3;

public class PartitionArrayUsingQuickSort
{

    static int[] partitionArray(int[] A)
    {
        int n=A.length;

        int i=0,j=0;
        int ele=A[n-1];

        while(j<n-1)
        {
            if(A[j]>=ele)
            {
                j++;
            }
            else
            {
                //Swap A[i],A[j]

                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }

            //Swamp A[i] to A[n-1]

            int temp=A[i];
            A[i]=A[n-1];
            A[n-1]=temp;
        }
        return A;
    }
    public static void main(String[] args) {


        int[] A={2,5,8,3,7,6,1,9,6};

        int[] ans=partitionArray(A);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
