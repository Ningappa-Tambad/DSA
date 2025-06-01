package BackTracking;

public class PlaceNQueens {

    public static void main(String[] args) {

            int n=4;
            int[][] board=new int[n][n];
            placeNQueens(board,n,0);
    }

    static void placeNQueens(int[][] board,int n,int i) {

        if(i==n)
        {
            for(int r=0;r<n;r++)
            {
                for(int c=0;c<n;c++)
                {
                    System.out.print(board[r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int c=0;c<n;c++)
        {
            if(isValidate(board,n,i,c)==true)
            {
                board[i][c]=1;
                placeNQueens(board,n,i+1);
                board[i][c]=0;
            }
        }

    }

    static boolean isValidate(int[][] board,int n,int r,int c)
    {

        //validate upper column
        for(int i=0;i<r;i++)
        {
            if(board[i][c]==1)
            {
                return false;
            }
        }

        //validate left side

        int x=r;
        int y=c;

        while(x>=0 && y>=0)
        {
            if(board[x][y]==1)
            {
                return false;
            }
            x--;
            y--;
        }

        //validate right side

        x=r;
        y=c;

        while(x>=0 && y<n)
        {
            if(board[x][y]==1)
            {
                return false;
            }
            x--;
            y++;
        }

        return true;
    }
}
