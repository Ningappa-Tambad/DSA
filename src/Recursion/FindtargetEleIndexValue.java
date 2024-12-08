package Recursion;

import ExceptionHandling.ArrayIndexOutOfBounds;

import java.util.ArrayList;

public class FindtargetEleIndexValue
{
    public static void main(String[] args) {


        int[] arr={1,2,3,4,4,5};

        ArrayList<Integer> list=new ArrayList<>();

       ArrayList<Integer>  ans=findTargetElement(arr,4,0,list);
        System.out.println(ans);
    }

    static ArrayList<Integer> findTargetElement(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findTargetElement(arr,target,index+1,list);
    }
}
