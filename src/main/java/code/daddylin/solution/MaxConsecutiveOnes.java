package code.daddylin.solution;


/**
 * No.485 最大连续1的个数
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 * @date 2020/09/23
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int current = 0;
        for (int num : nums) {
            if (num == 1) {
                current++;
            } else {
                maxConsecutive = Math.max(maxConsecutive, current);
                current = 0;
            }
        }
        return Math.max(maxConsecutive, current);
    }



}
