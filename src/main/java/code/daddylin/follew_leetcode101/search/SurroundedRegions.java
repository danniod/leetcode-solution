package code.daddylin.follew_leetcode101.search;

import java.util.Arrays;
import java.util.Stack;

public class SurroundedRegions {

    private static int[] DIRECTION = {0, 1, 0, -1, 0};

    class Point{
        int x, y;
        private Point(int x, int y){ this.x = x; this.y = y;}
    }

    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                Stack<Point> points = new Stack<>();
                System.out.printf("board[%s][%s] = %s%n", x, y, board[x][y]);
                dfs(board, x, y, m, n, points);
                System.out.println(Arrays.deepToString(board));
            }
        }
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == '0') {
                    board[x][y] = 'O';
                }
            }
        }
    }


    private boolean dfs(char[][] board, int x, int y, int m, int n, Stack<Point> points) {
        if (x < 0 || y < 0 || x == m || y == n) {
            return false;
        }

        if (board[x][y] == 'X') {
            return true;
        }

        if (board[x][y] == '0') {
            return false;
        }
        System.out.println('>' + Arrays.deepToString(board));
        board[x][y] = 'X';
        System.out.printf("> x = %d, y = %d%n", x, y);
        points.push(new Point(x, y));
        for (int i = 0; i < 4; i++) {
            if (!dfs(board, x + DIRECTION[i], y + DIRECTION[i + 1], m, n, points)) {
                board[x][y] = '0';
                Point pop = points.pop();
                while (pop.x != x || pop.y != y) {
                    board[pop.x][pop.y] = '0';
                    pop = points.pop();
                }
                System.out.printf("< x = %d, y = %d %n", x, y);
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        char[][] board = {
                {'X', 'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'X', 'X'}
        };
        new SurroundedRegions().solve(board);
        System.out.println(Arrays.deepToString(board));

    }
}
