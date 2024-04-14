package Sorting;

public class BubbleSort {

    static int[] bubbleSort(int[] A)
    {
        int n=A.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }

        return A;

    }

    public static void main(String[] args) {


        int[] A={10,4,5,2,3,4,};

        int[] ans=bubbleSort(A);

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]+" ");
        }
    }
}
