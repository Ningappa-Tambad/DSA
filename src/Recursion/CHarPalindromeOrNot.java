package Recursion;

public class CHarPalindromeOrNot {

    static boolean Palidrome(char[] A,int s,int e)
    {
        if(s==e || s>e)
        {
            return true;
        }

        if(A[s]!=A[e])
        {
            return false;
        }

        else {

            boolean ans=Palidrome(A,s+1,e-1);
            return ans;
        }
    }

    public static void main(String[] args) {

        char[] A={'g','a','d','a','g'};

        int s=0,e=4;

        boolean ans=Palidrome(A,s,e);
        System.out.println(ans);
    }
}
