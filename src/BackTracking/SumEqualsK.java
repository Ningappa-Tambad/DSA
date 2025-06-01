package BackTracking;

public class SumEqualsK {

    public static void main(String[] args) {

        int[] ar={5,7,2};
        int k=7;
        System.out.println(findSumEqualsK(ar,0,ar.length,k,0));

    }

    static int findSumEqualsK(int[] ar,int i,int n,int k,int sum)
    {
        if(i==n)
        {
            if(sum==k)
            {
                return 1;
            }
            return 0;
        }



        //when there is no choice

        int exclude=findSumEqualsK(ar,i+1,n,k,sum);

        //when there is a choice to include the element
        int include=findSumEqualsK(ar,i+1,n,k,sum+ar[i]);

        return include+exclude;
    }
}
