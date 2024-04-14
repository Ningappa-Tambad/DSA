package Recursion;

public class PowFuncWithLogN {

    static int powerFunction(int a,int n)
    {
        if(n==0)
        {
            return 1;
        }

        int temp=powerFunction(a,n/2);

        if(n%2==0)
        {
            return temp*temp;
        }
        else {
            return temp*temp*a;
        }
    }

    public static void main(String[] args) {

        int a=2,n=10;

        int ans=powerFunction(a,n);
        System.out.println(ans);
    }
}
