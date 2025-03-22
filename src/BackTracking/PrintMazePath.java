package BackTracking;

import java.util.ArrayList;

public class PrintMazePath {
    public static void main(String[] args) {
       // printMazePath("",3,3);
        System.out.println(printMazePathRet("",3,3));

    }

    private static void printMazePath(String processed,int r,int c) {

        if(r==1 && c==1)
        {
            System.out.println(processed);
            return;
        }

        if(r>1)
        {
            printMazePath(processed+"D",r-1,c);
        }
        if(c>1)
        {
            printMazePath(processed+"R",r,c-1);
        }

    }

    private static ArrayList<String> printMazePathRet(String processed, int r, int c) {

        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(processed);
            return list;

        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1)
        {
            list.addAll(printMazePathRet(processed+"D",r-1,c));
        }
        if(c>1)
        {
            list.addAll(printMazePathRet(processed+"R",r,c-1));
        }

        return list;

    }
}
