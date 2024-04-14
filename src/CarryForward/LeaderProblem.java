package CarryForward;

public class LeaderProblem {

    static int findOutLeader(int[] A)
    {
        int n=A.length;

        int max=A[0];

        for(int i=1;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] A={1,2,3,7,8,4,3};

       int ans= findOutLeader(A);
        System.out.println(ans);
    }
}
