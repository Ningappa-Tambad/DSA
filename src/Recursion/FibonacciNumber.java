package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

    static int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fibonacci(n));;
    }
}
