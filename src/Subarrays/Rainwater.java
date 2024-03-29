package Subarrays;

public class Rainwater {

    public static int[] leftmax(int[] A)
    {
        int n=A.length;
        int[] lmax=new int[n];

    lmax[0]=A[0];
      for(int i=1;i<n;i++)
      {
        lmax[i]=Math.max(lmax[i-1],A[i]);
      }
      return lmax;
    }

    public static int[] rightmax(int[] A)
    {
        int n=A.length;
        int[] rmax=new int[n];

        rmax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],A[i]);
        }
        return rmax;
    }

    public static int rainWaterTrapping(int[] ht)
    {
        int[] lmax=leftmax(ht);
        int[] rmax=rightmax(ht);

        int water=0;

        for(int i=0;i<ht.length;i++)
        {
            int lb=lmax[i];
            int rb=rmax[i];

            int amt=Math.min(lb,rb)-ht[i];
            water+=amt;
        }

    return water;
    }

    public static void main(String[] args) {

        int[] A={2,1,3,2,1,2,4,3,2,1,3,1};

        int ans=rainWaterTrapping(A);
        System.out.println(ans);
    }
}
