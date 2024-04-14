package RangeSumQueries;

public class RangeSumQueries {

    static  int[] prefixsum(int[] A)
    {
        int n=A.length;

        int[] psum=new int[n];
        psum[0]=A[0];
        for(int i=1;i<n;i++)
        {
            psum[i]=psum[i-1]+A[i];
        }
        return psum;
    }

    static int[] rangeSumQueries(int[] A,int[][] query)
    {

        int n=A.length;
        int q=query.length;

        int[] ps=prefixsum(A);

        int[] ans=new int[q];
        for(int i=0;i<q;i++)
        {
            int L=query[i][0];
            int R=query[i][1];

            if(L==0)
            {
                ans[i]=ps[R];
            }
            else
            {
                ans[i]=ps[R]-ps[L-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] A={3,4,-2,6,8,10,13,1};
        int[][] matA={
                {1,3},{2,6},{5,5},{0,3}
        };

        int[] ans=rangeSumQueries(A,matA);

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }

    }

}
