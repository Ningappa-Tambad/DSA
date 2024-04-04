package HashSet;

import java.util.HashSet;

public class findOutDistinctElementsUsingHashSet {

    static void findDistinctElements(int[] A)
    {
        int n=A.length;

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            hs.add(A[i]);
        }

        System.out.println(hs.size());
    }

    public static void main(String[] args) {

        int A[]={1,2,3,4,5,1,2,3,4,5,6,7,8};

        findDistinctElements(A);
    }
}
