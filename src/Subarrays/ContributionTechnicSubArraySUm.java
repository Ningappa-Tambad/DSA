package Subarrays;

public class ContributionTechnicSubArraySUm {

    static void SubArraySum(int[] A)
    {
        int n=A.length;

        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=A[i]*((i+1)*(n-i));
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int[] A={3,-1,4};

        SubArraySum(A);


    }
}
