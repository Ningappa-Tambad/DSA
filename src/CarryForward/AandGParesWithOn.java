package CarryForward;

public class AandGParesWithOn {

    static int findParitsAtoG(char[] A)
    {
        int n=A.length;

        int countg=0;
        int ans=0;

        for(int i=n-1;i>=0;i--)
        {
            if(A[i]=='g')
            {
                countg++;
            }
            else if(A[i]=='a')
            {
                ans+=countg;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        char[] ch={'a','d','g','a','g','a','g','f','g'};

        int ans=findParitsAtoG(ch);
        System.out.println(ans);
    }
}
