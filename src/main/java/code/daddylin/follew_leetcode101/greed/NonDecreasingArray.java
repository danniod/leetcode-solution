package code.daddylin.follew_leetcode101.greed;

/**
 * No. 665
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int chances = 1;
        for (int i = 0; i < nums.length - 1 && chances >= 0; i++) {
            if (nums[i] - nums[i + 1] > 0) {
                if (i == 0) {
                    nums[i] = nums[i + 1];
                } else if (nums[i - 1] <= nums[i + 1]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i + 1] = nums[i];
                }
                chances--;
            }
        }
        return chances >= 0;
    }

    public static void main(String[] args) {
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{3, 4, 2, 3}));
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{-1, 4, 2, 3}));
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{4, 2, 3}));
        System.out.println(new NonDecreasingArray().checkPossibility(new int[]{4, 2, 1}));
    }
}
