package Sorting;

public class MergeTwoArrayUsingDivideAndConqArray {

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


    static int[] mergeSortUsingDevideAndConqMethod(int[] arr,int lo,int hi)
    {

        if(lo==hi)
        {
          int[] sa=new int[1];
          sa[0]=arr[lo];
          return sa;
        }
        int mid=(lo+hi)/2;

        //Sort the array from lo to mid

        int[] A=mergeSortUsingDevideAndConqMethod(arr,lo,mid);

        //Sort the array from mid+1 to high

        int[] B=mergeSortUsingDevideAndConqMethod(arr,mid+1,hi);

        int[] ans=mergeSortedArray(A,B);

        return ans;
    }



    public static void main(String[] args) {

        int A[]={8,3,4,9,7,1};


       int[] ans= mergeSortUsingDevideAndConqMethod(A,0,A.length-1);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
