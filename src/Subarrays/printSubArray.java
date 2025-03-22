package Subarrays;

public class printSubArray {

    public static void main(String[] args) {

        int[] A={3,4,5,9,7,8};
        int s=1;
        int e=3;

        printSubArray(A,s,e);
    }

    static void printSubArray(int[] A, int s, int e)
    {
        for(int i=s;i<=e;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
