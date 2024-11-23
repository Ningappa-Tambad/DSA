package CarryForward;

public class AandGParirsWithOn2 {

    static int findParitsAtoG(char[] ch)
    {
        int n=ch.length;
        int count=0;

        for(int i=0;i<n;i++)
        {

            for(int j=i+1;j<n;j++)
            {
                if(ch[i]=='a' && ch[j]=='g')
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        char[] ch={'a','d','g','a','g','a','g','f','g'};

        int ans=findParitsAtoG(ch);
        System.out.println(ans);
    }
}
