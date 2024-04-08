package HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class TwoDDistinctPoints {

    static int FindTwoDDistinctElements(int[][] A)
    {
        int n=A.length;

        HashSet<String> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            int x=A[i][0];
            int y=A[i][1];

            String str=x+ "#" +y;

            hs.add(str);
        }


        return hs.size();

    }

    public static void main(String[] args) {

        int[][] A={

                {2,8},{5,3},{8,2},{2,8},{-1,3}

        };

        int ans=FindTwoDDistinctElements(A);
        System.out.println(ans);
    }
}
