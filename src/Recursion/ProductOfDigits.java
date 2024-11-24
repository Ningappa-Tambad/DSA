package Recursion;

import java.util.Scanner;

public class ProductOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       System.out.println(ProductOfDigits(n));


    }

    static int ProductOfDigits(int n) {

        if(n%10==n)
        {
            return n;
        }

        return n%10+ProductOfDigits(n/10);
    }
}
