package Basic;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double num=sc.nextDouble();

        int value = (int) num;

        if(num%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
