import java.util.*;
 class Solution {
    public static List<List<Integer>> nQueens(int n) {
        int board[][] = new int[n][n];
        List<List<Integer>> ans = new ArrayList<>();
        int leftRow[] = new int[n];
        int upperDaigonal[] = new int[2 * n - 1];
        int lowerDaigonal[] = new int[2 * n - 1];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
        solve(0, board, ans, leftRow, upperDaigonal, lowerDaigonal);
        return ans;
    }

    public static void solve(int col, int[][] board, List<List<Integer>> ans, int[] leftRow, int[] upperDaigonal,
                             int[] lowerDaigonal) {
        // base condition
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && upperDaigonal[row + col] == 0
                    && lowerDaigonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 1;
                leftRow[row] = 1;
                upperDaigonal[row + col] = 1;
                lowerDaigonal[board.length - 1 + col - row] = 1;
                solve(col + 1, board, ans, leftRow, upperDaigonal, lowerDaigonal);

                // while backtracking
                board[row][col] = 0;
                leftRow[row] = 0;
                upperDaigonal[row + col] = 0;
                lowerDaigonal[board.length - 1 + col - row] = 0;
            }
        }

    }

    public static List<Integer> construct(int[][] board) {
        List<Integer> res = new ArrayList<>();
        for (int[] row : board) {
            for (int element : row) {
                res.add(element);
            }
        }
        return res;
    }
    public static void main(String[] args){
        List<List<Integer>> ans=nQueens(4);
        for(List<Integer> data:ans){
            for(int info:data){
                System.out.print(info+ ",");
            }
        }
    }
}