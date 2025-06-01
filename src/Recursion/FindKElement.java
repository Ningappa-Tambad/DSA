package Recursion;

public class FindKElement {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=57;

        System.out.println(findKElement(arr,k,0));
    }

    static boolean findKElement(int[] arr,int k,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        if(arr[index]==k)
        {
            return true;
        }
        return findKElement(arr,k,index+1);
    }
}
