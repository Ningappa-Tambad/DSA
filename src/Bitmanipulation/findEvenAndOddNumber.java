package Bitmanipulation;

import java.util.Scanner;

public class findEvenAndOddNumber {

    static void findEvenoddnumber(int n)
    {
        if((n&1)==0)
        {
            System.out.println(+n+"Is even number");
        }
        else {
            System.out.println(+n+"Is odd number");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        findEvenoddnumber(n);
    }
}
