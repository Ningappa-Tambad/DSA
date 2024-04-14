package CarryForward;

public class BuyAndSellStiock {

    static int buyAndSellStock(int[] A)
    {
        int n=A.length;

       int maxProfit=0;

        int max=A[n-1];

        for(int i=n-2;i>=0;i--)
        {
            if(A[i]>max)
            {
                max=A[i];
            }

            if(max>maxProfit)
            {
                maxProfit=max;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {


        int[] A={1, 4, 5, 2, 4};

       int ans= buyAndSellStock(A);

        System.out.println(ans);
    }
}
