package Recursion;

import java.util.Scanner;

public class FactorialOfN {


    static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 2;
        }

        int temp=factorial(n-1);
        return temp*n;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(factorial(n));;
    }

}
