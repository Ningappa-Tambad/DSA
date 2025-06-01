package Recursion;

import java.util.ArrayList;

public class FIndKIndexWithoutPassingArg
{
    public static void main(String[] args) {

        int[] arr={1,2,3,4,4,5};

        System.out.println(findKElement(arr,4,0));
    }

    static ArrayList<Integer> findKElement(int[] arr,int k,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==k)
        {
            list.add(index);
        }

        ArrayList<Integer> ans=findKElement(arr,k,index+1);
            list.addAll(ans);


        return list;
    }
}
