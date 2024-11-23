package Sorting;

public class MergeTwoSortedArray {

    static int[] mergeSortedArray(int[] A,int[] B)
    {
        int n=A.length;
        int m=B.length;

        int[] ans=new int[n+m];

        int i=0,j=0,k=0;

        while(i<n && j<m)
        {
            //if A[i] value is smaller use A[i]
            if (A[i] < B[j]) {
                ans[k] = A[i];
                i++;
                k++;
            } else {
                ans[k] = B[j];
                j++;
                k++;
            }

        }

            //If values are pending in A[]

            while(i<n)
            {
                ans[k]=A[i];
                i++;
                k++;
            }

            //If values are pending in B[j]


            while(j<m)
            {
                ans[k]=B[j];
                j++;
                k++;
            }

        return ans;
    }

    public static void main(String[] args) {

        int[] A={3,4,9,12};
        int[] B={2,5};

       int[] ans= mergeSortedArray(A,B);

       for(int i=0;i<ans.length;i++)
       {
           System.out.print(ans[i]+" ");
       }

    }
}
