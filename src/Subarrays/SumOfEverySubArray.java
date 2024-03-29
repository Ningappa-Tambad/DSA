package Subarrays;

public class SumOfEverySubArray {

    static void sumSubArray(int[] A)
    {
        int n=A.length;
        for(int s=0;s<n;s++)
        {
            int sum=0;
            for(int e=s;e<n;e++)
            {
                sum+=A[e];
                System.out.print(sum+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[] A={3,2,4};

        sumSubArray(A);
    }
}
