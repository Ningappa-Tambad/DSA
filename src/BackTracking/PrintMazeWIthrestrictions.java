package BackTracking;

public class PrintMazeWIthrestrictions {

    public static void main(String[] args) {

        boolean[][] board=
        {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        printMazeWithRestrictions("",board,0,0);

    }

    static void printMazeWithRestrictions(String p,boolean[][] maze,int r,int c)
    {
        if(r== maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(maze[r][c]==false)
        {
            return;
        }

        maze[r][c]=false;

        if(r< maze.length-1)
        {
            printMazeWithRestrictions(p+"D",maze,r+1,c);
        }

        if(c< maze[0].length-1)
        {
            printMazeWithRestrictions(p+"R",maze,r,c+1);
        }

        if(r>0)
        {
            printMazeWithRestrictions(p+"U",maze,r-1,c);
        }

        if (c>0)
        {
            printMazeWithRestrictions(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }
}
