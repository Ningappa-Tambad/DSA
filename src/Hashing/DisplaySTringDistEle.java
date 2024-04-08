package Hashing;

import java.util.HashSet;

public class DisplaySTringDistEle {

    public static void main(String[] args) {

        String[] A ={"Hello","Hi","Hello","Good"};

        HashSet<String> hs=new HashSet<>();

        for(int i=0;i<A.length;i++)
        {
            hs.add(A[i]);
        }

        System.out.println(hs.size());


    }
}
