package BackTracking;

import java.util.ArrayList;

public class PrintMazeRightLeftDiagonally {

    public static void main(String[] args) {

        System.out.println(printMazeRightLeftDiagonally("",3,3));
    }

    static ArrayList<String> printMazeRightLeftDiagonally(String processed, int r, int c)
    {

        if(r==1 && c==1)
        {
            ArrayList<String> al=new ArrayList<>();
            al.add(processed);
            return al;
        }

        ArrayList<String> al=new ArrayList<>();

        if(r>1 && c>1)
        {
            al.addAll((printMazeRightLeftDiagonally("D"+processed,r-1,c-1)));
        }

        if(r>1)
        {
            al.addAll((printMazeRightLeftDiagonally("V"+processed,r-1,c)));
        }
        if(c>1)
        {
            al.addAll((printMazeRightLeftDiagonally("H"+processed,r,c-1)));
        }
        return al;

    }
}
