package Recursion;

public class IsArraySorted {

    public static void main(String[] args) {

        int[] A={1,2,6,4,5};

        System.out.println(isSorted(A,0));
    }

    static boolean isSorted(int[] A, int i) {

        if(i==A.length-1)
            return true;

        return A[i]<A[i+1] && isSorted(A,i+1);
    }
}
