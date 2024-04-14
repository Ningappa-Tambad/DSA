package Recursion;

import java.util.Scanner;

public class PrintNumbersfromonetoN {

    static void printNumbersFromOnetoN(int n)

    {
        if(n==0)
        {
            return;
        }

        printNumbersFromOnetoN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       printNumbersFromOnetoN(n);;
    }
}
