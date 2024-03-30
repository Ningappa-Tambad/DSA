package TwoDArray;

import java.util.Scanner;

public class FindkElementIntwoDmatrix {

    static boolean findKElementInTwoDmat(int[][] A, int k) {
        int n = A.length;
        int m = A[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (A[i][j] == k) {
                return true;
            } else if (A[i][j] > k) {
                j--;
            } else if (A[i][j] < k) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = 49;

        boolean ans = findKElementInTwoDmat(mat, k);
        System.out.println(ans);

    }
}
