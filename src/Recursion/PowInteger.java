package Recursion;

public class PowInteger {

    static int powerFunction(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }

        int temp=powerFunction(a,n-1);
        return temp*a;
    }

    public static void main(String[] args) {


        int a=3,n=5;

        int ans=powerFunction(a,n);
        System.out.println(ans);
    }
}
