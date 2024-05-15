package Sorting;

public class InsertionSort {

    static int[] insertionSort(int[] A)
    {
        int n=A.length;

        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {


        int[] A={3,8,6,2,4};

       int[] ans= insertionSort(A);

       for(int i=0;i<ans.length;i++)
       {
           System.out.println(ans[i]+" ");
       }
    }
}
