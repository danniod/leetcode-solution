package code.daddylin.follew_leetcode101.points;

public class SumOfSquare {

    public boolean judgeSquareSum(int c) {

        int r = (int) Math.sqrt(c);

        int l = 0;


        while (l <= r) {
            int result = c - (int) Math.pow(l, 2) - (int) Math.pow(r, 2);
            if (result == 0) {
                return true;
            } else if (result > 0) {
                l++;
            } else {
                r--;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfSquare().judgeSquareSum(2147483600));
        System.out.println(new SumOfSquare().judgeSquareSum(8));
        System.out.println(new SumOfSquare().judgeSquareSum(9));
        System.out.println(new SumOfSquare().judgeSquareSum(10));
    }
}
