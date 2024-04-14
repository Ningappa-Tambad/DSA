package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    static int sumOfAllDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }

        int d=n%10;
        int temp=sumOfAllDigits(n/10);
        return temp+d;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans=sumOfAllDigits(n);
        System.out.println(ans);
    }
}
