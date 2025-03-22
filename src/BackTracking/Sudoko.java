package BackTracking;

public class Sudoko {

    public static void main(String[] args)
    {

        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 0, 0, 1, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        int i=0;

        solveSudoku(board,i);


}

   static void solveSudoku(int[][] board, int i)
   {

        if(i==81)
        {
            for(i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }

        int r=i/9;
        int c=i%9;

        if(board[r][c]!=0)
        {
            solveSudoku(board,i+1);
        }
        else
        {
            for(int k=1;k<=9;k++)
            {
                if(isValidate(board,r,c,k))
                {
                    board[r][c]=k;
                    solveSudoku(board,i+1);
                    board[r][c]=0;
                }
            }
        }

    }

    static boolean isValidate(int[][] board,int r,int c,int k)
    {
        for(int i=0;i<9;i++)
        {
            if(board[r][i]==k || board[i][c]==k)
            {
                return false;
            }
        }

        int sr=(r/3)*3;
        int sc=(c/3)*3;

        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(board[i][j]==k)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
