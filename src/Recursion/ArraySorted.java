package Recursion;

public class ArraySorted
{
    public static void main(String[] args) {

        int[] A={1,2,3,51,7};

        System.out.println(isArraySorted(A,0));
    }

    static boolean isArraySorted(int[] A, int i)
    {
        if(i==A.length-1)
        {
            return true;
        }

        return A[i]<A[i+1] && isArraySorted(A, i+1);
    }
}
