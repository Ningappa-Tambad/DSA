package RecusrsionPatterns;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {


        int[] A={5,4,3,2,1};
        bubbleSort(A,A.length-1,0);
        System.out.println(Arrays.toString(A));

    }

   static void bubbleSort(int[] A,int r,int c)
    {
       if(r==0)
       {
              return;
       }

       if(c<r)
       {
           if(A[c]>A[c+1])
           {
               int temp=A[c];
               A[c]=A[c+1];
               A[c+1]=temp;
           }
           bubbleSort(A,r,c+1);
       }
       else
         {
              bubbleSort(A,r-1,0);
         }
    }
}
