package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

   /*private static class largeNumberComparator implements Comparator<String>
    {
        @Override
        public int compare(String a, String b) {

                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }

    }*/

    private static class largeNumberComparator implements Comparator<String>
    {
        @Override
        public int compare(String a,String b)
        {
            String order1=a+b;
            String order2=b+a;

            return order2.compareTo(order1);
        }
    }

    public static String largestNumber(int[] nums) {

    String[] asStrs=new String[nums.length];

    for(int i=0;i<nums.length;i++)
    {
        asStrs[i]=String.valueOf(nums[i]);
    }

    Arrays.sort(asStrs,new largeNumberComparator());

     if(asStrs[0].equals("0"))
     {
         return "0";
     }

        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }

    public static void main(String[] args) {

        int[] A={0,0};

       String str=largestNumber(A);

        System.out.println(str);



    }
}
