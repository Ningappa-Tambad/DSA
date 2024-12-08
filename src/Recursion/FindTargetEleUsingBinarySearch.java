package Recursion;

public class FindTargetEleUsingBinarySearch
{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=10;
        System.out.println(findTargetElement(arr,target,0,arr.length-1));
    }

    static int findTargetElement(int[] arr,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]>target)
        {
            return findTargetElement(arr,target,start,mid-1);
        }
        return findTargetElement(arr,target,mid+1,end);
    }
}
