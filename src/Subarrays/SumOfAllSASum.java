package Subarrays;

public class SumOfAllSASum {

    static int printAllSubArraySum(int[] A)
    {
        int n=A.length;
        int ans=0;

        for(int s=0;s<n;s++)
        {
            int sum=0;

            for(int e=s;e<n;e++)
            {
                sum+=A[e];
                ans+=sum;

            }

        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A={3,-1,4};

        int ans=printAllSubArraySum(A);
        System.out.println(ans);

    }
}
