package BackTracking;

import java.util.Arrays;

public class PrintAllNDigits {

    public static void main(String[] args) {

            int n=3;
            int[] ar=new int[n];
            printAllNDigits(ar,0,n);

    }

    static void printAllNDigits(int[] ar,int i,int n) {

        if(i==n)
        {
            System.out.println(Arrays.toString(ar));
            return;
        }

       ar[i]=1;
       printAllNDigits(ar,i+1,n);
       ar[i]=2;
       printAllNDigits(ar,i+1,n);

    }
}
