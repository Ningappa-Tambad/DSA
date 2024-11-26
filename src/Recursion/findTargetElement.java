package Recursion;

public class findTargetElement {

    public static void main(String[] args) {

        int [] A={1,2,3,4,5,6};

        System.out.println(findTargetElement(A,4,0));
        System.out.println(findIndexElement(A,4,0));

        System.out.println(findIndexFromLast(A,4,A.length-1));


    }

    static boolean findTargetElement(int[] A, int target,int i) {

        if(i == A.length-1) {
            return false;
        }

        return A[i]==target || findTargetElement(A,target, i + 1);

    }

    //return index

    static int findIndexElement(int[] A, int target,int i)
    {

        if(i == A.length-1) {
            return -1;
        }

        if(A[i]==target) {
            return i;
        }
        else
        {
            return findIndexElement(A, target, i + 1);
        }

    }

    //return index from last

    static int findIndexFromLast(int[] A, int target,int i)
    {
        if(i == -1) {
            return -1;
        }

        if(A[i]==target) {
            return i;
        }

        else
        {
            return findIndexFromLast(A, target, i-1);
        }
    }


}
