package code.daddylin.follew_leetcode101.search;

import java.util.Arrays;

public class Sudoku {

    public void solveSudoku(char[][] board) {

        backtracking(board, 0);

    }

    private boolean backtracking(char[][] board, int pos) {

        if (pos == 81 ) {
            return true;
        }

        final int x = pos / 9;
        final int y = pos % 9;

        if (board[x][y] != '.') {
            return backtracking(board, pos + 1);
        }

        boolean solved = false;
        for (char c = '1'; c <= '9' && !solved; c++) {

            if (!exists(board, x, y, c)) {
                board[x][y] = c;
                solved = backtracking(board, pos);
                if (!solved) {
                    board[x][y] = '.';
                }
            }
        }
        return solved;
    }

    private boolean exists(char[][] board, int x, int y, char number) {
        for (int i = 0; i < 9; i++) {
            if (i != y && board[x][i] == number || i != x && board[i][y] == number
                    || i != x && i != y && board[x / 3 * 3 + i / 3][y / 3 * 3 + i % 3] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        final char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        new Sudoku().solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }
}
