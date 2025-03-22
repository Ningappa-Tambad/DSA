package Recursion;

public class TowerOfHanoiProblem {

    static void toh(int n,char A,char B,char C)
    {
        if(n==0)
        {
            return;
        }

        //move n-1th disk from s to h

        toh(n-1,A,C,B);

        //mpve nth disk from S to D

        System.out.println("Move "+n+ " disk from: "+A+" to " +C);

        //move nth disk from H to D

        toh(n-1,B,A,C);
    }

    public static void main(String[] args) {


        toh(3,'A','B','C');
    }
}
