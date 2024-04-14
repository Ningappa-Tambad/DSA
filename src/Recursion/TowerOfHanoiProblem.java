package Recursion;

public class TowerOfHanoiProblem {

    static void toh(int n,char s,char d,char h)
    {
        if(n==0)
        {
            return;
        }

        //move n-1th disk from s to h

        toh(n-1,s,h,d);

        //mpve nth disk from S to D

        System.out.println("Move "+n+ " disk from: "+s+" to " +d);

        //move nth disk from H to D

        toh(n-1,h,d,s);
    }

    public static void main(String[] args) {


        toh(3,'s','d','h');
    }
}
